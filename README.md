# 📸 Instagram Clone - Backend API

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-black?style=for-the-badge&logo=JSON%20web%20tokens)
![H2](https://img.shields.io/badge/H2-Database-blue?style=for-the-badge)

> **Status do Projeto:** Em Desenvolvimento (Sprint 1 Concluída)

Esta é a API RESTful do Instagram Clone, desenvolvida como parte do projeto acadêmico na **FIAP**. O sistema foi construído focando em escalabilidade, segurança e separação de responsabilidades (Decoupled Architecture).

---

## 🏗️ Arquitetura do Projeto

O projeto é focado estritamente no **Backend**. Ele serve como o "motor" que processa dados e gerencia a segurança, pronto para ser consumido por uma aplicação Frontend (React/Mobile).

### Principais Funcionalidades (Sprints Concluídas):
* **Segurança Robusta:** Implementação de Spring Security.
* **Autenticação Stateless:** Uso de Tokens JWT (JSON Web Tokens) com tempo de expiração e criptografia HMAC-256.
* **Gestão de Usuários:** Persistência de dados com Spring Data JPA e banco de dados H2.
* **Arquitetura Limpa:** Separação entre Controllers, Services, Repositories e DTOs.

---

## 🛠️ Tecnologias Utilizadas

* **Java 21:** Versão mais estável e moderna da linguagem.
* **Spring Boot 3.x:** Framework base para produtividade.
* **Spring Security:** Proteção das rotas e controle de acesso.
* **Auth0 JWT:** Biblioteca para geração e validação de tokens seguros.
* **Maven:** Gestão de dependências e build.

---

## 📊 Diagrama de Dados (DER)

Este projeto foi baseado no levantamento de requisitos e modelagem de dados inicial:

>[<img width="1041" height="737" alt="cloneInsta" src="https://github.com/user-attachments/assets/613eaf64-14a6-487e-bd9a-2902dd9b25ae" />](https://1drv.ms/i/c/d67d9bb2d03a22ad/IQCdSsGY0CrSQqo96RUSJyc7Afy1O7V0YE3DqdR1c16CeQ0?e=4MbYll)


---

## 🚀 Como Executar a API

### 1. Pré-requisitos
* JDK 21 instalado.
* Maven instalado (ou use o Maven Wrapper `./mvnw`).

### 2. Clonar e Rodar
```bash
# Clone este repositório
$ git clone [https://github.com/seu-usuario/instagram-clone-java.git](https://github.com/seu-usuario/instagram-clone-java.git)

# Acesse a pasta do projeto no terminal/cmd
$ cd instagram-clone-java

# Instale as dependências e compile o projeto
$ mvn clean install

# Execute a aplicação
$ mvn spring-boot:run


```

## 🤝 Guia de Contribuição

1. Faça um **Fork** do repositório.
2. Crie uma **Branch** para sua funcionalidade: `git checkout -b feature/NovaFuncionalidade`.
3. Desenvolva suas alterações seguindo o padrão de código do projeto.
4. Certifique-se de que o projeto compila corretamente: `mvn clean install`.
5. Realize o **Commit** seguindo o padrão *Conventional Commits*: `git commit -m 'feat: Descrição curta da funcionalidade'`.
6. Envie para o seu repositório: `git push origin feature/NovaFuncionalidade`.
7. Abra um **Pull Request** detalhando as mudanças realizadas.

---

## 💡 Ideias de Contribuição (Roadmap)

Se você quer ajudar a evoluir este motor, aqui estão algumas ideias de funcionalidades para as próximas Sprints:

* **Sistema de Interações:** Implementar endpoints para "Curtidas" e "Comentários" em postagens.
* **Upload de Mídia:** Integrar com serviços de nuvem (como AWS S3 ou Azure Blob Storage) para armazenamento real de fotos de perfil e posts.
* **Busca Avançada:** Criar filtros de busca de usuários por username ou nome completo.
* **Paginação:** Implementar paginação (Pageable) no feed principal para otimizar a performance.
* **Documentação Dinâmica:** Implementação do Swagger/OpenAPI para visualização interativa dos endpoints.

---

## 👨‍💻 Desenvolvedor

**Guilherme de Araújo Moreira**

* 🎓 Estudante de Engenharia de Software na **FIAP** (2º ano).
* 📫 Entre em contato: [LinkedIn](www.linkedin.com/in/guilherme-de-araùjo-moreira-7440602b5) | [E-mail](guiam2909@gmail.com)


Note: Este repositório contém apenas a API (Backend) do projeto. O repositório do Frontend (React) pode ser encontrado #clicando aqui#
