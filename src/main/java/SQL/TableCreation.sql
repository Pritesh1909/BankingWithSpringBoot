create table user_credentials
(
    user_name varchar(30) not null,
    password  varchar(30) not null,
    constraint user_credentials_pk
        primary key (user_name)
);

create unique index user_credentials_user_name_uindex
    on user_credentials (user_name);

//account details
create table account_details
(
    account_number    int(14) auto_increment,
    name              varchar(40)   not null,
    address           varchar(40)   not null,
    mobile_number     varchar(10)   null,
    available_balance int default 0 not null,
    constraint account_details_pk
        primary key (account_number)
);

create unique index account_details_account_number_uindex
    on account_details (account_number);