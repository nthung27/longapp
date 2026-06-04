package com.dex.engrisk.vocabulary

import com.google.firebase.firestore.FirebaseFirestore

object SeedVocabularyData {

    fun insertVocabulary() {

        val db = FirebaseFirestore.getInstance()

        val words = listOf(

            // =======================
            // ANIMALS
            // =======================

            hashMapOf(
                "word" to "Cat",
                "type" to "Noun",
                "pronunciation" to "/kæt/",
                "definition" to "Con mèo",
                "example" to "The cat is sleeping.",
                "imageUrl" to "https://cdn.pixabay.com/photo/2017/11/09/21/41/cat-2934720_1280.jpg",
                "topic" to "Animals"
            ),

            hashMapOf(
                "word" to "Dog",
                "type" to "Noun",
                "pronunciation" to "/dɒg/",
                "definition" to "Con chó",
                "example" to "The dog is barking.",
                "imageUrl" to "https://cdn.pixabay.com/photo/2016/02/19/10/00/dog-1207816_1280.jpg",
                "topic" to "Animals"
            ),

            hashMapOf(
                "word" to "Lion",
                "type" to "Noun",
                "pronunciation" to "/ˈlaɪən/",
                "definition" to "Sư tử",
                "example" to "The lion is strong.",
                "imageUrl" to "https://cdn.pixabay.com/photo/2017/01/18/13/13/lion-1990624_1280.jpg",
                "topic" to "Animals"
            ),

            hashMapOf(
                "word" to "Tiger",
                "type" to "Noun",
                "pronunciation" to "/ˈtaɪɡər/",
                "definition" to "Hổ",
                "example" to "The tiger runs fast.",
                "imageUrl" to "",
                "topic" to "Animals"
            ),

            hashMapOf(
                "word" to "Elephant",
                "type" to "Noun",
                "pronunciation" to "/ˈelɪfənt/",
                "definition" to "Voi",
                "example" to "The elephant is huge.",
                "imageUrl" to "",
                "topic" to "Animals"
            ),

            hashMapOf(
                "word" to "Monkey",
                "type" to "Noun",
                "pronunciation" to "/ˈmʌŋki/",
                "definition" to "Khỉ",
                "example" to "The monkey climbs trees.",
                "imageUrl" to "",
                "topic" to "Animals"
            ),

            hashMapOf(
                "word" to "Rabbit",
                "type" to "Noun",
                "pronunciation" to "/ˈræbɪt/",
                "definition" to "Thỏ",
                "example" to "The rabbit is cute.",
                "imageUrl" to "",
                "topic" to "Animals"
            ),

            hashMapOf(
                "word" to "Bear",
                "type" to "Noun",
                "pronunciation" to "/beər/",
                "definition" to "Gấu",
                "example" to "The bear is sleeping.",
                "imageUrl" to "",
                "topic" to "Animals"
            ),

            hashMapOf(
                "word" to "Horse",
                "type" to "Noun",
                "pronunciation" to "/hɔːrs/",
                "definition" to "Ngựa",
                "example" to "The horse runs quickly.",
                "imageUrl" to "",
                "topic" to "Animals"
            ),

            hashMapOf(
                "word" to "Bird",
                "type" to "Noun",
                "pronunciation" to "/bɜːrd/",
                "definition" to "Chim",
                "example" to "The bird can fly.",
                "imageUrl" to "",
                "topic" to "Animals"
            ),

            // =======================
            // FRUITS
            // =======================

            hashMapOf(
                "word" to "Apple",
                "type" to "Noun",
                "pronunciation" to "/ˈæpl/",
                "definition" to "Táo",
                "example" to "I eat an apple every day.",
                "imageUrl" to "",
                "topic" to "Fruits"
            ),

            hashMapOf(
                "word" to "Banana",
                "type" to "Noun",
                "pronunciation" to "/bəˈnɑːnə/",
                "definition" to "Chuối",
                "example" to "The banana is yellow.",
                "imageUrl" to "",
                "topic" to "Fruits"
            ),

            hashMapOf(
                "word" to "Orange",
                "type" to "Noun",
                "pronunciation" to "/ˈɒrɪndʒ/",
                "definition" to "Cam",
                "example" to "Orange juice is delicious.",
                "imageUrl" to "",
                "topic" to "Fruits"
            ),

            hashMapOf(
                "word" to "Mango",
                "type" to "Noun",
                "pronunciation" to "/ˈmæŋɡəʊ/",
                "definition" to "Xoài",
                "example" to "I like ripe mangoes.",
                "imageUrl" to "",
                "topic" to "Fruits"
            ),

            hashMapOf(
                "word" to "Grape",
                "type" to "Noun",
                "pronunciation" to "/ɡreɪp/",
                "definition" to "Nho",
                "example" to "Grapes are sweet.",
                "imageUrl" to "",
                "topic" to "Fruits"
            ),

            hashMapOf(
                "word" to "Watermelon",
                "type" to "Noun",
                "pronunciation" to "/ˈwɔːtəmelən/",
                "definition" to "Dưa hấu",
                "example" to "Watermelon is refreshing.",
                "imageUrl" to "",
                "topic" to "Fruits"
            ),

            hashMapOf(
                "word" to "Pineapple",
                "type" to "Noun",
                "pronunciation" to "/ˈpaɪnæpl/",
                "definition" to "Dứa",
                "example" to "Pineapple tastes sweet.",
                "imageUrl" to "",
                "topic" to "Fruits"
            ),

            hashMapOf(
                "word" to "Pear",
                "type" to "Noun",
                "pronunciation" to "/peər/",
                "definition" to "Lê",
                "example" to "This pear is juicy.",
                "imageUrl" to "",
                "topic" to "Fruits"
            ),

            hashMapOf(
                "word" to "Peach",
                "type" to "Noun",
                "pronunciation" to "/piːtʃ/",
                "definition" to "Đào",
                "example" to "The peach is soft.",
                "imageUrl" to "",
                "topic" to "Fruits"
            ),

            hashMapOf(
                "word" to "Strawberry",
                "type" to "Noun",
                "pronunciation" to "/ˈstrɔːbəri/",
                "definition" to "Dâu tây",
                "example" to "Strawberries are red.",
                "imageUrl" to "",
                "topic" to "Fruits"
            ),

            // =======================
            // HOME
            // =======================

            hashMapOf("word" to "Table","type" to "Noun","pronunciation" to "/ˈteɪbl/","definition" to "Bàn","example" to "The book is on the table.","imageUrl" to "","topic" to "Home"),
            hashMapOf("word" to "Chair","type" to "Noun","pronunciation" to "/tʃeər/","definition" to "Ghế","example" to "Sit on the chair.","imageUrl" to "","topic" to "Home"),
            hashMapOf("word" to "Bed","type" to "Noun","pronunciation" to "/bed/","definition" to "Giường","example" to "The bed is comfortable.","imageUrl" to "","topic" to "Home"),
            hashMapOf("word" to "Sofa","type" to "Noun","pronunciation" to "/ˈsəʊfə/","definition" to "Ghế sofa","example" to "The sofa is new.","imageUrl" to "","topic" to "Home"),
            hashMapOf("word" to "Lamp","type" to "Noun","pronunciation" to "/læmp/","definition" to "Đèn","example" to "Turn on the lamp.","imageUrl" to "","topic" to "Home"),
            hashMapOf("word" to "Television","type" to "Noun","pronunciation" to "/ˈtelɪvɪʒn/","definition" to "Tivi","example" to "I watch television.","imageUrl" to "","topic" to "Home"),
            hashMapOf("word" to "Door","type" to "Noun","pronunciation" to "/dɔːr/","definition" to "Cửa","example" to "Close the door.","imageUrl" to "","topic" to "Home"),
            hashMapOf("word" to "Window","type" to "Noun","pronunciation" to "/ˈwɪndəʊ/","definition" to "Cửa sổ","example" to "Open the window.","imageUrl" to "","topic" to "Home"),
            hashMapOf("word" to "Kitchen","type" to "Noun","pronunciation" to "/ˈkɪtʃɪn/","definition" to "Nhà bếp","example" to "She is in the kitchen.","imageUrl" to "","topic" to "Home"),
            hashMapOf("word" to "Refrigerator","type" to "Noun","pronunciation" to "/rɪˈfrɪdʒəreɪtə(r)/","definition" to "Tủ lạnh","example" to "The milk is in the refrigerator.","imageUrl" to "","topic" to "Home"),

            // =======================
            // CHARACTER
            // =======================

            hashMapOf("word" to "Kind","type" to "Adjective","pronunciation" to "/kaɪnd/","definition" to "Tốt bụng","example" to "She is very kind.","imageUrl" to "","topic" to "Character"),
            hashMapOf("word" to "Friendly","type" to "Adjective","pronunciation" to "/ˈfrendli/","definition" to "Thân thiện","example" to "He is friendly.","imageUrl" to "","topic" to "Character"),
            hashMapOf("word" to "Honest","type" to "Adjective","pronunciation" to "/ˈɒnɪst/","definition" to "Trung thực","example" to "She is honest.","imageUrl" to "","topic" to "Character"),
            hashMapOf("word" to "Brave","type" to "Adjective","pronunciation" to "/breɪv/","definition" to "Dũng cảm","example" to "The firefighter is brave.","imageUrl" to "","topic" to "Character"),
            hashMapOf("word" to "Lazy","type" to "Adjective","pronunciation" to "/ˈleɪzi/","definition" to "Lười biếng","example" to "Don't be lazy.","imageUrl" to "","topic" to "Character"),
            hashMapOf("word" to "Polite","type" to "Adjective","pronunciation" to "/pəˈlaɪt/","definition" to "Lịch sự","example" to "The student is polite.","imageUrl" to "","topic" to "Character"),
            hashMapOf("word" to "Creative","type" to "Adjective","pronunciation" to "/kriˈeɪtɪv/","definition" to "Sáng tạo","example" to "She is creative.","imageUrl" to "","topic" to "Character"),
            hashMapOf("word" to "Smart","type" to "Adjective","pronunciation" to "/smɑːt/","definition" to "Thông minh","example" to "He is smart.","imageUrl" to "","topic" to "Character"),
            hashMapOf("word" to "Patient","type" to "Adjective","pronunciation" to "/ˈpeɪʃnt/","definition" to "Kiên nhẫn","example" to "Be patient.","imageUrl" to "","topic" to "Character"),
            hashMapOf("word" to "Hard-working","type" to "Adjective","pronunciation" to "/ˌhɑːd ˈwɜːkɪŋ/","definition" to "Chăm chỉ","example" to "She is hard-working.","imageUrl" to "","topic" to "Character"),

            // =======================
            // TECHNOLOGY
            // =======================

            hashMapOf("word" to "Computer","type" to "Noun","pronunciation" to "/kəmˈpjuːtə(r)/","definition" to "Máy tính","example" to "I use a computer every day.","imageUrl" to "","topic" to "Technology"),
            hashMapOf("word" to "Laptop","type" to "Noun","pronunciation" to "/ˈlæptɒp/","definition" to "Máy tính xách tay","example" to "This laptop is fast.","imageUrl" to "","topic" to "Technology"),
            hashMapOf("word" to "Keyboard","type" to "Noun","pronunciation" to "/ˈkiːbɔːd/","definition" to "Bàn phím","example" to "The keyboard is black.","imageUrl" to "","topic" to "Technology"),
            hashMapOf("word" to "Mouse","type" to "Noun","pronunciation" to "/maʊs/","definition" to "Chuột máy tính","example" to "Click the mouse.","imageUrl" to "","topic" to "Technology"),
            hashMapOf("word" to "Monitor","type" to "Noun","pronunciation" to "/ˈmɒnɪtə(r)/","definition" to "Màn hình","example" to "The monitor is large.","imageUrl" to "","topic" to "Technology"),
            hashMapOf("word" to "Printer","type" to "Noun","pronunciation" to "/ˈprɪntə(r)/","definition" to "Máy in","example" to "Print the document.","imageUrl" to "","topic" to "Technology"),
            hashMapOf("word" to "Internet","type" to "Noun","pronunciation" to "/ˈɪntənet/","definition" to "Internet","example" to "The internet is useful.","imageUrl" to "","topic" to "Technology"),
            hashMapOf("word" to "Website","type" to "Noun","pronunciation" to "/ˈwebsaɪt/","definition" to "Trang web","example" to "Visit the website.","imageUrl" to "","topic" to "Technology"),
            hashMapOf("word" to "Robot","type" to "Noun","pronunciation" to "/ˈrəʊbɒt/","definition" to "Robot","example" to "The robot can move.","imageUrl" to "","topic" to "Technology"),
            hashMapOf("word" to "Smartphone","type" to "Noun","pronunciation" to "/ˈsmɑːtfəʊn/","definition" to "Điện thoại thông minh","example" to "My smartphone is new.","imageUrl" to "","topic" to "Technology")
        )

        words.forEachIndexed { index, word ->
            db.collection("vocabulary")
                .document("word_${index + 1}")
                .set(word)
        }
    }
}