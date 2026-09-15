# ☀️ GEOSOLAR - Sistema de Autenticação 👨‍💻

> [!NOTE]
> Módulo de segurança e autenticação (Login, Registro e Recuperação de Senha) para a plataforma **GEOSOLAR - Mapeamento de Potencial Solar**.

<table>
  <tr>
    <td width="800px">
      <div align="justify">
        Este <b>README.md</b> documenta o módulo de autenticação do projeto <b>GEOSOLAR</b>. O sistema foi desenvolvido utilizando <b>Java</b> e <b>Spring Boot</b> no back-end, com renderização de páginas HTML/CSS através do <b>Thymeleaf</b>. O objetivo principal desta aplicação é garantir o acesso seguro à plataforma, oferecendo rotas para login, cadastro de novos usuários e recuperação de credenciais. A arquitetura segue o padrão <b>MVC (Model-View-Controller)</b>, garantindo uma separação clara entre a lógica de roteamento e a interface do usuário.
      </div>
    </td>
    <td>
      <div align="center">
        <!-- Substitua pelo link da sua logo real, se houver -->
        <img src="https://joaopauloaramuni.github.io/image/logo_ES_vertical.png" alt="Logo do Projeto" width="120px"/>
      </div>
    </td>
  </tr> 
</table>

---

## 🚧 Status do Projeto

