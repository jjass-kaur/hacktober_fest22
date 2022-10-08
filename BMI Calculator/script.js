// alert("Hello");
/*
var weight = prompt("Enter weight");
var height = prompt("Enter height");
var bmi = weight / (height * height);
alert("Your BMI is " + bmi);
*/

/*var num = prompt("Guess what number I am thinking of?");

if (num == 10) {
  alert("You cheated!");
}

if (num != 10) {
  alert("Try again!");
}
*/

/*
var a = prompt("How much money are you investing?");
if (a > 10000) {
  alert("Please contact us at 6531 1555 immediately!");
} else if (a > 5000) {
  alert("Please DIY and create an account");
} else alert("Please go somewhere else");
*/

/*
and &&
or || (2 long strokes)
not !
*/
/*
function calcBMI() {
  var weight = prompt("enter weight in KG");
  var height = prompt("enter height in M");
  var bmi = weight / (height * height);
  alert("your BMI is" + bmi);
  if (bmi < 18.5) {
    alert("Please eat more");
  } else if (bmi < 25) {
    alert("All good");
  } else {
    alert("Please exercise");
  }
}
*/
function calcBMI() {
    var weight = document.getElementById("weightField").value;
    var height = document.getElementById("heightField").value;
    var output1 = document.getElementById("output1");
    var output2 = document.getElementById("output2");

    var bmi = weight / (height * height);
    output1.innerHTML = "your BMI is" + bmi;

    if (bmi < 18.5) {
        output2.innerHTML = "INCREASE YOUR WEIGHT";
    } else if (bmi < 25) {
        output2.innerHTML = "You are all good";
    } else {
        output2.innerHTML = "DECREASE YOUR WEIGHT";
    }
}
