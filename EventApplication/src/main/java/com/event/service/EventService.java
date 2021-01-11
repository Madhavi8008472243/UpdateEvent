package com.event.service;
import java.time.LocalDate;
import java.util.*;

import com.event.dto.BookingResponse;
import com.event.dto.Event;
import com.event.dto.TicketBooking;
import com.event.dto.TicketCancelResponse;
import com.event.dto.TicketCancelling;
public interface EventService {

	
	public List<Event> getAllEvents();
	public Event getEventById(int eId);
	public Event getEventByName(String eName);
	public Event addEvent(Event event);
	public Event updateEvent(int eId,Event event);
	public Event deleteEvent(int eId);
	public BookingResponse bookTickets(TicketBooking request);
	public TicketCancelResponse canceltickets(TicketCancelling cancel);
	public List<Event> findByEventName(String eName);

}
