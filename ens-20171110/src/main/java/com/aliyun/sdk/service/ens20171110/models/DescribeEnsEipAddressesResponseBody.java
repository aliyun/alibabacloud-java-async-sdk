// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeEnsEipAddressesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEnsEipAddressesResponseBody</p>
 */
public class DescribeEnsEipAddressesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EipAddresses")
    private EipAddresses eipAddresses;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeEnsEipAddressesResponseBody(Builder builder) {
        this.eipAddresses = builder.eipAddresses;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnsEipAddressesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eipAddresses
     */
    public EipAddresses getEipAddresses() {
        return this.eipAddresses;
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
        private EipAddresses eipAddresses; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeEnsEipAddressesResponseBody model) {
            this.eipAddresses = model.eipAddresses;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Details about the EIP.</p>
         */
        public Builder eipAddresses(EipAddresses eipAddresses) {
            this.eipAddresses = eipAddresses;
            return this;
        }

        /**
         * <p>The page number. Valid values: an integer that is greater than 0. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10. Valid values: <strong>10</strong> to <strong>100</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8629F679-B51D-4194-A1CC-5D8F504C362B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeEnsEipAddressesResponseBody build() {
            return new DescribeEnsEipAddressesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEnsEipAddressesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnsEipAddressesResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("TagKey")
        @Deprecated
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        @Deprecated
        private String tagValue;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
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
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String tagKey; 
            private String tagValue; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            /**
             * Value.
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
    /**
     * 
     * {@link DescribeEnsEipAddressesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnsEipAddressesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEnsEipAddressesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnsEipAddressesResponseBody</p>
     */
    public static class EipAddress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocationId")
        private String allocationId;

        @com.aliyun.core.annotation.NameInMap("AllocationTime")
        private String allocationTime;

        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("InternetChargeType")
        private String internetChargeType;

        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private String ipAddress;

        @com.aliyun.core.annotation.NameInMap("IpStatus")
        private String ipStatus;

        @com.aliyun.core.annotation.NameInMap("Isp")
        private String isp;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Standby")
        private Boolean standby;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        private EipAddress(Builder builder) {
            this.allocationId = builder.allocationId;
            this.allocationTime = builder.allocationTime;
            this.bandwidth = builder.bandwidth;
            this.chargeType = builder.chargeType;
            this.description = builder.description;
            this.ensRegionId = builder.ensRegionId;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.internetChargeType = builder.internetChargeType;
            this.ipAddress = builder.ipAddress;
            this.ipStatus = builder.ipStatus;
            this.isp = builder.isp;
            this.name = builder.name;
            this.standby = builder.standby;
            this.status = builder.status;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EipAddress create() {
            return builder().build();
        }

        /**
         * @return allocationId
         */
        public String getAllocationId() {
            return this.allocationId;
        }

        /**
         * @return allocationTime
         */
        public String getAllocationTime() {
            return this.allocationTime;
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return internetChargeType
         */
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        /**
         * @return ipAddress
         */
        public String getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return ipStatus
         */
        public String getIpStatus() {
            return this.ipStatus;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return standby
         */
        public Boolean getStandby() {
            return this.standby;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String allocationId; 
            private String allocationTime; 
            private Integer bandwidth; 
            private String chargeType; 
            private String description; 
            private String ensRegionId; 
            private String instanceId; 
            private String instanceType; 
            private String internetChargeType; 
            private String ipAddress; 
            private String ipStatus; 
            private String isp; 
            private String name; 
            private Boolean standby; 
            private String status; 
            private Tags tags; 

            private Builder() {
            } 

            private Builder(EipAddress model) {
                this.allocationId = model.allocationId;
                this.allocationTime = model.allocationTime;
                this.bandwidth = model.bandwidth;
                this.chargeType = model.chargeType;
                this.description = model.description;
                this.ensRegionId = model.ensRegionId;
                this.instanceId = model.instanceId;
                this.instanceType = model.instanceType;
                this.internetChargeType = model.internetChargeType;
                this.ipAddress = model.ipAddress;
                this.ipStatus = model.ipStatus;
                this.isp = model.isp;
                this.name = model.name;
                this.standby = model.standby;
                this.status = model.status;
                this.tags = model.tags;
            } 

            /**
             * <p>The ID of the EIP.</p>
             * 
             * <strong>example:</strong>
             * <p>eip-5sainglpw7qfem3icir4s****</p>
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * <p>The time when the EIP was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1624885274000</p>
             */
            public Builder allocationTime(String allocationTime) {
                this.allocationTime = allocationTime;
                return this;
            }

            /**
             * <p>The peak bandwidth of the EIP. Default value: 5. Valid values: <strong>5</strong> to <strong>10000</strong>. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The billing method of the EIP. Valid values:</p>
             * <ul>
             * <li><strong>PrePaid</strong>: subscription.</li>
             * <li><strong>PostPaid</strong>: pay-as-you-go</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The description of the EIP.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the ENS node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-xian-telecom</p>
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * <p>The ID of the instance that is associated with the EIP.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-5sc3kum2e0sz34wbqrws9****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The type of the instance that is associated with the EIP. Valid values:</p>
             * <ul>
             * <li><strong>EnsInstance</strong>: ENS instance in a VPC</li>
             * <li><strong>SlbInstance</strong>: SLB instance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SlbInstance</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The metering method of the EIP.</p>
             * <ul>
             * <li><strong>95BandwidthByMonth</strong>: Pay by monthly 95th percentile bandwidth</li>
             * <li><strong>PayByBandwidth</strong>: Pay by bandwidth</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>95BandwidthByMonth</p>
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * <p>The EIP.</p>
             * 
             * <strong>example:</strong>
             * <p>10.10.10</p>
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * <p>The running status of the EIP. This parameter is returned if the EIP is a secondary EIP. Valid values:</p>
             * <ul>
             * <li><strong>Stopped</strong></li>
             * <li><strong>Running</strong></li>
             * <li><strong>Starting</strong></li>
             * <li><strong>Stopping</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Stopped</p>
             */
            public Builder ipStatus(String ipStatus) {
                this.ipStatus = ipStatus;
                return this;
            }

            /**
             * <p>The Internet service provider (ISP). Valid values:</p>
             * <ul>
             * <li><strong>cmcc</strong>: China Mobile</li>
             * <li><strong>unicom</strong>: China Unicom</li>
             * <li><strong>telecom</strong>: China Telecom</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cmcc</p>
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * <p>The name of the EIP.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Indicates whether the EIP is a secondary EIP.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder standby(Boolean standby) {
                this.standby = standby;
                return this;
            }

            /**
             * <p>The status of the EIP. Valid values:</p>
             * <ul>
             * <li><strong>Associating</strong></li>
             * <li><strong>Unassociating</strong></li>
             * <li><strong>InUse</strong></li>
             * <li><strong>Available</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            public EipAddress build() {
                return new EipAddress(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEnsEipAddressesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnsEipAddressesResponseBody</p>
     */
    public static class EipAddresses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EipAddress")
        private java.util.List<EipAddress> eipAddress;

        private EipAddresses(Builder builder) {
            this.eipAddress = builder.eipAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EipAddresses create() {
            return builder().build();
        }

        /**
         * @return eipAddress
         */
        public java.util.List<EipAddress> getEipAddress() {
            return this.eipAddress;
        }

        public static final class Builder {
            private java.util.List<EipAddress> eipAddress; 

            private Builder() {
            } 

            private Builder(EipAddresses model) {
                this.eipAddress = model.eipAddress;
            } 

            /**
             * EipAddress.
             */
            public Builder eipAddress(java.util.List<EipAddress> eipAddress) {
                this.eipAddress = eipAddress;
                return this;
            }

            public EipAddresses build() {
                return new EipAddresses(this);
            } 

        } 

    }
}
