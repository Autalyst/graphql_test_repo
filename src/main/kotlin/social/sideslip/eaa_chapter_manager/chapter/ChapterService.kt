package social.sideslip.eaa_chapter_manager.chapter

import org.springframework.stereotype.Service
import java.util.Optional

@Service
class ChapterService(
    val repository: ChapterRepository
) {
    fun findById(id: Int): Optional<ChapterDto> {
        return repository.findById(id)
            .map (ChapterDto::fromEntity)
    }
}