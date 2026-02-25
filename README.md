🚀 GetorX API

API REST desenvolvida com Spring Boot para gerenciamento de usuários, produtos e fornecedores.

🚧 Projeto em desenvolvimento — novas funcionalidades estão sendo implementadas.

📌 Objetivo

O projeto foi criado com o objetivo de praticar e consolidar conhecimentos em:

Arquitetura em camadas

Desenvolvimento de APIs REST

Separação de responsabilidades

Uso de DTO (Data Transfer Object)

Tratamento global de exceções

Organização de projetos Java com Spring Boot

🏗️ Arquitetura

O projeto segue o padrão de arquitetura em camadas:

controller → service → repository → model
                   ↓
                  dto
                   ↓
               exception
📂 Estrutura de Pacotes

controller → Responsável pelos endpoints da API

service → Contém as regras de negócio

repository → Comunicação com o banco de dados

model → Entidades do sistema

dto → Objetos de transferência de dados

exception → Tratamento global de erros

🛠️ Tecnologias Utilizadas

Java

Spring Boot

Maven

Spring Data JPA

Hibernate

🔌 Funcionalidades Atuais

Cadastro de usuários

Cadastro de produtos

Cadastro de fornecedores

Tratamento de exceções personalizadas

Algumas funcionalidades ainda estão em fase de implementação.

▶️ Como Executar o Projeto

1️⃣ Clonar o repositório

git clone https://github.com/Edigleis2022/getorx.git

2️⃣ Acessar a pasta do projeto

cd getorx

3️⃣ Executar a aplicação

mvn spring-boot:run

Certifique-se de ter:

Java instalado

Maven configurado no PATH

📌 Status do Projeto

🚧 Em desenvolvimento
Estrutura principal definida e funcionalidades sendo incrementadas.

👨‍💻 Autores

Edigleis Pereira dos Santos

Bruno Severo de Oliveira

Maria Eduarda Bronzatti Mesquita
