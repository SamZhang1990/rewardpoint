package com.iv.rewardpoint.search.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.iv.rewardpoint.search.pojo.Article;

public interface ArticleDao extends ElasticsearchRepository<Article, String>{

	public Page<Article> findByTitleOrContentLike(String title, String content, Pageable pageable);
}
