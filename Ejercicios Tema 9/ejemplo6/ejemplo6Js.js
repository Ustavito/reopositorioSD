var t = prompt("Ingrese titulo", );
var g = prompt("Ingrese grupo", );
var a = prompt("Ingrese año", );




function CDMusicaConstructor (title, group, year){
	this.titulo = title;
	this.grupo = group;
	this.anio = year;

	this.toString = function (){
		alert("Titulo: " + this.titulo +
		"\nGrupo: " + this.grupo + 
		"\nAño: " + this.anio);
}
}

var cd = new CDMusicaConstructor (t, g, a);

cd.toString();
