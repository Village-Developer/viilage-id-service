package village.farmer.entity;

import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

@AllArgsConstructor
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @Type(type = "uuid-char")
    @Column(name = "role_id", nullable = false)
    private UUID id = UUID.randomUUID();;

    @Column(name = "role_name", length = 50)
    private String roleName;

    @Column(name = "created_at", columnDefinition = "timestamp default current_timestamp()", updatable = false)
    private Instant createdAt = new Date().toInstant();

    @Column(name = "updated_at", columnDefinition = "timestamp default null on update current_timestamp()")
    private Instant updatedAt = new Date().toInstant();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Role role = (Role) o;
        return id != null && Objects.equals(id, role.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}