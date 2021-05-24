create table route (
code_route bigint generated by default as identity,
class varchar(255),
destination varchar(255),
price integer check (price>=1 AND price<=9999999),
passenger_code bigint not null,

primary key (code_route)
)
