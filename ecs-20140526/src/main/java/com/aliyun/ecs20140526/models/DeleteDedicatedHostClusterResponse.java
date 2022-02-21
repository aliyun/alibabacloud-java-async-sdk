// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDedicatedHostClusterResponse} extends {@link TeaModel}
 *
 * <p>DeleteDedicatedHostClusterResponse</p>
 */
public class DeleteDedicatedHostClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDedicatedHostClusterResponseBody body;

    private DeleteDedicatedHostClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDedicatedHostClusterResponse create() {
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
    public DeleteDedicatedHostClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDedicatedHostClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDedicatedHostClusterResponseBody body);

        @Override
        DeleteDedicatedHostClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDedicatedHostClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDedicatedHostClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDedicatedHostClusterResponse response) {
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
        public Builder body(DeleteDedicatedHostClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDedicatedHostClusterResponse build() {
            return new DeleteDedicatedHostClusterResponse(this);
        } 

    } 

}
