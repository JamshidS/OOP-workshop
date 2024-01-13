# Proje README Dosyası

Bu proje, kitap ve kullanıcı verilerini yöneten basit bir kütüphane sistemi uygulamasını içerir. Projede bulunan sınıflar `Book` ve `User` olarak adlandırılmıştır ve her biri ilgili nesnelerin özelliklerini içermektedir. Ayrıca, bu nesnelerle ilgili işlemleri gerçekleştiren `BookService` ve `UserService` sınıfları da bulunmaktadır.

## Book Sınıfı

```java
public class Book {
    private int id;
    private String name;
    private String authorName;
    private int page;

    // Metotlar...
}

