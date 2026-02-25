📚 GetorX – Projeto Acadêmico

API REST desenvolvida utilizando Java e Spring Boot, com foco na aplicação prática de conceitos de arquitetura em camadas, organização de código e boas práticas no desenvolvimento backend.

🚧 Projeto em desenvolvimento para fins acadêmicos.

🎯 Objetivo

O projeto tem como finalidade aplicar, na prática, os seguintes conceitos estudados em sala de aula:

Desenvolvimento de APIs REST

Arquitetura em camadas

Separação de responsabilidades

Uso de DTO (Data Transfer Object)

Tratamento global de exceções

Persistência de dados com JPA/Hibernate

🏗️ Arquitetura do Sistema

A aplicação foi estruturada seguindo o padrão de arquitetura em camadas:

Controller → Service → Repository → Model
                     ↓
                    DTO
                     ↓
                Exception
📌 Descrição das Camadas

Controller: Responsável por receber e responder requisições HTTP.

Service: Contém as regras de negócio da aplicação.

Repository: Realiza a comunicação com o banco de dados.

Model: Representa as entidades do sistema.

DTO: Utilizado para transferência de dados entre camadas.

Exception: Responsável pelo tratamento global de erros.

Essa organização permite melhor manutenção, legibilidade e escalabilidade do sistema.

🛠️ Tecnologias Utilizadas

Java

Spring Boot

Spring Data JPA

Hibernate

Maven

🔄 Funcionalidades Implementadas

Estrutura base da API

Cadastro de usuários

Cadastro de produtos

Cadastro de fornecedores

Implementação de exceção personalizada para recurso não encontrado

Novas funcionalidades estão em fase de implementação.

▶️ Execução do Projeto

Clonar o repositório:

git clone https://github.com/Edigleis2022/getorx.git

Acessar o diretório:

cd getorx

Executar a aplicação:

mvn spring-boot:run

Requisitos:

Java instalado

Maven configurado no sistema

📌 Status do Projeto

Em desenvolvimento — projeto acadêmico com evolução contínua conforme aplicação dos conteúdos estudados.

👨‍🎓 Autores

Edigleis Pereira dos Santos

Bruno Severo de Oliveira

Maria Eduarda Bronzatti Mesquita
