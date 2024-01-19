package org.example.Controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import org.jboss.resteasy.reactive.RestResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Path("api/test")
public class ControllerTest {

    private List<String> list = new ArrayList<>();

    @GET
    public Response getItems (){
        SetString();
        return Response.ok(list).build();
    }

    private void SetString (){
        list.add("toto");
    }
}
