package social.sideslip.eaa_chapter_manager.user

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.PreUpdate
import jakarta.persistence.Table
import java.time.LocalDateTime

@Entity
@Table(name = "user")
class UserEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var name: String,
    var email: String,
    var eaaMemberId: String,
    var username: String,
    var password: String,
    var activated: Boolean = false,
    var created: LocalDateTime = LocalDateTime.now(),
    var updated: LocalDateTime = LocalDateTime.now()
) {
    @PreUpdate
    private fun update() {
        updated = LocalDateTime.now()
    }
}