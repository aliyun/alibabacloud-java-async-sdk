// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DissociateNetworkPackageResponse} extends {@link TeaModel}
 *
 * <p>DissociateNetworkPackageResponse</p>
 */
public class DissociateNetworkPackageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DissociateNetworkPackageResponseBody body;

    private DissociateNetworkPackageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DissociateNetworkPackageResponse create() {
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
    public DissociateNetworkPackageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DissociateNetworkPackageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DissociateNetworkPackageResponseBody body);

        @Override
        DissociateNetworkPackageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DissociateNetworkPackageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DissociateNetworkPackageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DissociateNetworkPackageResponse response) {
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
        public Builder body(DissociateNetworkPackageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DissociateNetworkPackageResponse build() {
            return new DissociateNetworkPackageResponse(this);
        } 

    } 

}
