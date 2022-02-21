// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateConfigSettingRequest} extends {@link RequestModel}
 *
 * <p>ValidateConfigSettingRequest</p>
 */
public class ValidateConfigSettingRequest extends Request {
    @Body
    @NameInMap("EnvId")
    private String envId;

    @Body
    @NameInMap("OptionSettings")
    private String optionSettings;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("StackId")
    private String stackId;

    @Body
    @NameInMap("TemplateId")
    private String templateId;

    private ValidateConfigSettingRequest(Builder builder) {
        super(builder);
        this.envId = builder.envId;
        this.optionSettings = builder.optionSettings;
        this.regionId = builder.regionId;
        this.stackId = builder.stackId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateConfigSettingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return envId
     */
    public String getEnvId() {
        return this.envId;
    }

    /**
     * @return optionSettings
     */
    public String getOptionSettings() {
        return this.optionSettings;
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

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<ValidateConfigSettingRequest, Builder> {
        private String envId; 
        private String optionSettings; 
        private String regionId; 
        private String stackId; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(ValidateConfigSettingRequest response) {
            super(response);
            this.envId = response.envId;
            this.optionSettings = response.optionSettings;
            this.regionId = response.regionId;
            this.stackId = response.stackId;
            this.templateId = response.templateId;
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
         * OptionSettings.
         */
        public Builder optionSettings(String optionSettings) {
            this.putBodyParameter("OptionSettings", optionSettings);
            this.optionSettings = optionSettings;
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

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public ValidateConfigSettingRequest build() {
            return new ValidateConfigSettingRequest(this);
        } 

    } 

}
