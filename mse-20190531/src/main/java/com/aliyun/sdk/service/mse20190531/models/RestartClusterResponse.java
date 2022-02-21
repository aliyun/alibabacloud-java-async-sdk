// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartClusterResponse} extends {@link TeaModel}
 *
 * <p>RestartClusterResponse</p>
 */
public class RestartClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RestartClusterResponseBody body;

    private RestartClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RestartClusterResponse create() {
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
    public RestartClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RestartClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RestartClusterResponseBody body);

        @Override
        RestartClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RestartClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RestartClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RestartClusterResponse response) {
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
        public Builder body(RestartClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RestartClusterResponse build() {
            return new RestartClusterResponse(this);
        } 

    } 

}
