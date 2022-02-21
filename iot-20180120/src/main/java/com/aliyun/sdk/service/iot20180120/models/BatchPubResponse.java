// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchPubResponse} extends {@link TeaModel}
 *
 * <p>BatchPubResponse</p>
 */
public class BatchPubResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchPubResponseBody body;

    private BatchPubResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchPubResponse create() {
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
    public BatchPubResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchPubResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchPubResponseBody body);

        @Override
        BatchPubResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchPubResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchPubResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchPubResponse response) {
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
        public Builder body(BatchPubResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchPubResponse build() {
            return new BatchPubResponse(this);
        } 

    } 

}
