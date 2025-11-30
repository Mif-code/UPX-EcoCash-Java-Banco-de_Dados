drop database Banco_Upx;
Create database Banco_Upx;
use Banco_Upx;

create table EMPRESA(
	id_empresa int auto_increment primary key,
	nome_empresa varchar(250) not null,
	cnpj varchar(14) not null,
	ativo_empresa boolean default true
);

create table VOUCHERS(
	id_voucher int auto_increment primary key,
	id_empresa int not null,
	pontos int default 0,
	descricao varchar(255) not null,

foreign key(id_empresa) references EMPRESA(id_empresa)
on update cascade
);

create table USUARIO(
	id_usuario int auto_increment primary key,
    nome_usuario varchar(100) not null,
    sobrenome_usuario varchar(150) not null,
    email varchar(250) unique,
    telefone int,
    saldo float default 0.0
    );
        
create table MATERIAL(
	id_material int auto_increment primary key,
    nome_material varchar(100) not null,
    ativo_material boolean default true,
    pontos_material int default 0
    );
    

-- tabelas referencia --

create table TROCAS(
	id_trocas int auto_increment primary key,
    id_usuario int not null,
    id_voucher int not null,
    dt_troca timestamp default current_timestamp,
    
    foreign key (id_usuario) references USUARIO(id_usuario),
    foreign key(id_voucher) references VOUCHERS(id_voucher)
    on update cascade
    );
    
    
create table COLETA(
	id_coleta int auto_increment primary key,
	id_usuario int not null,
	id_material int not null,
	quantidade_coleta int default 0,
	data_coleta timestamp default current_timestamp
);

create table PONTOS(
	id_pontos int auto_increment primary key,
    id_usuario int not null,
    tipo_pontos varchar(100) not null,
    valor_pontos int default 0,
    movimentacao_pontos timestamp default current_timestamp,
    
    foreign key (id_usuario) references USUARIO(id_usuario)
    on update cascade
    );

