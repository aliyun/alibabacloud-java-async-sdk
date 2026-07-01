// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
 * {@link CreateRCSTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateRCSTemplateRequest</p>
 */
public class CreateRCSTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelatedSignNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private String relatedSignNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateContent")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateFormat")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateMenu")
    private String templateMenu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateRule")
    private String templateRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long templateType;

    private CreateRCSTemplateRequest(Builder builder) {
        super(builder);
        this.relatedSignNames = builder.relatedSignNames;
        this.templateContent = builder.templateContent;
        this.templateFormat = builder.templateFormat;
        this.templateMenu = builder.templateMenu;
        this.templateName = builder.templateName;
        this.templateRule = builder.templateRule;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRCSTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return relatedSignNames
     */
    public String getRelatedSignNames() {
        return this.relatedSignNames;
    }

    /**
     * @return templateContent
     */
    public String getTemplateContent() {
        return this.templateContent;
    }

    /**
     * @return templateFormat
     */
    public String getTemplateFormat() {
        return this.templateFormat;
    }

    /**
     * @return templateMenu
     */
    public String getTemplateMenu() {
        return this.templateMenu;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return templateRule
     */
    public String getTemplateRule() {
        return this.templateRule;
    }

    /**
     * @return templateType
     */
    public Long getTemplateType() {
        return this.templateType;
    }

    public static final class Builder extends Request.Builder<CreateRCSTemplateRequest, Builder> {
        private String relatedSignNames; 
        private String templateContent; 
        private String templateFormat; 
        private String templateMenu; 
        private String templateName; 
        private String templateRule; 
        private Long templateType; 

        private Builder() {
            super();
        } 

        private Builder(CreateRCSTemplateRequest request) {
            super(request);
            this.relatedSignNames = request.relatedSignNames;
            this.templateContent = request.templateContent;
            this.templateFormat = request.templateFormat;
            this.templateMenu = request.templateMenu;
            this.templateName = request.templateName;
            this.templateRule = request.templateRule;
            this.templateType = request.templateType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder relatedSignNames(String relatedSignNames) {
            this.putQueryParameter("RelatedSignNames", relatedSignNames);
            this.relatedSignNames = relatedSignNames;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        public Builder templateContent(String templateContent) {
            this.putQueryParameter("TemplateContent", templateContent);
            this.templateContent = templateContent;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder templateFormat(String templateFormat) {
            this.putQueryParameter("TemplateFormat", templateFormat);
            this.templateFormat = templateFormat;
            return this;
        }

        /**
         * TemplateMenu.
         */
        public Builder templateMenu(String templateMenu) {
            this.putQueryParameter("TemplateMenu", templateMenu);
            this.templateMenu = templateMenu;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * TemplateRule.
         */
        public Builder templateRule(String templateRule) {
            this.putQueryParameter("TemplateRule", templateRule);
            this.templateRule = templateRule;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder templateType(Long templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        @Override
        public CreateRCSTemplateRequest build() {
            return new CreateRCSTemplateRequest(this);
        } 

    } 

}
