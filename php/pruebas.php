<?php

/*
$msj = "hola lalala \n";
echo($msj);

echo "debe ir seguida de un pto y coma";
*/

/*
for($i = 0; $i < 20 ; $i++){

	echo "$i % 3 =".($i % 3)."\n";
}
*/

/*
$str = "hola'<como estas ; == &";

echo htmlspecialchars_decode(htmlspecialchars($str))."\n";

echo mysql_real_escape_string($str);

*/

$arr =  array('a' => 1, 'b' =>2, 'c'=>3, 'socio' => array('uno' => "unos", 'dos' => 'dosos'));

foreach ($arr as $arreglo => $value) {

	echo $value."\n";
}

echo json_encode($arr);

?>