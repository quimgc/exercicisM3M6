<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of Rectangle
 *
 * @author quim
 */
include ("Punt.php");

class Rectangle {
    //put your code here

    private $p1;
    private $p3;
    private $base;
    private $altura;

    function __construct($p1, $p3) {
        $this->p1 = $p1;
        $this->p3 = $p3;
        $this->base = $p1->Punt::distanciaX($p3);
        $this->altura = $p1->Punt::distanciaY($p3);
        
    }
    
    public function Perimetre(){
        return 2*($this->base+$this->altura);
    }
    public function Area(){
        return $this->base*$this->altura;
    }
        public function Centre(){
        return new Punt($this->p1.x + base/2, $this->p1.y + altura/2);
    }
    
    
    public function CentreV2(){
        return new Punt(($this->p1.x+$this->p3.x)/2,($this->p1.y+$this->p3.y)/2);
    }
    
    
}

$p1 = new Punt(0, 0);
$p3 = new Punt(3, 2);
