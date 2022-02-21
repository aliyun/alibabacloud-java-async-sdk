// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchUnbindPurchasedDevicesResponse} extends {@link TeaModel}
 *
 * <p>BatchUnbindPurchasedDevicesResponse</p>
 */
public class BatchUnbindPurchasedDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchUnbindPurchasedDevicesResponseBody body;

    private BatchUnbindPurchasedDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchUnbindPurchasedDevicesResponse create() {
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
    public BatchUnbindPurchasedDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchUnbindPurchasedDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchUnbindPurchasedDevicesResponseBody body);

        @Override
        BatchUnbindPurchasedDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchUnbindPurchasedDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchUnbindPurchasedDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchUnbindPurchasedDevicesResponse response) {
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
        public Builder body(BatchUnbindPurchasedDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchUnbindPurchasedDevicesResponse build() {
            return new BatchUnbindPurchasedDevicesResponse(this);
        } 

    } 

}
