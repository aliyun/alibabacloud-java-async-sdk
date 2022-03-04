// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    @NameInMap("ReservedInstanceName")
    private String reservedInstanceName;

    @Query
    @NameInMap("InstanceType")
    @Validation(required = true)
    private String instanceType;

    @Query
    @NameInMap("Scope")
    private String scope;

    @Query
    @NameInMap("InstanceAmount")
    @Validation(maximum = 100, minimum = 1)
    private Integer instanceAmount;

    @Query
    @NameInMap("OfferingType")
    private String offeringType;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Platform")
    private String platform;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    private PurchaseReservedInstancesOfferingRequest(Builder builder) {
        super(builder);
        this.resourceOwnerId = builder.resourceOwnerId;
        this.regionId = builder.regionId;
        this.tag = builder.tag;
        this.resourceGroupId = builder.resourceGroupId;
        this.zoneId = builder.zoneId;
        this.reservedInstanceName = builder.reservedInstanceName;
        this.instanceType = builder.instanceType;
        this.scope = builder.scope;
        this.instanceAmount = builder.instanceAmount;
        this.offeringType = builder.offeringType;
        this.description = builder.description;
        this.platform = builder.platform;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.clientToken = builder.clientToken;
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
     * @return reservedInstanceName
     */
    public String getReservedInstanceName() {
        return this.reservedInstanceName;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return instanceAmount
     */
    public Integer getInstanceAmount() {
        return this.instanceAmount;
    }

    /**
     * @return offeringType
     */
    public String getOfferingType() {
        return this.offeringType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<PurchaseReservedInstancesOfferingRequest, Builder> {
        private Long resourceOwnerId; 
        private String regionId; 
        private java.util.List < Tag> tag; 
        private String resourceGroupId; 
        private String zoneId; 
        private String reservedInstanceName; 
        private String instanceType; 
        private String scope; 
        private Integer instanceAmount; 
        private String offeringType; 
        private String description; 
        private String platform; 
        private Integer period; 
        private String periodUnit; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(PurchaseReservedInstancesOfferingRequest request) {
            super(request);
            this.resourceOwnerId = request.resourceOwnerId;
            this.regionId = request.regionId;
            this.tag = request.tag;
            this.resourceGroupId = request.resourceGroupId;
            this.zoneId = request.zoneId;
            this.reservedInstanceName = request.reservedInstanceName;
            this.instanceType = request.instanceType;
            this.scope = request.scope;
            this.instanceAmount = request.instanceAmount;
            this.offeringType = request.offeringType;
            this.description = request.description;
            this.platform = request.platform;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.clientToken = request.clientToken;
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
         * The ID of the region to which the instance belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The list of tags.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
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
         * The type of the instance. For more information, see [instance type family](~~ 25378 ~~).
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
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
         * Reserved Instances can match the number of pay-as-you-go instances of the same specification. Valid values: 1 to 50.
         * <p>
         * 
         * For example, if the instance type is set to ecs.g5.large and the number of reserved instances is set to 3, the reserved instance can match three pay-as-you-go instances of ecs.g5.large at the same time.
         */
        public Builder instanceAmount(Integer instanceAmount) {
            this.putQueryParameter("InstanceAmount", instanceAmount);
            this.instanceAmount = instanceAmount;
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
         * The duration of the reserved instance. Valid values:{1, 3}.
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
         * The unit of the subscription period. Valid values: Year
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
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
