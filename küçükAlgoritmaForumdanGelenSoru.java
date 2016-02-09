// Arda Mavi


 for(int i = 0; i<=4;i++){
// i bir tamsayı ve 0 değerine eşit. Döngü, i 4'e eşit ya da 4'den küçük olana kadar devam edecek. i sayısı her tekrarda 1 arttırılacak.

  int c = 31;
// c sayısı 31'e eşit

    for(int b = 0; b<=i ;b++){
// b bir tamsayı ve 0 değerine eşit. Döngü, b, i'ye eşit ya da i'den küçük olana kadar devam edecek. b sayısı her tekrarda 1 arttırılacak.


      System.out.print(c + " "); 
// c ekrana yazdırılacak ve bir boşluk bırakılacak.


c = c-6;
// c'den 6 çıkarılıp c'ye atanacak.


       }

System.out.print("\n");
// yeni satıra geçmek için.

    }

/*
Konsol çıktısı :

31 
31 25  
31 25 19 
31 25 19 13 
31 25 19 13 7  

*/
