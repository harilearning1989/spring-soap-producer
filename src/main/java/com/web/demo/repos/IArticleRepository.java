package com.web.demo.repos;

import com.web.demo.models.Article;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IArticleRepository extends CrudRepository<Article, Long> {
    Article findByArticleId(long articleId);
    List<Article> findByTitleAndCategory(String title, String category);
}
