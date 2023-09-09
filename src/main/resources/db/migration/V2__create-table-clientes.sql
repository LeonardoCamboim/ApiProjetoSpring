create table cliente (
    id bigint not null auto_increment,
    cpf varchar(255),
    email varchar(255),
    nome varchar(255),
    telefone varchar(255),
    endereco_id bigint,
    logradouro varchar(100) not null,
    bairro varchar(100) not null,
    cep varchar(9) not null,
    complemento varchar(100),
    numero varchar(20),
    uf char(2) not null,
    cidade varchar(100) not null,
    primary key (id)
);
