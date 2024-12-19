# Library Management System

A **Library Management System** built using Java, designed to manage library operations such as book inventory, user management, borrowing, and returning of books. This project aims to simplify the management of library resources for librarians and provide a user-friendly interface for members.

## Features

- **Book Management**:
  - Add, update, delete, and search for books.
  - Track availability and issue status.

- **User Management**:
  - Add, update, and delete user profiles (e.g., students, teachers).
  - Maintain borrowing history.

- **Borrowing and Returning**:
  - Issue and return books with real-time updates to inventory.
  - Set due dates and calculate fines for late returns.

- **Search and Filter**:
  - Search for books by title, author, genre, or ISBN.
  - Filter books based on availability and category.

- **Reports and Logs**:
  - Generate reports for issued books, overdue returns, and user activity.
  - Maintain logs for audit purposes.

## Technologies Used

- **Programming Language**: Java
- **Database**: MySQL
- **Frameworks**: JavaFX (for GUI)
- **IDE**: IntelliJ IDEA / Eclipse

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/sushant6563/Library-management-book.git
   ```

2. Navigate to the project directory:
   ```bash
   cd library-management-system
   ```

3. Import the project into your preferred IDE (e.g., IntelliJ IDEA or Eclipse).

4. Set up the database:
   - Create a MySQL database and import the provided SQL file (`library_management.sql`).
   - Update the database configuration in the `DatabaseConnection.java` file.

5. Run the application:
   - Compile and execute the `Main.java` file.

## Usage

1. **Admin Login**:
   - Log in as an admin to manage books and users.

2. **Book Inventory**:
   - Add new books, update existing details, or remove books from the inventory.

3. **User Management**:
   - Register new users and manage their profiles.

4. **Issue and Return**:
   - Issue books to users and accept returns while tracking due dates.

5. **Reports**:
   - Generate and view reports for library operations.


## Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository.
2. Create a new branch:
   ```bash
   git checkout -b feature-name
   ```
3. Commit your changes:
   ```bash
   git commit -m "Description of changes"
   ```
4. Push to the branch:
   ```bash
   git push origin feature-name
   ```
5. Submit a pull request.



