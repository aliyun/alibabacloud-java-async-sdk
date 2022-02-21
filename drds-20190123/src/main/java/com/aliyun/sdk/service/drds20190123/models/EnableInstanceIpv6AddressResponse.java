// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableInstanceIpv6AddressResponse} extends {@link TeaModel}
 *
 * <p>EnableInstanceIpv6AddressResponse</p>
 */
public class EnableInstanceIpv6AddressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableInstanceIpv6AddressResponseBody body;

    private EnableInstanceIpv6AddressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableInstanceIpv6AddressResponse create() {
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
    public EnableInstanceIpv6AddressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableInstanceIpv6AddressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableInstanceIpv6AddressResponseBody body);

        @Override
        EnableInstanceIpv6AddressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableInstanceIpv6AddressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableInstanceIpv6AddressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableInstanceIpv6AddressResponse response) {
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
        public Builder body(EnableInstanceIpv6AddressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableInstanceIpv6AddressResponse build() {
            return new EnableInstanceIpv6AddressResponse(this);
        } 

    } 

}
