/**
 * Created by zhuyilin on 2016/11/7.
 */

class wordRotate {
    /**
     * I am a student -> student. a am I
     */
    fun initStudent() {
        val s = "I am a student."
        var a = ""
        val split = s.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        for (i in split.indices.reversed()) {
            val character = split[i] + " "
            a += character
        }
    }
}

