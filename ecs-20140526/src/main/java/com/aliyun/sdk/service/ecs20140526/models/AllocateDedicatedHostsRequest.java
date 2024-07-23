// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocateDedicatedHostsRequest} extends {@link RequestModel}
 *
 * <p>AllocateDedicatedHostsRequest</p>
 */
public class AllocateDedicatedHostsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkAttributes")
    private NetworkAttributes networkAttributes;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionOnMaintenance")
    private String actionOnMaintenance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPlacement")
    private String autoPlacement;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoReleaseTime")
    private String autoReleaseTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenewPeriod")
    private Integer autoRenewPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpuOverCommitRatio")
    private Float cpuOverCommitRatio;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedicatedHostClusterId")
    private String dedicatedHostClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedicatedHostName")
    private String dedicatedHostName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedicatedHostType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dedicatedHostType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinQuantity")
    private Integer minQuantity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Quantity")
    private Integer quantity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private AllocateDedicatedHostsRequest(Builder builder) {
        super(builder);
        this.networkAttributes = builder.networkAttributes;
        this.sourceRegionId = builder.sourceRegionId;
        this.actionOnMaintenance = builder.actionOnMaintenance;
        this.autoPlacement = builder.autoPlacement;
        this.autoReleaseTime = builder.autoReleaseTime;
        this.autoRenew = builder.autoRenew;
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.chargeType = builder.chargeType;
        this.clientToken = builder.clientToken;
        this.cpuOverCommitRatio = builder.cpuOverCommitRatio;
        this.dedicatedHostClusterId = builder.dedicatedHostClusterId;
        this.dedicatedHostName = builder.dedicatedHostName;
        this.dedicatedHostType = builder.dedicatedHostType;
        this.description = builder.description;
        this.minQuantity = builder.minQuantity;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.quantity = builder.quantity;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tag = builder.tag;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocateDedicatedHostsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkAttributes
     */
    public NetworkAttributes getNetworkAttributes() {
        return this.networkAttributes;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return actionOnMaintenance
     */
    public String getActionOnMaintenance() {
        return this.actionOnMaintenance;
    }

    /**
     * @return autoPlacement
     */
    public String getAutoPlacement() {
        return this.autoPlacement;
    }

    /**
     * @return autoReleaseTime
     */
    public String getAutoReleaseTime() {
        return this.autoReleaseTime;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return autoRenewPeriod
     */
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return cpuOverCommitRatio
     */
    public Float getCpuOverCommitRatio() {
        return this.cpuOverCommitRatio;
    }

    /**
     * @return dedicatedHostClusterId
     */
    public String getDedicatedHostClusterId() {
        return this.dedicatedHostClusterId;
    }

    /**
     * @return dedicatedHostName
     */
    public String getDedicatedHostName() {
        return this.dedicatedHostName;
    }

    /**
     * @return dedicatedHostType
     */
    public String getDedicatedHostType() {
        return this.dedicatedHostType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return minQuantity
     */
    public Integer getMinQuantity() {
        return this.minQuantity;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return quantity
     */
    public Integer getQuantity() {
        return this.quantity;
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
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<AllocateDedicatedHostsRequest, Builder> {
        private NetworkAttributes networkAttributes; 
        private String sourceRegionId; 
        private String actionOnMaintenance; 
        private String autoPlacement; 
        private String autoReleaseTime; 
        private Boolean autoRenew; 
        private Integer autoRenewPeriod; 
        private String chargeType; 
        private String clientToken; 
        private Float cpuOverCommitRatio; 
        private String dedicatedHostClusterId; 
        private String dedicatedHostName; 
        private String dedicatedHostType; 
        private String description; 
        private Integer minQuantity; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer period; 
        private String periodUnit; 
        private Integer quantity; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List < Tag> tag; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(AllocateDedicatedHostsRequest request) {
            super(request);
            this.networkAttributes = request.networkAttributes;
            this.sourceRegionId = request.sourceRegionId;
            this.actionOnMaintenance = request.actionOnMaintenance;
            this.autoPlacement = request.autoPlacement;
            this.autoReleaseTime = request.autoReleaseTime;
            this.autoRenew = request.autoRenew;
            this.autoRenewPeriod = request.autoRenewPeriod;
            this.chargeType = request.chargeType;
            this.clientToken = request.clientToken;
            this.cpuOverCommitRatio = request.cpuOverCommitRatio;
            this.dedicatedHostClusterId = request.dedicatedHostClusterId;
            this.dedicatedHostName = request.dedicatedHostName;
            this.dedicatedHostType = request.dedicatedHostType;
            this.description = request.description;
            this.minQuantity = request.minQuantity;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.quantity = request.quantity;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tag = request.tag;
            this.zoneId = request.zoneId;
        } 

        /**
         * NetworkAttributes.
         */
        public Builder networkAttributes(NetworkAttributes networkAttributes) {
            this.putQueryParameter("NetworkAttributes", networkAttributes);
            this.networkAttributes = networkAttributes;
            return this;
        }

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * The policy used to migrate the instances deployed on the dedicated host when the dedicated host fails or needs to be repaired online. Valid values:
         * <p>
         * 
         * *   Migrate: The instances are migrated to another physical server and restarted.
         * 
         *     If cloud disks are attached to the dedicated host, the default value is Migrate.
         * 
         * *   Stop: The instances are stopped. If the dedicated host cannot be repaired, the instances are migrated to another physical machine and then restarted.
         * 
         *     If local disks are attached to the dedicated host, the default value is Stop.
         */
        public Builder actionOnMaintenance(String actionOnMaintenance) {
            this.putQueryParameter("ActionOnMaintenance", actionOnMaintenance);
            this.actionOnMaintenance = actionOnMaintenance;
            return this;
        }

        /**
         * Specifies whether to add the dedicated host to the resource pool for automatic deployment. If you create an ECS instance on a dedicated host without specifying the **DedicatedHostId** parameter, Alibaba Cloud selects a dedicated host from the resource pool to host the instance. For more information, see [Automatic deployment](~~118938~~). Valid values:
         * <p>
         * 
         * *   on: adds the dedicated host to the resource pool for automatic deployment.
         * *   off: does not add the dedicated host to the resource pool for automatic deployment.
         * 
         * Default value: on.
         * 
         * > If you do not want to add the dedicated host to the resource pool for automatic deployment, set this parameter to off.
         */
        public Builder autoPlacement(String autoPlacement) {
            this.putQueryParameter("AutoPlacement", autoPlacement);
            this.autoPlacement = autoPlacement;
            return this;
        }

        /**
         * The time when to automatically release the dedicated host. Specify the time in the `ISO 8601` standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         * <p>
         * 
         * > 
         * 
         * *   It must be at least half an hour later than the current time.
         * 
         * *   It must be at most three years later than the current time.
         * 
         * *   If the value of seconds (ss) is not 00, it is automatically set to 00.
         */
        public Builder autoReleaseTime(String autoReleaseTime) {
            this.putQueryParameter("AutoReleaseTime", autoReleaseTime);
            this.autoReleaseTime = autoReleaseTime;
            return this;
        }

        /**
         * Specifies whether to automatically renew the subscription dedicated host.
         * <p>
         * 
         * > The **AutoRenew** parameter takes effect only when the **ChargeType** parameter is set to PrePaid.
         * 
         * Default value: false
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * The auto-renewal duration of the dedicated host. The **AutoRenewPeriod** parameter takes effect and is required only when the **AutoRenew** parameter is set to true. Valid values:
         * <p>
         * 
         * Valid values when PeriodUnit is set to Month: 1, 2, 3, 6, and 12.
         */
        public Builder autoRenewPeriod(Integer autoRenewPeriod) {
            this.putQueryParameter("AutoRenewPeriod", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * The billing method of the dedicated host. Valid values:
         * <p>
         * 
         * *   PrePaid: subscription. If you set this parameter to PrePaid, make sure that you have sufficient account balance or credits. Otherwise, `InvalidPayMethod` is returned.
         * *   PostPaid: pay-as-you-go.
         * 
         * Default value: PostPaid.
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The **token** can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The CPU overcommit ratio. You can configure CPU overcommit ratios only for the following dedicated host types: g6s, c6s, and r6s. Valid values: 1 to 5.
         * <p>
         * 
         * The CPU overcommit ratio affects the number of available vCPUs on a dedicated host. You can use the following formula to calculate the number of available vCPUs on a dedicated host: Number of available vCPUs = Number of physical CPU cores × 2 × CPU overcommit ratio. For example, the number of physical CPU cores on each g6s dedicated host is 52. If you set the CPU overcommit ratio of a g6s dedicated host to 4, the number of available vCPUs on the dedicated host is 416. For scenarios that have minimal requirements on CPU stability or where CPU load is not heavy, such as development and test environments, you can increase the number of available vCPUs on a dedicated host by increasing the CPU overcommit ratio. This way, you can deploy more ECS instances of the same specifications on the dedicated host and reduce the unit deployment cost.
         */
        public Builder cpuOverCommitRatio(Float cpuOverCommitRatio) {
            this.putQueryParameter("CpuOverCommitRatio", cpuOverCommitRatio);
            this.cpuOverCommitRatio = cpuOverCommitRatio;
            return this;
        }

        /**
         * The ID of the dedicated host cluster in which to create the dedicated host.
         */
        public Builder dedicatedHostClusterId(String dedicatedHostClusterId) {
            this.putQueryParameter("DedicatedHostClusterId", dedicatedHostClusterId);
            this.dedicatedHostClusterId = dedicatedHostClusterId;
            return this;
        }

        /**
         * The name of the dedicated host. The name must be 2 to 128 characters in length and can contain letters and digits. The name can contain colons (:), underscores (\_), periods (.), and hyphens (-).
         */
        public Builder dedicatedHostName(String dedicatedHostName) {
            this.putQueryParameter("DedicatedHostName", dedicatedHostName);
            this.dedicatedHostName = dedicatedHostName;
            return this;
        }

        /**
         * The dedicated host type. You can call the [DescribeDedicatedHostTypes](~~134240~~) operation to query the most recent list of dedicated host types.
         */
        public Builder dedicatedHostType(String dedicatedHostType) {
            this.putQueryParameter("DedicatedHostType", dedicatedHostType);
            this.dedicatedHostType = dedicatedHostType;
            return this;
        }

        /**
         * The description of the dedicated host. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The minimum number of dedicated hosts to create. Valid values: 1 to 100.
         * <p>
         * 
         * > If the number of available dedicated hosts is less than the minimum number of dedicated hosts to create, the dedicated hosts fail to be created.
         */
        public Builder minQuantity(Integer minQuantity) {
            this.putQueryParameter("MinQuantity", minQuantity);
            this.minQuantity = minQuantity;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
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
         * The subscription duration of the dedicated host. The `Period` parameter is required and takes effect only when the `ChargeType` parameter is set to `PrePaid`. Valid values:
         * <p>
         * 
         * *   Valid values when the PeriodUnit parameter is set to Month: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.
         * *   Valid values when the PeriodUnit parameter is set to Year: 1, 2, 3, 4, and 5.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The unit of the subscription duration of the dedicated host. Valid values:
         * <p>
         * 
         * *   Month
         * *   Year
         * 
         * Default value: Month.
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * The number of dedicated hosts that you want to create. Valid values: 1 to 100.
         * <p>
         * 
         * Default value: 1.
         */
        public Builder quantity(Integer quantity) {
            this.putQueryParameter("Quantity", quantity);
            this.quantity = quantity;
            return this;
        }

        /**
         * The ID of the region in which to create the dedicated host. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group to which to assign the dedicated host.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * The tags to add to the dedicated host.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The ID of the zone in which to create the dedicated host.
         * <p>
         * 
         * This parameter is empty by default. If you do not specify a zone, the system selects a zone.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public AllocateDedicatedHostsRequest build() {
            return new AllocateDedicatedHostsRequest(this);
        } 

    } 

    public static class NetworkAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SlbUdpTimeout")
        private Integer slbUdpTimeout;

        @com.aliyun.core.annotation.NameInMap("UdpTimeout")
        private Integer udpTimeout;

        private NetworkAttributes(Builder builder) {
            this.slbUdpTimeout = builder.slbUdpTimeout;
            this.udpTimeout = builder.udpTimeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkAttributes create() {
            return builder().build();
        }

        /**
         * @return slbUdpTimeout
         */
        public Integer getSlbUdpTimeout() {
            return this.slbUdpTimeout;
        }

        /**
         * @return udpTimeout
         */
        public Integer getUdpTimeout() {
            return this.udpTimeout;
        }

        public static final class Builder {
            private Integer slbUdpTimeout; 
            private Integer udpTimeout; 

            /**
             * The timeout period for a UDP session between a Server Load Balancer (SLB) instance and the dedicated host. Unit: seconds. Valid values: 15 to 310.
             */
            public Builder slbUdpTimeout(Integer slbUdpTimeout) {
                this.slbUdpTimeout = slbUdpTimeout;
                return this;
            }

            /**
             * The timeout period for a UDP session between a user and an Alibaba Cloud service on the dedicated host. Unit: seconds. Valid values: 15 to 310.
             */
            public Builder udpTimeout(Integer udpTimeout) {
                this.udpTimeout = udpTimeout;
                return this;
            }

            public NetworkAttributes build() {
                return new NetworkAttributes(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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
             * The key of tag N to add to the dedicated host. Valid values of N: 1 to 20.
             * <p>
             * 
             * The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot contain `http://` or `https://`. The tag key cannot start with acs: or aliyun.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N to add to the dedicated host. Valid values of N: 1 to 20.
             * <p>
             * 
             * The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot contain `http://` or `https://`.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
