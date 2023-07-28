package zerobase.weatherpractice.repository;

import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zerobase.weatherpractice.domain.DateWeather;

@Repository
public interface DateWeatherRepository extends JpaRepository<DateWeather, LocalDate> {
	List<DateWeather> findAllByDate(LocalDate localDate);

}
