
<?php

class PrimeraClasse {
    //l'atribut es defineix amb var.
    var $atribut = "Atribut visible per qualsevol lloc (public)";
    public static $pub = "public";
    private $prive = "private"; //unicament aquesta classe
    protected $proc = "protected";
    
    
    
    function __construct($param){
        $this -> atribut = $param;
    }
    
    public function mostrar(){
        
        //aixi fem referencia a l'atribut.
        echo $this->atribut;
    }
    
    public static function mostrarEstatic(){
    
        echo "\n".Primeraclasse::$pub;
        
    }
    public function parametresVariables(){
        $params = func_get_args();
        //var_dump($params);
        print_r($params);
        echo "\nparametresVariables";
    }
    
    

}


//
//$obj = new PrimeraClasse("Quim puto amo ");    
//$obj1 = new PrimeraClasse(123443);    
//
//$obj->mostrar();
//
//
////per utilitzar el metode estàtic s'ha de fer a través de la classe. 
//PrimeraClasse::mostrarEstatic();
//
//
//$obj1->parametresVariables(1, 'a', 3, 'aaaa');

$a = true;
var_dump($a);
