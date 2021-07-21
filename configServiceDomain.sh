#!/bin/bash
set -m
java -jar ./config-service.jar &
sleep 30

status="KO"
while [ $status != "OK" ]
do
  if [ $(curl -sL -w "%{http_code}\\n" "http://localhost:$SERVICE_PORT/actuator/health" -o /dev/null --connect-timeout 3 --max-time 5) == "200"  ]
  then
    curl -s -X PUT "http://localhost:$SERVICE_PORT/domain/" -H 'Content-Type: application/json' --data-raw "{\"domainName\": \"$DEFAULT_DOMAIN\", \"postmasterAddress\": {\"emailAddress\": \"$DEFAULT_POSTMASTER\"}}" -o /dev/null
    status="OK"
    echo "Default domain $DEFAULT_DOMAIN was added"
  else
    echo "Waiting for the Config-Service API..."
    sleep 10
  fi
done

fg %1
