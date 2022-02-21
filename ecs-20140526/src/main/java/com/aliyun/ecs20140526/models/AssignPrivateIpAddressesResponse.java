// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssignPrivateIpAddressesResponse} extends {@link TeaModel}
 *
 * <p>AssignPrivateIpAddressesResponse</p>
 */
public class AssignPrivateIpAddressesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AssignPrivateIpAddressesResponseBody body;

    private AssignPrivateIpAddressesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AssignPrivateIpAddressesResponse create() {
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
    public AssignPrivateIpAddressesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AssignPrivateIpAddressesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AssignPrivateIpAddressesResponseBody body);

        @Override
        AssignPrivateIpAddressesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AssignPrivateIpAddressesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AssignPrivateIpAddressesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AssignPrivateIpAddressesResponse response) {
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
        public Builder body(AssignPrivateIpAddressesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AssignPrivateIpAddressesResponse build() {
            return new AssignPrivateIpAddressesResponse(this);
        } 

    } 

}
