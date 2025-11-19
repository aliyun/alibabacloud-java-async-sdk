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
 * {@link CreateModelProxyInput} extends {@link TeaModel}
 *
 * <p>CreateModelProxyInput</p>
 */
public class CreateModelProxyInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("armsConfiguration")
    private ArmsConfiguration armsConfiguration;

    @com.aliyun.core.annotation.NameInMap("cpu")
    @com.aliyun.core.annotation.Validation(required = true)
    private Float cpu;

    @com.aliyun.core.annotation.NameInMap("credentialName")
    private String credentialName;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("litellmVersion")
    private String litellmVersion;

    @com.aliyun.core.annotation.NameInMap("logConfiguration")
    private LogConfiguration logConfiguration;

    @com.aliyun.core.annotation.NameInMap("memory")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer memory;

    @com.aliyun.core.annotation.NameInMap("modelProxyName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelProxyName;

    @com.aliyun.core.annotation.NameInMap("modelType")
    private String modelType;

    @com.aliyun.core.annotation.NameInMap("networkConfiguration")
    private NetworkConfiguration networkConfiguration;

    @com.aliyun.core.annotation.NameInMap("proxyConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private ProxyConfig proxyConfig;

    @com.aliyun.core.annotation.NameInMap("proxyMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String proxyMode;

    @com.aliyun.core.annotation.NameInMap("serviceRegionId")
    private String serviceRegionId;

    private CreateModelProxyInput(Builder builder) {
        this.armsConfiguration = builder.armsConfiguration;
        this.cpu = builder.cpu;
        this.credentialName = builder.credentialName;
        this.description = builder.description;
        this.litellmVersion = builder.litellmVersion;
        this.logConfiguration = builder.logConfiguration;
        this.memory = builder.memory;
        this.modelProxyName = builder.modelProxyName;
        this.modelType = builder.modelType;
        this.networkConfiguration = builder.networkConfiguration;
        this.proxyConfig = builder.proxyConfig;
        this.proxyMode = builder.proxyMode;
        this.serviceRegionId = builder.serviceRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModelProxyInput create() {
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
     * @return cpu
     */
    public Float getCpu() {
        return this.cpu;
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
     * @return litellmVersion
     */
    public String getLitellmVersion() {
        return this.litellmVersion;
    }

    /**
     * @return logConfiguration
     */
    public LogConfiguration getLogConfiguration() {
        return this.logConfiguration;
    }

    /**
     * @return memory
     */
    public Integer getMemory() {
        return this.memory;
    }

    /**
     * @return modelProxyName
     */
    public String getModelProxyName() {
        return this.modelProxyName;
    }

    /**
     * @return modelType
     */
    public String getModelType() {
        return this.modelType;
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

    /**
     * @return proxyMode
     */
    public String getProxyMode() {
        return this.proxyMode;
    }

    /**
     * @return serviceRegionId
     */
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

    public static final class Builder {
        private ArmsConfiguration armsConfiguration; 
        private Float cpu; 
        private String credentialName; 
        private String description; 
        private String litellmVersion; 
        private LogConfiguration logConfiguration; 
        private Integer memory; 
        private String modelProxyName; 
        private String modelType; 
        private NetworkConfiguration networkConfiguration; 
        private ProxyConfig proxyConfig; 
        private String proxyMode; 
        private String serviceRegionId; 

        private Builder() {
        } 

        private Builder(CreateModelProxyInput model) {
            this.armsConfiguration = model.armsConfiguration;
            this.cpu = model.cpu;
            this.credentialName = model.credentialName;
            this.description = model.description;
            this.litellmVersion = model.litellmVersion;
            this.logConfiguration = model.logConfiguration;
            this.memory = model.memory;
            this.modelProxyName = model.modelProxyName;
            this.modelType = model.modelType;
            this.networkConfiguration = model.networkConfiguration;
            this.proxyConfig = model.proxyConfig;
            this.proxyMode = model.proxyMode;
            this.serviceRegionId = model.serviceRegionId;
        } 

        /**
         * armsConfiguration.
         */
        public Builder armsConfiguration(ArmsConfiguration armsConfiguration) {
            this.armsConfiguration = armsConfiguration;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder cpu(Float cpu) {
            this.cpu = cpu;
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
         * litellmVersion.
         */
        public Builder litellmVersion(String litellmVersion) {
            this.litellmVersion = litellmVersion;
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
         * <p>This parameter is required.</p>
         */
        public Builder memory(Integer memory) {
            this.memory = memory;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder modelProxyName(String modelProxyName) {
            this.modelProxyName = modelProxyName;
            return this;
        }

        /**
         * modelType.
         */
        public Builder modelType(String modelType) {
            this.modelType = modelType;
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
         * <p>This parameter is required.</p>
         */
        public Builder proxyConfig(ProxyConfig proxyConfig) {
            this.proxyConfig = proxyConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder proxyMode(String proxyMode) {
            this.proxyMode = proxyMode;
            return this;
        }

        /**
         * serviceRegionId.
         */
        public Builder serviceRegionId(String serviceRegionId) {
            this.serviceRegionId = serviceRegionId;
            return this;
        }

        public CreateModelProxyInput build() {
            return new CreateModelProxyInput(this);
        } 

    } 

}
