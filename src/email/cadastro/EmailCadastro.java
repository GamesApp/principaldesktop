/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package email.cadastro;

import javax.swing.JOptionPane;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

/**
 *
 * @author matheush
 */
public class EmailCadastro {

    public EmailCadastro() {
    }

    public boolean EnviarEmail(String emailCadastro, String codConfirmacao) {        
        boolean status = EnviarCodConfirmacao(codConfirmacao, emailCadastro);
        
        return status;
    }
    
    public String geraCodConfirmacao() {
        int random;
        String cod = "";
        boolean v = false;
        for (int i = 0; i < 8; i++) {
            v = false;
            do {
                random = (int) (Math.random() * 122);
                if (random >= 48 && random <= 57)
                    v = true;
                else if (random >= 97 && random <= 122)
                    v = true;
                else if (random >= 65 && random <= 90)
                    v = true;
            } while (!v);
            //System.out.print((char) random + "");
            cod += (char) random;
        }
        //System.out.println(cod);
        
        return cod;
    }
    
    public boolean EnviarCodConfirmacao(String codigo, String emailCadastro) {    
        HtmlEmail email = new HtmlEmail();
        email.setSSLOnConnect(true);
        email.setHostName("smtp.gmail.com");
        email.setSslSmtpPort("465");
        email.setAuthenticator(new DefaultAuthenticator("contatogamesapp@gmail.com",  "gamesifsul" ));
        try {
            email.setFrom("contatogamesapp@gmail.com" , "Equipe GamesApp");
            email.setDebug(true); 
            email.setSubject("Código de confirmação");

            String emailHtml = "<!doctype html><html><head><meta charset=\"UTF-8\"><meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"><title>Email</title></head><style type=\"text/css\">p{margin:10px 0;padding:0;}table{border-collapse:collapse;}h1,h2,h3,h4,h5,h6{display:block;margin:0;padding:0;}img,a img{border:0;height:auto;outline:none;text-decoration:none;}body,#bodyTable,#bodyCell{height:100%;margin:0;padding:0;width:100%;}#outlook a{padding:0;}img{-ms-interpolation-mode:bicubic;}table{mso-table-lspace:0pt;mso-table-rspace:0pt;}.ReadMsgBody{width:100%;}.ExternalClass{width:100%;}p,a,li,td,blockquote{mso-line-height-rule:exactly;}a[href^=tel],a[href^=sms]{color:inherit;cursor:default;text-decoration:none;}p,a,li,td,body,table,blockquote{-ms-text-size-adjust:100%;-webkit-text-size-adjust:100%;}.ExternalClass,.ExternalClass p,.ExternalClass td,.ExternalClass div,.ExternalClass span,.ExternalClass font{line-height:100%;}a[x-apple-data-detectors]{color:inherit !important;text-decoration:none !important;font-size:inherit !important;font-family:inherit !important;font-weight:inherit !important;line-height:inherit !important;}#bodyCell{padding:10px;}.templateContainer{max-width:600px !important;}a.mcnButton{display:block;}.mcnImage{vertical-align:bottom;}.mcnTextContent{word-break:break-word;}.mcnTextContent img{height:auto !important;}.mcnDividerBlock{table-layout:fixed !important;}body,#bodyTable{background-color:#FAFAFA;}#bodyCell{border-top:0;}.templateContainer{border:0;}h1{color:#616161;font-family:Helvetica;font-size:22px;font-style:normal;font-weight:bold;line-height:125%;letter-spacing:normal;text-align:left;}h2{color:#202020;font-family:Helvetica;font-size:22px;font-style:normal;font-weight:bold;line-height:125%;letter-spacing:normal;text-align:left;}h3{color:#202020;font-family:Helvetica;font-size:20px;font-style:normal;font-weight:bold;line-height:125%;letter-spacing:normal;text-align:left;}h4{color:#202020;font-family:Helvetica;font-size:18px;font-style:normal;font-weight:bold;line-height:125%;letter-spacing:normal;text-align:left;}#templatePreheader{background-color:#FAFAFA;border-top:0;border-bottom:0;padding-top:20px;padding-bottom:20px;}#templatePreheader .mcnTextContent,#templatePreheader .mcnTextContent p{color:#656565;font-family:Helvetica;font-size:12px;line-height:150%;text-align:left;}#templatePreheader .mcnTextContent a,#templatePreheader .mcnTextContent p a{color:#656565;font-weight:normal;text-decoration:underline;}#templateHeader{background-color:#FFFFFF;border-top:0;border-bottom:0;padding-top:9px;padding-bottom:0;}#templateHeader .mcnTextContent,#templateHeader .mcnTextContent p{color:#202020;font-family:Helvetica;font-size:16px;line-height:150%;text-align:left;}#templateHeader .mcnTextContent a,#templateHeader .mcnTextContent p a{color:#2BAADF;font-weight:normal;text-decoration:underline;}#templateBody{background-color:#FFFFFF;border-top:0;border-bottom:2px solid #EAEAEA;padding-top:0;padding-bottom:9px;}#templateBody .mcnTextContent,#templateBody .mcnTextContent p{color:#616161;font-family:Helvetica;font-size:16px;line-height:150%;text-align:left;}#templateBody .mcnTextContent a,#templateBody .mcnTextContent p a{color:#2BAADF;font-weight:normal;text-decoration:underline;}#templateFooter{background-color:#FAFAFA;border-top:0;border-bottom:0;padding-top:9px;padding-bottom:9px;}#templateFooter .mcnTextContent,#templateFooter .mcnTextContent p{color:#656565;font-family:Helvetica;font-size:12px;line-height:150%;text-align:center;}#templateFooter .mcnTextContent a,#templateFooter .mcnTextContent p a{color:#656565;font-weight:normal;text-decoration:underline;}button{background: #107a49; border: none; padding: 10px 20px; border-radius: 70px; color: #fff;margin-top: 30px;cursor: pointer;}@media only screen and (min-width:768px){.templateContainer{width:600px !important;}}@media only screen and (max-width: 480px){body,table,td,p,a,li,blockquote{-webkit-text-size-adjust:none !important;}}@media only screen and (max-width: 480px){body{width:100% !important;min-width:100% !important;}}@media only screen and (max-width: 480px){#bodyCell{padding-top:10px !important;}}@media only screen and (max-width: 480px){.mcnImage{width:100% !important;}}@media only screen and (max-width: 480px){.mcnCartContainer,.mcnCaptionTopContent,.mcnRecContentContainer,.mcnCaptionBottomContent,.mcnTextContentContainer,.mcnBoxedTextContentContainer,.mcnImageGroupContentContainer,.mcnCaptionLeftTextContentContainer,.mcnCaptionRightTextContentContainer,.mcnCaptionLeftImageContentContainer,.mcnCaptionRightImageContentContainer,.mcnImageCardLeftTextContentContainer,.mcnImageCardRightTextContentContainer{max-width:100% !important;width:100% !important;}}@media only screen and (max-width: 480px){.mcnBoxedTextContentContainer{min-width:100% !important;}}@media only screen and (max-width: 480px){.mcnImageGroupContent{padding:9px !important;}}@media only screen and (max-width: 480px){.mcnCaptionLeftContentOuter .mcnTextContent,.mcnCaptionRightContentOuter .mcnTextContent{padding-top:9px !important;}}@media only screen and (max-width: 480px){.mcnImageCardTopImageContent,.mcnCaptionBlockInner .mcnCaptionTopContent:last-child .mcnTextContent{padding-top:18px !important;}}@media only screen and (max-width: 480px){.mcnImageCardBottomImageContent{padding-bottom:9px !important;}}@media only screen and (max-width: 480px){.mcnImageGroupBlockInner{padding-top:0 !important;padding-bottom:0 !important;}}@media only screen and (max-width: 480px){.mcnImageGroupBlockOuter{padding-top:9px !important;padding-bottom:9px !important;}}@media only screen and (max-width: 480px){.mcnTextContent,.mcnBoxedTextContentColumn{padding-right:18px !important;padding-left:18px !important;}}@media only screen and (max-width: 480px){.mcnImageCardLeftImageContent,.mcnImageCardRightImageContent{padding-right:18px !important;padding-bottom:0 !important;padding-left:18px !important;}}@media only screen and (max-width: 480px){.mcpreview-image-uploader{display:none !important;width:100% !important;}}@media only screen and (max-width: 480px){h1{font-size:22px !important;line-height:125% !important;}}@media only screen and (max-width: 480px){h2{font-size:20px !important;line-height:125% !important;}}@media only screen and (max-width: 480px){h3{font-size:18px !important;line-height:125% !important;}}@media only screen and (max-width: 480px){h4{font-size:16px !important;line-height:150% !important;}}@media only screen and (max-width: 480px){.mcnBoxedTextContentContainer .mcnTextContent,.mcnBoxedTextContentContainer .mcnTextContent p{font-size:14px !important;line-height:150% !important;}}@media only screen and (max-width: 480px){#templatePreheader{display:block !important;}}@media only screen and (max-width: 480px){#templatePreheader .mcnTextContent,#templatePreheader .mcnTextContent p{font-size:14px !important;line-height:150% !important;}}@media only screen and (max-width: 480px){#templateHeader .mcnTextContent,#templateHeader .mcnTextContent p{font-size:16px !important;line-height:150% !important;}}@media only screen and (max-width: 480px){#templateBody .mcnTextContent,#templateBody .mcnTextContent p{font-size:16px !important;line-height:150% !important;}}@media only screen and (max-width: 480px){#templateFooter .mcnTextContent,#templateFooter .mcnTextContent p{font-size:14px !important;line-height:150% !important;}}</style><body><center><table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" height=\"100%\" width=\"100%\" id=\"bodyTable\"><tr><td align=\"center\" valign=\"top\" id=\"bodyCell\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"templateContainer\"><tr><td valign=\"top\" id=\"templatePreheader\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnImageBlock\" style=\"min-width:100%;\"><tbody class=\"mcnImageBlockOuter\"><tr><td valign=\"top\" style=\"padding:9px\" class=\"mcnImageBlockInner\"><table align=\"left\" width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"mcnImageContentContainer\" style=\"min-width:100%;\"><tbody><tr><td class=\"mcnImageContent\" valign=\"top\" style=\"padding-right: 9px; padding-left: 9px; padding-top: 0; padding-bottom: 0;\"><a href=\"https://github.com/GamesApp\" target=\"_blank\"><img align=\"left\" alt=\"\" src=\"https://ap.imagensbrasil.org/images/2016/11/21/logo_escrita.png\" width=\"200\" style=\"max-width:200px; padding-bottom: 0; display: inline !important; vertical-align: bottom;\" class=\"mcnImage\"></a></td></tr></tbody></table></td></tr></tbody></table></td></tr><tr><td valign=\"top\" id=\"templateBody\" style=\"border-radius:5px;\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnTextBlock\" style=\"min-width:100%;\"><tbody class=\"mcnTextBlockOuter\"><tr><td valign=\"top\" class=\"mcnTextBlockInner\" style=\"padding-top:9px;\"><table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"max-width:100%; min-width:100%;\" width=\"100%\" class=\"mcnTextContentContainer\"><tbody><tr><td valign=\"top\" class=\"mcnTextContent\" style=\"padding-top:30px; padding-right:30px; padding-bottom:30px; padding-left:30px;\"><h1>Código de confirmação</h1><p>E aí, tudo certo?!</p><p>Recebemos uma solicitação de cadastro no aplicativo GamesApp.</p><p>Segue o código de confirmação:</p><div style=\"background: #CCCCCC; text-align: center; border-radius:5px; padding-top: 9px; padding-bottom: 9px;\">"
                    + codigo
                    + "</div><p style=\"font-size: 10px; \">Obs.: Se você não realizou está operação entrar em contato o mais rápido possível!</p></td></tr></tbody></table></td></tr></tbody></table><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnDividerBlock\" style=\"min-width:100%;\"><tbody class=\"mcnDividerBlockOuter\"><tr><td class=\"mcnDividerBlockInner\" style=\"min-width:100%; padding:18px 30px;\"><table class=\"mcnDividerContent\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"min-width: 100%;border-top: 2px dashed #EAEAEA;\"><tbody><tr><td><span></span></td></tr></tbody></table></td></tr></tbody></table><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnFollowBlock\" style=\"min-width:100%;\"><tbody class=\"mcnFollowBlockOuter\"><tr><td align=\"center\" valign=\"top\" style=\"padding:9px\" class=\"mcnFollowBlockInner\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnFollowContentContainer\" style=\"min-width:100%;\"><tbody><tr><td align=\"center\" style=\"padding-left:9px;padding-right:9px;\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" style=\"min-width:100%;\" class=\"mcnFollowContent\"><tbody><tr><td align=\"center\" valign=\"top\" style=\"padding-top:9px; padding-right:9px; padding-left:9px;\"><table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\"><tbody><tr><td align=\"center\" valign=\"top\"><table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"display:inline;\"><tbody><tr><td valign=\"top\" style=\"padding-right:0; padding-bottom:9px;\" class=\"mcnFollowContentItemContainer\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnFollowContentItem\"><tbody><tr><td align=\"left\" valign=\"middle\" style=\"padding-top:5px; padding-right:10px; padding-bottom:5px; padding-left:9px;\"><table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"\"><tbody><tr><td align=\"center\" valign=\"middle\" width=\"24\" class=\"mcnFollowIconContent\"><a href=\"https://github.com/GamesApp\" target=\"_blank\"><img src=\"http://oi63.tinypic.com/30sk57c.jpg\" style=\"display:block;\" height=\"24\" width=\"24\" class=\"\"></a></td></tr></tbody></table></td></tr></tbody></table></td></tr></tbody></table></td></tr></tbody></table></td></tr></tbody></table></td></tr></tbody></table></td></tr></tbody></table></td></tr><tr><td valign=\"top\" id=\"templateFooter\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" class=\"mcnTextBlock\" style=\"min-width:100%;\"><tbody class=\"mcnTextBlockOuter\"><tr><td valign=\"top\" class=\"mcnTextBlockInner\" style=\"padding-top:9px;\"><table align=\"left\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"max-width:100%; min-width:100%;\" width=\"100%\" class=\"mcnTextContentContainer\"><tbody><tr><td valign=\"top\" class=\"mcnTextContent\" style=\"padding-top:0; padding-right:18px; padding-bottom:9px; padding-left:18px;\"><em>© GamesApp. Todos os direitos reservados.&nbsp;</em><br><br></td></tr></tbody></table></td></tr></tbody></table></td></tr></table></td></tr></table></center></body></html>";
            email.setHtmlMsg(emailHtml);
            email.addTo(emailCadastro);
            email.send();
        } catch (EmailException e) {
            return false;
        }
        return true;
    }
}