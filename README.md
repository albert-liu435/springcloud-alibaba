# springcloud-alibaba
SpringCloudAlibaba笔记代码

3、nacos启动流程
切换目录
cd nacos/bin

startup.cmd -m standalone



4.4.3安裝Sentinel控制台
#jdk8
java -Dserver.port=8080 -Dcsp.sentinel.dashboard.server=localhost:8080 -Dproject.name=sentinel-dashboard -jar sentinel-dashboard-1.8.3.jar 
#jdk9以上执行下面这个
java --add-opens java.base/java.lang=ALL-UNNAMED -Dserver.port=8080 -Dcsp.sentinel.dashboard.server=localhost:8080 -Dproject.name=sentinel-dashboard -jar sentinel-dashboard-1.8.3.jar 
