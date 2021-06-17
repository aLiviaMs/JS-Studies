function IMC() {
    const form = document.querySelector('.form');
    const resultado = document.querySelector('.resultado');

    function calculoIMC(event) {
        event.preventDefault();

        const peso = document.querySelector('#peso');
        const altura = document.querySelector('#altura');
        const contaIMC = peso.value / (altura.value * altura.value);


        if (isNaN(peso.value) || peso.value == "") {
            resultado.innerHTML = `<p> Peso inválido </p>`;
            resultado.style.backgroundColor = "#fa7f72";
        }
        else if (isNaN(altura.value) || altura.value == "") {
            resultado.innerHTML = `<p> Altura inválida </p>`;
            resultado.style.backgroundColor = "#fa7f72";
        }
        else if (contaIMC < 18.5) {
            resultado.innerHTML = `<p> Seu IMC é ${contaIMC.toFixed(2)} e você está abaixo do peso</p>`;
            resultado.style.backgroundColor = "#2d572c";
        }
        else if (contaIMC >= 18.5 && contaIMC <= 24.9) {
            resultado.innerHTML = `<p> Seu IMC é ${contaIMC.toFixed(2)} e você está com o peso normal</p>`;
            resultado.style.backgroundColor = "#2d572c";
        }
        else if (contaIMC >= 25 && contaIMC <= 29.9) {
            resultado.innerHTML = `<p> Seu IMC é ${contaIMC.toFixed(2)} e você está com Sobrepeso</p>`;
            resultado.style.backgroundColor = "#2d572c";
        }
        else if (contaIMC >= 30 && contaIMC <= 34.9) {
            resultado.innerHTML = `<p> Seu IMC é ${contaIMC.toFixed(2)} e você está com Obesidade grau 1</p>`;
            resultado.style.backgroundColor = "#2d572c";
        }
        else if (contaIMC >= 35 && contaIMC <= 39.9) {
            resultado.innerHTML = `<p> Seu IMC é ${contaIMC.toFixed(2)} e você está com Obesidade grau 2</p>`;
            resultado.style.backgroundColor = "#2d572c";
        } else {
            resultado.innerHTML = `<p> Seu IMC é ${contaIMC.toFixed(2)} e você está com Obesidade grau 3</p>`;
            resultado.style.backgroundColor = "#2d572c";
        }

    }

    form.addEventListener('submit', calculoIMC);
}
IMC();
