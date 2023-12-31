package org.example.CommandPattern;

/**Задание №3. Необходимо реализовать сервис отправки уведомлений клиенту для
 ознакомления с анкетой (например, pdf файл) по кредиту. Существует 3 режима уведомления:
 1. По sms – клиент получает sms сообщение, которое содержит ссылку для скачивания
 анкеты;
 2. По email – клиент получает email сообщение c анкетой, а также sms сообщение с
 оповещением, что пришел email;
 3. По sms и email – данный режим включает 1 и 2 режим (в итоге получается два sms
 сообщения и одно email сообщение*/

public class Program3 {
    public static void main(String[] args) {
       SendingMeans sendingMeans = new SendingMeans();
       sendingMeans.setEmailMessage("NEW EMAIL ");
       sendingMeans.setSmsMessage("NEW SMS ");

       DispathService dispathService = new DispathService(
               new ByEmailCommand(sendingMeans),
               new BySMSCommand(sendingMeans),
               new BySMSendEmailCommand(sendingMeans)
       );
       dispathService.sendSMS();
       dispathService.sendEmail();
       dispathService.sendSMSandEmail();
    }
}
