<?php

class Client
{
    //connection a la base de donnée
    private $db;

    public function __construct(){
        $this->db=new PDO('mysql:host=localhost;dbname=events','root','');

    }
}