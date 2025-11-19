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
 * {@link UpdateModelProxyInput} extends {@link TeaModel}
 *
 * <p>UpdateModelProxyInput</p>
 */
public class UpdateModelProxyInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("armsConfiguration")
    private ArmsConfiguration armsConfiguration;

    @com.aliyun.core.annotation.NameInMap("credentialName")
    private String credentialName;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("logConfiguration")
    private LogConfiguration logConfiguration;

    @com.aliyun.core.annotation.NameInMap("networkConfiguration")
    private NetworkConfiguration networkConfiguration;

    @com.aliyun.core.annotation.NameInMap("proxyConfig")
    private ProxyConfig proxyConfig;

    private UpdateModelProxyInput(Builder builder) {
        this.armsConfiguration = builder.armsConfiguration;
        this.credentialName = builder.credentialName;
        this.description = builder.description;
        this.logConfiguration = builder.logConfiguration;
        this.networkConfiguration = builder.networkConfiguration;
        this.proxyConfig = builder.proxyConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateModelProxyInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return armsConfiguration
     */
    public ArmsConfiguration getArmsConfiguration() {
        return this.armsConfiguration;
    }

    /**
     * @return credentialName
     */
    public String getCredentialName() {
        return this.credentialName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return logConfiguration
     */
    public LogConfiguration getLogConfiguration() {
        return this.logConfiguration;
    }

    /**
     * @return networkConfiguration
     */
    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * @return proxyConfig
     */
    public ProxyConfig getProxyConfig() {
        return this.proxyConfig;
    }

    public static final class Builder {
        private ArmsConfiguration armsConfiguration; 
        private String credentialName; 
        private String description; 
        private LogConfiguration logConfiguration; 
        private NetworkConfiguration networkConfiguration; 
        private ProxyConfig proxyConfig; 

        private Builder() {
        } 

        private Builder(UpdateModelProxyInput model) {
            this.armsConfiguration = model.armsConfiguration;
            this.credentialName = model.credentialName;
            this.description = model.description;
            this.logConfiguration = model.logConfiguration;
            this.networkConfiguration = model.networkConfiguration;
            this.proxyConfig = model.proxyConfig;
        } 

        /**
         * armsConfiguration.
         */
        public Builder armsConfiguration(ArmsConfiguration armsConfiguration) {
            this.armsConfiguration = armsConfiguration;
            return this;
        }

        /**
         * credentialName.
         */
        public Builder credentialName(String credentialName) {
            this.credentialName = credentialName;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * logConfiguration.
         */
        public Builder logConfiguration(LogConfiguration logConfiguration) {
            this.logConfiguration = logConfiguration;
            return this;
        }

        /**
         * networkConfiguration.
         */
        public Builder networkConfiguration(NetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }

        /**
         * proxyConfig.
         */
        public Builder proxyConfig(ProxyConfig proxyConfig) {
            this.proxyConfig = proxyConfig;
            return this;
        }

        public UpdateModelProxyInput build() {
            return new UpdateModelProxyInput(this);
        } 

    } 

}
