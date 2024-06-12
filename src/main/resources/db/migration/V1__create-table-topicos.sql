create table topicos(

     id bigint not null auto_increment,
     titulo varchar(300) not null,
     mensagem varchar(300) not null,
     data datetime not null,
     autor varchar(100) not null,
     curso varchar(100) not null,
     respondido tinyint not null,

     primary key(id)

);