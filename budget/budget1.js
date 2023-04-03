/*form2 function*/
function myfun(){
    var a=document.getElementById("id1").value;
    document.getElementById("id3").innerHTML +=a +"<br>";

    var b=new Array();
    b=document.getElementById("id2").value; 
    document.getElementById("id4").innerHTML+=b+"<br>";

    /*icons delete and edit pencil*/
    document.getElementById("id8").innerHTML+='<i class="fa fa-pencil-square-o" aria-hidden="true"></i> <i class="fa fa-trash" aria-hidden="true" style="color: red;"></i>'+ "<br>";
    
    /*addition expenses value*/
    document.getElementById("id7").innerHTML=Number(document.getElementById("id7").innerHTML)+Number(b);
    document.getElementById("form2").reset();

    /*subtracting expenses from budget*/
    var balance = Number(document.getElementById("id6").innerHTML)-Number(document.getElementById("id7").innerHTML);
    
    document.getElementById("id9").innerHTML=balance;

    
}
/*form1 function*/
function mybal(){
    var c=document.getElementById("id5").value;
    document.getElementById("id6").innerHTML = Number(c);
}
table.addEventListener('click', (f) => {

    if(f.target.className == 'delete'){

      const td = f.target.parentElement;

      console.log(td);

      td.parentNode.removeChild(td);

    }

});