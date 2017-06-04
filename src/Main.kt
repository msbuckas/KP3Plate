import processing.core.PApplet

/**
 * © spikes 03/06/2017
 */
fun main(args: Array<String>) {
    PApplet.main("Sketch", args)
}

class Sketch : PApplet() {

    lateinit var t: Thing //TODO diff between property and local variable for lateinit

    override fun settings() {
        size(800, 600)
    }

    override fun setup() {
        frameRate(10f)
        t = Thing(this)
    }

    override fun draw() {
        noStroke()
        fill(0f, 5f)
        rect(0f, 0f, width.toFloat(), height.toFloat())
        t.skit()
    }

}