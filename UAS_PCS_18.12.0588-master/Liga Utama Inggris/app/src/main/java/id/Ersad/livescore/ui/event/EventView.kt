package id.Ersad.livescore.ui.event

import id.Ersad.livescore.data.model.Event

interface EventView{
    fun showLoading()
    fun hideLoading()
    fun showEventList(data: List<Event>)
}