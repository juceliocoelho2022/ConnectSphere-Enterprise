<div align="center">

# 🚀 ConnectSphere Enterprise

### Enterprise Social Network Platform

Plataforma social corporativa desenvolvida para conectar profissionais, empresas e comunidades em um ecossistema moderno, seguro e escalável.

O projeto utiliza **Java 21**, **Spring Boot**, **PostgreSQL**, **Docker** e arquitetura orientada a microsserviços. As próximas etapas incluem aplicações Web com React, Mobile com Kotlin e infraestrutura Cloud Native.

<br>

<a href="docs/images/connectsphere-banner.png">
  <img
    src="docs/images/connectsphere-banner.png"
    alt="ConnectSphere Enterprise"
    width="100%"
  />
</a>

<br>
<br>

![Java](https://img.shields.io/badge/Java-21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.0.7-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-17-4169E1?style=for-the-badge&logo=postgresql&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-Compose-2496ED?style=for-the-badge&logo=docker&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-Build-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)
![GitHub Actions](https://img.shields.io/badge/GitHub_Actions-CI%2FCD-2088FF?style=for-the-badge&logo=githubactions&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

</div>

---

## 📖 Sobre o projeto

O **ConnectSphere Enterprise** é uma plataforma social corporativa desenvolvida para reunir recursos de networking profissional, comunicação interna, recrutamento, colaboração entre equipes e gestão de talentos.

O projeto foi criado com o objetivo de aplicar, em um cenário próximo ao mercado, conceitos de:

- Arquitetura de microsserviços;
- APIs REST;
- Segurança com Spring Security;
- Autenticação baseada em JWT;
- Domain-Driven Design;
- Clean Architecture;
- Princípios SOLID;
- Persistência com PostgreSQL;
- Versionamento de banco de dados com Flyway;
- Conteinerização com Docker;
- Testes automatizados;
- Integração e entrega contínuas;
- Observabilidade;
- Arquitetura orientada a eventos.

> O foco do projeto não é apenas entregar funcionalidades, mas construir uma base técnica organizada, segura, testável e preparada para evolução.

---

## 🎯 Objetivos

- Construir uma plataforma social corporativa moderna;
- Aplicar boas práticas de Engenharia de Software;
- Criar serviços independentes e escaláveis;
- Implementar autenticação e autorização seguras;
- Trabalhar com arquitetura distribuída;
- Desenvolver aplicações Web e Mobile;
- Aplicar testes automatizados;
- Documentar APIs com OpenAPI e Swagger;
- Automatizar processos com CI/CD;
- Preparar a infraestrutura para ambientes Cloud Native;
- Criar um projeto de portfólio alinhado ao mercado de desenvolvimento backend.

---

## 📌 Status atual

> 🚧 Projeto em desenvolvimento contínuo.

### Funcionalidades implementadas

- [x] Estrutura inicial do projeto;
- [x] Organização modular do repositório;
- [x] Configuração do Auth Service;
- [x] Configuração do PostgreSQL;
- [x] PostgreSQL executado com Docker Compose;
- [x] Configuração do Spring Data JPA;
- [x] Configuração do Flyway;
- [x] Criação das entidades de autenticação;
- [x] Cadastro de usuários;
- [x] Validação de e-mail duplicado;
- [x] Criptografia de senha;
- [x] Estrutura inicial de papéis e permissões;
- [x] Configuração inicial do JWT;
- [x] DTOs de entrada e saída;
- [x] Tratamento inicial de exceções;
- [x] Testes de inicialização da aplicação;
- [x] Versionamento com Git e GitHub.

### Em desenvolvimento

- [ ] Login;
- [ ] Geração completa de Access Token;
- [ ] Refresh Token;
- [ ] Logout;
- [ ] Recuperação de senha;
- [ ] Documentação completa com Swagger;
- [ ] Testes unitários e de integração;
- [ ] User Service;
- [ ] Profile Service;
- [ ] API Gateway;
- [ ] Frontend Web;
- [ ] Aplicativo Android.

---

## 🏗️ Arquitetura geral

```text
                              INTERNET
                                  │
                                  ▼
                         ┌─────────────────┐
                         │   API Gateway   │
                         └────────┬────────┘
                                  │
          ┌───────────────────────┼────────────────────────┐
          │                       │                        │
          ▼                       ▼                        ▼
 ┌────────────────┐     ┌────────────────┐      ┌────────────────┐
 │  Auth Service  │     │  User Service  │      │ Profile Service│
 └───────┬────────┘     └───────┬────────┘      └───────┬────────┘
         │                      │                       │
         └───────────────┬──────┴───────────────┬───────┘
                         │                      │
                         ▼                      ▼
                ┌────────────────┐     ┌──────────────────┐
                │  Feed Service  │     │ Messaging Service│
                └───────┬────────┘     └────────┬─────────┘
                        │                       │
                        └───────────┬───────────┘
                                    │
                                    ▼
                         ┌──────────────────────┐
                         │ Notification Service │
                         └──────────┬───────────┘
                                    │
                                    ▼
                         ┌──────────────────────┐
                         │    Search Service    │
                         └──────────┬───────────┘
                                    │
                                    ▼
                         ┌──────────────────────┐
                         │    Elasticsearch     │
                         └──────────────────────┘
```

---

## 🧩 Microsserviços planejados

### 🔐 Auth Service

Responsável pela autenticação e segurança da plataforma.

Principais responsabilidades:

- Cadastro de usuários;
- Login;
- Access Token;
- Refresh Token;
- Logout;
- Recuperação de senha;
- Controle de sessões;
- Spring Security;
- JWT;
- OAuth2;
- Papéis e permissões;
- Controle de acesso baseado em RBAC.

### 👤 User Service

Responsável pelos dados principais dos usuários.

- Dados pessoais;
- Configurações;
- Preferências;
- Status da conta;
- Atualização de informações;
- Controle do ciclo de vida do usuário.

### 🧑‍💼 Profile Service

Responsável pelo perfil profissional.

- Resumo profissional;
- Formação acadêmica;
- Experiências;
- Competências;
- Certificações;
- Portfólio;
- Projetos;
- Recomendações profissionais.

### 📰 Feed Service

Responsável pela timeline da plataforma.

- Publicações;
- Comentários;
- Curtidas;
- Reações;
- Compartilhamentos;
- Menções;
- Controle de visibilidade;
- Paginação do feed.

### 💬 Messaging Service

Responsável pela comunicação em tempo real.

- Conversas individuais;
- Conversas em grupo;
- Mensagens de texto;
- Arquivos;
- Imagens;
- Áudios;
- Vídeos;
- Status de leitura;
- WebSocket.

### 🔔 Notification Service

Responsável por notificações e eventos.

- Notificações internas;
- Push notifications;
- Envio de e-mails;
- Eventos de conexão;
- Curtidas;
- Comentários;
- Mensagens;
- Convites;
- Alertas do sistema.

### 🏢 Company Service

Responsável pelos recursos corporativos.

- Cadastro de empresas;
- Página institucional;
- Funcionários;
- Seguidores;
- Administradores;
- Cultura organizacional;
- Publicações empresariais.

### 💼 Job Service

Responsável pelo módulo de recrutamento.

- Publicação de vagas;
- Candidaturas;
- Currículos;
- Status da candidatura;
- Recomendação de vagas;
- Gestão de processos seletivos;
- Compatibilidade entre perfil e vaga.

### 🔍 Search Service

Responsável pelas pesquisas globais.

- Pesquisa de usuários;
- Pesquisa de empresas;
- Pesquisa de vagas;
- Pesquisa de publicações;
- Indexação;
- Filtros;
- Elasticsearch.

---

## 📦 Estrutura do repositório

```text
ConnectSphere-Enterprise/
│
├── .github/
│   └── workflows/
│
├── android/
│   └── mobile-app/
│
├── backend/
│   ├── auth-service/
│   ├── user-service/
│   ├── profile-service/
│   ├── feed-service/
│   ├── messaging-service/
│   ├── notification-service/
│   ├── company-service/
│   ├── job-service/
│   ├── search-service/
│   └── gateway-service/
│
├── database/
│   ├── migrations/
│   └── scripts/
│
├── docker/
│   ├── docker-compose.yml
│   └── Dockerfiles/
│
├── docs/
│   ├── architecture/
│   ├── api/
│   └── images/
│       └── connectsphere-banner.png
│
├── frontend/
│   └── web-app/
│
├── infrastructure/
│   ├── kubernetes/
│   ├── monitoring/
│   └── cloud/
│
├── scripts/
│
├── .gitignore
├── docker-compose.yml
├── LICENSE
└── README.md
```

---

## 🛠️ Tecnologias

### Backend

| Tecnologia | Finalidade |
|---|---|
| Java 21 | Linguagem principal do backend |
| Spring Boot | Desenvolvimento dos microsserviços |
| Spring Security | Autenticação e autorização |
| Spring Data JPA | Persistência de dados |
| Hibernate | Mapeamento objeto-relacional |
| PostgreSQL | Banco de dados relacional |
| Flyway | Versionamento do banco de dados |
| JWT | Autenticação baseada em tokens |
| Maven | Gerenciamento de dependências |
| OpenAPI | Especificação das APIs |
| Swagger UI | Documentação e testes das APIs |
| JUnit | Testes automatizados |
| Mockito | Criação de mocks |
| Testcontainers | Testes de integração com containers |

### Frontend planejado

| Tecnologia | Finalidade |
|---|---|
| React | Construção da interface Web |
| TypeScript | Tipagem estática |
| Vite | Build e ambiente de desenvolvimento |
| Redux Toolkit | Gerenciamento de estado |
| React Query | Requisições e cache |
| Tailwind CSS | Estilização |
| Axios | Integração com APIs |

### Mobile planejado

| Tecnologia | Finalidade |
|---|---|
| Kotlin | Desenvolvimento Android |
| Jetpack Compose | Construção de interfaces |
| Navigation Compose | Navegação |
| Retrofit | Integração com APIs REST |
| Room | Persistência local |
| Hilt | Injeção de dependências |
| Coroutines | Programação assíncrona |
| DataStore | Armazenamento de preferências |

### Infraestrutura e DevOps

| Tecnologia | Finalidade |
|---|---|
| Docker | Conteinerização |
| Docker Compose | Orquestração local |
| Kubernetes | Orquestração em produção |
| GitHub Actions | CI/CD |
| Nginx | Proxy reverso |
| Kafka | Comunicação orientada a eventos |
| Redis | Cache e armazenamento temporário |
| Elasticsearch | Pesquisa e indexação |
| Prometheus | Coleta de métricas |
| Grafana | Dashboards e observabilidade |

---

## 🗄️ Banco de dados

### Tecnologias

- PostgreSQL;
- Redis;
- Elasticsearch.

### Banco principal atual

```text
Banco: connectsphere
SGBD: PostgreSQL 17
Porta externa: 5434
Porta interna do container: 5432
```

### Entidades iniciais do Auth Service

- User;
- Role;
- Permission;
- RefreshToken.

### Relacionamentos principais

```text
User
 ├── possui Role
 ├── recebe Permissions por meio das Roles
 └── possui RefreshTokens

Role
 └── possui múltiplas Permissions
```

---

## 🔐 Segurança

A segurança da plataforma está sendo desenvolvida com:

- Spring Security;
- JWT;
- Refresh Token;
- BCrypt;
- Controle de acesso baseado em papéis;
- Role-Based Access Control;
- CORS;
- CSRF;
- HTTPS;
- Validação de entrada;
- Tratamento centralizado de exceções;
- Expiração de tokens;
- Bloqueio de usuários;
- Auditoria;
- Registro de tentativas de acesso.

### Perfis de acesso planejados

```text
USER
RECRUITER
COMPANY_ADMIN
MODERATOR
ADMIN
SUPER_ADMIN
```

---

## 📱 Funcionalidades planejadas

### Usuários

- Cadastro;
- Login;
- Logout;
- Recuperação de senha;
- Atualização de dados;
- Exclusão ou desativação da conta;
- Configurações de privacidade.

### Perfil profissional

- Foto;
- Capa;
- Resumo profissional;
- Experiências;
- Formação;
- Competências;
- Certificações;
- Projetos;
- Recomendações.

### Networking

- Seguir usuários;
- Conectar profissionais;
- Solicitações de conexão;
- Recomendações;
- Sugestões de contatos.

### Feed

- Publicações;
- Curtidas;
- Reações;
- Comentários;
- Compartilhamentos;
- Hashtags;
- Menções;
- Imagens;
- Vídeos.

### Mensagens

- Conversas privadas;
- Grupos;
- Chat em tempo real;
- Envio de arquivos;
- Áudios;
- Vídeos;
- Confirmação de leitura.

### Empresas e vagas

- Página empresarial;
- Funcionários;
- Seguidores;
- Publicação de vagas;
- Candidaturas;
- Recomendação de oportunidades;
- Acompanhamento de processos seletivos.

### Administração

- Dashboard administrativo;
- Gerenciamento de usuários;
- Moderação de conteúdo;
- Auditoria;
- Métricas;
- Logs;
- Controle de permissões.

---

## ⚙️ Pré-requisitos

Antes de executar o projeto, instale:

- Java 21;
- Maven 3.9 ou superior;
- Docker;
- Docker Compose;
- Git;
- IDE compatível com Java, como IntelliJ IDEA ou VS Code;
- Postman ou Insomnia para testar as APIs.

Confirme as instalações:

```bash
java --version
mvn --version
docker --version
docker compose version
git --version
```

---

## 🚀 Como executar o projeto

### 1. Clone o repositório

```bash
git clone https://github.com/juceliocoelho2022/ConnectSphere-Enterprise.git
```

### 2. Entre na pasta do projeto

```bash
cd ConnectSphere-Enterprise
```

### 3. Inicie o PostgreSQL

Na raiz do projeto:

```bash
docker compose up -d
```

Confira os containers:

```bash
docker compose ps
```

Visualize os logs:

```bash
docker compose logs -f
```

### 4. Acesse o Auth Service

```bash
cd backend/auth-service
```

### 5. Execute os testes

No Windows:

```bash
mvnw.cmd test
```

No Linux ou macOS:

```bash
./mvnw test
```

Também é possível utilizar:

```bash
mvn test
```

### 6. Inicie a aplicação

No Windows:

```bash
mvnw.cmd spring-boot:run
```

No Linux ou macOS:

```bash
./mvnw spring-boot:run
```

Ou:

```bash
mvn spring-boot:run
```

### 7. Acesse a API

```text
http://localhost:8085
```

---

## 🌐 Endpoint disponível

### Cadastro de usuário

```http
POST /register
```

Exemplo de requisição:

```json
{
  "name": "Jucelio Farias Coelho",
  "email": "jucelio@example.com",
  "password": "SenhaForte@123"
}
```

Exemplo com `curl`:

```bash
curl --request POST \
  --url http://localhost:8085/register \
  --header "Content-Type: application/json" \
  --data '{
    "name": "Jucelio Farias Coelho",
    "email": "jucelio@example.com",
    "password": "SenhaForte@123"
  }'
```

> Os campos exatos devem acompanhar a implementação atual do `RegisterRequest`.

---

## ⚙️ Configuração da aplicação

Exemplo simplificado do arquivo `application.yaml`:

```yaml
server:
  port: 8085

spring:
  application:
    name: auth-service

  datasource:
    url: jdbc:postgresql://localhost:5434/connectsphere
    username: postgres
    password: postgres

  jpa:
    hibernate:
      ddl-auto: validate
    open-in-view: false

  flyway:
    enabled: true

security:
  jwt:
    secret: ${JWT_SECRET}
    access-token-expiration: 900000
    refresh-token-expiration: 604800000
```

Crie a variável de ambiente:

### Windows PowerShell

```powershell
$env:JWT_SECRET="sua-chave-secreta-segura"
```

### Linux ou macOS

```bash
export JWT_SECRET="sua-chave-secreta-segura"
```

> Nunca publique chaves reais, senhas ou tokens no GitHub.

---

## 🐳 Exemplo de Docker Compose

```yaml
services:
  postgres:
    image: postgres:17
    container_name: connectsphere-postgres

    environment:
      POSTGRES_DB: connectsphere
      POSTGRES_USER: postgres
      POSTGRES_PASSWORD: postgres

    ports:
      - "5434:5432"

    volumes:
      - connectsphere_postgres_data:/var/lib/postgresql/data

    healthcheck:
      test:
        - CMD-SHELL
        - pg_isready -U postgres -d connectsphere
      interval: 10s
      timeout: 5s
      retries: 5

volumes:
  connectsphere_postgres_data:
```

---

## 🧪 Testes

O projeto deverá possuir:

- Testes unitários;
- Testes de integração;
- Testes de controller;
- Testes de service;
- Testes de repository;
- Testes de segurança;
- Testes com Testcontainers;
- Cobertura de testes com JaCoCo.

Comando:

```bash
mvn clean test
```

Relatório do JaCoCo:

```bash
mvn clean verify
```

Caminho esperado:

```text
target/site/jacoco/index.html
```

---

## 📚 Documentação da API

A documentação será disponibilizada por OpenAPI e Swagger.

Endereços planejados:

```text
http://localhost:8085/swagger-ui.html
```

ou:

```text
http://localhost:8085/swagger-ui/index.html
```

Especificação OpenAPI:

```text
http://localhost:8085/v3/api-docs
```

---

## 📊 Qualidade do código

O projeto busca aplicar:

- Clean Code;
- SOLID;
- Domain-Driven Design;
- Clean Architecture;
- Arquitetura Hexagonal;
- Microsserviços;
- Separação de responsabilidades;
- Baixo acoplamento;
- Alta coesão;
- DTOs;
- Mappers;
- Validações;
- Tratamento centralizado de exceções;
- Testes automatizados;
- Padronização de respostas;
- Observabilidade;
- Logs estruturados.

---

## 📈 Roadmap

### Sprint 01 — Fundação do projeto

- [x] Criar estrutura do repositório;
- [x] Configurar Java 21;
- [x] Configurar Spring Boot;
- [x] Configurar PostgreSQL;
- [x] Configurar Docker Compose;
- [x] Configurar Flyway;
- [x] Criar entidades iniciais;
- [x] Implementar cadastro de usuário;
- [x] Implementar validação de e-mail duplicado;
- [x] Configurar criptografia de senha.

### Sprint 02 — Autenticação

- [ ] Implementar login;
- [ ] Gerar Access Token;
- [ ] Implementar Refresh Token;
- [ ] Implementar logout;
- [ ] Configurar Spring Security;
- [ ] Implementar tratamento global de exceções;
- [ ] Documentar API com Swagger;
- [ ] Criar testes automatizados.

### Sprint 03 — Usuários e perfis

- [ ] Criar User Service;
- [ ] Criar Profile Service;
- [ ] Implementar perfil profissional;
- [ ] Implementar formação acadêmica;
- [ ] Implementar experiências;
- [ ] Implementar competências;
- [ ] Implementar certificações.

### Sprint 04 — Feed social

- [ ] Criar Feed Service;
- [ ] Criar publicações;
- [ ] Implementar comentários;
- [ ] Implementar curtidas;
- [ ] Implementar reações;
- [ ] Implementar compartilhamentos;
- [ ] Implementar upload de imagens.

### Sprint 05 — Comunicação

- [ ] Criar Messaging Service;
- [ ] Criar Notification Service;
- [ ] Implementar chat em tempo real;
- [ ] Implementar WebSocket;
- [ ] Implementar notificações;
- [ ] Implementar envio de arquivos.

### Sprint 06 — Empresas e recrutamento

- [ ] Criar Company Service;
- [ ] Criar Job Service;
- [ ] Implementar empresas;
- [ ] Implementar vagas;
- [ ] Implementar candidaturas;
- [ ] Implementar recomendações.

### Sprint 07 — Busca

- [ ] Criar Search Service;
- [ ] Integrar Elasticsearch;
- [ ] Implementar pesquisa global;
- [ ] Implementar filtros;
- [ ] Implementar indexação.

### Sprint 08 — Frontend Web

- [ ] Criar aplicação React;
- [ ] Implementar autenticação;
- [ ] Implementar dashboard;
- [ ] Implementar perfil;
- [ ] Implementar feed;
- [ ] Implementar mensagens;
- [ ] Implementar vagas.

### Sprint 09 — Aplicativo Android

- [ ] Criar projeto Kotlin;
- [ ] Implementar Jetpack Compose;
- [ ] Implementar autenticação;
- [ ] Implementar perfil;
- [ ] Implementar feed;
- [ ] Implementar chat;
- [ ] Implementar notificações.

### Sprint 10 — DevOps e observabilidade

- [ ] Criar pipelines no GitHub Actions;
- [ ] Configurar Kubernetes;
- [ ] Configurar Prometheus;
- [ ] Configurar Grafana;
- [ ] Centralizar logs;
- [ ] Implementar monitoramento;
- [ ] Preparar ambiente Cloud.

---

## 📸 Imagens do projeto

As imagens serão adicionadas conforme as funcionalidades forem implementadas.

```text
docs/images/
├── connectsphere-banner.png
├── architecture.png
├── auth-service.png
├── swagger.png
├── frontend-dashboard.png
├── android-home.png
└── monitoring-dashboard.png
```

### Banner principal

<div align="center">

<img
  src="docs/images/connectsphere-banner.png"
  alt="ConnectSphere Enterprise Banner"
  width="100%"
/>

</div>

---

## 🤝 Como contribuir

Contribuições são bem-vindas.

### Fluxo recomendado

1. Faça um fork do projeto;
2. Crie uma branch para sua funcionalidade;
3. Realize as alterações;
4. Crie testes;
5. Faça o commit;
6. Envie a branch;
7. Abra um Pull Request.

Exemplo:

```bash
git checkout -b feat/nova-funcionalidade
```

```bash
git add .
```

```bash
git commit -m "feat: implementa nova funcionalidade"
```

```bash
git push origin feat/nova-funcionalidade
```

### Padrão de commits

```text
feat: nova funcionalidade
fix: correção de erro
docs: alteração na documentação
test: criação ou alteração de testes
refactor: refatoração de código
chore: configuração ou manutenção
build: alteração no processo de build
ci: alteração na integração contínua
```

---

## 👨‍💻 Autor

<div align="center">

### Jucelio Farias Coelho

**Desenvolvedor Java Backend | Desenvolvedor Android | Professor de Desenvolvimento de Sistemas**

</div>

Atuação e formação:

- Desenvolvimento Java Backend;
- Spring Boot;
- APIs REST;
- PostgreSQL;
- Docker;
- Desenvolvimento Android;
- Kotlin;
- Jetpack Compose;
- Análise de Sistemas;
- Análise de Dados;
- Docência em Desenvolvimento de Sistemas;
- Licenciatura em Matemática;
- Pedagogia.

### GitHub

```text
https://github.com/juceliocoelho2022
```

---

## 📄 Licença

Este projeto está licenciado sob a licença MIT.

Consulte o arquivo:

```text
LICENSE
```

---

<div align="center">

## ⭐ Apoie o projeto

Caso este projeto tenha contribuído com seus estudos ou servido como referência, deixe uma estrela no repositório.

### ConnectSphere Enterprise

**Connecting Professionals. Empowering Businesses.**

Desenvolvido por **Jucelio Farias Coelho**

</div>
