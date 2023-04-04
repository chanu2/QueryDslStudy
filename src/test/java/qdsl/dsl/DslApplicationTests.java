package qdsl.dsl;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import qdsl.dsl.entity.Hello;
import qdsl.dsl.entity.QHello;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
class DslApplicationTests {

	@Autowired
	EntityManager em;

	@Test
	void contextLoads() {
		Hello hello = new Hello();
		em.persist(hello);

		JPAQueryFactory query = new JPAQueryFactory(em);
		QHello qHello = new QHello("h");

		Hello result = query.
				selectFrom(qHello)
				.fetchOne();

		assertThat(result).isEqualTo(hello);
	}

}
