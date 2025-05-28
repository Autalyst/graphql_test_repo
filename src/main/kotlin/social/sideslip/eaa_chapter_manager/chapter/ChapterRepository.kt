package social.sideslip.eaa_chapter_manager.chapter

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.util.Optional

interface ChapterRepository: JpaRepository<ChapterEntity, Int> {

    @Query("""
        SELECT c
         FROM chapter c
         JOIN c.members m
         WHERE m.id = :memberId
    """)
    fun findForMember(memberId: Int): Optional<ChapterEntity>
}