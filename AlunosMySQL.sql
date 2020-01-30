create database Alunos;
use Alunos;
show tables;

desc tbl_alunos;
desc tbl_curso;


insert into tbl_alunos (nome, email, telefone) values ('Débora','debora@gmail.com','11-0000-000');
insert into tbl_alunos (nome, email, telefone) values ('Elisa','elisa@gmail.com','11-1111-1111');
insert into tbl_alunos (nome, email, telefone) values ('Joana','elisa@gmail.com','11-2222-2222');

insert into tbl_curso (nomeCurso, detalhes, horasCurso, ementa)
		values ('Arquitetura e Urbanismo','knasiodnabhdua',3600,'Introdução a Arquitetura');
insert into tbl_curso (nomeCurso, detalhes, horasCurso, ementa)
		values ('Arquitetura e Urbanismo','knasiodnabhdua',3600,'Introdução a Arquitetura');
insert into tbl_curso (nomeCurso, detalhes, horasCurso, ementa)
		values ('Arquitetura e Urbanismo','knasiodnabhdua',3600,'Introdução a Arquitetura');

