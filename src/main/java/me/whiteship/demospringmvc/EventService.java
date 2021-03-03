package me.whiteship.demospringmvc;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {

    public List<EventModel> getEvents() {
        List<EventModel> events = new ArrayList<>();

        EventModel event1 = EventModel.builder()
                        .eventName("스프링 웹 MVC 스터디")
                        .limitOfEnrollment(5)
                        .startDateTime(LocalDateTime.of(2021, 3, 10, 10, 0))
                        .endDateTime(LocalDateTime.of(2021, 3, 20, 10, 0))
                        .build();

        EventModel event2 = EventModel.builder()
                .eventName("스프링 웹 MVC 스터디")
                .limitOfEnrollment(5)
                .startDateTime(LocalDateTime.of(2021, 3, 17, 10, 0))
                .endDateTime(LocalDateTime.of(2021, 3, 27, 10, 0))
                .build();

        events.add(event1);
        events.add(event2);

        return events;
    }
}
