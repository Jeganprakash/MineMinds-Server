# Combined Learning Platform Backend API

This document outlines the API endpoints, data models, and workflows for the Combined Learning Platform targeting kids and quick learners.

## **API Structure and Endpoints**

### **1. User Management APIs**

- **`POST /api/register`**  
  Register a new user with details like name, email, age, and password.

- **`POST /api/login`**  
  Authenticate the user and return a JWT token for further requests.

- **`GET /api/profile`**  
  Fetch the user's profile, including points, streaks, achievements, and completed levels.

- **`PUT /api/profile/update`**  
  Update user details like avatar, username, or preferences.

- **`GET /api/profile/progress`**  
  Fetch the progress of the user across different courses and levels.

### **2. Course and Level APIs**

Since courses now directly contain levels, the endpoints are adjusted accordingly.

- **`GET /api/courses`**  
  Fetch a list of available courses (e.g., Maths, Physics).

- **`GET /api/courses/{courseId}/levels`**  
  Fetch levels within a selected course (e.g., Addition, Subtraction).

- **`GET /api/levels/{levelId}`**  
  Fetch details of a specific level, including content, quizzes, or exams.

- **`POST /api/levels/{levelId}/attempt`**  
  Submit answers for a quiz or exam in the level and get results.

- **`GET /api/levels/{levelId}/suggestions`**  
  Suggest the next level or course to explore upon completion.

### **3. Progress and Unlocking APIs**

- **`POST /api/progress/update`**  
  Update the user's progress after completing a level.

- **`GET /api/progress/unlocked`**  
  Check which levels are unlocked based on completed levels.

### **4. Daily Streaks and Achievements APIs**

- **`GET /api/streaks`**  
  Fetch the current daily streak count and status.

- **`POST /api/streaks/update`**  
  Update streak count when the user completes daily tasks.

- **`GET /api/achievements`**  
  Fetch all achievements earned by the user.

- **`POST /api/achievements/unlock`**  
  Unlock a new achievement based on completed actions.

### **5. Town Hall (Forum) APIs**

- **`GET /api/townhalls/{courseId}`**  
  Fetch discussions and Q&A for a specific course.

- **`POST /api/townhalls/{courseId}/post`**  
  Create a new question or discussion post.

- **`POST /api/townhalls/{postId}/reply`**  
  Reply to a question or discussion in the town hall.

### **6. Leaderboard and Points APIs**

- **`GET /api/leaderboards`**  
  Fetch the leaderboard showing top users based on points or achievements.

- **`GET /api/leaderboards/{courseId}`**  
  Fetch leaderboard specific to a course.

- **`GET /api/points`**  
  Fetch the current points balance of the user.

- **`POST /api/points/add`**  
  Add points to the user’s profile after completing a level or achieving a milestone.

### **7. Notification APIs**

- **`GET /api/notifications`**  
  Fetch notifications for achievements, new levels, suggested courses, etc.

- **`POST /api/notifications/mark-read`**  
  Mark notifications as read.

