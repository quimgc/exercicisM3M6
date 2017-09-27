<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of Punt
 *
 * @author quim
 */
class Punt {

    //put your code here

    private $x;
    private $y;

//    function __construct() {
//        $punt = func_get_args();
//        if ($punt) {
//            $this->x = $punt['0'];
//
//            $this->y = $punt['1'];
//        } else {
//
//            $this->x = 0;
//
//            $this->y = 0;
//        }
//    }
//    
    function __construct($x, $y) {
        $this->x=$x;
        $this->y=$y;

    }
    
    public static function demanarPunt(){
        
        $x=0;
        $y=0;
        fscanf(STDIN, "%d\n", $x);
        fscanf(STDIN, "%d\n", $y);

        return new Punt($x,$y);
    }

    public function mostrar() {

        return "($this->x,$this->y)";
    }

    public function distanciaX($punt) {
        return ($punt->x) - ($this->x);
    }

    public function distanciaY($punt) {
        return ($punt->y) - ($this->y);
    }

    public function distanciaPunt($punt) {
        return Math . sqrt(Math . pow($this->distanciaX($punt), 2) + Math . pow($this->distanciaY($punt), 2));
    }

}

$obj = new Punt(1, 2);
$ob2 = new Punt(3, 4);

//echo $obj->mostrar();

//echo $obj->distanciaX($ob2);


$obj3 = new Punt(2,3);
$obj3::demanarPunt();
echo $obj3->mostrar();