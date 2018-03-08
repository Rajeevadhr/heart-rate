/*
 * (C) Copyright 2010-2018 hSenid Mobile Solutions (Pvt) Limited.
 * All Rights Reserved.
 *
 * These materials are unpublished, proprietary, confidential source code of
 * hSenid Mobile Solutions (Pvt) Limited and constitute a TRADE SECRET
 * of hSenid Mobile Solutions (Pvt) Limited.
 *
 * hSenid Mobile Solutions (Pvt) Limited retains all title to and intellectual
 * property rights in these materials.
 */

package com.packageA;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * Contains all the main controlling methods
 *
 * Created by rajeeva on 2/20/18.
 */
@Controller
public class MainController {

    /**
     * loads the home page of the site
     * @return file name of the home page
     */
    @GetMapping(path = "/")
    public String showWelcomePage () {
        float heartRate = 85;
        return "welcome";
    }
}
