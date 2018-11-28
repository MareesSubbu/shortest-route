#!/usr/bin/env bash
# Packages
BUILD_ESSENTIAL="build-essential"
  apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv EA312927
  apt-get update
  apt-get install -y mysql-server-5.5.0



