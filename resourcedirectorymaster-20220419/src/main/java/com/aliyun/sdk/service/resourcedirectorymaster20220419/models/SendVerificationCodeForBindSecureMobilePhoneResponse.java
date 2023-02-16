// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendVerificationCodeForBindSecureMobilePhoneResponse} extends {@link TeaModel}
 *
 * <p>SendVerificationCodeForBindSecureMobilePhoneResponse</p>
 */
public class SendVerificationCodeForBindSecureMobilePhoneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SendVerificationCodeForBindSecureMobilePhoneResponseBody body;

    private SendVerificationCodeForBindSecureMobilePhoneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SendVerificationCodeForBindSecureMobilePhoneResponse create() {
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
    public SendVerificationCodeForBindSecureMobilePhoneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SendVerificationCodeForBindSecureMobilePhoneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SendVerificationCodeForBindSecureMobilePhoneResponseBody body);

        @Override
        SendVerificationCodeForBindSecureMobilePhoneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SendVerificationCodeForBindSecureMobilePhoneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SendVerificationCodeForBindSecureMobilePhoneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SendVerificationCodeForBindSecureMobilePhoneResponse response) {
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
        public Builder body(SendVerificationCodeForBindSecureMobilePhoneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SendVerificationCodeForBindSecureMobilePhoneResponse build() {
            return new SendVerificationCodeForBindSecureMobilePhoneResponse(this);
        } 

    } 

}
