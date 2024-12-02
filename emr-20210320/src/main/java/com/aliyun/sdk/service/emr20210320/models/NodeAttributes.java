// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link NodeAttributes} extends {@link TeaModel}
 *
 * <p>NodeAttributes</p>
 */
public class NodeAttributes extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataDiskEncrypted")
    private Boolean dataDiskEncrypted;

    @com.aliyun.core.annotation.NameInMap("DataDiskKMSKeyId")
    private String dataDiskKMSKeyId;

    @com.aliyun.core.annotation.NameInMap("KeyPairName")
    private String keyPairName;

    @com.aliyun.core.annotation.NameInMap("MasterRootPassword")
    private String masterRootPassword;

    @com.aliyun.core.annotation.NameInMap("RamRole")
    private String ramRole;

    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String securityGroupId;

    @com.aliyun.core.annotation.NameInMap("SystemDiskEncrypted")
    private Boolean systemDiskEncrypted;

    @com.aliyun.core.annotation.NameInMap("SystemDiskKMSKeyId")
    private String systemDiskKMSKeyId;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    private NodeAttributes(Builder builder) {
        this.dataDiskEncrypted = builder.dataDiskEncrypted;
        this.dataDiskKMSKeyId = builder.dataDiskKMSKeyId;
        this.keyPairName = builder.keyPairName;
        this.masterRootPassword = builder.masterRootPassword;
        this.ramRole = builder.ramRole;
        this.securityGroupId = builder.securityGroupId;
        this.systemDiskEncrypted = builder.systemDiskEncrypted;
        this.systemDiskKMSKeyId = builder.systemDiskKMSKeyId;
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
     * @return dataDiskEncrypted
     */
    public Boolean getDataDiskEncrypted() {
        return this.dataDiskEncrypted;
    }

    /**
     * @return dataDiskKMSKeyId
     */
    public String getDataDiskKMSKeyId() {
        return this.dataDiskKMSKeyId;
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
     * @return systemDiskEncrypted
     */
    public Boolean getSystemDiskEncrypted() {
        return this.systemDiskEncrypted;
    }

    /**
     * @return systemDiskKMSKeyId
     */
    public String getSystemDiskKMSKeyId() {
        return this.systemDiskKMSKeyId;
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
        private Boolean dataDiskEncrypted; 
        private String dataDiskKMSKeyId; 
        private String keyPairName; 
        private String masterRootPassword; 
        private String ramRole; 
        private String securityGroupId; 
        private Boolean systemDiskEncrypted; 
        private String systemDiskKMSKeyId; 
        private String vpcId; 
        private String zoneId; 

        /**
         * <p>是否启用云盘加密。取值范围：</p>
         * <ul>
         * <li>true：启用加密。</li>
         * <li>false：不加密。</li>
         * </ul>
         * <p>默认值：false，不加密</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dataDiskEncrypted(Boolean dataDiskEncrypted) {
            this.dataDiskEncrypted = dataDiskEncrypted;
            return this;
        }

        /**
         * <p>KMS加密秘钥ID。</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        public Builder dataDiskKMSKeyId(String dataDiskKMSKeyId) {
            this.dataDiskKMSKeyId = dataDiskKMSKeyId;
            return this;
        }

        /**
         * <p>ECS ssh登录秘钥。</p>
         * 
         * <strong>example:</strong>
         * <p>emr_login</p>
         */
        public Builder keyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * <p>MASTER节点root密码。</p>
         * 
         * <strong>example:</strong>
         * <p>Adxefswfd****</p>
         */
        public Builder masterRootPassword(String masterRootPassword) {
            this.masterRootPassword = masterRootPassword;
            return this;
        }

        /**
         * <p>ECS访问资源绑定的角色。</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunECSInstanceForEMRRole</p>
         */
        public Builder ramRole(String ramRole) {
            this.ramRole = ramRole;
            return this;
        }

        /**
         * <p>安全组ID。EMR只支持普通安全组，不支持企业安全组。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-hp3abbae8lb6lmb1****</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>是否启用云盘加密。取值范围：</p>
         * <ul>
         * <li>true：启用加密。</li>
         * <li>false：不加密。</li>
         * </ul>
         * <p>默认值：false，不加密</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder systemDiskEncrypted(Boolean systemDiskEncrypted) {
            this.systemDiskEncrypted = systemDiskEncrypted;
            return this;
        }

        /**
         * <p>KMS加密秘钥ID。</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40****</p>
         */
        public Builder systemDiskKMSKeyId(String systemDiskKMSKeyId) {
            this.systemDiskKMSKeyId = systemDiskKMSKeyId;
            return this;
        }

        /**
         * <p>专有网络ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1tgey2p0ytxmdo5****</p>
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>可用区ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-h</p>
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
