// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNetworkInterfacePermissionResponse} extends {@link TeaModel}
 *
 * <p>DeleteNetworkInterfacePermissionResponse</p>
 */
public class DeleteNetworkInterfacePermissionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteNetworkInterfacePermissionResponseBody body;

    private DeleteNetworkInterfacePermissionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteNetworkInterfacePermissionResponse create() {
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
    public DeleteNetworkInterfacePermissionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteNetworkInterfacePermissionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteNetworkInterfacePermissionResponseBody body);

        @Override
        DeleteNetworkInterfacePermissionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteNetworkInterfacePermissionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteNetworkInterfacePermissionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteNetworkInterfacePermissionResponse response) {
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
        public Builder body(DeleteNetworkInterfacePermissionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteNetworkInterfacePermissionResponse build() {
            return new DeleteNetworkInterfacePermissionResponse(this);
        } 

    } 

}
