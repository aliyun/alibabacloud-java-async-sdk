// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTenantUserResponse} extends {@link TeaModel}
 *
 * <p>CreateTenantUserResponse</p>
 */
public class CreateTenantUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateTenantUserResponseBody body;

    private CreateTenantUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateTenantUserResponse create() {
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
    public CreateTenantUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTenantUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateTenantUserResponseBody body);

        @Override
        CreateTenantUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTenantUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateTenantUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTenantUserResponse response) {
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
        public Builder body(CreateTenantUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTenantUserResponse build() {
            return new CreateTenantUserResponse(this);
        } 

    } 

}
