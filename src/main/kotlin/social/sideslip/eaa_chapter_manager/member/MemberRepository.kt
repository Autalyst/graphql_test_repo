package social.sideslip.eaa_chapter_manager.member

import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository: JpaRepository<MemberEntity, Int> {
    fun findByChapterId(chapterId: Int): List<MemberEntity>
}