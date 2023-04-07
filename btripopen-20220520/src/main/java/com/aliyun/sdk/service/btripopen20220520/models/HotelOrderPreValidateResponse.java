// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotelOrderPreValidateResponse} extends {@link TeaModel}
 *
 * <p>HotelOrderPreValidateResponse</p>
 */
public class HotelOrderPreValidateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private HotelOrderPreValidateResponseBody body;

    private HotelOrderPreValidateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static HotelOrderPreValidateResponse create() {
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
    public HotelOrderPreValidateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<HotelOrderPreValidateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(HotelOrderPreValidateResponseBody body);

        @Override
        HotelOrderPreValidateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<HotelOrderPreValidateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private HotelOrderPreValidateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(HotelOrderPreValidateResponse response) {
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
        public Builder body(HotelOrderPreValidateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public HotelOrderPreValidateResponse build() {
            return new HotelOrderPreValidateResponse(this);
        } 

    } 

}
