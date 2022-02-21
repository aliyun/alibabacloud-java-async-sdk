// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTenantUserStatusResponse} extends {@link TeaModel}
 *
 * <p>ModifyTenantUserStatusResponse</p>
 */
public class ModifyTenantUserStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyTenantUserStatusResponseBody body;

    private ModifyTenantUserStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyTenantUserStatusResponse create() {
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
    public ModifyTenantUserStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyTenantUserStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyTenantUserStatusResponseBody body);

        @Override
        ModifyTenantUserStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyTenantUserStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyTenantUserStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyTenantUserStatusResponse response) {
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
        public Builder body(ModifyTenantUserStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyTenantUserStatusResponse build() {
            return new ModifyTenantUserStatusResponse(this);
        } 

    } 

}
