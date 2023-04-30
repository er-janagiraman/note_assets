window.onload = function() {
	document.getElementById("register").style.display = "none";
};

function hide(a) {

	if (a == 1) {
		document.getElementById("login").style.display = "block";
		document.getElementById("register").style.display = "none";
	} else if (a == 2) {
		document.getElementById("login").style.display = "none";
		document.getElementById("register").style.display = "block";
	}
}