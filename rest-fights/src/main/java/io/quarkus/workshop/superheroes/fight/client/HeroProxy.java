package io.quarkus.workshop.superheroes.fight.client;

import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/heroes")
@Produces(MediaType.APPLICATION_JSON)
@RegisterRestClient
public interface HeroProxy {

    @GET
    @Path("/random")
    Hero findRandomHero();

    @Schema(description="The villain fighting against the hero")
    class Villain {

        @NotNull
        public String name;
        @NotNull
        public int level;
        @NotNull
        public String picture;
        public String powers;

    }
}
