# Alınan Notlar
```
* Linux Bash Komutları
  
    ssh nedir
    SSH (Secure Shell), bir bilgisayara uzaktan güvenli bir şekilde bağlanmanı ve komut çalıştırmanı sağlayan bir şifreli iletişim protokolüdür.
    
    🧠 SSH Nedir?
    "Secure Shell" kelimesinin kısaltmasıdır.
    
    İnternet veya yerel ağ üzerinden bir bilgisayara güvenli bağlantı kurar.
    
    Varsayılan portu: 22
    
    Genellikle Linux sunuculara bağlanmak için kullanılır.
    
    🛠️ Ne İşe Yarar?
    Kullanım	Açıklama
    🖥️ Uzak bağlantı	Başka bir bilgisayarda terminal/komut satırı açmanı sağlar.
    📂 Dosya transferi	scp veya sftp ile dosya gönderip alabilirsin.
    🧩 Port yönlendirme	SSH ile güvenli tüneller (tunneling) kurabilirsin.
    🛡️ Güvenli yönetim	Sunucuları şifreli bir şekilde yönetmeyi sağlar.
    🤖 Otomasyon	Script’lerle uzak sunuculara komut gönderip işler otomatikleştirilebilir.
    💻 Örnek Kullanım:
    1. Sunucuya bağlanmak:
    bash
    Kopyala
    Düzenle
    ssh username@sunucu-adresi
    Örnek:
    
    bash
    Kopyala
    Düzenle
    ssh root@192.168.1.100
    2. Dosya kopyalamak (scp ile):
    bash
    Kopyala
    Düzenle
    scp dosya.txt username@192.168.1.100:/home/username/
    🔐 SSH Neden Güvenli?
    Şifreli veri aktarımı yapar.
    
    Kullanıcı doğrulama şifre veya SSH anahtarları (key-based auth) ile olur.
    
    MITM (Man-in-the-Middle) saldırılarına karşı korur.
    
    örnek ssh 
    
    ssh mduman@10.98.136.58 # mduman kullanıcısı ile ilgili ip ye (10.98.136.58) erişim yapmanı saglar.
    
    Sftp
    
    SFTP (Secure File Transfer Protocol), dosyaları uzaktaki bir sunucuya güvenli bir şekilde gönderip almak için kullanılan bir protokoldür. SSH (Secure Shell) protokolü üzerinden çalışır, yani veri aktarımı şifrelenmiş olur.
    
    🔐 SFTP Nedir? -> fileZilla dosya transfer clienti ile yapabilirsin
    SSH protokolü üzerinden dosya aktarımı yapar.
    
    FTP gibi çalışır ama güvenli ve şifreli bir bağlantı kurar.
    
    TCP portu: 22 (SSH ile aynıdır)
    
    SFTP ≠ FTP + SSL → O farklı bir şeydir (FTPS).
    
    🎯 Ne İşe Yarar?
    Özellik	Açıklama
    📤 Dosya gönderme	Bilgisayardan uzak sunucuya dosya yolla.
    📥 Dosya indirme	Sunucudaki dosyayı kendi bilgisayarına al.
    📁 Klasör işlemleri	Uzakta klasör oluştur, sil, yeniden adlandır.
    🔐 Güvenli bağlantı	Tüm veri şifrelenir (kullanıcı adı, parola, dosya içeriği).
    💻 SFTP Nasıl Kullanılır?
    Komut satırıyla bağlantı:
    bash
    Kopyala
    Düzenle
    sftp kullanıcı_adı@sunucu_ip
    Örnek:
    
    bash
    Kopyala
    Düzenle
    sftp root@192.168.1.100
    Bağlandıktan sonra bazı komutlar:
    bash
    Kopyala
    Düzenle
    ls              # Sunucudaki dosyaları listeler
    cd klasor       # Sunucuda klasör değiştirir
    put dosya.txt   # Dosya gönderir
    get dosya.txt   # Dosya indirir
    exit            # Çıkış yapar
    📦 GUI Alternatifleri
    Kullanımı kolay programlar:
    
    WinSCP (Windows) – en popüler SFTP arayüzlerinden biri
    
    FileZilla – SFTP destekler
    
    Cyberduck (Mac) – SFTP desteği olan basit bir arayüz
    
    🔐 SFTP vs FTP Farkı
    Özellik	SFTP	FTP
    Şifreleme	✅ Evet (SSH ile)	❌ Hayır (düz metin)
    Port	22	21
    Güvenlik	🔒 Yüksek	⚠️ Düşük
    Firewall	Daha kolay yapılandırılır	Ek yapılandırma gerekebilir
  

* Linux Bash Komutları  
    
    
    ls -> listeleme yapar
    cd -> dosya içerisine girer
    cd .. bir üst klasöre cıkar
    mv (tasıma komutu) [bu dosyayı] [bu dosya olarak tası] 
    mv soap-user-service-1.0.0.war ROOT.war
    mv /home/mduman/deploy/soap-user-service-1.0.0.war ROOT.war # buradaki (/home/mduman/deploy/soap-user-service-1.0.0.war) uygulamayı bulundugu dizine ROOT.war olarak tasır
    mv /home/mduman/deploy/soap-user-service-1.0.0.war . (/home/mduman/deploy/soap-user-service-1.0.0.war klasörü aynı ismi ile buraya tası (buraya dedigimiz bashte hangi dizindeysek orası))
    cp -R /home/mduman/deploy/soap-user-service-1.0.0.war . (Kopyalama komutu)
    
    ps -auxww |grep "tomcatSoapService" (çalısan uygulamalardan tomcatSoapService olan process id ve detayını getirir.) 
    ps -ef |grep "tomcatSoapService" (çalısan uygulamalardan tomcatSoapService olan process id ve detayını getirir.) 
    
    |grep "x"(filtrelemek için kullanılır )
    |grep -A10 -B10 "x" x gördügü logun 10 satır öncesi ve 10 satır sonrasını getirir.
    cat catalina.out |grep -A10 -B10 "error"
    
    |grep -i (-i camelCase eslesmesini ignore eder)
    
    netstat -na |grep 9035 bu komut portun kullanılıp kullanılmadıgını sorgulamak için kullanılır
    
    more komutu dosyayı görüntülemek için kullanılır.
    cat komutu dosyayı görüntülemek için kullanılır.
    nano komutu dosyayı görüntülemek ve düzenlemek için kullanılır.
    
    more server.xml
    cat server.xml
    more server.xml
    
    cat localhost_access_log.2025-04-05.txt |grep "POST" |wc -l
    
    ps -auxwww|grep tomcatUserService
    kill -9 "processId"
    
    cd bin
    ./startup.sh
    
    tail -30f ../logs/catalina.out
    
    lsof -i -P |grep "port"
    
    lsof -i -P |grep "9035" // burada 9035 netstatta kullanıldıgı gözükmüştür.
    Hangi uygulama bu portu kullanıyo diye sorgularız bu bize processId verir
    bu processId ise ps -auxwww|grep processId ile sorgularsak uygulama acaga çıkar.
  
* Uygulama Curl ve wget komutları
  
    curl -a -k --user test:test http://localhost:8085/services/UserServiceWs?wsdl
    
    wget --user=test --password=test http://localhost:8085/services/UserServiceWs?wsdl
    
    #Bu komutu yazıp daha sonrasında kacıs -d kısmında kacıs karakteri düzeltmesi yapılabilir.
    curl --request POST --header "Content-Type: text/xml;charset=UTF-8" -d "XmlYazilir" "url yazilir" 
    
    #yada tek tırnakta yazabiliriz.
    curl --request POST --header "Content-Type: text/xml;charset=UTF-8" -d 'XmlYazilir' "url yazilir" 
    
    #çift tırnak + kacıs karakter düzeltmesi
    Kacıs karakter düzeltmesi yapılmamıs
    curl --user test:test --request POST --header "Content-Type: text/xml;charset=UTF-8" -d "<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:soap="http://soapuserservice.example.soap.com.tr"><soapenv:Header/><soapenv:Body><soap:addUser><name>alper</name><surname>oner</surname></soap:addUser></soapenv:Body></soapenv:Envelope>" "http://localhost:8085/services/UserServiceWs?wsdl" 
    Kacıs karakter düzeltmesi yapılmıs
    curl --user test:test --request POST --header "Content-Type: text/xml;charset=UTF-8" -d "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:soap=\"http://soapuserservice.example.soap.com.tr\"><soapenv:Header/><soapenv:Body><soap:addUser><name>alper</name><surname>oner</surname></soap:addUser></soapenv:Body></soapenv:Envelope>" "http://localhost:8085/services/UserServiceWs"
    
    #Tek tırnaklı hali 
    curl --user test:test --request POST --header "Content-Type: text/xml;charset=UTF-8" -d '<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:soap="http://soapuserservice.example.soap.com.tr"><soapenv:Header/><soapenv:Body><soap:addUser><name>alper</name><surname>oner</surname></soap:addUser></soapenv:Body></soapenv:Envelope>' "http://localhost:8085/services/UserServiceWs?wsdl" 
    
    
    
    #Listeleme istegi 
    curl --user test:test --request POST --header "Content-Type: text/xml;charset=UTF-8" -d '<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:soap="http://soapuserservice.example.soap.com.tr"><soapenv:Header/><soapenv:Body><soap:getAllUsers/></soapenv:Body></soapenv:Envelope>' "http://localhost:8085/services/UserServiceWs"
    
    #sayHello istegi
    curl --user test:test --request POST --header "Content-Type: text/xml;charset=UTF-8" -d '<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:soap="http://soapuserservice.example.soap.com.tr"><soapenv:Header/><soapenv:Body><soap:sayHello><name>mustafa kahraman</name></soap:sayHello></soapenv:Body></soapenv:Envelope>' "http://localhost:8085/services/UserServiceWs"

```
