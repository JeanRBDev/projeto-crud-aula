const url = "http://localhost:8080"

const form = document.querySelector(".form-aluno-matricula")

const nomeAluno = document.querySelector("#nomeAluno")
const cpfAluno = document.querySelector("#cpfAluno") 
const rgAluno = document.querySelector("#rgAluno") 
const emailAluno = document.querySelector("#emailAluno") 
const nascAluno = document.querySelector("#nascAluno") 
const enderecoAluno = document.querySelector("#enderecoAluno")
const cidadeAluno = document.querySelector("#cidadeAluno") 
const estadoAluno = document.querySelector("#estadoAluno") 
const cepAluno = document.querySelector("#cepAluno") 

function cadastrar () {
    fetch("http://localhost:8080/cadastrar",
        {
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            method: "POST",
            body: JSON.stringify({
                nome: nomeAluno.value,
                cpf: cpfAluno.value,
                rg: rgAluno.value,
                email: emailAluno.value,
                dataNascimento: nascAluno.value,
                endereco: enderecoAluno.value,
                cidade: cidadeAluno.value,
                estado: estadoAluno.value,
                cepAluno: cepAluno.value
            })
        })
        .then(function (res) { console.log(res) })
        .catch(function (res) {console.log(res) })
}

form.addEventListener('submit', function(event) {
    event.preventDefault()

    cadastrar()
})
