import express from "express"
import path from 'path'
const app=express()
app.use(express.json())

app.get("/",(req,res)=>{
    res.send("Hello from express App")
})
app.get("/home",(req,res)=>{
    res.sendFile(path.join(__dirname,'/index.html'))
})

app.post("/data",(req,res)=>{
    console.log(req.body)
    res.send("data received")
})

const server=app.listen(5059,()=>{
    console.log(server.address().address)
    console.log(server.address().port)
})