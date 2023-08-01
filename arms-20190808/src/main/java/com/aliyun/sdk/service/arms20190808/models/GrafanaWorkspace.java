// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrafanaWorkspace} extends {@link TeaModel}
 *
 * <p>GrafanaWorkspace</p>
 */
public class GrafanaWorkspace extends TeaModel {
    @NameInMap("commercial")
    private Boolean commercial;

    @NameInMap("deployType")
    private String deployType;

    @NameInMap("description")
    private String description;

    @NameInMap("endTime")
    private Float endTime;

    @NameInMap("gmtCreate")
    private Float gmtCreate;

    @NameInMap("grafanaVersion")
    private String grafanaVersion;

    @NameInMap("grafanaWorkspaceDomain")
    private String grafanaWorkspaceDomain;

    @NameInMap("grafanaWorkspaceEdition")
    private String grafanaWorkspaceEdition;

    @NameInMap("grafanaWorkspaceId")
    private String grafanaWorkspaceId;

    @NameInMap("grafanaWorkspaceIp")
    private String grafanaWorkspaceIp;

    @NameInMap("grafanaWorkspaceName")
    private String grafanaWorkspaceName;

    @NameInMap("maxAccount")
    private String maxAccount;

    @NameInMap("ntmId")
    private String ntmId;

    @NameInMap("personalDomain")
    private String personalDomain;

    @NameInMap("personalDomainPrefix")
    private String personalDomainPrefix;

    @NameInMap("privateDomain")
    private String privateDomain;

    @NameInMap("privateIp")
    private String privateIp;

    @NameInMap("protocol")
    private String protocol;

    @NameInMap("regionId")
    private String regionId;

    @NameInMap("resourceGroupId")
    private String resourceGroupId;

    @NameInMap("shareSynced")
    private Boolean shareSynced;

    @NameInMap("snatIp")
    private String snatIp;

    @NameInMap("status")
    private String status;

    @NameInMap("tags")
    private java.util.List < Tags> tags;

    @NameInMap("upgradeVersion")
    private java.util.List < String > upgradeVersion;

    @NameInMap("userId")
    private String userId;

