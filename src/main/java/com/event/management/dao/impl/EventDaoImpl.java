package com.event.management.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.event.management.dao.EventDao;
import com.event.management.model.Event;
import com.event.management.repository.EventRepository;

@Service
public class EventDaoImpl implements EventDao {

	@Autowired
	private EventRepository repository;

	@Override
	public List<Event> getAllEvents() {
		return repository.getEvents();
	}
}
