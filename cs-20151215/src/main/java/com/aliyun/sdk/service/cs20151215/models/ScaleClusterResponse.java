// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScaleClusterResponse} extends {@link TeaModel}
 *
 * <p>ScaleClusterResponse</p>
 */
public class ScaleClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ScaleClusterResponseBody body;

    private ScaleClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ScaleClusterResponse create() {
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
    public ScaleClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ScaleClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ScaleClusterResponseBody body);

        @Override
        ScaleClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ScaleClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ScaleClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ScaleClusterResponse response) {
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
        public Builder body(ScaleClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ScaleClusterResponse build() {
            return new ScaleClusterResponse(this);
        } 

    } 

}