[![Versão](https://img.shields.io/badge/Versão-v1.0.0-blue?style=for-the-badge)](#) ![Java](https://img.shields.io/badge/Java-25-007ec6?style=for-the-badge&logo=openjdk&logoColor=white) ![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.1.1-007ec6?style=for-the-badge&logo=springboot&logoColor=white) ![Maven](https://img.shields.io/badge/Maven-3.9-007ec6?style=for-the-badge&logo=apachemaven&logoColor=white) ![Thymeleaf](https://img.shields.io/badge/Thymeleaf-3.1-007ec6?style=for-the-badge&logo=thymeleaf&logoColor=white) ![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white) ![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white)

---

## 📚 Índice
- [Sobre o Projeto](#-sobre-o-projeto)
- [Funcionalidades Principais](#-funcionalidades-principais)
- [Tecnologias Utilizadas](#-tecnologias-utilizadas)
- [Instalação e Execução](#-instalação-e-execução)
- [Estrutura de Pastas](#-estrutura-de-pastas)
- [Autores](#-autores)
- [Agradecimentos](#-agradecimentos)

---

## 📝 Sobre o Projeto
O GEOSOLAR é uma iniciativa voltada para o mapeamento e análise de potencial solar. Este repositório contém o módulo fundamental de entrada da aplicação: o sistema de contas de usuário. 

Ele atende à necessidade de restringir o acesso a dados sensíveis, garantindo que apenas usuários registrados e autenticados possam interagir com as ferramentas da plataforma. O projeto tem fins acadêmicos e foi desenvolvido dentro do escopo do curso de Engenharia de Software da PUC Minas.

---

## ✨ Funcionalidades Principais
- 🔐 **Autenticação Segura:** Tela de Login para usuários cadastrados.
- 📝 **Criação de Contas:** Tela de Registro para novos usuários.
- 🔄 **Recuperação de Acesso:** Rota dedicada para recuperação de senhas.
- 🎨 **Interface Responsiva:** Telas estilizadas com CSS, utilizando Flexbox para adaptação em diferentes tamanhos de tela.

---

## 🛠 Tecnologias Utilizadas

### 💻 Front-end
* **Linguagens:** HTML5 e CSS3
* **Template Engine:** Thymeleaf (Renderização no Back-end)

### 🖥️ Back-end
* **Linguagem/Runtime:** Java (JDK)
* **Framework:** Spring Boot 
* **Gerenciador de Dependências:** Maven

---

## 🔧 Instalação e Execução

### Pré-requisitos
* **Java JDK:** Instalado na máquina (Versão 17+).
* **Maven:** Instalado ou uso do wrapper (`mvnw`).

### Como Executar a Aplicação Localmente

1. **Clone o Repositório:**
```bash
git clone https://github.com/gustavoryan-del/LoginPucDiaw.git
cd LoginPucDiaw

```

2. **Inicie a aplicação Spring Boot:**
   Abra o terminal na pasta raiz do projeto e execute:

```bash
mvn clean install
mvn spring-boot:run

```

🚀 *O Back-end estará disponível na porta configurada (Padrão: **http://localhost:8081** ou **http://localhost:8080**).*

3. **Acesse no Navegador:**

* Tela de Login: `http://localhost:8081/login`
* Tela de Registro: `http://localhost:8081/register`
* Tela de Recuperação: `http://localhost:8081/recoverypassword`

---

## 📂 Estrutura de Pastas

```text
LoginPucDiaw/
├── .idea/                           # ⚙️ Configurações locais da IDE (IntelliJ)
│   ├── .gitignore
│   ├── compiler.xml
│   ├── encodings.xml
│   ├── jarRepositories.xml
│   ├── misc.xml
│   ├── vcs.xml
│   └── workspace.xml
├── .mvn/wrapper/                    # 📦 Arquivos de configuração do Maven Wrapper
│   └── maven-wrapper.properties
├── src/
│   ├── main/
│   │   ├── java/com/example/LoginPUC/
│   │   │   ├── controller/      
│   │   │   │   └── SecureLoginController.java  # 🎮 Mapeamento de endpoints e rotas HTTP
│   │   │   └── LoginPucApplication.java        # 🚀 Classe principal (Start do Spring Boot)
│   │   │
│   │   └── resources/
│   │       ├── static/                         # 🌐 Arquivos estáticos (públicos)
│   │       │   ├── css/                        # 🎨 Folhas de estilo da aplicação
│   │       │   │   ├── login.css
│   │       │   │   ├── recoverypassword.css
│   │       │   │   └── register.css
│   │       │   └── images/                     # 🖼️ Imagens, logos e backgrounds
│   │       │       ├── apc-login-bg.png
│   │       │       ├── apc-login-bg2.jpg
│   │       │       ├── GeoSolar-logo.jpeg
│   │       │       ├── iconesite.jpg
│   │       │       └── imagem-lampada.avif
│   │       ├── templates/                      # 🖼️ Templates Thymeleaf (Views em HTML)
│   │       │   ├── login.html
│   │       │   ├── recoverypassword.html
│   │       │   └── register.html
│   │       └── application.properties          # ⚙️ Configurações do servidor e projeto
│   │
│   └── test/                                   # 🧪 Classes de testes automatizados
│       └── java/com/example/LoginPUC/
│           └── LoginPucApplicationTests.java
│
├── target/                                     # 🏗️ Arquivos compilados gerados pelo build
├── .gitattributes                              # 🐙 Configurações de atributos do Git
├── .gitignore                                  # 🧹 Regras de arquivos ignorados pelo Git
├── mvnw                                        # 🛠️ Executável do Maven Wrapper (Linux/Mac)
├── mvnw.cmd                                    # 🛠️ Executável do Maven Wrapper (Windows)
├── pom.xml                                     # 📦 Dependências e ciclo de vida do Maven
└── README.md                                   # 📘 Documentação principal do projeto

```

---

## 👥 Autores

Este projeto foi desenvolvido por alunos do curso de **Engenharia de Software** da **PUC Minas**.

| 👤 Nome | GitHub          | 💼 LinkedIn |
| --- |-----------------| --- |
| **Gustavo Ryan** | gustavoryan-del |  |
| **Lucas Gomes** | LukasGom3s      |  |

---

## 🙏 Agradecimentos

Gostaríamos de agradecer aos seguintes canais e pessoas que foram fundamentais para o desenvolvimento deste projeto:

* **[Engenharia de Software PUC Minas](https://www.instagram.com/engsoftwarepucminas/)** - Pelo apoio institucional, estrutura acadêmica e fomento à inovação e boas práticas de engenharia.
* **[Prof. Dr. João Paulo Aramuni](https://github.com/joaopauloaramuni)** - Pelos valiosos ensinamentos sobre Desenvolvimento, Arquitetura de Software e Padrões de Projeto.

---
