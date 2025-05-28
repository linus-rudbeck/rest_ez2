#!/bin/bash
rm -rf /home/ec2-user/app
pkill -f 'java -jar'
mkdir -p /home/ec2-user/app
echo "before_install completed"
