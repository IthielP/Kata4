/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4.model;

/**
 *
 * @author Ithiel
 */
import java.io.IOException;
import java.util.List;
import kata4.model.Mail;
import kata4.model.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;
import kata.4.model.Histogram;
 
 public class Kata4 {
 
     public static void main(String[] args) throws IOException {
         String fileName = "/Users/DaniMangtani/NetBeansProjects/Kata4/emails.txt";
         List<Mail> mailList = MailListReader.read(fileName);
         Histogram<String> histogram = MailHistogramBuilder.build(mailList);
         HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
         histoDisplay.execute();
     }
 }
