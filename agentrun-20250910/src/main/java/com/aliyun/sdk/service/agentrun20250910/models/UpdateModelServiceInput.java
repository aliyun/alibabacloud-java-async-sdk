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
 * {@link UpdateModelServiceInput} extends {@link TeaModel}
 *
 * <p>UpdateModelServiceInput</p>
 */
public class UpdateModelServiceInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("credentialName")
    private String credentialName;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("modelInfoConfigs")
    private java.util.List<ModelInfoConfig> modelInfoConfigs;

    @com.aliyun.core.annotation.NameInMap("networkConfiguration")
    private NetworkConfiguration networkConfiguration;

    @com.aliyun.core.annotation.NameInMap("providerSettings")
    private ProviderSettings providerSettings;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("statusReason")
    private String statusReason;

    private UpdateModelServiceInput(Builder builder) {
        this.credentialName = builder.credentialName;
        this.description = builder.description;
        this.modelInfoConfigs = builder.modelInfoConfigs;
        this.networkConfiguration = builder.networkConfiguration;
        this.providerSettings = builder.providerSettings;
        this.status = builder.status;
        this.statusReason = builder.statusReason;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateModelServiceInput create() {
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
     * @return networkConfiguration
     */
    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
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
        private String credentialName; 
        private String description; 
        private java.util.List<ModelInfoConfig> modelInfoConfigs; 
        private NetworkConfiguration networkConfiguration; 
        private ProviderSettings providerSettings; 
        private String status; 
        private String statusReason; 

        private Builder() {
        } 

        private Builder(UpdateModelServiceInput model) {
            this.credentialName = model.credentialName;
            this.description = model.description;
            this.modelInfoConfigs = model.modelInfoConfigs;
            this.networkConfiguration = model.networkConfiguration;
            this.providerSettings = model.providerSettings;
            this.status = model.status;
            this.statusReason = model.statusReason;
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
         * networkConfiguration.
         */
        public Builder networkConfiguration(NetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
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

        public UpdateModelServiceInput build() {
            return new UpdateModelServiceInput(this);
        } 

    } 

}
