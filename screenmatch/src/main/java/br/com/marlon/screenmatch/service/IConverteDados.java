package br.com.marlon.screenmatch.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);

}
