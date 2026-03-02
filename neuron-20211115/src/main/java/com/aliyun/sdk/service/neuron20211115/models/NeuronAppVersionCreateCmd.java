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
 * {@link NeuronAppVersionCreateCmd} extends {@link TeaModel}
 *
 * <p>NeuronAppVersionCreateCmd</p>
 */
public class NeuronAppVersionCreateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("appEntry")
    private String appEntry;

    @com.aliyun.core.annotation.NameInMap("appId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appId;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("envs")
    private java.util.List<String> envs;

    @com.aliyun.core.annotation.NameInMap("featureDesc")
    private java.util.List<NeuronAppInfoContent> featureDesc;

    @com.aliyun.core.annotation.NameInMap("imageUrls")
    private java.util.List<String> imageUrls;

    @com.aliyun.core.annotation.NameInMap("instructionUrl")
    private String instructionUrl;

    @com.aliyun.core.annotation.NameInMap("manageType")
    private String manageType;

    @com.aliyun.core.annotation.NameInMap("mobiId")
    private Long mobiId;

    @com.aliyun.core.annotation.NameInMap("pbcs")
    private java.util.List<Long> pbcs;

    @com.aliyun.core.annotation.NameInMap("pluginList")
    private java.util.List<AppPluginInfo> pluginList;

    @com.aliyun.core.annotation.NameInMap("privateInfo")
    private java.util.List<String> privateInfo;

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

    private NeuronAppVersionCreateCmd(Builder builder) {
        this.accountId = builder.accountId;
        this.appEntry = builder.appEntry;
        this.appId = builder.appId;
        this.description = builder.description;
        this.envs = builder.envs;
        this.featureDesc = builder.featureDesc;
        this.imageUrls = builder.imageUrls;
        this.instructionUrl = builder.instructionUrl;
        this.manageType = builder.manageType;
        this.mobiId = builder.mobiId;
        this.pbcs = builder.pbcs;
        this.pluginList = builder.pluginList;
        this.privateInfo = builder.privateInfo;
        this.scopes = builder.scopes;
        this.sidebar = builder.sidebar;
        this.unbindEffect = builder.unbindEffect;
        this.unbindReasons = builder.unbindReasons;
        this.updatedFeature = builder.updatedFeature;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NeuronAppVersionCreateCmd create() {
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

    public static final class Builder {
        private String accountId; 
        private String appEntry; 
        private Long appId; 
        private String description; 
        private java.util.List<String> envs; 
        private java.util.List<NeuronAppInfoContent> featureDesc; 
        private java.util.List<String> imageUrls; 
        private String instructionUrl; 
        private String manageType; 
        private Long mobiId; 
        private java.util.List<Long> pbcs; 
        private java.util.List<AppPluginInfo> pluginList; 
        private java.util.List<String> privateInfo; 
        private java.util.List<String> scopes; 
        private String sidebar; 
        private String unbindEffect; 
        private java.util.List<String> unbindReasons; 
        private java.util.List<NeuronAppInfoContent> updatedFeature; 
        private String version; 

        private Builder() {
        } 

        private Builder(NeuronAppVersionCreateCmd model) {
            this.accountId = model.accountId;
            this.appEntry = model.appEntry;
            this.appId = model.appId;
            this.description = model.description;
            this.envs = model.envs;
            this.featureDesc = model.featureDesc;
            this.imageUrls = model.imageUrls;
            this.instructionUrl = model.instructionUrl;
            this.manageType = model.manageType;
            this.mobiId = model.mobiId;
            this.pbcs = model.pbcs;
            this.pluginList = model.pluginList;
            this.privateInfo = model.privateInfo;
            this.scopes = model.scopes;
            this.sidebar = model.sidebar;
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

        public NeuronAppVersionCreateCmd build() {
            return new NeuronAppVersionCreateCmd(this);
        } 

    } 

}
