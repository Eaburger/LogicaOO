--criar schema

CREATE SCHEMA `zoo` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_mysql500_ci ;



-- Script pra criar tabela 

CREATE TABLE `zoo`.`animal` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `especie` VARCHAR(20) NOT NULL,
  `idade` INT NULL,
  `estavivo` TINYINT NULL,
  PRIMARY KEY (`codigo`));
  
  -- Definiçoes de comando
  
DDL DATA DEFINTION LANGUAGE -  Linguagem de definiçao de Dados
CREATE TABLE
ALTER TABLE
DROP TABLE

DML - Data Manipulation Language  - Linguagem de Manipulaçao de dados 
CREATE  -----  INSERT   ------ INSERIR
READ  -------  SELECT	------ CONSULTAR	
UPDATE ------  UPDATE	------ ALTERAR
DELETE -- ---- DELETE   ------ EXCLUIR


--Inserindo registros 

use zoo;

INSERT INTO animal(especie,idade,estavivo) 
			values("lhama",5,1);


--Consultando os registros da tabela 

			
Select especie,idade,estavivo from animal;

-- buscar todas a s colunas da tabela

Select * from animal; 

-- adicionando uma coluna
alter table animal add column nome varchar(100);

-- alterando valor da coluna
update animal
set nome ='toto'
where codigo = 2
