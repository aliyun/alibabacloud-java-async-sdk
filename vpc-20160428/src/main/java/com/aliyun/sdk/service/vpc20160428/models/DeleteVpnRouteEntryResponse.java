// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVpnRouteEntryResponse} extends {@link TeaModel}
 *
 * <p>DeleteVpnRouteEntryResponse</p>
 */
public class DeleteVpnRouteEntryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteVpnRouteEntryResponseBody body;

    private DeleteVpnRouteEntryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteVpnRouteEntryResponse create() {
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
    public DeleteVpnRouteEntryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteVpnRouteEntryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteVpnRouteEntryResponseBody body);

        @Override
        DeleteVpnRouteEntryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteVpnRouteEntryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteVpnRouteEntryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteVpnRouteEntryResponse response) {
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
        public Builder body(DeleteVpnRouteEntryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteVpnRouteEntryResponse build() {
            return new DeleteVpnRouteEntryResponse(this);
        } 

    } 

}
