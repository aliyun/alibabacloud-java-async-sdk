// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendVerificationResponse} extends {@link TeaModel}
 *
 * <p>SendVerificationResponse</p>
 */
public class SendVerificationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SendVerificationResponseBody body;

    private SendVerificationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SendVerificationResponse create() {
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
    public SendVerificationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SendVerificationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SendVerificationResponseBody body);

        @Override
        SendVerificationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SendVerificationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SendVerificationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SendVerificationResponse response) {
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
        public Builder body(SendVerificationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SendVerificationResponse build() {
            return new SendVerificationResponse(this);
        } 

    } 

}
