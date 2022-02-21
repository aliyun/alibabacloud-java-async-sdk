// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitEmailVerificationResponse} extends {@link TeaModel}
 *
 * <p>SubmitEmailVerificationResponse</p>
 */
public class SubmitEmailVerificationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitEmailVerificationResponseBody body;

    private SubmitEmailVerificationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitEmailVerificationResponse create() {
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
    public SubmitEmailVerificationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitEmailVerificationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitEmailVerificationResponseBody body);

        @Override
        SubmitEmailVerificationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitEmailVerificationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitEmailVerificationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitEmailVerificationResponse response) {
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
        public Builder body(SubmitEmailVerificationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitEmailVerificationResponse build() {
            return new SubmitEmailVerificationResponse(this);
        } 

    } 

}
