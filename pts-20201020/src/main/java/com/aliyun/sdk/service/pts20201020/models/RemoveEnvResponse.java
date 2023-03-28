// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveEnvResponse} extends {@link TeaModel}
 *
 * <p>RemoveEnvResponse</p>
 */
public class RemoveEnvResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveEnvResponseBody body;

    private RemoveEnvResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveEnvResponse create() {
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
    public RemoveEnvResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveEnvResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveEnvResponseBody body);

        @Override
        RemoveEnvResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveEnvResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveEnvResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveEnvResponse response) {
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
        public Builder body(RemoveEnvResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveEnvResponse build() {
            return new RemoveEnvResponse(this);
        } 

    } 

}
