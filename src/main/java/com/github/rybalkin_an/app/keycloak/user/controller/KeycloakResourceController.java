package com.github.rybalkin_an.app.keycloak.user.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resources")
@Tag(name = "Keycloak Resource Controller", description = "APIs for Recourses access using Keycloak")
public class KeycloakResourceController {

    @Operation(summary = "Get Member Resource", security = @SecurityRequirement(name = "bearerAuth"))
    @Secured("MEMBER")
    @GetMapping("/member")
    public String getMemberResource() {
        return "Member resource accessed";
    }

    @Operation(summary = "Get Guest Resource", security = @SecurityRequirement(name = "bearerAuth"))
    @Secured("GUEST")
    @GetMapping("/guest")
    public String getGuestResource() {
        return "This is the GUEST resource";
    }
}
