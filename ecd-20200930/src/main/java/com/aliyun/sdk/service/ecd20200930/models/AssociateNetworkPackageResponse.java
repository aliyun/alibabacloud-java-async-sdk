// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociateNetworkPackageResponse} extends {@link TeaModel}
 *
 * <p>AssociateNetworkPackageResponse</p>
 */
public class AssociateNetworkPackageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AssociateNetworkPackageResponseBody body;

    private AssociateNetworkPackageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AssociateNetworkPackageResponse create() {
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
    public AssociateNetworkPackageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AssociateNetworkPackageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AssociateNetworkPackageResponseBody body);

        @Override
        AssociateNetworkPackageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AssociateNetworkPackageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AssociateNetworkPackageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AssociateNetworkPackageResponse response) {
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
        public Builder body(AssociateNetworkPackageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AssociateNetworkPackageResponse build() {
            return new AssociateNetworkPackageResponse(this);
        } 

    } 

}
