// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

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
 * {@link AddSmarttagTemplateRequest} extends {@link RequestModel}
 *
 * <p>AddSmarttagTemplateRequest</p>
 */
public class AddSmarttagTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnalyseTypes")
    @com.aliyun.core.annotation.Validation(required = true)
    private String analyseTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FaceCategoryIds")
    private String faceCategoryIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FaceCustomParamsConfig")
    private String faceCustomParamsConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Industry")
    @com.aliyun.core.annotation.Validation(required = true)
    private String industry;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsDefault")
    private Boolean isDefault;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeywordConfig")
    private String keywordConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KnowledgeConfig")
    private String knowledgeConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LabelCustomCategoryIds")
    private String labelCustomCategoryIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LabelCustomParamsConfig")
    private String labelCustomParamsConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LabelType")
    private String labelType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LabelVersion")
    private String labelVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LandmarkGroupIds")
    private String landmarkGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectGroupIds")
    private String objectGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scene")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scene;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateName;

    private AddSmarttagTemplateRequest(Builder builder) {
        super(builder);
        this.analyseTypes = builder.analyseTypes;
        this.faceCategoryIds = builder.faceCategoryIds;
        this.faceCustomParamsConfig = builder.faceCustomParamsConfig;
        this.industry = builder.industry;
        this.isDefault = builder.isDefault;
        this.keywordConfig = builder.keywordConfig;
        this.knowledgeConfig = builder.knowledgeConfig;
        this.labelCustomCategoryIds = builder.labelCustomCategoryIds;
        this.labelCustomParamsConfig = builder.labelCustomParamsConfig;
        this.labelType = builder.labelType;
        this.labelVersion = builder.labelVersion;
        this.landmarkGroupIds = builder.landmarkGroupIds;
        this.objectGroupIds = builder.objectGroupIds;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scene = builder.scene;
        this.templateName = builder.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddSmarttagTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return analyseTypes
     */
    public String getAnalyseTypes() {
        return this.analyseTypes;
    }

    /**
     * @return faceCategoryIds
     */
    public String getFaceCategoryIds() {
        return this.faceCategoryIds;
    }

    /**
     * @return faceCustomParamsConfig
     */
    public String getFaceCustomParamsConfig() {
        return this.faceCustomParamsConfig;
    }

    /**
     * @return industry
     */
    public String getIndustry() {
        return this.industry;
    }

    /**
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * @return keywordConfig
     */
    public String getKeywordConfig() {
        return this.keywordConfig;
    }

    /**
     * @return knowledgeConfig
     */
    public String getKnowledgeConfig() {
        return this.knowledgeConfig;
    }

    /**
     * @return labelCustomCategoryIds
     */
    public String getLabelCustomCategoryIds() {
        return this.labelCustomCategoryIds;
    }

    /**
     * @return labelCustomParamsConfig
     */
    public String getLabelCustomParamsConfig() {
        return this.labelCustomParamsConfig;
    }

    /**
     * @return labelType
     */
    public String getLabelType() {
        return this.labelType;
    }

    /**
     * @return labelVersion
     */
    public String getLabelVersion() {
        return this.labelVersion;
    }

    /**
     * @return landmarkGroupIds
     */
    public String getLandmarkGroupIds() {
        return this.landmarkGroupIds;
    }

    /**
     * @return objectGroupIds
     */
    public String getObjectGroupIds() {
        return this.objectGroupIds;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    public static final class Builder extends Request.Builder<AddSmarttagTemplateRequest, Builder> {
        private String analyseTypes; 
        private String faceCategoryIds; 
        private String faceCustomParamsConfig; 
        private String industry; 
        private Boolean isDefault; 
        private String keywordConfig; 
        private String knowledgeConfig; 
        private String labelCustomCategoryIds; 
        private String labelCustomParamsConfig; 
        private String labelType; 
        private String labelVersion; 
        private String landmarkGroupIds; 
        private String objectGroupIds; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String scene; 
        private String templateName; 

        private Builder() {
            super();
        } 

        private Builder(AddSmarttagTemplateRequest request) {
            super(request);
            this.analyseTypes = request.analyseTypes;
            this.faceCategoryIds = request.faceCategoryIds;
            this.faceCustomParamsConfig = request.faceCustomParamsConfig;
            this.industry = request.industry;
            this.isDefault = request.isDefault;
            this.keywordConfig = request.keywordConfig;
            this.knowledgeConfig = request.knowledgeConfig;
            this.labelCustomCategoryIds = request.labelCustomCategoryIds;
            this.labelCustomParamsConfig = request.labelCustomParamsConfig;
            this.labelType = request.labelType;
            this.labelVersion = request.labelVersion;
            this.landmarkGroupIds = request.landmarkGroupIds;
            this.objectGroupIds = request.objectGroupIds;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scene = request.scene;
            this.templateName = request.templateName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ocr</p>
         */
        public Builder analyseTypes(String analyseTypes) {
            this.putQueryParameter("AnalyseTypes", analyseTypes);
            this.analyseTypes = analyseTypes;
            return this;
        }

        /**
         * FaceCategoryIds.
         */
        public Builder faceCategoryIds(String faceCategoryIds) {
            this.putQueryParameter("FaceCategoryIds", faceCategoryIds);
            this.faceCategoryIds = faceCategoryIds;
            return this;
        }

        /**
         * FaceCustomParamsConfig.
         */
        public Builder faceCustomParamsConfig(String faceCustomParamsConfig) {
            this.putQueryParameter("FaceCustomParamsConfig", faceCustomParamsConfig);
            this.faceCustomParamsConfig = faceCustomParamsConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>common</p>
         */
        public Builder industry(String industry) {
            this.putQueryParameter("Industry", industry);
            this.industry = industry;
            return this;
        }

        /**
         * IsDefault.
         */
        public Builder isDefault(Boolean isDefault) {
            this.putQueryParameter("IsDefault", isDefault);
            this.isDefault = isDefault;
            return this;
        }

        /**
         * KeywordConfig.
         */
        public Builder keywordConfig(String keywordConfig) {
            this.putQueryParameter("KeywordConfig", keywordConfig);
            this.keywordConfig = keywordConfig;
            return this;
        }

        /**
         * KnowledgeConfig.
         */
        public Builder knowledgeConfig(String knowledgeConfig) {
            this.putQueryParameter("KnowledgeConfig", knowledgeConfig);
            this.knowledgeConfig = knowledgeConfig;
            return this;
        }

        /**
         * LabelCustomCategoryIds.
         */
        public Builder labelCustomCategoryIds(String labelCustomCategoryIds) {
            this.putQueryParameter("LabelCustomCategoryIds", labelCustomCategoryIds);
            this.labelCustomCategoryIds = labelCustomCategoryIds;
            return this;
        }

        /**
         * LabelCustomParamsConfig.
         */
        public Builder labelCustomParamsConfig(String labelCustomParamsConfig) {
            this.putQueryParameter("LabelCustomParamsConfig", labelCustomParamsConfig);
            this.labelCustomParamsConfig = labelCustomParamsConfig;
            return this;
        }

        /**
         * LabelType.
         */
        public Builder labelType(String labelType) {
            this.putQueryParameter("LabelType", labelType);
            this.labelType = labelType;
            return this;
        }

        /**
         * LabelVersion.
         */
        public Builder labelVersion(String labelVersion) {
            this.putQueryParameter("LabelVersion", labelVersion);
            this.labelVersion = labelVersion;
            return this;
        }

        /**
         * LandmarkGroupIds.
         */
        public Builder landmarkGroupIds(String landmarkGroupIds) {
            this.putQueryParameter("LandmarkGroupIds", landmarkGroupIds);
            this.landmarkGroupIds = landmarkGroupIds;
            return this;
        }

        /**
         * ObjectGroupIds.
         */
        public Builder objectGroupIds(String objectGroupIds) {
            this.putQueryParameter("ObjectGroupIds", objectGroupIds);
            this.objectGroupIds = objectGroupIds;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>search</p>
         */
        public Builder scene(String scene) {
            this.putQueryParameter("Scene", scene);
            this.scene = scene;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>template-example-****</p>
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        @Override
        public AddSmarttagTemplateRequest build() {
            return new AddSmarttagTemplateRequest(this);
        } 

    } 

}
