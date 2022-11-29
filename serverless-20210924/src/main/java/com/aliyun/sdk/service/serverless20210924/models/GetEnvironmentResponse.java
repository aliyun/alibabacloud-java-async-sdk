// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEnvironmentResponse} extends {@link TeaModel}
 *
 * <p>GetEnvironmentResponse</p>
 */
public class GetEnvironmentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private Environment body;

    private GetEnvironmentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetEnvironmentResponse create() {
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

    public interface Builder extends Response.Builder<GetEnvironmentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(Environment body);

        @Override
        GetEnvironmentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetEnvironmentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Environment body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetEnvironmentResponse response) {
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
        public GetEnvironmentResponse build() {
            return new GetEnvironmentResponse(this);
        } 

    } 

}
