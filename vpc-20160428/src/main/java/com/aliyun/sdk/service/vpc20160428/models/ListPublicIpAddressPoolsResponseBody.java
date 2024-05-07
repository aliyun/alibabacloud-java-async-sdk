// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPublicIpAddressPoolsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPublicIpAddressPoolsResponseBody</p>
 */
public class ListPublicIpAddressPoolsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PublicIpAddressPoolList")
    private java.util.List < PublicIpAddressPoolList> publicIpAddressPoolList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * A pagination token. It can be used in the next request to retrieve a new page of results.
         * <p>
         * 
         * *   If **NextToken** is empty, no next page exists.
         * *   If a value is returned for **NextToken**, the value is used to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The IP address pools.
         */
        public Builder publicIpAddressPoolList(java.util.List < PublicIpAddressPoolList> publicIpAddressPoolList) {
            this.publicIpAddressPoolList = publicIpAddressPoolList;
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
         * The total number of entries returned.
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
             * The key of tag N.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N.
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
        @com.aliyun.core.annotation.NameInMap("BizType")
        private String bizType;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("IpAddressRemaining")
        private Boolean ipAddressRemaining;

        @com.aliyun.core.annotation.NameInMap("Isp")
        private String isp;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private Long ownerId;

        @com.aliyun.core.annotation.NameInMap("PublicIpAddressPoolId")
        private String publicIpAddressPoolId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SecurityProtectionTypes")
        private java.util.List < String > securityProtectionTypes;

        @com.aliyun.core.annotation.NameInMap("ShareType")
        private String shareType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TotalIpNum")
        private Integer totalIpNum;

        @com.aliyun.core.annotation.NameInMap("UsedIpNum")
        private Integer usedIpNum;

        @com.aliyun.core.annotation.NameInMap("UserType")
        private Boolean userType;

        @com.aliyun.core.annotation.NameInMap("Zones")
        private java.util.List < String > zones;

        private PublicIpAddressPoolList(Builder builder) {
            this.bizType = builder.bizType;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.ipAddressRemaining = builder.ipAddressRemaining;
            this.isp = builder.isp;
            this.name = builder.name;
            this.ownerId = builder.ownerId;
            this.publicIpAddressPoolId = builder.publicIpAddressPoolId;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.securityProtectionTypes = builder.securityProtectionTypes;
            this.shareType = builder.shareType;
            this.status = builder.status;
            this.tags = builder.tags;
            this.totalIpNum = builder.totalIpNum;
            this.usedIpNum = builder.usedIpNum;
            this.userType = builder.userType;
            this.zones = builder.zones;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublicIpAddressPoolList create() {
            return builder().build();
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
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
         * @return securityProtectionTypes
         */
        public java.util.List < String > getSecurityProtectionTypes() {
            return this.securityProtectionTypes;
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

        /**
         * @return zones
         */
        public java.util.List < String > getZones() {
            return this.zones;
        }

        public static final class Builder {
            private String bizType; 
            private String creationTime; 
            private String description; 
            private Boolean ipAddressRemaining; 
            private String isp; 
            private String name; 
            private Long ownerId; 
            private String publicIpAddressPoolId; 
            private String regionId; 
            private String resourceGroupId; 
            private java.util.List < String > securityProtectionTypes; 
            private String shareType; 
            private String status; 
            private java.util.List < Tags> tags; 
            private Integer totalIpNum; 
            private Integer usedIpNum; 
            private Boolean userType; 
            private java.util.List < String > zones; 

            /**
             * The service type of the IP address pool.
             * <p>
             * 
             * *   **CloudBox** Only cloud box users can select this type.
             * *   **Default** (default)
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * The time when the IP address pool was created. The time is displayed in the `YYYY-MM-DDThh:mm:ssZ` format.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The description of the IP address pool.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Indicates whether idle IP addresses exist.
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder ipAddressRemaining(Boolean ipAddressRemaining) {
                this.ipAddressRemaining = ipAddressRemaining;
                return this;
            }

            /**
             * The line type.
             * <p>
             * 
             * *   **BGP**: BGP (Multi-ISP)
             * *   **BGP_PRO**: BGP (Multi-ISP) Pro
             * 
             * For more information about BGP (Multi-ISP) and BGP (Multi-ISP) Pro, see [EIP line types](~~32321~~).
             * 
             * If you are allowed to use single-ISP bandwidth, one of the following values may be returned:
             * 
             * *   **ChinaTelecom**
             * *   **ChinaUnicom**
             * *   **ChinaMobile**
             * *   **ChinaTelecom_L2**
             * *   **ChinaUnicom_L2**
             * *   **ChinaMobile_L2**
             * 
             * If your services are deployed in China East 1 Finance, **BGP_FinanceCloud** is returned.
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * The name of the IP address pool.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The Alibaba Cloud account to which the IP address pool belongs.
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * The ID of the IP address pool.
             */
            public Builder publicIpAddressPoolId(String publicIpAddressPoolId) {
                this.publicIpAddressPoolId = publicIpAddressPoolId;
                return this;
            }

            /**
             * The region ID of the IP address pool.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the resource group to which the IP address pool belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The edition of Anti-DDoS.
             * <p>
             * 
             * *   If you do not set this parameter, Anti-DDoS Origin Basic is used.
             * *   If the value is set to **AntiDDoS_Enhanced**, Anti-DDoS Pro/Premium is used.
             */
            public Builder securityProtectionTypes(java.util.List < String > securityProtectionTypes) {
                this.securityProtectionTypes = securityProtectionTypes;
                return this;
            }

            /**
             * The sharing type of the IP address pool.
             * <p>
             * 
             * *   If **Shared** is returned, the IP address pool is shared.
             * *   If an empty value is returned, the IP address pool is not shared.
             */
            public Builder shareType(String shareType) {
                this.shareType = shareType;
                return this;
            }

            /**
             * The status of the IP address pool.
             * <p>
             * 
             * *   **Created**
             * *   **Deleting**
             * *   **Modifying**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tag list.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The total number of available IP addresses in the public IP address pool.
             */
            public Builder totalIpNum(Integer totalIpNum) {
                this.totalIpNum = totalIpNum;
                return this;
            }

            /**
             * The number of used IP addresses in the public IP address pool.
             */
            public Builder usedIpNum(Integer usedIpNum) {
                this.usedIpNum = usedIpNum;
                return this;
            }

            /**
             * The user type. Valid values:
             * <p>
             * 
             * *   **admin**: An administrator can delete, modify, and query IP address pools, and can assign elastic IP addresses (EIPs) to the pool.
             * *   **user**: A user can only assign EIPs to the IP address pool and query the IP address pool, but cannot modify or delete the IP address pool.
             */
            public Builder userType(Boolean userType) {
                this.userType = userType;
                return this;
            }

            /**
             * The zone of the IP address pool. This parameter is returned only when the service type of the IP address pool is CloudBox.
             */
            public Builder zones(java.util.List < String > zones) {
                this.zones = zones;
                return this;
            }

            public PublicIpAddressPoolList build() {
                return new PublicIpAddressPoolList(this);
            } 

        } 

    }
}
