// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachSecurityGroupToVpcEndpointResponse} extends {@link TeaModel}
 *
 * <p>AttachSecurityGroupToVpcEndpointResponse</p>
 */
public class AttachSecurityGroupToVpcEndpointResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachSecurityGroupToVpcEndpointResponseBody body;

    private AttachSecurityGroupToVpcEndpointResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AttachSecurityGroupToVpcEndpointResponse create() {
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
    public AttachSecurityGroupToVpcEndpointResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachSecurityGroupToVpcEndpointResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AttachSecurityGroupToVpcEndpointResponseBody body);

        @Override
        AttachSecurityGroupToVpcEndpointResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachSecurityGroupToVpcEndpointResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AttachSecurityGroupToVpcEndpointResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachSecurityGroupToVpcEndpointResponse response) {
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
        public Builder body(AttachSecurityGroupToVpcEndpointResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachSecurityGroupToVpcEndpointResponse build() {
            return new AttachSecurityGroupToVpcEndpointResponse(this);
        } 

    } 

}
