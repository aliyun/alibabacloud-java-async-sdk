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
 * {@link ListBandwidthPackagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListBandwidthPackagesResponseBody</p>
 */
public class ListBandwidthPackagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BandwidthPackages")
    private java.util.List<BandwidthPackages> bandwidthPackages;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListBandwidthPackagesResponseBody(Builder builder) {
        this.bandwidthPackages = builder.bandwidthPackages;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBandwidthPackagesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bandwidthPackages
     */
    public java.util.List<BandwidthPackages> getBandwidthPackages() {
        return this.bandwidthPackages;
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
        private java.util.List<BandwidthPackages> bandwidthPackages; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListBandwidthPackagesResponseBody model) {
            this.bandwidthPackages = model.bandwidthPackages;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The details of the bandwidth plans.</p>
         */
        public Builder bandwidthPackages(java.util.List<BandwidthPackages> bandwidthPackages) {
            this.bandwidthPackages = bandwidthPackages;
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
         * <p>4B6DBBB0-2D01-4C6A-A384-4129266E6B78</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListBandwidthPackagesResponseBody build() {
            return new ListBandwidthPackagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListBandwidthPackagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListBandwidthPackagesResponseBody</p>
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
             * <p>The tag key of the bandwidth plan.</p>
             * 
             * <strong>example:</strong>
             * <p>tag-key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the bandwidth plan.</p>
             * 
             * <strong>example:</strong>
             * <p>tag-value</p>
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
     * {@link ListBandwidthPackagesResponseBody} extends {@link TeaModel}
     *
     * <p>ListBandwidthPackagesResponseBody</p>
     */
    public static class BandwidthPackages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Accelerators")
        private java.util.List<String> accelerators;

        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("BandwidthPackageId")
        private String bandwidthPackageId;

        @com.aliyun.core.annotation.NameInMap("BandwidthType")
        private String bandwidthType;

        @com.aliyun.core.annotation.NameInMap("BillingType")
        private String billingType;

        @com.aliyun.core.annotation.NameInMap("CbnGeographicRegionIdA")
        private String cbnGeographicRegionIdA;

        @com.aliyun.core.annotation.NameInMap("CbnGeographicRegionIdB")
        private String cbnGeographicRegionIdB;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Ratio")
        private Integer ratio;

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

        private BandwidthPackages(Builder builder) {
            this.accelerators = builder.accelerators;
            this.bandwidth = builder.bandwidth;
            this.bandwidthPackageId = builder.bandwidthPackageId;
            this.bandwidthType = builder.bandwidthType;
            this.billingType = builder.billingType;
            this.cbnGeographicRegionIdA = builder.cbnGeographicRegionIdA;
            this.cbnGeographicRegionIdB = builder.cbnGeographicRegionIdB;
            this.chargeType = builder.chargeType;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.expiredTime = builder.expiredTime;
            this.name = builder.name;
            this.ratio = builder.ratio;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.state = builder.state;
            this.tags = builder.tags;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BandwidthPackages create() {
            return builder().build();
        }

        /**
         * @return accelerators
         */
        public java.util.List<String> getAccelerators() {
            return this.accelerators;
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return bandwidthPackageId
         */
        public String getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

        /**
         * @return bandwidthType
         */
        public String getBandwidthType() {
            return this.bandwidthType;
        }

        /**
         * @return billingType
         */
        public String getBillingType() {
            return this.billingType;
        }

        /**
         * @return cbnGeographicRegionIdA
         */
        public String getCbnGeographicRegionIdA() {
            return this.cbnGeographicRegionIdA;
        }

        /**
         * @return cbnGeographicRegionIdB
         */
        public String getCbnGeographicRegionIdB() {
            return this.cbnGeographicRegionIdB;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ratio
         */
        public Integer getRatio() {
            return this.ratio;
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
            private java.util.List<String> accelerators; 
            private Integer bandwidth; 
            private String bandwidthPackageId; 
            private String bandwidthType; 
            private String billingType; 
            private String cbnGeographicRegionIdA; 
            private String cbnGeographicRegionIdB; 
            private String chargeType; 
            private String createTime; 
            private String description; 
            private String expiredTime; 
            private String name; 
            private Integer ratio; 
            private String regionId; 
            private String resourceGroupId; 
            private String state; 
            private java.util.List<Tags> tags; 
            private String type; 

            private Builder() {
            } 

            private Builder(BandwidthPackages model) {
                this.accelerators = model.accelerators;
                this.bandwidth = model.bandwidth;
                this.bandwidthPackageId = model.bandwidthPackageId;
                this.bandwidthType = model.bandwidthType;
                this.billingType = model.billingType;
                this.cbnGeographicRegionIdA = model.cbnGeographicRegionIdA;
                this.cbnGeographicRegionIdB = model.cbnGeographicRegionIdB;
                this.chargeType = model.chargeType;
                this.createTime = model.createTime;
                this.description = model.description;
                this.expiredTime = model.expiredTime;
                this.name = model.name;
                this.ratio = model.ratio;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.state = model.state;
                this.tags = model.tags;
                this.type = model.type;
            } 

            /**
             * <p>The IDs of the GA instances that are associated with the bandwidth plans.</p>
             */
            public Builder accelerators(java.util.List<String> accelerators) {
                this.accelerators = accelerators;
                return this;
            }

            /**
             * <p>The bandwidth value of the bandwidth plan. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The ID of the bandwidth plan.</p>
             * 
             * <strong>example:</strong>
             * <p>gbwp-bp1sgzldyj6b4q7cx****</p>
             */
            public Builder bandwidthPackageId(String bandwidthPackageId) {
                this.bandwidthPackageId = bandwidthPackageId;
                return this;
            }

            /**
             * <p>The type of the bandwidth. Valid values:</p>
             * <ul>
             * <li><strong>Basic</strong></li>
             * <li><strong>Enhanced</strong></li>
             * <li><strong>Advanced</strong></li>
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
             * <p>The metering method that is used when you use the pay-as-you-go billing method.</p>
             * <ul>
             * <li><strong>PayByTraffic</strong>: pay-by-data-transfer.</li>
             * <li><strong>PayBY95</strong>: pay-by-95th-percentile.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PayByTraffic</p>
             */
            public Builder billingType(String billingType) {
                this.billingType = billingType;
                return this;
            }

            /**
             * <p>Area A of the cross-region acceleration bandwidth plan. <strong>China-mainland</strong> is returned.</p>
             * <p>This parameter is returned only if you call the operation on the international site (alibabacloud.com).</p>
             * 
             * <strong>example:</strong>
             * <p>China-mainland</p>
             */
            public Builder cbnGeographicRegionIdA(String cbnGeographicRegionIdA) {
                this.cbnGeographicRegionIdA = cbnGeographicRegionIdA;
                return this;
            }

            /**
             * <p>Area B of the cross-region acceleration bandwidth plan. <strong>Global</strong> is returned.</p>
             * <p>This parameter is returned only if you call the operation on the international site (alibabacloud.com).</p>
             * 
             * <strong>example:</strong>
             * <p>Global</p>
             */
            public Builder cbnGeographicRegionIdB(String cbnGeographicRegionIdB) {
                this.cbnGeographicRegionIdB = cbnGeographicRegionIdB;
                return this;
            }

            /**
             * <p>The billing method of the bandwidth plan.</p>
             * <ul>
             * <li><strong>PREPAY</strong>: subscription. This is the default value.</li>
             * <li><strong>POSTPAY</strong>: pay-as-you-go.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PREPAY</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The time when the bandwidth plan was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1578966918000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the bandwidth plan.</p>
             * 
             * <strong>example:</strong>
             * <p>testDescription</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The expiration time of the bandwidth plan.</p>
             * 
             * <strong>example:</strong>
             * <p>1578966918000</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The name of the bandwidth plan.</p>
             * 
             * <strong>example:</strong>
             * <p>testName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The percentage of the guaranteed minimum bandwidth if the pay-by-95th-percentile metering method is used.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder ratio(Integer ratio) {
                this.ratio = ratio;
                return this;
            }

            /**
             * <p>The ID of the region where the GA instance is deployed. <strong>cn-hangzhou</strong> is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek2ry6mp2c****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The status of the bandwidth plan. Valid values:</p>
             * <ul>
             * <li><strong>init:</strong> The bandwidth plan is being initialized.</li>
             * <li><strong>active:</strong> The bandwidth plan is available.</li>
             * <li><strong>binded:</strong> The bandwidth plan is associated with a GA instance.</li>
             * <li><strong>binding:</strong> The bandwidth plan is being associated with a GA instance.</li>
             * <li><strong>unbinding:</strong> The bandwidth plan is being disassociated from a GA instance.</li>
             * <li><strong>updating:</strong> The bandwidth plan is being updated.</li>
             * <li><strong>finacialLocked:</strong> The bandwidth plan is locked due to overdue payments.</li>
             * <li><strong>locked</strong>: The bandwidth plan is locked.</li>
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
             * <p>The tag of the bandwidth plan.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The type of the bandwidth plan. Valid values:</p>
             * <ul>
             * <li><strong>Basic:</strong> a basic bandwidth plan.</li>
             * <li><strong>CrossDomain:</strong> a cross-region acceleration bandwidth plan.</li>
             * </ul>
             * <p>If you call the operation on the China site (aliyun.com), <strong>Basic</strong> is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>Basic</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public BandwidthPackages build() {
                return new BandwidthPackages(this);
            } 

        } 

    }
}
