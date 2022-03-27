package com.web.demo.services;

import java.util.ArrayList;
import java.util.List;

import com.web.demo.models.Article;
import com.web.demo.repos.IArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements IArticleService {

    @Autowired
    private IArticleRepository articleRepository;

    @Override
    public Article getArticleById(long articleId) {
        Article obj = articleRepository.findByArticleId(articleId);
        return obj;
    }
    @Override
    public List<Article> getAllArticles(){
        List<Article> list = new ArrayList<>();
        articleRepository.findAll().forEach(e -> list.add(e));
        return list;
    }
    @Override
    public synchronized boolean addArticle(Article article){
        List<Article> list = articleRepository.findByTitleAndCategory(article.getTitle(), article.getCategory());
        if (list.size() > 0) {
            return false;
        } else {
            article = articleRepository.save(article);
            return true;
        }
    }
    @Override
    public void updateArticle(Article article) {
        articleRepository.save(article);
    }
    @Override
    public void deleteArticle(Article article) {
        articleRepository.delete(article);
    }
}