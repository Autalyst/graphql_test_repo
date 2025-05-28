package social.sideslip.eaa_chapter_manager.member

import jakarta.persistence.CascadeType
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import social.sideslip.eaa_chapter_manager.chapter.ChapterEntity

@Entity(name = "member")
class MemberEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,
    var name: String,
    var email: String,
    @ManyToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "chapter_id", referencedColumnName = "id")
    var chapter: ChapterEntity
)