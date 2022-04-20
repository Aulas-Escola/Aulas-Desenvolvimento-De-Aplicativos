// Menu Mobile

const botaoMobile = document.getElementById('botao-mobile')

const toggleMenu = (event)=>{
    if(event.type === 'touchstart'){
        event.preventDefault()
    }
    const nav = document.querySelector('.nav-header')
    nav.classList.toggle('active')

}

botaoMobile.addEventListener('click', toggleMenu)
botaoMobile.addEventListener('touchstart', toggleMenu)


// Animação Botão

function cadastrarNoEvento(){
    Swal.fire(
        'Cadastro Concluído',
        'Parabéns você realizou seu pré-cadastro',
        'success'
    )
}

function executando(){
    if(localStorage.logado){
        document.getElementById('logarNaConta').style.display = "none"
        document.getElementById('alterarDados').style.display = "block"
    }
    else{
        document.getElementById('alterarDados').style.display = "none"
        document.getElementById('logarNaConta').style.display = "block"
    }
    
}