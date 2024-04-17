package zara.repository;

import org.springframework.stereotype.Component;
import zara.entity.Empleado;
import org.springframework.data.repository.CrudRepository;
@Component
public interface EmpleadoRepository extends CrudRepository<Empleado, Long> {
}
