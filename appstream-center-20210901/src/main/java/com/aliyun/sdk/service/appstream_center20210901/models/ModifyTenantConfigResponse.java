// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTenantConfigResponse} extends {@link TeaModel}
 *
 * <p>ModifyTenantConfigResponse</p>
 */
public class ModifyTenantConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyTenantConfigResponseBody body;

    private ModifyTenantConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyTenantConfigResponse create() {
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
    public ModifyTenantConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyTenantConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyTenantConfigResponseBody body);

        @Override
        ModifyTenantConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyTenantConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyTenantConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyTenantConfigResponse response) {
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
        public Builder body(ModifyTenantConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyTenantConfigResponse build() {
            return new ModifyTenantConfigResponse(this);
        } 

    } 

}
