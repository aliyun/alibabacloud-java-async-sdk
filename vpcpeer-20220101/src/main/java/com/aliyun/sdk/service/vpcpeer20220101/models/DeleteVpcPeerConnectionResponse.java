// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcpeer20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVpcPeerConnectionResponse} extends {@link TeaModel}
 *
 * <p>DeleteVpcPeerConnectionResponse</p>
 */
public class DeleteVpcPeerConnectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteVpcPeerConnectionResponseBody body;

    private DeleteVpcPeerConnectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteVpcPeerConnectionResponse create() {
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
    public DeleteVpcPeerConnectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteVpcPeerConnectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteVpcPeerConnectionResponseBody body);

        @Override
        DeleteVpcPeerConnectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteVpcPeerConnectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteVpcPeerConnectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteVpcPeerConnectionResponse response) {
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
        public Builder body(DeleteVpcPeerConnectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteVpcPeerConnectionResponse build() {
            return new DeleteVpcPeerConnectionResponse(this);
        } 

    } 

}
