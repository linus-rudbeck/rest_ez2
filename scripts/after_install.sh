#!/bin/bash
cd /home/ec2-user/app
java -jar *.jar > spring_log &
echo "Started application"
