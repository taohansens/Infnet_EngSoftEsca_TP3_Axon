Projeto TP3 Infnet
Domain-Driven Design (DDD) e Arquitetura de Softwares Escaláveis com Java [24E3_4]

Evento de Domínio
  Natureza: Fato isolado e significativo
  Propósito: Modelar o que aconteceu no domínio
  Uso:  Base para a modelagem de agregados e bounded contexts

Event Sourcing
  Natureza: Mecanismo de persistência
  Propósito: Armazenar o histórico de mudanças
  Uso: Forma de implementar a persistência de agregados


Eventos de Domínio são a base do Event Sourcing: os eventos que são armazenados em um sistema que utiliza event sourcing são, na 
maioria das vezes, eventos de domínio.
● Event Sourcing permite rastreabilidade e auditabilidade: ao  armazenar o histórico completo de eventos, é possível rastrear as 
mudanças no estado do sistema e auditar as ações realizadas.
● Event Sourcing facilita a implementação de CQRS - Command Query Responsibility Segregation: event sourcing e CQRS são 
frequentemente usados em conjunto, pois event sourcing fornece um mecanismo para armazenar o histórico de eventos, enquanto CQRS 
separa as responsabilidades de leitura e escrita
