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
         * The ID of the request.
         */
        public Builder templateConfig(String templateConfig) {
            this.putQueryParameter("TemplateConfig", templateConfig);
            this.templateConfig = templateConfig;
            return this;
        }

        /**
         * The name of the AI template. The name can be up to 128 bytes in length.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * The detailed configurations of the AI template. The value is a JSON string. For more information, see [AITemplateConfig](https://help.aliyun.com/document_detail/89863.html#title-vd3-499-o36).
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
