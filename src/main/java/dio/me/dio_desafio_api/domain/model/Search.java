package dio.me.dio_desafio_api.domain.model;

import java.util.List;

public interface Search {
    List<Recipie> pesquisaPorNome(String name);
}
