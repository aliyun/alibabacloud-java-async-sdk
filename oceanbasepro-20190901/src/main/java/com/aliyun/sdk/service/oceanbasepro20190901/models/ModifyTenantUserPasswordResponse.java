// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTenantUserPasswordResponse} extends {@link TeaModel}
 *
 * <p>ModifyTenantUserPasswordResponse</p>
 */
public class ModifyTenantUserPasswordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyTenantUserPasswordResponseBody body;

    private ModifyTenantUserPasswordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyTenantUserPasswordResponse create() {
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
    public ModifyTenantUserPasswordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyTenantUserPasswordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyTenantUserPasswordResponseBody body);

        @Override
        ModifyTenantUserPasswordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyTenantUserPasswordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyTenantUserPasswordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyTenantUserPasswordResponse response) {
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
        public Builder body(ModifyTenantUserPasswordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyTenantUserPasswordResponse build() {
            return new ModifyTenantUserPasswordResponse(this);
        } 

    } 

}
