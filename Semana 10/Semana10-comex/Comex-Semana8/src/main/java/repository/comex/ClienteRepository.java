package repository.comex;

import br.com.alura.comex.model.Cliente;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    @Query("SELECT c.nome, COUNT(p), SUM(i.precoUnitario * i.quantidade) " +
            "FROM Cliente c " +
            "JOIN Pedido p ON c = p.cliente " +
            "JOIN ItemDePedido i ON p = i.pedido " +
            "GROUP BY c.nome " +
            "ORDER BY SUM(i.precoUnitario * i.quantidade) DESC")
    default List<Object[]> listarClientesFieis() {
        return null;
    }

}
