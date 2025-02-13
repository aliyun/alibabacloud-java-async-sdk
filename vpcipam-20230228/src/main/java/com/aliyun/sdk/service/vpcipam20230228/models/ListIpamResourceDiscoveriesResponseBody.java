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

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * IpamResourceDiscoveries.
         */
        public Builder ipamResourceDiscoveries(java.util.List<IpamResourceDiscoveries> ipamResourceDiscoveries) {
            this.ipamResourceDiscoveries = ipamResourceDiscoveries;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
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

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * IpamResourceDiscoveryDescription.
             */
            public Builder ipamResourceDiscoveryDescription(String ipamResourceDiscoveryDescription) {
                this.ipamResourceDiscoveryDescription = ipamResourceDiscoveryDescription;
                return this;
            }

            /**
             * IpamResourceDiscoveryId.
             */
            public Builder ipamResourceDiscoveryId(String ipamResourceDiscoveryId) {
                this.ipamResourceDiscoveryId = ipamResourceDiscoveryId;
                return this;
            }

            /**
             * IpamResourceDiscoveryName.
             */
            public Builder ipamResourceDiscoveryName(String ipamResourceDiscoveryName) {
                this.ipamResourceDiscoveryName = ipamResourceDiscoveryName;
                return this;
            }

            /**
             * IpamResourceDiscoveryStatus.
             */
            public Builder ipamResourceDiscoveryStatus(String ipamResourceDiscoveryStatus) {
                this.ipamResourceDiscoveryStatus = ipamResourceDiscoveryStatus;
                return this;
            }

            /**
             * OperatingRegionList.
             */
            public Builder operatingRegionList(java.util.List<String> operatingRegionList) {
                this.operatingRegionList = operatingRegionList;
                return this;
            }

            /**
             * OwnerId.
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
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
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * ShareType.
             */
            public Builder shareType(String shareType) {
                this.shareType = shareType;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * Type.
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
