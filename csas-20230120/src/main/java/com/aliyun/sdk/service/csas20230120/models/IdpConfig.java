// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link IdpConfig} extends {@link TeaModel}
 *
 * <p>IdpConfig</p>
 */
public class IdpConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AttrMapConfig")
    private IdpAttrMapConfig attrMapConfig;

    @com.aliyun.core.annotation.NameInMap("ConnectConfig")
    private IdpConnectConfig connectConfig;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DingtalkConfig")
    private IdpDingtalkSubConfig dingtalkConfig;

    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("FeishuConfig")
    private IdpFeishuSubConfig feishuConfig;

    @com.aliyun.core.annotation.NameInMap("IdaasConfig")
    private IdpIdaas2SubConfig idaasConfig;

    @com.aliyun.core.annotation.NameInMap("IdpConfigId")
    private String idpConfigId;

    @com.aliyun.core.annotation.NameInMap("IdpId")
    private Long idpId;

    @com.aliyun.core.annotation.NameInMap("LastSyncTimeUnix")
    private Long lastSyncTimeUnix;

    @com.aliyun.core.annotation.NameInMap("LdapConfig")
    private IdpLdapSubConfig ldapConfig;

    @com.aliyun.core.annotation.NameInMap("LoginConfig")
    private IdpLoginConfig loginConfig;

    @com.aliyun.core.annotation.NameInMap("LogoDirectory")
    private String logoDirectory;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("SyncConfig")
    private IdpSyncConfig syncConfig;

    @com.aliyun.core.annotation.NameInMap("SyncStatus")
    private String syncStatus;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("WeixinConfig")
    private IdpWeixin2SubConfig weixinConfig;

    @com.aliyun.core.annotation.NameInMap("WuyingConfig")
    private OpenStructIdpWuyingSubConfig wuyingConfig;

    private IdpConfig(Builder builder) {
        this.attrMapConfig = builder.attrMapConfig;
        this.connectConfig = builder.connectConfig;
        this.description = builder.description;
        this.dingtalkConfig = builder.dingtalkConfig;
        this.enabled = builder.enabled;
        this.feishuConfig = builder.feishuConfig;
        this.idaasConfig = builder.idaasConfig;
        this.idpConfigId = builder.idpConfigId;
        this.idpId = builder.idpId;
        this.lastSyncTimeUnix = builder.lastSyncTimeUnix;
        this.ldapConfig = builder.ldapConfig;
        this.loginConfig = builder.loginConfig;
        this.logoDirectory = builder.logoDirectory;
        this.name = builder.name;
        this.syncConfig = builder.syncConfig;
        this.syncStatus = builder.syncStatus;
        this.type = builder.type;
        this.weixinConfig = builder.weixinConfig;
        this.wuyingConfig = builder.wuyingConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IdpConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attrMapConfig
     */
    public IdpAttrMapConfig getAttrMapConfig() {
        return this.attrMapConfig;
    }

    /**
     * @return connectConfig
     */
    public IdpConnectConfig getConnectConfig() {
        return this.connectConfig;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dingtalkConfig
     */
    public IdpDingtalkSubConfig getDingtalkConfig() {
        return this.dingtalkConfig;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return feishuConfig
     */
    public IdpFeishuSubConfig getFeishuConfig() {
        return this.feishuConfig;
    }

    /**
     * @return idaasConfig
     */
    public IdpIdaas2SubConfig getIdaasConfig() {
        return this.idaasConfig;
    }

    /**
     * @return idpConfigId
     */
    public String getIdpConfigId() {
        return this.idpConfigId;
    }

    /**
     * @return idpId
     */
    public Long getIdpId() {
        return this.idpId;
    }

    /**
     * @return lastSyncTimeUnix
     */
    public Long getLastSyncTimeUnix() {
        return this.lastSyncTimeUnix;
    }

    /**
     * @return ldapConfig
     */
    public IdpLdapSubConfig getLdapConfig() {
        return this.ldapConfig;
    }

    /**
     * @return loginConfig
     */
    public IdpLoginConfig getLoginConfig() {
        return this.loginConfig;
    }

    /**
     * @return logoDirectory
     */
    public String getLogoDirectory() {
        return this.logoDirectory;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return syncConfig
     */
    public IdpSyncConfig getSyncConfig() {
        return this.syncConfig;
    }

    /**
     * @return syncStatus
     */
    public String getSyncStatus() {
        return this.syncStatus;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return weixinConfig
     */
    public IdpWeixin2SubConfig getWeixinConfig() {
        return this.weixinConfig;
    }

    /**
     * @return wuyingConfig
     */
    public OpenStructIdpWuyingSubConfig getWuyingConfig() {
        return this.wuyingConfig;
    }

    public static final class Builder {
        private IdpAttrMapConfig attrMapConfig; 
        private IdpConnectConfig connectConfig; 
        private String description; 
        private IdpDingtalkSubConfig dingtalkConfig; 
        private Boolean enabled; 
        private IdpFeishuSubConfig feishuConfig; 
        private IdpIdaas2SubConfig idaasConfig; 
        private String idpConfigId; 
        private Long idpId; 
        private Long lastSyncTimeUnix; 
        private IdpLdapSubConfig ldapConfig; 
        private IdpLoginConfig loginConfig; 
        private String logoDirectory; 
        private String name; 
        private IdpSyncConfig syncConfig; 
        private String syncStatus; 
        private String type; 
        private IdpWeixin2SubConfig weixinConfig; 
        private OpenStructIdpWuyingSubConfig wuyingConfig; 

        private Builder() {
        } 

        private Builder(IdpConfig model) {
            this.attrMapConfig = model.attrMapConfig;
            this.connectConfig = model.connectConfig;
            this.description = model.description;
            this.dingtalkConfig = model.dingtalkConfig;
            this.enabled = model.enabled;
            this.feishuConfig = model.feishuConfig;
            this.idaasConfig = model.idaasConfig;
            this.idpConfigId = model.idpConfigId;
            this.idpId = model.idpId;
            this.lastSyncTimeUnix = model.lastSyncTimeUnix;
            this.ldapConfig = model.ldapConfig;
            this.loginConfig = model.loginConfig;
            this.logoDirectory = model.logoDirectory;
            this.name = model.name;
            this.syncConfig = model.syncConfig;
            this.syncStatus = model.syncStatus;
            this.type = model.type;
            this.weixinConfig = model.weixinConfig;
            this.wuyingConfig = model.wuyingConfig;
        } 

        /**
         * AttrMapConfig.
         */
        public Builder attrMapConfig(IdpAttrMapConfig attrMapConfig) {
            this.attrMapConfig = attrMapConfig;
            return this;
        }

        /**
         * ConnectConfig.
         */
        public Builder connectConfig(IdpConnectConfig connectConfig) {
            this.connectConfig = connectConfig;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * DingtalkConfig.
         */
        public Builder dingtalkConfig(IdpDingtalkSubConfig dingtalkConfig) {
            this.dingtalkConfig = dingtalkConfig;
            return this;
        }

        /**
         * Enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * FeishuConfig.
         */
        public Builder feishuConfig(IdpFeishuSubConfig feishuConfig) {
            this.feishuConfig = feishuConfig;
            return this;
        }

        /**
         * IdaasConfig.
         */
        public Builder idaasConfig(IdpIdaas2SubConfig idaasConfig) {
            this.idaasConfig = idaasConfig;
            return this;
        }

        /**
         * IdpConfigId.
         */
        public Builder idpConfigId(String idpConfigId) {
            this.idpConfigId = idpConfigId;
            return this;
        }

        /**
         * IdpId.
         */
        public Builder idpId(Long idpId) {
            this.idpId = idpId;
            return this;
        }

        /**
         * LastSyncTimeUnix.
         */
        public Builder lastSyncTimeUnix(Long lastSyncTimeUnix) {
            this.lastSyncTimeUnix = lastSyncTimeUnix;
            return this;
        }

        /**
         * LdapConfig.
         */
        public Builder ldapConfig(IdpLdapSubConfig ldapConfig) {
            this.ldapConfig = ldapConfig;
            return this;
        }

        /**
         * LoginConfig.
         */
        public Builder loginConfig(IdpLoginConfig loginConfig) {
            this.loginConfig = loginConfig;
            return this;
        }

        /**
         * LogoDirectory.
         */
        public Builder logoDirectory(String logoDirectory) {
            this.logoDirectory = logoDirectory;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * SyncConfig.
         */
        public Builder syncConfig(IdpSyncConfig syncConfig) {
            this.syncConfig = syncConfig;
            return this;
        }

        /**
         * SyncStatus.
         */
        public Builder syncStatus(String syncStatus) {
            this.syncStatus = syncStatus;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * WeixinConfig.
         */
        public Builder weixinConfig(IdpWeixin2SubConfig weixinConfig) {
            this.weixinConfig = weixinConfig;
            return this;
        }

        /**
         * WuyingConfig.
         */
        public Builder wuyingConfig(OpenStructIdpWuyingSubConfig wuyingConfig) {
            this.wuyingConfig = wuyingConfig;
            return this;
        }

        public IdpConfig build() {
            return new IdpConfig(this);
        } 

    } 

}
