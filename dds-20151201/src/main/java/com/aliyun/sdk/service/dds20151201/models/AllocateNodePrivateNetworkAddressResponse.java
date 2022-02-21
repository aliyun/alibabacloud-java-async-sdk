// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocateNodePrivateNetworkAddressResponse} extends {@link TeaModel}
 *
 * <p>AllocateNodePrivateNetworkAddressResponse</p>
 */
public class AllocateNodePrivateNetworkAddressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AllocateNodePrivateNetworkAddressResponseBody body;

    private AllocateNodePrivateNetworkAddressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AllocateNodePrivateNetworkAddressResponse create() {
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
    public AllocateNodePrivateNetworkAddressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AllocateNodePrivateNetworkAddressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AllocateNodePrivateNetworkAddressResponseBody body);

        @Override
        AllocateNodePrivateNetworkAddressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AllocateNodePrivateNetworkAddressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AllocateNodePrivateNetworkAddressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AllocateNodePrivateNetworkAddressResponse response) {
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
        public Builder body(AllocateNodePrivateNetworkAddressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AllocateNodePrivateNetworkAddressResponse build() {
            return new AllocateNodePrivateNetworkAddressResponse(this);
        } 

    } 

}
