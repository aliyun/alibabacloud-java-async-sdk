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
         * The number of entries returned per page. Valid values: **1** to **100**. Default value: **20**.
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that is used for the next query. Valid values:
         * <p>
         * 
         * *   If no value is returned for **NextToken**, no next queries are sent.
         * *   If a value is returned for **NextToken**, the value indicates the token that is used for the next query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The information about the prefix lists.
         */
        public Builder prefixLists(java.util.List < PrefixLists> prefixLists) {
            this.prefixLists = prefixLists;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
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
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
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
             * The CIDR block specified in the prefix list.
             */
            public Builder cidrBlocks(java.util.List < String > cidrBlocks) {
                this.cidrBlocks = cidrBlocks;
                return this;
            }

            /**
             * The time when the prefix list was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The IP version of the prefix list. Valid values:
             * <p>
             * 
             * *   **IPv4**
             * *   **IPV6**
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * The maximum number of CIDR blocks that you can specify in the prefix list.
             */
            public Builder maxEntries(Integer maxEntries) {
                this.maxEntries = maxEntries;
                return this;
            }

            /**
             * The Alibaba Cloud account to which the prefix list belongs.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * The description of the prefix list.
             */
            public Builder prefixListDescription(String prefixListDescription) {
                this.prefixListDescription = prefixListDescription;
                return this;
            }

            /**
             * The ID of the prefix list.
             */
            public Builder prefixListId(String prefixListId) {
                this.prefixListId = prefixListId;
                return this;
            }

            /**
             * The name of the prefix list.
             */
            public Builder prefixListName(String prefixListName) {
                this.prefixListName = prefixListName;
                return this;
            }

            /**
             * The status of the prefix list. Valid values:
             * <p>
             * 
             * *   **Created**
             * *   **Deleted**
             * *   **Modifying**
             * 
             * >  This parameter is the same as the **Status** parameter.
             */
            public Builder prefixListStatus(String prefixListStatus) {
                this.prefixListStatus = prefixListStatus;
                return this;
            }

            /**
             * The region ID of the prefix list.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the resource group to which the prefix list belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Indicates whether the prefix list is shared. Valid values:
             * <p>
             * 
             * *   **Shared**: The prefix list is shared.
             * *   If an empty value is returned, it indicates that the prefix list is not shared.
             */
            public Builder shareType(String shareType) {
                this.shareType = shareType;
                return this;
            }

            /**
             * The status of the prefix list. Valid values:
             * <p>
             * 
             * *   **Created**
             * *   **Deleted**
             * *   **Modifying**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The list of tags that are added to the resource group.
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
