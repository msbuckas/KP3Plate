import processing.core.PApplet
import processing.core.PConstants

/**
 * © spikes 04/06/2017
 */
class Thing(parent: PApplet) {
    val p = parent
    var x = 0f //TODO diff between property and local variable for lateinit
    var y = 0f
    var tx = p.random(100f)
    var ty = p.random(1000f, 1100f)

    fun move() {
        x = PApplet.map(p.noise(tx), 0f, 1f, 0f, p.width.toFloat())
        y = PApplet.map(p.noise(ty), 0f, 1f, 0f, p.height.toFloat())
        tx += 0.101f
        ty += 0.1004f
    }

    fun skit() {
        move()
        p.fill(p.random(255f), p.random(255f), p.random(255f))
        p.ellipse(x, y, p.random(20f,120f), p.random(20f,120f))
    }

}