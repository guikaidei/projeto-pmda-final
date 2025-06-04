# Product

O Product e o Product Services são microsserviços da loja, desenvolvidos em Java utilizando o framework SpringBoot. Utilizamos, eventualmente, o Jenkins, garantindo que os serviços sejam testados e implantados de forma contínua. Também configuramos o Minikube para simular um cluster Kubernetes local, permitindo testar os deployments dos microsserviços em um ambiente semelhante ao de produção.

A API possui o seguinte endpoint:

!!! info "GET /product/"

    Obtenha as informações de todos os produtos cadastrados. Ex: `GET /product`.

    === "Response"

        ``` { .json .copy .select linenums='1' }
        [
            {
                "id": "d5f06af4-8319-4d81-bd4e-42eda1fdeb22",
                "name": "goiabada",
                "price": 15.5,
                "unit": "pao de açucar"
            },
            {
                "id": "64b69c92-aed0-410d-843a-b2499ed1f293",
                "name": "vinho",
                "price": 60.5,
                "unit": "st marche"
            },
            {
                "id": "5d61fed5-be41-452c-87a8-33b55715fd77",
                "name": "queijo",
                "price": 30.2,
                "unit": "st marche"
            }
        ]
        ```
        ```bash
        Response code: 200 (ok)
        ```
        
Também existe rotas de deleção, inserção e busca específicas!

## Estrutura do Projeto

#### Product Service

```
microservicos-product-service/
├── k8s/
│   └── k8s.yaml
├── src/main/
│   ├── java/store/product/
│   │   ├── Product.java
│   │   ├── ProductApplication.java
│   │   ├── ProductModel.java
│   │   ├── ProductParser.java
│   │   ├── ProductRepository.java
│   │   ├── ProductResource.java
│   │   └── ProductService.java
│   └── resources/
│       ├── db/migration/
│       │   ├── V2025.02.21.001__create_schema_product.sql
│       │   └── V2025.02.21.002__create_table_product.sql
│       └── application.yaml
├── Jenkinsfile
└── pom.xml

```

#### Product

```
src/main/java/store/microservicos-product
├── ProductController.java
├── ProductIn.java
├── ProductOut.java
Jenkinsfile
pom.xml
```

## Código-fonte

### Interface

=== "ProductController.java" { .java .copy .select linenums="1" } --8<-- "https://raw.githubusercontent.com/guikaidei/microservicos-product/main/src/main/java/store/product/ProductController.java"

=== "ProductIn.java" { .java .copy .select linenums="1" } --8<-- "https://raw.githubusercontent.com/guikaidei/microservicos-product/main/src/main/java/store/product/ProductIn.java"    

=== "ProductOut.java" { .java .copy .select linenums="1" } --8<-- "https://raw.githubusercontent.com/guikaidei/microservicos-product/main/src/main/java/store/product/ProductOut.java"

=== "pom.xml" { .xml .copy .select linenums="1" } --8<-- "https://raw.githubusercontent.com/guikaidei/microservicos-product/main/pom.xml"

### Implemenção

=== "Product.java" { .java .copy .select linenums="1" } --8<-- "https://raw.githubusercontent.com/guikaidei/microservicos-product-service/main/src/main/java/store/product/Product.java"

=== "ProductApplication.java" { .java .copy .select linenums="1" } --8<-- "https://raw.githubusercontent.com/guikaidei/microservicos-product-service/main/src/main/java/store/product/ProductApplication.java"    

=== "ProductModel.java" { .java .copy .select linenums="1" } --8<-- "https://raw.githubusercontent.com/guikaidei/microservicos-product-service/main/src/main/java/store/product/ProductModel.java"

=== "ProductParser.java" { .java .copy .select linenums="1" } --8<-- "https://raw.githubusercontent.com/guikaidei/microservicos-product-service/main/src/main/java/store/product/ProductParser.java"

=== "ProductRepository.java" { .java .copy .select linenums="1" } --8<-- "https://raw.githubusercontent.com/guikaidei/microservicos-product-service/main/src/main/java/store/product/ProductRepository.java"

=== "ProductResource.java" { .java .copy .select linenums="1" } --8<-- "https://raw.githubusercontent.com/guikaidei/microservicos-product-service/main/src/main/java/store/product/ProductResource.java"

=== "ProductService.java" { .java .copy .select linenums="1" } --8<-- "https://raw.githubusercontent.com/guikaidei/microservicos-product-service/main/src/main/java/store/product/ProductService.java"

=== "pom.xml" { .xml .copy .select linenums="1" } --8<-- "https://raw.githubusercontent.com/guikaidei/microservicos-product-service/main/pom.xml"