// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyGlobalSecurityIPGroupNameResponse} extends {@link TeaModel}
 *
 * <p>ModifyGlobalSecurityIPGroupNameResponse</p>
 */
public class ModifyGlobalSecurityIPGroupNameResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyGlobalSecurityIPGroupNameResponseBody body;

    private ModifyGlobalSecurityIPGroupNameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyGlobalSecurityIPGroupNameResponse create() {
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
    public ModifyGlobalSecurityIPGroupNameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyGlobalSecurityIPGroupNameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyGlobalSecurityIPGroupNameResponseBody body);

        @Override
        ModifyGlobalSecurityIPGroupNameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyGlobalSecurityIPGroupNameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyGlobalSecurityIPGroupNameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyGlobalSecurityIPGroupNameResponse response) {
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
        public Builder body(ModifyGlobalSecurityIPGroupNameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyGlobalSecurityIPGroupNameResponse build() {
            return new ModifyGlobalSecurityIPGroupNameResponse(this);
        } 

    } 

}
