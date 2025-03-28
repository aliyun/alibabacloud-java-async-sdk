// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
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
    private java.util.List<String> validationOptions;

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
    public java.util.List<String> getValidationOptions() {
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
        private java.util.List<String> validationOptions; 

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
         * <p>The description of the template. The maximum length is 256 characters.</p>
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
         * <p>Whether to update the Draft (draft) version. Values:</p>
         * <ul>
         * <li>false (default): If template content is provided, a new version is created, and the Draft version is cleared. Otherwise, the current latest version is modified.</li>
         * <li>true: Modifies the Draft version. The Draft version can only be retrieved via the GetTemplate interface. The ListTemplateVersions interface will not return it. The TemplateVersion parameter in other interfaces cannot specify Draft.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isDraft(Boolean isDraft) {
            this.putQueryParameter("IsDraft", isDraft);
            this.isDraft = isDraft;
            return this;
        }

        /**
         * <p>Template version rotation strategy. Values:</p>
         * <ul>
         * <li>None (default): No rotation. An error occurs when the version limit is reached.</li>
         * <li>DeleteOldestNonSharedVersionWhenLimitExceeded: Rotates and deletes non-shared template versions.<blockquote>
         * <ul>
         * <li>If all versions of the template are shared, they cannot be rotated and deleted.</li>
         * <li>The current latest version will not be rotated and deleted.</li>
         * <li>Regardless of whether rotation deletion is used, the template version number cannot exceed v65000.</li>
         * </ul>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder rotateStrategy(String rotateStrategy) {
            this.putQueryParameter("RotateStrategy", rotateStrategy);
            this.rotateStrategy = rotateStrategy;
            return this;
        }

        /**
         * <p>The structure of the template body. The length should be between 1 and 524,288 bytes. If the content is long, it is recommended to use HTTP POST + Body Param to pass the parameter in the request body to avoid request failure due to an overly long URL.</p>
         * <blockquote>
         * <p>You must and can only specify one of <code>TemplateBody</code>, <code>TemplateURL</code>, <code>TemplateId</code>, or <code>TemplateScratchId</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ROSTemplateFormatVersion&quot;:&quot;2015-09-01&quot;}</p>
         */
        public Builder templateBody(String templateBody) {
            this.putBodyParameter("TemplateBody", templateBody);
            this.templateBody = templateBody;
            return this;
        }

        /**
         * <p>The template ID. Supports both shared and private templates.</p>
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
         * <p>The name of the template.<br>The length should not exceed 255 characters (utf-8 encoding), and it must start with a number, letter, or Chinese character. It can include numbers, letters, Chinese characters, hyphens (-), and underscores (_).</p>
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
         * <p>The location of the file containing the template body. The URL must point to a template located on a web server (HTTP or HTTPS) or in an Alibaba Cloud OSS bucket (e.g., oss://ros/template/demo, oss://ros/template/demo?RegionId=cn-hangzhou), with a maximum size of 524,288 bytes.   </p>
         * <blockquote>
         * <p>If the OSS region is not specified, it defaults to the same as the <code>RegionId</code> parameter in the request.</p>
         * </blockquote>
         * <p>You can only specify one of <code>TemplateBody</code> or <code>TemplateURL</code>.<br>The maximum length of the URL is 1,024 bytes.</p>
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
         * <p>Validation options.</p>
         * <p>By default, no options are enabled, and strict validation is performed.</p>
         */
        public Builder validationOptions(java.util.List<String> validationOptions) {
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
