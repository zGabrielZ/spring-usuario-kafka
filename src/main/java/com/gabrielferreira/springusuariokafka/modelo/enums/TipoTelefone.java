package com.gabrielferreira.springusuariokafka.modelo.enums;

import lombok.Getter;
import lombok.Setter;

public enum TipoTelefone {

    RESIDENCIAL(1L,"Residencial"),
    CELULAR(2L,"Celular");
    @Getter
    @Setter
    private Long codigo;
    @Getter
    @Setter
    private String descricao;

    TipoTelefone(Long codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
}
