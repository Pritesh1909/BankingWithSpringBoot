create table user_credentials
(
    user_name varchar(30) not null,
    password  varchar(30) not null,
    constraint user_credentials_pk
        primary key (user_name)
);

create unique index user_credentials_user_name_uindex
    on user_credentials (user_name);