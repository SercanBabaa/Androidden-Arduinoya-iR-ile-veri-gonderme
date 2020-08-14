# Androidden-Arduinoya-iR-ile-veri-gonderme


Proje Arduino Uno ve Xiaomi A2 Lite ile denendi.

Android cihazda dahili kızılötesi donanımın bulunması gerekiyor.


AndroidManifest.xml dosyasında

android.permission.TRANSMIT_IR

iznini vermeyi unutmayın.




ÇALIŞMA MANTIĞI

Kodlar incelendiğinde de anlaşılacağı gibi, androidle kızılötesi sinyal gönderdiğimizde, kızılötesi lamba, gönderdiğimiz koda göre, belli bir süre yanıp sönüyor. 
Örneğin; ben 25 gönderirsem, yaklaşık 25000 mikrosaniye yanıp sönüyor. 
Arduino kısmında ise biz kesmenin ne kadar süre HIGH, ne kadar süre LOW kenarda kaldığına bakıyoruz ve farkını alarak yükselen kenar süresini buluyoruz. 
Bu sürede optimizasyon için küçük değişiklikler yaprık. Mesela +500 mikro saniye verip, alta yuvarlıyoruz.
Böylece küçük sapmalar önemsiz oluyor.
Sizler bu kütüphaneleri daha kullanışlı hale getirebilirsiniz.
Burada sadece mantığını anlamanıza yardımcı olmaya çalıştım.


Kolay gelsin. :)
