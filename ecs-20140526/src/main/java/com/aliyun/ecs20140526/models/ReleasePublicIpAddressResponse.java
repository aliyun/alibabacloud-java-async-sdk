// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleasePublicIpAddressResponse} extends {@link TeaModel}
 *
 * <p>ReleasePublicIpAddressResponse</p>
 */
public class ReleasePublicIpAddressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReleasePublicIpAddressResponseBody body;

    private ReleasePublicIpAddressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReleasePublicIpAddressResponse create() {
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
    public ReleasePublicIpAddressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReleasePublicIpAddressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReleasePublicIpAddressResponseBody body);

        @Override
        ReleasePublicIpAddressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReleasePublicIpAddressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReleasePublicIpAddressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReleasePublicIpAddressResponse response) {
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
        public Builder body(ReleasePublicIpAddressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReleasePublicIpAddressResponse build() {
            return new ReleasePublicIpAddressResponse(this);
        } 

    } 

}
