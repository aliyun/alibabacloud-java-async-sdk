// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cddc20200320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMyBaseRequest} extends {@link RequestModel}
 *
 * <p>CreateMyBaseRequest</p>
 */
public class CreateMyBaseRequest extends Request {
    @Query
    @NameInMap("AutoRenew")
    private String autoRenew;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DedicatedHostGroupDescription")
    private String dedicatedHostGroupDescription;

    @Query
    @NameInMap("DedicatedHostGroupId")
    private String dedicatedHostGroupId;

    @Query
    @NameInMap("ECSClassList")
    @Validation(required = true)
    private java.util.List < ECSClassList> ECSClassList;

    @Query
    @NameInMap("EcsDeploymentSetId")
    private String ecsDeploymentSetId;

    @Query
    @NameInMap("EcsHostName")
    private String ecsHostName;

    @Query
    @NameInMap("EcsInstanceName")
    private String ecsInstanceName;

    @Query
    @NameInMap("EcsUniqueSuffix")
    private String ecsUniqueSuffix;

    @Query
    @NameInMap("Engine")
    @Validation(required = true)
    private String engine;

    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("KeyPairName")
    private String keyPairName;

    @Query
    @NameInMap("OsPassword")
    private String osPassword;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PasswordInherit")
    private String passwordInherit;

    @Query
    @NameInMap("PayType")
    @Validation(required = true)
    private String payType;

    @Query
    @NameInMap("Period")
    private String period;

    @Query
    @NameInMap("PeriodType")
    private String periodType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SecurityGroupId")
    @Validation(required = true)
    private String securityGroupId;

    @Query
    @NameInMap("VSwitchId")
    @Validation(required = true)
    private String vSwitchId;

    @Query
    @NameInMap("VpcId")
    @Validation(required = true)
    private String vpcId;

    @Query
    @NameInMap("ZoneId")
    @Validation(required = true)
    private String zoneId;

