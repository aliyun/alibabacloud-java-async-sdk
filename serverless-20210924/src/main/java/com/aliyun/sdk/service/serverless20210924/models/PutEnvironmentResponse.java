// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutEnvironmentResponse} extends {@link TeaModel}
 *
 * <p>PutEnvironmentResponse</p>
 */
public class PutEnvironmentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private Environment body;

    private PutEnvironmentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PutEnvironmentResponse create() {
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
    public Environment getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PutEnvironmentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(Environment body);

        @Override
        PutEnvironmentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PutEnvironmentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Environment body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PutEnvironmentResponse response) {
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
        public Builder body(Environment body) {
            this.body = body;
            return this;
        }

        @Override
        public PutEnvironmentResponse build() {
            return new PutEnvironmentResponse(this);
        } 

    } 

}
