package org.slello.repository

import org.bson.types.ObjectId
import org.slello.model.Topic
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface TopicRepository : ReactiveCrudRepository<Topic, ObjectId>