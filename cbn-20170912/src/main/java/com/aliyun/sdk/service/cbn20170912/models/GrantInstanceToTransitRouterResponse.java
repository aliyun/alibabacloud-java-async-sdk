// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrantInstanceToTransitRouterResponse} extends {@link TeaModel}
 *
 * <p>GrantInstanceToTransitRouterResponse</p>
 */
public class GrantInstanceToTransitRouterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GrantInstanceToTransitRouterResponseBody body;

    private GrantInstanceToTransitRouterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GrantInstanceToTransitRouterResponse create() {
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
    public GrantInstanceToTransitRouterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GrantInstanceToTransitRouterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GrantInstanceToTransitRouterResponseBody body);

        @Override
        GrantInstanceToTransitRouterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GrantInstanceToTransitRouterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GrantInstanceToTransitRouterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GrantInstanceToTransitRouterResponse response) {
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
        public Builder body(GrantInstanceToTransitRouterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GrantInstanceToTransitRouterResponse build() {
            return new GrantInstanceToTransitRouterResponse(this);
        } 

    } 

}
