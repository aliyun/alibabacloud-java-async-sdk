// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.sdk.gateway.eiam.dev.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * 
 * {@link CreateUserExclusiveCredentialResponseBody} extends {@link TeaModel}
 *
 * <p>CreateUserExclusiveCredentialResponseBody</p>
 */
public class CreateUserExclusiveCredentialResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("credentialCiphertext")
    private String credentialCiphertext;

    @com.aliyun.core.annotation.NameInMap("credentialId")
    private String credentialId;

    @com.aliyun.core.annotation.NameInMap("credentialIdentifier")
    private String credentialIdentifier;

    private CreateUserExclusiveCredentialResponseBody(Builder builder) {
        this.credentialCiphertext = builder.credentialCiphertext;
        this.credentialId = builder.credentialId;
        this.credentialIdentifier = builder.credentialIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserExclusiveCredentialResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return credentialCiphertext
     */
    public String getCredentialCiphertext() {
        return this.credentialCiphertext;
    }

    /**
     * @return credentialId
     */
    public String getCredentialId() {
        return this.credentialId;
    }

    /**
     * @return credentialIdentifier
     */
    public String getCredentialIdentifier() {
        return this.credentialIdentifier;
    }

    public static final class Builder {
        private String credentialCiphertext; 
        private String credentialId; 
        private String credentialIdentifier; 

        private Builder() {
        } 

        private Builder(CreateUserExclusiveCredentialResponseBody model) {
            this.credentialCiphertext = model.credentialCiphertext;
            this.credentialId = model.credentialId;
            this.credentialIdentifier = model.credentialIdentifier;
        } 

        /**
         * credentialCiphertext.
         */
        public Builder credentialCiphertext(String credentialCiphertext) {
            this.credentialCiphertext = credentialCiphertext;
            return this;
        }

        /**
         * credentialId.
         */
        public Builder credentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }

        /**
         * <p>凭据标识。</p>
         * 
         * <strong>example:</strong>
         * <p>credential_identifier_test</p>
         */
        public Builder credentialIdentifier(String credentialIdentifier) {
            this.credentialIdentifier = credentialIdentifier;
            return this;
        }

        public CreateUserExclusiveCredentialResponseBody build() {
            return new CreateUserExclusiveCredentialResponseBody(this);
        } 

    } 

}
