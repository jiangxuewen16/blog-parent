package com.judream.blog.dao.elasticsearch;

import com.judream.blog.model.elasticsearch.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author jiangxuewen
 */
public interface UserRepository extends ElasticsearchRepository<User, String> {
}
