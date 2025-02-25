// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBasicAcceleratorsResponseBody} extends {@link TeaModel}
 *
 * <p>ListBasicAcceleratorsResponseBody</p>
 */
public class ListBasicAcceleratorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accelerators")
    private java.util.List < Accelerators> accelerators;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListBasicAcceleratorsResponseBody(Builder builder) {
        this.accelerators = builder.accelerators;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBasicAcceleratorsResponseBody create() {
        return builder().build();
    }

    /**
     * @return accelerators
     */
    public java.util.List < Accelerators> getAccelerators() {
        return this.accelerators;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Accelerators> accelerators; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The information about basic GA instances.
         */
        public Builder accelerators(java.util.List < Accelerators> accelerators) {
            this.accelerators = accelerators;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * The total number of basic GA instances returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListBasicAcceleratorsResponseBody build() {
            return new ListBasicAcceleratorsResponseBody(this);
        } 

    } 

    public static class BasicBandwidthPackage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("BandwidthType")
        private String bandwidthType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
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
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
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
             * The bandwidth value of the cross-region acceleration bandwidth plan. Unit: Mbit/s.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The ID of the cross-region acceleration bandwidth plan.
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
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
    public static class Accelerators extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcceleratorId")
        private String acceleratorId;

        @com.aliyun.core.annotation.NameInMap("BandwidthBillingType")
        private String bandwidthBillingType;

        @com.aliyun.core.annotation.NameInMap("BasicBandwidthPackage")
        private BasicBandwidthPackage basicBandwidthPackage;

        @com.aliyun.core.annotation.NameInMap("BasicEndpointGroupId")
        private String basicEndpointGroupId;

        @com.aliyun.core.annotation.NameInMap("BasicIpSetId")
        private String basicIpSetId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CrossBorderStatus")
        private Boolean crossBorderStatus;

        @com.aliyun.core.annotation.NameInMap("CrossDomainBandwidthPackage")
        private CrossDomainBandwidthPackage crossDomainBandwidthPackage;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private Long expiredTime;

        @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Accelerators(Builder builder) {
            this.acceleratorId = builder.acceleratorId;
            this.bandwidthBillingType = builder.bandwidthBillingType;
            this.basicBandwidthPackage = builder.basicBandwidthPackage;
            this.basicEndpointGroupId = builder.basicEndpointGroupId;
            this.basicIpSetId = builder.basicIpSetId;
            this.createTime = builder.createTime;
            this.crossBorderStatus = builder.crossBorderStatus;
            this.crossDomainBandwidthPackage = builder.crossDomainBandwidthPackage;
            this.description = builder.description;
            this.expiredTime = builder.expiredTime;
            this.instanceChargeType = builder.instanceChargeType;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.state = builder.state;
            this.tags = builder.tags;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Accelerators create() {
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

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String acceleratorId; 
            private String bandwidthBillingType; 
            private BasicBandwidthPackage basicBandwidthPackage; 
            private String basicEndpointGroupId; 
            private String basicIpSetId; 
            private Long createTime; 
            private Boolean crossBorderStatus; 
            private CrossDomainBandwidthPackage crossDomainBandwidthPackage; 
            private String description; 
            private Long expiredTime; 
            private String instanceChargeType; 
            private String name; 
            private String regionId; 
            private String resourceGroupId; 
            private String state; 
            private java.util.List < Tags> tags; 
            private String type; 

            /**
             * The ID of the basic GA instance.
             */
            public Builder acceleratorId(String acceleratorId) {
                this.acceleratorId = acceleratorId;
                return this;
            }

            /**
             * The bandwidth billing method.
             * <p>
             * 
             * *   **BandwidthPackage**: billed based on bandwidth plans.
             * *   **CDT**: billed through Cloud Data Transfer (CDT) and based on data transfer.
             * *   **CDT95**: billed through CDT and based on the 95th percentile bandwidth. This bandwidth billing method is available only for users that are included in the whitelist.
             */
            public Builder bandwidthBillingType(String bandwidthBillingType) {
                this.bandwidthBillingType = bandwidthBillingType;
                return this;
            }

            /**
             * Details about the basic bandwidth plan that is associated with the basic GA instance.
             */
            public Builder basicBandwidthPackage(BasicBandwidthPackage basicBandwidthPackage) {
                this.basicBandwidthPackage = basicBandwidthPackage;
                return this;
            }

            /**
             * The ID of the endpoint group that is associated with the basic GA instance.
             */
            public Builder basicEndpointGroupId(String basicEndpointGroupId) {
                this.basicEndpointGroupId = basicEndpointGroupId;
                return this;
            }

            /**
             * The ID of the acceleration region where the basic GA instance is deployed.
             */
            public Builder basicIpSetId(String basicIpSetId) {
                this.basicIpSetId = basicIpSetId;
                return this;
            }

            /**
             * The timestamp that indicates when the basic GA instance was created.
             * <p>
             * 
             * The time follows the UNIX time format. It is the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Indicates whether cross-border acceleration is enabled for the GA instance. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder crossBorderStatus(Boolean crossBorderStatus) {
                this.crossBorderStatus = crossBorderStatus;
                return this;
            }

            /**
             * Details about the cross-region acceleration bandwidth plan that is associated with the GA instance.
             * <p>
             * 
             * This parameter is returned only when you call this operation on the International site (alibabacloud.com).
             */
            public Builder crossDomainBandwidthPackage(CrossDomainBandwidthPackage crossDomainBandwidthPackage) {
                this.crossDomainBandwidthPackage = crossDomainBandwidthPackage;
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
             * The ID of the resource group to which the basic GA instance belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The state of the basic GA instance.
             * <p>
             * 
             * *   **init**: The basic GA instance is being initialized.
             * *   **active**: The basic GA instance is available.
             * *   **configuring**: The basic GA instance is being configured.
             * *   **binding**: The basic GA instance is being associated.
             * *   **unbinding**: The GA instance is being disassociated.
             * *   **deleting**: The basic GA instance is being deleted.
             * *   **finacialLocked**: The basic GA instance is locked due to overdue payments.
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

            /**
             * This parameter is invalid.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Accelerators build() {
                return new Accelerators(this);
            } 

        } 

    }
}
