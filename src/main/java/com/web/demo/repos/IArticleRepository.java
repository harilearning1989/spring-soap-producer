package com.web.demo.repos;

import com.web.demo.models.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IArticleRepository extends CrudRepository<Article, Long> {
    Article findByArticleId(long articleId);
    List<Article> findByTitleAndCategory(String title, String category);
}
