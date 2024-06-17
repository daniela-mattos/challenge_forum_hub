<h1>Challenge ONE Back-End - FórumHub</h1>
![Badge-Spring](https://github.com/daniela-mattos/challenge_forum_hub/assets/131220332/09a5e6db-a46f-4131-b457-72bc3ad657d1)
<p>Chalenge é uma ferramenta de aprendizado utilizada nos cursos da Alura, no qual os alunes podem se desafiar e colocar em prática o que aprenderam. Estou participando do programa ONE - Oracle Next Education - com foco em Back-end, o qual, tem o challenge Fórum Hub na última fase.</p>
<p>O objetivo da aplicação é replicar o processo de um fórum no nível do back-end, criando uma API REST usando Spring.</p>
<p>Para armazenar as informações, foi criado um banco de dados, a partir do qual utilizou-se as operações do CRUD (CREATE, READ, UPDATE, DELETE). Além disso, o desafio incluiu o uso de autenticação e testes de endpoints.</p>

<h2>Tecnologias e recursos utilizados</h2>
<ul>
  <li>Spring Boot</li>
  <li>MySql</li>
  <li>API Rest</li>
  <li>Autenticação com Spring Security</li>
  <li>Token JWT</li>
  <li>Testes de endpoints da API com Insomnia</li>
</ul>

<h2>Funcionalidades para o usuário final</h2>
<p>A API se concentrará especificamente nos tópicos, e permite aos usuários:</p>

![insominia](https://github.com/daniela-mattos/challenge_forum_hub/assets/131220332/897ee435-33a7-4c22-b6bc-80045aafbe64)



<ul>
  <li>Criar um novo tópico;</li>
  <li>Mostrar todos os tópicos criados;</li>
  <li>Mostrar um tópico específico;</li>
  <li>Atualizar um tópico;</li>
  <li>Eliminar um tópico.</li>
</ul>

<h2>Regras de negócio:</h2>
<p>Todos os campos são obrigatórios, a verificação é feita ao cadastrar um novo tópico.</p>
<p>A API não permite o cadastro de tópicos duplicados (contendo o mesmo título e mensagem), ao criar e ao atualizar um tópico são verificados esses campos separadamente para garantir a integridade dos dados.</p>



