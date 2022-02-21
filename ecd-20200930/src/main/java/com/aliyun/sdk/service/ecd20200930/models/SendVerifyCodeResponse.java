// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendVerifyCodeResponse} extends {@link TeaModel}
 *
 * <p>SendVerifyCodeResponse</p>
 */
public class SendVerifyCodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SendVerifyCodeResponseBody body;

    private SendVerifyCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SendVerifyCodeResponse create() {
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
    public SendVerifyCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SendVerifyCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SendVerifyCodeResponseBody body);

        @Override
        SendVerifyCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SendVerifyCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SendVerifyCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SendVerifyCodeResponse response) {
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
        public Builder body(SendVerifyCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SendVerifyCodeResponse build() {
            return new SendVerifyCodeResponse(this);
        } 

    } 

}
