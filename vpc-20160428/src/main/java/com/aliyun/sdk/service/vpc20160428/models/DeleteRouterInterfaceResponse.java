// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRouterInterfaceResponse} extends {@link TeaModel}
 *
 * <p>DeleteRouterInterfaceResponse</p>
 */
public class DeleteRouterInterfaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteRouterInterfaceResponseBody body;

    private DeleteRouterInterfaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteRouterInterfaceResponse create() {
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
    public DeleteRouterInterfaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteRouterInterfaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteRouterInterfaceResponseBody body);

        @Override
        DeleteRouterInterfaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteRouterInterfaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteRouterInterfaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteRouterInterfaceResponse response) {
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
        public Builder body(DeleteRouterInterfaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteRouterInterfaceResponse build() {
            return new DeleteRouterInterfaceResponse(this);
        } 

    } 

}
