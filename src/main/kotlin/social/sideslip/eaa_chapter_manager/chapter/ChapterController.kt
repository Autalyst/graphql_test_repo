package social.sideslip.eaa_chapter_manager.chapter

import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.graphql.data.method.annotation.SchemaMapping
import org.springframework.stereotype.Controller
import social.sideslip.eaa_chapter_manager.member.MemberDto
import social.sideslip.eaa_chapter_manager.member.MemberService

@Controller
class ChapterController(
    val chapterService: ChapterService,
    val memberService: MemberService
) {
    @QueryMapping
    fun chapterById(@Argument id: Int): ChapterDto? {
        return chapterService.findById(id).orElse(null)
    }

    @SchemaMapping(typeName = "Chapter")
    fun members(chapter: ChapterDto): List<MemberDto> {
        return memberService.findMembersForChapter(chapter)
    }
}