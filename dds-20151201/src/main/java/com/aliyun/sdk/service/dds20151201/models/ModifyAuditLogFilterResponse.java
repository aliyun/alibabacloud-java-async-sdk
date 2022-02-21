// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAuditLogFilterResponse} extends {@link TeaModel}
 *
 * <p>ModifyAuditLogFilterResponse</p>
 */
public class ModifyAuditLogFilterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyAuditLogFilterResponseBody body;

    private ModifyAuditLogFilterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyAuditLogFilterResponse create() {
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
    public ModifyAuditLogFilterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyAuditLogFilterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyAuditLogFilterResponseBody body);

        @Override
        ModifyAuditLogFilterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyAuditLogFilterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyAuditLogFilterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyAuditLogFilterResponse response) {
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
        public Builder body(ModifyAuditLogFilterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyAuditLogFilterResponse build() {
            return new ModifyAuditLogFilterResponse(this);
        } 

    } 

}
