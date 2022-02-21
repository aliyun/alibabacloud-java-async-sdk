// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PayOrderCallbackResponse} extends {@link TeaModel}
 *
 * <p>PayOrderCallbackResponse</p>
 */
public class PayOrderCallbackResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PayOrderCallbackResponseBody body;

    private PayOrderCallbackResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PayOrderCallbackResponse create() {
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
    public PayOrderCallbackResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PayOrderCallbackResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PayOrderCallbackResponseBody body);

        @Override
        PayOrderCallbackResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PayOrderCallbackResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PayOrderCallbackResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PayOrderCallbackResponse response) {
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
        public Builder body(PayOrderCallbackResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PayOrderCallbackResponse build() {
            return new PayOrderCallbackResponse(this);
        } 

    } 

}
