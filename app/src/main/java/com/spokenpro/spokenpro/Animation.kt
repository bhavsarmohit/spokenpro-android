package com.spokenpro.spokenpro

internal class Animation {
    val animator: Thread
    fun startAnimation() {
        animator.start()
    }

    @Throws(InterruptedException::class)
    fun awaitCompletion() {
        animator.join()
    }

    init {
        animator = Thread(object : Runnable {
            override fun run() {
                TODO("Not yet implemented")
            } // logic to make animation happen
        })
    }
}