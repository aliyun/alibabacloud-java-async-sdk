// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotelCityCodeListResponse} extends {@link TeaModel}
 *
 * <p>HotelCityCodeListResponse</p>
 */
public class HotelCityCodeListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private HotelCityCodeListResponseBody body;

    private HotelCityCodeListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static HotelCityCodeListResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public HotelCityCodeListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<HotelCityCodeListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(HotelCityCodeListResponseBody body);

        @Override
        HotelCityCodeListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<HotelCityCodeListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private HotelCityCodeListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(HotelCityCodeListResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(HotelCityCodeListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public HotelCityCodeListResponse build() {
            return new HotelCityCodeListResponse(this);
        } 

    } 

}
