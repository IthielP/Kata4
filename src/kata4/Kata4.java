/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4;

/**
 *
 * @author Ithiel
 */
public class Kata4 {

import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;
 
 public class Kata4 {
     public static void main(String[] args) throws IOException, Exception {
         Kata4 histo = new Kata4();
         histo.execute();
     }
     
     private String filename;
     private List<Mail> mailList;
     private Histogram<String> histogram;
     private static HistogramDisplay histoDisplay;
         
     private void execute() throws Exception{
         input();
         process();
         output();
     }
     
     private void input() throws IOException{
         filename = "/Users/DaniMangtani/NetBeansProjects/Kata4/emails.txt";
         mailList = MailListReader.read(filename);
     }
     
     private void process() throws Exception{
         histogram = MailHistogramBuilder.build(mailList);
     }
     
     private void output(){
         histoDisplay = new HistogramDisplay(histogram);
         histoDisplay.execute();
     }
 }
