# springCloud示例

#### 介绍

蛮久以前写的，写得一般，传上来给一个做前端的朋友捣鼓着玩的（手上很多都是公司的业务代码，没办法），不建议路过的朋友拿去用。

使用到的技术包括：

- SpringMVC

- SpringBoot

- JWT实现无状态token

- gateway网关

- Mybatis框架

- MybatisPlus增强

- Redis做验证码缓存

- Springcloud

- Nacos 服务注册中心 实现负载均衡

可选：

- 利用gateway网关做参数加解密

- jwt荷载加解密


#### 环境

### 1.mysql

### 2.docker

nacos 使用docker做容器化部署

搭建集群 并配合keepalived做高可用 自带ribbon做负载均衡

redis 使用docker做容器化部署 配合keepalived做高可用

#### 使用说明

### 1.接口权限声明注解

首先在配置类中注册拦截器ProjectInterceptor

```
    protected void addInterceptors(InterceptorRegistry registry) {
        //这里可以根据自己的具体需求来
        registry.addInterceptor(projectInterceptor).addPathPatterns("/**");
    }
```
随后便可在接口上方使用该注解@ShiroCheck(roles = "")

```
    @GetMapping("/{id}")
    @ShiroCheck(roles = "test")
    public User queryById(@PathVariable("id") Long id) {
        return userService.queryById(id);
    }
```

#### 参与贡献

1.  Fork 本仓库
2.  新建 Feat_xxx 分支
3.  提交代码
4.  新建 Pull Request
