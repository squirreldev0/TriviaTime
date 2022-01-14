package com.squirreldevolopment.triviatime

object Constants {

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "What country does this flag belong to?",
            "Argentina", "Austrialia",
            "Armenia", "Austria",
            1
        )
        questionsList.add(que1)

        val que2 = Question(
            1, "Yayyo?",
            "dsfhighkjd", "Asljghd",
            "fdsuis", "SHGULK",
            1
        )
        questionsList.add(que1)


        return questionsList


    }
}