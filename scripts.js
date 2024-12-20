// Form Validation for Login and Registration
document.addEventListener("DOMContentLoaded", function () {
    const loginForm = document.getElementById("loginForm");
    const registerForm = document.getElementById("registerForm");

    if (loginForm) {
        loginForm.addEventListener("submit", function (e) {
            const email = document.getElementById("email").value.trim();
            const password = document.getElementById("password").value.trim();

            if (!email || !password) {
                alert("Please fill out all fields.");
                e.preventDefault();
            } else if (!validateEmail(email)) {
                alert("Please enter a valid email address.");
                e.preventDefault();
            }
        });
    }

    if (registerForm) {
        registerForm.addEventListener("submit", function (e) {
            const name = document.getElementById("name").value.trim();
            const email = document.getElementById("email").value.trim();
            const password = document.getElementById("password").value.trim();

            if (!name || !email || !password) {
                alert("All fields are required.");
                e.preventDefault();
            } else if (!validateEmail(email)) {
                alert("Please enter a valid email address.");
                e.preventDefault();
            }
        });
    }

    // Email validation function
    function validateEmail(email) {
        const regex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        return regex.test(email);
    }
});
