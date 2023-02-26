package dgryzhko.com.leadertesttask.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

/**
 * @Author Dgryzhkov
 */
@Entity
@Table(name = "events")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    private Device device;

    @Column(name = "type", nullable = false)
    private String type;

    // TODO Type
    @Column(name = "payload", columnDefinition = "jsonb")
    private Object payload;

    @Column(name = "time_of_create")
    private LocalDateTime time_of_create;
}