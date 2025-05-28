package social.sideslip.eaa_chapter_manager.chapter

import org.springframework.stereotype.Service
import social.sideslip.eaa_chapter_manager.member.MemberDto
import java.util.Optional

@Service
class ChapterService(
    val repository: ChapterRepository
) {
    fun findById(id: Int): Optional<ChapterDto> {
        return repository.findById(id)
            .map (ChapterDto::fromEntity)
    }

    fun findChapterForMember(memberDto: MemberDto): ChapterDto {
        return repository.findForMember(memberDto.id!!)
            .map(ChapterDto::fromEntity)
            .get()
    }
}