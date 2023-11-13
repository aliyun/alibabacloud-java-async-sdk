// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link NodeAttributes} extends {@link TeaModel}
 *
 * <p>NodeAttributes</p>
 */
public class NodeAttributes extends TeaModel {
    @NameInMap("KeyPairName")
    private String keyPairName;

    @NameInMap("MasterRootPassword")
    private String masterRootPassword;

    @NameInMap("RamRole")
    private String ramRole;

    @NameInMap("SecurityGroupId")
    @Validation(required = true)
    private String securityGroupId;

    @NameInMap("VpcId")
    @Validation(required = true)
    private String vpcId;

    @NameInMap("ZoneId")
    @Validation(required = true)
    private String zoneId;

    private NodeAttributes(Builder builder) {
        this.keyPairName = builder.keyPairName;
        this.masterRootPassword = builder.masterRootPassword;
        this.ramRole = builder.ramRole;
        this.securityGroupId = builder.securityGroupId;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NodeAttributes create() {
        return builder().build();
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return masterRootPassword
     */
    public String getMasterRootPassword() {
        return this.masterRootPassword;
    }

    /**
     * @return ramRole
     */
    public String getRamRole() {
        return this.ramRole;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder {
        private String keyPairName; 
        private String masterRootPassword; 
        private String ramRole; 
        private String securityGroupId; 
        private String vpcId; 
        private String zoneId; 

        /**
         * ECS ssh登录秘钥。
         */
        public Builder keyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * MASTER节点root密码。
         */
        public Builder masterRootPassword(String masterRootPassword) {
            this.masterRootPassword = masterRootPassword;
            return this;
        }

        /**
         * ECS访问资源绑定的角色。
         */
        public Builder ramRole(String ramRole) {
            this.ramRole = ramRole;
            return this;
        }

        /**
         * 安全组ID。EMR只支持普通安全组，不支持企业安全组。
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * 专有网络ID。
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * 可用区ID。
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public NodeAttributes build() {
            return new NodeAttributes(this);
        } 

    } 

}
