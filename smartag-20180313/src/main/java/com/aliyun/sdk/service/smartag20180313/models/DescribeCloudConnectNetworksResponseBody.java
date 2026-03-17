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
         * <p>The list of CCN instances.</p>
         */
        public Builder cloudConnectNetworks(CloudConnectNetworks cloudConnectNetworks) {
            this.cloudConnectNetworks = cloudConnectNetworks;
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
         * <p>3F2A0B80-D6D1-4764-8D77-38067DBBA345</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of the CCN instances.</p>
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
             * <p>The key of the tag that is bound to the CCN instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag that is bound to the CCN instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
    public static class CloudConnectNetwork extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociatedCenId")
        private String associatedCenId;

        @com.aliyun.core.annotation.NameInMap("AssociatedCenOwnerId")
        private String associatedCenOwnerId;

        @com.aliyun.core.annotation.NameInMap("AssociatedCloudBoxCount")
        private String associatedCloudBoxCount;

        @com.aliyun.core.annotation.NameInMap("AvailableCloudBoxCount")
        private String availableCloudBoxCount;

        @com.aliyun.core.annotation.NameInMap("CcnId")
        private String ccnId;

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

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SnatCidrBlock")
        private String snatCidrBlock;

        @com.aliyun.core.annotation.NameInMap("Subnet")
        private String subnet;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        private CloudConnectNetwork(Builder builder) {
            this.associatedCenId = builder.associatedCenId;
            this.associatedCenOwnerId = builder.associatedCenOwnerId;
            this.associatedCloudBoxCount = builder.associatedCloudBoxCount;
            this.availableCloudBoxCount = builder.availableCloudBoxCount;
            this.ccnId = builder.ccnId;
            this.cidrBlock = builder.cidrBlock;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.interworkingStatus = builder.interworkingStatus;
            this.name = builder.name;
            this.newAgw = builder.newAgw;
            this.resourceGroupId = builder.resourceGroupId;
            this.snatCidrBlock = builder.snatCidrBlock;
            this.subnet = builder.subnet;
            this.tags = builder.tags;
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
         * @return associatedCloudBoxCount
         */
        public String getAssociatedCloudBoxCount() {
            return this.associatedCloudBoxCount;
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

        public static final class Builder {
            private String associatedCenId; 
            private String associatedCenOwnerId; 
            private String associatedCloudBoxCount; 
            private String availableCloudBoxCount; 
            private String ccnId; 
            private String cidrBlock; 
            private Long createTime; 
            private String description; 
            private String interworkingStatus; 
            private String name; 
            private Boolean newAgw; 
            private String resourceGroupId; 
            private String snatCidrBlock; 
            private String subnet; 
            private Tags tags; 

            private Builder() {
            } 

            private Builder(CloudConnectNetwork model) {
                this.associatedCenId = model.associatedCenId;
                this.associatedCenOwnerId = model.associatedCenOwnerId;
                this.associatedCloudBoxCount = model.associatedCloudBoxCount;
                this.availableCloudBoxCount = model.availableCloudBoxCount;
                this.ccnId = model.ccnId;
                this.cidrBlock = model.cidrBlock;
                this.createTime = model.createTime;
                this.description = model.description;
                this.interworkingStatus = model.interworkingStatus;
                this.name = model.name;
                this.newAgw = model.newAgw;
                this.resourceGroupId = model.resourceGroupId;
                this.snatCidrBlock = model.snatCidrBlock;
                this.subnet = model.subnet;
                this.tags = model.tags;
            } 

            /**
             * <p>The ID of the CEN instance to which the CCN instance is attached.</p>
             * 
             * <strong>example:</strong>
             * <p>cen-0jtu0bcbika5b5****</p>
             */
            public Builder associatedCenId(String associatedCenId) {
                this.associatedCenId = associatedCenId;
                return this;
            }

            /**
             * <p>The account ID of the Cloud Enterprise Network (CEN) instance to which the CCN instance is attached.</p>
             * 
             * <strong>example:</strong>
             * <p>168800000000****</p>
             */
            public Builder associatedCenOwnerId(String associatedCenOwnerId) {
                this.associatedCenOwnerId = associatedCenOwnerId;
                return this;
            }

            /**
             * <p>The number of Smart Access Gateway (SAG) instances that are associated with the CCN instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder associatedCloudBoxCount(String associatedCloudBoxCount) {
                this.associatedCloudBoxCount = associatedCloudBoxCount;
                return this;
            }

            /**
             * <p>The number of SAG instances in the <strong>Available</strong> state that are associated with the CCN instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder availableCloudBoxCount(String availableCloudBoxCount) {
                this.availableCloudBoxCount = availableCloudBoxCount;
                return this;
            }

            /**
             * <p>The ID of the CCN instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ccn-l9340rlu5enst******</p>
             */
            public Builder ccnId(String ccnId) {
                this.ccnId = ccnId;
                return this;
            }

            /**
             * <p>The private CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>10.10.10.0/24</p>
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * <p>The timestamp when the CCN instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1523618639000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the CCN instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ccndesc</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the SAG instances that are associated with the same CCN instance communicate with each other.  </p>
             * <ul>
             * <li><strong>enable</strong>: allows SAG instances that are associated with the same CCN instance to communicate with each other.</li>
             * <li><strong>disable</strong>: does not allow SAG instances that are associated with the same CCN instance to communicate with each other.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enable</p>
             */
            public Builder interworkingStatus(String interworkingStatus) {
                this.interworkingStatus = interworkingStatus;
                return this;
            }

            /**
             * <p>The name of the CCN instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ccnname</p>
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
             * <p>The ID of the resource group to which the CCN instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfm2iu4fnc****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The CIDR block that is used in Source Network Address Translation (SNAT).</p>
             * 
             * <strong>example:</strong>
             * <p>10.10.10.0/25</p>
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
             * <p>The list of tags.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
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
