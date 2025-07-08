// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link CreateSmsTemplateNewRequest} extends {@link RequestModel}
 *
 * <p>CreateSmsTemplateNewRequest</p>
 */
public class CreateSmsTemplateNewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AiTemplate")
    private Long aiTemplate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AiTemplateUuid")
    private String aiTemplateUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationSceneId")
    private Long applicationSceneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplySource")
    private String applySource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntlType")
    private Integer intlType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MoreData")
    private java.util.List<String> moreData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssKeys")
    private String ossKeys;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProdCode")
    private String prodCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductUrl")
    private String productUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelatedSignName")
    private String relatedSignName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelatedSignOrderId")
    private String relatedSignOrderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelatedSignUsageName")
    private String relatedSignUsageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RmdTemplateId")
    private Long rmdTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateCode")
    private String templateCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateContent")
    private String templateContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateRule")
    private String templateRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserViewFileName")
    private String userViewFileName;

    private CreateSmsTemplateNewRequest(Builder builder) {
        super(builder);
        this.aiTemplate = builder.aiTemplate;
        this.aiTemplateUuid = builder.aiTemplateUuid;
        this.applicationSceneId = builder.applicationSceneId;
        this.applySource = builder.applySource;
        this.bizType = builder.bizType;
        this.intlType = builder.intlType;
        this.moreData = builder.moreData;
        this.orderId = builder.orderId;
        this.ossKeys = builder.ossKeys;
        this.ownerId = builder.ownerId;
        this.prodCode = builder.prodCode;
        this.productUrl = builder.productUrl;
        this.relatedSignName = builder.relatedSignName;
        this.relatedSignOrderId = builder.relatedSignOrderId;
        this.relatedSignUsageName = builder.relatedSignUsageName;
        this.remark = builder.remark;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.rmdTemplateId = builder.rmdTemplateId;
        this.templateCode = builder.templateCode;
        this.templateContent = builder.templateContent;
        this.templateName = builder.templateName;
        this.templateRule = builder.templateRule;
        this.userViewFileName = builder.userViewFileName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSmsTemplateNewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aiTemplate
     */
    public Long getAiTemplate() {
        return this.aiTemplate;
    }

    /**
     * @return aiTemplateUuid
     */
    public String getAiTemplateUuid() {
        return this.aiTemplateUuid;
    }

    /**
     * @return applicationSceneId
     */
    public Long getApplicationSceneId() {
        return this.applicationSceneId;
    }

    /**
     * @return applySource
     */
    public String getApplySource() {
        return this.applySource;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
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
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return ossKeys
     */
    public String getOssKeys() {
        return this.ossKeys;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return prodCode
     */
    public String getProdCode() {
        return this.prodCode;
    }

    /**
     * @return productUrl
     */
    public String getProductUrl() {
        return this.productUrl;
    }

    /**
     * @return relatedSignName
     */
    public String getRelatedSignName() {
        return this.relatedSignName;
    }

    /**
     * @return relatedSignOrderId
     */
    public String getRelatedSignOrderId() {
        return this.relatedSignOrderId;
    }

    /**
     * @return relatedSignUsageName
     */
    public String getRelatedSignUsageName() {
        return this.relatedSignUsageName;
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
     * @return rmdTemplateId
     */
    public Long getRmdTemplateId() {
        return this.rmdTemplateId;
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
     * @return userViewFileName
     */
    public String getUserViewFileName() {
        return this.userViewFileName;
    }

    public static final class Builder extends Request.Builder<CreateSmsTemplateNewRequest, Builder> {
        private Long aiTemplate; 
        private String aiTemplateUuid; 
        private Long applicationSceneId; 
        private String applySource; 
        private String bizType; 
        private Integer intlType; 
        private java.util.List<String> moreData; 
        private String orderId; 
        private String ossKeys; 
        private Long ownerId; 
        private String prodCode; 
        private String productUrl; 
        private String relatedSignName; 
        private String relatedSignOrderId; 
        private String relatedSignUsageName; 
        private String remark; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long rmdTemplateId; 
        private String templateCode; 
        private String templateContent; 
        private String templateName; 
        private String templateRule; 
        private String userViewFileName; 

        private Builder() {
            super();
        } 

        private Builder(CreateSmsTemplateNewRequest request) {
            super(request);
            this.aiTemplate = request.aiTemplate;
            this.aiTemplateUuid = request.aiTemplateUuid;
            this.applicationSceneId = request.applicationSceneId;
            this.applySource = request.applySource;
            this.bizType = request.bizType;
            this.intlType = request.intlType;
            this.moreData = request.moreData;
            this.orderId = request.orderId;
            this.ossKeys = request.ossKeys;
            this.ownerId = request.ownerId;
            this.prodCode = request.prodCode;
            this.productUrl = request.productUrl;
            this.relatedSignName = request.relatedSignName;
            this.relatedSignOrderId = request.relatedSignOrderId;
            this.relatedSignUsageName = request.relatedSignUsageName;
            this.remark = request.remark;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.rmdTemplateId = request.rmdTemplateId;
            this.templateCode = request.templateCode;
            this.templateContent = request.templateContent;
            this.templateName = request.templateName;
            this.templateRule = request.templateRule;
            this.userViewFileName = request.userViewFileName;
        } 

        /**
         * AiTemplate.
         */
        public Builder aiTemplate(Long aiTemplate) {
            this.putQueryParameter("AiTemplate", aiTemplate);
            this.aiTemplate = aiTemplate;
            return this;
        }

        /**
         * AiTemplateUuid.
         */
        public Builder aiTemplateUuid(String aiTemplateUuid) {
            this.putQueryParameter("AiTemplateUuid", aiTemplateUuid);
            this.aiTemplateUuid = aiTemplateUuid;
            return this;
        }

        /**
         * ApplicationSceneId.
         */
        public Builder applicationSceneId(Long applicationSceneId) {
            this.putQueryParameter("ApplicationSceneId", applicationSceneId);
            this.applicationSceneId = applicationSceneId;
            return this;
        }

        /**
         * ApplySource.
         */
        public Builder applySource(String applySource) {
            this.putQueryParameter("ApplySource", applySource);
            this.applySource = applySource;
            return this;
        }

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * IntlType.
         */
        public Builder intlType(Integer intlType) {
            this.putQueryParameter("IntlType", intlType);
            this.intlType = intlType;
            return this;
        }

        /**
         * MoreData.
         */
        public Builder moreData(java.util.List<String> moreData) {
            String moreDataShrink = shrink(moreData, "MoreData", "json");
            this.putQueryParameter("MoreData", moreDataShrink);
            this.moreData = moreData;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * OssKeys.
         */
        public Builder ossKeys(String ossKeys) {
            this.putQueryParameter("OssKeys", ossKeys);
            this.ossKeys = ossKeys;
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
         * ProdCode.
         */
        public Builder prodCode(String prodCode) {
            this.putQueryParameter("ProdCode", prodCode);
            this.prodCode = prodCode;
            return this;
        }

        /**
         * ProductUrl.
         */
        public Builder productUrl(String productUrl) {
            this.putQueryParameter("ProductUrl", productUrl);
            this.productUrl = productUrl;
            return this;
        }

        /**
         * RelatedSignName.
         */
        public Builder relatedSignName(String relatedSignName) {
            this.putQueryParameter("RelatedSignName", relatedSignName);
            this.relatedSignName = relatedSignName;
            return this;
        }

        /**
         * RelatedSignOrderId.
         */
        public Builder relatedSignOrderId(String relatedSignOrderId) {
            this.putQueryParameter("RelatedSignOrderId", relatedSignOrderId);
            this.relatedSignOrderId = relatedSignOrderId;
            return this;
        }

        /**
         * RelatedSignUsageName.
         */
        public Builder relatedSignUsageName(String relatedSignUsageName) {
            this.putQueryParameter("RelatedSignUsageName", relatedSignUsageName);
            this.relatedSignUsageName = relatedSignUsageName;
            return this;
        }

        /**
         * Remark.
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
         * RmdTemplateId.
         */
        public Builder rmdTemplateId(Long rmdTemplateId) {
            this.putQueryParameter("RmdTemplateId", rmdTemplateId);
            this.rmdTemplateId = rmdTemplateId;
            return this;
        }

        /**
         * TemplateCode.
         */
        public Builder templateCode(String templateCode) {
            this.putQueryParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        /**
         * TemplateContent.
         */
        public Builder templateContent(String templateContent) {
            this.putQueryParameter("TemplateContent", templateContent);
            this.templateContent = templateContent;
            return this;
        }

        /**
         * TemplateName.
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
         * UserViewFileName.
         */
        public Builder userViewFileName(String userViewFileName) {
            this.putQueryParameter("UserViewFileName", userViewFileName);
            this.userViewFileName = userViewFileName;
            return this;
        }

        @Override
        public CreateSmsTemplateNewRequest build() {
            return new CreateSmsTemplateNewRequest(this);
        } 

    } 

}
