package com.vishnevskiypro.gestutelesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import androidx.core.view.GestureDetectorCompat
import com.vishnevskiypro.gestutelesson.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    private lateinit var binding: ActivityMainBinding
    private lateinit var gd: GestureDetector

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        gd = GestureDetector(this, this)
        gd.setOnDoubleTapListener(this)

    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        gd.onTouchEvent(event)
        return super.onTouchEvent(event)
    }

    /**
     * Notified when a tap occurs with the down [MotionEvent]
     * that triggered it. This will be triggered immediately for
     * every down event. All other events should be preceded by this.
     *
     * @param e The down motion event.
     */
    override fun onDown(e: MotionEvent?): Boolean {
        return true
    }


    override fun onShowPress(e: MotionEvent?) {

    }


    override fun onSingleTapUp(e: MotionEvent?): Boolean {
        TODO("Not yet implemented")
    }

    /**
     * Notified when a scroll occurs with the initial on down [MotionEvent] and the
     * current move [MotionEvent]. The distance in x and y is also supplied for
     * convenience.
     *
     * @param e1 The first down motion event that started the scrolling.
     * @param e2 The move motion event that triggered the current onScroll.
     * @param distanceX The distance along the X axis that has been scrolled since the last
     * call to onScroll. This is NOT the distance between `e1`
     * and `e2`.
     * @param distanceY The distance along the Y axis that has been scrolled since the last
     * call to onScroll. This is NOT the distance between `e1`
     * and `e2`.
     * @return true if the event is consumed, else false
     */
    override fun onScroll(
        e1: MotionEvent?,
        e2: MotionEvent?,
        distanceX: Float,
        distanceY: Float,
    ): Boolean {
        TODO("Not yet implemented")
    }

    /**
     * Notified when a long press occurs with the initial on down [MotionEvent]
     * that trigged it.
     *
     * @param e The initial on down motion event that started the longpress.
     */
    override fun onLongPress(e: MotionEvent?) {
        binding.txt.text = "onLongPress ${e.toString()}"
    }

    /**
     * Notified of a fling event when it occurs with the initial on down [MotionEvent]
     * and the matching up [MotionEvent]. The calculated velocity is supplied along
     * the x and y axis in pixels per second.
     *
     * @param e1 The first down motion event that started the fling.
     * @param e2 The move motion event that triggered the current onFling.
     * @param velocityX The velocity of this fling measured in pixels per second
     * along the x axis.
     * @param velocityY The velocity of this fling measured in pixels per second
     * along the y axis.
     * @return true if the event is consumed, else false
     */
    override fun onFling(
        e1: MotionEvent?,
        e2: MotionEvent?,
        velocityX: Float,
        velocityY: Float,
    ): Boolean {
        TODO("Not yet implemented")
    }

    /**
     * Notified when a single-tap occurs.
     *
     *
     * Unlike [OnGestureListener.onSingleTapUp], this
     * will only be called after the detector is confident that the user's
     * first tap is not followed by a second tap leading to a double-tap
     * gesture.
     *
     * @param e The down motion event of the single-tap.
     * @return true if the event is consumed, else false
     */
    override fun onSingleTapConfirmed(e: MotionEvent?): Boolean {
        TODO("Not yet implemented")
    }

    /**
     * Notified when a double-tap occurs. Triggered on the down event of second tap.
     *
     * @param e The down motion event of the first tap of the double-tap.
     * @return true if the event is consumed, else false
     */
    override fun onDoubleTap(e: MotionEvent?): Boolean {
        TODO("Not yet implemented")
    }

    /**
     * Notified when an event within a double-tap gesture occurs, including
     * the down, move, and up events.
     *
     * @param e The motion event that occurred during the double-tap gesture.
     * @return true if the event is consumed, else false
     */
    override fun onDoubleTapEvent(e: MotionEvent?): Boolean {
        TODO("Not yet implemented")
    }
}