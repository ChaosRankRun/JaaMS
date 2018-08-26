package io.jaams.resources;

import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/job")
public class JobResource {

    @GET
    @Timed
    public String getHello() {
        return "hello";
    }
}
