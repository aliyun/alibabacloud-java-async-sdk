// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDynamicRouteResponse} extends {@link TeaModel}
 *
 * <p>DeleteDynamicRouteResponse</p>
 */
public class DeleteDynamicRouteResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDynamicRouteResponseBody body;

    private DeleteDynamicRouteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDynamicRouteResponse create() {
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
    public DeleteDynamicRouteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDynamicRouteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDynamicRouteResponseBody body);

        @Override
        DeleteDynamicRouteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDynamicRouteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDynamicRouteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDynamicRouteResponse response) {
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
        public Builder body(DeleteDynamicRouteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDynamicRouteResponse build() {
            return new DeleteDynamicRouteResponse(this);
        } 

    } 

}
