const booksByCategory = [
    {
        category: "Riqueza",
        books: [
            {
                title: "Os segredos da mente milionária",
                author: "T. Marv Eker",
            },
            {
                title: "O homem mais rico da Babilônia",
                author: "George S. Clasen",
            },
            {
                title: "Pai rico, pai pobre",
                author: "Robert T. Kiyusaki e Sharon L. Letcher",
            },
        ],
    },
    {
        category: "Inteligência Emocional",
        books: [
            {
                title: "Você é insubstituivel",
                author: "Augusto Cury",
            },
            {
                title: "Ansiedade - Como enfrentar o mal do século",
                author: "Augusto Cury",
            },
            {
                title:"Os 7 hábitos das pessoas altamente eficazes",
                author: "Stephen R. Covey",
            },
        ],
    },
];

//1
const totalCategories = booksByCategory.length;
console.log('Total de Categorias:', totalCategories);

for(let category of booksByCategory) {
    let totalCategoryBooks = category.category;
    let totalBooks = category.books.length;

    console.log('Categoria: ' + totalCategoryBooks, ', Total Livros:', totalBooks)
}

//2
function countAuthors() {
    let authors = [];
    for(let category of booksByCategory) {
        for(let book of category.books) {
            if(authors.indexOf(book.author) == -1) {
                authors.push(book.author)
            } 
        }
    }
    console.log('Total de autores:', authors.length)
}

countAuthors();

//3
function countBooksAugustoCury() { 
    let booksCury = [];

    for(let category of booksByCategory){
        for(let book of category.books){
            if(book.author.indexOf("Augusto Cury") != -1){
                booksCury.push(book.title)
            }
        }
    }
    
    console.log(`Livros do autor, Augusto Cury:  ${booksCury.join(", ")}.`);
}

countBooksAugustoCury();

//4
function countBooksAuthor(author) {
    let booksAuthor = [];

    for(let category of booksByCategory){
        for(let book of category.books){
            if(book.author == author){
                booksAuthor.push(book.title)
            }
        }
    }
    
    console.log(`Livros do autor, ${author}:  ${booksAuthor.join(", ")}.`);
}

countBooksAuthor("Stephen R. Covey");