package com.eduardolemes;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "com.eduardolemes.ExemploService")
public class ExemploServiceImpl implements ExemploService {

    @WebMethod
    public int calcula(int id) {
        return id + 10;
    }

    @Override
    public String chamarNome(String nome) {
        return nome;
    }
}
