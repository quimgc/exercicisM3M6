<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of menorNumeroSumaDigitsPHP
 *
 * @author quim
 */
class menorNumeroSumaDigitsPHP {

    //put your code here

    public function sumatoriDigits($num) {
        if ($num < 10) {
            return $num;
        }

        $compt = (int) ($num / 9);
        
        $primerNumero = (int) ($num % 9);
        
        if ($primerNumero != 0) {
            $numResultat = $primerNumero;
        }



        while ($compt != 0) {
            $numResultat = $numResultat . 9;

            $compt--;
        }

        return $numResultat;
    }

}

$sumatori = new menorNumeroSumaDigitsPHP();

fscanf(STDIN, "%d\n", $num);

while ($num != 0) {

    echo $sumatori->sumatoriDigits($num) . "\n";
    fscanf(STDIN, "%d\n", $num);
}
