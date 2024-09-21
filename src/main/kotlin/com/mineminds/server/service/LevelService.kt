package com.mineminds.server.service

import org.springframework.stereotype.Service

data class LevelData(
    val courseId: Int,
    val levelId: Int,
    val title: String,
    val imageUrl: String,
    val content: String
)

@Service
class LevelService {

        // TODO need to connect with Database use springDataJpa
        fun getAllLevels(): List<LevelData> {
            // Simulating dummy course data
            return listOf(
                    LevelData(
                            courseId = 1,
                            levelId = 1,
                            imageUrl = "https://trioltenergy.com/wp-content/uploads/2024/09/images-2.jpeg",
                            title = "Algebra Basics",
                            content = """
        **Algebra Basics**

        Algebra is a branch of mathematics dealing with symbols and the rules for manipulating these symbols. In elementary algebra, these symbols (often represented by letters) represent numbers and are used to express general mathematical relationships. Algebra is widely used because it provides a systematic way to solve equations and understand the relationships between variables.

        ### Key Concepts:

        1. **Variables**: Symbols, usually letters like x, y, or z, that represent unknown values.
        2. **Constants**: Fixed values that do not change, such as numbers like 3, -5, or 1/2.
        3. **Expressions**: Combinations of variables, constants, and operations (such as addition and multiplication).
        4. **Equations**: Statements that two expressions are equal, often used to find the value of a variable.

        ### Example:
        
        The equation of a straight line is often expressed as:
        
        \[
        y = mx + c
        \]

        where:
        - \( m \) is the slope of the line.
        - \( c \) is the y-intercept, where the line crosses the y-axis.

        Algebra plays a critical role in various real-life situations, such as financial modeling, engineering, and computer algorithms, making it a fundamental skill in mathematics and many applied sciences.
    """
                    ),
                    LevelData(
                            courseId = 1,
                            levelId = 2,
                            imageUrl = "https://arxiv.org/pdf/2204.00901.pdf",
                            title = "Linear Equations",
                            content = """
        **Linear Equations**

        A linear equation is an equation in which the highest power of the variable is one. Linear equations are called "linear" because they graph as straight lines when plotted on a coordinate plane. They are among the simplest and most widely used mathematical models.

        ### Forms of Linear Equations:

        1. **Standard Form**: 
           \[
           ax + by = c
           \]
           where \( a \), \( b \), and \( c \) are constants.
        
        2. **Slope-Intercept Form**:
           \[
           y = mx + c
           \]
           where \( m \) is the slope of the line, and \( c \) is the y-intercept.
        
        3. **Point-Slope Form**:
           \[
           y - y_1 = m(x - x_1)
           \]
           where \( (x_1, y_1) \) is a point on the line and \( m \) is the slope.

        ### Applications:

        - **Physics**: Used to describe uniform motion.
        - **Economics**: Used in cost and revenue functions.
        - **Statistics**: Helps in modeling relationships between variables.

        Solving linear equations is fundamental in mathematics, providing the basis for more complex topics such as linear algebra and calculus. They are used in algorithms, predictive modeling, and optimization problems.
    """
                    ),
                    LevelData(
                            courseId = 1,
                            levelId = 3,
                            imageUrl = "https://trioltenergy.com/wp-content/uploads/2024/09/images.png",
                            title = "Geometry",
                            content = """
        **Geometry**

        Geometry is a branch of mathematics concerned with the properties, measurement, and relationships of points, lines, angles, surfaces, and solids. It provides tools to model and analyze the spatial properties of objects and is foundational in fields such as architecture, engineering, and art.

        ### Key Concepts:

        1. **Points and Lines**: The most basic elements of geometry; a point has no dimension, while a line extends infinitely in both directions.
        2. **Angles**: Formed by two intersecting lines, measured in degrees or radians.
        3. **Shapes and Polygons**: Closed figures such as triangles, squares, and circles.
        4. **Solids**: Three-dimensional objects like cubes, spheres, and cylinders.

        ### Formulas:

        1. **Area of a Circle**:

           \[
           A = \pi r^2
           \]

           where \( r \) is the radius of the circle.

        2. **Pythagorean Theorem**: In a right triangle:

           \[
           c^2 = a^2 + b^2
           \]

           where \( c \) is the hypotenuse, and \( a \) and \( b \) are the other two sides.

        3. **Volume of a Sphere**:

           \[
           V = \frac{4}{3} \pi r^3
           \]

        ### Applications:

        - **Architecture**: Designing buildings and structures.
        - **Engineering**: Analyzing forces and designing mechanical components.
        - **Computer Graphics**: Modeling 3D objects and environments.

        Geometry helps us understand and manipulate the spatial dimensions of objects, making it a crucial tool in both theoretical and applied sciences.
    """
                    ),
                    LevelData(
                            courseId = 1,
                            levelId = 4,
                            imageUrl = "https://trioltenergy.com/wp-content/uploads/2024/09/images.png",
                            title = "Statistics",
                            content = """
        **Statistics**

        Statistics is a branch of mathematics that deals with the collection, analysis, interpretation, presentation, and organization of data. It is essential for making informed decisions based on empirical data and is used in virtually every field, from economics to biology.

        ### Key Concepts:

        1. **Descriptive Statistics**: Summarizes data using measures such as mean, median, mode, and standard deviation.
        2. **Inferential Statistics**: Draws conclusions from data samples about a population, often using hypothesis testing and confidence intervals.
        3. **Probability Distributions**: Describes how the values of a random variable are distributed (e.g., Normal, Binomial, Poisson distributions).
        4. **Regression Analysis**: Explores the relationship between variables and is used for predictive modeling.

        ### Key Formulas:

        1. **Mean (Average)**:

           \[
           \bar{x} = \frac{\sum_{i=1}^{n} x_i}{n}
           \]

           where \( x_i \) are the observed values, and \( n \) is the number of observations.

        2. **Standard Deviation**:

           \[
           \sigma = \sqrt{\frac{\sum_{i=1}^{n} (x_i - \bar{x})^2}{n}}
           \]

        3. **Correlation Coefficient**:

           \[
           r = \frac{\sum (x - \bar{x})(y - \bar{y})}{\sqrt{\sum (x - \bar{x})^2 \sum (y - \bar{y})^2}}
           \]

        ### Applications:

        - **Healthcare**: Analyzing patient data and clinical trials.
        - **Business**: Market research and consumer behavior analysis.
        - **Government**: Census data and public policy analysis.

        Statistics provides the tools needed to understand data and make decisions based on quantitative evidence, making it invaluable in research, industry, and daily life.
    """
                    ),
                    LevelData(
                            courseId = 1,
                            levelId = 5,
                            imageUrl = "https://trioltenergy.com/wp-content/uploads/2024/09/images.png",
                            title = "Probability",
                            content = """
        **Probability**

        Probability is a branch of mathematics that deals with the likelihood of different outcomes in uncertain situations. It quantifies the uncertainty of events and helps predict future events based on historical data. Probability theory forms the basis for statistics, gambling, decision-making, and many fields in science and engineering.

        ### Key Concepts:

        1. **Experiment**: A process that leads to one of several possible outcomes.
        2. **Sample Space (S)**: The set of all possible outcomes of an experiment.
        3. **Event (E)**: A subset of the sample space; a specific outcome or set of outcomes.
        4. **Probability of an Event (P(E))**: A measure of the likelihood that an event will occur, given by:

           \[
           P(E) = \frac{\text{Number of favorable outcomes}}{\text{Total number of outcomes}}
           \]

        ### Example:

        If you roll a fair six-sided die, the probability of rolling a 4 is:

        \[
        P(4) = \frac{1}{6}
        \]

        ### Key Formulas:

        1. **Addition Rule**: For any two events \( A \) and \( B \):

           \[
           P(A \cup B) = P(A) + P(B) - P(A \cap B)
           \]

        2. **Multiplication Rule**: For independent events \( A \) and \( B \):

           \[
           P(A \cap B) = P(A) \times P(B)
           \]

        3. **Conditional Probability**: The probability of event \( A \) given that event \( B \) has occurred:

           \[
           P(A | B) = \frac{P(A \cap B)}{P(B)}
           \]

        ### Applications:

        - **Statistics**: Used to interpret survey results and experimental data.
        - **Machine Learning**: To build predictive models.
        - **Finance**: In risk assessment and decision-making.

        Probability helps us understand randomness, make predictions, and make informed decisions in everyday life and professional fields.
    """
                    )

            )
        }

    fun getLevel(levelId:Int): LevelData {
        // Simulating dummy course data
        return getAllLevels().find { it.levelId == levelId }!!
    }
}