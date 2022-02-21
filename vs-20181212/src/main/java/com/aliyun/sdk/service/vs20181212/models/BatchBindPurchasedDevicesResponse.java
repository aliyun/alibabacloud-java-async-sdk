// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchBindPurchasedDevicesResponse} extends {@link TeaModel}
 *
 * <p>BatchBindPurchasedDevicesResponse</p>
 */
public class BatchBindPurchasedDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchBindPurchasedDevicesResponseBody body;

    private BatchBindPurchasedDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchBindPurchasedDevicesResponse create() {
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
    public BatchBindPurchasedDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchBindPurchasedDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchBindPurchasedDevicesResponseBody body);

        @Override
        BatchBindPurchasedDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchBindPurchasedDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchBindPurchasedDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchBindPurchasedDevicesResponse response) {
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
        public Builder body(BatchBindPurchasedDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchBindPurchasedDevicesResponse build() {
            return new BatchBindPurchasedDevicesResponse(this);
        } 

    } 

}
