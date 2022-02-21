// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRpcServiceResponse} extends {@link TeaModel}
 *
 * <p>DeleteRpcServiceResponse</p>
 */
public class DeleteRpcServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteRpcServiceResponseBody body;

    private DeleteRpcServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteRpcServiceResponse create() {
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
    public DeleteRpcServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteRpcServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteRpcServiceResponseBody body);

        @Override
        DeleteRpcServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteRpcServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteRpcServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteRpcServiceResponse response) {
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
        public Builder body(DeleteRpcServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteRpcServiceResponse build() {
            return new DeleteRpcServiceResponse(this);
        } 

    } 

}
