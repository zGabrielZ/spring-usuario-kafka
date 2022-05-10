package com.gabrielferreira.springusuariokafka.modelo;

import com.gabrielferreira.springusuariokafka.modelo.enums.TipoTelefone;
import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@Builder
@ToString(exclude = "usuario")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Telefone implements Serializable {

    private static final long serialVersionUID = -2469869830842194323L;

    @EqualsAndHashCode.Include
    private String id;
    private String descricao;
    private TipoTelefone tipoTelefone;
    private Usuario usuario;
}
