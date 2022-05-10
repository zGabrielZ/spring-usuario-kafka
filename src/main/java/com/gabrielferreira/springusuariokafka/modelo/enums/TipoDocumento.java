package com.gabrielferreira.springusuariokafka.modelo.enums;

import lombok.Getter;
import lombok.Setter;

public enum TipoDocumento {

    CPF(1L,"CPF"),
    CNPJ(2L,"CNPJ");
    @Getter
    @Setter
    private Long codigo;
    @Getter
    @Setter
    private String descricao;

    TipoDocumento(Long codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
}
