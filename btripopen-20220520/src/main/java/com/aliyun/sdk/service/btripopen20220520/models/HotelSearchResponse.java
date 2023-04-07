// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotelSearchResponse} extends {@link TeaModel}
 *
 * <p>HotelSearchResponse</p>
 */
public class HotelSearchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private HotelSearchResponseBody body;

    private HotelSearchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static HotelSearchResponse create() {
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
    public HotelSearchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<HotelSearchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(HotelSearchResponseBody body);

        @Override
        HotelSearchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<HotelSearchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private HotelSearchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(HotelSearchResponse response) {
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
        public Builder body(HotelSearchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public HotelSearchResponse build() {
            return new HotelSearchResponse(this);
        } 

    } 

}
