package com.devsuperior.dslist.controllers;

import com.devsuperior.dslist.services.GameListService;
import com.devsuperior.dslist.services.GameService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/list")
public class GameListController {

    private GameListService gameListService;

    private GameService gameService;


}
