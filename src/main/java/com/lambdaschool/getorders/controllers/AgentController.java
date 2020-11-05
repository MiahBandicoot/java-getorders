package com.lambdaschool.javaorders.controllers;


import com.lambdaschool.getorders.services.AgentsService;
import com.lambdaschool.javaorders.models.Agent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class AgentController {
    @Autowired
    AgentsService agentsService;
    @GetMapping(value = "/agent/{agentid}")
    public ResponseEntity<?> getAgentById(@PathVariable long agentid){
        Agent a = agentsService.findAgentById(agentid);
        return new ResponseEntity<>(a, HttpStatus.OK);
    }
}
