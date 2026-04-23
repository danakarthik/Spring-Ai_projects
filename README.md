
# 🚀 Spring AI Chat Application

A backend AI-powered chat application built using **Spring Boot** and **Spring AI**, integrated with **Ollama (CodeLlama model)**.

This project exposes a REST API where users can send a query and receive an AI-generated response.

---

## 🧠 Features

* REST API for chat interaction (`/chat`)
* Integration with local LLM using Ollama
* Custom system and user prompts
* Logging using Spring AI advisors
* Safeguard filtering for restricted topics
* Clean layered architecture (Controller → Service → Config)

---

## 🏗️ Project Structure

```
src/
 ├── Controller/
 │    └── ChatController.java
 ├── Service/
 │    ├── ChatService.java
 │    └── ChatServiceImpl.java
 ├── Config/
 │    └── AIConfig.java
 └── SpringAiApplication.java
```

---

## ⚙️ Tech Stack

* Java 17+
* Spring Boot
* Spring AI
* Ollama (Local LLM)
* CodeLlama Model

---

## 🔌 API Endpoint

### GET `/chat`

**Example Request:**

```
http://localhost:8081/chat?q=Explain binary search
```

**Response:**

```
AI-generated response from model
```

---

## ⚡ How It Works

1. User sends request to `/chat`
2. Controller forwards request to Service layer
3. Service builds prompt using system + user templates
4. Request is sent to Ollama model
5. AI response is returned

---

## 🧩 Configuration

* Model: `codellama`
* Temperature: `0.7`
* Server Port: `8081`

---

## 🖥️ Prerequisites

Make sure you have:

* Java 17+
* Maven
* Ollama installed

### Install Ollama:

https://ollama.com

### Run model:

```bash
ollama run codellama
```

---

## ▶️ Run the Application

```bash
mvn spring-boot:run
```

Or run the main class:

```
SpringAiApplication.java
```

---

## 🔐 Safeguards

The application restricts certain topics using AI advisors.

---

## 📌 Future Improvements

* Add React frontend (UI)
* Store chat history (MongoDB)
* Add authentication (JWT)
* Deploy to AWS
* Support multiple AI models

---

## 👨‍💻 Author

**Karthik Bharathapu**
Software Engineer | Java | Spring Boot | AI | Full Stack

---

## ⭐ Support

If you like this project, give it a ⭐ on GitHub!

---

## 🚀 Note

This project was built as part of my journey to become a Software Engineer specializing in **Backend Systems and AI integration**.
