package com.judream.blog.service;

import com.judream.blog.model.elasticsearch.Article;

import java.util.Optional;

/**
 * @author jiangxuewen
 */
public interface ArticleService {

    /**
     * 根据id查询文章
     * @param id
     * @return
     */
    Optional<Article> getById(String id);
}
