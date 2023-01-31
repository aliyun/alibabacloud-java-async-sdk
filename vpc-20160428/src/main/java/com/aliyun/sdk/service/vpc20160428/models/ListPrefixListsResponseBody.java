// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPrefixListsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPrefixListsResponseBody</p>
 */
public class ListPrefixListsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Long maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("PrefixLists")
    private java.util.List < PrefixLists> prefixLists;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListPrefixListsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.prefixLists = builder.prefixLists;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrefixListsResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return prefixLists
     */
    public java.util.List < PrefixLists> getPrefixLists() {
        return this.prefixLists;
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
        private Long maxResults; 
        private String nextToken; 
        private java.util.List < PrefixLists> prefixLists; 
        private String requestId; 
        private Long totalCount; 

        /**
         * MaxResults.
         */
        public Builder maxResults(Long maxResults) {
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
         * PrefixLists.
         */
        public Builder prefixLists(java.util.List < PrefixLists> prefixLists) {
            this.prefixLists = prefixLists;
            return this;
        }

        /**
         * Id of the request
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

        public ListPrefixListsResponseBody build() {
            return new ListPrefixListsResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
    public static class PrefixLists extends TeaModel {
        @NameInMap("CidrBlocks")
        private java.util.List < String > cidrBlocks;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("IpVersion")
        private String ipVersion;

        @NameInMap("MaxEntries")
        private Integer maxEntries;

        @NameInMap("OwnerId")
        private String ownerId;

        @NameInMap("PrefixListDescription")
        private String prefixListDescription;

        @NameInMap("PrefixListId")
        private String prefixListId;

        @NameInMap("PrefixListName")
        private String prefixListName;

        @NameInMap("PrefixListStatus")
        private String prefixListStatus;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("ShareType")
        private String shareType;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        private PrefixLists(Builder builder) {
            this.cidrBlocks = builder.cidrBlocks;
            this.creationTime = builder.creationTime;
            this.ipVersion = builder.ipVersion;
            this.maxEntries = builder.maxEntries;
            this.ownerId = builder.ownerId;
            this.prefixListDescription = builder.prefixListDescription;
            this.prefixListId = builder.prefixListId;
            this.prefixListName = builder.prefixListName;
            this.prefixListStatus = builder.prefixListStatus;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.shareType = builder.shareType;
            this.status = builder.status;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrefixLists create() {
            return builder().build();
        }

        /**
         * @return cidrBlocks
         */
        public java.util.List < String > getCidrBlocks() {
            return this.cidrBlocks;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return ipVersion
         */
        public String getIpVersion() {
            return this.ipVersion;
        }

        /**
         * @return maxEntries
         */
        public Integer getMaxEntries() {
            return this.maxEntries;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return prefixListDescription
         */
        public String getPrefixListDescription() {
            return this.prefixListDescription;
        }

        /**
         * @return prefixListId
         */
        public String getPrefixListId() {
            return this.prefixListId;
        }

        /**
         * @return prefixListName
         */
        public String getPrefixListName() {
            return this.prefixListName;
        }

        /**
         * @return prefixListStatus
         */
        public String getPrefixListStatus() {
            return this.prefixListStatus;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private java.util.List < String > cidrBlocks; 
            private String creationTime; 
            private String ipVersion; 
            private Integer maxEntries; 
            private String ownerId; 
            private String prefixListDescription; 
            private String prefixListId; 
            private String prefixListName; 
            private String prefixListStatus; 
            private String regionId; 
            private String resourceGroupId; 
            private String shareType; 
            private String status; 
            private java.util.List < Tags> tags; 

            /**
             * 前缀列表包含的网段
             */
            public Builder cidrBlocks(java.util.List < String > cidrBlocks) {
                this.cidrBlocks = cidrBlocks;
                return this;
            }

            /**
             * 创建时间
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * IpVersion
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * MaxEntries.
             */
            public Builder maxEntries(Integer maxEntries) {
                this.maxEntries = maxEntries;
                return this;
            }

            /**
             * OwnerId.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * 描述
             */
            public Builder prefixListDescription(String prefixListDescription) {
                this.prefixListDescription = prefixListDescription;
                return this;
            }

            /**
             * 前缀列表的实例ID
             */
            public Builder prefixListId(String prefixListId) {
                this.prefixListId = prefixListId;
                return this;
            }

            /**
             * 名称
             */
            public Builder prefixListName(String prefixListName) {
                this.prefixListName = prefixListName;
                return this;
            }

            /**
             * PrefixListStatus.
             */
            public Builder prefixListStatus(String prefixListStatus) {
                this.prefixListStatus = prefixListStatus;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public PrefixLists build() {
                return new PrefixLists(this);
            } 

        } 

    }
}
