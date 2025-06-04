# MiniKube

O MiniKube foi escolhido como orquestrador Kubernets para a arquitetura de microsserviços desenvolvida.

## Estrutura

Ela fica localizada na pasta dos microsserviços:

.
├── account-service
│   ├── k8s/
│   │   ├── k8s.yaml 
│   └── ...

## Código Fonte

Os arquivos de configuração do MiniKube são apenas criados nos repositórios de implementação da API, ou seja, aqueles que possuem ´Service´ no nome.

### k8s

### Account Service

=== "k8s"
    ``` { .yaml .copy .select linenums="1" }
    --8<-- "https://raw.githubusercontent.com/guikaidei/microservicos-account-service/main/k8s/k8s.yaml"
    ```

### Auth Service

=== "k8s"
    ``` { .yaml .copy .select linenums="1" }
    --8<-- "https://raw.githubusercontent.com/guikaidei/microservicos-auth-service/main/k8s/k8s.yaml"
    ```

### Gateway Service

=== "k8s"
    ``` { .yaml .copy .select linenums="1" }
    --8<-- "https://raw.githubusercontent.com/guikaidei/microservicos-gateway-service/main/k8s/k8s.yaml"
    ```

### Product Service

=== "k8s"
    ``` { .yaml .copy .select linenums="1" }
    --8<-- "https://raw.githubusercontent.com/guikaidei/microservicos-product-service/main/k8s/k8s.yaml"
    ```

### Order Service

=== "k8s"
    ``` { .yaml .copy .select linenums="1" }
    --8<-- "https://raw.githubusercontent.com/guikaidei/microservicos-order-service/main/k8s/k8s.yaml"
    ```
