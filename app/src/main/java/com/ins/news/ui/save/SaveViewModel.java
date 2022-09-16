package com.ins.news.ui.save;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.ins.news.model.Article;
import com.ins.news.repository.NewsRepository;

import java.util.List;

public class SaveViewModel extends ViewModel {

    private final NewsRepository repository;

    public SaveViewModel(NewsRepository repository) {
        this.repository = repository;
    }

    public LiveData<List<Article>> getAllSavedArticles() {
        return repository.getAllSavedArticles();
    }

    public void deleteSavedArticle(Article article) {
        repository.deleteSavedArticle(article);
    }
}
