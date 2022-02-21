// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVpnConnectionResponse} extends {@link TeaModel}
 *
 * <p>DeleteVpnConnectionResponse</p>
 */
public class DeleteVpnConnectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteVpnConnectionResponseBody body;

    private DeleteVpnConnectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteVpnConnectionResponse create() {
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
    public DeleteVpnConnectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteVpnConnectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteVpnConnectionResponseBody body);

        @Override
        DeleteVpnConnectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteVpnConnectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteVpnConnectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteVpnConnectionResponse response) {
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
        public Builder body(DeleteVpnConnectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteVpnConnectionResponse build() {
            return new DeleteVpnConnectionResponse(this);
        } 

    } 

}
