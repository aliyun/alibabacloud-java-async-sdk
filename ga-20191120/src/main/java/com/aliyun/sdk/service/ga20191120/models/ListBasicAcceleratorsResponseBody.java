// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
 * {@link ListBasicAcceleratorsResponseBody} extends {@link TeaModel}
 *
 * <p>ListBasicAcceleratorsResponseBody</p>
 */
public class ListBasicAcceleratorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accelerators")
    private java.util.List<Accelerators> accelerators;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accelerators
     */
    public java.util.List<Accelerators> getAccelerators() {
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
        private java.util.List<Accelerators> accelerators; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListBasicAcceleratorsResponseBody model) {
            this.accelerators = model.accelerators;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The information about basic GA instances.</p>
         */
        public Builder accelerators(java.util.List<Accelerators> accelerators) {
            this.accelerators = accelerators;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>54B48E3D-DF70-471B-AA93-08E683A1B45</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of basic GA instances returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListBasicAcceleratorsResponseBody build() {
            return new ListBasicAcceleratorsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListBasicAcceleratorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListBasicAcceleratorsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(BasicBandwidthPackage model) {
                this.bandwidth = model.bandwidth;
                this.bandwidthType = model.bandwidthType;
                this.instanceId = model.instanceId;
            } 

            /**
             * <p>The bandwidth value of the basic bandwidth plan. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The type of the bandwidth that is provided by the basic bandwidth plan.</p>
             * <ul>
             * <li><strong>Basic</strong>: basic</li>
             * <li><strong>Enhanced</strong>: enhanced</li>
             * <li><strong>Advanced</strong>: premium</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Basic</p>
             */
            public Builder bandwidthType(String bandwidthType) {
                this.bandwidthType = bandwidthType;
                return this;
            }

            /**
             * <p>The ID of the basic bandwidth plan.</p>
             * 
             * <strong>example:</strong>
             * <p>gbwp-bp1d8xk8bg139j0fw****</p>
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
    /**
     * 
     * {@link ListBasicAcceleratorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListBasicAcceleratorsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(CrossDomainBandwidthPackage model) {
                this.bandwidth = model.bandwidth;
                this.instanceId = model.instanceId;
            } 

            /**
             * <p>The bandwidth value of the cross-region acceleration bandwidth plan. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The ID of the cross-region acceleration bandwidth plan.</p>
             * 
             * <strong>example:</strong>
             * <p>gbwp-bp1d8xk8bg139j0fw****</p>
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
    /**
     * 
     * {@link ListBasicAcceleratorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListBasicAcceleratorsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the basic GA instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Keytest</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the basic GA instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Valuetest</p>
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
    /**
     * 
     * {@link ListBasicAcceleratorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListBasicAcceleratorsResponseBody</p>
     */
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
        private java.util.List<Tags> tags;

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
        public java.util.List<Tags> getTags() {
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
            private java.util.List<Tags> tags; 
            private String type; 

            private Builder() {
            } 

            private Builder(Accelerators model) {
                this.acceleratorId = model.acceleratorId;
                this.bandwidthBillingType = model.bandwidthBillingType;
                this.basicBandwidthPackage = model.basicBandwidthPackage;
                this.basicEndpointGroupId = model.basicEndpointGroupId;
                this.basicIpSetId = model.basicIpSetId;
                this.createTime = model.createTime;
                this.crossBorderStatus = model.crossBorderStatus;
                this.crossDomainBandwidthPackage = model.crossDomainBandwidthPackage;
                this.description = model.description;
                this.expiredTime = model.expiredTime;
                this.instanceChargeType = model.instanceChargeType;
                this.name = model.name;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.state = model.state;
                this.tags = model.tags;
                this.type = model.type;
            } 

            /**
             * <p>The ID of the basic GA instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ga-bp17frjjh0udz4qz****</p>
             */
            public Builder acceleratorId(String acceleratorId) {
                this.acceleratorId = acceleratorId;
                return this;
            }

            /**
             * <p>The bandwidth billing method.</p>
             * <ul>
             * <li><strong>BandwidthPackage</strong>: billed based on bandwidth plans.</li>
             * <li><strong>CDT</strong>: billed through Cloud Data Transfer (CDT) and based on data transfer.</li>
             * <li><strong>CDT95</strong>: billed through CDT and based on the 95th percentile bandwidth. This bandwidth billing method is available only for users that are included in the whitelist.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BandwidthPackage</p>
             */
            public Builder bandwidthBillingType(String bandwidthBillingType) {
                this.bandwidthBillingType = bandwidthBillingType;
                return this;
            }

            /**
             * <p>Details about the basic bandwidth plan that is associated with the basic GA instance.</p>
             */
            public Builder basicBandwidthPackage(BasicBandwidthPackage basicBandwidthPackage) {
                this.basicBandwidthPackage = basicBandwidthPackage;
                return this;
            }

            /**
             * <p>The ID of the endpoint group that is associated with the basic GA instance.</p>
             * 
             * <strong>example:</strong>
             * <p>epg-bp1dmlohjjz4kqaun****</p>
             */
            public Builder basicEndpointGroupId(String basicEndpointGroupId) {
                this.basicEndpointGroupId = basicEndpointGroupId;
                return this;
            }

            /**
             * <p>The ID of the acceleration region where the basic GA instance is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>ips-bp11ilwqjdkjeg9r7****</p>
             */
            public Builder basicIpSetId(String basicIpSetId) {
                this.basicIpSetId = basicIpSetId;
                return this;
            }

            /**
             * <p>The timestamp that indicates when the basic GA instance was created.</p>
             * <p>The time follows the UNIX time format. It is the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1637734547</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Indicates whether cross-border acceleration is enabled for the GA instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder crossBorderStatus(Boolean crossBorderStatus) {
                this.crossBorderStatus = crossBorderStatus;
                return this;
            }

            /**
             * <p>Details about the cross-region acceleration bandwidth plan that is associated with the GA instance.</p>
             * <p>This parameter is returned only when you call this operation on the International site (alibabacloud.com).</p>
             */
            public Builder crossDomainBandwidthPackage(CrossDomainBandwidthPackage crossDomainBandwidthPackage) {
                this.crossDomainBandwidthPackage = crossDomainBandwidthPackage;
                return this;
            }

            /**
             * <p>The description of the basic GA instance.</p>
             * 
             * <strong>example:</strong>
             * <p>BasicAccelerator</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The timestamp that indicates when the basic GA instance expires.</p>
             * <p>The time follows the UNIX time format. It is the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1640326547</p>
             */
            public Builder expiredTime(Long expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The billing method of the basic GA instance. Only <strong>PREPAY</strong> is returned, which indicates the subscription billing method.</p>
             * 
             * <strong>example:</strong>
             * <p>PREPAY</p>
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * <p>The name of the basic GA instance.</p>
             * 
             * <strong>example:</strong>
             * <p>BasicAccelerator</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the region where the basic GA instance is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the basic GA instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aekzrnd67gq****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The state of the basic GA instance.</p>
             * <ul>
             * <li><strong>init</strong>: The basic GA instance is being initialized.</li>
             * <li><strong>active</strong>: The basic GA instance is available.</li>
             * <li><strong>configuring</strong>: The basic GA instance is being configured.</li>
             * <li><strong>binding</strong>: The basic GA instance is being associated.</li>
             * <li><strong>unbinding</strong>: The GA instance is being disassociated.</li>
             * <li><strong>deleting</strong>: The basic GA instance is being deleted.</li>
             * <li><strong>finacialLocked</strong>: The basic GA instance is locked due to overdue payments.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The tags of the basic GA instance.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>This parameter is invalid.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
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
