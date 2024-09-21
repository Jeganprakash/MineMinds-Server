import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class QuizController(private val quizService: QuizService) {

    @GetMapping("/quiz/{levelId}")
    fun getQuiz(@PathVariable levelId: Int): Quiz {
        return quizService.getQuizByLevelId(levelId)
    }

    @PostMapping("/quiz/{levelId}/submit")
    fun submitQuiz(@PathVariable levelId: Int, @RequestBody userAnswers: List<Int>): QuizResult {
        val quiz = quizService.getQuizByLevelId(levelId)
        val correctAnswers = quiz.questions.map { it.correctAnswer }
        val score = correctAnswers.zip(userAnswers).count { it.first == it.second }
        return QuizResult(levelId, score, quiz.questions.size)
    }
}
