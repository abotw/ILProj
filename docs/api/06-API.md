# API

* [Restful API设计最佳实践](http://kaelzhang81.github.io/2019/05/24/Restful-API%E8%AE%BE%E8%AE%A1%E6%9C%80%E4%BD%B3%E5%AE%9E%E8%B7%B5/)
* [Apifox帮助文档](https://apifox.com/help/)
* [21分钟学会Apifox](https://www.bilibili.com/video/BV1ae4y1y7bf/)

## 用户登录 230417 - 230424

### 1. 注册账号
* 地址：`/api/register`
* 方法：`POST`
* 是否验证 JWT：否
* 参数
    * `username` 用户名
    * `password` 密码
    * `password_confirm` 确认密码
    * `email`邮箱
* 返回结果
    * `res: success`
    * `res: 用户名和密码不能为空`
    * `res: 两次输入的密码不一致`
    * `res: 用户名已存在`
    

### 2. 登录 / 获取 JSON Web Token
* 地址：`/api/token`
* 方法：`POST`
* 是否验证 JWT：否
* 参数
    * `username` 用户名
    * `password` 密码
* 返回结果
    * ~~`access` 访问令牌，有效期 5 分钟~~
    * ~~`refresh` 刷新令牌，有效期 14 天~~
    * `token` 访问令牌        

### ~~3. 刷新 JSON Web Token~~
* ~~地址：`/api/token/refresh`~~
* ~~方法：`POST`~~
* ~~是否验证 JWT：否~~
* ~~参数~~
    * ~~`refresh` 刷新令牌~~
* ~~返回结果~~
    * ~~`access` 访问令牌，有效期 5 分钟~~

