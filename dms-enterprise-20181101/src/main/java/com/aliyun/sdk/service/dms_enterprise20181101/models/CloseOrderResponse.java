// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloseOrderResponse} extends {@link TeaModel}
 *
 * <p>CloseOrderResponse</p>
 */
public class CloseOrderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CloseOrderResponseBody body;

    private CloseOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CloseOrderResponse create() {
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
    public CloseOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CloseOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CloseOrderResponseBody body);

        @Override
        CloseOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CloseOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CloseOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CloseOrderResponse response) {
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
        public Builder body(CloseOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CloseOrderResponse build() {
            return new CloseOrderResponse(this);
        } 

    } 

}
