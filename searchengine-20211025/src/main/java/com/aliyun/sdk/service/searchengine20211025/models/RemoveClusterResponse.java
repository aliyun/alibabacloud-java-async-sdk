// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveClusterResponse} extends {@link TeaModel}
 *
 * <p>RemoveClusterResponse</p>
 */
public class RemoveClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveClusterResponseBody body;

    private RemoveClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveClusterResponse create() {
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
    public RemoveClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveClusterResponseBody body);

        @Override
        RemoveClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveClusterResponse response) {
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
        public Builder body(RemoveClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveClusterResponse build() {
            return new RemoveClusterResponse(this);
        } 

    } 

}
