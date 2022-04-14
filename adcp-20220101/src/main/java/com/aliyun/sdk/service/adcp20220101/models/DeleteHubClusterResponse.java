// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteHubClusterResponse} extends {@link TeaModel}
 *
 * <p>DeleteHubClusterResponse</p>
 */
public class DeleteHubClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteHubClusterResponseBody body;

    private DeleteHubClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteHubClusterResponse create() {
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
    public DeleteHubClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteHubClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteHubClusterResponseBody body);

        @Override
        DeleteHubClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteHubClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteHubClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteHubClusterResponse response) {
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
        public Builder body(DeleteHubClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteHubClusterResponse build() {
            return new DeleteHubClusterResponse(this);
        } 

    } 

}
