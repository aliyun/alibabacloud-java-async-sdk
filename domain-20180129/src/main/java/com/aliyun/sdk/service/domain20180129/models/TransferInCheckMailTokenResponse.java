// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TransferInCheckMailTokenResponse} extends {@link TeaModel}
 *
 * <p>TransferInCheckMailTokenResponse</p>
 */
public class TransferInCheckMailTokenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TransferInCheckMailTokenResponseBody body;

    private TransferInCheckMailTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TransferInCheckMailTokenResponse create() {
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
    public TransferInCheckMailTokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TransferInCheckMailTokenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TransferInCheckMailTokenResponseBody body);

        @Override
        TransferInCheckMailTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TransferInCheckMailTokenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TransferInCheckMailTokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TransferInCheckMailTokenResponse response) {
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
        public Builder body(TransferInCheckMailTokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TransferInCheckMailTokenResponse build() {
            return new TransferInCheckMailTokenResponse(this);
        } 

    } 

}
