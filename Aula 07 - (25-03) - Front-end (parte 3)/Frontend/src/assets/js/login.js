const botaoRecuperarSenha = document.getElementById('recuperarSenha')
const modal = document.querySelector('.modal-bg')
const fecharModal = document.getElementById('fecharModal')
const linkLogin = document.getElementById('logar')

botaoRecuperarSenha.addEventListener('click', function recuperarSenha(e) {
    e.preventDefault()
    modal.classList.add('active')
})

fecharModal.addEventListener('click', () => {
    modal.classList.remove('active')
})

linkLogin.addEventListener('click', (e) => {
    e.preventDefault()

    const conteudo = document.querySelectorAll('section.content')
    const arrayConteudo = [...conteudo]
    arrayConteudo.forEach(e => {
        e.classList.toggle('active')
    })

})


let users = []
function cadastrar() {
    const email = document.getElementById('cadastrarEmail').value
    const senha = document.getElementById('cadastrarSenha').value
    const confirmarSenha = document.getElementById('confirmarSenha').value
    const sectionCadastro = document.getElementById('sectionCadastro')
    const sectionLogin = document.getElementById('sectionLogin')

    if (email != "" && senha != "" && confirmarSenha != "" && senha == confirmarSenha) {
        users.push([email, senha])
        localStorage.setItem("Usuários", JSON.stringify(users))
        Swal.fire({
            icon: 'success',
            title: 'Cadastro feito com sucesso!',
            text: `Email: ${email}, Senha: ${senha}`,
            confirmButtonText: ' Ok '
        }
        )
        sectionCadastro.classList.remove('active')
        sectionLogin.classList.add('active')
    }
    else {
        Swal.fire({
            icon: 'error',
            title: 'Algo ocorreu errado!',
            text: 'Dados Inválidos, confira o formulário e envie novamente!'
        })
    }
}



function logar() {
    let email = document.getElementById('entrarEmail').value
    let senha = document.getElementById('entrarSenha').value

    let arrayUsers = JSON.parse(localStorage.getItem("Usuários"))
    arrayUsers.forEach(credencial => {
        if (email == credencial[0] && senha == credencial[1]) {
            let timerInterval
            Swal.fire({
                icon: 'success',
                title: 'Logado com sucesso!',
                text: `Você está sendo redirecionado para a página principal!`,
                timer: 2000,
                timerProgressBar: true,
                didOpen: () => {
                    Swal.showLoading()
                    const b = Swal.getHtmlContainer().querySelector('b')
                    timerInterval = setInterval(() => {
                        b.textContent = Swal.getTimerLeft()
                    }, 100)
                },
                willClose: () => {
                    clearInterval(timerInterval)
                }
            }).then((result) => {
                if (result.dismiss === Swal.DismissReason.timer) {
                    window.open('./home.html', '_self')
                }
            })
            localStorage.setItem("logado", true)
        }
        else {
            Swal.fire({
                icon: 'error',
                title: 'Credenciais inválidas!',
                text: ``,
                confirmButtonText: `Ok `
            }
            )
            localStorage.setItem("logado", false)
        }
    })
}

