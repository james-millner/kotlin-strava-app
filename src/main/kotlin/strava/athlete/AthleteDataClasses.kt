package strava.athlete

data class Athlete(val id: Number?, val resource_state: Number?)

data class AthleteActivity(val resource_state: Number?, val athlete: Athlete?, val name: String?, val distance: Number?, val moving_time: Number?, val elapsed_time: Number?, val total_elevation_gain: Number?, val type: String?, val workout_type: Number?, val id: Number?, val external_id: String?, val upload_id: Number?, val start_date: String?, val start_date_local: String?, val timezone: String?, val utc_offset: Number?, val start_latlng: List<Number>?, val end_latlng: List<Number>?, val location_city: Any?, val location_state: Any?, val location_country: String?, val start_latitude: Number?, val start_longitude: Number?, val achievement_count: Number?, val kudos_count: Number?, val comment_count: Number?, val athlete_count: Number?, val photo_count: Number?, val map: Map?, val trainer: Boolean?, val commute: Boolean?, val manual: Boolean?, val private: Boolean?, val visibility: String?, val flagged: Boolean?, val gear_id: String?, val from_accepted_tag: Boolean?, val average_speed: Number?, val max_speed: Number?, val average_watts: Number?, val kilojoules: Number?, val device_watts: Boolean?, val has_heartrate: Boolean?, val average_heartrate: Number?, val max_heartrate: Number?, val heartrate_opt_out: Boolean?, val display_hide_heartrate_option: Boolean?, val elev_high: Number?, val elev_low: Number?, val pr_count: Number?, val total_photo_count: Number?, val has_kudoed: Boolean?, val suffer_score: Number?)

data class Map(val id: String?, val summary_polyline: String?, val resource_state: Number?)