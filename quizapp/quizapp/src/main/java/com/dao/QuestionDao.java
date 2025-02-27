package com.telusko.quizapp.dao;

import com.telusko.quizapp.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class QuestionDao extends JpaRepository<Question, Integer> {

 List<Question> findByCategory(String category);


 @Query(value = "SELECT * FROM question q where q.category ORDER BY RANDOM() LIMIT :numQ",nativeQuery = true)
 List<Question> findRandomQuestionByCategory(String category, int numQ);
}