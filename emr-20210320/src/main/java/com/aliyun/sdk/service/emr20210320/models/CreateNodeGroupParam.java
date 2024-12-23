// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link CreateNodeGroupParam} extends {@link TeaModel}
 *
 * <p>CreateNodeGroupParam</p>
 */
public class CreateNodeGroupParam extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.NameInMap("AutoRenewDuration")
    private Integer autoRenewDuration;

    @com.aliyun.core.annotation.NameInMap("AutoRenewDurationUnit")
    private String autoRenewDurationUnit;

    @com.aliyun.core.annotation.NameInMap("DataDisks")
    private java.util.List<DiskInfo> dataDisks;

    @com.aliyun.core.annotation.NameInMap("InstanceTypes")
    private java.util.List<String> instanceTypes;

    @com.aliyun.core.annotation.NameInMap("NodeCount")
    private Integer nodeCount;

    @com.aliyun.core.annotation.NameInMap("NodeGroupName")
    private String nodeGroupName;

    @com.aliyun.core.annotation.NameInMap("NodeGroupType")
    private String nodeGroupType;

    @com.aliyun.core.annotation.NameInMap("NodeKeyPairName")
    private String nodeKeyPairName;

    @com.aliyun.core.annotation.NameInMap("NodeRamRole")
    private String nodeRamRole;

    @com.aliyun.core.annotation.NameInMap("NodeRootPassword")
    private String nodeRootPassword;

    @com.aliyun.core.annotation.NameInMap("PaymentDuration")
    private Integer paymentDuration;

    @com.aliyun.core.annotation.NameInMap("PaymentDurationUnit")
    private String paymentDurationUnit;

    @com.aliyun.core.annotation.NameInMap("PaymentType")
    private String paymentType;

    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.NameInMap("SpotStrategy")
    private String spotStrategy;

    @com.aliyun.core.annotation.NameInMap("SystemDisk")
    private SystemDiskParam systemDisk;

    @com.aliyun.core.annotation.NameInMap("VSwitchIds")
    private java.util.List<String> vSwitchIds;

    @com.aliyun.core.annotation.NameInMap("WithPublicIp")
    private Boolean withPublicIp;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private CreateNodeGroupParam(Builder builder) {
        this.autoRenew = builder.autoRenew;
        this.autoRenewDuration = builder.autoRenewDuration;
        this.autoRenewDurationUnit = builder.autoRenewDurationUnit;
        this.dataDisks = builder.dataDisks;
        this.instanceTypes = builder.instanceTypes;
        this.nodeCount = builder.nodeCount;
        this.nodeGroupName = builder.nodeGroupName;
        this.nodeGroupType = builder.nodeGroupType;
        this.nodeKeyPairName = builder.nodeKeyPairName;
        this.nodeRamRole = builder.nodeRamRole;
        this.nodeRootPassword = builder.nodeRootPassword;
        this.paymentDuration = builder.paymentDuration;
        this.paymentDurationUnit = builder.paymentDurationUnit;
        this.paymentType = builder.paymentType;
        this.securityGroupId = builder.securityGroupId;
        this.spotStrategy = builder.spotStrategy;
        this.systemDisk = builder.systemDisk;
        this.vSwitchIds = builder.vSwitchIds;
        this.withPublicIp = builder.withPublicIp;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNodeGroupParam create() {
        return builder().build();
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return autoRenewDuration
     */
    public Integer getAutoRenewDuration() {
        return this.autoRenewDuration;
    }

    /**
     * @return autoRenewDurationUnit
     */
    public String getAutoRenewDurationUnit() {
        return this.autoRenewDurationUnit;
    }

    /**
     * @return dataDisks
     */
    public java.util.List<DiskInfo> getDataDisks() {
        return this.dataDisks;
    }

    /**
     * @return instanceTypes
     */
    public java.util.List<String> getInstanceTypes() {
        return this.instanceTypes;
    }

    /**
     * @return nodeCount
     */
    public Integer getNodeCount() {
        return this.nodeCount;
    }

    /**
     * @return nodeGroupName
     */
    public String getNodeGroupName() {
        return this.nodeGroupName;
    }

    /**
     * @return nodeGroupType
     */
    public String getNodeGroupType() {
        return this.nodeGroupType;
    }

    /**
     * @return nodeKeyPairName
     */
    public String getNodeKeyPairName() {
        return this.nodeKeyPairName;
    }

    /**
     * @return nodeRamRole
     */
    public String getNodeRamRole() {
        return this.nodeRamRole;
    }

    /**
     * @return nodeRootPassword
     */
    public String getNodeRootPassword() {
        return this.nodeRootPassword;
    }

    /**
     * @return paymentDuration
     */
    public Integer getPaymentDuration() {
        return this.paymentDuration;
    }

    /**
     * @return paymentDurationUnit
     */
    public String getPaymentDurationUnit() {
        return this.paymentDurationUnit;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return spotStrategy
     */
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    /**
     * @return systemDisk
     */
    public SystemDiskParam getSystemDisk() {
        return this.systemDisk;
    }

    /**
     * @return vSwitchIds
     */
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    /**
     * @return withPublicIp
     */
    public Boolean getWithPublicIp() {
        return this.withPublicIp;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder {
        private Boolean autoRenew; 
        private Integer autoRenewDuration; 
        private String autoRenewDurationUnit; 
        private java.util.List<DiskInfo> dataDisks; 
        private java.util.List<String> instanceTypes; 
        private Integer nodeCount; 
        private String nodeGroupName; 
        private String nodeGroupType; 
        private String nodeKeyPairName; 
        private String nodeRamRole; 
        private String nodeRootPassword; 
        private Integer paymentDuration; 
        private String paymentDurationUnit; 
        private String paymentType; 
        private String securityGroupId; 
        private String spotStrategy; 
        private SystemDiskParam systemDisk; 
        private java.util.List<String> vSwitchIds; 
        private Boolean withPublicIp; 
        private String zoneId; 

        /**
         * AutoRenew.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * AutoRenewDuration.
         */
        public Builder autoRenewDuration(Integer autoRenewDuration) {
            this.autoRenewDuration = autoRenewDuration;
            return this;
        }

        /**
         * AutoRenewDurationUnit.
         */
        public Builder autoRenewDurationUnit(String autoRenewDurationUnit) {
            this.autoRenewDurationUnit = autoRenewDurationUnit;
            return this;
        }

        /**
         * DataDisks.
         */
        public Builder dataDisks(java.util.List<DiskInfo> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }

        /**
         * InstanceTypes.
         */
        public Builder instanceTypes(java.util.List<String> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * NodeCount.
         */
        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }

        /**
         * NodeGroupName.
         */
        public Builder nodeGroupName(String nodeGroupName) {
            this.nodeGroupName = nodeGroupName;
            return this;
        }

        /**
         * NodeGroupType.
         */
        public Builder nodeGroupType(String nodeGroupType) {
            this.nodeGroupType = nodeGroupType;
            return this;
        }

        /**
         * NodeKeyPairName.
         */
        public Builder nodeKeyPairName(String nodeKeyPairName) {
            this.nodeKeyPairName = nodeKeyPairName;
            return this;
        }

        /**
         * NodeRamRole.
         */
        public Builder nodeRamRole(String nodeRamRole) {
            this.nodeRamRole = nodeRamRole;
            return this;
        }

        /**
         * NodeRootPassword.
         */
        public Builder nodeRootPassword(String nodeRootPassword) {
            this.nodeRootPassword = nodeRootPassword;
            return this;
        }

        /**
         * PaymentDuration.
         */
        public Builder paymentDuration(Integer paymentDuration) {
            this.paymentDuration = paymentDuration;
            return this;
        }

        /**
         * PaymentDurationUnit.
         */
        public Builder paymentDurationUnit(String paymentDurationUnit) {
            this.paymentDurationUnit = paymentDurationUnit;
            return this;
        }

        /**
         * PaymentType.
         */
        public Builder paymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * SecurityGroupId.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * SpotStrategy.
         */
        public Builder spotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * SystemDisk.
         */
        public Builder systemDisk(SystemDiskParam systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }

        /**
         * VSwitchIds.
         */
        public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        /**
         * WithPublicIp.
         */
        public Builder withPublicIp(Boolean withPublicIp) {
            this.withPublicIp = withPublicIp;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public CreateNodeGroupParam build() {
            return new CreateNodeGroupParam(this);
        } 

    } 

}
