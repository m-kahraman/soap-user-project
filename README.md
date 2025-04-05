# soap-user-project
soap-user-project

# Alınan Notlar
```
* Kurulum Notları
* Soap Servisi projesinde java 1.8 kullanılmıstır.
* Window -> Preferance -> Java -> InstalledJRE's ->java jdk 1.8 gösterilir
    Add -> C:\Program Files\Java\jdk1.8.0_231 yapılır sts versiyonu remove edilerek apply and close yapılır.
* Maven Update yapılır (Alt+F5)yada proje sagtık maven -> update project
* Proje sagtık ->Run -> Maven build tıklanır 
    clean install yazılıp skip test tiklenerek aplly basılır sonra runa basılarak maven clean install işlemi yapılır.
* Projeyi spring bootda ayaga kaldırmak icin proje sagtık -> Run -> Spring Boot Application tıklanarak uygulama ayaga kaldırılır.


Gitten çekildikten sonra 

* Uygulama Notları
    Soap Wsdl Adresi http://localhost:8085/services/UserServiceWs?wsdl
    BasicAuth Var
    username:test
    pwd:test
    olarak auth olunması gereklidir.

Servisin 3 methodu var
    * addUser 
        User eklemek icin kullanilir.
    * getAllUsers
        Tum userlari cekmek icin kullanilir.
    * sayHello
        Uygulamanin ayakta olup olmadıgı kontrolü icin bos bir methoddur.

```
