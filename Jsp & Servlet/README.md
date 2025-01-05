# Library Management System

The **Library Management System** is a Java-based web application that allows administrators to efficiently manage books, members, and loan records. The system uses servlets, JSP, and DAOs to provide dynamic functionality for managing library operations.

---

## 📚 **Project Overview**
This project is designed to streamline library operations by offering the following features:
- Add and manage books in the library.
- Add and manage library members.
- Add and manage loan records.
- Retrieve and display data dynamically using JSP and Servlets.

### **Technologies Used**
- **Java**: Core logic and servlet implementation.
- **JSP (Java Server Pages)**: For dynamic UI rendering.
- **DAO (Data Access Object)**: To handle database operations.
- **MySQL**: Database for storing library data.
- **CSS & HTML**: For the front-end design.
- **Apache Tomcat**: Deployment of the web application.

---

## ⚙️ **Project Features (Review 3)**

### 1. **Create and Configure Servlets**
The following servlets are implemented for handling form submissions:
- `AddBookServlet.java`
- `AddMemberServlet.java`
- `AddLoanServlet.java`

Each servlet handles `doGet` and `doPost` methods for managing the respective entities.

---

### 2. **User Forms for Adding and Managing Data**
The application includes the following user-facing forms:
- **Add Book**: Allows administrators to add new books by providing book details (Book ID, Title, Author, etc.).
- **Add Member**: Allows administrators to register new members by providing details like Member ID, Name, and Email.
- **Add Loan Record**: Allows administrators to record loan transactions by entering Loan ID, Book ID, Member ID, and Due Date.

### 3. **Integrate JSP with Servlets**
Dynamic JSP files are linked to servlets for a seamless user experience:
- `addBook.jsp`
- `addMember.jsp`
- `addLoan.jsp`
- `manageBooks.jsp`
- `manageMembers.jsp`
- `manageLoans.jsp`

### 4. **Dynamic Data Display**
- `manageBooks.jsp`: Displays all books dynamically using data fetched from the database.
- `manageMembers.jsp`: Displays registered members.
- `manageLoans.jsp`: Displays loan records.

---

## 🔗 **How to Run the Project**

### Prerequisites
- **Java JDK** (Version 8 or higher)
- **Apache Tomcat** (Version 9 or higher)
- **MySQL** Database
- **Maven** (For managing dependencies)

