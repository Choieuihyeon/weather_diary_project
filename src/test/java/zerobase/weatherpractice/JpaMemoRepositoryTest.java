package zerobase.weatherpractice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import zerobase.weatherpractice.domain.Memo;
import zerobase.weatherpractice.repository.JpaMemoRepository;

@SpringBootTest
@Transactional	// 무조건 commit x, 전부 다 RollBack 처리.
public class JpaMemoRepositoryTest {

	@Autowired
	JpaMemoRepository jpaMemoRepository;

	@Test
	void insertMemoTest() {
		//given
		Memo newMemo = new Memo(10, "this is jpa memo");
		//when
		jpaMemoRepository.save(newMemo);
		//then
		List<Memo> memoList = jpaMemoRepository.findAll();
		assertTrue(memoList.size() > 0);
	}

	@Test
	void findByIdTest() {
	   // given
		Memo newMemo = new Memo(11, "jpa");
	   // when
		Memo memo = jpaMemoRepository.save(newMemo);
		System.out.println(memo.getId());
	   // then
		Optional<Memo> result = jpaMemoRepository.findById(memo.getId());
		assertEquals(result.get().getText(), "jpa");
	}
}
