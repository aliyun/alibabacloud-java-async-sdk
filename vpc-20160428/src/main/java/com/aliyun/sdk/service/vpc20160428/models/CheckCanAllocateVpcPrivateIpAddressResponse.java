// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckCanAllocateVpcPrivateIpAddressResponse} extends {@link TeaModel}
 *
 * <p>CheckCanAllocateVpcPrivateIpAddressResponse</p>
 */
public class CheckCanAllocateVpcPrivateIpAddressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckCanAllocateVpcPrivateIpAddressResponseBody body;

    private CheckCanAllocateVpcPrivateIpAddressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckCanAllocateVpcPrivateIpAddressResponse create() {
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
    public CheckCanAllocateVpcPrivateIpAddressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckCanAllocateVpcPrivateIpAddressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckCanAllocateVpcPrivateIpAddressResponseBody body);

        @Override
        CheckCanAllocateVpcPrivateIpAddressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckCanAllocateVpcPrivateIpAddressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckCanAllocateVpcPrivateIpAddressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckCanAllocateVpcPrivateIpAddressResponse response) {
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
        public Builder body(CheckCanAllocateVpcPrivateIpAddressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckCanAllocateVpcPrivateIpAddressResponse build() {
            return new CheckCanAllocateVpcPrivateIpAddressResponse(this);
        } 

    } 

}
