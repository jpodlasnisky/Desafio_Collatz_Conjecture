# Desafio_Collatz_Conjecture

A seguinte sequência iterativa é definida pelo conjunto de inteiros positivos onde:
n -> n/2 (se n é par)
n -> 3n + 1 (se n é impar)
Embora ainda não esteja matematicamente provado, é esperado que, dado um numero inteiro positivo qualquer, a sequencia sempre chegará em 1.

Desafio: Qual inteiro positivo abaixo de 1 milhão produz a sequência com mais items? 

OBS. desafio_v1 é a implementação básica para validação lógica do desafio. Já o desafio_v2 utiliza um cache para não haver repetição de cálculos, armazenando chaves de inteiros e seus valores sendo a quantidade de itens gerados pela sequência.
