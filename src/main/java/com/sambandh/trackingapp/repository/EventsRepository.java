package com.sambandh.trackingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sambandh.trackingapp.entity.Events;

public interface EventsRepository extends JpaRepository<Events, Long>{

}
