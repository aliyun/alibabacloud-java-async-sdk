// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelOrderRequestResponse} extends {@link TeaModel}
 *
 * <p>CancelOrderRequestResponse</p>
 */
public class CancelOrderRequestResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelOrderRequestResponseBody body;

    private CancelOrderRequestResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelOrderRequestResponse create() {
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
    public CancelOrderRequestResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelOrderRequestResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelOrderRequestResponseBody body);

        @Override
        CancelOrderRequestResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelOrderRequestResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelOrderRequestResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelOrderRequestResponse response) {
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
        public Builder body(CancelOrderRequestResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelOrderRequestResponse build() {
            return new CancelOrderRequestResponse(this);
        } 

    } 

}
