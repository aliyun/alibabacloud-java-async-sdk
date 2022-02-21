// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TransferInResendMailTokenResponse} extends {@link TeaModel}
 *
 * <p>TransferInResendMailTokenResponse</p>
 */
public class TransferInResendMailTokenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TransferInResendMailTokenResponseBody body;

    private TransferInResendMailTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TransferInResendMailTokenResponse create() {
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
    public TransferInResendMailTokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TransferInResendMailTokenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TransferInResendMailTokenResponseBody body);

        @Override
        TransferInResendMailTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TransferInResendMailTokenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TransferInResendMailTokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TransferInResendMailTokenResponse response) {
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
        public Builder body(TransferInResendMailTokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TransferInResendMailTokenResponse build() {
            return new TransferInResendMailTokenResponse(this);
        } 

    } 

}
