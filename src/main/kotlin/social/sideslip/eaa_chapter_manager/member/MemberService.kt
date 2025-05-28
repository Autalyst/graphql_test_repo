package social.sideslip.eaa_chapter_manager.member

import org.springframework.stereotype.Service
import social.sideslip.eaa_chapter_manager.chapter.ChapterDto
import java.util.Optional

@Service
class MemberService(
    val repository: MemberRepository
) {
    fun findMembersForChapter(chapter: ChapterDto): List<MemberDto> {
        return repository.findByChapterId(chapter.id)
            .map(MemberDto::fromEntity)
    }

    fun findById(id: Int): Optional<MemberDto> {
        return repository.findById(id)
            .map(MemberDto::fromEntity)
    }
}