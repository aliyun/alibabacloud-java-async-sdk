// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableApplicationClientSecretResponse} extends {@link TeaModel}
 *
 * <p>EnableApplicationClientSecretResponse</p>
 */
public class EnableApplicationClientSecretResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableApplicationClientSecretResponseBody body;

    private EnableApplicationClientSecretResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableApplicationClientSecretResponse create() {
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
    public EnableApplicationClientSecretResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableApplicationClientSecretResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableApplicationClientSecretResponseBody body);

        @Override
        EnableApplicationClientSecretResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableApplicationClientSecretResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableApplicationClientSecretResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableApplicationClientSecretResponse response) {
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
        public Builder body(EnableApplicationClientSecretResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableApplicationClientSecretResponse build() {
            return new EnableApplicationClientSecretResponse(this);
        } 

    } 

}
