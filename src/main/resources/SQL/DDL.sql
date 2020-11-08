create schema sob_blog_system collate utf8mb4_general_ci;

create table tb_categories
(
    id          varchar(20)  not null comment 'ID'
        primary key,
    name        varchar(64)  not null comment '分类名称',
    pinyin      varchar(128) not null comment '拼音',
    description text         not null comment '描述',
    `order`     int          not null comment '顺序',
    status      varchar(1)   not null comment '状态：0表示不使用，1表示正常',
    createTime  datetime     not null comment '创建时间',
    updateTime  datetime     not null comment '更新时间'
);

create table tb_daily_view_count
(
    id         varchar(20)   not null comment 'ID'
        primary key,
    viewCount  int default 0 not null comment '每天浏览量',
    createTime datetime      not null comment '创建时间',
    updateTime datetime      not null comment '更新时间'
);

create table tb_friends
(
    id         varchar(20)   not null comment 'ID'
        primary key,
    name       varchar(64)   not null comment '友情链接名称',
    logo       varchar(1024) not null comment '友情链接logo',
    url        varchar(1024) not null comment '友情链接',
    `order`    int default 0 not null comment '顺序',
    state      varchar(1)    not null comment '友情链接状态:0表示不可用，1表示正常',
    createTime datetime      not null comment '创建时间',
    updateTime datetime      not null comment '更新时间'
);

create table tb_labels
(
    id         varchar(20)   not null comment 'ID'
        primary key,
    name       varchar(32)   not null comment '标签名称',
    count      int default 0 not null comment '数量',
    createTime datetime      not null comment '创建时间',
    updateTime datetime      not null comment '更新时间'
);

create table tb_looper
(
    id         varchar(20)   not null comment 'ID'
        primary key,
    title      varchar(128)  not null comment '轮播图标题',
    `order`    int default 0 not null comment '顺序',
    state      varchar(1)    not null comment '状态：0表示不可用，1表示正常',
    targetUrl  varchar(1024) null comment '目标URL',
    imageUrl   varchar(2014) not null comment '图片地址',
    createTime datetime      not null comment '创建时间',
    updateTime datetime      not null comment '更新时间'
);

create table tb_settings
(
    id         varchar(20)  not null comment 'ID'
        primary key,
    `key`      varchar(32)  not null comment '键',
    value      varchar(512) not null comment '值',
    createTime datetime     not null comment '创建时间',
    updateTime datetime     not null comment '更新时间'
);

create table tb_user
(
    id         varchar(20)   not null comment 'ID'
        primary key,
    userName   varchar(32)   not null comment '用户名',
    password   varchar(32)   not null comment '密码',
    roles      varchar(100)  not null comment '角色',
    avatar     varchar(1024) not null comment '头像地址',
    email      varchar(100)  null comment '邮箱地址',
    sign       varchar(100)  null comment '签名',
    state      varchar(1)    not null comment '状态：0表示删除，1表示正常',
    regIp      varchar(32)   not null comment '注册ip',
    loginIp    varchar(32)   not null comment '登录Ip',
    createTime datetime      not null comment '创建时间',
    updateTime datetime      not null comment '更新时间'
);

create table tb_article
(
    id         varchar(20)   not null comment 'ID'
        primary key,
    title      varchar(256)  not null comment '标题',
    userId     varchar(20)   not null comment '用户ID',
    userAvatar varchar(1024) null comment '用户头像',
    userName   varchar(32)   null comment '用户昵称',
    categoryId varchar(20)   not null comment '分类ID',
    content    mediumtext    not null comment '文章内容',
    type       varchar(1)    not null comment '类型（0表示富文本，1表示markdown）',
    state      varchar(1)    not null comment '状态（0表示已发布，1表示草稿，2表示删除）',
    summary    text          not null comment '摘要',
    labels     varchar(128)  not null comment '标签',
    viewCount  int default 0 not null comment '阅读数量',
    createTime datetime      not null comment '发布时间',
    updateTime datetime      not null comment '更新时间',
    constraint fk_category_article_on_category_id
        foreign key (categoryId) references tb_categories (id),
    constraint fk_user_article_on_user_id
        foreign key (userId) references tb_user (id)
);

create table tb_comment
(
    id            varchar(20)   not null comment 'ID'
        primary key,
    parentContent text          null comment '父内容',
    articleId     varchar(20)   not null comment '文章ID',
    content       text          not null comment '评论内容',
    userId        varchar(20)   not null comment '评论用户的ID',
    userAvatar    varchar(1024) null comment '评论用户的头像',
    userName      varchar(32)   null comment '评论用户的名称',
    state         varchar(1)    not null comment '状态（0表示删除，1表示正常）',
    createTime    datetime      not null comment '创建时间',
    updateTime    datetime      not null comment '更新时间',
    constraint fk_article_comment_on_article_id
        foreign key (articleId) references tb_article (id),
    constraint fk_user_comment_on_user_id
        foreign key (userId) references tb_user (id)
);

create table tb_images
(
    id         varchar(20)   not null comment 'ID'
        primary key,
    userId     varchar(20)   not null comment '用户ID',
    url        varchar(1024) not null comment '路径',
    state      varchar(1)    not null comment '状态（0表示删除，1表正常）',
    createTime datetime      not null comment '创建时间',
    updateTime datetime      not null comment '更新时间',
    constraint fk_user_images_on_user_id
        foreign key (userId) references tb_user (id)
);

