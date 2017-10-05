<?php

$menor = PHP_INT_MAX;

fscanf(STDIN, "%d\n", $sumaDigits);
fscanf(STDIN, "%d\n", $numStr);

while($numStr !=0){
    
    $suma = 0;
    
    for($i = 0; $i< strlen($numStr); $i++){
        $suma += (int) substr($numStr, $i, 1);
        
        }
        if($suma == $sumaDigits) {
            if((int) $numStr < $menor){
                $menor = $numStr;
                
            }
        }
        fscanf(STDIN,"%d\n", $numStr);
    
}

echo $menor . "\n";


