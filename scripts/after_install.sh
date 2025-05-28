#!/bin/bash
cd /home/ec2-user/app
java -jar *.jar > /dev/null  2> /dev/null < /dev/null &
echo "Started application"
