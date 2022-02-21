// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppEnvRequest} extends {@link RequestModel}
 *
 * <p>CreateAppEnvRequest</p>
 */
public class CreateAppEnvRequest extends Request {
    @Body
    @NameInMap("AppId")
    private String appId;

    @Body
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Body
    @NameInMap("EnvDescription")
    private String envDescription;

    @Body
    @NameInMap("EnvName")
    private String envName;

    @Body
    @NameInMap("ExtraProperties")
    private String extraProperties;

    @Body
    @NameInMap("OptionSettings")
    private String optionSettings;

    @Body
    @NameInMap("PkgVersionId")
    private String pkgVersionId;

    @Body
    @NameInMap("ProfileName")
    private String profileName;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("SourceEnvId")
    private String sourceEnvId;

    @Body
    @NameInMap("StackId")
    private String stackId;

    @Body
    @NameInMap("TemplateId")
    private String templateId;

    private CreateAppEnvRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.dryRun = builder.dryRun;
        this.envDescription = builder.envDescription;
        this.envName = builder.envName;
        this.extraProperties = builder.extraProperties;
        this.optionSettings = builder.optionSettings;
        this.pkgVersionId = builder.pkgVersionId;
        this.profileName = builder.profileName;
        this.regionId = builder.regionId;
        this.sourceEnvId = builder.sourceEnvId;
        this.stackId = builder.stackId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppEnvRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
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
     * @return envName
     */
    public String getEnvName() {
        return this.envName;
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
     * @return pkgVersionId
     */
    public String getPkgVersionId() {
        return this.pkgVersionId;
    }

    /**
     * @return profileName
     */
    public String getProfileName() {
        return this.profileName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sourceEnvId
     */
    public String getSourceEnvId() {
        return this.sourceEnvId;
    }

    /**
     * @return stackId
     */
    public String getStackId() {
        return this.stackId;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<CreateAppEnvRequest, Builder> {
        private String appId; 
        private Boolean dryRun; 
        private String envDescription; 
        private String envName; 
        private String extraProperties; 
        private String optionSettings; 
        private String pkgVersionId; 
        private String profileName; 
        private String regionId; 
        private String sourceEnvId; 
        private String stackId; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppEnvRequest response) {
            super(response);
            this.appId = response.appId;
            this.dryRun = response.dryRun;
            this.envDescription = response.envDescription;
            this.envName = response.envName;
            this.extraProperties = response.extraProperties;
            this.optionSettings = response.optionSettings;
            this.pkgVersionId = response.pkgVersionId;
            this.profileName = response.profileName;
            this.regionId = response.regionId;
            this.sourceEnvId = response.sourceEnvId;
            this.stackId = response.stackId;
            this.templateId = response.templateId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
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
         * EnvName.
         */
        public Builder envName(String envName) {
            this.putBodyParameter("EnvName", envName);
            this.envName = envName;
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
         * PkgVersionId.
         */
        public Builder pkgVersionId(String pkgVersionId) {
            this.putBodyParameter("PkgVersionId", pkgVersionId);
            this.pkgVersionId = pkgVersionId;
            return this;
        }

        /**
         * ProfileName.
         */
        public Builder profileName(String profileName) {
            this.putBodyParameter("ProfileName", profileName);
            this.profileName = profileName;
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
         * SourceEnvId.
         */
        public Builder sourceEnvId(String sourceEnvId) {
            this.putBodyParameter("SourceEnvId", sourceEnvId);
            this.sourceEnvId = sourceEnvId;
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

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public CreateAppEnvRequest build() {
            return new CreateAppEnvRequest(this);
        } 

    } 

}
