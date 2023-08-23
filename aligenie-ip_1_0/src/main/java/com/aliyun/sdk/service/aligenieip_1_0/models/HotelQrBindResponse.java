// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotelQrBindResponse} extends {@link TeaModel}
 *
 * <p>HotelQrBindResponse</p>
 */
public class HotelQrBindResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private HotelQrBindResponseBody body;

    private HotelQrBindResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static HotelQrBindResponse create() {
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
    public HotelQrBindResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<HotelQrBindResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(HotelQrBindResponseBody body);

        @Override
        HotelQrBindResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<HotelQrBindResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private HotelQrBindResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(HotelQrBindResponse response) {
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
        public Builder body(HotelQrBindResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public HotelQrBindResponse build() {
            return new HotelQrBindResponse(this);
        } 

    } 

}
