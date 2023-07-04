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
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("PublicIpAddressPoolList")
    private java.util.List < PublicIpAddressPoolList> publicIpAddressPoolList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListPublicIpAddressPoolsResponseBody(Builder builder) {
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
        private String nextToken; 
        private java.util.List < PublicIpAddressPoolList> publicIpAddressPoolList; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The token that determines the start point of the next query. Valid values:
         * <p>
         * 
         * *   If **NextToken** is returned, it indicates that no additional results exist.
         * *   If **NextToken** is returned, the value indicates the token that is used for the next query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder publicIpAddressPoolList(java.util.List < PublicIpAddressPoolList> publicIpAddressPoolList) {
            this.publicIpAddressPoolList = publicIpAddressPoolList;
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
         * The maximum number of entries returned.
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
             * The list of tags.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The key of the tag.
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

        @NameInMap("UserType")
        private Boolean userType;

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
            this.userType = builder.userType;
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

        /**
         * @return userType
         */
        public Boolean getUserType() {
            return this.userType;
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
            private Boolean userType; 

            /**
             * The region ID of the IP address pool.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The status of the IP address pool. Valid values:
             * <p>
             * 
             * *   **Created**: The IP address pool is available.
             * *   **Deleting**: The IP address pool is being deleted.
             * *   **Modifying**: The IP address pool is being modified.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The number of occupied IP addresses in the public IP address pool.
             */
            public Builder ipAddressRemaining(Boolean ipAddressRemaining) {
                this.ipAddressRemaining = ipAddressRemaining;
                return this;
            }

            /**
             * The time when the IP address pool was created. The time is displayed in `YYYY-MM-DDThh:mm:ssZ` format.
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * The line type.
             * <p>
             * 
             * *   **BGP**: BGP (Multi-ISP) lines
             * *   **BGP_PRO**: BGP (Multi-ISP) Pro lines
             * 
             * For more information about BGP (Multi-ISP) and BGP (Multi-ISP) Pro, see [EIP line types](~~32321~~).
             * 
             * If you are allowed to use single-ISP bandwidth, one of the following values is returned:
             * 
             * *   **ChinaTelecom**: China Telecom
             * *   **ChinaUnicom**: China Unicom
             * *   **ChinaMobile**: China Mobile
             * *   **ChinaTelecom_L2**: China Telecom L2
             * *   **ChinaUnicom_L2**: China Unicom L2
             * *   **ChinaMobile_L2**: China Mobile L2
             * 
             * If your services are deployed in China East 1 Finance, **BGP_FinanceCloud** is returned.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Indicates whether the IP address pool has idle IP addresses. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * The list of IP address pools.
             */
            public Builder publicIpAddressPoolId(String publicIpAddressPoolId) {
                this.publicIpAddressPoolId = publicIpAddressPoolId;
                return this;
            }

            /**
             * The ID of the IP address pool.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Indicates whether the IP address pool is shared.
             * <p>
             * 
             * *   **Shared**: The IP address pool is shared.
             * *   An empty value indicates that the IP address pool is not shared.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The Alibaba Cloud account to which the IP address pool belongs.
             */
            public Builder shareType(String shareType) {
                this.shareType = shareType;
                return this;
            }

            /**
             * The name of the IP address pool.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the resource group to which the IP address pool belongs.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The description of the IP address pool.
             */
            public Builder totalIpNum(Integer totalIpNum) {
                this.totalIpNum = totalIpNum;
                return this;
            }

            /**
             * The total number of IP addresses in the public IP address pool.
             */
            public Builder usedIpNum(Integer usedIpNum) {
                this.usedIpNum = usedIpNum;
                return this;
            }

            /**
             * UserType.
             */
            public Builder userType(Boolean userType) {
                this.userType = userType;
                return this;
            }

            public PublicIpAddressPoolList build() {
                return new PublicIpAddressPoolList(this);
            } 

        } 

    }
}
