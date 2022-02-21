// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyUserEntitlementResponse} extends {@link TeaModel}
 *
 * <p>ModifyUserEntitlementResponse</p>
 */
public class ModifyUserEntitlementResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyUserEntitlementResponseBody body;

    private ModifyUserEntitlementResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyUserEntitlementResponse create() {
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
    public ModifyUserEntitlementResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyUserEntitlementResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyUserEntitlementResponseBody body);

        @Override
        ModifyUserEntitlementResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyUserEntitlementResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyUserEntitlementResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyUserEntitlementResponse response) {
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
        public Builder body(ModifyUserEntitlementResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyUserEntitlementResponse build() {
            return new ModifyUserEntitlementResponse(this);
        } 

    } 

}
