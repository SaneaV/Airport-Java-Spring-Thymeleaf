create table passenger (
passenger_code bigint generated by default as identity,
name varchar(255),
phone varchar(255),
surname varchar(255),

primary key (passenger_code)
)