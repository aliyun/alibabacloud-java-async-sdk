// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVpcResponse} extends {@link TeaModel}
 *
 * <p>DeleteVpcResponse</p>
 */
public class DeleteVpcResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteVpcResponseBody body;

    private DeleteVpcResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteVpcResponse create() {
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
    public DeleteVpcResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteVpcResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteVpcResponseBody body);

        @Override
        DeleteVpcResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteVpcResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteVpcResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteVpcResponse response) {
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
        public Builder body(DeleteVpcResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteVpcResponse build() {
            return new DeleteVpcResponse(this);
        } 

    } 

}
