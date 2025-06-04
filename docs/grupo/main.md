# Project

### Nina Savoy e Guilherme Kaidei

Neste trabalho, desenvolvemos e implantamos uma aplicação utilizando serviços da AWS, com foco em escalabilidade, automação e análise de custos. Entre as principais atividades, realizamos a configuração da infraestrutura em nuvem utilizando o Amazon EKS (Elastic Kubernetes Service), configuramos pipelines de CI/CD com o Jenkins, realizamos testes de carga para avaliar o desempenho da aplicação e monitoramos o comportamento dos pods com HPA (Horizontal Pod Autoscaler). Escolhemos usar o projeto do Guilherme para fazer essa seção e tudo pode ser encontrado nos seguintes repositórios:

- [Account](https://github.com/guikaidei/microservicos-account)
- [Account Service](https://github.com/guikaidei/microservicos-account-service)
- [Auth](https://github.com/guikaidei/microservicos-auth)
- [Auth Service](https://github.com/guikaidei/microservicos-auth-service)
- [Gateway](https://github.com/guikaidei/microservicos-gateway-service)
- [Product](https://github.com/guikaidei/microservicos-product)
- [Product Service](https://github.com/guikaidei/microservicos-product-service)
- [Order](https://github.com/guikaidei/microservicos-order)
- [Order Service](https://github.com/guikaidei/microservicos-order-service)
- [Bottlenecks](https://github.com/guikaidei/microservicos-bottleneck)

ou no repositório conjunto (este):
- [Final](https://github.com/guikaidei/projeto-pmda-final)

## Configuração da AWS

A AWS (Amazon Web Services) foi utilizada como provedor de nuvem. Criamos a infraestrutura básica com:

- VPC, subnets e roles

- IAM para permissões

- Integração com o serviço gerenciado Amazon EKS

## Deploy no EKS (Elastic Kubernetes Service)

Utilizamos o Amazon EKS para orquestrar os containers da aplicação. A configuração incluiu:

- Criação de cluster via AWS CLI

- Deploy da aplicação Spring Boot em pods

- Balanceamento de carga com LoadBalancer Service

- O EKS garantiu escalabilidade e alta disponibilidade para nossa aplicação.

## CI/CD com Jenkins

Já tínhamos o Jenkins para automatizar:

- Build da imagem Docker

- Push para o Docker Hub

- Deploy automatizado no EKS

## Testes de Carga e HPA

Realizamos testes de carga com ferramentas como JMeter ou Locust e configuramos HPA (Horizontal Pod Autoscaler) para escalar automaticamente os pods com base no uso de CPU. Durante o teste:

- Monitoramos o HPA em tempo real

- Analisamos como o sistema reagia ao aumento de requisições

- Observamos a escalabilidade dinâmica