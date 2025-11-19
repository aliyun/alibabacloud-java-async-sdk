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
 * {@link CreateModelServiceInput} extends {@link TeaModel}
 *
 * <p>CreateModelServiceInput</p>
 */
public class CreateModelServiceInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("credentialName")
    private String credentialName;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("modelInfoConfigs")
    private java.util.List<ModelInfoConfig> modelInfoConfigs;

    @com.aliyun.core.annotation.NameInMap("modelServiceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelServiceName;

    @com.aliyun.core.annotation.NameInMap("modelType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelType;

    @com.aliyun.core.annotation.NameInMap("networkConfiguration")
    private NetworkConfiguration networkConfiguration;

    @com.aliyun.core.annotation.NameInMap("provider")
    @com.aliyun.core.annotation.Validation(required = true)
    private String provider;

    @com.aliyun.core.annotation.NameInMap("providerSettings")
    @com.aliyun.core.annotation.Validation(required = true)
    private ProviderSettings providerSettings;

    private CreateModelServiceInput(Builder builder) {
        this.credentialName = builder.credentialName;
        this.description = builder.description;
        this.modelInfoConfigs = builder.modelInfoConfigs;
        this.modelServiceName = builder.modelServiceName;
        this.modelType = builder.modelType;
        this.networkConfiguration = builder.networkConfiguration;
        this.provider = builder.provider;
        this.providerSettings = builder.providerSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModelServiceInput create() {
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

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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

    public static final class Builder {
        private String credentialName; 
        private String description; 
        private java.util.List<ModelInfoConfig> modelInfoConfigs; 
        private String modelServiceName; 
        private String modelType; 
        private NetworkConfiguration networkConfiguration; 
        private String provider; 
        private ProviderSettings providerSettings; 

        private Builder() {
        } 

        private Builder(CreateModelServiceInput model) {
            this.credentialName = model.credentialName;
            this.description = model.description;
            this.modelInfoConfigs = model.modelInfoConfigs;
            this.modelServiceName = model.modelServiceName;
            this.modelType = model.modelType;
            this.networkConfiguration = model.networkConfiguration;
            this.provider = model.provider;
            this.providerSettings = model.providerSettings;
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
         * modelInfoConfigs.
         */
        public Builder modelInfoConfigs(java.util.List<ModelInfoConfig> modelInfoConfigs) {
            this.modelInfoConfigs = modelInfoConfigs;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder modelServiceName(String modelServiceName) {
            this.modelServiceName = modelServiceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
        public Builder provider(String provider) {
            this.provider = provider;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder providerSettings(ProviderSettings providerSettings) {
            this.providerSettings = providerSettings;
            return this;
        }

        public CreateModelServiceInput build() {
            return new CreateModelServiceInput(this);
        } 

    } 

}
