// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyEmailResponse} extends {@link TeaModel}
 *
 * <p>VerifyEmailResponse</p>
 */
public class VerifyEmailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private VerifyEmailResponseBody body;

    private VerifyEmailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static VerifyEmailResponse create() {
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
    public VerifyEmailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<VerifyEmailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(VerifyEmailResponseBody body);

        @Override
        VerifyEmailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<VerifyEmailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private VerifyEmailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(VerifyEmailResponse response) {
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
        public Builder body(VerifyEmailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public VerifyEmailResponse build() {
            return new VerifyEmailResponse(this);
        } 

    } 

}
