package zerobase.weatherpractice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import zerobase.weatherpractice.domain.Memo;
import zerobase.weatherpractice.repository.JdbcMemoRepository;

@SpringBootTest
//@Transactional
public class JdbcMemoRepositoryTest {

	@Autowired
	JdbcMemoRepository jdbcMemoRepository;

	@Test
	void insertMemoTest() {
		//given
		Memo newMemo = new Memo(2, "insert memoTest");

		//when
		jdbcMemoRepository.save(newMemo);

		//then
		Optional<Memo> result = jdbcMemoRepository.findById(2);
		assertEquals(result.get().getText(), "insert memoTest");
	}

	@Test
	void findAllMemoTest() {
		List<Memo> memoList = jdbcMemoRepository.findAll();
		System.out.println(memoList);
		assertNotNull(memoList);
	}
}
