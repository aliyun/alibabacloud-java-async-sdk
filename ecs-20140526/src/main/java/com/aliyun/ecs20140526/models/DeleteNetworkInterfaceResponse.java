// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNetworkInterfaceResponse} extends {@link TeaModel}
 *
 * <p>DeleteNetworkInterfaceResponse</p>
 */
public class DeleteNetworkInterfaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteNetworkInterfaceResponseBody body;

    private DeleteNetworkInterfaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteNetworkInterfaceResponse create() {
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
    public DeleteNetworkInterfaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteNetworkInterfaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteNetworkInterfaceResponseBody body);

        @Override
        DeleteNetworkInterfaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteNetworkInterfaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteNetworkInterfaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteNetworkInterfaceResponse response) {
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
        public Builder body(DeleteNetworkInterfaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteNetworkInterfaceResponse build() {
            return new DeleteNetworkInterfaceResponse(this);
        } 

    } 

}
