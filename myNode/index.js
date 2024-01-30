require('dotenv').config();
const express = require('express');

const app = express();

const jsonObject = {
    "name" : "Roshan",
    "address" : "NY",
    "height" : 6.3,
}

app.get('/', (req, res) => {
    res.send("<h1>Welcome to my Website</h1>");
})

app.get('/login', (req, res) => {
    res.send("<h2>This is the Login page</h2>");
});

app.get('/json', (req, res) => {
    res.json(jsonObject);
})

app.listen(process.env.PORT, () => {
    console.log(`Server listening at the port ${process.env.PORT}`)
})