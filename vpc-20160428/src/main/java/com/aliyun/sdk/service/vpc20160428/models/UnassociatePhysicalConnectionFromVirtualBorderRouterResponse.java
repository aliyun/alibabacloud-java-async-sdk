// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnassociatePhysicalConnectionFromVirtualBorderRouterResponse} extends {@link TeaModel}
 *
 * <p>UnassociatePhysicalConnectionFromVirtualBorderRouterResponse</p>
 */
public class UnassociatePhysicalConnectionFromVirtualBorderRouterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnassociatePhysicalConnectionFromVirtualBorderRouterResponseBody body;

    private UnassociatePhysicalConnectionFromVirtualBorderRouterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnassociatePhysicalConnectionFromVirtualBorderRouterResponse create() {
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
    public UnassociatePhysicalConnectionFromVirtualBorderRouterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnassociatePhysicalConnectionFromVirtualBorderRouterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnassociatePhysicalConnectionFromVirtualBorderRouterResponseBody body);

        @Override
        UnassociatePhysicalConnectionFromVirtualBorderRouterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnassociatePhysicalConnectionFromVirtualBorderRouterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnassociatePhysicalConnectionFromVirtualBorderRouterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnassociatePhysicalConnectionFromVirtualBorderRouterResponse response) {
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
        public Builder body(UnassociatePhysicalConnectionFromVirtualBorderRouterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnassociatePhysicalConnectionFromVirtualBorderRouterResponse build() {
            return new UnassociatePhysicalConnectionFromVirtualBorderRouterResponse(this);
        } 

    } 

}
