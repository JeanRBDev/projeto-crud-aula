# Projeto QuickCursos
---

## Minimundo

A QuickCursos é uma plataforma de qualificação completa em tecnologia com foco na acessibilidade e na integração de Pessoas com Deficiência (PcD) no mercado de trabalho. Contamos com parceiros que acreditam na formação de pessoas. Durante o período do curso oferecemos suporte com equipamentos e bolsa auxílio caso necessário.

<!---<img src="#" width="300" height="300">-->

## Regras e requisitos

### Alunos

Após a coleta de informações e entrevistas com possíveis clientes, análise de planilhas e estudos, observamos os seguintes requisitos para o **cadastro de alunos** no nosso sistema:

- O nome do aluno é **obrigatório**, e terá no **máximo** 100 caracteres.
- O RG e CPF são **obrigatórios**, e precisam ter no **máximo** 13 e 11 caracteres respectivamente, além de aceitarem **apenas números** e o CPF ser **único**.
- A data de nascimento é **obrigatória** e precisa usar o parâmetro de data.
- O e-mail é **obrigatório** e precisa ser valido.
- O endereço é **obrigatório** e precisa seguir o padrão requisitado pelos Correios, para envio do material.
- O laudo médico é **obrigatório** e será anexado ao cadastro do aluno.
- O campo de deficiência é **obrigatório**, e terá no **máximo** 50 caracteres.
- As observações são *opcionais* e precisam ter no **máximo** 1000 caracteres.

Além das informações acima, o aluno deverá selecionar o curso na área em que deseja atuar.

### Professores

  - o nome completo é **obrigatório**, e terá no **máximo** 100 caracteres.
  - O RG e CPF são obrigatórios, e precisam ter no **máximo** 13 e 11 caracteres respectivamente, além de aceitarem **apenas números** e o CPF ser **único**.
  - A data de nascimento é **obrigatória** e precisa usar o parâmetro de data.
  - O e-mail é **obrigatório** e precisa ser valido.
  - Informar seu endereço e precisa seguir o padrão requisitado pelos Correios.
  - Cópia em imagem da Carteira de Trabalho é **obrigatório**.
  - Cópia em imagem do certificado de proficiencia do curso em que irá lecionar é **obrigatório**.
  - Comprovante de Conta Bancária é **obrigatório**.

  Além das informações acima, o professor deverá informar o curso na área em que deseja atuar.

  ### Cursos

  - O nome do Curso é **obrigatório** e terá no **máximo** 200 caracteres.
  - O nome do Professor que irá lecionar é **obrigatório** e terá no **máximo** 100 caracteres.
  - O nome do Professor substituto é *opcional* e terá no **máximo** 100 caracteres.
  - A lista de inclusão de deficiências do curso é **obrigatória**, por exemplo: se o curso está disponível para pessoas com deficiência auditiva, através de libras ou legendas.

   Cada curso será atribuído a um professor que irá lecionar e a uma lista de alunos.

## Mapa navegacional

---

Seguindo o desenvolvimento do website, assim que o usuário entrar, irá se deparar com a seguinte barra de navegação, contendo elementos importantes como:
- Logo
- Botão de busca
- Botão de ajuda
- Cursos
- Listagem de professores
- Botão de Login & Matrícula
- Botão de doação e apoio

<img src="https://i.imgur.com/PSAvwBy.png">

- A **logo** será o botão principal do usuário para retornar a home. Para usuários que possuem deficiência visual, ao encostar na logo, ela terá uma descrição do formato e do que está escrito, podendo ser informado por algum aplicativo de acessibilidade por voz.

- O **botão de busca** será a principal forma do usuário procura por algum curso específico, usuário ou professor, por exemplo.

- O **botão de ajuda** contém informações em um F.A.Q. para usuários que necessitem de mais informações, contendo, também, as perguntas mais frequentes feitas por usuários.

- A aba de **Cursos** terá uma listagem em cards de todos os cursos disponíveis no programa, podendo visualizar informações do curso e matricular-se nele, caso o aluno deseje.

- A aba de **Professores** tera informação detalha em cards com foto, área, proficiência e qual acessibilidade esse professor tem mais experiência, podendo ler, também, a biografia e informações de contato sobre cada professor do curso.

---

Ao passar o mouse no botão de Entrar, o usuário visualizará o seguinte menu *dropdown*, permitindo que ele se matricule, recupere a senha caso a tenha perdido ou entre como um professor, caso faça parte do time.

<img src="https://i.imgur.com/morCAFD.png">

---

Ao clicar em **Matricule-se**, o usuário será levado para a tela de cadastro, onde todas as informações serão inseridas no Banco de Dados para aprovação ou do matriculado. O usuário também poderá clicar na aba *Sou um professor*, caso ele deseje realizar o cadastro de um professor.

Todas as informações e requisitos dos campos de input seguem a sessão de **Regras e Requisitos** presentes no topo deste mesmo documento.

O usuário poderá clicar na logo do QuickCursos no canto superior esquerdo para retornar a home.
<img src="https://i.imgur.com/mKZQtqR.png">

---

Ao entrar na área **Admin**, visível apenas para administradores do website, o usuário irá ter acesso a página de cadastro de usuário, onde poderá alterar, editar e excluir usuários que estão registrados no banco de dados do sistema, o mesmo esquema funciona para o cadastro de professores e de cursos.

<img src="https://i.imgur.com/TYJblSI.png">

<img src="https://i.imgur.com/9KBNccY.png">

Opção **Editar** exibe uma tela com as informações necessárias, seja do aluno, professor ou curso selecionado, permitindo atualizar os campos. Caso o usuário clique em *voltar*, irá retornar para a devida listagem, caso clique em *salvar*, as informações serão salvas e altaradas no Banco de Dados, aparecendo uma mensagem de confirmação e voltando para a tela de **Cadastro**.

Opção **Excluir** exibe uma tela confirmando se deseja realmente excluir os dados selecionados, caso o administrador opte por *sim*, os dados serão apagados do Banco de Dados, caso opte por *não*, retornará para a tela de **Cadastro**.

O usuário poderá clicar na logo do QuickCursos no canto superior esquerdo para retornar a home.
