// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TransferInstanceClassResponse} extends {@link TeaModel}
 *
 * <p>TransferInstanceClassResponse</p>
 */
public class TransferInstanceClassResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TransferInstanceClassResponseBody body;

    private TransferInstanceClassResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TransferInstanceClassResponse create() {
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
    public TransferInstanceClassResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TransferInstanceClassResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TransferInstanceClassResponseBody body);

        @Override
        TransferInstanceClassResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TransferInstanceClassResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TransferInstanceClassResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TransferInstanceClassResponse response) {
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
        public Builder body(TransferInstanceClassResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TransferInstanceClassResponse build() {
            return new TransferInstanceClassResponse(this);
        } 

    } 

}
