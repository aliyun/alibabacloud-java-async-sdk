// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateAITemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateAITemplateRequest</p>
 */
public class UpdateAITemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The detailed configurations of the AI template. The value is a JSON string. For more information, see <a href="~~89863#title-vd3-499-o36~~">AITemplateConfig</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;AuditItem&quot;:[&quot;terrorism&quot;,&quot;porn&quot;],&quot;AuditRange&quot;:[&quot;text-title&quot;,&quot;video&quot;],&quot;AuditContent&quot;:[&quot;screen&quot;],&quot;AuditAutoBlock&quot;:&quot;yes&quot;}</p>
         */
        public Builder templateConfig(String templateConfig) {
            this.putQueryParameter("TemplateConfig", templateConfig);
            this.templateConfig = templateConfig;
            return this;
        }

        /**
         * <p>The ID of the AI template. You can use one of the following methods to obtain the ID:</p>
         * <ul>
         * <li>Call the <a href="https://help.aliyun.com/document_detail/102930.html">AddAITemplate</a> operation to add an AI template if no AI template exists. The value of TemplateId in the response is the ID of the AI template.</li>
         * <li>Call the <a href="https://help.aliyun.com/document_detail/102936.html">ListAITemplate</a> operation if the template already exists. The value of TemplateId in the response is the ID of the AI template.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1706a0063dd733f6a823ef32e0a5****</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The name of the AI template. The name can be up to 128 bytes in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DemoAITemplate</p>
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
