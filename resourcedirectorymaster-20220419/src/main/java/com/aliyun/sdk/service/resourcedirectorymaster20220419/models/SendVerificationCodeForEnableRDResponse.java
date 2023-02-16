// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendVerificationCodeForEnableRDResponse} extends {@link TeaModel}
 *
 * <p>SendVerificationCodeForEnableRDResponse</p>
 */
public class SendVerificationCodeForEnableRDResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SendVerificationCodeForEnableRDResponseBody body;

    private SendVerificationCodeForEnableRDResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SendVerificationCodeForEnableRDResponse create() {
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
    public SendVerificationCodeForEnableRDResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SendVerificationCodeForEnableRDResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SendVerificationCodeForEnableRDResponseBody body);

        @Override
        SendVerificationCodeForEnableRDResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SendVerificationCodeForEnableRDResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SendVerificationCodeForEnableRDResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SendVerificationCodeForEnableRDResponse response) {
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
        public Builder body(SendVerificationCodeForEnableRDResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SendVerificationCodeForEnableRDResponse build() {
            return new SendVerificationCodeForEnableRDResponse(this);
        } 

    } 

}
