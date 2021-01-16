package id.Ersad.livescore.ui.favorite

import id.Ersad.livescore.data.db.entities.EventFavorite

interface ClickListener {
    fun onClickListener(eventFavorite: EventFavorite)
}