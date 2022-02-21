// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetAppSecretResponse} extends {@link TeaModel}
 *
 * <p>ResetAppSecretResponse</p>
 */
public class ResetAppSecretResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResetAppSecretResponseBody body;

    private ResetAppSecretResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResetAppSecretResponse create() {
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
    public ResetAppSecretResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResetAppSecretResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResetAppSecretResponseBody body);

        @Override
        ResetAppSecretResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResetAppSecretResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResetAppSecretResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResetAppSecretResponse response) {
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
        public Builder body(ResetAppSecretResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResetAppSecretResponse build() {
            return new ResetAppSecretResponse(this);
        } 

    } 

}
