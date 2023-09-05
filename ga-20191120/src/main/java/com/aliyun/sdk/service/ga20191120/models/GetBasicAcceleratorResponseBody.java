// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBasicAcceleratorResponseBody} extends {@link TeaModel}
 *
 * <p>GetBasicAcceleratorResponseBody</p>
 */
public class GetBasicAcceleratorResponseBody extends TeaModel {
    @NameInMap("AcceleratorId")
    private String acceleratorId;

    @NameInMap("BandwidthBillingType")
    private String bandwidthBillingType;

    @NameInMap("BasicBandwidthPackage")
    private BasicBandwidthPackage basicBandwidthPackage;

    @NameInMap("BasicEndpointGroupId")
    private String basicEndpointGroupId;

    @NameInMap("BasicIpSetId")
    private String basicIpSetId;

    @NameInMap("CenId")
    private String cenId;

    @NameInMap("CreateTime")
    private Long createTime;

    @NameInMap("CrossBorderStatus")
    private Boolean crossBorderStatus;

    @NameInMap("CrossDomainBandwidthPackage")
    private CrossDomainBandwidthPackage crossDomainBandwidthPackage;

    @NameInMap("CrossPrivateState")
    private String crossPrivateState;

    @NameInMap("Description")
    private String description;

    @NameInMap("ExpiredTime")
    private Long expiredTime;

