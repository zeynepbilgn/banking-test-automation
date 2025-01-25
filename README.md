# Otomasyon Projesi

Bu proje, **Java 17**, **Selenium 4**, **JUnit 5**, ve **Gauge Framework** kullanılarak geliştirilmiş bir test otomasyon projesidir. Proje, birden fazla tarayıcı desteği sunmakta ve **Page Object Model (POM)** yapısına uygun şekilde tasarlanmıştır.

## Projenin Özellikleri

- **Çoklu Tarayıcı Desteği**:
    - Proje birden fazla tarayıcıyı destekler. Kullanılacak tarayıcı bilgisi, `config.properties` dosyasından alınmaktadır. Bu dosya aracılığıyla tarayıcı seçimini kolayca değiştirebilirsiniz.

- **Page Object Model (POM)**:
    - Proje, bakım kolaylığı ve tekrar kullanılabilirlik için Page Object Model mimarisi kullanılarak geliştirilmiştir. Her sayfa için ayrı bir sınıf oluşturulmuş ve sayfaya özgü işlemler bu sınıflar içinde tanımlanmıştır.

- **Helper Metotlar**:
    - `util` paketi altında, sık kullanılan işlemleri kolaylaştırmak için yardımcı metotlar yazılmıştır.

- **Loglama**:
    - Projede loglama işlemleri için **SLF4J** kütüphanesi kullanılmaktadır. Bu sayede testlerin çalışma sırasında ürettiği loglar kolayca takip edilebilir.

- **Web Driver Manager**:
    - WebDriver'ların otomatik olarak yönetilmesi için **Bonigarcia WebDriverManager** (v5.5.3) kullanılmıştır. Manuel driver kurulumlarına ihtiyaç yoktur.

- **Gauge Framework**:
    - Gauge Framework, senaryo bazlı testler yazmak için kullanılmıştır. Test senaryoları `.spec` dosyaları içerisinde tanımlanmıştır.

- **Maven**:
    - Proje yapılandırma ve bağımlılık yönetimi için **Maven** kullanılmıştır. Tüm bağımlılıklar `pom.xml` dosyasında tanımlanmıştır.

## Kurulum

1. Projeyi klonlayın:
   ```bash
   git clone https://github.com/kullanici/otomasyon-projesi.git
   ```

2. Maven bağımlılıklarını yükleyin:
   ```bash
   mvn clean install
   ```

3. `config.properties` dosyasını düzenleyerek tarayıcı seçiminizi yapın:
   ```properties
   browser=chrome
   ```

## Testlerin Çalıştırılması

1. Testleri Maven ile çalıştırmak için şu komutu kullanabilirsiniz:
   ```bash
   mvn test
   ```

2. Gauge senaryolarını çalıştırmak için:
   ```bash
   gauge run specs
   ```

## Bağımlılıklar

Proje bağımlılıkları `pom.xml` dosyasında tanımlanmıştır. Önemli bağımlılıklar:

- **Selenium 4**
- **JUnit 5**
- **SLF4J**
- **Bonigarcia WebDriverManager (v5.5.3)**
- **Gauge Framework**

## İletişim

Herhangi bir sorunuz veya geri bildiriminiz için [zeynepbilgin@testinium.com](mailto:zeynepbilgin@testinium.com) adresinden iletişime geçebilirsiniz.
