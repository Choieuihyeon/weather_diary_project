package zerobase.weatherpractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zerobase.weatherpractice.domain.Memo;

@Repository
public interface JpaMemoRepository extends JpaRepository<Memo, Integer> {


}
