let nota = 70;
let notaFinal;

let valueA = nota >= 90;
let valueB = nota >=80 && nota <= 89;
let valueC = nota >=70 && nota <= 79;
let valueD = nota >=60 && nota <= 69;
let valueF = nota < 60;

if(valueA) {
    notaFinal = 'A';
} else if(valueB) {
    notaFinal = 'B';
} else if(valueC) {
    notaFinal = 'C';
} else if(valueD) {
    notaFinal = 'D';
} else if(valueF) {
    notaFinal = 'F';
}

console.log(notaFinal)