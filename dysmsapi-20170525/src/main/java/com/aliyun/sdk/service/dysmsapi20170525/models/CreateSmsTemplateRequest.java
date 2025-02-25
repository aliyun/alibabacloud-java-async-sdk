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
 * {@link CreateSmsTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateSmsTemplateRequest</p>
 */
public class CreateSmsTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplySceneContent")
    private String applySceneContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntlType")
    private Integer intlType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MoreData")
    private java.util.List<String> moreData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelatedSignName")
    private String relatedSignName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    @com.aliyun.core.annotation.Validation(maxLength = 500)
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateContent")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 500)
    private String templateContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 30)
    private String templateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateRule")
    private String templateRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer templateType;

    private CreateSmsTemplateRequest(Builder builder) {
        super(builder);
        this.applySceneContent = builder.applySceneContent;
        this.intlType = builder.intlType;
        this.moreData = builder.moreData;
        this.ownerId = builder.ownerId;
        this.relatedSignName = builder.relatedSignName;
        this.remark = builder.remark;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.templateContent = builder.templateContent;
        this.templateName = builder.templateName;
        this.templateRule = builder.templateRule;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSmsTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applySceneContent
     */
    public String getApplySceneContent() {
        return this.applySceneContent;
    }

    /**
     * @return intlType
     */
    public Integer getIntlType() {
        return this.intlType;
    }

    /**
     * @return moreData
     */
    public java.util.List<String> getMoreData() {
        return this.moreData;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return relatedSignName
     */
    public String getRelatedSignName() {
        return this.relatedSignName;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return templateContent
     */
    public String getTemplateContent() {
        return this.templateContent;
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
    public Integer getTemplateType() {
        return this.templateType;
    }

    public static final class Builder extends Request.Builder<CreateSmsTemplateRequest, Builder> {
        private String applySceneContent; 
        private Integer intlType; 
        private java.util.List<String> moreData; 
        private Long ownerId; 
        private String relatedSignName; 
        private String remark; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String templateContent; 
        private String templateName; 
        private String templateRule; 
        private Integer templateType; 

        private Builder() {
            super();
        } 

        private Builder(CreateSmsTemplateRequest request) {
            super(request);
            this.applySceneContent = request.applySceneContent;
            this.intlType = request.intlType;
            this.moreData = request.moreData;
            this.ownerId = request.ownerId;
            this.relatedSignName = request.relatedSignName;
            this.remark = request.remark;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.templateContent = request.templateContent;
            this.templateName = request.templateName;
            this.templateRule = request.templateRule;
            this.templateType = request.templateType;
        } 

        /**
         * <p>If there is an applicable scenario, you can fill it in.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com/">http://www.aliyun.com/</a></p>
         */
        public Builder applySceneContent(String applySceneContent) {
            this.putQueryParameter("ApplySceneContent", applySceneContent);
            this.applySceneContent = applySceneContent;
            return this;
        }

        /**
         * <p>International/Hong Kong, Macao, and Taiwan template type. When the <strong>TemplateType</strong> parameter is <strong>3</strong>, this parameter is required for international/Hong Kong, Macao, and Taiwan templates, with values:</p>
         * <ul>
         * <li><strong>0</strong>: Verification code.</li>
         * <li><strong>1</strong>: SMS notification.</li>
         * <li><strong>2</strong>: Promotional message.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder intlType(Integer intlType) {
            this.putQueryParameter("IntlType", intlType);
            this.intlType = intlType;
            return this;
        }

        /**
         * <p>Additional materials you can upload, such as business proof documents or screenshots, to help reviewers understand your business details.</p>
         * <p>This parameter is optional; please fill it in according to actual needs.</p>
         */
        public Builder moreData(java.util.List<String> moreData) {
            String moreDataShrink = shrink(moreData, "MoreData", "json");
            this.putQueryParameter("MoreData", moreDataShrink);
            this.moreData = moreData;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The signature name that the template needs to be associated with. The associated SMS signature must have passed the review.</p>
         * <p>This parameter is mandatory when the TemplateType parameter is <strong>0</strong>, <strong>1</strong>, or <strong>2</strong>.</p>
         * <p><notice>Associating a signature can expedite the review process. Note that this associated signature is unrelated to the signature selected when sending SMS messages.</notice></p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun</p>
         */
        public Builder relatedSignName(String relatedSignName) {
            this.putQueryParameter("RelatedSignName", relatedSignName);
            this.relatedSignName = relatedSignName;
            return this;
        }

        /**
         * <p>Please describe the business scenario where you use SMS or provide an online link to the scenario, along with a complete example of the SMS (with variable contents filled), as complete information helps increase the template approval rate. Failure to follow guidelines or leaving this field blank may affect the approval of your template.</p>
         * 
         * <strong>example:</strong>
         * <p>Request verification code SMS.</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>Template content, up to 500 characters in length.</p>
         * <p>Both the template content and variable content must comply with SMS specifications; otherwise, the template will fail the review. You can also view common template examples on the template application page. Using sample templates can enhance review efficiency and success rates. For variable specifications, see <a href="https://help.aliyun.com/zh/sms/templaterule-template-variable-parameter-filling-example">TemplateContent Variable Parameter Filling Specifications</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>You are applying for mobile registration. The verification code is: ${code}. It is valid for 5 minutes!</p>
         */
        public Builder templateContent(String templateContent) {
            this.putQueryParameter("TemplateContent", templateContent);
            this.templateContent = templateContent;
            return this;
        }

        /**
         * <p>Template name, up to 30 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyunCode</p>
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>Template variable rules.</p>
         * <p>For filling in variable rules, refer to the <a href="https://help.aliyun.com/zh/sms/templaterule-template-variable-parameter-filling-example">Sample Documentation</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;code&quot;:&quot;characterWithNumber&quot;}</p>
         */
        public Builder templateRule(String templateRule) {
            this.putQueryParameter("TemplateRule", templateRule);
            this.templateRule = templateRule;
            return this;
        }

        /**
         * <p>SMS type. Values:</p>
         * <ul>
         * <li><strong>0</strong>: Verification code.</li>
         * <li><strong>1</strong>: SMS notification.</li>
         * <li><strong>2</strong>: Promotional message.</li>
         * <li><strong>3</strong>: International/Hong Kong, Macao, and Taiwan messages.</li>
         * </ul>
         * <blockquote>
         * <p>Only enterprise-verified users can apply for promotional messages and international/Hong Kong, Macao, and Taiwan messages. For details on the differences between personal and enterprise user rights, please refer to <a href="https://help.aliyun.com/zh/sms/user-guide/usage-notes?spm=a2c4g.11186623.0.0.67447f576NJnE8">Usage Instructions</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder templateType(Integer templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        @Override
        public CreateSmsTemplateRequest build() {
            return new CreateSmsTemplateRequest(this);
        } 

    } 

}
