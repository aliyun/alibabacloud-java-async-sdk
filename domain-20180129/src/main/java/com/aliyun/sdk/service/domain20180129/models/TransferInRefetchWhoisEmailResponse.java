// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TransferInRefetchWhoisEmailResponse} extends {@link TeaModel}
 *
 * <p>TransferInRefetchWhoisEmailResponse</p>
 */
public class TransferInRefetchWhoisEmailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TransferInRefetchWhoisEmailResponseBody body;

    private TransferInRefetchWhoisEmailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TransferInRefetchWhoisEmailResponse create() {
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
    public TransferInRefetchWhoisEmailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TransferInRefetchWhoisEmailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TransferInRefetchWhoisEmailResponseBody body);

        @Override
        TransferInRefetchWhoisEmailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TransferInRefetchWhoisEmailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TransferInRefetchWhoisEmailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TransferInRefetchWhoisEmailResponse response) {
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
        public Builder body(TransferInRefetchWhoisEmailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TransferInRefetchWhoisEmailResponse build() {
            return new TransferInRefetchWhoisEmailResponse(this);
        } 

    } 

}
