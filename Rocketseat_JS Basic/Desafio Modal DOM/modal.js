const button = document.querySelector('#openModal')
const div = document.querySelector('div')

button.addEventListener('click', function() {
    div.classList.remove("invisible")
})

document.addEventListener('keydown', function(event) {
    if (event.key === "Escape" && div.classList.contains("invisible") === false) {
        div.classList.add("invisible")
        console.log("aaa")
    }
})