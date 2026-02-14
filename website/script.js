const materials = [
  { name: "Portland Cement", unit: "50kg bag", price: "$8.40" },
  { name: "Reinforcement Steel", unit: "12m bar", price: "$11.20" },
  { name: "Concrete Blocks", unit: "per block", price: "$1.35" },
  { name: "Premium Timber", unit: "per plank", price: "$6.00" },
  { name: "PVC Pipes", unit: "3m length", price: "$4.75" },
  { name: "Roofing Sheets", unit: "per sheet", price: "$14.50" }
];

const productsEl = document.getElementById("products");
materials.forEach((item) => {
  const card = document.createElement("article");
  card.className = "card";
  card.innerHTML = `
    <h3>${item.name}</h3>
    <p><strong>Unit:</strong> ${item.unit}</p>
    <p><strong>From:</strong> ${item.price}</p>
  `;
  productsEl.appendChild(card);
});

const form = document.getElementById("quoteForm");
const message = document.getElementById("formMessage");

form.addEventListener("submit", (event) => {
  event.preventDefault();

  if (!form.checkValidity()) {
    message.textContent = "Please fill out all required fields before submitting.";
    message.style.color = "#b91c1c";
    return;
  }

  const name = form.elements.name.value.trim();
  message.textContent = `Thanks ${name}! Your quote request has been received.`;
  message.style.color = "#166534";
  form.reset();
});

document.getElementById("year").textContent = new Date().getFullYear();
