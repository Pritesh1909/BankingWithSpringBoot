document.getElementById("login_button").addEventListener("click", sendData);

function sendData() {

    const name = document.getElementById("username").value;
    const pass = document.getElementById("password").value;
    const url = "http://localhost:8080/login";
    const xhr = new XMLHttpRequest();

    xhr.open("POST", url, true);
    xhr.responseType = "json";
    xhr.onload = () => {
        if (xhr.status === 200) {

            console.log(xhr.response);
        }
        else {
            console.log("error");
        }
    }
    data = `{"username":"${name}","password":"${pass}"}`;
    xhr.send(data);
};
