// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteServerlessClusterResponse} extends {@link TeaModel}
 *
 * <p>DeleteServerlessClusterResponse</p>
 */
public class DeleteServerlessClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteServerlessClusterResponseBody body;

    private DeleteServerlessClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteServerlessClusterResponse create() {
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
    public DeleteServerlessClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteServerlessClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteServerlessClusterResponseBody body);

        @Override
        DeleteServerlessClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteServerlessClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteServerlessClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteServerlessClusterResponse response) {
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
        public Builder body(DeleteServerlessClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteServerlessClusterResponse build() {
            return new DeleteServerlessClusterResponse(this);
        } 

    } 

}
