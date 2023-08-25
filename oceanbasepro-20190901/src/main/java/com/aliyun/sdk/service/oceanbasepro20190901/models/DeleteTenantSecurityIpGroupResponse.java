// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTenantSecurityIpGroupResponse} extends {@link TeaModel}
 *
 * <p>DeleteTenantSecurityIpGroupResponse</p>
 */
public class DeleteTenantSecurityIpGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteTenantSecurityIpGroupResponseBody body;

    private DeleteTenantSecurityIpGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteTenantSecurityIpGroupResponse create() {
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
    public DeleteTenantSecurityIpGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteTenantSecurityIpGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteTenantSecurityIpGroupResponseBody body);

        @Override
        DeleteTenantSecurityIpGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteTenantSecurityIpGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteTenantSecurityIpGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteTenantSecurityIpGroupResponse response) {
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
        public Builder body(DeleteTenantSecurityIpGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteTenantSecurityIpGroupResponse build() {
            return new DeleteTenantSecurityIpGroupResponse(this);
        } 

    } 

}
