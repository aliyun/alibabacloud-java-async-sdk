// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link GrafanaWorkspaceVpcConfig} extends {@link TeaModel}
 *
 * <p>GrafanaWorkspaceVpcConfig</p>
 */
public class GrafanaWorkspaceVpcConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("fcConfig")
    private String fcConfig;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("installMsg")
    private String installMsg;

    @com.aliyun.core.annotation.NameInMap("installStatus")
    private String installStatus;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("securityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("vSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.NameInMap("vpcId")
    private String vpcId;

    private GrafanaWorkspaceVpcConfig(Builder builder) {
        this.fcConfig = builder.fcConfig;
        this.id = builder.id;
        this.installMsg = builder.installMsg;
        this.installStatus = builder.installStatus;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.securityGroupId = builder.securityGroupId;
        this.userId = builder.userId;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrafanaWorkspaceVpcConfig create() {
        return builder().build();
    }

    /**
     * @return fcConfig
     */
    public String getFcConfig() {
        return this.fcConfig;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return installMsg
     */
    public String getInstallMsg() {
        return this.installMsg;
    }

    /**
     * @return installStatus
     */
    public String getInstallStatus() {
        return this.installStatus;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder {
        private String fcConfig; 
        private Long id; 
        private String installMsg; 
        private String installStatus; 
        private String name; 
        private String regionId; 
        private String securityGroupId; 
        private String userId; 
        private String vSwitchId; 
        private String vpcId; 

        /**
         * fcConfig.
         */
        public Builder fcConfig(String fcConfig) {
            this.fcConfig = fcConfig;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * installMsg.
         */
        public Builder installMsg(String installMsg) {
            this.installMsg = installMsg;
            return this;
        }

        /**
         * installStatus.
         */
        public Builder installStatus(String installStatus) {
            this.installStatus = installStatus;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
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
         * securityGroupId.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * vSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * vpcId.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public GrafanaWorkspaceVpcConfig build() {
            return new GrafanaWorkspaceVpcConfig(this);
        } 

    } 

}
