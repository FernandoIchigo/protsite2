
CREATE TABLE Destinos (
ID_Destino varchar(20) PRIMARY KEY,
Promoção varchar(20),
Quantidade varchar(20),
Nome_Destino varchar(20)
)

CREATE TABLE Clientes_Fisico_Juridico (
ID_Juridica varchar(20),
CNPJ varchar(20),
ID_Fisica varchar(20),
CPF varchar(11),
ID_Cliente varchar(20),
Telefone varchar(20),
Nome varchar(100),
Endereço varchar(100),
PRIMARY KEY(ID_Juridica,ID_Fisica,ID_Cliente)
)

CREATE TABLE Compras (
ID_Cliente varchar(20),
ID_Destino varchar(20),
FOREIGN KEY(ID_Cliente) REFERENCES Cliente_Fisico_Juridico (ID_Juridica,ID_Fisica,ID_Cliente),
FOREIGN KEY(ID_Destino) REFERENCES Destino (ID_Destino)
)

