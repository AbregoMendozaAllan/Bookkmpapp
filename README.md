# Bookpedia Kotlin Multiplatform Project

## Overview

Bookpedia is a Kotlin Multiplatform project that provides an interactive book discovery experience. It incorporates advanced libraries and frameworks to deliver a clean and efficient user interface and experience. The project is structured using the **Model-View-Intent (MVI)** architecture, ensuring scalability and maintainability.

---

## Features

### 1. Main Screen

- **Tab 1: List of Books**
  - Displays a list of books fetched from a Book API.
  - Users can scroll through the list, view details, and favorite books.
- **Tab 2: Favorite Books**
  - Displays a curated list of books marked as favorites by the user.

### 2. Details Screen

- Provides comprehensive information about a selected book.
- Option to mark or unmark the book as a favorite.
- Smooth navigation to and from the main screen with custom animations.

---

## Libraries and Tools Used

### 1. **Ktor**

- Handles API requests to fetch book data from a Book API.
- Ensures robust networking with efficient serialization and deserialization of responses.

### 2. **Coil**

- Handles image loading and caching for book covers.
- Optimized for Kotlin Multiplatform, offering high performance and low memory usage.

### 3. **Koin**

- Dependency injection framework used for managing dependencies in a clean and scalable way.
- Reduces boilerplate code and ensures seamless injection across the project.

### 4. **Room**

- Local database for storing favorite books persistently.
- Allows offline access to favorite books with efficient data storage and querying capabilities.

### 5. **Jetpack Compose**

- Modern UI toolkit used to build responsive and dynamic user interfaces.
- Utilizes **Compose Navigation** for handling screen transitions.

### 6. **Custom Animations**

- Enhances the user experience with seamless and visually appealing transitions between screens.

---

## Architecture

The project follows the **MVI (Model-View-Intent)** architecture:

- **Model**: Represents the data layer, including API calls (via Ktor) and local database management (via Room).
- **View**: Jetpack Compose-based UI that reflects the state provided by the ViewModel.
- **Intent**: Defines user actions and intents that interact with the ViewModel.

---

## How It Works

### Flow

1. **API Integration**:

  - Ktor fetches book data from a public Book API.
  - Fetched data is displayed in the main screen's "List of Books" tab.

2. **Local Storage**:

  - Room stores user-favorited books locally.
  - Users can access and manage their favorites via the "Favorite Books" tab.

3. **UI Interaction**:

  - Users can tap on a book to navigate to its details screen.
  - From the details screen, users can favorite/unfavorite books.

4. **Animations**:

  - Custom animations enhance navigation between the main screen and details screen.

---

## Project Structure

```
bookpedia/
└── app/                // Android application module
    └── src/
        └── main/
            └── kotlin/
                └── presentation/   // UI layer (Jetpack Compose components)
                └── domain/          // Business logic and use cases
                └── data/            // API and database management
```

---

## Setup Instructions

### Steps

1. Clone the repository:
   ```bash
   git clone https://github.com/your-repo/bookpedia.git
   ```
2. Open the project in Android Studio.
3. Sync Gradle to download all dependencies.
4. Run the app on an Android device or emulator.

---

## Screenshots

(Add screenshots of the app showcasing the main screen, details screen, and animations.)

---

## Contributing

We welcome contributions to enhance Bookpedia! Please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Submit a pull request with detailed explanations.

---

## License

This project is licensed under the [MIT License](LICENSE).

---

