// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociateRouteTableResponse} extends {@link TeaModel}
 *
 * <p>AssociateRouteTableResponse</p>
 */
public class AssociateRouteTableResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AssociateRouteTableResponseBody body;

    private AssociateRouteTableResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AssociateRouteTableResponse create() {
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
    public AssociateRouteTableResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AssociateRouteTableResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AssociateRouteTableResponseBody body);

        @Override
        AssociateRouteTableResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AssociateRouteTableResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AssociateRouteTableResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AssociateRouteTableResponse response) {
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
        public Builder body(AssociateRouteTableResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AssociateRouteTableResponse build() {
            return new AssociateRouteTableResponse(this);
        } 

    } 

}
