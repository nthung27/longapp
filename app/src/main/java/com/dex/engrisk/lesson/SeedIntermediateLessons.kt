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
                    "blank_word" to "order",
                    "vi_meaning" to "Tôi có thể nhận món bạn gọi được không?"
                ),

                hashMapOf(
                    "full_sentence" to "I would like a bowl of noodle soup",
                    "blank_word" to "noodle",
                    "vi_meaning" to "Tôi muốn một bát súp mì."
                ),

                hashMapOf(
                    "full_sentence" to "Could I have the bill please",
                    "blank_word" to "bill",
                    "vi_meaning" to "Cho tôi xin hóa đơn được không?"
                ),

                hashMapOf(
                    "full_sentence" to "This restaurant serves delicious food",
                    "blank_word" to "delicious",
                    "vi_meaning" to "Nhà hàng này phục vụ đồ ăn rất ngon."
                ),

                hashMapOf(
                    "full_sentence" to "The dessert was amazing",
                    "blank_word" to "dessert",
                    "vi_meaning" to "Món tráng miệng thật tuyệt vời."
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
                    "vi_meaning" to "Tôi sử dụng điện thoại thông minh mỗi ngày.",
                    "correct_answer" to "smartphone",
                    "options" to listOf(
                        "laptop",
                        "tablet",
                        "television"
                    )
                ),

                hashMapOf(
                    "en_sentence" to "Artificial intelligence is changing the world",
                    "vi_meaning" to "Trí tuệ nhân tạo đang thay đổi thế giới.",
                    "correct_answer" to "Artificial",
                    "options" to listOf(
                        "Beautiful",
                        "Interesting",
                        "Powerful"
                    )
                ),

                hashMapOf(
                    "en_sentence" to "The internet helps people communicate",
                    "vi_meaning" to "Internet giúp mọi người giao tiếp với nhau.",
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

        val lesson4 = hashMapOf(
            "title" to "Health and Fitness",
            "level" to "Intermediate",
            "type" to "LISTEN_FILL_BLANK",
            "order" to 4,
            "questions" to listOf(

                hashMapOf(
                    "full_sentence" to "Regular exercise improves physical health",
                    "blank_word" to "exercise",
                    "vi_meaning" to "Tập thể dục thường xuyên cải thiện sức khỏe thể chất."
                ),

                hashMapOf(
                    "full_sentence" to "A balanced diet is important",
                    "blank_word" to "diet",
                    "vi_meaning" to "Một chế độ ăn cân bằng rất quan trọng."
                ),

                hashMapOf(
                    "full_sentence" to "Drinking water keeps the body hydrated",
                    "blank_word" to "hydrated",
                    "vi_meaning" to "Uống nước giúp cơ thể đủ nước."
                ),

                hashMapOf(
                    "full_sentence" to "Sleeping well increases energy",
                    "blank_word" to "energy",
                    "vi_meaning" to "Ngủ đủ giấc giúp tăng năng lượng."
                ),

                hashMapOf(
                    "full_sentence" to "Stress can affect mental health",
                    "blank_word" to "mental",
                    "vi_meaning" to "Căng thẳng có thể ảnh hưởng đến sức khỏe tinh thần."
                )
            )
        )
        db.collection("lessons")
            .document("intermediate_04")
            .set(lesson4)

        val lesson5 = hashMapOf(
            "title" to "Environment Protection",
            "level" to "Intermediate",
            "type" to "LISTEN_CHOOSE_CORRECT",
            "order" to 5,
            "questions" to listOf(

                hashMapOf(
                    "en_sentence" to "Recycling helps reduce waste",
                    "vi_meaning" to "Tái chế giúp giảm lượng rác thải.",
                    "correct_answer" to "Recycling",
                    "options" to listOf(
                        "Driving",
                        "Shopping",
                        "Cooking"
                    )
                ),

                hashMapOf(
                    "en_sentence" to "Trees absorb carbon dioxide",
                    "vi_meaning" to "Cây xanh hấp thụ khí carbon dioxide.",
                    "correct_answer" to "Trees",
                    "options" to listOf(
                        "Cars",
                        "Factories",
                        "Buildings"
                    )
                ),

                hashMapOf(
                    "en_sentence" to "Saving energy protects the environment",
                    "vi_meaning" to "Tiết kiệm năng lượng giúp bảo vệ môi trường.",
                    "correct_answer" to "energy",
                    "options" to listOf(
                        "money",
                        "water",
                        "food"
                    )
                ),

                hashMapOf(
                    "en_sentence" to "Plastic pollution harms marine life",
                    "vi_meaning" to "Ô nhiễm nhựa gây hại cho sinh vật biển.",
                    "correct_answer" to "pollution",
                    "options" to listOf(
                        "education",
                        "tourism",
                        "technology"
                    )
                )
            )
        )
        db.collection("lessons")
            .document("intermediate_05")
            .set(lesson5)
    }
}