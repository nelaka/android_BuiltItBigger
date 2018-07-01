package com.udacity.gradle.builditbigger.backend;

import com.example.jokesProvider.JokesProvider;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.udacity.gradle.builditbigger.backend.MyBean;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {
    private JokesProvider mJokesProvider = new JokesProvider();

    /** A simple endpoint method that takes a name and says Hi back */
    /*@ApiMethod(name = "sayHi")
    public MyBean sayHi(@Named("name") String name) {
        MyBean response = new MyBean();
        response.setData("Hi, " + name);

        return response;
    }
*/
        /** A simple endpoint method that takes a name and says Hi back */
        @ApiMethod(name = "getJoke")
        public MyBean tellJoke() {
            MyBean response = new MyBean();

            response.setData(mJokesProvider.tellAJoke());

            return response;
        }
}
