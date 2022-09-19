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
    @Validation(required = true)
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
    @NameInMap("Engine")
    @Validation(required = true)
    private String engine;

    @Query
    @NameInMap("OsPassword")
    private String osPassword;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

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
        this.engine = builder.engine;
        this.osPassword = builder.osPassword;
        this.ownerId = builder.ownerId;
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
     * @return engine
     */
    public String getEngine() {
        return this.engine;
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
        private String engine; 
        private String osPassword; 
        private Long ownerId; 
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
            this.engine = request.engine;
            this.osPassword = request.osPassword;
            this.ownerId = request.ownerId;
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
         * 集群名称，未传则为空
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
         * 引擎类型
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
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
         * 安全组ID
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

        private ECSClassList(Builder builder) {
            this.instanceType = builder.instanceType;
            this.nodeCount = builder.nodeCount;
            this.sysDiskCapacity = builder.sysDiskCapacity;
            this.sysDiskType = builder.sysDiskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ECSClassList create() {
            return builder().build();
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

        public static final class Builder {
            private String instanceType; 
            private Integer nodeCount; 
            private Integer sysDiskCapacity; 
            private String sysDiskType; 

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

            public ECSClassList build() {
                return new ECSClassList(this);
            } 

        } 

    }
}
