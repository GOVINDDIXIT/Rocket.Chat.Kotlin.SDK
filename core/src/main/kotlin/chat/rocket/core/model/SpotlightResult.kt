package chat.rocket.core.model

import se.ansman.kotshi.JsonSerializable

@JsonSerializable
data class SpotlightResult(
    val users: List<User>,
    val rooms: List<Room>
)