// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVpnPbrRouteEntryResponse} extends {@link TeaModel}
 *
 * <p>DeleteVpnPbrRouteEntryResponse</p>
 */
public class DeleteVpnPbrRouteEntryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteVpnPbrRouteEntryResponseBody body;

    private DeleteVpnPbrRouteEntryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteVpnPbrRouteEntryResponse create() {
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
    public DeleteVpnPbrRouteEntryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteVpnPbrRouteEntryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteVpnPbrRouteEntryResponseBody body);

        @Override
        DeleteVpnPbrRouteEntryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteVpnPbrRouteEntryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteVpnPbrRouteEntryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteVpnPbrRouteEntryResponse response) {
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
        public Builder body(DeleteVpnPbrRouteEntryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteVpnPbrRouteEntryResponse build() {
            return new DeleteVpnPbrRouteEntryResponse(this);
        } 

    } 

}
