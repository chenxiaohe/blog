-- -----------------------------------------------------------------------------
-- 个人博客数据库结构
-- 2020年3月3日
-- -----------------------------------------------------------------------------

-- -----------------------------------------------------------------------------
-- Create database blog
-- -----------------------------------------------------------------------------
-- set character_set_client=utf8,character_set_connection=utf8,character_set_results=utf8;
CREATE DATABASE IF NOT EXISTS blog DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
USE blog;


-- -----------------------------------------------------------------------------
-- 1.1、文章表
-- -----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS article (
  id                 BIGINT NOT NULL AUTO_INCREMENT COMMENT '条目id',
  tag                VARCHAR(128) NOT NULL DEFAULT '' COMMENT '标签',
  title              VARCHAR(255) NOT NULL COMMENT '标题',
  content            TEXT NULL COMMENT '文章内容',
  type               TINYINT(4) NOT NULL DEFAULT 1 COMMENT '1-技术分析，2-关于生活，3-关于生活',
  status             TINYINT NOT NULL COMMENT '是否启用，true－启用，false－停用，默认为启用',
  create_date BIGINT NOT NULL COMMENT '创建时间',
  update_date BIGINT NOT NULL COMMENT '更新时间',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE utf8mb4_unicode_ci COMMENT '文章表';


-- -----------------------------------------------------------------------------
-- 1.2、评论表
-- -----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS comment (
  id                 BIGINT NOT NULL AUTO_INCREMENT COMMENT '条目id',
  parent_id          BIGINT NOT NULL DEFAULT 0 COMMENT '回复',
  article_id         BIGINT NOT NULL COMMENT '评论所归属',
  username           VARCHAR(128) NOT NULL COMMENT '用户名',
  email              VARCHAR(128) NOT NULL COMMENT 'email',
  location           VARCHAR(128) NOT NULL COMMENT 'ip归属地',
  comment            VARCHAR(255) NOT NULL COMMENT '评论内容',
  status             TINYINT NOT NULL COMMENT '是否启用，true－启用，false－停用，默认为启用',
  create_date BIGINT NOT NULL COMMENT '创建时间',
  update_date BIGINT NOT NULL COMMENT '更新时间',
  PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE utf8mb4_unicode_ci COMMENT '评论表';







