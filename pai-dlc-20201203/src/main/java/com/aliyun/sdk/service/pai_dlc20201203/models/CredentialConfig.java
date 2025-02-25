// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link CredentialConfig} extends {@link TeaModel}
 *
 * <p>CredentialConfig</p>
 */
public class CredentialConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AliyunEnvRoleKey")
    private String aliyunEnvRoleKey;

    @com.aliyun.core.annotation.NameInMap("CredentialConfigItems")
    private java.util.List<CredentialConfigItem> credentialConfigItems;

    @com.aliyun.core.annotation.NameInMap("EnableCredentialInject")
    private Boolean enableCredentialInject;

    private CredentialConfig(Builder builder) {
        this.aliyunEnvRoleKey = builder.aliyunEnvRoleKey;
        this.credentialConfigItems = builder.credentialConfigItems;
        this.enableCredentialInject = builder.enableCredentialInject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CredentialConfig create() {
        return builder().build();
    }

    /**
     * @return aliyunEnvRoleKey
     */
    public String getAliyunEnvRoleKey() {
        return this.aliyunEnvRoleKey;
    }

    /**
     * @return credentialConfigItems
     */
    public java.util.List<CredentialConfigItem> getCredentialConfigItems() {
        return this.credentialConfigItems;
    }

    /**
     * @return enableCredentialInject
     */
    public Boolean getEnableCredentialInject() {
        return this.enableCredentialInject;
    }

    public static final class Builder {
        private String aliyunEnvRoleKey; 
        private java.util.List<CredentialConfigItem> credentialConfigItems; 
        private Boolean enableCredentialInject; 

        /**
         * AliyunEnvRoleKey.
         */
        public Builder aliyunEnvRoleKey(String aliyunEnvRoleKey) {
            this.aliyunEnvRoleKey = aliyunEnvRoleKey;
            return this;
        }

        /**
         * CredentialConfigItems.
         */
        public Builder credentialConfigItems(java.util.List<CredentialConfigItem> credentialConfigItems) {
            this.credentialConfigItems = credentialConfigItems;
            return this;
        }

        /**
         * EnableCredentialInject.
         */
        public Builder enableCredentialInject(Boolean enableCredentialInject) {
            this.enableCredentialInject = enableCredentialInject;
            return this;
        }

        public CredentialConfig build() {
            return new CredentialConfig(this);
        } 

    } 

}
