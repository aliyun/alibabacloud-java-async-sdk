// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBackupPolicyMachineResponse} extends {@link TeaModel}
 *
 * <p>DeleteBackupPolicyMachineResponse</p>
 */
public class DeleteBackupPolicyMachineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteBackupPolicyMachineResponseBody body;

    private DeleteBackupPolicyMachineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteBackupPolicyMachineResponse create() {
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
    public DeleteBackupPolicyMachineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteBackupPolicyMachineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteBackupPolicyMachineResponseBody body);

        @Override
        DeleteBackupPolicyMachineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteBackupPolicyMachineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteBackupPolicyMachineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteBackupPolicyMachineResponse response) {
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
        public Builder body(DeleteBackupPolicyMachineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteBackupPolicyMachineResponse build() {
            return new DeleteBackupPolicyMachineResponse(this);
        } 

    } 

}
