// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssignIpv6AddressesResponse} extends {@link TeaModel}
 *
 * <p>AssignIpv6AddressesResponse</p>
 */
public class AssignIpv6AddressesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AssignIpv6AddressesResponseBody body;

    private AssignIpv6AddressesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AssignIpv6AddressesResponse create() {
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
    public AssignIpv6AddressesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AssignIpv6AddressesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AssignIpv6AddressesResponseBody body);

        @Override
        AssignIpv6AddressesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AssignIpv6AddressesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AssignIpv6AddressesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AssignIpv6AddressesResponse response) {
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
        public Builder body(AssignIpv6AddressesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AssignIpv6AddressesResponse build() {
            return new AssignIpv6AddressesResponse(this);
        } 

    } 

}
