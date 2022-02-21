// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTransitRouterRouteEntryResponse} extends {@link TeaModel}
 *
 * <p>DeleteTransitRouterRouteEntryResponse</p>
 */
public class DeleteTransitRouterRouteEntryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteTransitRouterRouteEntryResponseBody body;

    private DeleteTransitRouterRouteEntryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteTransitRouterRouteEntryResponse create() {
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
    public DeleteTransitRouterRouteEntryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteTransitRouterRouteEntryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteTransitRouterRouteEntryResponseBody body);

        @Override
        DeleteTransitRouterRouteEntryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteTransitRouterRouteEntryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteTransitRouterRouteEntryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteTransitRouterRouteEntryResponse response) {
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
        public Builder body(DeleteTransitRouterRouteEntryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteTransitRouterRouteEntryResponse build() {
            return new DeleteTransitRouterRouteEntryResponse(this);
        } 

    } 

}
