// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotelOrderCancelResponse} extends {@link TeaModel}
 *
 * <p>HotelOrderCancelResponse</p>
 */
public class HotelOrderCancelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private HotelOrderCancelResponseBody body;

    private HotelOrderCancelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static HotelOrderCancelResponse create() {
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
    public HotelOrderCancelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<HotelOrderCancelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(HotelOrderCancelResponseBody body);

        @Override
        HotelOrderCancelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<HotelOrderCancelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private HotelOrderCancelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(HotelOrderCancelResponse response) {
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
        public Builder body(HotelOrderCancelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public HotelOrderCancelResponse build() {
            return new HotelOrderCancelResponse(this);
        } 

    } 

}
