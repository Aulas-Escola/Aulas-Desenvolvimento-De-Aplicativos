const titulo = document.querySelector('.resumo-pedido .titulo')
const divImagem = document.querySelector('.resumo-pedido img');

const nodeList = document.querySelectorAll('.metodo input');
const arrayInputs = Array.from(nodeList);

function pagamento(){
    arrayInputs.forEach(input => {
        if(input.checked == true){
            const idDiv = input.parentElement.id
            document.querySelector('#' + idDiv + ' p').classList.add('active')
        }
        else{
            const idDiv = input.parentElement.id
            document.querySelector('#' + idDiv + ' p').classList.remove('active')
        }
    })
}

titulo.innerHTML = localStorage.getItem('tituloCurso')
divImagem.setAttribute('src', localStorage.getItem('imageCurso'));

function comprar(){
    Swal.fire(
        'Produto comprado com sucesso!',
        'O produto já está disponível na aba cursos.',
        'success'
    )
}