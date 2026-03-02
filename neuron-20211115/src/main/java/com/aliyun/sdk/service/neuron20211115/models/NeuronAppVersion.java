// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link NeuronAppVersion} extends {@link TeaModel}
 *
 * <p>NeuronAppVersion</p>
 */
public class NeuronAppVersion extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("appEntry")
    private String appEntry;

    @com.aliyun.core.annotation.NameInMap("appId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appId;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("enterpriseId")
    private Long enterpriseId;

    @com.aliyun.core.annotation.NameInMap("envs")
    private java.util.List<String> envs;

    @com.aliyun.core.annotation.NameInMap("featureDesc")
    private java.util.List<NeuronAppInfoContent> featureDesc;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.NameInMap("imageUrls")
    private java.util.List<String> imageUrls;

    @com.aliyun.core.annotation.NameInMap("instructionUrl")
    private String instructionUrl;

    @com.aliyun.core.annotation.NameInMap("isLatest")
    private Integer isLatest;

    @com.aliyun.core.annotation.NameInMap("manageType")
    private String manageType;

    @com.aliyun.core.annotation.NameInMap("mobiCommitId")
    private String mobiCommitId;

    @com.aliyun.core.annotation.NameInMap("mobiId")
    private Long mobiId;

    @com.aliyun.core.annotation.NameInMap("mobiModuleId")
    private String mobiModuleId;

    @com.aliyun.core.annotation.NameInMap("mobiUrl")
    private String mobiUrl;

    @com.aliyun.core.annotation.NameInMap("pbcs")
    private java.util.List<Long> pbcs;

    @com.aliyun.core.annotation.NameInMap("privateInfo")
    private java.util.List<String> privateInfo;

    @com.aliyun.core.annotation.NameInMap("productId")
    private Long productId;

    @com.aliyun.core.annotation.NameInMap("scopes")
    private java.util.List<String> scopes;

    @com.aliyun.core.annotation.NameInMap("sidebar")
    private String sidebar;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("unbindEffect")
    private String unbindEffect;

    @com.aliyun.core.annotation.NameInMap("unbindReasons")
    private java.util.List<String> unbindReasons;

    @com.aliyun.core.annotation.NameInMap("updatedFeature")
    private java.util.List<NeuronAppInfoContent> updatedFeature;

    @com.aliyun.core.annotation.NameInMap("version")
    @com.aliyun.core.annotation.Validation(required = true)
    private String version;

    private NeuronAppVersion(Builder builder) {
        this.accountId = builder.accountId;
        this.appEntry = builder.appEntry;
        this.appId = builder.appId;
        this.description = builder.description;
        this.enterpriseId = builder.enterpriseId;
        this.envs = builder.envs;
        this.featureDesc = builder.featureDesc;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
        this.imageUrls = builder.imageUrls;
        this.instructionUrl = builder.instructionUrl;
        this.isLatest = builder.isLatest;
        this.manageType = builder.manageType;
        this.mobiCommitId = builder.mobiCommitId;
        this.mobiId = builder.mobiId;
        this.mobiModuleId = builder.mobiModuleId;
        this.mobiUrl = builder.mobiUrl;
        this.pbcs = builder.pbcs;
        this.privateInfo = builder.privateInfo;
        this.productId = builder.productId;
        this.scopes = builder.scopes;
        this.sidebar = builder.sidebar;
        this.status = builder.status;
        this.unbindEffect = builder.unbindEffect;
        this.unbindReasons = builder.unbindReasons;
        this.updatedFeature = builder.updatedFeature;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NeuronAppVersion create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return appEntry
     */
    public String getAppEntry() {
        return this.appEntry;
    }

    /**
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return envs
     */
    public java.util.List<String> getEnvs() {
        return this.envs;
    }

    /**
     * @return featureDesc
     */
    public java.util.List<NeuronAppInfoContent> getFeatureDesc() {
        return this.featureDesc;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return imageUrls
     */
    public java.util.List<String> getImageUrls() {
        return this.imageUrls;
    }

    /**
     * @return instructionUrl
     */
    public String getInstructionUrl() {
        return this.instructionUrl;
    }

    /**
     * @return isLatest
     */
    public Integer getIsLatest() {
        return this.isLatest;
    }

    /**
     * @return manageType
     */
    public String getManageType() {
        return this.manageType;
    }

    /**
     * @return mobiCommitId
     */
    public String getMobiCommitId() {
        return this.mobiCommitId;
    }

    /**
     * @return mobiId
     */
    public Long getMobiId() {
        return this.mobiId;
    }

    /**
     * @return mobiModuleId
     */
    public String getMobiModuleId() {
        return this.mobiModuleId;
    }

    /**
     * @return mobiUrl
     */
    public String getMobiUrl() {
        return this.mobiUrl;
    }

    /**
     * @return pbcs
     */
    public java.util.List<Long> getPbcs() {
        return this.pbcs;
    }

    /**
     * @return privateInfo
     */
    public java.util.List<String> getPrivateInfo() {
        return this.privateInfo;
    }

    /**
     * @return productId
     */
    public Long getProductId() {
        return this.productId;
    }

    /**
     * @return scopes
     */
    public java.util.List<String> getScopes() {
        return this.scopes;
    }

    /**
     * @return sidebar
     */
    public String getSidebar() {
        return this.sidebar;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return unbindEffect
     */
    public String getUnbindEffect() {
        return this.unbindEffect;
    }

    /**
     * @return unbindReasons
     */
    public java.util.List<String> getUnbindReasons() {
        return this.unbindReasons;
    }

    /**
     * @return updatedFeature
     */
    public java.util.List<NeuronAppInfoContent> getUpdatedFeature() {
        return this.updatedFeature;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String accountId; 
        private String appEntry; 
        private Long appId; 
        private String description; 
        private Long enterpriseId; 
        private java.util.List<String> envs; 
        private java.util.List<NeuronAppInfoContent> featureDesc; 
        private String gmtCreate; 
        private String gmtModified; 
        private Long id; 
        private java.util.List<String> imageUrls; 
        private String instructionUrl; 
        private Integer isLatest; 
        private String manageType; 
        private String mobiCommitId; 
        private Long mobiId; 
        private String mobiModuleId; 
        private String mobiUrl; 
        private java.util.List<Long> pbcs; 
        private java.util.List<String> privateInfo; 
        private Long productId; 
        private java.util.List<String> scopes; 
        private String sidebar; 
        private String status; 
        private String unbindEffect; 
        private java.util.List<String> unbindReasons; 
        private java.util.List<NeuronAppInfoContent> updatedFeature; 
        private String version; 

        private Builder() {
        } 

        private Builder(NeuronAppVersion model) {
            this.accountId = model.accountId;
            this.appEntry = model.appEntry;
            this.appId = model.appId;
            this.description = model.description;
            this.enterpriseId = model.enterpriseId;
            this.envs = model.envs;
            this.featureDesc = model.featureDesc;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.id = model.id;
            this.imageUrls = model.imageUrls;
            this.instructionUrl = model.instructionUrl;
            this.isLatest = model.isLatest;
            this.manageType = model.manageType;
            this.mobiCommitId = model.mobiCommitId;
            this.mobiId = model.mobiId;
            this.mobiModuleId = model.mobiModuleId;
            this.mobiUrl = model.mobiUrl;
            this.pbcs = model.pbcs;
            this.privateInfo = model.privateInfo;
            this.productId = model.productId;
            this.scopes = model.scopes;
            this.sidebar = model.sidebar;
            this.status = model.status;
            this.unbindEffect = model.unbindEffect;
            this.unbindReasons = model.unbindReasons;
            this.updatedFeature = model.updatedFeature;
            this.version = model.version;
        } 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * appEntry.
         */
        public Builder appEntry(String appEntry) {
            this.appEntry = appEntry;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder appId(Long appId) {
            this.appId = appId;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * enterpriseId.
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * envs.
         */
        public Builder envs(java.util.List<String> envs) {
            this.envs = envs;
            return this;
        }

        /**
         * featureDesc.
         */
        public Builder featureDesc(java.util.List<NeuronAppInfoContent> featureDesc) {
            this.featureDesc = featureDesc;
            return this;
        }

        /**
         * gmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * gmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * imageUrls.
         */
        public Builder imageUrls(java.util.List<String> imageUrls) {
            this.imageUrls = imageUrls;
            return this;
        }

        /**
         * instructionUrl.
         */
        public Builder instructionUrl(String instructionUrl) {
            this.instructionUrl = instructionUrl;
            return this;
        }

        /**
         * isLatest.
         */
        public Builder isLatest(Integer isLatest) {
            this.isLatest = isLatest;
            return this;
        }

        /**
         * manageType.
         */
        public Builder manageType(String manageType) {
            this.manageType = manageType;
            return this;
        }

        /**
         * mobiCommitId.
         */
        public Builder mobiCommitId(String mobiCommitId) {
            this.mobiCommitId = mobiCommitId;
            return this;
        }

        /**
         * mobiId.
         */
        public Builder mobiId(Long mobiId) {
            this.mobiId = mobiId;
            return this;
        }

        /**
         * mobiModuleId.
         */
        public Builder mobiModuleId(String mobiModuleId) {
            this.mobiModuleId = mobiModuleId;
            return this;
        }

        /**
         * mobiUrl.
         */
        public Builder mobiUrl(String mobiUrl) {
            this.mobiUrl = mobiUrl;
            return this;
        }

        /**
         * pbcs.
         */
        public Builder pbcs(java.util.List<Long> pbcs) {
            this.pbcs = pbcs;
            return this;
        }

        /**
         * privateInfo.
         */
        public Builder privateInfo(java.util.List<String> privateInfo) {
            this.privateInfo = privateInfo;
            return this;
        }

        /**
         * productId.
         */
        public Builder productId(Long productId) {
            this.productId = productId;
            return this;
        }

        /**
         * scopes.
         */
        public Builder scopes(java.util.List<String> scopes) {
            this.scopes = scopes;
            return this;
        }

        /**
         * sidebar.
         */
        public Builder sidebar(String sidebar) {
            this.sidebar = sidebar;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * unbindEffect.
         */
        public Builder unbindEffect(String unbindEffect) {
            this.unbindEffect = unbindEffect;
            return this;
        }

        /**
         * unbindReasons.
         */
        public Builder unbindReasons(java.util.List<String> unbindReasons) {
            this.unbindReasons = unbindReasons;
            return this;
        }

        /**
         * updatedFeature.
         */
        public Builder updatedFeature(java.util.List<NeuronAppInfoContent> updatedFeature) {
            this.updatedFeature = updatedFeature;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0.0</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public NeuronAppVersion build() {
            return new NeuronAppVersion(this);
        } 

    } 

}
