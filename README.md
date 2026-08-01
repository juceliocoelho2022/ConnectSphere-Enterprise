<div align="center">

# 🚀 ConnectSphere Enterprise

### A Modern Enterprise Social Network Platform

Uma plataforma social corporativa de alta performance inspirada em **LinkedIn**, **Facebook**, **Instagram**, **WhatsApp**, **Slack** e **Microsoft Teams**, desenvolvida utilizando **Arquitetura de Microsserviços**, **Java 21**, **Spring Boot**, **React**, **Kotlin** e tecnologias Cloud Native.

---

![Java](https://img.shields.io/badge/Java-21-red)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-4-green)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-17-blue)
![Docker](https://img.shields.io/badge/Docker-Latest-blue)
![Kubernetes](https://img.shields.io/badge/Kubernetes-Cloud-326CE5)
![React](https://img.shields.io/badge/React-Frontend-61DAFB)
![Android](https://img.shields.io/badge/Android-Kotlin-3DDC84)
![License](https://img.shields.io/badge/license-MIT-green)

</div>

---

# 📖 Sobre o Projeto

O **ConnectSphere Enterprise** é uma plataforma social corporativa moderna desenvolvida para conectar profissionais, empresas e comunidades em um único ecossistema.

O projeto foi idealizado para demonstrar boas práticas de engenharia de software, arquitetura distribuída e desenvolvimento Full Stack.

Mais do que uma rede social, o ConnectSphere é uma plataforma colaborativa preparada para ambientes corporativos, recrutamento, networking profissional, comunicação interna e gestão de talentos.

---

# 🎯 Objetivos

- Criar uma arquitetura escalável
- Utilizar microsserviços
- Aplicar Clean Architecture
- Aplicar princípios SOLID
- Utilizar Domain Driven Design (DDD)
- Utilizar Event Driven Architecture
- Aplicar CI/CD
- Infraestrutura Cloud Native
- Código limpo e de fácil manutenção

---

# 🏗 Arquitetura Geral

```
                        Internet
                            │
                     API Gateway
                            │
        ┌───────────────────┼────────────────────┐
        │                   │                    │
   Auth Service       User Service       Profile Service
        │                   │                    │
        ├─────────────┬─────┴────────────┬───────┤
        │             │                  │
 Feed Service   Chat Service     Notification
        │             │                  │
        └─────────────┴────────────┬─────┘
                                   │
                           Search Service
                                   │
                             Elasticsearch
```

---

# 📦 Estrutura do Projeto

```
ConnectSphere-Enterprise

backend/
    auth-service
    user-service
    profile-service
    feed-service
    notification-service
    messaging-service
    search-service
    gateway-service

frontend/
    web-app

android/
    mobile-app

docs/

docker/

database/

infrastructure/

scripts/

.github/
```

---

# 🧩 Microsserviços

## 🔐 Auth Service

Responsável por:

- Cadastro
- Login
- JWT
- Refresh Token
- OAuth2
- Segurança
- Controle de Sessão

---

## 👤 User Service

Responsável por:

- Usuários
- Dados pessoais
- Configurações
- Preferências

---

## 🧑‍💼 Profile Service

- Perfil profissional
- Formação
- Experiências
- Competências
- Certificações

---

## 📰 Feed Service

- Timeline
- Curtidas
- Compartilhamentos
- Comentários
- Reações

---

## 💬 Messaging Service

- Conversas
- Chat em tempo real
- Arquivos
- Áudios
- Vídeos

---

## 🔔 Notification Service

- Notificações
- Push
- Email
- Eventos

---

## 🏢 Company Service

- Empresas
- Funcionários
- Vagas
- Seguidores

---

## 💼 Job Service

- Publicação de vagas
- Candidaturas
- Recomendações

---

## 🔍 Search Service

- Pesquisa Global
- Elasticsearch
- Indexação

---

# 🛠 Tecnologias

## Backend

- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate
- Flyway
- JWT
- PostgreSQL
- Redis
- Kafka
- Elasticsearch
- Docker
- Kubernetes
- Maven
- JUnit
- Mockito
- Testcontainers
- OpenAPI
- Swagger

---

## Frontend

- React
- TypeScript
- Vite
- Redux Toolkit
- Tailwind CSS
- React Query

---

## Mobile

- Kotlin
- Jetpack Compose
- Navigation
- Retrofit
- Room
- Hilt
- Coroutines

---

## DevOps

- Docker
- Docker Compose
- Kubernetes
- GitHub Actions
- Nginx
- Prometheus
- Grafana

---

# 🗃 Banco de Dados

- PostgreSQL
- Redis
- Elasticsearch

---

# 🔐 Segurança

- JWT
- OAuth2
- BCrypt
- Refresh Token
- CORS
- CSRF
- HTTPS
- Role Based Access Control (RBAC)

---

# 📱 Funcionalidades

- Cadastro
- Login
- Recuperação de senha
- Perfil profissional
- Feed
- Curtidas
- Comentários
- Compartilhamentos
- Mensagens
- Grupos
- Empresas
- Vagas
- Networking
- Chat em tempo real
- Notificações
- Pesquisa Global
- Upload de imagens
- Upload de vídeos
- Dashboard Administrativo

---

# 📈 Roadmap

## Sprint 01

- [x] Estrutura do projeto
- [x] PostgreSQL
- [x] Docker
- [x] Flyway
- [x] Cadastro de usuário

---

## Sprint 02

- [ ] Login
- [ ] JWT
- [ ] Refresh Token
- [ ] Swagger

---

## Sprint 03

- [ ] Perfil
- [ ] Empresas
- [ ] Feed

---

## Sprint 04

- [ ] Mensagens
- [ ] Notificações
- [ ] Chat

---

## Sprint 05

- [ ] Vagas
- [ ] Pesquisa
- [ ] Dashboard

---

# 📊 Qualidade

- Clean Code
- SOLID
- DDD
- Microsserviços
- CI/CD
- Testes Automatizados
- Observabilidade
- Logs Centralizados

---

# 📸 Imagens

Em breve...

- Arquitetura
- Backend
- Frontend
- Android
- Dashboard
- Infraestrutura

---

# 👨‍💻 Autor

**Jucelio Farias Coelho**

- Professor de Desenvolvimento de Sistemas
- Desenvolvedor Java
- Desenvolvedor Android
- Analista de Sistemas
- Licenciando em Matemática
- Graduando em Pedagogia

---

# ⭐ Contribuição

Pull Requests são bem-vindos.

Para mudanças importantes, abra uma Issue primeiro para discutirmos as alterações propostas.

---

# 📄 Licença

MIT License

---

<div align="center">

## ⭐ Se este projeto foi útil para você, deixe uma Star no repositório.

**ConnectSphere Enterprise — Connecting Professionals. Empowering Businesses.**

</div>
