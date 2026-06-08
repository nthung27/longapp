package com.dex.engrisk.lesson

import com.google.firebase.firestore.FirebaseFirestore

object SeedAdvancedLessons {

    fun insertAdvancedLessons() {

        val db = FirebaseFirestore.getInstance()

        // =========================
        // AI
        // =========================
        val aiLesson = hashMapOf(
            "title" to "Artificial Intelligence",
            "level" to "Advanced",
            "type" to "TRANSLATE_VI_EN",
            "order" to 1,
            "questions" to listOf(

                hashMapOf(
                    "vi_sentence" to "Trí tuệ nhân tạo đang thay đổi thế giới.",
                    "en_sentence" to "Artificial intelligence is changing the world."
                ),

                hashMapOf(
                    "vi_sentence" to "Máy học là một nhánh của AI.",
                    "en_sentence" to "Machine learning is a branch of AI."
                ),

                hashMapOf(
                    "vi_sentence" to "Nhiều công ty sử dụng AI để phân tích dữ liệu.",
                    "en_sentence" to "Many companies use AI to analyze data."
                ),

                hashMapOf(
                    "vi_sentence" to "AI có thể tự động hóa nhiều công việc.",
                    "en_sentence" to "AI can automate many tasks."
                ),

                hashMapOf(
                    "vi_sentence" to "Đạo đức AI là một chủ đề quan trọng.",
                    "en_sentence" to "AI ethics is an important topic."
                )
            )
        )

        // =========================
        // SPACE
        // =========================
        val spaceLesson = hashMapOf(
            "title" to "Space Exploration",
            "level" to "Advanced",
            "type" to "TRANSLATE_EN_VI",
            "order" to 2,
            "questions" to listOf(

                hashMapOf(
                    "en_sentence" to "Scientists are planning missions to Mars.",
                    "vi_sentence" to "Các nhà khoa học đang lên kế hoạch cho các sứ mệnh tới Sao Hỏa."
                ),

                hashMapOf(
                    "en_sentence" to "Space technology develops rapidly.",
                    "vi_sentence" to "Công nghệ vũ trụ phát triển nhanh chóng."
                ),

                hashMapOf(
                    "en_sentence" to "Astronauts spend months in space.",
                    "vi_sentence" to "Các phi hành gia ở ngoài không gian hàng tháng."
                ),

                hashMapOf(
                    "en_sentence" to "Satellites provide communication services.",
                    "vi_sentence" to "Vệ tinh cung cấp dịch vụ liên lạc."
                ),

                hashMapOf(
                    "en_sentence" to "Exploring the universe inspires innovation.",
                    "vi_sentence" to "Khám phá vũ trụ thúc đẩy đổi mới."
                )
            )
        )

        // =========================
        // CAREER
        // =========================
        val careerLesson = hashMapOf(
            "title" to "Career Development",
            "level" to "Advanced",
            "type" to "LISTEN_FILL_BLANK",
            "order" to 3,
            "questions" to listOf(

                hashMapOf(
                    "en_sentence" to "Continuous learning is essential for career growth",
                    "vi_meaning" to "Việc học tập liên tục là điều cần thiết cho sự phát triển nghề nghiệp.",
                    "blank_word" to "learning"
                ),

                hashMapOf(
                    "en_sentence" to "Leadership skills improve workplace performance",
                    "vi_meaning" to "Kỹ năng lãnh đạo giúp cải thiện hiệu suất làm việc.",
                    "blank_word" to "Leadership"
                ),

                hashMapOf(
                    "en_sentence" to "Networking creates professional opportunities",
                    "vi_meaning" to "Xây dựng các mối quan hệ tạo ra cơ hội nghề nghiệp.",
                    "blank_word" to "Networking"
                ),

                hashMapOf(
                    "en_sentence" to "Successful employees adapt to change",
                    "vi_meaning" to "Những nhân viên thành công biết thích nghi với sự thay đổi.",
                    "blank_word" to "adapt"
                ),

                hashMapOf(
                    "en_sentence" to "Time management increases productivity",
                    "vi_meaning" to "Quản lý thời gian giúp tăng năng suất làm việc.",
                    "blank_word" to "productivity"
                )
            )
        )

        // =========================
        // GLOBAL CHALLENGES
        // =========================
        val globalLesson = hashMapOf(
            "title" to "Global Challenges",
            "level" to "Advanced",
            "type" to "LISTEN_CHOOSE_CORRECT",
            "order" to 4,
            "questions" to listOf(

                hashMapOf(
                    "en_sentence" to "Climate change affects every country.",
                    "vi_meaning" to "Biến đổi khí hậu ảnh hưởng đến mọi quốc gia.",
                    "correct_answer" to "Climate change",
                    "options" to listOf(
                        "Climate change",
                        "Sports",
                        "Fashion",
                        "Movies"
                    )
                ),

                hashMapOf(
                    "en_sentence" to "Renewable energy reduces pollution.",
                    "vi_meaning" to "Năng lượng tái tạo giúp giảm ô nhiễm môi trường.",
                    "correct_answer" to "Renewable energy",
                    "options" to listOf(
                        "Renewable energy",
                        "Plastic waste",
                        "Coal smoke",
                        "Traffic jams"
                    )
                ),

                hashMapOf(
                    "en_sentence" to "Education improves quality of life.",
                    "vi_meaning" to "Giáo dục giúp nâng cao chất lượng cuộc sống.",
                    "correct_answer" to "Education",
                    "options" to listOf(
                        "Education",
                        "Entertainment",
                        "Advertising",
                        "Shopping"
                    )
                ),

                hashMapOf(
                    "en_sentence" to "Technology helps solve global problems.",
                    "vi_meaning" to "Công nghệ giúp giải quyết các vấn đề toàn cầu.",
                    "correct_answer" to "Technology",
                    "options" to listOf(
                        "Technology",
                        "Weather",
                        "Music",
                        "Games"
                    )
                ),

                hashMapOf(
                    "en_sentence" to "International cooperation is important.",
                    "vi_meaning" to "Hợp tác quốc tế là rất quan trọng.",
                    "correct_answer" to "cooperation",
                    "options" to listOf(
                        "cooperation",
                        "competition",
                        "conflict",
                        "isolation"
                    )
                )
            )
        )

        db.collection("lessons").document("advanced_01").set(aiLesson)
        db.collection("lessons").document("advanced_02").set(spaceLesson)
        db.collection("lessons").document("advanced_03").set(careerLesson)
        db.collection("lessons").document("advanced_04").set(globalLesson)
    }
}