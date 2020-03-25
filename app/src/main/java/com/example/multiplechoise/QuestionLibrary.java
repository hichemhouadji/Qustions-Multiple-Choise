package com.example.multiplechoise;

public class QuestionLibrary {
    private String mQuestions [] = {
            "من هو اب الانبياء?",
            "ما المقصود بيوم الفرقان الذي ذكره الله تعالى في القرآن؟",
            "الغاز الذي يشكل حوالي 75 %من اجمالي كتلة الشمس هو",
            "الطائر الوحيد الذي يستطيع تمييز اللون الأزرق هو."

    };


    private String mChoices [][] = {
            {"ادم", "موسى", "عيسى"},
            {"غزوة بدر", "غزوة أحد", "فتح مكة"},
            {"النتروجين ", "الهيدروجين ", "الكالسيوم"},
            {"البومة ", "الغراب ", "الهدهد "}
    };



    private String mCorrectAnswers[] = {"ادم", "غزوة بدر", "الهيدروجين", "البومة"};




    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}

