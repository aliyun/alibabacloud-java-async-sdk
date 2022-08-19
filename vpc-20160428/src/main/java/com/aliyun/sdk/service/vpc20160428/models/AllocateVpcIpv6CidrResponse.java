// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocateVpcIpv6CidrResponse} extends {@link TeaModel}
 *
 * <p>AllocateVpcIpv6CidrResponse</p>
 */
public class AllocateVpcIpv6CidrResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AllocateVpcIpv6CidrResponseBody body;

    private AllocateVpcIpv6CidrResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AllocateVpcIpv6CidrResponse create() {
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
    public AllocateVpcIpv6CidrResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AllocateVpcIpv6CidrResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AllocateVpcIpv6CidrResponseBody body);

        @Override
        AllocateVpcIpv6CidrResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AllocateVpcIpv6CidrResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AllocateVpcIpv6CidrResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AllocateVpcIpv6CidrResponse response) {
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
        public Builder body(AllocateVpcIpv6CidrResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AllocateVpcIpv6CidrResponse build() {
            return new AllocateVpcIpv6CidrResponse(this);
        } 

    } 

}
