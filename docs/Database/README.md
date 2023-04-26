### 数据库名称
* `ILDB`
* 备用：`ILSkillTestDB`, `QuizDB`, `ILPracticeDB`, `ILPlatformDB`

### 初始 SQL 脚本
创建数据库 `ILDB`，并创建名为 `user` 的用户表，向用户表中插入了一条 root 用户的用户信息。
```mysql
CREATE DATABASE ILDB;
USE ILDB;

CREATE TABLE user (
  id INT NOT NULL AUTO_INCREMENT,
  username VARCHAR(50) NOT NULL,
  password VARCHAR(50) NOT NULL,
  email VARCHAR(100) NOT NULL,
  deleted INT DEFAULT 0,
  PRIMARY KEY (id)
);

INSERT INTO user VALUES(0, 'root', 'root', 'root@root.com',0);
```

添加逻辑删除标记 '**deleted**'  0表示未删除，1表示已删除 
