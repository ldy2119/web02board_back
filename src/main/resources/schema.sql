use web02board;

drop table if exists post;
drop table if exists user;


create table user(
  id bigint primary key auto_increment,
  account varchar(100) not null unique,
  password varchar(100),
  username varchar(30),
  email varchar(50) not null unique,
  created datetime default current_timestamp,
  updated datetime default current_timestamp on update current_timestamp
) engine=InnodB default charset=utf8mb4;

create table post(
  id bigint primary key auto_increment,
  user_id bigint,
  title varchar(255),
  content text,
  created datetime default current_timestamp,
  updated datetime default current_timestamp on update current_timestamp
) engine=InnodB default charset=utf8mb4;

select * from post;

insert into user(account, password, username, email) values
  ("user2", "1234", "test2", "user2@dgsw.hs.kr"),
  ("user3", "1234", "test3", "user3@dgsw.hs.kr"),
  ("user4", "1234", "test4", "user4@dgsw.hs.kr"),
  ("user5", "1234", "test5", "user5@dgsw.hs.kr"),
  ("user6", "1234", "test6", "user6@dgsw.hs.kr");

insert into post(user_id, title, content) values
  (2, "AAA", "BBB");