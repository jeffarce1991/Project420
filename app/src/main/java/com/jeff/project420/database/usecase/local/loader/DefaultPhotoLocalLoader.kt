package com.jeff.project420.database.usecase.local.loader

import com.jeff.project420.database.local.Photo
import com.jeff.project420.database.room.dao.PhotoDao
import io.reactivex.Single
import javax.inject.Inject

class DefaultPhotoLocalLoader @Inject
constructor(private val dao: PhotoDao): PhotoLocalLoader {

    override fun all(): Single<List<Photo>> {
        return Single.fromCallable { dao.getAll() }
    }

}