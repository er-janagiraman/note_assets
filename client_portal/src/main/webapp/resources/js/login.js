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

$(function() {
	// Set the maximum date to one year ago
	var maxDate = new Date();
	maxDate.setFullYear(maxDate.getFullYear() - 1);

	// Set the maximum date to today
	var today = new Date();

	// Set the year range to be from 100 years ago to the current year
	var maxYear = new Date().getFullYear() - 5;
	var minYear = maxYear - 90;

	$("#dob").datepicker({
		yearRange : minYear + ":" + maxYear,
		dateFormat : "dd-mm-yy",
		changeMonth : true,
		changeYear : true
	});

	// Disable future dates
	$("#dob").datepicker("option", "beforeShowDay", function(date) {
		var today = new Date();
		return date <= today ? [ true, "" ] : [ false, "" ];
	});

});
