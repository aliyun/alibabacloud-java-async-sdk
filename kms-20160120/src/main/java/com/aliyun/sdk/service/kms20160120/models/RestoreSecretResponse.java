// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestoreSecretResponse} extends {@link TeaModel}
 *
 * <p>RestoreSecretResponse</p>
 */
public class RestoreSecretResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RestoreSecretResponseBody body;

    private RestoreSecretResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RestoreSecretResponse create() {
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
    public RestoreSecretResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RestoreSecretResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RestoreSecretResponseBody body);

        @Override
        RestoreSecretResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RestoreSecretResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RestoreSecretResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RestoreSecretResponse response) {
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
        public Builder body(RestoreSecretResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RestoreSecretResponse build() {
            return new RestoreSecretResponse(this);
        } 

    } 

}
