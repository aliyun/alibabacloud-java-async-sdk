// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableDeployKeyResponse} extends {@link TeaModel}
 *
 * <p>EnableDeployKeyResponse</p>
 */
public class EnableDeployKeyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableDeployKeyResponseBody body;

    private EnableDeployKeyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableDeployKeyResponse create() {
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
    public EnableDeployKeyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableDeployKeyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableDeployKeyResponseBody body);

        @Override
        EnableDeployKeyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableDeployKeyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableDeployKeyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableDeployKeyResponse response) {
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
        public Builder body(EnableDeployKeyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableDeployKeyResponse build() {
            return new EnableDeployKeyResponse(this);
        } 

    } 

}
