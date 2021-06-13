// 1. Declare uma variável de nome weight
    let weight;
// 2. Que tipo de dado é a variável acima?
    console.log(typeof weight);
/* 
    3. Declare uma variável e atribua valores para cada um dos dados:
        * name: String 
        * age: Number (integer)
        * stars: Number (float)
        * isSubscribed: Boolean
    

*/
    let name = 'Lívia';
    let age = 18;
    let stars = 2.4;
    let isSubscribed = true;

/*
    4. A variável student abaixo é de que tipo de dados?
        Objeto 
        console.log(typeof student);

    4.1 Atribua a ela as mesmas propriedades e valores do exercício 3.

    4.2 Mostre no console a seguinte mensagem: 

        <name> de idade <age> pesa <weight> kg.

        Atenção, substitua <name> <age> e <weigjt> por valores de cada propriedade do objeto
*/

let student = {};

//4.1 Resposta
    let student = {
        name: 'Lívia',
        age: 18,
        weight: 2.4,
        isSubscribed: true,
    };

//4.2 Resposta
    console.log(` ${student.name} de idade ${student.age} pesa ${student.weight} kg `);


/*
    5. Declate uma váriavel do tipo Array de nome students e atribua a ela nenhum valor, ou seja, somente o Array vazio.

*/
    let students = [];

/* 
    6. Reatribua valor para a variável acima, colocando dentro dela o objeto student da questão 4. (Não copiar e colar o objeto, mas usar o objeto criado e inserir ele no Array)
*/
    let students = [
        student
    ];
/*
    7. Coloque no console o valor da posição zero do Array acima
*/
console.log(students[0]);

/* 
    8. Crie um novo student e coloque na posição 1 do Array students
    
*/

let student02 = {
    name: 'João',
    age: 18,
    weight: 2.8,
};

students[1] = john;

/* 
    9. Sem rodar o código responda qual é a resposta do código abaixo e por que? Após sua resposta, rode o código e veja se você acertou.

    console.log(a)
    var a = 1
*/
    // O valor será indefinido, pois embora a variavel esteja sendo declarada após o console.log, ela é do tipo var, ou seja, global e sua declaração ja é pega no inicio da execução do projeto.