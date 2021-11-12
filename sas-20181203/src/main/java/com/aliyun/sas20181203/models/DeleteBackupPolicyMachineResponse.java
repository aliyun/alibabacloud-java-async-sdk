// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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


    private DeleteBackupPolicyMachineResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBackupPolicyMachineResponse create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private DeleteBackupPolicyMachineResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBackupPolicyMachineResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * <p>headers.</p>
         */
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * <p>body.</p>
         */
        public Builder body(DeleteBackupPolicyMachineResponseBody body) {
            this.body = body;
            return this;
        }

        public DeleteBackupPolicyMachineResponse build() {
            return new DeleteBackupPolicyMachineResponse(this);
        } 

    } 

}
