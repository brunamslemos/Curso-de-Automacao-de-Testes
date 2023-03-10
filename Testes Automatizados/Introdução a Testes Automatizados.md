# Introdução a Testes Automatizados

### Testes Automatizados

Testes de software fazem parte do fluxo de desenvolvimento de software e tem como objetivo, além de fornecer maior qualidade do software, **assegurar que o sistema cumpre o objetivo para qual foi designado de forma eficiente e eficaz**. O objetivo do teste é prever erros e falhas que possam ocorrer em tempo de execução, minimizando também os problemas da abordagem manual. Os testes de software devem ser discutidos em todo o projeto, pois exigem recursos de tempo e infra estrutura, porém trazem um ponto bastante positivo em relação à qualidade.

### Por que utilizar testes automatizados?

A automação dos testes ajuda trazendo a redução do tempo necessário para testar partes de forma manual. Existem diversos frameworks que criam relatórios detalhados, exibindo trechos onde ocorre o erro, o que facilita a identificação e resolução do trecho impactado.

Com a utilização do teste automatizado, caso o corra alguma mudança no trecho de código que impacte em outra funcionalidade, o problema é mais rápido de ser identificado, pois a cada atualização do código, todo o sistema é testado verificando se novas atualizações causam impacto nas funcionalidades já existentes.

Com a utilização do teste automatizado nós temos os benefícios abaixo:

- Reduz o tempo para execução dos testes
- Menor esforço para execução de testes
- Aumenta a produtividade da equipe na identificação de problemas
- Maior confiança da execução dos testes
- Métricas de qualidade dos testes executados
- Testes de cargas, simulando vários acessos na aplicação

### Tipos de testes automatizados

#### Teste unitário

Os testes unitários têm por objetivo **validar pequenas partes do software** com base em suas entradas possíveis e saídas esperadas. As unidades usadas nesse tipo de teste são as menores partes testáveis de um sistema, normalmente métodos ou funções, que recebem argumentos e retornam um determinado valor ou efetuam alguma ação cujo resultado pode ser analisado. Neste teste, também são avaliados os fluxos de dados dentro destas parte de código, avaliando se a troca de mensagens correspondem ao esperado.

> **Exemplo:** Testar um método especifico de uma classe e validando o código contido neste.

#### Teste funcional

Teste funcionais, também chamados de **teste caixa preta**, consistem em testes de ações de uso real do sistema, tendo como objetivo validar as saídas esperadas a partir de entradas no sistema. Este tipo de teste avalia uma funcionalidade como um todo, não se preocupando com a forma do código desenvolvido.

> **Exemplo:** Testar uma funcionalidade de um sistema web se a autenticação esta funcionando.

#### Teste de aceitação

Tem como objetivo avaliar se **o que foi desenvolvido corresponde ao que foi requisitado**, e portanto, pode ser entregue ou disponibilizado em ambiente de produção. Este teste tem como objetivo deixar o dono do produto próximo ao sistema, garantindo que suas funcionalidades funcionam conforme o esperado.

#### Teste de regressão

Ao desenvolver uma determinada funcionalidade, existe a possibilidade de corromper o que já foi desenvolvido e entregue em versões passadas. Portanto, este teste tem como objetivo avaliar o conteúdo anteriormente entregue. Geralmente, os testes de regressão são executados sempre que o código é alterado garantindo que não houve nenhum impacto nas mudanças realizadas.

#### Teste de carga

Têm por objetivo submeter o software a situações intensas de uso e avaliar seu comportamento. Normalmente, o teste de carga inclui vários outros tipos de testes, como testes de estresse, testes de imersão, testes de pico, testes de resistência, etc.

Este tipo de teste ajuda a entender como nosso sistema iria se comportar quando 200 usuários estão usando a mesma funcionalidade de forma simultânea, e com isso conseguimos verificar se ocorrem gargalos em consultas no banco, ou se a infraestrutura não iria suportar essa quantidade de usuários simultâneos.

#### Teste de segurança

O principal objetivo é identificar se existem ameaças no sistema e quais vulnerabilidades que podem ser exploradas no sistema, para buscar meios de correção por meio de codificação, para proteção de informações e acessos indevidos ao conteúdo do sistema, buscando garantir ao usuário confidencialidade, integridade e disponibilidade do sistema.

### Conclusão

Existem diversos tipos de testes a serem adicionados junto à um processo de desenvolvimento de sistemas, a utilização de quais testes irão compor um produto, dependem dos recursos disponibilizados, bem como do que é requisitado pelo próprio sistema. Os testes de software são bastante importantes para o desenvolvimento, pois eles trazem uma significativa garantia de qualidade ao produto desenvolvido.

#### Referências

[Teste de Aceitação: uma documentação objetiva, útil e executável](https://medium.com/bionexo/teste-de-aceitação-uma-documentação-objetiva-útil-e-executável-67675bafe96a)

[O que é teste de carga? | Teste de carga por LoadView | 2022 Guia de Especialistas](https://www.loadview-testing.com/pt-br/teste-de-carga/)

[Teste de Segurança, Teste de Portabilidade e Teste de Stress ( Parte Final)](https://medium.com/@ingrid.carvalho.mo/teste-de-segurança-teste-de-portabilidade-e-teste-de-stress-parte-final-6959ebf7d4e2)