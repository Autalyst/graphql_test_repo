package social.sideslip.eaa_chapter_manager.chapter

data class ChapterDto (
    val id: Int,
    val name: String,
    val memberCount: Int,
    val active: Boolean
) {
    companion object {
        fun fromEntity(entity: ChapterEntity): ChapterDto {
            return ChapterDto(
                id = entity.id!!,
                name = entity.name,
                memberCount = entity.memberCount,
                active = entity.active
            )
        }
    }
}