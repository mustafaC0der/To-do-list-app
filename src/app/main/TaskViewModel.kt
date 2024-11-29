package com.example.todoapp

import androidx.lifecycle.*
import kotlinx.coroutines.launch

class TaskViewModel(private val repository: TaskRepository) : ViewModel() {
    val allTasks: LiveData<List<Task>> = repository.allTasks

    fun insert(task: Task) = viewModelScope.launch {
        repository.insert(task)
    }

    fun delete(task: Task) = viewModelScope.launch {
        repository.delete(task)
    }
}
