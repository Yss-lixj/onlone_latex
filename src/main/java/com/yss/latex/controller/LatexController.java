package com.yss.latex.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.scilab.forge.jlatexmath.TeXConstants;
import org.scilab.forge.jlatexmath.TeXFormula;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * @author lixingjun
 * @email lixingjun@ysstech.com
 * @date 2017/9/20
 */
@RestController
public class LatexController {

    @RequestMapping("/captcha.jpg")
    public void captcha(HttpServletResponse response)throws ServletException, IOException {
        response.setHeader("Cache-Control", "no-store, no-cache");
        response.setContentType("image/jpeg");

        //生成图片验证码
//        BufferedImage image = new BufferedImage();
        String latex = "x=\\frac{-b \\pm \\sqrt {b^2-4ac}}{2a}";
        TeXFormula formula = new TeXFormula(latex);
        BufferedImage  image = (BufferedImage) formula.createBufferedImage(TeXConstants.STYLE_DISPLAY, 50, Color.black, Color.white);

        ServletOutputStream out = response.getOutputStream();
        ImageIO.write(image, "jpg", out);
    }




}
