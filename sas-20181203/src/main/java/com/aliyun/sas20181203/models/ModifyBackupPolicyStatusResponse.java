// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBackupPolicyStatusResponse} extends {@link TeaModel}
 *
 * <p>ModifyBackupPolicyStatusResponse</p>
 */
public class ModifyBackupPolicyStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyBackupPolicyStatusResponseBody body;

    private ModifyBackupPolicyStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyBackupPolicyStatusResponse create() {
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
    public ModifyBackupPolicyStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyBackupPolicyStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyBackupPolicyStatusResponseBody body);

        @Override
        ModifyBackupPolicyStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyBackupPolicyStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyBackupPolicyStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyBackupPolicyStatusResponse response) {
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
        public Builder body(ModifyBackupPolicyStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyBackupPolicyStatusResponse build() {
            return new ModifyBackupPolicyStatusResponse(this);
        } 

    } 

}
