// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DescribeCloudConnectNetworksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudConnectNetworksResponseBody</p>
 */
public class DescribeCloudConnectNetworksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CloudConnectNetworks")
    private CloudConnectNetworks cloudConnectNetworks;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeCloudConnectNetworksResponseBody(Builder builder) {
        this.cloudConnectNetworks = builder.cloudConnectNetworks;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudConnectNetworksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cloudConnectNetworks
     */
    public CloudConnectNetworks getCloudConnectNetworks() {
        return this.cloudConnectNetworks;
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
        private CloudConnectNetworks cloudConnectNetworks; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeCloudConnectNetworksResponseBody model) {
            this.cloudConnectNetworks = model.cloudConnectNetworks;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * CloudConnectNetworks.
         */
        public Builder cloudConnectNetworks(CloudConnectNetworks cloudConnectNetworks) {
            this.cloudConnectNetworks = cloudConnectNetworks;
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
         * <p>The number of entries returned on each page during paging in a paged query.</p>
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
         * <p>3F2A0B80-D6D1-4764-8D77-38067DBBA345</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCloudConnectNetworksResponseBody build() {
            return new DescribeCloudConnectNetworksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCloudConnectNetworksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudConnectNetworksResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
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
     * {@link DescribeCloudConnectNetworksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudConnectNetworksResponseBody</p>
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
     * {@link DescribeCloudConnectNetworksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudConnectNetworksResponseBody</p>
     */
    public static class RegionBinding extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CidrBlock")
        private String cidrBlock;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RelayCidrBlock")
        private String relayCidrBlock;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TransitRouterId")
        private String transitRouterId;

        private RegionBinding(Builder builder) {
            this.cidrBlock = builder.cidrBlock;
            this.regionId = builder.regionId;
            this.relayCidrBlock = builder.relayCidrBlock;
            this.status = builder.status;
            this.transitRouterId = builder.transitRouterId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionBinding create() {
            return builder().build();
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return relayCidrBlock
         */
        public String getRelayCidrBlock() {
            return this.relayCidrBlock;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return transitRouterId
         */
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

        public static final class Builder {
            private String cidrBlock; 
            private String regionId; 
            private String relayCidrBlock; 
            private String status; 
            private String transitRouterId; 

            private Builder() {
            } 

            private Builder(RegionBinding model) {
                this.cidrBlock = model.cidrBlock;
                this.regionId = model.regionId;
                this.relayCidrBlock = model.relayCidrBlock;
                this.status = model.status;
                this.transitRouterId = model.transitRouterId;
            } 

            /**
             * CidrBlock.
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * RelayCidrBlock.
             */
            public Builder relayCidrBlock(String relayCidrBlock) {
                this.relayCidrBlock = relayCidrBlock;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TransitRouterId.
             */
            public Builder transitRouterId(String transitRouterId) {
                this.transitRouterId = transitRouterId;
                return this;
            }

            public RegionBinding build() {
                return new RegionBinding(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCloudConnectNetworksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudConnectNetworksResponseBody</p>
     */
    public static class RegionBindingList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionBinding")
        private java.util.List<RegionBinding> regionBinding;

        private RegionBindingList(Builder builder) {
            this.regionBinding = builder.regionBinding;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionBindingList create() {
            return builder().build();
        }

        /**
         * @return regionBinding
         */
        public java.util.List<RegionBinding> getRegionBinding() {
            return this.regionBinding;
        }

        public static final class Builder {
            private java.util.List<RegionBinding> regionBinding; 

            private Builder() {
            } 

            private Builder(RegionBindingList model) {
                this.regionBinding = model.regionBinding;
            } 

            /**
             * RegionBinding.
             */
            public Builder regionBinding(java.util.List<RegionBinding> regionBinding) {
                this.regionBinding = regionBinding;
                return this;
            }

            public RegionBindingList build() {
                return new RegionBindingList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCloudConnectNetworksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudConnectNetworksResponseBody</p>
     */
    public static class TrNetworkConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CidrAllocationMode")
        private String cidrAllocationMode;

        @com.aliyun.core.annotation.NameInMap("RegionBindingList")
        private RegionBindingList regionBindingList;

        @com.aliyun.core.annotation.NameInMap("Subnet")
        private String subnet;

        private TrNetworkConfig(Builder builder) {
            this.cidrAllocationMode = builder.cidrAllocationMode;
            this.regionBindingList = builder.regionBindingList;
            this.subnet = builder.subnet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrNetworkConfig create() {
            return builder().build();
        }

        /**
         * @return cidrAllocationMode
         */
        public String getCidrAllocationMode() {
            return this.cidrAllocationMode;
        }

        /**
         * @return regionBindingList
         */
        public RegionBindingList getRegionBindingList() {
            return this.regionBindingList;
        }

        /**
         * @return subnet
         */
        public String getSubnet() {
            return this.subnet;
        }

        public static final class Builder {
            private String cidrAllocationMode; 
            private RegionBindingList regionBindingList; 
            private String subnet; 

            private Builder() {
            } 

            private Builder(TrNetworkConfig model) {
                this.cidrAllocationMode = model.cidrAllocationMode;
                this.regionBindingList = model.regionBindingList;
                this.subnet = model.subnet;
            } 

            /**
             * CidrAllocationMode.
             */
            public Builder cidrAllocationMode(String cidrAllocationMode) {
                this.cidrAllocationMode = cidrAllocationMode;
                return this;
            }

            /**
             * RegionBindingList.
             */
            public Builder regionBindingList(RegionBindingList regionBindingList) {
                this.regionBindingList = regionBindingList;
                return this;
            }

            /**
             * Subnet.
             */
            public Builder subnet(String subnet) {
                this.subnet = subnet;
                return this;
            }

            public TrNetworkConfig build() {
                return new TrNetworkConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCloudConnectNetworksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudConnectNetworksResponseBody</p>
     */
    public static class RegionBindingListRegionBinding extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RelayCidrBlock")
        private String relayCidrBlock;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VpcCidrBlock")
        private String vpcCidrBlock;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private RegionBindingListRegionBinding(Builder builder) {
            this.regionId = builder.regionId;
            this.relayCidrBlock = builder.relayCidrBlock;
            this.status = builder.status;
            this.vpcCidrBlock = builder.vpcCidrBlock;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionBindingListRegionBinding create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return relayCidrBlock
         */
        public String getRelayCidrBlock() {
            return this.relayCidrBlock;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vpcCidrBlock
         */
        public String getVpcCidrBlock() {
            return this.vpcCidrBlock;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String regionId; 
            private String relayCidrBlock; 
            private String status; 
            private String vpcCidrBlock; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(RegionBindingListRegionBinding model) {
                this.regionId = model.regionId;
                this.relayCidrBlock = model.relayCidrBlock;
                this.status = model.status;
                this.vpcCidrBlock = model.vpcCidrBlock;
                this.vpcId = model.vpcId;
            } 

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * RelayCidrBlock.
             */
            public Builder relayCidrBlock(String relayCidrBlock) {
                this.relayCidrBlock = relayCidrBlock;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * VpcCidrBlock.
             */
            public Builder vpcCidrBlock(String vpcCidrBlock) {
                this.vpcCidrBlock = vpcCidrBlock;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public RegionBindingListRegionBinding build() {
                return new RegionBindingListRegionBinding(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCloudConnectNetworksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudConnectNetworksResponseBody</p>
     */
    public static class VpcNetworkConfigRegionBindingList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionBinding")
        private java.util.List<RegionBindingListRegionBinding> regionBinding;

        private VpcNetworkConfigRegionBindingList(Builder builder) {
            this.regionBinding = builder.regionBinding;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcNetworkConfigRegionBindingList create() {
            return builder().build();
        }

        /**
         * @return regionBinding
         */
        public java.util.List<RegionBindingListRegionBinding> getRegionBinding() {
            return this.regionBinding;
        }

        public static final class Builder {
            private java.util.List<RegionBindingListRegionBinding> regionBinding; 

            private Builder() {
            } 

            private Builder(VpcNetworkConfigRegionBindingList model) {
                this.regionBinding = model.regionBinding;
            } 

            /**
             * RegionBinding.
             */
            public Builder regionBinding(java.util.List<RegionBindingListRegionBinding> regionBinding) {
                this.regionBinding = regionBinding;
                return this;
            }

            public VpcNetworkConfigRegionBindingList build() {
                return new VpcNetworkConfigRegionBindingList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCloudConnectNetworksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudConnectNetworksResponseBody</p>
     */
    public static class VpcNetworkConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CidrAllocationMode")
        private String cidrAllocationMode;

        @com.aliyun.core.annotation.NameInMap("RegionBindingList")
        private VpcNetworkConfigRegionBindingList regionBindingList;

        @com.aliyun.core.annotation.NameInMap("Subnet")
        private String subnet;

        private VpcNetworkConfig(Builder builder) {
            this.cidrAllocationMode = builder.cidrAllocationMode;
            this.regionBindingList = builder.regionBindingList;
            this.subnet = builder.subnet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcNetworkConfig create() {
            return builder().build();
        }

        /**
         * @return cidrAllocationMode
         */
        public String getCidrAllocationMode() {
            return this.cidrAllocationMode;
        }

        /**
         * @return regionBindingList
         */
        public VpcNetworkConfigRegionBindingList getRegionBindingList() {
            return this.regionBindingList;
        }

        /**
         * @return subnet
         */
        public String getSubnet() {
            return this.subnet;
        }

        public static final class Builder {
            private String cidrAllocationMode; 
            private VpcNetworkConfigRegionBindingList regionBindingList; 
            private String subnet; 

            private Builder() {
            } 

            private Builder(VpcNetworkConfig model) {
                this.cidrAllocationMode = model.cidrAllocationMode;
                this.regionBindingList = model.regionBindingList;
                this.subnet = model.subnet;
            } 

            /**
             * CidrAllocationMode.
             */
            public Builder cidrAllocationMode(String cidrAllocationMode) {
                this.cidrAllocationMode = cidrAllocationMode;
                return this;
            }

            /**
             * RegionBindingList.
             */
            public Builder regionBindingList(VpcNetworkConfigRegionBindingList regionBindingList) {
                this.regionBindingList = regionBindingList;
                return this;
            }

            /**
             * Subnet.
             */
            public Builder subnet(String subnet) {
                this.subnet = subnet;
                return this;
            }

            public VpcNetworkConfig build() {
                return new VpcNetworkConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCloudConnectNetworksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudConnectNetworksResponseBody</p>
     */
    public static class CloudConnectNetwork extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociatedCenId")
        private String associatedCenId;

        @com.aliyun.core.annotation.NameInMap("AssociatedCenOwnerId")
        private String associatedCenOwnerId;

        @com.aliyun.core.annotation.NameInMap("AssociatedCenStatus")
        private String associatedCenStatus;

        @com.aliyun.core.annotation.NameInMap("AssociatedCloudBoxCount")
        private String associatedCloudBoxCount;

        @com.aliyun.core.annotation.NameInMap("AssociatedVpcStatus")
        private String associatedVpcStatus;

        @com.aliyun.core.annotation.NameInMap("AvailableCloudBoxCount")
        private String availableCloudBoxCount;

        @com.aliyun.core.annotation.NameInMap("CcnId")
        private String ccnId;

        @com.aliyun.core.annotation.NameInMap("CenStatusErrorCode")
        private String cenStatusErrorCode;

        @com.aliyun.core.annotation.NameInMap("CenStatusErrorMessage")
        private String cenStatusErrorMessage;

        @com.aliyun.core.annotation.NameInMap("CidrBlock")
        private String cidrBlock;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InterworkingStatus")
        private String interworkingStatus;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NewAgw")
        private Boolean newAgw;

        @com.aliyun.core.annotation.NameInMap("ProcessingCenId")
        private String processingCenId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SnatCidrBlock")
        private String snatCidrBlock;

        @com.aliyun.core.annotation.NameInMap("Subnet")
        private String subnet;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("TrNetworkConfig")
        private TrNetworkConfig trNetworkConfig;

        @com.aliyun.core.annotation.NameInMap("VpcNetworkConfig")
        private VpcNetworkConfig vpcNetworkConfig;

        @com.aliyun.core.annotation.NameInMap("VpcStatusErrorCode")
        private String vpcStatusErrorCode;

        @com.aliyun.core.annotation.NameInMap("VpcStatusErrorMessage")
        private String vpcStatusErrorMessage;

        private CloudConnectNetwork(Builder builder) {
            this.associatedCenId = builder.associatedCenId;
            this.associatedCenOwnerId = builder.associatedCenOwnerId;
            this.associatedCenStatus = builder.associatedCenStatus;
            this.associatedCloudBoxCount = builder.associatedCloudBoxCount;
            this.associatedVpcStatus = builder.associatedVpcStatus;
            this.availableCloudBoxCount = builder.availableCloudBoxCount;
            this.ccnId = builder.ccnId;
            this.cenStatusErrorCode = builder.cenStatusErrorCode;
            this.cenStatusErrorMessage = builder.cenStatusErrorMessage;
            this.cidrBlock = builder.cidrBlock;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.interworkingStatus = builder.interworkingStatus;
            this.name = builder.name;
            this.newAgw = builder.newAgw;
            this.processingCenId = builder.processingCenId;
            this.resourceGroupId = builder.resourceGroupId;
            this.snatCidrBlock = builder.snatCidrBlock;
            this.subnet = builder.subnet;
            this.tags = builder.tags;
            this.trNetworkConfig = builder.trNetworkConfig;
            this.vpcNetworkConfig = builder.vpcNetworkConfig;
            this.vpcStatusErrorCode = builder.vpcStatusErrorCode;
            this.vpcStatusErrorMessage = builder.vpcStatusErrorMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudConnectNetwork create() {
            return builder().build();
        }

        /**
         * @return associatedCenId
         */
        public String getAssociatedCenId() {
            return this.associatedCenId;
        }

        /**
         * @return associatedCenOwnerId
         */
        public String getAssociatedCenOwnerId() {
            return this.associatedCenOwnerId;
        }

        /**
         * @return associatedCenStatus
         */
        public String getAssociatedCenStatus() {
            return this.associatedCenStatus;
        }

        /**
         * @return associatedCloudBoxCount
         */
        public String getAssociatedCloudBoxCount() {
            return this.associatedCloudBoxCount;
        }

        /**
         * @return associatedVpcStatus
         */
        public String getAssociatedVpcStatus() {
            return this.associatedVpcStatus;
        }

        /**
         * @return availableCloudBoxCount
         */
        public String getAvailableCloudBoxCount() {
            return this.availableCloudBoxCount;
        }

        /**
         * @return ccnId
         */
        public String getCcnId() {
            return this.ccnId;
        }

        /**
         * @return cenStatusErrorCode
         */
        public String getCenStatusErrorCode() {
            return this.cenStatusErrorCode;
        }

        /**
         * @return cenStatusErrorMessage
         */
        public String getCenStatusErrorMessage() {
            return this.cenStatusErrorMessage;
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return interworkingStatus
         */
        public String getInterworkingStatus() {
            return this.interworkingStatus;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return newAgw
         */
        public Boolean getNewAgw() {
            return this.newAgw;
        }

        /**
         * @return processingCenId
         */
        public String getProcessingCenId() {
            return this.processingCenId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return snatCidrBlock
         */
        public String getSnatCidrBlock() {
            return this.snatCidrBlock;
        }

        /**
         * @return subnet
         */
        public String getSubnet() {
            return this.subnet;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return trNetworkConfig
         */
        public TrNetworkConfig getTrNetworkConfig() {
            return this.trNetworkConfig;
        }

        /**
         * @return vpcNetworkConfig
         */
        public VpcNetworkConfig getVpcNetworkConfig() {
            return this.vpcNetworkConfig;
        }

        /**
         * @return vpcStatusErrorCode
         */
        public String getVpcStatusErrorCode() {
            return this.vpcStatusErrorCode;
        }

        /**
         * @return vpcStatusErrorMessage
         */
        public String getVpcStatusErrorMessage() {
            return this.vpcStatusErrorMessage;
        }

        public static final class Builder {
            private String associatedCenId; 
            private String associatedCenOwnerId; 
            private String associatedCenStatus; 
            private String associatedCloudBoxCount; 
            private String associatedVpcStatus; 
            private String availableCloudBoxCount; 
            private String ccnId; 
            private String cenStatusErrorCode; 
            private String cenStatusErrorMessage; 
            private String cidrBlock; 
            private Long createTime; 
            private String description; 
            private String interworkingStatus; 
            private String name; 
            private Boolean newAgw; 
            private String processingCenId; 
            private String resourceGroupId; 
            private String snatCidrBlock; 
            private String subnet; 
            private Tags tags; 
            private TrNetworkConfig trNetworkConfig; 
            private VpcNetworkConfig vpcNetworkConfig; 
            private String vpcStatusErrorCode; 
            private String vpcStatusErrorMessage; 

            private Builder() {
            } 

            private Builder(CloudConnectNetwork model) {
                this.associatedCenId = model.associatedCenId;
                this.associatedCenOwnerId = model.associatedCenOwnerId;
                this.associatedCenStatus = model.associatedCenStatus;
                this.associatedCloudBoxCount = model.associatedCloudBoxCount;
                this.associatedVpcStatus = model.associatedVpcStatus;
                this.availableCloudBoxCount = model.availableCloudBoxCount;
                this.ccnId = model.ccnId;
                this.cenStatusErrorCode = model.cenStatusErrorCode;
                this.cenStatusErrorMessage = model.cenStatusErrorMessage;
                this.cidrBlock = model.cidrBlock;
                this.createTime = model.createTime;
                this.description = model.description;
                this.interworkingStatus = model.interworkingStatus;
                this.name = model.name;
                this.newAgw = model.newAgw;
                this.processingCenId = model.processingCenId;
                this.resourceGroupId = model.resourceGroupId;
                this.snatCidrBlock = model.snatCidrBlock;
                this.subnet = model.subnet;
                this.tags = model.tags;
                this.trNetworkConfig = model.trNetworkConfig;
                this.vpcNetworkConfig = model.vpcNetworkConfig;
                this.vpcStatusErrorCode = model.vpcStatusErrorCode;
                this.vpcStatusErrorMessage = model.vpcStatusErrorMessage;
            } 

            /**
             * AssociatedCenId.
             */
            public Builder associatedCenId(String associatedCenId) {
                this.associatedCenId = associatedCenId;
                return this;
            }

            /**
             * AssociatedCenOwnerId.
             */
            public Builder associatedCenOwnerId(String associatedCenOwnerId) {
                this.associatedCenOwnerId = associatedCenOwnerId;
                return this;
            }

            /**
             * AssociatedCenStatus.
             */
            public Builder associatedCenStatus(String associatedCenStatus) {
                this.associatedCenStatus = associatedCenStatus;
                return this;
            }

            /**
             * AssociatedCloudBoxCount.
             */
            public Builder associatedCloudBoxCount(String associatedCloudBoxCount) {
                this.associatedCloudBoxCount = associatedCloudBoxCount;
                return this;
            }

            /**
             * AssociatedVpcStatus.
             */
            public Builder associatedVpcStatus(String associatedVpcStatus) {
                this.associatedVpcStatus = associatedVpcStatus;
                return this;
            }

            /**
             * AvailableCloudBoxCount.
             */
            public Builder availableCloudBoxCount(String availableCloudBoxCount) {
                this.availableCloudBoxCount = availableCloudBoxCount;
                return this;
            }

            /**
             * CcnId.
             */
            public Builder ccnId(String ccnId) {
                this.ccnId = ccnId;
                return this;
            }

            /**
             * CenStatusErrorCode.
             */
            public Builder cenStatusErrorCode(String cenStatusErrorCode) {
                this.cenStatusErrorCode = cenStatusErrorCode;
                return this;
            }

            /**
             * CenStatusErrorMessage.
             */
            public Builder cenStatusErrorMessage(String cenStatusErrorMessage) {
                this.cenStatusErrorMessage = cenStatusErrorMessage;
                return this;
            }

            /**
             * CidrBlock.
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * InterworkingStatus.
             */
            public Builder interworkingStatus(String interworkingStatus) {
                this.interworkingStatus = interworkingStatus;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NewAgw.
             */
            public Builder newAgw(Boolean newAgw) {
                this.newAgw = newAgw;
                return this;
            }

            /**
             * ProcessingCenId.
             */
            public Builder processingCenId(String processingCenId) {
                this.processingCenId = processingCenId;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * SnatCidrBlock.
             */
            public Builder snatCidrBlock(String snatCidrBlock) {
                this.snatCidrBlock = snatCidrBlock;
                return this;
            }

            /**
             * Subnet.
             */
            public Builder subnet(String subnet) {
                this.subnet = subnet;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * TrNetworkConfig.
             */
            public Builder trNetworkConfig(TrNetworkConfig trNetworkConfig) {
                this.trNetworkConfig = trNetworkConfig;
                return this;
            }

            /**
             * VpcNetworkConfig.
             */
            public Builder vpcNetworkConfig(VpcNetworkConfig vpcNetworkConfig) {
                this.vpcNetworkConfig = vpcNetworkConfig;
                return this;
            }

            /**
             * VpcStatusErrorCode.
             */
            public Builder vpcStatusErrorCode(String vpcStatusErrorCode) {
                this.vpcStatusErrorCode = vpcStatusErrorCode;
                return this;
            }

            /**
             * VpcStatusErrorMessage.
             */
            public Builder vpcStatusErrorMessage(String vpcStatusErrorMessage) {
                this.vpcStatusErrorMessage = vpcStatusErrorMessage;
                return this;
            }

            public CloudConnectNetwork build() {
                return new CloudConnectNetwork(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCloudConnectNetworksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudConnectNetworksResponseBody</p>
     */
    public static class CloudConnectNetworks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CloudConnectNetwork")
        private java.util.List<CloudConnectNetwork> cloudConnectNetwork;

        private CloudConnectNetworks(Builder builder) {
            this.cloudConnectNetwork = builder.cloudConnectNetwork;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudConnectNetworks create() {
            return builder().build();
        }

        /**
         * @return cloudConnectNetwork
         */
        public java.util.List<CloudConnectNetwork> getCloudConnectNetwork() {
            return this.cloudConnectNetwork;
        }

        public static final class Builder {
            private java.util.List<CloudConnectNetwork> cloudConnectNetwork; 

            private Builder() {
            } 

            private Builder(CloudConnectNetworks model) {
                this.cloudConnectNetwork = model.cloudConnectNetwork;
            } 

            /**
             * CloudConnectNetwork.
             */
            public Builder cloudConnectNetwork(java.util.List<CloudConnectNetwork> cloudConnectNetwork) {
                this.cloudConnectNetwork = cloudConnectNetwork;
                return this;
            }

            public CloudConnectNetworks build() {
                return new CloudConnectNetworks(this);
            } 

        } 

    }
}
