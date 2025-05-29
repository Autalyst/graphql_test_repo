package social.sideslip.eaa_chapter_manager.member

import jakarta.persistence.CascadeType
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import social.sideslip.eaa_chapter_manager.chapter.ChapterEntity
import social.sideslip.eaa_chapter_manager.user.UserEntity
import java.time.LocalDateTime

@Entity(name = "member")
class MemberEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @ManyToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    var user: UserEntity,

    @ManyToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "chapter_id", referencedColumnName = "id")
    var chapter: ChapterEntity,

    var joinDate: LocalDateTime,

    // todo: store dues paid status? Look it up from a table elsewhere?
)