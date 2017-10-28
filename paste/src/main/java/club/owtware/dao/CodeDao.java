package club.owtware.dao;

import club.owtware.entity.Code;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeDao extends JpaRepository<Code, Integer> {
}
