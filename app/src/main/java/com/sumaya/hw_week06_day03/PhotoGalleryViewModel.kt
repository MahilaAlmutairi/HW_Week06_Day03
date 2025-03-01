package com.sumaya.hw_week06_day03

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.sumaya.hw_week06_day03.data.GalleryItem

class PhotoGalleryViewModel : ViewModel() {
    val galleryItemLiveData: LiveData<List<GalleryItem>>

    init {
        galleryItemLiveData = FlickrFetchr().fetchPhotos()
    }
}
