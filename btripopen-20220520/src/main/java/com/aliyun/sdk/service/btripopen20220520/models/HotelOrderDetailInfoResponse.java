// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotelOrderDetailInfoResponse} extends {@link TeaModel}
 *
 * <p>HotelOrderDetailInfoResponse</p>
 */
public class HotelOrderDetailInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private HotelOrderDetailInfoResponseBody body;

    private HotelOrderDetailInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static HotelOrderDetailInfoResponse create() {
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
    public HotelOrderDetailInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<HotelOrderDetailInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(HotelOrderDetailInfoResponseBody body);

        @Override
        HotelOrderDetailInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<HotelOrderDetailInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private HotelOrderDetailInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(HotelOrderDetailInfoResponse response) {
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
        public Builder body(HotelOrderDetailInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public HotelOrderDetailInfoResponse build() {
            return new HotelOrderDetailInfoResponse(this);
        } 

    } 

}