    @NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @NameInMap("Name")
    private String name;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("State")
    private String state;

    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    private GetBasicAcceleratorResponseBody(Builder builder) {
        this.acceleratorId = builder.acceleratorId;
        this.bandwidthBillingType = builder.bandwidthBillingType;
        this.basicBandwidthPackage = builder.basicBandwidthPackage;
        this.basicEndpointGroupId = builder.basicEndpointGroupId;
        this.basicIpSetId = builder.basicIpSetId;
        this.cenId = builder.cenId;
        this.createTime = builder.createTime;
        this.crossBorderStatus = builder.crossBorderStatus;
        this.crossDomainBandwidthPackage = builder.crossDomainBandwidthPackage;
        this.crossPrivateState = builder.crossPrivateState;
        this.description = builder.description;
        this.expiredTime = builder.expiredTime;
        this.instanceChargeType = builder.instanceChargeType;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.state = builder.state;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBasicAcceleratorResponseBody create() {
        return builder().build();
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return bandwidthBillingType
     */
    public String getBandwidthBillingType() {
        return this.bandwidthBillingType;
    }

    /**
     * @return basicBandwidthPackage
     */
    public BasicBandwidthPackage getBasicBandwidthPackage() {
        return this.basicBandwidthPackage;
    }

    /**
     * @return basicEndpointGroupId
     */
    public String getBasicEndpointGroupId() {
        return this.basicEndpointGroupId;
    }

    /**
     * @return basicIpSetId
     */
    public String getBasicIpSetId() {
        return this.basicIpSetId;
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return crossBorderStatus
     */
    public Boolean getCrossBorderStatus() {
        return this.crossBorderStatus;
    }

    /**
     * @return crossDomainBandwidthPackage
     */
    public CrossDomainBandwidthPackage getCrossDomainBandwidthPackage() {
        return this.crossDomainBandwidthPackage;
    }

    /**
     * @return crossPrivateState
     */
    public String getCrossPrivateState() {
        return this.crossPrivateState;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return expiredTime
     */
    public Long getExpiredTime() {
        return this.expiredTime;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    public static final class Builder {
        private String acceleratorId; 
        private String bandwidthBillingType; 
        private BasicBandwidthPackage basicBandwidthPackage; 
        private String basicEndpointGroupId; 
        private String basicIpSetId; 
        private String cenId; 
        private Long createTime; 
        private Boolean crossBorderStatus; 
        private CrossDomainBandwidthPackage crossDomainBandwidthPackage; 
        private String crossPrivateState; 
        private String description; 
        private Long expiredTime; 
        private String instanceChargeType; 
        private String name; 
        private String regionId; 
        private String requestId; 
        private String resourceGroupId; 
        private String state; 
        private java.util.List < Tags> tags; 

        /**
         * The ID of the basic GA instance.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * The bandwidth metering method.
         * <p>
         * 
         * *   **BandwidthPackage**: billed based on bandwidth plans.
         * *   **CDT**: billed by Cloud Data Transfer (CDT) and based on data transfer.
         * *   **CDT95**: billed by CDT and based on the 95th percentile bandwidth. This bandwidth metering method is available only to users that are included in the whitelist.
         */
        public Builder bandwidthBillingType(String bandwidthBillingType) {
            this.bandwidthBillingType = bandwidthBillingType;
            return this;
        }

        /**
         * The details about the basic bandwidth plan that is associated with the basic GA instance.
         */
        public Builder basicBandwidthPackage(BasicBandwidthPackage basicBandwidthPackage) {
            this.basicBandwidthPackage = basicBandwidthPackage;
            return this;
        }

        /**
         * The ID of the endpoint group.
         */
        public Builder basicEndpointGroupId(String basicEndpointGroupId) {
            this.basicEndpointGroupId = basicEndpointGroupId;
            return this;
        }

        /**
         * The ID of the acceleration region.
         */
        public Builder basicIpSetId(String basicIpSetId) {
            this.basicIpSetId = basicIpSetId;
            return this;
        }

        /**
         * The ID of the Cloud Enterprise Network (CEN) instance to which the basic GA instance is attached.
         */
        public Builder cenId(String cenId) {
            this.cenId = cenId;
            return this;
        }

        /**
         * The timestamp that indicates when the basic GA instance is created.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * 基础型全球加速实例是否开启跨境线路功能。取值：
         * <p>
         * 
         * - **true**：开启跨境线路功能，可以加速跨境线路。
         * 
         * - **false**：关闭跨境线路功能，不可以加速跨境线路。
         */
        public Builder crossBorderStatus(Boolean crossBorderStatus) {
            this.crossBorderStatus = crossBorderStatus;
            return this;
        }

        /**
         * The details about the cross-border acceleration bandwidth plan that is associated with the GA instance.
         * <p>
         * 
         * This array is returned only for GA instances that are created on the international site (alibabacloud.com).
         */
        public Builder crossDomainBandwidthPackage(CrossDomainBandwidthPackage crossDomainBandwidthPackage) {
            this.crossDomainBandwidthPackage = crossDomainBandwidthPackage;
            return this;
        }

        /**
         * Indicates whether cross-border acceleration is enabled.
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         */
        public Builder crossPrivateState(String crossPrivateState) {
            this.crossPrivateState = crossPrivateState;
            return this;
        }

        /**
         * The description of the basic GA instance.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The timestamp that indicates when the basic GA instance expires.
         * <p>
         * 
         * The time follows the UNIX time format. It is the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
         */
        public Builder expiredTime(Long expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * The billing method of the basic GA instance. Only **PREPAY** is returned, which indicates the subscription billing method.
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * The name of the basic GA instance.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The ID of the region where the basic GA instance is deployed.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the resource group to which the basic GA instance belongs.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The status of the basic GA instance.
         * <p>
         * 
         * *   **init**: The GA instance is being initialized.
         * *   **active**: The GA instance is available.
         * *   **configuring**: The GA instance is being configured.
         * *   **binding**: The GA instance is being associated.
         * *   **unbinding**: The GA instance is being disassociated.
         * *   **deleting**: The GA instance is being deleted.
         * *   **finacialLocked**: The GA instance is locked due to overdue payments.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * The tags of the basic GA instance.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.tags = tags;
            return this;
        }

        public GetBasicAcceleratorResponseBody build() {
            return new GetBasicAcceleratorResponseBody(this);
        } 

    } 

    public static class BasicBandwidthPackage extends TeaModel {
        @NameInMap("Bandwidth")
        private Integer bandwidth;

        @NameInMap("BandwidthType")
        private String bandwidthType;

        @NameInMap("InstanceId")
        private String instanceId;

        private BasicBandwidthPackage(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.bandwidthType = builder.bandwidthType;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BasicBandwidthPackage create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return bandwidthType
         */
        public String getBandwidthType() {
            return this.bandwidthType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private Integer bandwidth; 
            private String bandwidthType; 
            private String instanceId; 

            /**
             * The bandwidth value of the basic bandwidth plan. Unit: Mbit/s.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The type of the bandwidth that is provided by the basic bandwidth plan.
             * <p>
             * 
             * *   **Basic**: basic
             * *   **Enhanced**: enhanced
             * *   **Advanced**: premium
             */
            public Builder bandwidthType(String bandwidthType) {
                this.bandwidthType = bandwidthType;
                return this;
            }

            /**
             * The ID of the basic bandwidth plan.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public BasicBandwidthPackage build() {
                return new BasicBandwidthPackage(this);
            } 

        } 

    }
    public static class CrossDomainBandwidthPackage extends TeaModel {
        @NameInMap("Bandwidth")
        private Integer bandwidth;

        @NameInMap("InstanceId")
        private String instanceId;

        private CrossDomainBandwidthPackage(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CrossDomainBandwidthPackage create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private Integer bandwidth; 
            private String instanceId; 

            /**
             * The bandwidth value of the cross-border acceleration bandwidth plan. Unit: Mbit/s.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The ID of the cross-border acceleration bandwidth plan.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public CrossDomainBandwidthPackage build() {
                return new CrossDomainBandwidthPackage(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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
             * The tag key of the basic GA instance.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value of the basic GA instance.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
