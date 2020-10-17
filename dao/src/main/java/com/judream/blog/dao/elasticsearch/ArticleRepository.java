package com.judream.blog.dao.elasticsearch;

import com.judream.blog.model.elasticsearch.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author jiangxuewen
 */
@Repository
public interface ArticleRepository extends ElasticsearchRepository<Article, String> {

}
