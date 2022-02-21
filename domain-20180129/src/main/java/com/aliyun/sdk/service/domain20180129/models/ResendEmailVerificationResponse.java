// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResendEmailVerificationResponse} extends {@link TeaModel}
 *
 * <p>ResendEmailVerificationResponse</p>
 */
public class ResendEmailVerificationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResendEmailVerificationResponseBody body;

    private ResendEmailVerificationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResendEmailVerificationResponse create() {
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
    public ResendEmailVerificationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResendEmailVerificationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResendEmailVerificationResponseBody body);

        @Override
        ResendEmailVerificationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResendEmailVerificationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResendEmailVerificationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResendEmailVerificationResponse response) {
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
        public Builder body(ResendEmailVerificationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResendEmailVerificationResponse build() {
            return new ResendEmailVerificationResponse(this);
        } 

    } 

}
