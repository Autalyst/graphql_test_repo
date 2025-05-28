package social.sideslip.eaa_chapter_manager.member

import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.graphql.data.method.annotation.SchemaMapping
import org.springframework.stereotype.Controller
import social.sideslip.eaa_chapter_manager.chapter.ChapterDto
import social.sideslip.eaa_chapter_manager.chapter.ChapterService

@Controller
class MemberController(
    val memberService: MemberService,
    val chapterService: ChapterService
) {
    @QueryMapping
    fun memberById(@Argument id: Int): MemberDto? {
        return memberService.findById(id).orElse(null)
    }

    @SchemaMapping(typeName = "Member")
    fun chapter(member: MemberDto): ChapterDto {
        return chapterService.findChapterForMember(member)
    }
}