    private CreateMyBaseRequest(Builder builder) {
        super(builder);
        this.autoRenew = builder.autoRenew;
        this.clientToken = builder.clientToken;
        this.dedicatedHostGroupDescription = builder.dedicatedHostGroupDescription;
        this.dedicatedHostGroupId = builder.dedicatedHostGroupId;
        this.ECSClassList = builder.ECSClassList;
        this.ecsDeploymentSetId = builder.ecsDeploymentSetId;
        this.ecsHostName = builder.ecsHostName;
        this.ecsInstanceName = builder.ecsInstanceName;
        this.ecsUniqueSuffix = builder.ecsUniqueSuffix;
        this.engine = builder.engine;
        this.imageId = builder.imageId;
        this.keyPairName = builder.keyPairName;
        this.osPassword = builder.osPassword;
        this.ownerId = builder.ownerId;
        this.passwordInherit = builder.passwordInherit;
        this.payType = builder.payType;
        this.period = builder.period;
        this.periodType = builder.periodType;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityGroupId = builder.securityGroupId;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMyBaseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRenew
     */
    public String getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dedicatedHostGroupDescription
     */
    public String getDedicatedHostGroupDescription() {
        return this.dedicatedHostGroupDescription;
    }

    /**
     * @return dedicatedHostGroupId
     */
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    /**
     * @return ECSClassList
     */
    public java.util.List < ECSClassList> getECSClassList() {
        return this.ECSClassList;
    }

    /**
     * @return ecsDeploymentSetId
     */
    public String getEcsDeploymentSetId() {
        return this.ecsDeploymentSetId;
    }

    /**
     * @return ecsHostName
     */
    public String getEcsHostName() {
        return this.ecsHostName;
    }

    /**
     * @return ecsInstanceName
     */
    public String getEcsInstanceName() {
        return this.ecsInstanceName;
    }

    /**
     * @return ecsUniqueSuffix
     */
    public String getEcsUniqueSuffix() {
        return this.ecsUniqueSuffix;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return osPassword
     */
    public String getOsPassword() {
        return this.osPassword;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return passwordInherit
     */
    public String getPasswordInherit() {
        return this.passwordInherit;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return periodType
     */
    public String getPeriodType() {
        return this.periodType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
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

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateMyBaseRequest, Builder> {
        private String autoRenew; 
        private String clientToken; 
        private String dedicatedHostGroupDescription; 
        private String dedicatedHostGroupId; 
        private java.util.List < ECSClassList> ECSClassList; 
        private String ecsDeploymentSetId; 
        private String ecsHostName; 
        private String ecsInstanceName; 
        private String ecsUniqueSuffix; 
        private String engine; 
        private String imageId; 
        private String keyPairName; 
        private String osPassword; 
        private Long ownerId; 
        private String passwordInherit; 
        private String payType; 
        private String period; 
        private String periodType; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityGroupId; 
        private String vSwitchId; 
        private String vpcId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMyBaseRequest request) {
            super(request);
            this.autoRenew = request.autoRenew;
            this.clientToken = request.clientToken;
            this.dedicatedHostGroupDescription = request.dedicatedHostGroupDescription;
            this.dedicatedHostGroupId = request.dedicatedHostGroupId;
            this.ECSClassList = request.ECSClassList;
            this.ecsDeploymentSetId = request.ecsDeploymentSetId;
            this.ecsHostName = request.ecsHostName;
            this.ecsInstanceName = request.ecsInstanceName;
            this.ecsUniqueSuffix = request.ecsUniqueSuffix;
            this.engine = request.engine;
            this.imageId = request.imageId;
            this.keyPairName = request.keyPairName;
            this.osPassword = request.osPassword;
            this.ownerId = request.ownerId;
            this.passwordInherit = request.passwordInherit;
            this.payType = request.payType;
            this.period = request.period;
            this.periodType = request.periodType;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityGroupId = request.securityGroupId;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
            this.zoneId = request.zoneId;
        } 

        /**
         * AutoRenew.
         */
        public Builder autoRenew(String autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DedicatedHostGroupDescription.
         */
        public Builder dedicatedHostGroupDescription(String dedicatedHostGroupDescription) {
            this.putQueryParameter("DedicatedHostGroupDescription", dedicatedHostGroupDescription);
            this.dedicatedHostGroupDescription = dedicatedHostGroupDescription;
            return this;
        }

        /**
         * DedicatedHostGroupId.
         */
        public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
            this.putQueryParameter("DedicatedHostGroupId", dedicatedHostGroupId);
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }

        /**
         * ECSClassList.
         */
        public Builder ECSClassList(java.util.List < ECSClassList> ECSClassList) {
            String ECSClassListShrink = shrink(ECSClassList, "ECSClassList", "json");
            this.putQueryParameter("ECSClassList", ECSClassListShrink);
            this.ECSClassList = ECSClassList;
            return this;
        }

        /**
         * EcsDeploymentSetId.
         */
        public Builder ecsDeploymentSetId(String ecsDeploymentSetId) {
            this.putQueryParameter("EcsDeploymentSetId", ecsDeploymentSetId);
            this.ecsDeploymentSetId = ecsDeploymentSetId;
            return this;
        }

        /**
         * EcsHostName.
         */
        public Builder ecsHostName(String ecsHostName) {
            this.putQueryParameter("EcsHostName", ecsHostName);
            this.ecsHostName = ecsHostName;
            return this;
        }

        /**
         * EcsInstanceName.
         */
        public Builder ecsInstanceName(String ecsInstanceName) {
            this.putQueryParameter("EcsInstanceName", ecsInstanceName);
            this.ecsInstanceName = ecsInstanceName;
            return this;
        }

        /**
         * EcsUniqueSuffix.
         */
        public Builder ecsUniqueSuffix(String ecsUniqueSuffix) {
            this.putQueryParameter("EcsUniqueSuffix", ecsUniqueSuffix);
            this.ecsUniqueSuffix = ecsUniqueSuffix;
            return this;
        }

        /**
         * Engine.
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * KeyPairName.
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * OsPassword.
         */
        public Builder osPassword(String osPassword) {
            this.putQueryParameter("OsPassword", osPassword);
            this.osPassword = osPassword;
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
         * PasswordInherit.
         */
        public Builder passwordInherit(String passwordInherit) {
            this.putQueryParameter("PasswordInherit", passwordInherit);
            this.passwordInherit = passwordInherit;
            return this;
        }

        /**
         * PayType.
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * PeriodType.
         */
        public Builder periodType(String periodType) {
            this.putQueryParameter("PeriodType", periodType);
            this.periodType = periodType;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * SecurityGroupId.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateMyBaseRequest build() {
            return new CreateMyBaseRequest(this);
        } 

    } 

    public static class ECSClassList extends TeaModel {
        @NameInMap("dataDiskPerformanceLevel")
        private String dataDiskPerformanceLevel;

        @NameInMap("diskCapacity")
        private Integer diskCapacity;

        @NameInMap("diskCount")
        private Integer diskCount;

        @NameInMap("diskType")
        private String diskType;

        @NameInMap("instanceType")
        @Validation(required = true)
        private String instanceType;

        @NameInMap("nodeCount")
        @Validation(required = true)
        private Integer nodeCount;

        @NameInMap("sysDiskCapacity")
        @Validation(required = true, minimum = 40)
        private Integer sysDiskCapacity;

        @NameInMap("sysDiskType")
        @Validation(required = true)
        private String sysDiskType;

        @NameInMap("systemDiskPerformanceLevel")
        private String systemDiskPerformanceLevel;

        private ECSClassList(Builder builder) {
            this.dataDiskPerformanceLevel = builder.dataDiskPerformanceLevel;
            this.diskCapacity = builder.diskCapacity;
            this.diskCount = builder.diskCount;
            this.diskType = builder.diskType;
            this.instanceType = builder.instanceType;
            this.nodeCount = builder.nodeCount;
            this.sysDiskCapacity = builder.sysDiskCapacity;
            this.sysDiskType = builder.sysDiskType;
            this.systemDiskPerformanceLevel = builder.systemDiskPerformanceLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ECSClassList create() {
            return builder().build();
        }

        /**
         * @return dataDiskPerformanceLevel
         */
        public String getDataDiskPerformanceLevel() {
            return this.dataDiskPerformanceLevel;
        }

        /**
         * @return diskCapacity
         */
        public Integer getDiskCapacity() {
            return this.diskCapacity;
        }

        /**
         * @return diskCount
         */
        public Integer getDiskCount() {
            return this.diskCount;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return nodeCount
         */
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        /**
         * @return sysDiskCapacity
         */
        public Integer getSysDiskCapacity() {
            return this.sysDiskCapacity;
        }

        /**
         * @return sysDiskType
         */
        public String getSysDiskType() {
            return this.sysDiskType;
        }

        /**
         * @return systemDiskPerformanceLevel
         */
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
        }

        public static final class Builder {
            private String dataDiskPerformanceLevel; 
            private Integer diskCapacity; 
            private Integer diskCount; 
            private String diskType; 
            private String instanceType; 
            private Integer nodeCount; 
            private Integer sysDiskCapacity; 
            private String sysDiskType; 
            private String systemDiskPerformanceLevel; 

            /**
             * dataDiskPerformanceLevel.
             */
            public Builder dataDiskPerformanceLevel(String dataDiskPerformanceLevel) {
                this.dataDiskPerformanceLevel = dataDiskPerformanceLevel;
                return this;
            }

            /**
             * diskCapacity.
             */
            public Builder diskCapacity(Integer diskCapacity) {
                this.diskCapacity = diskCapacity;
                return this;
            }

            /**
             * diskCount.
             */
            public Builder diskCount(Integer diskCount) {
                this.diskCount = diskCount;
                return this;
            }

            /**
             * diskType.
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * instanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * nodeCount.
             */
            public Builder nodeCount(Integer nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * sysDiskCapacity.
             */
            public Builder sysDiskCapacity(Integer sysDiskCapacity) {
                this.sysDiskCapacity = sysDiskCapacity;
                return this;
            }

            /**
             * sysDiskType.
             */
            public Builder sysDiskType(String sysDiskType) {
                this.sysDiskType = sysDiskType;
                return this;
            }

            /**
             * systemDiskPerformanceLevel.
             */
            public Builder systemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
                this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
                return this;
            }

            public ECSClassList build() {
                return new ECSClassList(this);
            } 

        } 

    }
}
