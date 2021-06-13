function myScope() {
    const form = document.querySelector('.form');
    const result = document.querySelector('.result');

    const people = [];

    function getEventForm(event) {
        event.preventDefault();

        const name = form.querySelector('.name');
        const lastName = form.querySelector('.lastName');
        const weight = form.querySelector('.weight');
        const height = form.querySelector('.height');

        let person = {
            name: name.value,
            lastName: lastName.value,
            weight: weight.value,
            height: height.value
        };

        people.push(person);
        result.innerHTML += `<p> ${person.name} ${person.lastName} ${person.weight} ${person.height} </p>`;

        console.log(people);

    }

    form.addEventListener('submit', getEventForm);
}
myScope();
