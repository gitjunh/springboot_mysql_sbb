package com.mysql.test;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestApplicationTests {

	@AutoWired
	private QuestionRepository questionRepository;
	
// 	@Test
// 	void testJpa() {
// 		Question q1 = new Question();
// 		q1.setSubject("sbb가 무엇인가요?");
//         q1.setContent("sbb에 대해서 알고 싶습니다.");
//         q1.setCreateDate(LocalDateTime.now());
//         this.questionRepository.save(q1);
        
//         Question q2 = new Question();
//         q2.setSubject("스프링부트 질문입니다.");
//         q2.setContent("id는 자동으로 생성되나요?");
//         q2.setCreateDate(LocalDatetime.now());
//         this.questionRepository.save(q2);
//     }
    
//     @Test
//     void testJpa() {
//         List<Question> all = this.questionRepository.findAll();
//         assertEquals(2, all.size());

//         Question q = all.get(0);
//         assertEquals("sbb가 무엇인가요?", q.getSubject());
    //     }
    
//     @Test
//     void testJpa() {
//         Optional<Question> oq = this.questionRepository.findById(1);
        
//         if(oq.isPresent()) {
//             Question q = oq.get();
//             assertEquals("sbb가 무엇인가요?", q.getSubject());
//         }
	
// 	@Test
// 	void testJpa() {
// 		Questino q = questinoRepository.findBySubject("sbb가 무엇인가요?");
// 		assertEquals(1, q.getId());
// 	}
	
	@Test
	viod testJpa() {
		Question q = questionRepository.findBySubjectAndContent("sbb가 무엇인가요?", "sbb에 대해서 알고 싶습니다.");
		assertEquals(1, q.getId());
	}
}
