// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyCredentialResponse} extends {@link TeaModel}
 *
 * <p>VerifyCredentialResponse</p>
 */
public class VerifyCredentialResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private VerifyCredentialResponseBody body;

    private VerifyCredentialResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static VerifyCredentialResponse create() {
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
    public VerifyCredentialResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<VerifyCredentialResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(VerifyCredentialResponseBody body);

        @Override
        VerifyCredentialResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<VerifyCredentialResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private VerifyCredentialResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(VerifyCredentialResponse response) {
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
        public Builder body(VerifyCredentialResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public VerifyCredentialResponse build() {
            return new VerifyCredentialResponse(this);
        } 

    } 

}
