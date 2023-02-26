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
@Table(name = "active_devices")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ActiveDevices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToOne
    private Device device;

    @Column(name = "first_action")
    private LocalDateTime firstActionDate;
    @Column(name = "last_action")
    private LocalDateTime lastActionDate;
}
