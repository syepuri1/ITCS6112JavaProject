package com.event.management.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.event.management.dao.EventDao;
import com.event.management.model.Event;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/event")
@Api(value = "Event", description = "Event Apis", tags = { "Event" })
public class EventController {

	@Autowired
	private EventDao eventDao;

	private static final Logger LOGGER = LoggerFactory.getLogger(EventController.class);

	@GetMapping("/all")
	@ApiOperation(value = "Get All Events")
	public List<Event> getAllEvents() {

		return eventDao.getAllEvents();
	}

}
