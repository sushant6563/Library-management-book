# Unit Testing for Library Management System

This document provides an overview of the unit testing process for the Library Management System project. The project uses **JUnit 4.13.2** for unit testing the DAO classes and services. The following sections explain how to run the tests and describe the scenarios covered.

## Running the Tests

Follow these steps to execute the unit tests:

1. Ensure that the testing database is properly configured with the same schema as the production database.
2. Navigate to the project directory in your terminal or command prompt.
3. Run the following Maven command to execute all tests:
   ```bash
   mvn test
   ```
4. Review the test results in the console output. Each test case will display its status (passed/failed).

Alternatively, you can run the tests using an IDE like IntelliJ IDEA or Eclipse:
- Right-click the `src/test/java` directory.
- Select **Run All Tests** or a specific test file.

---

## DAO Classes and Scenarios Covered

### **1. BookDAO**
- **Tested Scenarios**:
  - Adding a new book to the database (`testAddBook`).
  - Retrieving book details by ID (`testRetrieveBook`).
  - Deleting a book from the database (`testDeleteBook`).

### **2. MemberDAO**
- **Tested Scenarios**:
  - Adding a new member to the database (`testAddMember`).
  - Retrieving member details by ID (`testRetrieveMember`).
  - Deleting a member from the database (`testDeleteMember`).

### **3. LoanDAO**
- **Tested Scenarios**:
  - Adding a new loan record to the database (`testAddLoan`).
  - Retrieving loan details by ID (`testRetrieveLoan`).
  - Deleting a loan record from the database (`testDeleteLoan`).

---

## Testing Framework and Tools

- **JUnit 4.13.2**: A widely-used Java testing framework.
- **Maven**: For managing dependencies and running tests.

---

For more details on the unit tests, refer to the test files located in `src/test/java/com/library/test`.

### Contributions
Feel free to contribute additional test cases or improve existing ones to ensure robust application functionality.


