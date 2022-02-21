// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleasePublicNetworkAddressResponse} extends {@link TeaModel}
 *
 * <p>ReleasePublicNetworkAddressResponse</p>
 */
public class ReleasePublicNetworkAddressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReleasePublicNetworkAddressResponseBody body;

    private ReleasePublicNetworkAddressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReleasePublicNetworkAddressResponse create() {
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
    public ReleasePublicNetworkAddressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReleasePublicNetworkAddressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReleasePublicNetworkAddressResponseBody body);

        @Override
        ReleasePublicNetworkAddressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReleasePublicNetworkAddressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReleasePublicNetworkAddressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReleasePublicNetworkAddressResponse response) {
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
        public Builder body(ReleasePublicNetworkAddressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReleasePublicNetworkAddressResponse build() {
            return new ReleasePublicNetworkAddressResponse(this);
        } 

    } 

}
