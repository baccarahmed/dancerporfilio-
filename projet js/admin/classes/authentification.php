<?php




class authentication
{
    private $db;

    public function __construct()
    {

        try {
            $this->db = new PDO('mysql:host=localhost;dbname=events', 'root', ''); //PDO cree une objet ala base
        } catch (Exception $e) {
            die("error : " . $e->getMessage());
        }
    }
    //signup
    public function signup($data)
    {
        $username=$data['username'];
        $password=md5($data['password']);
        $email=$data['email'];
        $role="ROLE_CLIENT";
        $this->db->exec("INSERT INTO users  values('','$username','$password','$email','$role')");
    }
    //sign in
        public function signin($data){
        $email=$data['email'];
        $password=md5($data['password']);
        return $this->db->exec("SELECT * FROM users WHERE email='$email' AND password='$password'");
        }
}

