package com.dex.engrisk.lesson

import com.google.firebase.firestore.FirebaseFirestore

object SeedIntermediateLessons {

    fun insertIntermediateLessons() {

        val db = FirebaseFirestore.getInstance()

        val lesson1 = hashMapOf(
            "title" to "Travel and Vacation",
            "level" to "Intermediate",
            "type" to "TRANSLATE_EN_VI",
            "order" to 1,
            "questions" to listOf(

                hashMapOf(
                    "en_sentence" to "I am planning a trip to Da Nang next summer.",
                    "vi_sentence" to "Tôi đang lên kế hoạch đi Đà Nẵng vào mùa hè tới."
                ),

                hashMapOf(
                    "en_sentence" to "The hotel is near the beach.",
                    "vi_sentence" to "Khách sạn ở gần bãi biển."
                ),

                hashMapOf(
                    "en_sentence" to "I booked my flight online.",
                    "vi_sentence" to "Tôi đã đặt vé máy bay trực tuyến."
                ),

                hashMapOf(
                    "en_sentence" to "Tourists enjoy visiting historical places.",
                    "vi_sentence" to "Khách du lịch thích tham quan các địa điểm lịch sử."
                ),

                hashMapOf(
                    "en_sentence" to "My passport expires next year.",
                    "vi_sentence" to "Hộ chiếu của tôi hết hạn vào năm sau."
                )
            )
        )

        db.collection("lessons")
            .document("intermediate_01")
            .set(lesson1)

        val lesson2 = hashMapOf(
            "title" to "Restaurant Conversation",
            "level" to "Intermediate",
            "type" to "LISTEN_FILL_BLANK",
            "order" to 2,
            "questions" to listOf(

                hashMapOf(
                    "full_sentence" to "May I take your order please",
                    "blank_word" to "order"
                ),

                hashMapOf(
                    "full_sentence" to "I would like a bowl of noodle soup",
                    "blank_word" to "noodle"
                ),

                hashMapOf(
                    "full_sentence" to "Could I have the bill please",
                    "blank_word" to "bill"
                ),

                hashMapOf(
                    "full_sentence" to "This restaurant serves delicious food",
                    "blank_word" to "delicious"
                ),

                hashMapOf(
                    "full_sentence" to "The dessert was amazing",
                    "blank_word" to "dessert"
                )
            )
        )

        db.collection("lessons")
            .document("intermediate_02")
            .set(lesson2)

        val lesson3 = hashMapOf(
            "title" to "Technology",
            "level" to "Intermediate",
            "type" to "LISTEN_CHOOSE_CORRECT",
            "order" to 3,
            "questions" to listOf(

                hashMapOf(
                    "en_sentence" to "I use a smartphone every day",
                    "correct_answer" to "smartphone",
                    "options" to listOf(
                        "laptop",
                        "tablet",
                        "television"
                    )
                ),

                hashMapOf(
                    "en_sentence" to "Artificial intelligence is changing the world",
                    "correct_answer" to "Artificial",
                    "options" to listOf(
                        "Beautiful",
                        "Interesting",
                        "Powerful"
                    )
                ),

                hashMapOf(
                    "en_sentence" to "The internet helps people communicate",
                    "correct_answer" to "internet",
                    "options" to listOf(
                        "radio",
                        "newspaper",
                        "television"
                    )
                )
            )
        )

        db.collection("lessons")
            .document("intermediate_03")
            .set(lesson3)
    }
}