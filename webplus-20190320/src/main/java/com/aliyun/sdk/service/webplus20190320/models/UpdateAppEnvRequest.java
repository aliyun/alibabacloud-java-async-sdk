// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAppEnvRequest} extends {@link RequestModel}
 *
 * <p>UpdateAppEnvRequest</p>
 */
public class UpdateAppEnvRequest extends Request {
    @Body
    @NameInMap("BatchInterval")
    private String batchInterval;

    @Body
    @NameInMap("BatchPercent")
    private String batchPercent;

    @Body
    @NameInMap("BatchSize")
    private String batchSize;

    @Body
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Body
    @NameInMap("EnvDescription")
    private String envDescription;

    @Body
    @NameInMap("EnvId")
    private String envId;

    @Body
    @NameInMap("ExtraProperties")
    private String extraProperties;

    @Body
    @NameInMap("OptionSettings")
    private String optionSettings;

    @Body
    @NameInMap("PauseBetweenBatches")
    private Boolean pauseBetweenBatches;

    @Body
    @NameInMap("PkgVersionId")
    private String pkgVersionId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("StackId")
    private String stackId;

    private UpdateAppEnvRequest(Builder builder) {
        super(builder);
        this.batchInterval = builder.batchInterval;
        this.batchPercent = builder.batchPercent;
        this.batchSize = builder.batchSize;
        this.dryRun = builder.dryRun;
        this.envDescription = builder.envDescription;
        this.envId = builder.envId;
        this.extraProperties = builder.extraProperties;
        this.optionSettings = builder.optionSettings;
        this.pauseBetweenBatches = builder.pauseBetweenBatches;
        this.pkgVersionId = builder.pkgVersionId;
        this.regionId = builder.regionId;
        this.stackId = builder.stackId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAppEnvRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchInterval
     */
    public String getBatchInterval() {
        return this.batchInterval;
    }

    /**
     * @return batchPercent
     */
    public String getBatchPercent() {
        return this.batchPercent;
    }

    /**
     * @return batchSize
     */
    public String getBatchSize() {
        return this.batchSize;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return envDescription
     */
    public String getEnvDescription() {
        return this.envDescription;
    }

    /**
     * @return envId
     */
    public String getEnvId() {
        return this.envId;
    }

    /**
     * @return extraProperties
     */
    public String getExtraProperties() {
        return this.extraProperties;
    }

    /**
     * @return optionSettings
     */
    public String getOptionSettings() {
        return this.optionSettings;
    }

    /**
     * @return pauseBetweenBatches
     */
    public Boolean getPauseBetweenBatches() {
        return this.pauseBetweenBatches;
    }

    /**
     * @return pkgVersionId
     */
    public String getPkgVersionId() {
        return this.pkgVersionId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return stackId
     */
    public String getStackId() {
        return this.stackId;
    }

    public static final class Builder extends Request.Builder<UpdateAppEnvRequest, Builder> {
        private String batchInterval; 
        private String batchPercent; 
        private String batchSize; 
        private Boolean dryRun; 
        private String envDescription; 
        private String envId; 
        private String extraProperties; 
        private String optionSettings; 
        private Boolean pauseBetweenBatches; 
        private String pkgVersionId; 
        private String regionId; 
        private String stackId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAppEnvRequest response) {
            super(response);
            this.batchInterval = response.batchInterval;
            this.batchPercent = response.batchPercent;
            this.batchSize = response.batchSize;
            this.dryRun = response.dryRun;
            this.envDescription = response.envDescription;
            this.envId = response.envId;
            this.extraProperties = response.extraProperties;
            this.optionSettings = response.optionSettings;
            this.pauseBetweenBatches = response.pauseBetweenBatches;
            this.pkgVersionId = response.pkgVersionId;
            this.regionId = response.regionId;
            this.stackId = response.stackId;
        } 

        /**
         * BatchInterval.
         */
        public Builder batchInterval(String batchInterval) {
            this.putBodyParameter("BatchInterval", batchInterval);
            this.batchInterval = batchInterval;
            return this;
        }

        /**
         * BatchPercent.
         */
        public Builder batchPercent(String batchPercent) {
            this.putBodyParameter("BatchPercent", batchPercent);
            this.batchPercent = batchPercent;
            return this;
        }

        /**
         * BatchSize.
         */
        public Builder batchSize(String batchSize) {
            this.putBodyParameter("BatchSize", batchSize);
            this.batchSize = batchSize;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * EnvDescription.
         */
        public Builder envDescription(String envDescription) {
            this.putBodyParameter("EnvDescription", envDescription);
            this.envDescription = envDescription;
            return this;
        }

        /**
         * EnvId.
         */
        public Builder envId(String envId) {
            this.putBodyParameter("EnvId", envId);
            this.envId = envId;
            return this;
        }

        /**
         * ExtraProperties.
         */
        public Builder extraProperties(String extraProperties) {
            this.putBodyParameter("ExtraProperties", extraProperties);
            this.extraProperties = extraProperties;
            return this;
        }

        /**
         * OptionSettings.
         */
        public Builder optionSettings(String optionSettings) {
            this.putBodyParameter("OptionSettings", optionSettings);
            this.optionSettings = optionSettings;
            return this;
        }

        /**
         * PauseBetweenBatches.
         */
        public Builder pauseBetweenBatches(Boolean pauseBetweenBatches) {
            this.putBodyParameter("PauseBetweenBatches", pauseBetweenBatches);
            this.pauseBetweenBatches = pauseBetweenBatches;
            return this;
        }

        /**
         * PkgVersionId.
         */
        public Builder pkgVersionId(String pkgVersionId) {
            this.putBodyParameter("PkgVersionId", pkgVersionId);
            this.pkgVersionId = pkgVersionId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * StackId.
         */
        public Builder stackId(String stackId) {
            this.putBodyParameter("StackId", stackId);
            this.stackId = stackId;
            return this;
        }

        @Override
        public UpdateAppEnvRequest build() {
            return new UpdateAppEnvRequest(this);
        } 

    } 

}
