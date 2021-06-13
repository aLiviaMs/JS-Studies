function temperature(degreeType, valueTemperature) {
    let transformationDegreeType;  

    if(degreeType == 'C' || degreeType == 'c') {
        transformationDegreeType = valueTemperature * 9/5 + 32;

        return transformationDegreeType;
    }   else if(degreeType == 'F' || degreeType == 'f') {
        transformationDegreeType = (valueTemperature - 32) * 5/9;

        return transformationDegreeType;
    }
}

console.log(temperature('F', Number('104')));