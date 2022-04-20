let meuVideo = document.getElementById('meuVideo')
const titulo = document.querySelector('.tituloVideo')

const botoesVideos = document.querySelectorAll('.divButton button')
const arrayBotoes = [...botoesVideos]
const botao01 = arrayBotoes[0]
const botao02 = arrayBotoes[1]


function selecionarValor(){
    const select = document.getElementById('selectModulo').value
    
    if(select == "D"){
        botao01.innerHTML = "Vídeo 07"
        botao02.innerHTML = "Vídeo 08"
    }
    if(select == "C"){
        botao01.innerHTML = "Vídeo 05"
        botao02.innerHTML = "Vídeo 06"
    }
    if(select == "B"){
        botao01.innerHTML = "Vídeo 03"
        botao02.innerHTML = "Vídeo 04"
    }
    if(select == "A"){
        botao01.innerHTML = "Vídeo 01"
        botao02.innerHTML = "Vídeo 02"
    }
}

function video01(){
    const video01 = document.querySelector('.video01')
    const video02 = document.querySelector('.video02')

    titulo.innerHTML = "Vídeo 01"
    video02.style.display = "none"
    video01.style.display = "block"

    botao02.classList.remove('pressionado')
    botao01.classList.add('pressionado')
}


function video02(){
    titulo.innerHTML = "Vídeo 02"
    const video01 = document.querySelector('.video01')
    const video02 = document.querySelector('.video02')
    video01.style.display = "none"
    video02.style.display = "block"
    
    botao01.classList.remove('pressionado')
    botao02.classList.add('pressionado')
}

