// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTransitRouterRouteEntryResponse} extends {@link TeaModel}
 *
 * <p>CreateTransitRouterRouteEntryResponse</p>
 */
public class CreateTransitRouterRouteEntryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateTransitRouterRouteEntryResponseBody body;

    private CreateTransitRouterRouteEntryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateTransitRouterRouteEntryResponse create() {
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
    public CreateTransitRouterRouteEntryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTransitRouterRouteEntryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateTransitRouterRouteEntryResponseBody body);

        @Override
        CreateTransitRouterRouteEntryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTransitRouterRouteEntryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateTransitRouterRouteEntryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTransitRouterRouteEntryResponse response) {
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
        public Builder body(CreateTransitRouterRouteEntryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTransitRouterRouteEntryResponse build() {
            return new CreateTransitRouterRouteEntryResponse(this);
        } 

    } 

}
