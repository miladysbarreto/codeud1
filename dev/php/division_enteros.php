<?php

echo "introduzca un numero:";
$numero1=stream_get_line(STDIN, 1024,PHP_EOL);
echo "Introduzca un numero:";
$numero2=stream_get_line(STDIN,1024,PHP_EOL);
echo "La division de ". $numero1. "/".$numero2."=". ($numero1/$numero2);
?>