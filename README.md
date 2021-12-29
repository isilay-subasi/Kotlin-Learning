# Kotlin 


<h2><b> Kotlin Veri Tipleri </b></h2>

+ Number ==> Byte , Short, Int , Long , Float , Double<br>
+ Boolean<br>
+ Char<br>
+ Arrays<br>
+ Strings<br>

Bir değişken tanımlamak istenirse val ya da var ile başlamamız gerekiyor.<br>
val -> value
var -> variable <br>

Val ile değişken tanımlarken bu değişkenin degerini bir daha değiştiremeyeceğimiz anlamına gelirken <b>(Aslında bunun bir adi var IMMUTABLE)</b> , var ile tanımladığımız bu değişkeni daha sonra tekrardan deger atayabiliriz<b> (MUTABLE ).</b>
<hr>

<h2><b>Kotlin'de Primitif Tipler Yoktur</b></h2>


Kotlin’de Java’daki int, long, float gibi primitive tipler yoktur. Her şey metodunu çağırabileceğimiz bir object’tir. Java’daki primitive tip olan int‘e karşılık Kotlin’de Int vardır ve Int super-type’ı <b>Any</b> olan bir sınıftır.


<h2><b>Primitive Tip nedir?</b></h2>

Stack uzerinde tutulan, boyutları sabit, hızlı erişilebilen ilkel tiplerdir.



<h2><b>Reference Type nedir?</b></h2>

Stack uzerinde değişkenin bellek adresi tutulur ve değişkenin degeri ise bellekte adresinin gösterildiği yerde tutulur.<br>
<b>Not:</b> Değişkenin primitive olarak tutulması olayına <b>UNBOXED</b>, değişkenin obje referansı olarak tutulması olayına <b>BOXED</b> olarak adlandırılır.

<h2><b>Type Inference nedir?</b></h2>

Type Inference, bir programlama dilinde bir ifadenin veri türünün otomatik olarak algılanmasını ifade eder. Kotlin, statik yazılmış bir dildir ancak tür çıkarımını da beraberinde getirir, böylece çok gerekli olmadıkça türü açıkça belirtmeniz gerekmez.


<h2><b>Type Conversion nedir?</b></h2>
Türkçe karşılığı tip dönüşümüdür. Küçükten büyüğe tip dönüşümü yapılabilir fakat büyükten küçüğe tip dönüşümü yapılamaz.

+ <b>Implicit Type Conversion:</b> Örtülü — belirgin olmayan sekilde tip dönüşümü. Ornek vermek gerekirse iki farklı tipdeki sayının toplanmasıyla sonucun büyük tipi kavraması sonucu implicit convert yapılır.
+ <b>Explicit Type Conversion:</b> Açık — belirgin tip dönüşümü. number.toString( ) ornek verilebilir.

<b>Not: Kotlin’de implicit type conversion yoktur.</b><br>
<i>toByte(), toShort(), toInt(), toLong(), toDouble(), toFloat(), toChar(), toString(), toUByte(), toUShort(), toUInt(), toULong(), toDuration(), toBigDecimal(), toBigInteger().</i>

<h2><b>Karakterler (Characters)</b></h2>




