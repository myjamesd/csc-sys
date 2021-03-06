package com.jam.module.topic.elastic;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by eclipse. Copyright (c) 2016, All Rights Reserved.
 */
public interface ElasticTopicRepository extends ElasticsearchRepository<ElasticTopic, String> {

	Page<ElasticTopic> findByTitleStartingWith(String title, Pageable pageable);

	ElasticTopic findByTopicId(int topicId);
}
