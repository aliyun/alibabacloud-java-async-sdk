// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TransferRepositoryResponse} extends {@link TeaModel}
 *
 * <p>TransferRepositoryResponse</p>
 */
public class TransferRepositoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TransferRepositoryResponseBody body;

    private TransferRepositoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TransferRepositoryResponse create() {
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
    public TransferRepositoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TransferRepositoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TransferRepositoryResponseBody body);

        @Override
        TransferRepositoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TransferRepositoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TransferRepositoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TransferRepositoryResponse response) {
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
        public Builder body(TransferRepositoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TransferRepositoryResponse build() {
            return new TransferRepositoryResponse(this);
        } 

    } 

}
