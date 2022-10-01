//challenge 1 : age in days
function ageinDays(){
    var birthyear = prompt('what year were you born?');
    var age = (2022 - birthyear)*365;
    var h2 = document.createElement('h2');
    var textanswer = document.createTextNode('you are '+age+' days old! ');
    h2.setAttribute('id','age');
    h2.appendChild(textanswer);
    document.getElementById('flexboxresult').appendChild(h2);
}
function reset(){
    document.getElementById('age').remove();
}

