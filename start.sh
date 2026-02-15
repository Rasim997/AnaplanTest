#!/bin/sh
echo "Cleaning Starting Docker Container"
sudo docker system prune -f
sudo docker-compose up --force-recreate --build 
exit 0
