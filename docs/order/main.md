# Order

O Order e o Order Services são microsserviços da loja, desenvolvidos em Java. Utilizamos o Jenkins, garantindo que os serviços sejam testados e implantados de forma contínua. Também configuramos o Minikube para simular um cluster Kubernetes local, permitindo testar os deployments dos microsserviços em um ambiente semelhante ao de produção.

A API possui o seguinte endpoint:

!!! info "POST /order/"

    Cadastre um pedido. Ex: `POST /order`.

    === "Response"

        ``` { .json .copy .select linenums='1' }
        {
            "id": "33cb2874-f66b-4b64-a373-336a41228721",
            "date": "2025-06-02 22:02:21",
            "itens": [
                {
                    "id": "358f5fa4-f505-4499-aa55-3d09314d586e",
                    "product": {
                        "id": "d5f06af4-8319-4d81-bd4e-42eda1fdeb22",
                        "name": "goiabada",
                        "price": 15.5,
                        "unit": "pao de açucar"
                    },
                    "qtd": 2,
                    "total": 31.0
                },
                {
                    "id": "cf1c8d5d-c4af-4051-b6fe-94b6c0008a84",
                    "product": {
                        "id": "64b69c92-aed0-410d-843a-b2499ed1f293",
                        "name": "vinho",
                        "price": 60.5,
                        "unit": "st marche"
                    },
                    "qtd": 1,
                    "total": 60.5
                },
                {
                    "id": "6d374efc-0f9e-4e37-9ef2-23d201e70725",
                    "product": {
                        "id": "5d61fed5-be41-452c-87a8-33b55715fd77",
                        "name": "queijo",
                        "price": 30.2,
                        "unit": "st marche"
                    },
                    "qtd": 2,
                    "total": 60.4
                }
            ],
            "total": 151.9
        }
        ```
        ```bash
        Response code: 200 (ok)
        ```

Também existe rotas de deleção e buscas gerais e específicas!

## Estrutura do Projeto

#### Order Service

```
microservicos-order-service/
├── k8s/
│   └── k8s.yaml
├── src/main/
│   ├── java/store/order/
│   │   ├── Item.java
│   │   ├── ItemModel.java
│   │   ├── ItemRepository.java
│   │   ├── Order.java
│   │   ├── OrderApplication.java
│   │   ├── OrderModel.java
│   │   ├── OrderParser.java
│   │   ├── OrderRepository.java
│   │   ├── OrderResource.java
│   │   └── OrderService.java
│   └── resources/
│       ├── db/migration/
│       │   ├── V2025.02.21.001__create_schema_orders.sql
│       │   └── V2025.02.21.002__create_table_orders.sql
│       └── application.yaml
├── Jenkinsfile
└── pom.xml
```

#### Order

```
src/main/java/store/microservicos-order
├── ItemIn.java
├── ItemOut.java
├── OrderController.java
├── OrderIn.java
├── OrderOut.java
├── ProductIn.java
├── ProductIn.java
Jenkinsfile
pom.xml
```

## Código-fonte

### Interface

=== "ItemIn.java" { .java .copy .select linenums="1" } --8<-- "https://raw.githubusercontent.com/guikaidei/microservicos-order/main/src/main/java/store/order/ItemIn.java"

=== "ItemOut.java" { .java .copy .select linenums="1" } --8<-- "https://raw.githubusercontent.com/guikaidei/microservicos-order/main/src/main/java/store/order/ItemOut.java"

=== "OrderController.java" { .java .copy .select linenums="1" } --8<-- "https://raw.githubusercontent.com/guikaidei/microservicos-order/main/src/main/java/store/order/OrderController.java"

=== "OrderIn.java" { .java .copy .select linenums="1" } --8<-- "https://raw.githubusercontent.com/guikaidei/microservicos-order/main/src/main/java/store/order/OrderIn.java"    

=== "OrderOut.java" { .java .copy .select linenums="1" } --8<-- "https://raw.githubusercontent.com/guikaidei/microservicos-order/main/src/main/java/store/order/OrderOut.java"

=== "ProductOut.java" { .java .copy .select linenums="1" } --8<-- "https://raw.githubusercontent.com/guikaidei/microservicos-order/main/src/main/java/store/order/ProductOut.java"

=== "ProductOut.java" { .java .copy .select linenums="1" } --8<-- "https://raw.githubusercontent.com/guikaidei/microservicos-order/main/src/main/java/store/order/ProductOut.java"

=== "pom.xml" { .xml .copy .select linenums="1" } --8<-- "https://raw.githubusercontent.com/guikaidei/microservicos-order/main/pom.xml"

### Implementação

=== "Item.java" { .java .copy .select linenums="1" } --8<-- "https://raw.githubusercontent.com/guikaidei/microservicos-order-service/main/src/main/java/store/order/Item.java"

=== "ItemModel.java" { .java .copy .select linenums="1" } --8<-- "https://raw.githubusercontent.com/guikaidei/microservicos-order-service/main/src/main/java/store/order/ItemModel.java"

=== "ItemRepository.java" { .java .copy .select linenums="1" } --8<-- "https://raw.githubusercontent.com/guikaidei/microservicos-order-service/main/src/main/java/store/order/ItemRepository.java"

=== "Order.java" { .java .copy .select linenums="1" } --8<-- "https://raw.githubusercontent.com/guikaidei/microservicos-order-service/main/src/main/java/store/order/Order.java"

=== "OrderApplication.java" { .java .copy .select linenums="1" } --8<-- "https://raw.githubusercontent.com/guikaidei/microservicos-order-service/main/src/main/java/store/order/OrderApplication.java"    

=== "OrderModel.java" { .java .copy .select linenums="1" } --8<-- "https://raw.githubusercontent.com/guikaidei/microservicos-order-service/main/src/main/java/store/order/OrderModel.java"

=== "OrderParser.java" { .java .copy .select linenums="1" } --8<-- "https://raw.githubusercontent.com/guikaidei/microservicos-order-service/main/src/main/java/store/order/OrderParser.java"

=== "OrderRepository.java" { .java .copy .select linenums="1" } --8<-- "https://raw.githubusercontent.com/guikaidei/microservicos-order-service/main/src/main/java/store/order/OrderRepository.java"

=== "OrderResource.java" { .java .copy .select linenums="1" } --8<-- "https://raw.githubusercontent.com/guikaidei/microservicos-order-service/main/src/main/java/store/order/OrderResource.java"

=== "OrderService.java" { .java .copy .select linenums="1" } --8<-- "https://raw.githubusercontent.com/guikaidei/microservicos-order-service/main/src/main/java/store/order/OrderService.java"

=== "pom.xml" { .xml .copy .select linenums="1" } --8<-- "https://raw.githubusercontent.com/guikaidei/microservicos-order-service/main/pom.xml"