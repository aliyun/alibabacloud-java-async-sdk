// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExtendClusterResponse} extends {@link TeaModel}
 *
 * <p>ExtendClusterResponse</p>
 */
public class ExtendClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExtendClusterResponseBody body;

    private ExtendClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExtendClusterResponse create() {
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
    public ExtendClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExtendClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExtendClusterResponseBody body);

        @Override
        ExtendClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExtendClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExtendClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExtendClusterResponse response) {
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
        public Builder body(ExtendClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExtendClusterResponse build() {
            return new ExtendClusterResponse(this);
        } 

    } 

}
