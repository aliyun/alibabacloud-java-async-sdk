// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocateDedicatedHostsRequest} extends {@link RequestModel}
 *
 * <p>AllocateDedicatedHostsRequest</p>
 */
public class AllocateDedicatedHostsRequest extends Request {
    @Query
    @NameInMap("NetworkAttributes")
    private NetworkAttributes networkAttributes;

    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    @Query
    @NameInMap("DedicatedHostName")
    private String dedicatedHostName;

    @Query
    @NameInMap("DedicatedHostClusterId")
    private String dedicatedHostClusterId;

    @Query
    @NameInMap("DedicatedHostType")
    @Validation(required = true)
    private String dedicatedHostType;

    @Query
    @NameInMap("ActionOnMaintenance")
    private String actionOnMaintenance;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("ChargeType")
    private String chargeType;

    @Query
    @NameInMap("MinQuantity")
    private Integer minQuantity;

    @Query
    @NameInMap("Quantity")
    private Integer quantity;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("AutoRenew")
    private Boolean autoRenew;

    @Query
    @NameInMap("AutoReleaseTime")
    private String autoReleaseTime;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("AutoPlacement")
    private String autoPlacement;

    @Query
    @NameInMap("CpuOverCommitRatio")
    private Float cpuOverCommitRatio;

    @Query
    @NameInMap("AutoRenewPeriod")
    private Integer autoRenewPeriod;

    @Query
    @NameInMap("Period")
    private Integer period;

