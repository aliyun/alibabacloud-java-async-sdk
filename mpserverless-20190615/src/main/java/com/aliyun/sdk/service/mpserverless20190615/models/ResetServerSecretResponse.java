// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetServerSecretResponse} extends {@link TeaModel}
 *
 * <p>ResetServerSecretResponse</p>
 */
public class ResetServerSecretResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResetServerSecretResponseBody body;

    private ResetServerSecretResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResetServerSecretResponse create() {
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
    public ResetServerSecretResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResetServerSecretResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResetServerSecretResponseBody body);

        @Override
        ResetServerSecretResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResetServerSecretResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResetServerSecretResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResetServerSecretResponse response) {
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
        public Builder body(ResetServerSecretResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResetServerSecretResponse build() {
            return new ResetServerSecretResponse(this);
        } 

    } 

}
