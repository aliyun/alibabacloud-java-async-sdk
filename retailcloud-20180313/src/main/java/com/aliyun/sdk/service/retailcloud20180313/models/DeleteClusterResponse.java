// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteClusterResponse} extends {@link TeaModel}
 *
 * <p>DeleteClusterResponse</p>
 */
public class DeleteClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteClusterResponseBody body;

    private DeleteClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteClusterResponse create() {
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
    public DeleteClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteClusterResponseBody body);

        @Override
        DeleteClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteClusterResponse response) {
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
        public Builder body(DeleteClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteClusterResponse build() {
            return new DeleteClusterResponse(this);
        } 

    } 

}
