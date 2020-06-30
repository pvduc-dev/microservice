package pvduc.dev.microservice.api.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pvduc.dev.microservice.model.Course;
import pvduc.dev.microservice.repository.CourseRepository;

/**
 * @author Pv Duc
 */
@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CourseService {
    private final CourseRepository courseRepository;

    public Iterable<Course> list(Pageable pageable) {
        return courseRepository.findAll(pageable);
    }
}
