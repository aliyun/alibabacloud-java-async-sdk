// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TransferIntentionOwnerResponse} extends {@link TeaModel}
 *
 * <p>TransferIntentionOwnerResponse</p>
 */
public class TransferIntentionOwnerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TransferIntentionOwnerResponseBody body;

    private TransferIntentionOwnerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TransferIntentionOwnerResponse create() {
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
    public TransferIntentionOwnerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TransferIntentionOwnerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TransferIntentionOwnerResponseBody body);

        @Override
        TransferIntentionOwnerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TransferIntentionOwnerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TransferIntentionOwnerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TransferIntentionOwnerResponse response) {
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
        public Builder body(TransferIntentionOwnerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TransferIntentionOwnerResponse build() {
            return new TransferIntentionOwnerResponse(this);
        } 

    } 

}
