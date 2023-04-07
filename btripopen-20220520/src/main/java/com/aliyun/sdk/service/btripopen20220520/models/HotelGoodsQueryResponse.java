// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotelGoodsQueryResponse} extends {@link TeaModel}
 *
 * <p>HotelGoodsQueryResponse</p>
 */
public class HotelGoodsQueryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private HotelGoodsQueryResponseBody body;

    private HotelGoodsQueryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static HotelGoodsQueryResponse create() {
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
    public HotelGoodsQueryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<HotelGoodsQueryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(HotelGoodsQueryResponseBody body);

        @Override
        HotelGoodsQueryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<HotelGoodsQueryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private HotelGoodsQueryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(HotelGoodsQueryResponse response) {
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
        public Builder body(HotelGoodsQueryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public HotelGoodsQueryResponse build() {
            return new HotelGoodsQueryResponse(this);
        } 

    } 

}