    private GrafanaWorkspace(Builder builder) {
        this.commercial = builder.commercial;
        this.deployType = builder.deployType;
        this.description = builder.description;
        this.endTime = builder.endTime;
        this.gmtCreate = builder.gmtCreate;
        this.grafanaVersion = builder.grafanaVersion;
        this.grafanaWorkspaceDomain = builder.grafanaWorkspaceDomain;
        this.grafanaWorkspaceEdition = builder.grafanaWorkspaceEdition;
        this.grafanaWorkspaceId = builder.grafanaWorkspaceId;
        this.grafanaWorkspaceIp = builder.grafanaWorkspaceIp;
        this.grafanaWorkspaceName = builder.grafanaWorkspaceName;
        this.maxAccount = builder.maxAccount;
        this.ntmId = builder.ntmId;
        this.personalDomain = builder.personalDomain;
        this.personalDomainPrefix = builder.personalDomainPrefix;
        this.privateDomain = builder.privateDomain;
        this.privateIp = builder.privateIp;
        this.protocol = builder.protocol;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.shareSynced = builder.shareSynced;
        this.snatIp = builder.snatIp;
        this.status = builder.status;
        this.tags = builder.tags;
        this.upgradeVersion = builder.upgradeVersion;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrafanaWorkspace create() {
        return builder().build();
    }

    /**
     * @return commercial
     */
    public Boolean getCommercial() {
        return this.commercial;
    }

    /**
     * @return deployType
     */
    public String getDeployType() {
        return this.deployType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return endTime
     */
    public Float getEndTime() {
        return this.endTime;
    }

    /**
     * @return gmtCreate
     */
    public Float getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return grafanaVersion
     */
    public String getGrafanaVersion() {
        return this.grafanaVersion;
    }

    /**
     * @return grafanaWorkspaceDomain
     */
    public String getGrafanaWorkspaceDomain() {
        return this.grafanaWorkspaceDomain;
    }

    /**
     * @return grafanaWorkspaceEdition
     */
    public String getGrafanaWorkspaceEdition() {
        return this.grafanaWorkspaceEdition;
    }

    /**
     * @return grafanaWorkspaceId
     */
    public String getGrafanaWorkspaceId() {
        return this.grafanaWorkspaceId;
    }

    /**
     * @return grafanaWorkspaceIp
     */
    public String getGrafanaWorkspaceIp() {
        return this.grafanaWorkspaceIp;
    }

    /**
     * @return grafanaWorkspaceName
     */
    public String getGrafanaWorkspaceName() {
        return this.grafanaWorkspaceName;
    }

    /**
     * @return maxAccount
     */
    public String getMaxAccount() {
        return this.maxAccount;
    }

    /**
     * @return ntmId
     */
    public String getNtmId() {
        return this.ntmId;
    }

    /**
     * @return personalDomain
     */
    public String getPersonalDomain() {
        return this.personalDomain;
    }

    /**
     * @return personalDomainPrefix
     */
    public String getPersonalDomainPrefix() {
        return this.personalDomainPrefix;
    }

    /**
     * @return privateDomain
     */
    public String getPrivateDomain() {
        return this.privateDomain;
    }

    /**
     * @return privateIp
     */
    public String getPrivateIp() {
        return this.privateIp;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return shareSynced
     */
    public Boolean getShareSynced() {
        return this.shareSynced;
    }

    /**
     * @return snatIp
     */
    public String getSnatIp() {
        return this.snatIp;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    /**
     * @return upgradeVersion
     */
    public java.util.List < String > getUpgradeVersion() {
        return this.upgradeVersion;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private Boolean commercial; 
        private String deployType; 
        private String description; 
        private Float endTime; 
        private Float gmtCreate; 
        private String grafanaVersion; 
        private String grafanaWorkspaceDomain; 
        private String grafanaWorkspaceEdition; 
        private String grafanaWorkspaceId; 
        private String grafanaWorkspaceIp; 
        private String grafanaWorkspaceName; 
        private String maxAccount; 
        private String ntmId; 
        private String personalDomain; 
        private String personalDomainPrefix; 
        private String privateDomain; 
        private String privateIp; 
        private String protocol; 
        private String regionId; 
        private String resourceGroupId; 
        private Boolean shareSynced; 
        private String snatIp; 
        private String status; 
        private java.util.List < Tags> tags; 
        private java.util.List < String > upgradeVersion; 
        private String userId; 

        /**
         * commercial.
         */
        public Builder commercial(Boolean commercial) {
            this.commercial = commercial;
            return this;
        }

        /**
         * deployType.
         */
        public Builder deployType(String deployType) {
            this.deployType = deployType;
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
         * endTime.
         */
        public Builder endTime(Float endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * gmtCreate.
         */
        public Builder gmtCreate(Float gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * grafanaVersion.
         */
        public Builder grafanaVersion(String grafanaVersion) {
            this.grafanaVersion = grafanaVersion;
            return this;
        }

        /**
         * grafanaWorkspaceDomain.
         */
        public Builder grafanaWorkspaceDomain(String grafanaWorkspaceDomain) {
            this.grafanaWorkspaceDomain = grafanaWorkspaceDomain;
            return this;
        }

        /**
         * grafanaWorkspaceEdition.
         */
        public Builder grafanaWorkspaceEdition(String grafanaWorkspaceEdition) {
            this.grafanaWorkspaceEdition = grafanaWorkspaceEdition;
            return this;
        }

        /**
         * grafanaWorkspaceId.
         */
        public Builder grafanaWorkspaceId(String grafanaWorkspaceId) {
            this.grafanaWorkspaceId = grafanaWorkspaceId;
            return this;
        }

        /**
         * grafanaWorkspaceIp.
         */
        public Builder grafanaWorkspaceIp(String grafanaWorkspaceIp) {
            this.grafanaWorkspaceIp = grafanaWorkspaceIp;
            return this;
        }

        /**
         * grafanaWorkspaceName.
         */
        public Builder grafanaWorkspaceName(String grafanaWorkspaceName) {
            this.grafanaWorkspaceName = grafanaWorkspaceName;
            return this;
        }

        /**
         * maxAccount.
         */
        public Builder maxAccount(String maxAccount) {
            this.maxAccount = maxAccount;
            return this;
        }

        /**
         * ntmId.
         */
        public Builder ntmId(String ntmId) {
            this.ntmId = ntmId;
            return this;
        }

        /**
         * personalDomain.
         */
        public Builder personalDomain(String personalDomain) {
            this.personalDomain = personalDomain;
            return this;
        }

        /**
         * personalDomainPrefix.
         */
        public Builder personalDomainPrefix(String personalDomainPrefix) {
            this.personalDomainPrefix = personalDomainPrefix;
            return this;
        }

        /**
         * privateDomain.
         */
        public Builder privateDomain(String privateDomain) {
            this.privateDomain = privateDomain;
            return this;
        }

        /**
         * privateIp.
         */
        public Builder privateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }

        /**
         * protocol.
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * resourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * shareSynced.
         */
        public Builder shareSynced(Boolean shareSynced) {
            this.shareSynced = shareSynced;
            return this;
        }

        /**
         * snatIp.
         */
        public Builder snatIp(String snatIp) {
            this.snatIp = snatIp;
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
         * tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * upgradeVersion.
         */
        public Builder upgradeVersion(java.util.List < String > upgradeVersion) {
            this.upgradeVersion = upgradeVersion;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public GrafanaWorkspace build() {
            return new GrafanaWorkspace(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("key")
        private String key;

        @NameInMap("value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
