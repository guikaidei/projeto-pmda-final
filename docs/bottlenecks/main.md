# Bottlenecks
## Cacheability

Foi adicionada cacheabilidade ao microsserviço product para otimizar o desempenho das requisições. A implementação utiliza a anotação @Cacheable do Spring, que permite armazenar em memória o resultado de métodos frequentemente acessados, como buscas por produtos.

Com isso, ao invés de consultar o banco de dados a cada requisição, os dados já processados são retornados diretamente do cache, reduzindo o tempo de resposta e a carga no banco. Essa estratégia é especialmente útil para endpoints que retornam dados que não mudam com frequência.

A configuração do cache foi feita com foco em performance e controle de validade dos dados, podendo ser estendida com soluções como Redis, caso necessário no futuro.

## Observability

Foi implementada uma estratégia de observabilidade para os microsserviços do sistema utilizando o stack Prometheus + Grafana, com o objetivo de monitorar métricas em tempo real e fornecer visibilidade sobre o comportamento e desempenho da aplicação.

A integração com o Prometheus permite a coleta periódica de métricas expostas pelos serviços via endpoint /actuator/prometheus, disponibilizado pelo Spring Boot Actuator. Essas métricas incluem informações como uso de CPU, memória, tempo de resposta, número de requisições, status HTTP, entre outras.

O Grafana foi configurado para se conectar ao Prometheus como fonte de dados e apresentar dashboards interativos e personalizáveis. Esses dashboards facilitam o diagnóstico de gargalos, falhas ou comportamento anômalo dos serviços, promovendo uma tomada de decisão mais rápida e baseada em dados concretos.

Essa camada de observabilidade permite:

- Acompanhamento contínuo da saúde da aplicação;

- Criação de alertas para condições críticas (ex: alto tempo de resposta ou erro 5xx);

- Análise de tendências de uso e desempenho ao longo do tempo;

- Suporte à resolução de incidentes com visibilidade detalhada do sistema.
