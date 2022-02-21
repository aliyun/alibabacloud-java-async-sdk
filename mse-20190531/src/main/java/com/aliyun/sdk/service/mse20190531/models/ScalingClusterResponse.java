// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScalingClusterResponse} extends {@link TeaModel}
 *
 * <p>ScalingClusterResponse</p>
 */
public class ScalingClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ScalingClusterResponseBody body;

    private ScalingClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ScalingClusterResponse create() {
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
    public ScalingClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ScalingClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ScalingClusterResponseBody body);

        @Override
        ScalingClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ScalingClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ScalingClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ScalingClusterResponse response) {
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
        public Builder body(ScalingClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ScalingClusterResponse build() {
            return new ScalingClusterResponse(this);
        } 

    } 

}
