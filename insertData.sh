#!/bin/sh

mysql -h 127.0.0.1 -u root -ptest123 -e "SHOW TABLES IN definitions;"

mysql -h 127.0.0.1 -u root -ptest123 definitions <dummyData.sql


