// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotelStaticInfoResponse} extends {@link TeaModel}
 *
 * <p>HotelStaticInfoResponse</p>
 */
public class HotelStaticInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private HotelStaticInfoResponseBody body;

    private HotelStaticInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static HotelStaticInfoResponse create() {
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
    public HotelStaticInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<HotelStaticInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(HotelStaticInfoResponseBody body);

        @Override
        HotelStaticInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<HotelStaticInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private HotelStaticInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(HotelStaticInfoResponse response) {
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
        public Builder body(HotelStaticInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public HotelStaticInfoResponse build() {
            return new HotelStaticInfoResponse(this);
        } 

    } 

}
