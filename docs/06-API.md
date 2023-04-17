# API

## 230417 - 230424

### 1. 注册账号
* 地址：`/api/register`
* 方法：`POST`
* 是否验证 JWT：否
* 参数
    * `username` 用户名
    * `password` 密码
    * `password_confirm` 确认密码
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
    * `access` 访问令牌，有效期 5 分钟
    * `refresh` 刷新令牌，有效期 14 天

### 3. 刷新 JSON Web Token
* 地址：`/api/token/refresh`
* 方法：`POST`
* 是否验证 JWT：否
* 参数
    * `refresh` 刷新令牌
* 返回结果
    * `access` 访问令牌，有效期 5 分钟