// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link ListPrefixListsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPrefixListsResponseBody</p>
 */
public class ListPrefixListsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PrefixLists")
    private java.util.List<PrefixLists> prefixLists;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
    public java.util.List<PrefixLists> getPrefixLists() {
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
        private java.util.List<PrefixLists> prefixLists; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>The number of entries per page. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
         * <li>If a value is returned for <strong>NextToken</strong>, the value indicates the token that is used for the next request to retrieve a new page of results.</li>
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
         * <p>The information about the prefix lists.</p>
         */
        public Builder prefixLists(java.util.List<PrefixLists> prefixLists) {
            this.prefixLists = prefixLists;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DF72F7BB-5DFA-529C-887E-B0BB70D89C4F</p>
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

        public ListPrefixListsResponseBody build() {
            return new ListPrefixListsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPrefixListsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPrefixListsResponseBody</p>
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
     * {@link ListPrefixListsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPrefixListsResponseBody</p>
     */
    public static class PrefixLists extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CidrBlocks")
        private java.util.List<String> cidrBlocks;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("IpVersion")
        private String ipVersion;

        @com.aliyun.core.annotation.NameInMap("MaxEntries")
        private Integer maxEntries;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("PrefixListDescription")
        private String prefixListDescription;

        @com.aliyun.core.annotation.NameInMap("PrefixListId")
        private String prefixListId;

        @com.aliyun.core.annotation.NameInMap("PrefixListName")
        private String prefixListName;

        @com.aliyun.core.annotation.NameInMap("PrefixListStatus")
        private String prefixListStatus;

        @com.aliyun.core.annotation.NameInMap("PrefixListType")
        private String prefixListType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ShareType")
        private String shareType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

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
            this.prefixListType = builder.prefixListType;
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
        public java.util.List<String> getCidrBlocks() {
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
         * @return prefixListType
         */
        public String getPrefixListType() {
            return this.prefixListType;
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
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private java.util.List<String> cidrBlocks; 
            private String creationTime; 
            private String ipVersion; 
            private Integer maxEntries; 
            private String ownerId; 
            private String prefixListDescription; 
            private String prefixListId; 
            private String prefixListName; 
            private String prefixListStatus; 
            private String prefixListType; 
            private String regionId; 
            private String resourceGroupId; 
            private String shareType; 
            private String status; 
            private java.util.List<Tags> tags; 

            /**
             * <p>The CIDR block specified in the prefix list.</p>
             */
            public Builder cidrBlocks(java.util.List<String> cidrBlocks) {
                this.cidrBlocks = cidrBlocks;
                return this;
            }

            /**
             * <p>The time when the prefix list was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-12T14:22:32Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The IP version of the prefix list. Valid values:</p>
             * <ul>
             * <li><strong>IPV4</strong></li>
             * <li><strong>IPV6</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IPV4</p>
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * <p>The maximum number of CIDR blocks that you can specify in the prefix list.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxEntries(Integer maxEntries) {
                this.maxEntries = maxEntries;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account to which the prefix list belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1210123456123456</p>
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The description of the prefix list.</p>
             * 
             * <strong>example:</strong>
             * <p>Created with oss service by system.</p>
             */
            public Builder prefixListDescription(String prefixListDescription) {
                this.prefixListDescription = prefixListDescription;
                return this;
            }

            /**
             * <p>The ID of the prefix list.</p>
             * 
             * <strong>example:</strong>
             * <p>pl-m5estsqsdqwg88hjf****</p>
             */
            public Builder prefixListId(String prefixListId) {
                this.prefixListId = prefixListId;
                return this;
            }

            /**
             * <p>The name of the prefix list.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder prefixListName(String prefixListName) {
                this.prefixListName = prefixListName;
                return this;
            }

            /**
             * <p>The status of the prefix list. Valid values:</p>
             * <ul>
             * <li><strong>Created</strong></li>
             * <li><strong>Deleted</strong></li>
             * <li><strong>Modifying</strong></li>
             * </ul>
             * <blockquote>
             * <p> This parameter is the same as the <strong>Status</strong> parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Created</p>
             */
            public Builder prefixListStatus(String prefixListStatus) {
                this.prefixListStatus = prefixListStatus;
                return this;
            }

            /**
             * <p>The type of the prefix list.</p>
             * 
             * <strong>example:</strong>
             * <p>Custom</p>
             */
            public Builder prefixListType(String prefixListType) {
                this.prefixListType = prefixListType;
                return this;
            }

            /**
             * <p>The region ID of the prefix list.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the prefix list belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-bp67acfmxazb4ph****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>Indicates whether the prefix list is shared. Valid values:</p>
             * <ul>
             * <li><strong>Shared</strong>: The prefix list is shared.</li>
             * <li>If an empty value is returned, the prefix list is not shared.</li>
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
             * <p>The status of the prefix list. Valid values:</p>
             * <ul>
             * <li><strong>Created</strong></li>
             * <li><strong>Deleted</strong></li>
             * <li><strong>Modifying</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Created</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public PrefixLists build() {
                return new PrefixLists(this);
            } 

        } 

    }
}
