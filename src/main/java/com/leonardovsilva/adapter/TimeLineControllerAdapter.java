package com.leonardovsilva.adapter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonardovsilva.port.GetTimeLineQuery;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class TimeLineControllerAdapter {

	private final GetTimeLineQuery getTimeLineQuery;

	@GetMapping(path = "/timeline")
	TimeLineExternalUI getTimeLine() {
		
		return getTimeLineQuery.getTimeLine();
	}
}
