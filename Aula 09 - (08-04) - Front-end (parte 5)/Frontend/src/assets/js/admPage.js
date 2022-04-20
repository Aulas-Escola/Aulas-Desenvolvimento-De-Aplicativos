const nodeList = document.querySelectorAll('.opcoesAdm .tituloOpcao p')
const arrayInputs = Array.from(nodeList);


arrayInputs.forEach(e => {
    e.addEventListener('click', function (event) {
        const nodeFilhos = e.parentElement.children
        const arrayFilhos = Array.from(nodeFilhos);
        console.log(arrayFilhos);
        // arrayFilhos.forEach(filho => {
        //     if (filho.classList != "tituloOpcao") {
        //         filho.classList.toggle('active')
        //     }
        // })
        // const imgLateral = document.querySelector( '#' + e.id+ ' .tituloOpcao p span i')

        // if (imgLateral.classList.value == "fa-solid fa-circle-arrow-down") {
        //     imgLateral.classList.remove('fa-circle-arrow-down')
        //     imgLateral.classList.add('fa-circle-arrow-up')
        // }
        // else if (imgLateral.classList.value == "fa-solid fa-circle-arrow-up") {
        //     console.log('seta Pra cima');
        //     imgLateral.classList.add('fa-circle-arrow-down')
        //     imgLateral.classList.remove('fa-circle-arrow-up')
        // }
    })
})

