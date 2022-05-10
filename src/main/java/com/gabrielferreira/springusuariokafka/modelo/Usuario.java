package com.gabrielferreira.springusuariokafka.modelo;

import com.gabrielferreira.springusuariokafka.modelo.enums.TipoDocumento;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = {"email","endereco","telefones"})
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
public class Usuario implements Serializable {


    private static final long serialVersionUID = 6499486769517275204L;

    @EqualsAndHashCode.Include
    private String id;
    private String nome;
    private String sobrenome;
    private String documento;
    private TipoDocumento tipoDocumento;
    private Email email;
    private Endereco endereco;
    private List<Telefone> telefones = new ArrayList<>();
}
