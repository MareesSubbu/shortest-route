#!/bin/sh
echo "cloning code from git repo"
cd /home/vagrant
git clone https://github.com/MareesSubbu/shortest-route.git
sleep 30s
echo "cloned"
cd /home/MareesSubbu/shortest-route/shortestpath
echo "compiling code with maven"
mvn clean install
cd /home/MareesSubbu/shortest-route/shortestpath/target/
echo "starting application"
nohup java -jar shortestpath-1.0.0.SNAPSHOT.jar &
sleep 30s
echo "started Application"
cd /home/MareesSubbu/shortest-route/ShortestPathUI
sudo npm install
sleep 30s
echo "starting ui"
node app.js &
sleep 30s
echo "ui started"
