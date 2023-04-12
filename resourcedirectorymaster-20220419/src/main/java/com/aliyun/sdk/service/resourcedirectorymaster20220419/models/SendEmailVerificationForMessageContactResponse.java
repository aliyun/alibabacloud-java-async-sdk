// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendEmailVerificationForMessageContactResponse} extends {@link TeaModel}
 *
 * <p>SendEmailVerificationForMessageContactResponse</p>
 */
public class SendEmailVerificationForMessageContactResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SendEmailVerificationForMessageContactResponseBody body;

    private SendEmailVerificationForMessageContactResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SendEmailVerificationForMessageContactResponse create() {
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
    public SendEmailVerificationForMessageContactResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SendEmailVerificationForMessageContactResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SendEmailVerificationForMessageContactResponseBody body);

        @Override
        SendEmailVerificationForMessageContactResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SendEmailVerificationForMessageContactResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SendEmailVerificationForMessageContactResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SendEmailVerificationForMessageContactResponse response) {
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
        public Builder body(SendEmailVerificationForMessageContactResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SendEmailVerificationForMessageContactResponse build() {
            return new SendEmailVerificationForMessageContactResponse(this);
        } 

    } 

}
