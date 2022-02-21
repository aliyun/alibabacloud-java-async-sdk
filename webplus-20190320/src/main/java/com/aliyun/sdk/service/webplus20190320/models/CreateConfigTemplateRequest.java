// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConfigTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateConfigTemplateRequest</p>
 */
public class CreateConfigTemplateRequest extends Request {
    @Body
    @NameInMap("AppId")
    private String appId;

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
    @NameInMap("SourceTemplateId")
    private String sourceTemplateId;

    @Body
    @NameInMap("StackId")
    private String stackId;

    @Body
    @NameInMap("TemplateDescription")
    private String templateDescription;

    @Body
    @NameInMap("TemplateName")
    private String templateName;

    private CreateConfigTemplateRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.optionSettings = builder.optionSettings;
        this.pkgVersionId = builder.pkgVersionId;
        this.profileName = builder.profileName;
        this.regionId = builder.regionId;
        this.sourceEnvId = builder.sourceEnvId;
        this.sourceTemplateId = builder.sourceTemplateId;
        this.stackId = builder.stackId;
        this.templateDescription = builder.templateDescription;
        this.templateName = builder.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConfigTemplateRequest create() {
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
     * @return sourceTemplateId
     */
    public String getSourceTemplateId() {
        return this.sourceTemplateId;
    }

    /**
     * @return stackId
     */
    public String getStackId() {
        return this.stackId;
    }

    /**
     * @return templateDescription
     */
    public String getTemplateDescription() {
        return this.templateDescription;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    public static final class Builder extends Request.Builder<CreateConfigTemplateRequest, Builder> {
        private String appId; 
        private String optionSettings; 
        private String pkgVersionId; 
        private String profileName; 
        private String regionId; 
        private String sourceEnvId; 
        private String sourceTemplateId; 
        private String stackId; 
        private String templateDescription; 
        private String templateName; 

        private Builder() {
            super();
        } 

        private Builder(CreateConfigTemplateRequest response) {
            super(response);
            this.appId = response.appId;
            this.optionSettings = response.optionSettings;
            this.pkgVersionId = response.pkgVersionId;
            this.profileName = response.profileName;
            this.regionId = response.regionId;
            this.sourceEnvId = response.sourceEnvId;
            this.sourceTemplateId = response.sourceTemplateId;
            this.stackId = response.stackId;
            this.templateDescription = response.templateDescription;
            this.templateName = response.templateName;
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
         * SourceTemplateId.
         */
        public Builder sourceTemplateId(String sourceTemplateId) {
            this.putBodyParameter("SourceTemplateId", sourceTemplateId);
            this.sourceTemplateId = sourceTemplateId;
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
         * TemplateDescription.
         */
        public Builder templateDescription(String templateDescription) {
            this.putBodyParameter("TemplateDescription", templateDescription);
            this.templateDescription = templateDescription;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.putBodyParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        @Override
        public CreateConfigTemplateRequest build() {
            return new CreateConfigTemplateRequest(this);
        } 

    } 

}
