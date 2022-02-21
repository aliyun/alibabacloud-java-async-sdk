// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EmailVerifiedResponse} extends {@link TeaModel}
 *
 * <p>EmailVerifiedResponse</p>
 */
public class EmailVerifiedResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EmailVerifiedResponseBody body;

    private EmailVerifiedResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EmailVerifiedResponse create() {
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
    public EmailVerifiedResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EmailVerifiedResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EmailVerifiedResponseBody body);

        @Override
        EmailVerifiedResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EmailVerifiedResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EmailVerifiedResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EmailVerifiedResponse response) {
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
        public Builder body(EmailVerifiedResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EmailVerifiedResponse build() {
            return new EmailVerifiedResponse(this);
        } 

    } 

}
