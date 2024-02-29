// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHaVipsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHaVipsResponseBody</p>
 */
public class DescribeHaVipsResponseBody extends TeaModel {
    @NameInMap("HaVips")
    private HaVips haVips;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * The details about the HAVIP.
         */
        public Builder haVips(HaVips haVips) {
            this.haVips = haVips;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeHaVipsResponseBody build() {
            return new DescribeHaVipsResponseBody(this);
        } 

    } 

    public static class AssociatedEipAddresses extends TeaModel {
        @NameInMap("associatedEipAddresse")
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
    public static class AssociatedInstances extends TeaModel {
        @NameInMap("associatedInstance")
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
             * The key of tag N added to the resource.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N added to the resource.
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
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
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
    public static class HaVip extends TeaModel {
        @NameInMap("AssociatedEipAddresses")
        private AssociatedEipAddresses associatedEipAddresses;

        @NameInMap("AssociatedInstanceType")
        private String associatedInstanceType;

        @NameInMap("AssociatedInstances")
        private AssociatedInstances associatedInstances;

        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("HaVipId")
        private String haVipId;

        @NameInMap("IpAddress")
        private String ipAddress;

        @NameInMap("MasterInstanceId")
        private String masterInstanceId;

        @NameInMap("Name")
        private String name;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
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
             * The list of EIPs associated with the HAVIP.
             */
            public Builder associatedEipAddresses(AssociatedEipAddresses associatedEipAddresses) {
                this.associatedEipAddresses = associatedEipAddresses;
                return this;
            }

            /**
             * The type of the instance with which the HAVIP is associated. Valid values:
             * <p>
             * 
             * *   **EcsInstance**: Elastic Compute Service (ECS) instance
             * *   **NetworkInterface**: elastic network interface (ENI)
             */
            public Builder associatedInstanceType(String associatedInstanceType) {
                this.associatedInstanceType = associatedInstanceType;
                return this;
            }

            /**
             * The information about the instance associated with the HAVIP.
             */
            public Builder associatedInstances(AssociatedInstances associatedInstances) {
                this.associatedInstances = associatedInstances;
                return this;
            }

            /**
             * The parameter is invalid. No value is returned.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * The time when the HAVIP was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the HAVIP.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the HAVIP.
             */
            public Builder haVipId(String haVipId) {
                this.haVipId = haVipId;
                return this;
            }

            /**
             * The private IP address of the HAVIP.
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * The ID of the active instance that is associated with the HAVIP.
             */
            public Builder masterInstanceId(String masterInstanceId) {
                this.masterInstanceId = masterInstanceId;
                return this;
            }

            /**
             * The name of the HAVIP.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the region to which the HAVIP belongs.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the resource group to which the HAVIP belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The status of the HAVIP. Valid values:
             * <p>
             * 
             * *   **Creating**: The server group is being created.
             * *   **Available**: The FULLNAT entry is available.
             * *   **Deleting**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tag list.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The ID of the vSwitch to which the HAVIP belongs.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The ID of the VPC to which the HAVIP belongs.
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
    public static class HaVips extends TeaModel {
        @NameInMap("HaVip")
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
