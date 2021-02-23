package payroll;

import org.springframework.data.jpa.repository.JpaRepository;

interface GameRepository extends JpaRepository<Employee, Long> {

}