    private AllocateDedicatedHostsRequest(Builder builder) {
        super(builder);
        this.networkAttributes = builder.networkAttributes;
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.regionId = builder.regionId;
        this.tag = builder.tag;
        this.resourceGroupId = builder.resourceGroupId;
        this.zoneId = builder.zoneId;
        this.dedicatedHostName = builder.dedicatedHostName;
        this.dedicatedHostClusterId = builder.dedicatedHostClusterId;
        this.dedicatedHostType = builder.dedicatedHostType;
        this.actionOnMaintenance = builder.actionOnMaintenance;
        this.description = builder.description;
        this.chargeType = builder.chargeType;
        this.minQuantity = builder.minQuantity;
        this.quantity = builder.quantity;
        this.periodUnit = builder.periodUnit;
        this.autoRenew = builder.autoRenew;
        this.autoReleaseTime = builder.autoReleaseTime;
        this.clientToken = builder.clientToken;
        this.autoPlacement = builder.autoPlacement;
        this.cpuOverCommitRatio = builder.cpuOverCommitRatio;
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.period = builder.period;
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return dedicatedHostName
     */
    public String getDedicatedHostName() {
        return this.dedicatedHostName;
    }

    /**
     * @return dedicatedHostClusterId
     */
    public String getDedicatedHostClusterId() {
        return this.dedicatedHostClusterId;
    }

    /**
     * @return dedicatedHostType
     */
    public String getDedicatedHostType() {
        return this.dedicatedHostType;
    }

    /**
     * @return actionOnMaintenance
     */
    public String getActionOnMaintenance() {
        return this.actionOnMaintenance;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return minQuantity
     */
    public Integer getMinQuantity() {
        return this.minQuantity;
    }

    /**
     * @return quantity
     */
    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return autoReleaseTime
     */
    public String getAutoReleaseTime() {
        return this.autoReleaseTime;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return autoPlacement
     */
    public String getAutoPlacement() {
        return this.autoPlacement;
    }

    /**
     * @return cpuOverCommitRatio
     */
    public Float getCpuOverCommitRatio() {
        return this.cpuOverCommitRatio;
    }

    /**
     * @return autoRenewPeriod
     */
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    public static final class Builder extends Request.Builder<AllocateDedicatedHostsRequest, Builder> {
        private NetworkAttributes networkAttributes; 
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String regionId; 
        private java.util.List < Tag> tag; 
        private String resourceGroupId; 
        private String zoneId; 
        private String dedicatedHostName; 
        private String dedicatedHostClusterId; 
        private String dedicatedHostType; 
        private String actionOnMaintenance; 
        private String description; 
        private String chargeType; 
        private Integer minQuantity; 
        private Integer quantity; 
        private String periodUnit; 
        private Boolean autoRenew; 
        private String autoReleaseTime; 
        private String clientToken; 
        private String autoPlacement; 
        private Float cpuOverCommitRatio; 
        private Integer autoRenewPeriod; 
        private Integer period; 

        private Builder() {
            super();
        } 

        private Builder(AllocateDedicatedHostsRequest request) {
            super(request);
            this.networkAttributes = request.networkAttributes;
            this.sourceRegionId = request.sourceRegionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.regionId = request.regionId;
            this.tag = request.tag;
            this.resourceGroupId = request.resourceGroupId;
            this.zoneId = request.zoneId;
            this.dedicatedHostName = request.dedicatedHostName;
            this.dedicatedHostClusterId = request.dedicatedHostClusterId;
            this.dedicatedHostType = request.dedicatedHostType;
            this.actionOnMaintenance = request.actionOnMaintenance;
            this.description = request.description;
            this.chargeType = request.chargeType;
            this.minQuantity = request.minQuantity;
            this.quantity = request.quantity;
            this.periodUnit = request.periodUnit;
            this.autoRenew = request.autoRenew;
            this.autoReleaseTime = request.autoReleaseTime;
            this.clientToken = request.clientToken;
            this.autoPlacement = request.autoPlacement;
            this.cpuOverCommitRatio = request.cpuOverCommitRatio;
            this.autoRenewPeriod = request.autoRenewPeriod;
            this.period = request.period;
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
         * The ID of the Alibaba cloud account.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The ID of the region to which the dedicated host belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Tag list
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The ID of the resource group to which the DDH belongs.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The ID of the zone to which the dedicated host belongs.
         * <p>
         * 
         * Default value: Null.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * The name of the dedicated host. The description must be 2 to 128 characters in length. It must start with a letter and cannot start with "http:// "or "https. It can contain numbers, colons (:), underscores (_), and hyphens (-).
         */
        public Builder dedicatedHostName(String dedicatedHostName) {
            this.putQueryParameter("DedicatedHostName", dedicatedHostName);
            this.dedicatedHostName = dedicatedHostName;
            return this;
        }

        /**
         * The ID of the DDH cluster to which the DDH belongs.
         */
        public Builder dedicatedHostClusterId(String dedicatedHostClusterId) {
            this.putQueryParameter("DedicatedHostClusterId", dedicatedHostClusterId);
            this.dedicatedHostClusterId = dedicatedHostClusterId;
            return this;
        }

        /**
         * The specification of the dedicated host. You can call the [DescribeDedicatedHostTypes](~~ 134240 ~~) API to obtain the latest DDH specifications.
         */
        public Builder dedicatedHostType(String dedicatedHostType) {
            this.putQueryParameter("DedicatedHostType", dedicatedHostType);
            this.dedicatedHostType = dedicatedHostType;
            return this;
        }

        /**
         * When a dedicated host fails or is repaired online, you can configure a migration solution for the host. Valid values:
         * <p>
         * 
         * -Migrate: Migrate the instance to another physical machine and restart the instance.
         * 
         * Default value: Migrate.
         * 
         * -Stop: Stop the instance on the current DDH. After confirming that the DDH cannot be repaired, migrate the instance to another physical machine and restart the instance.
         * 
         * When a local disk is attached to a dedicated host, the default value is Stop.
         */
        public Builder actionOnMaintenance(String actionOnMaintenance) {
            this.putQueryParameter("ActionOnMaintenance", actionOnMaintenance);
            this.actionOnMaintenance = actionOnMaintenance;
            return this;
        }

        /**
         * The description of the dedicated host. The description must be 2 to 256 characters in length and cannot start with "http:// "or "https.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The billing method of the dedicated host. Valid values:
         * <p>
         * 
         * <props="china">
         * -PrePaid: subscription. When you select subscription, make sure that your payment method supports balance or credit line payment. Otherwise, you will be prompted to InvalidPayMethod.
         * 
         * -PostPaid (default): Pay-as-you-go.
         * 
         * </props>
         * 
         * 
         * <props="intl">
         * -PrePaid: subscription. When you select subscription, make sure that your payment method supports credit line payment. Otherwise, you will be prompted to InvalidPayMethod.
         * 
         * -PostPaid (default): Pay-as-you-go.
         * 
         * </props>
         * 
         * <props="partner">
         * -PrePaid: subscription. When you select subscription, make sure that your payment method supports credit line payment. Otherwise, you will be prompted to InvalidPayMethod.
         * 
         * -PostPaid (default): Pay-as-you-go.
         * 
         * </props>
         * 
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * The minimum number of dedicated hosts. Valid values: 1 to 100.
         * <p>
         * 
         * > When the inventory of a dedicated host is less than the minimum quantity, the creation of a dedicated host fails.
         */
        public Builder minQuantity(Integer minQuantity) {
            this.putQueryParameter("MinQuantity", minQuantity);
            this.minQuantity = minQuantity;
            return this;
        }

        /**
         * The number of dedicated hosts created this time. Valid values: 1 to 100.
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
         * The duration of the dedicated host. Unit. Valid values:
         * <p>
         * 
         * <props="china">
         * -Week
         * -Month
         * -Year
         * 
         * </props>
         * 
         * <props="intl">
         * -Month
         * -Year
         * 
         * </props>
         * 
         * <props="partner">
         * -Month
         * -Year
         * 
         * </props>
         * 
         * Default value: Month
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * Specifies whether to automatically renew the subscription dedicated host.
         * <p>
         * > When the value of the parameter **ChargeType** PrePaid, The **AutoRenew** parameter takes effect.
         * 
         * Default value: false
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * The automatic release time of the dedicated host. Specify the time in the ISO 8601 standard in UTC +0 format yyyy-MM-ddTHH:mm:ssZ.
         * <p>
         * 
         * >-set the minimum value to half an hour after the current time.
         * -A maximum of three years after the current time.
         * -If the seconds (ss) in the parameter value is not 00, it is automatically set to 00.
         */
        public Builder autoReleaseTime(String autoReleaseTime) {
            this.putQueryParameter("AutoReleaseTime", autoReleaseTime);
            this.autoReleaseTime = autoReleaseTime;
            return this;
        }

        /**
         * Ensure the idempotence of the request. Generate a parameter value from your client. Make sure that the value is unique among different requests. **ClientToken** supports only ASCII characters and cannot exceed 64 characters. For more information, see [how to ensure idempotence](~~ 25693 ~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Indicates whether the dedicated host is added to the automatic deployment resource pool. When you create an instance on a ddh without specifying **DedicatedHostId**, alibaba cloud automatically selects the appropriate ddh to deploy the instance from the ddh added to the resource pool. For more information, see [automatic deployment](~~ 118938 ~~). Valid values:
         * <p>
         * 
         * -on: added to the automatic deployment resource pool.
         * 
         * -off: does not join the automatic deployment resource pool.
         * 
         * Default value: on
         * 
         * > If you do not want a dedicated host to be added to the automatic deployment resource pool, set this parameter to off.
         */
        public Builder autoPlacement(String autoPlacement) {
            this.putQueryParameter("AutoPlacement", autoPlacement);
            this.autoPlacement = autoPlacement;
            return this;
        }

        /**
         * CPU oversold ratio. You can set the CPU oversell ratio only for g6s, c6s, and r6s specifications. Valid values: 1 to 5.
         * <p>
         * 
         * CPU oversold ratio affects the number of available vcpus of a DDH. The number of available vcpus of a DDH = number of physical CPU cores * 2* CPU oversold ratio. For example, the number of physical CPU cores of g6s is 52. If the CPU oversell ratio is set to 4, the total number of VCPUs after the DDH is created is 416. For scenarios where the absolute stability of CPU is not strict or the CPU load is not high, for example, in the development and testing environment, increasing the overselling ratio can increase the number of available vCPU, which is used to deploy more ECS instances of the same specification and reduce the unit deployment cost.
         */
        public Builder cpuOverCommitRatio(Float cpuOverCommitRatio) {
            this.putQueryParameter("CpuOverCommitRatio", cpuOverCommitRatio);
            this.cpuOverCommitRatio = cpuOverCommitRatio;
            return this;
        }

        /**
         * The cycle of an automatic renewal. Unit: month. Valid values:{1,2,3,6,12}.
         * <p>
         * 
         * > if the parameter **AutoRenew** is set to true, the **AutoRenewPeriod** parameter takes effect and is required.
         */
        public Builder autoRenewPeriod(Integer autoRenewPeriod) {
            this.putQueryParameter("AutoRenewPeriod", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * The subscription duration of a dedicated host. When the value of "ChargeType" is "PrePaid", the "1" parameter takes effect and is required. Valid values:
         * <p>
         * 
         * <props="china">
         * -PeriodUnit = Week:{1,2,3}
         * -PeriodUnit = Month:{1,2,3,4,5,6,7,8,9}
         * -PeriodUnit = Year:{1,2,3,4,5}
         * 
         * </props>
         * 
         * <props="intl">
         * -PeriodUnit = Month:{1,2,3,4,5,6,7,8,9}
         * -PeriodUnit = Year:{1,2,3,4,5}
         * 
         * </props>
         * 
         * <props="partner">
         * -PeriodUnit = Month:{1,2,3,4,5,6,7,8,9}
         * -PeriodUnit = Year:{1,2,3,4,5}
         * 
         * </props>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        @Override
        public AllocateDedicatedHostsRequest build() {
            return new AllocateDedicatedHostsRequest(this);
        } 

    } 

    public static class NetworkAttributes extends TeaModel {
        @NameInMap("SlbUdpTimeout")
        private Integer slbUdpTimeout;

        @NameInMap("UdpTimeout")
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
             * The UDP session timeout period of the SLB connection. Unit: seconds. Valid values: 15 to 310
             */
            public Builder slbUdpTimeout(Integer slbUdpTimeout) {
                this.slbUdpTimeout = slbUdpTimeout;
                return this;
            }

            /**
             * Set the UDP session timeout period for user access for cloud services running on the DDH. Unit: seconds. Valid values: 15 to 310
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
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * 专有宿主机的标签键。N的取值范围：1~20
             * <p>
             * 
             * 一旦传入该值，则不允许为空字符串。最多支持128个字符，不能以aliyun或者acs:开头，不能包含`http://`或者`https://`。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 专有宿主机的标签值。N的取值范围：1~20
             * <p>
             * 
             * 一旦传入该值，可以为空字符串。最多支持128个字符，不能以acs:开头，不能包含`http://`或者`https://`。
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
