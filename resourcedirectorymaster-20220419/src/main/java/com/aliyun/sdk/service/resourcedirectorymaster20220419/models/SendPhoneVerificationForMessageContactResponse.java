// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendPhoneVerificationForMessageContactResponse} extends {@link TeaModel}
 *
 * <p>SendPhoneVerificationForMessageContactResponse</p>
 */
public class SendPhoneVerificationForMessageContactResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SendPhoneVerificationForMessageContactResponseBody body;

    private SendPhoneVerificationForMessageContactResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SendPhoneVerificationForMessageContactResponse create() {
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
    public SendPhoneVerificationForMessageContactResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SendPhoneVerificationForMessageContactResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SendPhoneVerificationForMessageContactResponseBody body);

        @Override
        SendPhoneVerificationForMessageContactResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SendPhoneVerificationForMessageContactResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SendPhoneVerificationForMessageContactResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SendPhoneVerificationForMessageContactResponse response) {
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
        public Builder body(SendPhoneVerificationForMessageContactResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SendPhoneVerificationForMessageContactResponse build() {
            return new SendPhoneVerificationForMessageContactResponse(this);
        } 

    } 

}
