// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateTemplateRequest</p>
 */
public class UpdateTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsDraft")
    private Boolean isDraft;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RotateStrategy")
    private String rotateStrategy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateBody")
    private String templateBody;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateURL")
    private String templateURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ValidationOptions")
    private java.util.List < String > validationOptions;

    private UpdateTemplateRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.isDraft = builder.isDraft;
        this.rotateStrategy = builder.rotateStrategy;
        this.templateBody = builder.templateBody;
        this.templateId = builder.templateId;
        this.templateName = builder.templateName;
        this.templateURL = builder.templateURL;
        this.validationOptions = builder.validationOptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return isDraft
     */
    public Boolean getIsDraft() {
        return this.isDraft;
    }

    /**
     * @return rotateStrategy
     */
    public String getRotateStrategy() {
        return this.rotateStrategy;
    }

    /**
     * @return templateBody
     */
    public String getTemplateBody() {
        return this.templateBody;
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

    /**
     * @return templateURL
     */
    public String getTemplateURL() {
        return this.templateURL;
    }

    /**
     * @return validationOptions
     */
    public java.util.List < String > getValidationOptions() {
        return this.validationOptions;
    }

    public static final class Builder extends Request.Builder<UpdateTemplateRequest, Builder> {
        private String description; 
        private Boolean isDraft; 
        private String rotateStrategy; 
        private String templateBody; 
        private String templateId; 
        private String templateName; 
        private String templateURL; 
        private java.util.List < String > validationOptions; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTemplateRequest request) {
            super(request);
            this.description = request.description;
            this.isDraft = request.isDraft;
            this.rotateStrategy = request.rotateStrategy;
            this.templateBody = request.templateBody;
            this.templateId = request.templateId;
            this.templateName = request.templateName;
            this.templateURL = request.templateURL;
            this.validationOptions = request.validationOptions;
        } 

        /**
         * <p>The description of the template. It can be up to 256 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>It is a demo.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * IsDraft.
         */
        public Builder isDraft(Boolean isDraft) {
            this.putQueryParameter("IsDraft", isDraft);
            this.isDraft = isDraft;
            return this;
        }

        /**
         * RotateStrategy.
         */
        public Builder rotateStrategy(String rotateStrategy) {
            this.putQueryParameter("RotateStrategy", rotateStrategy);
            this.rotateStrategy = rotateStrategy;
            return this;
        }

        /**
         * TemplateBody.
         */
        public Builder templateBody(String templateBody) {
            this.putBodyParameter("TemplateBody", templateBody);
            this.templateBody = templateBody;
            return this;
        }

        /**
         * <p>The ID of the template. This parameter applies to shared and private templates.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5ecd1e10-b0e9-4389-a565-e4c15efc****</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The name of the template.</p>
         * <p>The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.</p>
         * 
         * <strong>example:</strong>
         * <p>MyTemplate</p>
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>The URL of the file that contains the template body. The URL must point to a template located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/template/demo and oss://ros/template/demo?RegionId=cn-hangzhou. The template can be up to 524,288 bytes in length, and the URL can be up to 1,024 bytes in length.</p>
         * <blockquote>
         * <p> If the region of the OSS bucket is not specified, the RegionId value is used.</p>
         * </blockquote>
         * <p>You can specify only one of the TemplateBody and TemplateURL parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://ros/template/demo</p>
         */
        public Builder templateURL(String templateURL) {
            this.putQueryParameter("TemplateURL", templateURL);
            this.templateURL = templateURL;
            return this;
        }

        /**
         * ValidationOptions.
         */
        public Builder validationOptions(java.util.List < String > validationOptions) {
            this.putQueryParameter("ValidationOptions", validationOptions);
            this.validationOptions = validationOptions;
            return this;
        }

        @Override
        public UpdateTemplateRequest build() {
            return new UpdateTemplateRequest(this);
        } 

    } 

}
