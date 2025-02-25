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
 * {@link UpdateSmsTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateSmsTemplateRequest</p>
 */
public class UpdateSmsTemplateRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("TemplateCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateCode;

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

    private UpdateSmsTemplateRequest(Builder builder) {
        super(builder);
        this.applySceneContent = builder.applySceneContent;
        this.intlType = builder.intlType;
        this.moreData = builder.moreData;
        this.ownerId = builder.ownerId;
        this.relatedSignName = builder.relatedSignName;
        this.remark = builder.remark;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.templateCode = builder.templateCode;
        this.templateContent = builder.templateContent;
        this.templateName = builder.templateName;
        this.templateRule = builder.templateRule;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSmsTemplateRequest create() {
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
     * @return templateCode
     */
    public String getTemplateCode() {
        return this.templateCode;
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

    public static final class Builder extends Request.Builder<UpdateSmsTemplateRequest, Builder> {
        private String applySceneContent; 
        private Integer intlType; 
        private java.util.List<String> moreData; 
        private Long ownerId; 
        private String relatedSignName; 
        private String remark; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String templateCode; 
        private String templateContent; 
        private String templateName; 
        private String templateRule; 
        private Integer templateType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSmsTemplateRequest request) {
            super(request);
            this.applySceneContent = request.applySceneContent;
            this.intlType = request.intlType;
            this.moreData = request.moreData;
            this.ownerId = request.ownerId;
            this.relatedSignName = request.relatedSignName;
            this.remark = request.remark;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.templateCode = request.templateCode;
            this.templateContent = request.templateContent;
            this.templateName = request.templateName;
            this.templateRule = request.templateRule;
            this.templateType = request.templateType;
        } 

        /**
         * <p>Application scenarios, instructions as follows:</p>
         * <ul>
         * <li>For registered websites, please enter the MIIT-registered domain with HTTP or HTTPS.</li>
         * <li>For launched apps, provide the app store display link with HTTP or HTTPS, ensuring the app is online.</li>
         * <li>For public accounts or mini-programs, enter the full name of the public account or mini-program, ensuring they are online.</li>
         * <li>For e-commerce platform stores, applicable only to enterprise users, enter the display link of the e-commerce store with HTTP or HTTPS.</li>
         * </ul>
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
         * <li><strong>2</strong>: Promotional SMS.</li>
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
         * <p>Additional information, such as uploading business proof documents or screenshots, to help reviewers understand your business details. Optional and can be left unset.</p>
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
         * <p>SMS signature associated with the template during the application.</p>
         * 
         * <strong>example:</strong>
         * <p>阿里云</p>
         */
        public Builder relatedSignName(String relatedSignName) {
            this.putQueryParameter("RelatedSignName", relatedSignName);
            this.relatedSignName = relatedSignName;
            return this;
        }

        /**
         * <p>Explanation for the SMS template application, which serves as a reference for template review.</p>
         * 
         * <strong>example:</strong>
         * <p>登录场景使用验证码</p>
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
         * <p>Template Code of an unapproved template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SMS_152550****</p>
         */
        public Builder templateCode(String templateCode) {
            this.putQueryParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        /**
         * <p>Template content, up to 500 characters in length.</p>
         * <p>Both the template content and variable content must comply with SMS regulations; otherwise, the template will fail the review. You can also view common template examples on the template application page. Using sample templates can enhance review efficiency and success rates. Variable specifications can be found in <a href="https://help.aliyun.com/zh/sms/templaterule-template-variable-parameter-filling-example?spm">TemplateContent Parameter Variable Specifications</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>您正在申请手机注册，验证码为：${code}，5分钟内有效！</p>
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
         * <p>验证码</p>
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>Template variable rules.</p>
         * <p>For guidance on filling variable rules, refer to the <a href="https://help.aliyun.com/zh/sms/templaterule-template-variable-parameter-filling-example?spm">Sample Documentation</a>.</p>
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
         * <li><strong>2</strong>: Promotional SMS.</li>
         * <li><strong>3</strong>: International/Hong Kong, Macao, and Taiwan messages.</li>
         * </ul>
         * <blockquote>
         * <p>Only enterprise-certified users can apply for promotional SMS and international/Hong Kong, Macao, and Taiwan messages. Details on differences between personal and enterprise user rights are available in <a href="https://help.aliyun.com/zh/sms/user-guide/usage-notes?spm=a2c4g.11186623.0.0.67447f576NJnE8">Usage Guidelines</a>.</p>
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
        public UpdateSmsTemplateRequest build() {
            return new UpdateSmsTemplateRequest(this);
        } 

    } 

}
