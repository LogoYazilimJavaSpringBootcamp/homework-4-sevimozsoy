# Dosyalarda kaybolmayın diye ufak bir açıklama :)

İlk soru için ekstra bir controller yazmadım. week4-main-project (ki bu bizim ana projemiz oluyor) içerisinde rabbitmq'ye gönderilen veriyi bir dto ile handellayıp
obje olarak queue'ya göndermeyi tercih ettim.

Ardından da email servisi içerisinde(week4-email-service) yazdığım entity'nin içeriğini rabbitmq'dan gelen obje ile bir tuttum, bu sebeple ekstra bir şey eklememe gerek kalmadı.
Servis katmanından da çağırdığım DAO interface'i sayesinde postgresql'e veri yazımı yapıyorum!
