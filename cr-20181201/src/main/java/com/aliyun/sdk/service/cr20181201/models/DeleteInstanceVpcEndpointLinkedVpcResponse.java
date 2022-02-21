// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteInstanceVpcEndpointLinkedVpcResponse} extends {@link TeaModel}
 *
 * <p>DeleteInstanceVpcEndpointLinkedVpcResponse</p>
 */
public class DeleteInstanceVpcEndpointLinkedVpcResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteInstanceVpcEndpointLinkedVpcResponseBody body;

    private DeleteInstanceVpcEndpointLinkedVpcResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteInstanceVpcEndpointLinkedVpcResponse create() {
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
    public DeleteInstanceVpcEndpointLinkedVpcResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteInstanceVpcEndpointLinkedVpcResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteInstanceVpcEndpointLinkedVpcResponseBody body);

        @Override
        DeleteInstanceVpcEndpointLinkedVpcResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteInstanceVpcEndpointLinkedVpcResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteInstanceVpcEndpointLinkedVpcResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteInstanceVpcEndpointLinkedVpcResponse response) {
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
        public Builder body(DeleteInstanceVpcEndpointLinkedVpcResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteInstanceVpcEndpointLinkedVpcResponse build() {
            return new DeleteInstanceVpcEndpointLinkedVpcResponse(this);
        } 

    } 

}
