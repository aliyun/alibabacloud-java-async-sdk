// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteClusterNodepoolResponse} extends {@link TeaModel}
 *
 * <p>DeleteClusterNodepoolResponse</p>
 */
public class DeleteClusterNodepoolResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteClusterNodepoolResponseBody body;

    private DeleteClusterNodepoolResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteClusterNodepoolResponse create() {
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
    public DeleteClusterNodepoolResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteClusterNodepoolResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteClusterNodepoolResponseBody body);

        @Override
        DeleteClusterNodepoolResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteClusterNodepoolResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteClusterNodepoolResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteClusterNodepoolResponse response) {
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
        public Builder body(DeleteClusterNodepoolResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteClusterNodepoolResponse build() {
            return new DeleteClusterNodepoolResponse(this);
        } 

    } 

}
