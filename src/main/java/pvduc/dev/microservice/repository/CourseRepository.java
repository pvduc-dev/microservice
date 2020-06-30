package pvduc.dev.microservice.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import pvduc.dev.microservice.model.Course;

/**
 * @author Pv Duc
 */
public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
}
