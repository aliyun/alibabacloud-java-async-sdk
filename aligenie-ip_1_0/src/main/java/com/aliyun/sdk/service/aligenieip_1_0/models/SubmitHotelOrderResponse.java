// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitHotelOrderResponse} extends {@link TeaModel}
 *
 * <p>SubmitHotelOrderResponse</p>
 */
public class SubmitHotelOrderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitHotelOrderResponseBody body;

    private SubmitHotelOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitHotelOrderResponse create() {
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
    public SubmitHotelOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitHotelOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitHotelOrderResponseBody body);

        @Override
        SubmitHotelOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitHotelOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitHotelOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitHotelOrderResponse response) {
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
        public Builder body(SubmitHotelOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitHotelOrderResponse build() {
            return new SubmitHotelOrderResponse(this);
        } 

    } 

}
