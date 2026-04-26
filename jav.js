const submit = document.getElementById("submit")

submit.addEventListener("click",()=>{
 const productName = document.getElementById("ProductName").value
 const productQuantity = document.getElementById("ProductQuantity").value
 const price = document.getElementById("Price").value

 let Product = {
     ProductName : productName,
    ProductQuantity:productQuantity,
    Price:price
 }

 display(Product);
})

function display(Product){
    const myHeaders = new Headers();
myHeaders.append("Content-Type", "application/json");

const raw = JSON.stringify({
  "Price": "500",
  "ProductName": "pokemon",
  "ProductQuentity": "1",
  "id": "1"
});

const requestOptions = {
  method: "POST",
  headers: myHeaders,
  body: JSON.stringify(Product),
  redirect: "follow"
};

fetch("http://localhost:8080/api/product", requestOptions)
  .then((response) => response.text())
  .then((result) => console.log(result))
  .catch((error) => console.error(error));
}