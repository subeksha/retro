package com.example.subeksha.retro;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Subeksha on 2/11/17.
 */

public interface RequestInterface {
        @GET("shoparphp/showCategories.php")
        Call<JSONResponse> getJSON();
}
