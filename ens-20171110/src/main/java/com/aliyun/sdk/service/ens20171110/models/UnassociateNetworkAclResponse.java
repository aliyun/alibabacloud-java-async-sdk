// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnassociateNetworkAclResponse} extends {@link TeaModel}
 *
 * <p>UnassociateNetworkAclResponse</p>
 */
public class UnassociateNetworkAclResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnassociateNetworkAclResponseBody body;

    private UnassociateNetworkAclResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnassociateNetworkAclResponse create() {
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
    public UnassociateNetworkAclResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnassociateNetworkAclResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnassociateNetworkAclResponseBody body);

        @Override
        UnassociateNetworkAclResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnassociateNetworkAclResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnassociateNetworkAclResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnassociateNetworkAclResponse response) {
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
        public Builder body(UnassociateNetworkAclResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnassociateNetworkAclResponse build() {
            return new UnassociateNetworkAclResponse(this);
        } 

    } 

}
