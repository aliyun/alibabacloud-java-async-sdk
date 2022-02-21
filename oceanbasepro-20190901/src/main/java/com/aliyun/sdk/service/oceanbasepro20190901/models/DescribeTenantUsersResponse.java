// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTenantUsersResponse} extends {@link TeaModel}
 *
 * <p>DescribeTenantUsersResponse</p>
 */
public class DescribeTenantUsersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTenantUsersResponseBody body;

    private DescribeTenantUsersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTenantUsersResponse create() {
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
    public DescribeTenantUsersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTenantUsersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTenantUsersResponseBody body);

        @Override
        DescribeTenantUsersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTenantUsersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTenantUsersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTenantUsersResponse response) {
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
        public Builder body(DescribeTenantUsersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTenantUsersResponse build() {
            return new DescribeTenantUsersResponse(this);
        } 

    } 

}
