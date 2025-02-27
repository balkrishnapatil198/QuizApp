package com.telusko.quizapp.service;

import com.telusko.quizapp.Question;
import com.telusko.quizapp.dao.QuestionDao;
import com.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
      @Autowired
      QuestionDao questionDao;

    public ResponseEntity<List<Question>> getALLQuestions() {
     try {
        return new ResponseEntity<>(QuestionDao.findAll(), HttpStatus.OK);
    }catch (Exception e){
        e.printStackTrace();

    }
    return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
}

    public ResponseEntity<List<Question>> getQuestionsByCategory(String category) {
       try {
        return new ResponseEntity<>(QuestionDao.findAll(), HttpStatus.OK);
    }catch (Exception e){
        e.printStackTrace();

    }
    return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);  
       
    }

    public String(@RequestBody Question question) {
      questionDao.save(question);
      return new ResponseEntity<>(body:"success",HttpStatus.CREATED);

    }

}