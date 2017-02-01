package com.raysoft.micro.resources;

import com.raysoft.micro.pojo.DistanceMatrixRequest;
import com.raysoft.micro.pojo.DistanceMatrixResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/dmx")
public class DistanceMatrixResource {
    private Logger log = LoggerFactory.getLogger("DistanceMatrixResource");

    @GET
    @Path("/get")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getResponse(DistanceMatrixRequest req) {

//        log.debug(req.getAuth();

        DistanceMatrixResponse resp = new DistanceMatrixResponse();
        resp.setStatus(100);
        resp.setDuration(10000);
//        resp.setMessage(req.getAuth().getUsername());
        return Response.ok(resp).build();
    }


}
