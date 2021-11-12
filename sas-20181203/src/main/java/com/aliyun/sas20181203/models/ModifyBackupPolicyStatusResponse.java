// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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


    private ModifyBackupPolicyStatusResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBackupPolicyStatusResponse create() {
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
    public ModifyBackupPolicyStatusResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private ModifyBackupPolicyStatusResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBackupPolicyStatusResponse response) {
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
        public Builder body(ModifyBackupPolicyStatusResponseBody body) {
            this.body = body;
            return this;
        }

        public ModifyBackupPolicyStatusResponse build() {
            return new ModifyBackupPolicyStatusResponse(this);
        } 

    } 

}
