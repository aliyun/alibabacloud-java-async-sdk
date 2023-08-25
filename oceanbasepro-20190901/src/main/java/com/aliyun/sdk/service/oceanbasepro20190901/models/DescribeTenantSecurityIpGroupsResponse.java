// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTenantSecurityIpGroupsResponse} extends {@link TeaModel}
 *
 * <p>DescribeTenantSecurityIpGroupsResponse</p>
 */
public class DescribeTenantSecurityIpGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTenantSecurityIpGroupsResponseBody body;

    private DescribeTenantSecurityIpGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTenantSecurityIpGroupsResponse create() {
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
    public DescribeTenantSecurityIpGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTenantSecurityIpGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTenantSecurityIpGroupsResponseBody body);

        @Override
        DescribeTenantSecurityIpGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTenantSecurityIpGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTenantSecurityIpGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTenantSecurityIpGroupsResponse response) {
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
        public Builder body(DescribeTenantSecurityIpGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTenantSecurityIpGroupsResponse build() {
            return new DescribeTenantSecurityIpGroupsResponse(this);
        } 

    } 

}
