// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDynamicRouteResponse} extends {@link TeaModel}
 *
 * <p>CreateDynamicRouteResponse</p>
 */
public class CreateDynamicRouteResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDynamicRouteResponseBody body;

    private CreateDynamicRouteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDynamicRouteResponse create() {
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
    public CreateDynamicRouteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDynamicRouteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDynamicRouteResponseBody body);

        @Override
        CreateDynamicRouteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDynamicRouteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDynamicRouteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDynamicRouteResponse response) {
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
        public Builder body(CreateDynamicRouteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDynamicRouteResponse build() {
            return new CreateDynamicRouteResponse(this);
        } 

    } 

}
