// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyFileResponse} extends {@link TeaModel}
 *
 * <p>VerifyFileResponse</p>
 */
public class VerifyFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private VerifyFileResponseBody body;

    private VerifyFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static VerifyFileResponse create() {
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
    public VerifyFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<VerifyFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(VerifyFileResponseBody body);

        @Override
        VerifyFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<VerifyFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private VerifyFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(VerifyFileResponse response) {
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
        public Builder body(VerifyFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public VerifyFileResponse build() {
            return new VerifyFileResponse(this);
        } 

    } 

}
