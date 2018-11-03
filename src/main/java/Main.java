package src.main.java;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.html.simpleparser.HTMLWorker;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, DocumentException {


        String css = "    <STYLE TYPE=\"text/css\">\n" +
                "            .fulcontainer {\n" +
                "\t\t\tborder: 1px solid black;\n" +
                "\t\t\theight: 100%;\n" +
                "\t\t\tmargin: 20px;\n" +
                "\t\t\tpadding: 10px;\n" +
                "\t\t\t} \n" +
                "\t\t\ttable {\n" +
                "\t\t\twidth: 100%;\n" +
                "\t\t\t\n" +
                "\t\t\t}\n" +
                "\t\t\ttd{\n" +
                "\t\t\twidth: 50%;\n" +
                "\t\t\tborder: 1px solid black;\n" +
                "\t\t\t\tmargin: 0; \n" +
                "\t\t\t\tpadding : 3px;\n" +
                "\t\t\t}\n" +
                "\t\t\ttable,td{\n" +
                "\t\t\t \n" +
                "\t\t\t\t\n" +
                "\t\t\t\tborder-collapse: collapse;\n" +
                "\t\t\t}\n" +
                "      .espace {\n" +
                "        border: none;\n" +
                "      }\n" +
                "      \n" +
                "      .yellow_background{\n" +
                "        background: yellow;\n" +
                "        \n" +
                "      }\n" +
                "      .titre{\n" +
                "        border : none;\n" +
                "      }\n" +
                "      .entete_table_gauche {\n" +
                "        border-right : none;\n" +
                "      }\n" +
                "      .entete_table_droite {\n" +
                "        border-left : none;\n" +
                "      }\n" +
                "    </STYLE>\n" ;
        String v = "<html>\n" +
                "<HEAD>\n" +
                "    <META HTTP-EQUIV=\"CONTENT-TYPE\" CONTENT=\"text/html; charset=utf-8\"/>\n" +
                "    <TITLE>test</TITLE>\n" +
                "  </HEAD>\n" +
                "<body>\n" +
                "\u2028\n" +
                "<div class=\"fulcontainer\">\n" +
                "\u2028\n" +
                "<table>\n" +
                "<tr>\n" +
                "<td class=\"titre\">\n" +
                "<p class=\"yellow_background\">DEMANDE WEBPREVOYANCE</p>\n" +
                "</td>\n" +
                "<td class=\"titre\">\n" +
                "<p class =\"yellow_background\">Attention Document Confidentiel</p>\n" +
                "</td>\n" +
                "\u2028\n" +
                "</tr>\n" +
                "  <tr>\n" +
                "    <td class=\"espace\"></td>\n" +
                "    <td class=\"espace\"></td>\n" +
                "  </tr>\n" +
                "    <tr>\n" +
                "    <td class=\"espace\"></td>\n" +
                "    <td class=\"espace\"></td>\n" +
                "  </tr>\n" +
                "  <tr>\n" +
                "    <td class=\"entete_table_gauche\">\n" +
                "    <p class =\"yellow_background\" >\n" +
                "      Entete 1\n" +
                "      </p>\n" +
                "    </td>\n" +
                "    <td class=\"entete_table_droite\">\n" +
                "    </td>\n" +
                "  \n" +
                "  </tr>\n" +
                "  \n" +
                "  <tr>\n" +
                "    \n" +
                "   <td>\n" +
                "     <p>\n" +
                "     val1\n" +
                "     </p>\n" +
                "   </td>\n" +
                "   <td>\n" +
                "     <p>\n" +
                "     Valeur\n" +
                "     </p>\n" +
                "   </td>\n" +
                "  </tr>\n" +
                "  <tr>\n" +
                "    \n" +
                "   <td>\n" +
                "     <p>\n" +
                "     val2\n" +
                "     </p>\n" +
                "   </td>\n" +
                "   <td>\n" +
                "     <p>\n" +
                "     Valeur\n" +
                "     </p>\n" +
                "   </td>\n" +
                "  </tr>\n" +
                "  <tr>\n" +
                "    \n" +
                "   <td>\n" +
                "     <p>\n" +
                "     val3\n" +
                "     </p>\n" +
                "   </td>\n" +
                "   <td>\n" +
                "     <p>\n" +
                "     Valeur\n" +
                "     </p>\n" +
                "   </td>\n" +
                "  </tr>\n" +
                "  \n" +
                "  \n" +
                "   <tr>\n" +
                "    <td class=\"espace\"></td>\n" +
                "    <td class=\"espace\"></td>\n" +
                "  </tr> \n" +
                "  <tr>\n" +
                "    <td class=\"espace\"></td>\n" +
                "    <td class=\"espace\"></td>\n" +
                "  </tr>\n" +
                "  <tr>\n" +
                "    <td class=\"entete_table_gauche\">\n" +
                "    <p class =\"yellow_background\" >\n" +
                "      Entete 1\n" +
                "      </p>\n" +
                "    </td>\n" +
                "    <td class=\"entete_table_droite\">\n" +
                "    </td>\n" +
                "  \n" +
                "  </tr>\n" +
                "  \n" +
                "  <tr>\n" +
                "    \n" +
                "   <td>\n" +
                "     <p>\n" +
                "     val1\n" +
                "     </p>\n" +
                "   </td>\n" +
                "   <td>\n" +
                "     <p>\n" +
                "     Valeur\n" +
                "     </p>\n" +
                "   </td>\n" +
                "  </tr>\n" +
                "  <tr>\n" +
                "    \n" +
                "   <td>\n" +
                "     <p>\n" +
                "     val2\n" +
                "     </p>\n" +
                "   </td>\n" +
                "   <td>\n" +
                "     <p>\n" +
                "     Valeur\n" +
                "     </p>\n" +
                "   </td>\n" +
                "  </tr>\n" +
                "  <tr>\n" +
                "    \n" +
                "   <td>\n" +
                "     <p>\n" +
                "     val3\n" +
                "     </p>\n" +
                "   </td>\n" +
                "   <td>\n" +
                "     <p>\n" +
                "     Valeur\n" +
                "     </p>\n" +
                "   </td>\n" +
                "  </tr>\n" +
                "  \n" +
                "\u2028\n" +
                "\u2028\n" +
                "</table>\n" +
                "\u2028\n" +
                "</div>\n" +
                "\u2028\n" +
                "</body>\n" +
                "\u2028\n" +
                "\u2028\n" +
                "</html>";
        Document d = new Document();
        ByteArrayInputStream is = new ByteArrayInputStream(v.getBytes());
        ByteArrayInputStream cis = new ByteArrayInputStream(css.getBytes());
        FileOutputStream os = new FileOutputStream("/Users/guyeric/Desktop/Converter/monpdf.pdf");
        PdfWriter w = PdfWriter.getInstance(d, os);
        d.open();
        XMLWorkerHelper.getInstance().parseXHtml(w,d,is,cis);
        d.close();
        os.close();
        System.out.println("Test Ok");

    }
}
