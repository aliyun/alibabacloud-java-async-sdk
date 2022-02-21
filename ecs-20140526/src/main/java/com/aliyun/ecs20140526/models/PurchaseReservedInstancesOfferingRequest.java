// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PurchaseReservedInstancesOfferingRequest} extends {@link RequestModel}
 *
 * <p>PurchaseReservedInstancesOfferingRequest</p>
 */
public class PurchaseReservedInstancesOfferingRequest extends Request {
    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    @Query
    @NameInMap("ReservedInstanceName")
    private String reservedInstanceName;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("Platform")
    private String platform;

    @Query
    @NameInMap("Scope")
    private String scope;

    @Query
    @NameInMap("OfferingType")
    private String offeringType;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("InstanceAmount")
    private Integer instanceAmount;

    private PurchaseReservedInstancesOfferingRequest(Builder builder) {
        super(builder);
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tag = builder.tag;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.description = builder.description;
        this.clientToken = builder.clientToken;
        this.zoneId = builder.zoneId;
        this.reservedInstanceName = builder.reservedInstanceName;
        this.periodUnit = builder.periodUnit;
        this.platform = builder.platform;
        this.scope = builder.scope;
        this.offeringType = builder.offeringType;
        this.period = builder.period;
        this.instanceType = builder.instanceType;
        this.instanceAmount = builder.instanceAmount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PurchaseReservedInstancesOfferingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return reservedInstanceName
     */
    public String getReservedInstanceName() {
        return this.reservedInstanceName;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return offeringType
     */
    public String getOfferingType() {
        return this.offeringType;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return instanceAmount
     */
    public Integer getInstanceAmount() {
        return this.instanceAmount;
    }

    public static final class Builder extends Request.Builder<PurchaseReservedInstancesOfferingRequest, Builder> {
        private Long resourceOwnerId; 
        private java.util.List < Tag> tag; 
        private String regionId; 
        private String resourceGroupId; 
        private String description; 
        private String clientToken; 
        private String zoneId; 
        private String reservedInstanceName; 
        private String periodUnit; 
        private String platform; 
        private String scope; 
        private String offeringType; 
        private Integer period; 
        private String instanceType; 
        private Integer instanceAmount; 

        private Builder() {
            super();
        } 

        private Builder(PurchaseReservedInstancesOfferingRequest response) {
            super(response);
            this.resourceOwnerId = response.resourceOwnerId;
            this.tag = response.tag;
            this.regionId = response.regionId;
            this.resourceGroupId = response.resourceGroupId;
            this.description = response.description;
            this.clientToken = response.clientToken;
            this.zoneId = response.zoneId;
            this.reservedInstanceName = response.reservedInstanceName;
            this.periodUnit = response.periodUnit;
            this.platform = response.platform;
            this.scope = response.scope;
            this.offeringType = response.offeringType;
            this.period = response.period;
            this.instanceType = response.instanceType;
            this.instanceAmount = response.instanceAmount;
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
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The ID of the region to which the instance belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The description of the reserved instance. The description must be 2 to 256 characters in length and cannot start with http:// or https.
         * <p>
         * 
         * Default value: Null.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
         * The ID of the zone to which the instance belongs. This parameter is required when "Scope" is "Zone. For more information, see [DescribeZones](~~ 25610 ~~) for a list of zones.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * The name of the reserved instance. The description must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https. It can contain numbers, colons (:), underscores (_), and hyphens (-).
         */
        public Builder reservedInstanceName(String reservedInstanceName) {
            this.putQueryParameter("ReservedInstanceName", reservedInstanceName);
            this.reservedInstanceName = reservedInstanceName;
            return this;
        }

        /**
         * The unit of the subscription period. Valid values: Year
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * The operating system type of the image used by the instance. Valid values:
         * <p>
         * 
         * -Windows:Windows Server-type operating system.
         * -Linux (default):Linux and Unix-like operating systems.
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * The range of Reserved Instances. Valid values:
         * <p>
         * 
         * -Region: Region
         * -Zone: Zone
         * 
         * Default value: Region
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * The Payment type of the reserved instance. Valid values:
         * <p>
         * 
         * -No Upfront: zero prepaid
         * -Partial Upfront: Partial prepaid
         * -All Upfront (default): Full prepaid
         */
        public Builder offeringType(String offeringType) {
            this.putQueryParameter("OfferingType", offeringType);
            this.offeringType = offeringType;
            return this;
        }

        /**
         * Purchase Reserved Instances voucher length. Value range:{1, 3}
         * <p>
         * 
         * Default value: 1.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The type of the instance. For more details, see [instance dimension family](~~ 25378 ~~).
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * Reserved Instances can match the number of pay-as-you-go instances of the same specification. Valid values: 1 to 50.
         * <p>
         * 
         * For example, instance dimension is set to ecs.g5.large, reserved instance number is set to 3, the reserved instance voucher can be simultaneously match 3 table dimension for ecs.g5.large the quantity pay instance.
         */
        public Builder instanceAmount(Integer instanceAmount) {
            this.putQueryParameter("InstanceAmount", instanceAmount);
            this.instanceAmount = instanceAmount;
            return this;
        }

        @Override
        public PurchaseReservedInstancesOfferingRequest build() {
            return new PurchaseReservedInstancesOfferingRequest(this);
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
             * 预留实例券的标签键。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 预留实例券的标签值。
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
