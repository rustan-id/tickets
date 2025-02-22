package id.co.inixindobdg.tickets.events;

//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class OrganizerRepository {
//    private final List<Organizer> organizers = List.of(
//            new Organizer(101, "Globomantics", "Globomantics Technology Corporation"),
//            new Organizer(102, "Carved Rock", "Carved Rock Sports Equipment"));
//
//    public List<Organizer> findAll() {
//        return organizers;
//    }
//}

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizerRepository extends JpaRepository<Organizer, Integer> {
}