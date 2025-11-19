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
 * {@link ModelService} extends {@link TeaModel}
 *
 * <p>ModelService</p>
 */
public class ModelService extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("credentialName")
    private String credentialName;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("lastUpdatedAt")
    private String lastUpdatedAt;

    @com.aliyun.core.annotation.NameInMap("modeServiceId")
    private String modeServiceId;

    @com.aliyun.core.annotation.NameInMap("modelInfoConfigs")
    private java.util.List<ModelInfoConfig> modelInfoConfigs;

    @com.aliyun.core.annotation.NameInMap("modelServiceName")
    private String modelServiceName;

    @com.aliyun.core.annotation.NameInMap("modelType")
    private String modelType;

    @com.aliyun.core.annotation.NameInMap("networkConfiguration")
    private NetworkConfiguration networkConfiguration;

    @com.aliyun.core.annotation.NameInMap("provider")
    private String provider;

    @com.aliyun.core.annotation.NameInMap("providerSettings")
    private ProviderSettings providerSettings;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("statusReason")
    private String statusReason;

    private ModelService(Builder builder) {
        this.createdAt = builder.createdAt;
        this.credentialName = builder.credentialName;
        this.description = builder.description;
        this.lastUpdatedAt = builder.lastUpdatedAt;
        this.modeServiceId = builder.modeServiceId;
        this.modelInfoConfigs = builder.modelInfoConfigs;
        this.modelServiceName = builder.modelServiceName;
        this.modelType = builder.modelType;
        this.networkConfiguration = builder.networkConfiguration;
        this.provider = builder.provider;
        this.providerSettings = builder.providerSettings;
        this.status = builder.status;
        this.statusReason = builder.statusReason;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelService create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return lastUpdatedAt
     */
    public String getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * @return modeServiceId
     */
    public String getModeServiceId() {
        return this.modeServiceId;
    }

    /**
     * @return modelInfoConfigs
     */
    public java.util.List<ModelInfoConfig> getModelInfoConfigs() {
        return this.modelInfoConfigs;
    }

    /**
     * @return modelServiceName
     */
    public String getModelServiceName() {
        return this.modelServiceName;
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
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * @return providerSettings
     */
    public ProviderSettings getProviderSettings() {
        return this.providerSettings;
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
        private String createdAt; 
        private String credentialName; 
        private String description; 
        private String lastUpdatedAt; 
        private String modeServiceId; 
        private java.util.List<ModelInfoConfig> modelInfoConfigs; 
        private String modelServiceName; 
        private String modelType; 
        private NetworkConfiguration networkConfiguration; 
        private String provider; 
        private ProviderSettings providerSettings; 
        private String status; 
        private String statusReason; 

        private Builder() {
        } 

        private Builder(ModelService model) {
            this.createdAt = model.createdAt;
            this.credentialName = model.credentialName;
            this.description = model.description;
            this.lastUpdatedAt = model.lastUpdatedAt;
            this.modeServiceId = model.modeServiceId;
            this.modelInfoConfigs = model.modelInfoConfigs;
            this.modelServiceName = model.modelServiceName;
            this.modelType = model.modelType;
            this.networkConfiguration = model.networkConfiguration;
            this.provider = model.provider;
            this.providerSettings = model.providerSettings;
            this.status = model.status;
            this.statusReason = model.statusReason;
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
         * lastUpdatedAt.
         */
        public Builder lastUpdatedAt(String lastUpdatedAt) {
            this.lastUpdatedAt = lastUpdatedAt;
            return this;
        }

        /**
         * modeServiceId.
         */
        public Builder modeServiceId(String modeServiceId) {
            this.modeServiceId = modeServiceId;
            return this;
        }

        /**
         * modelInfoConfigs.
         */
        public Builder modelInfoConfigs(java.util.List<ModelInfoConfig> modelInfoConfigs) {
            this.modelInfoConfigs = modelInfoConfigs;
            return this;
        }

        /**
         * modelServiceName.
         */
        public Builder modelServiceName(String modelServiceName) {
            this.modelServiceName = modelServiceName;
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
         * provider.
         */
        public Builder provider(String provider) {
            this.provider = provider;
            return this;
        }

        /**
         * providerSettings.
         */
        public Builder providerSettings(ProviderSettings providerSettings) {
            this.providerSettings = providerSettings;
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

        public ModelService build() {
            return new ModelService(this);
        } 

    } 

}
