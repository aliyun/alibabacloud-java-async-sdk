// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddSmarttagTemplateRequest} extends {@link RequestModel}
 *
 * <p>AddSmarttagTemplateRequest</p>
 */
public class AddSmarttagTemplateRequest extends Request {
    @Query
    @NameInMap("AnalyseTypes")
    @Validation(required = true)
    private String analyseTypes;

    @Query
    @NameInMap("FaceCategoryIds")
    private String faceCategoryIds;

    @Query
    @NameInMap("FaceCustomParamsConfig")
    private String faceCustomParamsConfig;

    @Query
    @NameInMap("Industry")
    @Validation(required = true)
    private String industry;

    @Query
    @NameInMap("IsDefault")
    private Boolean isDefault;

    @Query
    @NameInMap("KeywordConfig")
    private String keywordConfig;

    @Query
    @NameInMap("KnowledgeConfig")
    private String knowledgeConfig;

    @Query
    @NameInMap("LabelType")
    private String labelType;

    @Query
    @NameInMap("LabelVersion")
    private String labelVersion;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Scene")
    @Validation(required = true)
    private String scene;

    @Query
    @NameInMap("TemplateName")
    @Validation(required = true)
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
        this.labelType = builder.labelType;
        this.labelVersion = builder.labelVersion;
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
        private String labelType; 
        private String labelVersion; 
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
            this.labelType = request.labelType;
            this.labelVersion = request.labelVersion;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scene = request.scene;
            this.templateName = request.templateName;
        } 

        /**
         * AnalyseTypes.
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
         * Industry.
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
         * Scene.
         */
        public Builder scene(String scene) {
            this.putQueryParameter("Scene", scene);
            this.scene = scene;
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

        @Override
        public AddSmarttagTemplateRequest build() {
            return new AddSmarttagTemplateRequest(this);
        } 

    } 

}
