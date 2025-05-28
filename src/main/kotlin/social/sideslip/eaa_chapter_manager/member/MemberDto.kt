package social.sideslip.eaa_chapter_manager.member

data class MemberDto (
    val id: Int? = null,
    val name: String,
    val email: String
) {
    companion object {
        fun fromEntity(entity: MemberEntity): MemberDto {
            return MemberDto(
                id = entity.id!!,
                name = entity.name,
                email = entity.email
            )
        }
    }
}