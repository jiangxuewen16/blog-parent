package com.judream.blog.service.impl;

import com.judream.blog.dao.elasticsearch.ArticleRepository;
import com.judream.blog.model.elasticsearch.Article;
import com.judream.blog.service.ArticleService;

import java.util.Optional;

/**
 * @author jiangxuewen
 */
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository articleRepository;

    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public Optional<Article> getById(String id) {
        return articleRepository.findById(id);
    }
}
