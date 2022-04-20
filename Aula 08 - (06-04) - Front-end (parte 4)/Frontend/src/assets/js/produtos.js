const nodeListLinks = document.querySelectorAll('.cardsAtividades .cards a')

// Adicionando a função de ir para a página de compras
nodeListLinks.forEach(links => {
    
    links.addEventListener('click', (e) => {
        e.preventDefault()
        localStorage.removeItem('tituloCurso')

        const cardId = (links.parentNode.parentElement.id);

        const titulo = document.querySelector('#' + cardId + ' p a').innerText
        const imagemCard = document.querySelector('#' + cardId + ' img').src

        salvarLocalStorage(imagemCard,titulo)

        window.open('pagamento.html', '_self')
    })
})

function salvarLocalStorage(imagemCard, titulo) {
    localStorage.setItem('imageCurso', imagemCard)
    localStorage.setItem('tituloCurso', titulo)
}