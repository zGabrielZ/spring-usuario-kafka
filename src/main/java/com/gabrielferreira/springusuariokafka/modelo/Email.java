package com.gabrielferreira.springusuariokafka.modelo;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "usuario")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
public class Email implements Serializable {

    private static final long serialVersionUID = 7590623911693118098L;

    @EqualsAndHashCode.Include
    private String id;
    private String descricao;
    private Usuario usuario;
}
