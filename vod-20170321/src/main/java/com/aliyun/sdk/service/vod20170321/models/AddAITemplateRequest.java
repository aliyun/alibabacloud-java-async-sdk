// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddAITemplateRequest} extends {@link RequestModel}
 *
 * <p>AddAITemplateRequest</p>
 */
public class AddAITemplateRequest extends Request {
    @Query
    @NameInMap("TemplateConfig")
    @Validation(required = true)
    private String templateConfig;

    @Query
    @NameInMap("TemplateName")
    @Validation(required = true)
    private String templateName;

    @Query
    @NameInMap("TemplateType")
    @Validation(required = true)
    private String templateType;

    private AddAITemplateRequest(Builder builder) {
        super(builder);
        this.templateConfig = builder.templateConfig;
        this.templateName = builder.templateName;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAITemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return templateConfig
     */
    public String getTemplateConfig() {
        return this.templateConfig;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    public static final class Builder extends Request.Builder<AddAITemplateRequest, Builder> {
        private String templateConfig; 
        private String templateName; 
        private String templateType; 

        private Builder() {
            super();
        } 

        private Builder(AddAITemplateRequest request) {
            super(request);
            this.templateConfig = request.templateConfig;
            this.templateName = request.templateName;
            this.templateType = request.templateType;
        } 

        /**
         * The detailed configurations of the AI template. The value is a JSON string.
         */
        public Builder templateConfig(String templateConfig) {
            this.putQueryParameter("TemplateConfig", templateConfig);
            this.templateConfig = templateConfig;
            return this;
        }

        /**
         * The name of the AI template. The name can be up to 128 bytes in length.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * The type of the AI template. Valid values:
         * <p>
         * 
         * *   **AIMediaAudit**: automated review
         * *   **AIImage**: smart thumbnail
         */
        public Builder templateType(String templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        @Override
        public AddAITemplateRequest build() {
            return new AddAITemplateRequest(this);
        } 

    } 

}
