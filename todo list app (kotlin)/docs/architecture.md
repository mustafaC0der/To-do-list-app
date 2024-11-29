# Architecture

## Overview
The **TodoApp** is structured using the MVVM (Model-View-ViewModel) pattern to ensure scalability and maintainability.

### Components
1. **Model Layer**
    - `Task.kt`: Represents the data model.
    - `TaskDao.kt`: Defines the database operations.
    - `TaskDatabase.kt`: Implements the Room database.

2. **Repository Layer**
    - `TaskRepository.kt`: Acts as a single source of truth for data.

3. **ViewModel Layer**
    - `TaskViewModel.kt`: Provides data to the UI and acts as a bridge between the Repository and View.

4. **View Layer**
    - Activities and layouts (e.g., `MainActivity.kt` and `activity_main.xml`).

### Data Flow
- The `TaskViewModel` observes data changes and updates the UI automatically via LiveData.
- Room ensures data persistence, even after app restarts.
