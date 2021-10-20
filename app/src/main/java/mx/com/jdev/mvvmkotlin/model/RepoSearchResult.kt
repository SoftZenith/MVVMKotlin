package mx.com.jdev.mvvmkotlin.model

import androidx.room.Entity
import androidx.room.TypeConverters
import mx.com.jdev.mvvmkotlin.db.GithubTypeConverters

@Entity(primaryKeys = ["query"])
@TypeConverters(GithubTypeConverters::class)
class RepoSearchResult (
    val query: String,
    val reporIds: List<Int>,
    val totalCount: Int,
    val next: Int?
)