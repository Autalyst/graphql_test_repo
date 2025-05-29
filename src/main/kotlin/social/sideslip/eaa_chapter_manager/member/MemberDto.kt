package social.sideslip.eaa_chapter_manager.member

data class MemberDto (
    val id: Int? = null,
    val chapterId: Int,
    val eaaMemberId: Long,
    val name: String,
    val email: String
) {
    companion object {
        fun fromEntity(entity: MemberEntity): MemberDto {
            return MemberDto(
                id = entity.id!!,
                chapterId = entity.chapter.id!!,
                eaaMemberId = entity.eaaMemberId,
                name = entity.name,
                email = entity.email
            )
        }
    }
}