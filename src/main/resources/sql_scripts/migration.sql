-- Create the Course table
CREATE TABLE Course (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    thumbnailUrl VARCHAR(255)
);

-- Create the Level table with a foreign key reference to the Course table
CREATE TABLE Level (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    points INT,
    course_id INT,
    FOREIGN KEY (course_id) REFERENCES Course(id) ON DELETE CASCADE
);

-- Create the Question table with a foreign key reference to the Level table
CREATE TABLE Question (
    id INT AUTO_INCREMENT PRIMARY KEY,
    question VARCHAR(255) NOT NULL,
    level_id INT,
    options JSON,
    question_no INT,
    answer INT,
    FOREIGN KEY (level_id) REFERENCES Level(id) ON DELETE CASCADE
);
