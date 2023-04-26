### 数据库名称
* `ILLearnAssessDB`
* 备用：`ILSkillTestDB`, `QuizDB`, `ILPracticeDB`, `ILPlatformDB`

### 初始 SQL 脚本
创建数据库 `ILLearnAssessDB`，并创建名为 `user` 的用户表，向用户表中插入了一条 root 用户的用户信息。
```mysql
CREATE DATABASE ILLearnAssessDB;
USE ILLearnAssessDB;

CREATE TABLE user (
  id INT NOT NULL AUTO_INCREMENT,
  username VARCHAR(50) NOT NULL,
  password VARCHAR(50) NOT NULL,
  email VARCHAR(100) NOT NULL,
  PRIMARY KEY (id)
);

INSERT INTO user VALUES(0, 'root', 'root', 'root@root.com');
```