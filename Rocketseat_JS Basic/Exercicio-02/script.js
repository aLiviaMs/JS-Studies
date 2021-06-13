let gastoFamiliar = {
    receitas: [100, 160, 13],
    despesas: [98, 12, 12]
}

function soma(array) {
    let total = 0;

    for(let valor of array){
        total = total + valor;
    }

    return total;
}

function calculoTotal() {
    let saldoFamilia = soma(gastoFamiliar.receitas) - soma(gastoFamiliar.despesas);

    if(saldoFamilia >= 0){
        console.log(` O seu saldo é positivo. Saldo total: ${saldoFamilia}R$ `)
    } else {
        console.log(` O seu saldo é negativo. Saldo 
        disponível: ${saldoFamilia} R$ `)
    }

}

calculoTotal();