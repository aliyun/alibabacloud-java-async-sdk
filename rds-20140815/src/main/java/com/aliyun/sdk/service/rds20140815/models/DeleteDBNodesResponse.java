// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDBNodesResponse} extends {@link TeaModel}
 *
 * <p>DeleteDBNodesResponse</p>
 */
public class DeleteDBNodesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDBNodesResponseBody body;

    private DeleteDBNodesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDBNodesResponse create() {
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
    public DeleteDBNodesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDBNodesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDBNodesResponseBody body);

        @Override
        DeleteDBNodesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDBNodesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDBNodesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDBNodesResponse response) {
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
        public Builder body(DeleteDBNodesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDBNodesResponse build() {
            return new DeleteDBNodesResponse(this);
        } 

    } 

}
