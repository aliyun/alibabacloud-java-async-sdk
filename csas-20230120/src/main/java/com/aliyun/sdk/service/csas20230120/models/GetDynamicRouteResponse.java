// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDynamicRouteResponse} extends {@link TeaModel}
 *
 * <p>GetDynamicRouteResponse</p>
 */
public class GetDynamicRouteResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDynamicRouteResponseBody body;

    private GetDynamicRouteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDynamicRouteResponse create() {
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
    public GetDynamicRouteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDynamicRouteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDynamicRouteResponseBody body);

        @Override
        GetDynamicRouteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDynamicRouteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDynamicRouteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDynamicRouteResponse response) {
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
        public Builder body(GetDynamicRouteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDynamicRouteResponse build() {
            return new GetDynamicRouteResponse(this);
        } 

    } 

}
