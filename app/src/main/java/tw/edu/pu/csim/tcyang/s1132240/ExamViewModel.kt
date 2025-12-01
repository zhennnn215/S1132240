package tw.edu.pu.csim.tcyang.s1132240

import android.app.Activity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.window.layout.WindowMetricsCalculator
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ExamViewModel : ViewModel() {
    private val _screenWidthPx = MutableStateFlow(0f)
    val screenWidthPx: StateFlow<Float> = _screenWidthPx

    private val _screenHeightPx = MutableStateFlow(0f)
    val screenHeightPx: StateFlow<Float> = _screenHeightPx

    fun initScreenSize(activity: Activity) {
        viewModelScope.launch {
            val metrics = WindowMetricsCalculator.getOrCreate()
                .computeCurrentWindowMetrics(activity)
            _screenWidthPx.value = metrics.bounds.width().toFloat()
            _screenHeightPx.value = metrics.bounds.height().toFloat()
        }
    }
}