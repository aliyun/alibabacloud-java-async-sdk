// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CredentialConfiguration} extends {@link TeaModel}
 *
 * <p>CredentialConfiguration</p>
 */
public class CredentialConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("credentialName")
    private String credentialName;

    private CredentialConfiguration(Builder builder) {
        this.credentialName = builder.credentialName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CredentialConfiguration create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return credentialName
     */
    public String getCredentialName() {
        return this.credentialName;
    }

    public static final class Builder {
        private String credentialName; 

        private Builder() {
        } 

        private Builder(CredentialConfiguration model) {
            this.credentialName = model.credentialName;
        } 

        /**
         * <p>凭证的唯一标识符</p>
         */
        public Builder credentialName(String credentialName) {
            this.credentialName = credentialName;
            return this;
        }

        public CredentialConfiguration build() {
            return new CredentialConfiguration(this);
        } 

    } 

}
