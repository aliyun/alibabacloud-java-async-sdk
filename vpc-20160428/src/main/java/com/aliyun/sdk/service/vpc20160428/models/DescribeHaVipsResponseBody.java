// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeHaVipsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHaVipsResponseBody</p>
 */
public class DescribeHaVipsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HaVips")
    private HaVips haVips;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeHaVipsResponseBody(Builder builder) {
        this.haVips = builder.haVips;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHaVipsResponseBody create() {
        return builder().build();
    }

    /**
     * @return haVips
     */
    public HaVips getHaVips() {
        return this.haVips;
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
        private HaVips haVips; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The details about the HAVIP.</p>
         */
        public Builder haVips(HaVips haVips) {
            this.haVips = haVips;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>33E480C5-B46F-4CA5-B6FD-D77C746E86AB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeHaVipsResponseBody build() {
            return new DescribeHaVipsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHaVipsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHaVipsResponseBody</p>
     */
    public static class AssociatedEipAddresses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("associatedEipAddresse")
        private java.util.List < String > associatedEipAddresse;

        private AssociatedEipAddresses(Builder builder) {
            this.associatedEipAddresse = builder.associatedEipAddresse;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssociatedEipAddresses create() {
            return builder().build();
        }

        /**
         * @return associatedEipAddresse
         */
        public java.util.List < String > getAssociatedEipAddresse() {
            return this.associatedEipAddresse;
        }

        public static final class Builder {
            private java.util.List < String > associatedEipAddresse; 

            /**
             * associatedEipAddresse.
             */
            public Builder associatedEipAddresse(java.util.List < String > associatedEipAddresse) {
                this.associatedEipAddresse = associatedEipAddresse;
                return this;
            }

            public AssociatedEipAddresses build() {
                return new AssociatedEipAddresses(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeHaVipsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHaVipsResponseBody</p>
     */
    public static class AssociatedInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("associatedInstance")
        private java.util.List < String > associatedInstance;

        private AssociatedInstances(Builder builder) {
            this.associatedInstance = builder.associatedInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssociatedInstances create() {
            return builder().build();
        }

        /**
         * @return associatedInstance
         */
        public java.util.List < String > getAssociatedInstance() {
            return this.associatedInstance;
        }

        public static final class Builder {
            private java.util.List < String > associatedInstance; 

            /**
             * associatedInstance.
             */
            public Builder associatedInstance(java.util.List < String > associatedInstance) {
                this.associatedInstance = associatedInstance;
                return this;
            }

            public AssociatedInstances build() {
                return new AssociatedInstances(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeHaVipsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHaVipsResponseBody</p>
     */
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
             * <p>The key of tag N added to the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N added to the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceJoshua</p>
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
     * {@link DescribeHaVipsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHaVipsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List < Tag> tag;

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
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
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
     * {@link DescribeHaVipsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHaVipsResponseBody</p>
     */
    public static class HaVip extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociatedEipAddresses")
        private AssociatedEipAddresses associatedEipAddresses;

        @com.aliyun.core.annotation.NameInMap("AssociatedInstanceType")
        private String associatedInstanceType;

        @com.aliyun.core.annotation.NameInMap("AssociatedInstances")
        private AssociatedInstances associatedInstances;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("HaVipId")
        private String haVipId;

        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private String ipAddress;

        @com.aliyun.core.annotation.NameInMap("MasterInstanceId")
        private String masterInstanceId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private HaVip(Builder builder) {
            this.associatedEipAddresses = builder.associatedEipAddresses;
            this.associatedInstanceType = builder.associatedInstanceType;
            this.associatedInstances = builder.associatedInstances;
            this.chargeType = builder.chargeType;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.haVipId = builder.haVipId;
            this.ipAddress = builder.ipAddress;
            this.masterInstanceId = builder.masterInstanceId;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.status = builder.status;
            this.tags = builder.tags;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HaVip create() {
            return builder().build();
        }

        /**
         * @return associatedEipAddresses
         */
        public AssociatedEipAddresses getAssociatedEipAddresses() {
            return this.associatedEipAddresses;
        }

        /**
         * @return associatedInstanceType
         */
        public String getAssociatedInstanceType() {
            return this.associatedInstanceType;
        }

        /**
         * @return associatedInstances
         */
        public AssociatedInstances getAssociatedInstances() {
            return this.associatedInstances;
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
         * @return haVipId
         */
        public String getHaVipId() {
            return this.haVipId;
        }

        /**
         * @return ipAddress
         */
        public String getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return masterInstanceId
         */
        public String getMasterInstanceId() {
            return this.masterInstanceId;
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

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private AssociatedEipAddresses associatedEipAddresses; 
            private String associatedInstanceType; 
            private AssociatedInstances associatedInstances; 
            private String chargeType; 
            private String createTime; 
            private String description; 
            private String haVipId; 
            private String ipAddress; 
            private String masterInstanceId; 
            private String name; 
            private String regionId; 
            private String resourceGroupId; 
            private String status; 
            private Tags tags; 
            private String vSwitchId; 
            private String vpcId; 

            /**
             * <p>The list of EIPs associated with the HAVIP.</p>
             */
            public Builder associatedEipAddresses(AssociatedEipAddresses associatedEipAddresses) {
                this.associatedEipAddresses = associatedEipAddresses;
                return this;
            }

            /**
             * <p>The type of the instance with which the HAVIP is associated. Valid values:</p>
             * <ul>
             * <li><strong>EcsInstance</strong>: Elastic Compute Service (ECS) instance</li>
             * <li><strong>NetworkInterface</strong>: elastic network interface (ENI)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EcsInstance</p>
             */
            public Builder associatedInstanceType(String associatedInstanceType) {
                this.associatedInstanceType = associatedInstanceType;
                return this;
            }

            /**
             * <p>The information about the instance associated with the HAVIP.</p>
             */
            public Builder associatedInstances(AssociatedInstances associatedInstances) {
                this.associatedInstances = associatedInstances;
                return this;
            }

            /**
             * <p>The parameter is invalid. No value is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The time when the HAVIP was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-07-03T14:25:26Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the HAVIP.</p>
             * 
             * <strong>example:</strong>
             * <p>My HaVip</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the HAVIP.</p>
             * 
             * <strong>example:</strong>
             * <p>havip-bp149uyvut73dpld****</p>
             */
            public Builder haVipId(String haVipId) {
                this.haVipId = haVipId;
                return this;
            }

            /**
             * <p>The private IP address of the HAVIP.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.24.5</p>
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * <p>The ID of the active instance that is associated with the HAVIP.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp145q7glnuzdvz****</p>
             */
            public Builder masterInstanceId(String masterInstanceId) {
                this.masterInstanceId = masterInstanceId;
                return this;
            }

            /**
             * <p>The name of the HAVIP.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the region to which the HAVIP belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the HAVIP belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-bp67acfmxazb4ph****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The status of the HAVIP. Valid values:</p>
             * <ul>
             * <li><strong>Creating</strong>: The server group is being created.</li>
             * <li><strong>Available</strong>: The FULLNAT entry is available.</li>
             * <li><strong>Deleting</strong></li>
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
             * <p>The tag list.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the vSwitch to which the HAVIP belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1pkt1fba8e824ez****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The ID of the VPC to which the HAVIP belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1kcm36tevkpms97****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public HaVip build() {
                return new HaVip(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeHaVipsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHaVipsResponseBody</p>
     */
    public static class HaVips extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HaVip")
        private java.util.List < HaVip> haVip;

        private HaVips(Builder builder) {
            this.haVip = builder.haVip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HaVips create() {
            return builder().build();
        }

        /**
         * @return haVip
         */
        public java.util.List < HaVip> getHaVip() {
            return this.haVip;
        }

        public static final class Builder {
            private java.util.List < HaVip> haVip; 

            /**
             * HaVip.
             */
            public Builder haVip(java.util.List < HaVip> haVip) {
                this.haVip = haVip;
                return this;
            }

            public HaVips build() {
                return new HaVips(this);
            } 

        } 

    }
}
