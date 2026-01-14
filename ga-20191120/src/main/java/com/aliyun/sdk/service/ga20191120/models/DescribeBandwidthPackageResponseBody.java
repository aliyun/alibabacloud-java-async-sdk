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
 * {@link DescribeBandwidthPackageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBandwidthPackageResponseBody</p>
 */
public class DescribeBandwidthPackageResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private DescribeBandwidthPackageResponseBody(Builder builder) {
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
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.state = builder.state;
        this.tags = builder.tags;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBandwidthPackageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private String requestId; 
        private String resourceGroupId; 
        private String state; 
        private java.util.List<Tags> tags; 
        private String type; 

        private Builder() {
        } 

        private Builder(DescribeBandwidthPackageResponseBody model) {
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
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.state = model.state;
            this.tags = model.tags;
            this.type = model.type;
        } 

        /**
         * <p>The ID of the GA instance that is associated with the bandwidth plan.</p>
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
         * <li><strong>Basic</strong>: basic bandwidth</li>
         * <li><strong>Enhanced</strong>: enhanced bandwidth</li>
         * <li><strong>Advanced</strong>: premium bandwidth</li>
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
         * <p>The metering method that is used when you use the pay-as-you-go billing method. Valid values:</p>
         * <ul>
         * <li><strong>PayByTraffic</strong>: pay-by-data-transfer</li>
         * <li><strong>PayBY95</strong>: pay-by-95th-percentile</li>
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
         * <p>Area A specified in the cross-region acceleration bandwidth plan. Only <strong>China-mainland</strong> (the Chinese mainland) is returned.</p>
         * <p>This parameter is returned only if you call this operation on the International site (alibabacloud.com).</p>
         * 
         * <strong>example:</strong>
         * <p>China-mainland</p>
         */
        public Builder cbnGeographicRegionIdA(String cbnGeographicRegionIdA) {
            this.cbnGeographicRegionIdA = cbnGeographicRegionIdA;
            return this;
        }

        /**
         * <p>Area B specified in the cross-region acceleration bandwidth plan. Only <strong>Global</strong> (global) is returned.</p>
         * <p>This parameter is returned only if you call this operation on the International site (alibabacloud.com).</p>
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
         * <p>The timestamp that indicates when the bandwidth plan was created.</p>
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
         * <p>The timestamp that indicates when the bandwidth plan expires.</p>
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
         * <p>The percentage of the minimum bandwidth guaranteed if the pay-by-95th-percentile-bandwidth metering method is used. Valid values: <strong>30</strong> to <strong>100</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder ratio(Integer ratio) {
            this.ratio = ratio;
            return this;
        }

        /**
         * <p>The ID of the region where GA instance is deployed. <strong>cn-hangzhou</strong> is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
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
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfnvueepcihjiq</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The state of the bandwidth plan. Valid values:</p>
         * <ul>
         * <li><strong>init</strong>: The bandwidth plan is being initialized.</li>
         * <li><strong>active</strong>: The bandwidth plan is available.</li>
         * <li><strong>binded</strong>: The bandwidth plan is associated with a GA instance.</li>
         * <li><strong>binding</strong>: The bandwidth plan is being associated.</li>
         * <li><strong>unbinding</strong>: The bandwidth plan is being disassociated.</li>
         * <li><strong>updating</strong>: The bandwidth plan is being updated.</li>
         * <li><strong>finacialLocked</strong>: The bandwidth plan is locked due to overdue payments.</li>
         * <li><strong>Locked</strong>: The bandwidth plan is locked.</li>
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
         * <p>Tag objects.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The type of the bandwidth plan. Valid values:</p>
         * <ul>
         * <li><strong>Basic</strong>: a basic bandwidth plan</li>
         * <li><strong>CrossDomain</strong>: a cross-region acceleration bandwidth plan</li>
         * </ul>
         * <p>If you call this operation on the Alibaba Cloud China Site (aliyun.com), only <strong>Basic</strong> is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Basic</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DescribeBandwidthPackageResponseBody build() {
            return new DescribeBandwidthPackageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBandwidthPackageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBandwidthPackageResponseBody</p>
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
             * <p>The key of tag N that is added to the bandwidth plan.</p>
             * 
             * <strong>example:</strong>
             * <p>tag-key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N that is added to the bandwidth plan.</p>
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
}
