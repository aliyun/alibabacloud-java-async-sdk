// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyLogBackupPolicyResponse} extends {@link TeaModel}
 *
 * <p>ModifyLogBackupPolicyResponse</p>
 */
public class ModifyLogBackupPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyLogBackupPolicyResponseBody body;

    private ModifyLogBackupPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyLogBackupPolicyResponse create() {
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
    public ModifyLogBackupPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyLogBackupPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyLogBackupPolicyResponseBody body);

        @Override
        ModifyLogBackupPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyLogBackupPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyLogBackupPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyLogBackupPolicyResponse response) {
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
        public Builder body(ModifyLogBackupPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyLogBackupPolicyResponse build() {
            return new ModifyLogBackupPolicyResponse(this);
        } 

    } 

}
