package social.sideslip.eaa_chapter_manager.chapter

import org.springframework.data.jpa.repository.JpaRepository

interface ChapterRepository: JpaRepository<ChapterEntity, Int>