package com.dex.engrisk.lesson

import com.google.firebase.firestore.FirebaseFirestore

object SeedBeginnerLessons {

    fun insertBeginnerLessons() {

        val db = FirebaseFirestore.getInstance()

        // Bài 1: Chào hỏi
        val lesson1 = hashMapOf(
            "title" to "Chào hỏi",
            "level" to "Beginner",
            "type" to "TRANSLATE_VI_EN",
            "order" to 1,
            "questions" to listOf(
                hashMapOf(
                    "vi_sentence" to "Xin chào",
                    "en_sentence" to "Hello"
                ),
                hashMapOf(
                    "vi_sentence" to "Bạn khỏe không",
                    "en_sentence" to "How are you"
                ),
                hashMapOf(
                    "vi_sentence" to "Rất vui được gặp bạn",
                    "en_sentence" to "Nice to meet you"
                ),
                hashMapOf(
                    "vi_sentence" to "Chào buổi sáng",
                    "en_sentence" to "Good morning"
                ),
                hashMapOf(
                    "vi_sentence" to "Tạm biệt",
                    "en_sentence" to "Goodbye"
                )
            )
        )

        // Bài 2: Màu sắc
        val lesson2 = hashMapOf(
            "title" to "Màu sắc",
            "level" to "Beginner",
            "type" to "TRANSLATE_EN_VI",
            "order" to 2,
            "questions" to listOf(
                hashMapOf(
                    "en_sentence" to "Red",
                    "vi_sentence" to "Màu đỏ"
                ),
                hashMapOf(
                    "en_sentence" to "Blue",
                    "vi_sentence" to "Màu xanh dương"
                ),
                hashMapOf(
                    "en_sentence" to "Yellow",
                    "vi_sentence" to "Màu vàng"
                ),
                hashMapOf(
                    "en_sentence" to "Green",
                    "vi_sentence" to "Màu xanh lá"
                ),
                hashMapOf(
                    "en_sentence" to "Black",
                    "vi_sentence" to "Màu đen"
                )
            )
        )

        // Bài 3: Giới từ
        val lesson3 = hashMapOf(
            "title" to "Giới từ",
            "level" to "Beginner",
            "type" to "LISTEN_FILL_BLANK",
            "order" to 3,
            "questions" to listOf(
                hashMapOf(
                    "full_sentence" to "The book is on the table",
                    "blank_word" to "on"
                ),
                hashMapOf(
                    "full_sentence" to "The cat is under the chair",
                    "blank_word" to "under"
                ),
                hashMapOf(
                    "full_sentence" to "The school is near my house",
                    "blank_word" to "near"
                ),
                hashMapOf(
                    "full_sentence" to "The ball is behind the box",
                    "blank_word" to "behind"
                ),
                hashMapOf(
                    "full_sentence" to "The picture is above the desk",
                    "blank_word" to "above"
                )
            )
        )

        // Bài 4: Bạn bè
        val lesson4 = hashMapOf(
            "title" to "Bạn bè",
            "level" to "Beginner",
            "type" to "LISTEN_CHOOSE_CORRECT",
            "order" to 4,
            "questions" to listOf(
                hashMapOf(
                    "en_sentence" to "My best friend is very kind",
                    "correct_answer" to "friend",
                    "options" to listOf(
                        "teacher",
                        "student",
                        "brother"
                    )
                ),
                hashMapOf(
                    "en_sentence" to "We play football together",
                    "correct_answer" to "football",
                    "options" to listOf(
                        "basketball",
                        "tennis",
                        "badminton"
                    )
                ),
                hashMapOf(
                    "en_sentence" to "She always helps me",
                    "correct_answer" to "helps",
                    "options" to listOf(
                        "ignores",
                        "avoids",
                        "forgets"
                    )
                ),
                hashMapOf(
                    "en_sentence" to "Friends should be honest",
                    "correct_answer" to "honest",
                    "options" to listOf(
                        "lazy",
                        "angry",
                        "selfish"
                    )
                )
            )
        )

        db.collection("lessons").document("beginner_01").set(lesson1)
        db.collection("lessons").document("beginner_02").set(lesson2)
        db.collection("lessons").document("beginner_03").set(lesson3)
        db.collection("lessons").document("beginner_04").set(lesson4)
    }
}