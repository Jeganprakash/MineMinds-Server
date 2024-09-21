import org.springframework.stereotype.Service

data class Question(
        val questionId: Int,
        val question: String,
        val options: List<String>,
        val correctAnswer: Int // index of the correct answer in the options list
)

data class Quiz(
        val levelId: Int,
        val questions: List<Question>
)

data class QuizResult(
        val levelId: Int,
        val score: Int,
        val totalQuestions: Int
)


@Service
class QuizService {

    private val quizzes = listOf(
            Quiz(
                    levelId = 1,
                    questions = listOf(
                            Question(
                                    questionId = 1,
                                    question = "What is the value of x in the equation 2x + 3 = 7?",
                                    options = listOf("x = 1", "x = 2", "x = 3", "x = 4"),
                                    correctAnswer = 1 // x = 2
                            ),
                            Question(
                                    questionId = 2,
                                    question = "What is the slope of the line y = 3x + 2?",
                                    options = listOf("1", "2", "3", "4"),
                                    correctAnswer = 2 // Slope is 3
                            )
                    )
            ),
            Quiz(
                    levelId = 2,
                    questions = listOf(
                            Question(
                                    questionId = 3,
                                    question = "Solve the equation 3x - 5 = 10. What is x?",
                                    options = listOf("3", "4", "5", "6"),
                                    correctAnswer = 3 // x = 5
                            ),
                            Question(
                                    questionId = 4,
                                    question = "What is the y-intercept in the equation y = 4x + 1?",
                                    options = listOf("0", "1", "2", "3"),
                                    correctAnswer = 1 // y-intercept is 1
                            )
                    )
            ),
            Quiz(
                    levelId = 3,
                    questions = listOf(
                            Question(
                                    questionId = 5,
                                    question = "What is the area of a circle with radius 3?",
                                    options = listOf("9π", "6π", "3π", "π"),
                                    correctAnswer = 0 // 9π
                            ),
                            Question(
                                    questionId = 6,
                                    question = "What is the Pythagorean theorem?",
                                    options = listOf(
                                            "a² + b² = c²",
                                            "a² - b² = c²",
                                            "a + b = c",
                                            "None of the above"
                                    ),
                                    correctAnswer = 0 // a² + b² = c²
                            )
                    )
            )
    )

    // Get quiz by level ID
    fun getQuizByLevelId(levelId: Int): Quiz {
        return quizzes.firstOrNull { it.levelId == levelId }
                ?: throw IllegalArgumentException("Quiz not found for level $levelId")
    }
}
