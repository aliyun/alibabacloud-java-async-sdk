// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotelOrderPayResponse} extends {@link TeaModel}
 *
 * <p>HotelOrderPayResponse</p>
 */
public class HotelOrderPayResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private HotelOrderPayResponseBody body;

    private HotelOrderPayResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static HotelOrderPayResponse create() {
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
    public HotelOrderPayResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<HotelOrderPayResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(HotelOrderPayResponseBody body);

        @Override
        HotelOrderPayResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<HotelOrderPayResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private HotelOrderPayResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(HotelOrderPayResponse response) {
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
        public Builder body(HotelOrderPayResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public HotelOrderPayResponse build() {
            return new HotelOrderPayResponse(this);
        } 

    } 

}
