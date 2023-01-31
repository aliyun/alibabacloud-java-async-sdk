// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPublicIpAddressPoolsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPublicIpAddressPoolsResponseBody</p>
 */
public class ListPublicIpAddressPoolsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("PublicIpAddressPoolList")
    private java.util.List < PublicIpAddressPoolList> publicIpAddressPoolList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListPublicIpAddressPoolsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.publicIpAddressPoolList = builder.publicIpAddressPoolList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPublicIpAddressPoolsResponseBody create() {
        return builder().build();
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
     * @return publicIpAddressPoolList
     */
    public java.util.List < PublicIpAddressPoolList> getPublicIpAddressPoolList() {
        return this.publicIpAddressPoolList;
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
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List < PublicIpAddressPoolList> publicIpAddressPoolList; 
        private String requestId; 
        private Integer totalCount; 

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
         * PublicIpAddressPoolList.
         */
        public Builder publicIpAddressPoolList(java.util.List < PublicIpAddressPoolList> publicIpAddressPoolList) {
            this.publicIpAddressPoolList = publicIpAddressPoolList;
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
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListPublicIpAddressPoolsResponseBody build() {
            return new ListPublicIpAddressPoolsResponseBody(this);
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
    public static class PublicIpAddressPoolList extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("IpAddressRemaining")
        private Boolean ipAddressRemaining;

        @NameInMap("Isp")
        private String isp;

        @NameInMap("Name")
        private String name;

        @NameInMap("OwnerId")
        private Long ownerId;

        @NameInMap("PublicIpAddressPoolId")
        private String publicIpAddressPoolId;

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

        @NameInMap("TotalIpNum")
        private Integer totalIpNum;

        @NameInMap("UsedIpNum")
        private Integer usedIpNum;

        private PublicIpAddressPoolList(Builder builder) {
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.ipAddressRemaining = builder.ipAddressRemaining;
            this.isp = builder.isp;
            this.name = builder.name;
            this.ownerId = builder.ownerId;
            this.publicIpAddressPoolId = builder.publicIpAddressPoolId;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.shareType = builder.shareType;
            this.status = builder.status;
            this.tags = builder.tags;
            this.totalIpNum = builder.totalIpNum;
            this.usedIpNum = builder.usedIpNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublicIpAddressPoolList create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ipAddressRemaining
         */
        public Boolean getIpAddressRemaining() {
            return this.ipAddressRemaining;
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
         * @return ownerId
         */
        public Long getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return publicIpAddressPoolId
         */
        public String getPublicIpAddressPoolId() {
            return this.publicIpAddressPoolId;
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

        /**
         * @return totalIpNum
         */
        public Integer getTotalIpNum() {
            return this.totalIpNum;
        }

        /**
         * @return usedIpNum
         */
        public Integer getUsedIpNum() {
            return this.usedIpNum;
        }

        public static final class Builder {
            private String creationTime; 
            private String description; 
            private Boolean ipAddressRemaining; 
            private String isp; 
            private String name; 
            private Long ownerId; 
            private String publicIpAddressPoolId; 
            private String regionId; 
            private String resourceGroupId; 
            private String shareType; 
            private String status; 
            private java.util.List < Tags> tags; 
            private Integer totalIpNum; 
            private Integer usedIpNum; 

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * IpAddressRemaining.
             */
            public Builder ipAddressRemaining(Boolean ipAddressRemaining) {
                this.ipAddressRemaining = ipAddressRemaining;
                return this;
            }

            /**
             * Isp.
             */
            public Builder isp(String isp) {
                this.isp = isp;
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
             * OwnerId.
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * PublicIpAddressPoolId.
             */
            public Builder publicIpAddressPoolId(String publicIpAddressPoolId) {
                this.publicIpAddressPoolId = publicIpAddressPoolId;
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

            /**
             * TotalIpNum.
             */
            public Builder totalIpNum(Integer totalIpNum) {
                this.totalIpNum = totalIpNum;
                return this;
            }

            /**
             * UsedIpNum.
             */
            public Builder usedIpNum(Integer usedIpNum) {
                this.usedIpNum = usedIpNum;
                return this;
            }

            public PublicIpAddressPoolList build() {
                return new PublicIpAddressPoolList(this);
            } 

        } 

    }
}
