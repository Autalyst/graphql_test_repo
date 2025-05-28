package social.sideslip.eaa_chapter_manager.chapter

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import social.sideslip.eaa_chapter_manager.member.MemberEntity

@Entity(name = "chapter")
class ChapterEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,
    var name: String,
    var memberCount: Int = 0,
    var active: Boolean = false,

    @OneToMany(mappedBy = "chapter")
    var members: List<MemberEntity>
)