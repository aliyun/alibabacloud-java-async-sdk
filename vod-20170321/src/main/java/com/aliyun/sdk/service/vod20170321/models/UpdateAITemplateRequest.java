// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAITemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateAITemplateRequest</p>
 */
public class UpdateAITemplateRequest extends Request {
    @Query
    @NameInMap("TemplateConfig")
    @Validation(required = true)
    private String templateConfig;

    @Query
    @NameInMap("TemplateId")
    @Validation(required = true)
    private String templateId;

    @Query
    @NameInMap("TemplateName")
    @Validation(required = true)
    private String templateName;

    private UpdateAITemplateRequest(Builder builder) {
        super(builder);
        this.templateConfig = builder.templateConfig;
        this.templateId = builder.templateId;
        this.templateName = builder.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAITemplateRequest create() {
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
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    public static final class Builder extends Request.Builder<UpdateAITemplateRequest, Builder> {
        private String templateConfig; 
        private String templateId; 
        private String templateName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAITemplateRequest request) {
            super(request);
            this.templateConfig = request.templateConfig;
            this.templateId = request.templateId;
            this.templateName = request.templateName;
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
         * The ID of the AI template. You can use one of the following methods to obtain the ID of the AI template:
         * <p>
         * 
         * *   Call the [AddAITemplate](~~102930~~) operation to add an AI template if no AI template exists. The value of TemplateId from the response is the ID of the AI template.
         * *   Call the [ListAITemplate](~~102936~~) operation if the template already exists. The value of TemplateId from the response is the ID of the AI template.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
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

        @Override
        public UpdateAITemplateRequest build() {
            return new UpdateAITemplateRequest(this);
        } 

    } 

}
