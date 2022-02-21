// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTenantUserRolesResponse} extends {@link TeaModel}
 *
 * <p>DescribeTenantUserRolesResponse</p>
 */
public class DescribeTenantUserRolesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTenantUserRolesResponseBody body;

    private DescribeTenantUserRolesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTenantUserRolesResponse create() {
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
    public DescribeTenantUserRolesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTenantUserRolesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTenantUserRolesResponseBody body);

        @Override
        DescribeTenantUserRolesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTenantUserRolesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTenantUserRolesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTenantUserRolesResponse response) {
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
        public Builder body(DescribeTenantUserRolesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTenantUserRolesResponse build() {
            return new DescribeTenantUserRolesResponse(this);
        } 

    } 

}
