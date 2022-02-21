// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewNetworkPackagesResponse} extends {@link TeaModel}
 *
 * <p>RenewNetworkPackagesResponse</p>
 */
public class RenewNetworkPackagesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RenewNetworkPackagesResponseBody body;

    private RenewNetworkPackagesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RenewNetworkPackagesResponse create() {
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
    public RenewNetworkPackagesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RenewNetworkPackagesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RenewNetworkPackagesResponseBody body);

        @Override
        RenewNetworkPackagesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RenewNetworkPackagesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RenewNetworkPackagesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RenewNetworkPackagesResponse response) {
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
        public Builder body(RenewNetworkPackagesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RenewNetworkPackagesResponse build() {
            return new RenewNetworkPackagesResponse(this);
        } 

    } 

}
