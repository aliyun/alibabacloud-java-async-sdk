// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocatePublicIpAddressResponse} extends {@link TeaModel}
 *
 * <p>AllocatePublicIpAddressResponse</p>
 */
public class AllocatePublicIpAddressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AllocatePublicIpAddressResponseBody body;

    private AllocatePublicIpAddressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AllocatePublicIpAddressResponse create() {
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
    public AllocatePublicIpAddressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AllocatePublicIpAddressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AllocatePublicIpAddressResponseBody body);

        @Override
        AllocatePublicIpAddressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AllocatePublicIpAddressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AllocatePublicIpAddressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AllocatePublicIpAddressResponse response) {
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
        public Builder body(AllocatePublicIpAddressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AllocatePublicIpAddressResponse build() {
            return new AllocatePublicIpAddressResponse(this);
        } 

    } 

}
