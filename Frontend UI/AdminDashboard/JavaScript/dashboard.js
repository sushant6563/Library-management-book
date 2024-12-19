
let list = document.querySelectorAll(".navigation li");

function activeLink() {
    list.forEach((item) => {
        item.classList.remove("hovered");
    });
    this.classList.add("hovered");
}

list.forEach((item) => item.addEventListener("mouseover", activeLink));


let toggle = document.querySelector(".toggle");
let navigation = document.querySelector(".navigation");
let main = document.querySelector(".main");

toggle.onclick = function() {
    navigation.classList.toggle("active");
    main.classList.toggle("active");
};


let tableBtn = document.querySelector("#table-btn");
let table = document.querySelector(".table");

tableBtn.addEventListener("click", function() {
    table.classList.toggle("active");
});


function confirmLogout() {
    if (confirm("Are you sure you want to log out?")) {
   
        window.location.href = "../../../Abhinaya/Admin/admin.html";
    } else {
      
        return false;
    }
}


function user() {
    window.location.href = "../HTML/User.html";
}

function admin() {
    window.location.href = "../HTML/Dashboard.html"
}