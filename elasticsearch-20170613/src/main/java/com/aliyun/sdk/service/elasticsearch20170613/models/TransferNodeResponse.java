// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TransferNodeResponse} extends {@link TeaModel}
 *
 * <p>TransferNodeResponse</p>
 */
public class TransferNodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TransferNodeResponseBody body;

    private TransferNodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TransferNodeResponse create() {
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
    public TransferNodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TransferNodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TransferNodeResponseBody body);

        @Override
        TransferNodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TransferNodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TransferNodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TransferNodeResponse response) {
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
        public Builder body(TransferNodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TransferNodeResponse build() {
            return new TransferNodeResponse(this);
        } 

    } 

}
