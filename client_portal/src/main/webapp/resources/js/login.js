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

function submitLogin() {
    var data = {
        username: document.getElementById("username").value,
        password: document.getElementById("password").value
    };

    fetch('/login', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(data)
    })
    .then(response => response.json())
    .then(response => {
        if (response.success) {
            // Redirect to the dashboard page
            window.location.href = '/dash';
        } else {
            // Handle error response here
            console.log(response.message);
        }
    })
    .catch(error => {
        // Handle any network or server error here
        console.log('An error occurred:', error);
    });
}
