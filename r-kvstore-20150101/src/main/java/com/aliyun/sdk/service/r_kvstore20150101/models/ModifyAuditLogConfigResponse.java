// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAuditLogConfigResponse} extends {@link TeaModel}
 *
 * <p>ModifyAuditLogConfigResponse</p>
 */
public class ModifyAuditLogConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyAuditLogConfigResponseBody body;

    private ModifyAuditLogConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyAuditLogConfigResponse create() {
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
    public ModifyAuditLogConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyAuditLogConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyAuditLogConfigResponseBody body);

        @Override
        ModifyAuditLogConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyAuditLogConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyAuditLogConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyAuditLogConfigResponse response) {
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
        public Builder body(ModifyAuditLogConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyAuditLogConfigResponse build() {
            return new ModifyAuditLogConfigResponse(this);
        } 

    } 

}
