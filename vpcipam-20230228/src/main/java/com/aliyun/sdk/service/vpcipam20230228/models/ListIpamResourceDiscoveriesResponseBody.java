// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcipam20230228.models;

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
 * {@link ListIpamResourceDiscoveriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListIpamResourceDiscoveriesResponseBody</p>
 */
public class ListIpamResourceDiscoveriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("IpamResourceDiscoveries")
    private java.util.List<IpamResourceDiscoveries> ipamResourceDiscoveries;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListIpamResourceDiscoveriesResponseBody(Builder builder) {
        this.count = builder.count;
        this.ipamResourceDiscoveries = builder.ipamResourceDiscoveries;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIpamResourceDiscoveriesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return ipamResourceDiscoveries
     */
    public java.util.List<IpamResourceDiscoveries> getIpamResourceDiscoveries() {
        return this.ipamResourceDiscoveries;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List<IpamResourceDiscoveries> ipamResourceDiscoveries; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListIpamResourceDiscoveriesResponseBody model) {
            this.count = model.count;
            this.ipamResourceDiscoveries = model.ipamResourceDiscoveries;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The maximum number of entries on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The list of resource discovery instances.</p>
         */
        public Builder ipamResourceDiscoveries(java.util.List<IpamResourceDiscoveries> ipamResourceDiscoveries) {
            this.ipamResourceDiscoveries = ipamResourceDiscoveries;
            return this;
        }

        /**
         * <p>The maximum number of entries on each page. Valid values: 1 to 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, there is no next page.</li>
         * <li>If a value of <strong>NextToken</strong> is returned, it indicates the token that is used for the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>86137597-443F-5B66-B9B6-8514E0C50B8F</p>
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
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListIpamResourceDiscoveriesResponseBody build() {
            return new ListIpamResourceDiscoveriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIpamResourceDiscoveriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListIpamResourceDiscoveriesResponseBody</p>
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceJoshua</p>
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
     * {@link ListIpamResourceDiscoveriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListIpamResourceDiscoveriesResponseBody</p>
     */
    public static class IpamResourceDiscoveries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("IpamResourceDiscoveryDescription")
        private String ipamResourceDiscoveryDescription;

        @com.aliyun.core.annotation.NameInMap("IpamResourceDiscoveryId")
        private String ipamResourceDiscoveryId;

        @com.aliyun.core.annotation.NameInMap("IpamResourceDiscoveryName")
        private String ipamResourceDiscoveryName;

        @com.aliyun.core.annotation.NameInMap("IpamResourceDiscoveryStatus")
        private String ipamResourceDiscoveryStatus;

        @com.aliyun.core.annotation.NameInMap("OperatingRegionList")
        private java.util.List<String> operatingRegionList;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private Long ownerId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ShareType")
        private String shareType;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private IpamResourceDiscoveries(Builder builder) {
            this.createTime = builder.createTime;
            this.ipamResourceDiscoveryDescription = builder.ipamResourceDiscoveryDescription;
            this.ipamResourceDiscoveryId = builder.ipamResourceDiscoveryId;
            this.ipamResourceDiscoveryName = builder.ipamResourceDiscoveryName;
            this.ipamResourceDiscoveryStatus = builder.ipamResourceDiscoveryStatus;
            this.operatingRegionList = builder.operatingRegionList;
            this.ownerId = builder.ownerId;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.shareType = builder.shareType;
            this.tags = builder.tags;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpamResourceDiscoveries create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return ipamResourceDiscoveryDescription
         */
        public String getIpamResourceDiscoveryDescription() {
            return this.ipamResourceDiscoveryDescription;
        }

        /**
         * @return ipamResourceDiscoveryId
         */
        public String getIpamResourceDiscoveryId() {
            return this.ipamResourceDiscoveryId;
        }

        /**
         * @return ipamResourceDiscoveryName
         */
        public String getIpamResourceDiscoveryName() {
            return this.ipamResourceDiscoveryName;
        }

        /**
         * @return ipamResourceDiscoveryStatus
         */
        public String getIpamResourceDiscoveryStatus() {
            return this.ipamResourceDiscoveryStatus;
        }

        /**
         * @return operatingRegionList
         */
        public java.util.List<String> getOperatingRegionList() {
            return this.operatingRegionList;
        }

        /**
         * @return ownerId
         */
        public Long getOwnerId() {
            return this.ownerId;
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
         * @return shareType
         */
        public String getShareType() {
            return this.shareType;
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
            private String createTime; 
            private String ipamResourceDiscoveryDescription; 
            private String ipamResourceDiscoveryId; 
            private String ipamResourceDiscoveryName; 
            private String ipamResourceDiscoveryStatus; 
            private java.util.List<String> operatingRegionList; 
            private Long ownerId; 
            private String regionId; 
            private String resourceGroupId; 
            private String shareType; 
            private java.util.List<Tags> tags; 
            private String type; 

            private Builder() {
            } 

            private Builder(IpamResourceDiscoveries model) {
                this.createTime = model.createTime;
                this.ipamResourceDiscoveryDescription = model.ipamResourceDiscoveryDescription;
                this.ipamResourceDiscoveryId = model.ipamResourceDiscoveryId;
                this.ipamResourceDiscoveryName = model.ipamResourceDiscoveryName;
                this.ipamResourceDiscoveryStatus = model.ipamResourceDiscoveryStatus;
                this.operatingRegionList = model.operatingRegionList;
                this.ownerId = model.ownerId;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.shareType = model.shareType;
                this.tags = model.tags;
                this.type = model.type;
            } 

            /**
             * <p>The time when the resource was discovered.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-01T02:05:23Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the resource discovery.</p>
             * 
             * <strong>example:</strong>
             * <p>test description</p>
             */
            public Builder ipamResourceDiscoveryDescription(String ipamResourceDiscoveryDescription) {
                this.ipamResourceDiscoveryDescription = ipamResourceDiscoveryDescription;
                return this;
            }

            /**
             * <p>The ID of resource discovery instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ipam-res-disco-jt5f2af2u6nk2z321****</p>
             */
            public Builder ipamResourceDiscoveryId(String ipamResourceDiscoveryId) {
                this.ipamResourceDiscoveryId = ipamResourceDiscoveryId;
                return this;
            }

            /**
             * <p>The name of the resource discovery.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder ipamResourceDiscoveryName(String ipamResourceDiscoveryName) {
                this.ipamResourceDiscoveryName = ipamResourceDiscoveryName;
                return this;
            }

            /**
             * <p>The status of the resource discovery instance. Valid values:</p>
             * <ul>
             * <li><strong>Creating</strong></li>
             * <li><strong>Created</strong></li>
             * <li><strong>Modifying</strong></li>
             * <li><strong>Deleting</strong></li>
             * <li><strong>Deleted</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Created</p>
             */
            public Builder ipamResourceDiscoveryStatus(String ipamResourceDiscoveryStatus) {
                this.ipamResourceDiscoveryStatus = ipamResourceDiscoveryStatus;
                return this;
            }

            /**
             * <p>The list of resource discovery regions.</p>
             */
            public Builder operatingRegionList(java.util.List<String> operatingRegionList) {
                this.operatingRegionList = operatingRegionList;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account that owns the resource discovery.</p>
             * 
             * <strong>example:</strong>
             * <p>1210123456******</p>
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The region ID of the queried resource discovery instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the resource group that resource discovery belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek2sermdd6****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The sharing status of the resource.</p>
             * <ul>
             * <li>If the value is empty, the resource is as an average instance.</li>
             * <li>If the value is Shared, the resource discovery comes from a shared source.</li>
             * <li>If the value is Sharing, the resource discovery is being shared.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Shared</p>
             */
            public Builder shareType(String shareType) {
                this.shareType = shareType;
                return this;
            }

            /**
             * <p>The tag list.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The type of resource discovery.</p>
             * 
             * <strong>example:</strong>
             * <p>system</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public IpamResourceDiscoveries build() {
                return new IpamResourceDiscoveries(this);
            } 

        } 

    }
}
