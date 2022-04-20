const textBanner = document.querySelector('[text-banner]')

const cursos = ["HTML5", "CSS", "Bootstrap", "JavaScript", "Node", "React" , "Python", "Java"]

let messageIndex = 0
let characterIndex = 1
let currentMessage = ''
let currentCharacters = ''

const type = () => {
    if(messageIndex === cursos.length){
        messageIndex = 0
    }

    currentMessage = cursos[messageIndex]
    currentCharacters = currentMessage.slice(0, characterIndex ++)
    textBanner.innerHTML = currentCharacters

    if(currentCharacters.length == currentMessage.length){
        messageIndex++
        characterIndex = 0
    }
    
}

setInterval(type, 300)