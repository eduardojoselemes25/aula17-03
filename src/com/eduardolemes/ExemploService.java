package com.eduardolemes;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ExemploService {

    @WebMethod
    int calcula(int id);

    String chamarNome(String nome);
}
