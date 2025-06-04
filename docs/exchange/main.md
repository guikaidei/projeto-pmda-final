# Exchange

A Exchange API é uma API REST desenvolvida em **Python** utilizando o framework **FastAPI**. A API permite ao usuário realizar a conversão entre diferentes moedas. 

A API possui o seguinte endpoint:

!!! info "GET /exchange/{from}/{to}"

    Obtenha a cotação atual de uma moeda para outra. Ex: `GET /coin/USD/EUR`.

    === "Response"

        ``` { .json .copy .select linenums='1' }
        {
            "sell": 0.82,
            "buy": 0.80,
            "date": "2021-09-01 14:23:42",
            "id-account": "0195ae95-5be7-7dd3-b35d-7a7d87c404fb"
        }
        ```
        ```bash
        Response code: 200 (ok)
        ```

## Estrutura do Projeto

```
app/
├── main.py
├── requirements.txt
Dockerfile
```

## Código-fonte

Não consigo colocar código fonte por nada aqui...