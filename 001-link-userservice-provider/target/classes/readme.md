1. 创建maven工程
2. 模拟一个实体Bean的查询过程
3. 提供一个service服务接口
4. 配置dubbo服务提供者核心配置
   1. 声明服务提供者的名称
   2. 声明服务提供者所使用的的协议和端口号
   3. 暴露服务，使用直连方式,dubbo:service的registry设置为N/A
5. web.xml配置ContextLoaderListener