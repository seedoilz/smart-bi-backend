#!/bin/bash

project_pid=`ps aux | grep "smart_bi-0.0.1-SNAPSHOT.jar" | grep -v grep | awk 'END{print $2}'`
if [  $project_pid > 0 ];then
      echo "项目已经启动，开始关闭项目，项目pid为: $project_pid "
      echo "--------------------"
      kill -9 `ps aux | grep "smart_bi-0.0.1-SNAPSHOT.jar" | grep -v grep | awk 'END{print $2}'`
      echo '项目关闭成功，开始重启项目 '
      echo "--------------------"
else
      echo "项目未启动，直接启动"
      echo "--------------------"
fi


source /etc/profile
echo "切换路径：/var/lib/jenkins/workspace/smart_bi_backend/"
cd /var/lib/jenkins/workspace/smart_bi_backend/
echo "--------------------"
echo "正在启动项目"
JENKINS_NODE_COOKIE=dontKillMe nohup java -jar target/smart_bi-0.0.1-SNAPSHOT.jar>publish.log &
sleep 10s
echo "--------------------"

check_pid=`ps aux | grep "smart_bi-0.0.1-SNAPSHOT.jar" | grep -v grep | awk 'END{print $2}'`
if [ $check_pid  > 0 ];then
      echo "项目启动成功： pid = : $check_pid  "
else
      echo "项目启动失败"
      exit 1
fi