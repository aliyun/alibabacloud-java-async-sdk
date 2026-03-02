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
 * {@link NeuronAppVersionDetail} extends {@link TeaModel}
 *
 * <p>NeuronAppVersionDetail</p>
 */
public class NeuronAppVersionDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("appDesc")
    private String appDesc;

    @com.aliyun.core.annotation.NameInMap("appEntry")
    private String appEntry;

    @com.aliyun.core.annotation.NameInMap("appId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appId;

    @com.aliyun.core.annotation.NameInMap("appName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.NameInMap("enterpriseId")
    private Long enterpriseId;

    @com.aliyun.core.annotation.NameInMap("envs")
    private java.util.List<String> envs;

    @com.aliyun.core.annotation.NameInMap("featureDesc")
    private java.util.List<NeuronAppInfoContent> featureDesc;

    @com.aliyun.core.annotation.NameInMap("iconUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String iconUrl;

    @com.aliyun.core.annotation.NameInMap("imageUrls")
    private java.util.List<String> imageUrls;

    @com.aliyun.core.annotation.NameInMap("instructionUrl")
    private String instructionUrl;

    @com.aliyun.core.annotation.NameInMap("manageType")
    private String manageType;

    @com.aliyun.core.annotation.NameInMap("mobiId")
    private Long mobiId;

    @com.aliyun.core.annotation.NameInMap("owner")
    @com.aliyun.core.annotation.Validation(required = true)
    private String owner;

    @com.aliyun.core.annotation.NameInMap("pbcs")
    private java.util.List<Long> pbcs;

    @com.aliyun.core.annotation.NameInMap("pluginList")
    private java.util.List<AppPluginInfo> pluginList;

    @com.aliyun.core.annotation.NameInMap("privateInfo")
    private java.util.List<String> privateInfo;

    @com.aliyun.core.annotation.NameInMap("productId")
    private Long productId;

    @com.aliyun.core.annotation.NameInMap("scopes")
    private java.util.List<String> scopes;

    @com.aliyun.core.annotation.NameInMap("sidebar")
    private String sidebar;

    @com.aliyun.core.annotation.NameInMap("unbindEffect")
    private String unbindEffect;

    @com.aliyun.core.annotation.NameInMap("unbindReasons")
    private java.util.List<String> unbindReasons;

    @com.aliyun.core.annotation.NameInMap("updatedFeature")
    private java.util.List<NeuronAppInfoContent> updatedFeature;

    @com.aliyun.core.annotation.NameInMap("version")
    @com.aliyun.core.annotation.Validation(required = true)
    private String version;

    @com.aliyun.core.annotation.NameInMap("versionId")
    private Long versionId;

    private NeuronAppVersionDetail(Builder builder) {
        this.appDesc = builder.appDesc;
        this.appEntry = builder.appEntry;
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.enterpriseId = builder.enterpriseId;
        this.envs = builder.envs;
        this.featureDesc = builder.featureDesc;
        this.iconUrl = builder.iconUrl;
        this.imageUrls = builder.imageUrls;
        this.instructionUrl = builder.instructionUrl;
        this.manageType = builder.manageType;
        this.mobiId = builder.mobiId;
        this.owner = builder.owner;
        this.pbcs = builder.pbcs;
        this.pluginList = builder.pluginList;
        this.privateInfo = builder.privateInfo;
        this.productId = builder.productId;
        this.scopes = builder.scopes;
        this.sidebar = builder.sidebar;
        this.unbindEffect = builder.unbindEffect;
        this.unbindReasons = builder.unbindReasons;
        this.updatedFeature = builder.updatedFeature;
        this.version = builder.version;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NeuronAppVersionDetail create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appDesc
     */
    public String getAppDesc() {
        return this.appDesc;
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
     * @return appName
     */
    public String getAppName() {
        return this.appName;
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
     * @return iconUrl
     */
    public String getIconUrl() {
        return this.iconUrl;
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
     * @return manageType
     */
    public String getManageType() {
        return this.manageType;
    }

    /**
     * @return mobiId
     */
    public Long getMobiId() {
        return this.mobiId;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return pbcs
     */
    public java.util.List<Long> getPbcs() {
        return this.pbcs;
    }

    /**
     * @return pluginList
     */
    public java.util.List<AppPluginInfo> getPluginList() {
        return this.pluginList;
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

    /**
     * @return versionId
     */
    public Long getVersionId() {
        return this.versionId;
    }

    public static final class Builder {
        private String appDesc; 
        private String appEntry; 
        private Long appId; 
        private String appName; 
        private Long enterpriseId; 
        private java.util.List<String> envs; 
        private java.util.List<NeuronAppInfoContent> featureDesc; 
        private String iconUrl; 
        private java.util.List<String> imageUrls; 
        private String instructionUrl; 
        private String manageType; 
        private Long mobiId; 
        private String owner; 
        private java.util.List<Long> pbcs; 
        private java.util.List<AppPluginInfo> pluginList; 
        private java.util.List<String> privateInfo; 
        private Long productId; 
        private java.util.List<String> scopes; 
        private String sidebar; 
        private String unbindEffect; 
        private java.util.List<String> unbindReasons; 
        private java.util.List<NeuronAppInfoContent> updatedFeature; 
        private String version; 
        private Long versionId; 

        private Builder() {
        } 

        private Builder(NeuronAppVersionDetail model) {
            this.appDesc = model.appDesc;
            this.appEntry = model.appEntry;
            this.appId = model.appId;
            this.appName = model.appName;
            this.enterpriseId = model.enterpriseId;
            this.envs = model.envs;
            this.featureDesc = model.featureDesc;
            this.iconUrl = model.iconUrl;
            this.imageUrls = model.imageUrls;
            this.instructionUrl = model.instructionUrl;
            this.manageType = model.manageType;
            this.mobiId = model.mobiId;
            this.owner = model.owner;
            this.pbcs = model.pbcs;
            this.pluginList = model.pluginList;
            this.privateInfo = model.privateInfo;
            this.productId = model.productId;
            this.scopes = model.scopes;
            this.sidebar = model.sidebar;
            this.unbindEffect = model.unbindEffect;
            this.unbindReasons = model.unbindReasons;
            this.updatedFeature = model.updatedFeature;
            this.version = model.version;
            this.versionId = model.versionId;
        } 

        /**
         * appDesc.
         */
        public Builder appDesc(String appDesc) {
            this.appDesc = appDesc;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>order</p>
         */
        public Builder appName(String appName) {
            this.appName = appName;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://wwww.ali.com">http://wwww.ali.com</a></p>
         */
        public Builder iconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
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
         * manageType.
         */
        public Builder manageType(String manageType) {
            this.manageType = manageType;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>多端商城</p>
         */
        public Builder owner(String owner) {
            this.owner = owner;
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
         * pluginList.
         */
        public Builder pluginList(java.util.List<AppPluginInfo> pluginList) {
            this.pluginList = pluginList;
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

        /**
         * versionId.
         */
        public Builder versionId(Long versionId) {
            this.versionId = versionId;
            return this;
        }

        public NeuronAppVersionDetail build() {
            return new NeuronAppVersionDetail(this);
        } 

    } 

}
