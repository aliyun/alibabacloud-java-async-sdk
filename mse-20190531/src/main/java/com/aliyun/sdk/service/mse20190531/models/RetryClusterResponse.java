// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RetryClusterResponse} extends {@link TeaModel}
 *
 * <p>RetryClusterResponse</p>
 */
public class RetryClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RetryClusterResponseBody body;

    private RetryClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RetryClusterResponse create() {
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
    public RetryClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RetryClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RetryClusterResponseBody body);

        @Override
        RetryClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RetryClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RetryClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RetryClusterResponse response) {
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
        public Builder body(RetryClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RetryClusterResponse build() {
            return new RetryClusterResponse(this);
        } 

    } 

}
