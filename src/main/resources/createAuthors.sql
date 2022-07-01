create table AUTHOR (id integer not null, name varchar(255), country_id integer, primary key (id));
create table COUNTRY (id integer not null, name varchar(255), primary key (id));
create table POST (id integer not null, name varchar(255), author_id integer, primary key (id));
alter table AUTHOR add constraint FKidvk4ns30koxd3w8k1v6gxlje foreign key (country_id) references COUNTRY;
alter table POST add constraint FK7d8xtm26wx2kgacfavd46v8rq foreign key (author_id) references AUTHOR;

