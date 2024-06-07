# 🍃 Spring Framework
Framework open source desenvolvido para a plataforma Java baseado
nos padrões de projetos `inversão de controle e injeção de dependência`.

Sua estrutura é composta por módulos afins de **reduzir a complexidade**
no desenvolvimento de aplicações simples ou corporativa.

## Inversão de Controle
`Inversion of Control ou IoC`, trata-se do redirecionamento do
fluxo de execução de um código retirando parcialmente o controle 
sobre ele e delegando-o para um container. O principal propósito é 
minimizar o acoplamento do código.

## Injeção de Dependências
`Injeção de dependência` é um padrão de desenvolvimento com a
finalidade de manter baixo o nível de acoplamento entre módulos
de um sistema.

### 🍃 Beans
Objeto que é instanciado (criado), montado e gerenciado por um 
container através do princípio da inversão de controle.

### 🍃 Scopes
Controle da existência de nossos objetos Components da aplicação.
  Singleton: O container do Spring IoC define apenas uma instância do objeto.

- `Prototype`: Será criado um novo objeto a cada solicitação ao container.

- `Request`: Um bean será criado para cada requisição HTTP.

- `Session`:  Um bean será criado para a sessão de usuário na Web.

- `Global`: Ou Application Scope cria um bean para o ciclo de vida do 
contexto da aplicação.


 ### 🍃 Autowired
Uma anotação (indicação) onde deverá ocorrer uma injeção automática de dependência.

- `byName`: É buscado um método set que corresponde ao nome do Bean.

- `byType`: É considerado o tipo da classe para inclusão do Bean.

- `byConstrutor`: Usamos o construtor para incluir a dependência.<br>



Fonte: <br>
[Spring Framework - By: Gleyson Sampaio](https://glysns.gitbook.io/spring-framework)