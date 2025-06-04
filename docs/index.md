# Documentação - Plataformas, Microsserviços e APIs

Bem-vindo à documentação do projeto de Plataformas, Microsserviços e APIs feito por Guilherme Katayama Kaidei

## Repositórios

- [Account](https://github.com/guikaidei/microservicos-account)
- [Account Service](https://github.com/guikaidei/microservicos-account-service)
- [Auth](https://github.com/guikaidei/microservicos-auth)
- [Auth Service](https://github.com/guikaidei/microservicos-auth-service)
- [Gateway](https://github.com/guikaidei/microservicos-gateway-service)
- [Exchange](https://github.com/guikaidei/microservicos-exchange-service)
- [Product](https://github.com/guikaidei/microservicos-product)
- [Product Service](https://github.com/guikaidei/microservicos-product-service)
- [Order](https://github.com/guikaidei/microservicos-order)
- [Order Service](https://github.com/guikaidei/microservicos-order-service)
- [Bottlenecks](https://github.com/guikaidei/microservicos-bottleneck)

## Vídeo

[Apresentação](https://youtu.be/XCD1pTsewiA)

## Execução

### 1. Dependências

Verifique que você possui o Docker e o KubeCTL baixados:
´´´bash
kubectl version --client
´´´
´´´bash
docker --version
´´´

Caso não, siga as instruções nesses links:
- [Kubernetes](https://kubernetes.io/docs/tasks/tools/)
- [Docker](https://www.docker.com/products/docker-desktop)

### 2. Compile e instale com Maven

Faça isso dentro de todos os arquivos!

Interface:
```bash
./mvnw clean install
```

Implementação (tem service no nome):
```bash
./mvnw clean package
```

### 3. Docker
Crie uma imagem e suba eles para o Docker
```bash
docker build -t seu-usuario-docker/account-service:latest .
docker push seu-usuario-docker/account-service:latest
```

### 4. Kubernetes

Aplique os manifestos Kubernetes
```bash
kubectl apply -f k8s/k8s.yaml
```

Verifique os pods
```bash
kubectl get pods
```

Acesse o serviço
```bash
kubectl get svc account-service
```