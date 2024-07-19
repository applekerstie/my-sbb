package com.mysite.sbb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SbbApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private AnswerRepository answerRepository;
	
	@Test
	void testJpa() {
		/*	
		Question q1 = new Question();
		
		q1.setSubject("sbb가 무엇인가요?");
		q1.setContent("sbb에 대해서 알고 싶습니다");
		q1.setCreateDate(LocalDateTime.now());
		
		this.questionRepository.save(q1);
		
		Question q2 = new Question();
		q2.setSubject("스프링 부트 모델 질문입니다");
		q2.setContent("id는 자동으로 생성되나요?");
		q2.setCreateDate(LocalDateTime.now());
		
		this.questionRepository.save(q2);
		*/
		
		/*
		List<Question> all = this.questionRepository.findAll();
		assertEquals(2, all.size());
		
		Question q1 = all.get(0);
		//System.out.println( q1.getSubject());
		assertEquals("sbb가 무엇인가요?", q1.getSubject());
		
		Optional<Question> oq1 = this.questionRepository.findById(1);
		if(oq1.isPresent()) {
			Question q2 = oq1.get();
			assertEquals("sbb가 무엇인가요?", q2.getSubject());
		}
		
		Question q3 = this.questionRepository.findBySubject("sbb가 무엇인가요?");
		assertEquals(1, q3.getId());
		
		Question q4 = this.questionRepository.findBySubjectAndContent("sbb가 무엇인가요?", "sbb에 대해서 알고 싶습니다");
		assertEquals(1, q4.getId());

		List<Question> q5List = this.questionRepository.findBySubjectLike("sbb%");
		Question q5 = q5List.get(0);
		assertEquals("sbb가 무엇인가요?", q5.getSubject());
		*/
		
	
		Optional<Question> oq6 = this.questionRepository.findById(1);
		assertTrue(oq6.isPresent());
		
		Question q6 = oq6.get();
		q6.setSubject("수정된 제목");
		this.questionRepository.save(q6);
	
		
		assertEquals(2, this.questionRepository.count());
		Optional<Question> oq7 = this.questionRepository.findById(1);
		assertTrue(oq7.isPresent());
		Question q7 = oq7.get();
		this.questionRepository.delete(q7);
		assertEquals(1, this.questionRepository.count());
		
		
	}
	
	
}
