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
 * {@link ModelProxy} extends {@link TeaModel}
 *
 * <p>ModelProxy</p>
 */
public class ModelProxy extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cpu")
    private Float cpu;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("credentialName")
    private String credentialName;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("endpoint")
    private String endpoint;

    @com.aliyun.core.annotation.NameInMap("functionName")
    private String functionName;

    @com.aliyun.core.annotation.NameInMap("lastUpdatedAt")
    private String lastUpdatedAt;

    @com.aliyun.core.annotation.NameInMap("litellmVersion")
    private String litellmVersion;

    @com.aliyun.core.annotation.NameInMap("logConfiguration")
    private LogConfiguration logConfiguration;

    @com.aliyun.core.annotation.NameInMap("memory")
    private Integer memory;

    @com.aliyun.core.annotation.NameInMap("modelProxyId")
    private String modelProxyId;

    @com.aliyun.core.annotation.NameInMap("modelProxyName")
    private String modelProxyName;

    @com.aliyun.core.annotation.NameInMap("modelType")
    private String modelType;

    @com.aliyun.core.annotation.NameInMap("networkConfiguration")
    private NetworkConfiguration networkConfiguration;

    @com.aliyun.core.annotation.NameInMap("proxyConfig")
    private ProxyConfig proxyConfig;

    @com.aliyun.core.annotation.NameInMap("proxyMode")
    private String proxyMode;

    @com.aliyun.core.annotation.NameInMap("serviceRegionId")
    private String serviceRegionId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("statusReason")
    private String statusReason;

    private ModelProxy(Builder builder) {
        this.cpu = builder.cpu;
        this.createdAt = builder.createdAt;
        this.credentialName = builder.credentialName;
        this.description = builder.description;
        this.endpoint = builder.endpoint;
        this.functionName = builder.functionName;
        this.lastUpdatedAt = builder.lastUpdatedAt;
        this.litellmVersion = builder.litellmVersion;
        this.logConfiguration = builder.logConfiguration;
        this.memory = builder.memory;
        this.modelProxyId = builder.modelProxyId;
        this.modelProxyName = builder.modelProxyName;
        this.modelType = builder.modelType;
        this.networkConfiguration = builder.networkConfiguration;
        this.proxyConfig = builder.proxyConfig;
        this.proxyMode = builder.proxyMode;
        this.serviceRegionId = builder.serviceRegionId;
        this.status = builder.status;
        this.statusReason = builder.statusReason;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelProxy create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cpu
     */
    public Float getCpu() {
        return this.cpu;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
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
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return lastUpdatedAt
     */
    public String getLastUpdatedAt() {
        return this.lastUpdatedAt;
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
     * @return modelProxyId
     */
    public String getModelProxyId() {
        return this.modelProxyId;
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return statusReason
     */
    public String getStatusReason() {
        return this.statusReason;
    }

    public static final class Builder {
        private Float cpu; 
        private String createdAt; 
        private String credentialName; 
        private String description; 
        private String endpoint; 
        private String functionName; 
        private String lastUpdatedAt; 
        private String litellmVersion; 
        private LogConfiguration logConfiguration; 
        private Integer memory; 
        private String modelProxyId; 
        private String modelProxyName; 
        private String modelType; 
        private NetworkConfiguration networkConfiguration; 
        private ProxyConfig proxyConfig; 
        private String proxyMode; 
        private String serviceRegionId; 
        private String status; 
        private String statusReason; 

        private Builder() {
        } 

        private Builder(ModelProxy model) {
            this.cpu = model.cpu;
            this.createdAt = model.createdAt;
            this.credentialName = model.credentialName;
            this.description = model.description;
            this.endpoint = model.endpoint;
            this.functionName = model.functionName;
            this.lastUpdatedAt = model.lastUpdatedAt;
            this.litellmVersion = model.litellmVersion;
            this.logConfiguration = model.logConfiguration;
            this.memory = model.memory;
            this.modelProxyId = model.modelProxyId;
            this.modelProxyName = model.modelProxyName;
            this.modelType = model.modelType;
            this.networkConfiguration = model.networkConfiguration;
            this.proxyConfig = model.proxyConfig;
            this.proxyMode = model.proxyMode;
            this.serviceRegionId = model.serviceRegionId;
            this.status = model.status;
            this.statusReason = model.statusReason;
        } 

        /**
         * cpu.
         */
        public Builder cpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * createdAt.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
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
         * endpoint.
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * functionName.
         */
        public Builder functionName(String functionName) {
            this.functionName = functionName;
            return this;
        }

        /**
         * lastUpdatedAt.
         */
        public Builder lastUpdatedAt(String lastUpdatedAt) {
            this.lastUpdatedAt = lastUpdatedAt;
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
         * memory.
         */
        public Builder memory(Integer memory) {
            this.memory = memory;
            return this;
        }

        /**
         * modelProxyId.
         */
        public Builder modelProxyId(String modelProxyId) {
            this.modelProxyId = modelProxyId;
            return this;
        }

        /**
         * modelProxyName.
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
         * proxyConfig.
         */
        public Builder proxyConfig(ProxyConfig proxyConfig) {
            this.proxyConfig = proxyConfig;
            return this;
        }

        /**
         * proxyMode.
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

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * statusReason.
         */
        public Builder statusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }

        public ModelProxy build() {
            return new ModelProxy(this);
        } 

    } 

}
