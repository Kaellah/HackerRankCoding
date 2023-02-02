package ua.com.kaellah.codding.tasks.leetcode.easy

fun main() {
    println(isAnagram("anagram", "nagaram"))
}

fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) {
        return false
    }
    val s1 = stringToCharsMap(s)
    val t1 = stringToCharsMap(t)
    if (s1.size != t1.size) {
        return false
    }

    s1.keys.forEach { char ->
        if (s1[char] != t1[char]) {
            return false
        }
    }

    return true
}

private fun stringToCharsMap(s: String): Map<Char, Int> {
    val map = mutableMapOf<Char, Int>()
    s.toCharArray().forEach { char ->
        map[char] = (map[char] ?: 0) + 1
    }
    return map
}