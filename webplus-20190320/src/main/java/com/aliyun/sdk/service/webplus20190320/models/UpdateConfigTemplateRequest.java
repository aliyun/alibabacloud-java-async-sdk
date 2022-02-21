// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateConfigTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateConfigTemplateRequest</p>
 */
public class UpdateConfigTemplateRequest extends Request {
    @Body
    @NameInMap("OptionSettings")
    private String optionSettings;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("TemplateDescription")
    private String templateDescription;

    @Body
    @NameInMap("TemplateId")
    private String templateId;

    private UpdateConfigTemplateRequest(Builder builder) {
        super(builder);
        this.optionSettings = builder.optionSettings;
        this.regionId = builder.regionId;
        this.templateDescription = builder.templateDescription;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConfigTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return templateDescription
     */
    public String getTemplateDescription() {
        return this.templateDescription;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<UpdateConfigTemplateRequest, Builder> {
        private String optionSettings; 
        private String regionId; 
        private String templateDescription; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateConfigTemplateRequest response) {
            super(response);
            this.optionSettings = response.optionSettings;
            this.regionId = response.regionId;
            this.templateDescription = response.templateDescription;
            this.templateId = response.templateId;
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
         * TemplateDescription.
         */
        public Builder templateDescription(String templateDescription) {
            this.putBodyParameter("TemplateDescription", templateDescription);
            this.templateDescription = templateDescription;
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
        public UpdateConfigTemplateRequest build() {
            return new UpdateConfigTemplateRequest(this);
        } 

    } 

}
