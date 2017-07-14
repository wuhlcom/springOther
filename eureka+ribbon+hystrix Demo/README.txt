建议在命令行运行mvn clean install 命令，在maven依赖下载完毕之后再将4个工程导入到IDE中，不然导入ide会自动下载依赖，而这个会非常缓慢，下载之后依次运行eureka service consumer的主程序，其中修改service bootstrap.yml的端口然后运行可以模拟多台服务注册的情况。


点击链接加入群【Sprin?Cloud?交流群】：https://jq.qq.com/?_wv=1027&k=460AGSI  群号：383016221 欢迎加入
