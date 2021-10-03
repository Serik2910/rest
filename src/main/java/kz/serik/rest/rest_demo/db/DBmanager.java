package kz.serik.rest.rest_demo.db;

import kz.serik.rest.rest_demo.model.Event;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public final class DBmanager {
    private static ArrayList<Event> events;

    static {
        events= new ArrayList<>();
    }

    public static Event getEventById(Long id){
        return events.stream().filter(a->id.equals(a.getId())).findAny().orElse(null);
    }
}
