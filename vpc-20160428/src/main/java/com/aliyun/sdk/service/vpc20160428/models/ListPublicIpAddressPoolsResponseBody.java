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
 * {@link ListPublicIpAddressPoolsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPublicIpAddressPoolsResponseBody</p>
 */
public class ListPublicIpAddressPoolsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PublicIpAddressPoolList")
    private java.util.List<PublicIpAddressPoolList> publicIpAddressPoolList;

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
    public java.util.List<PublicIpAddressPoolList> getPublicIpAddressPoolList() {
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
        private java.util.List<PublicIpAddressPoolList> publicIpAddressPoolList; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
         * <li>If a value is returned for <strong>NextToken</strong>, the value is used to retrieve a new page of results.</li>
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
         * <p>The IP address pools.</p>
         */
        public Builder publicIpAddressPoolList(java.util.List<PublicIpAddressPoolList> publicIpAddressPoolList) {
            this.publicIpAddressPoolList = publicIpAddressPoolList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
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
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListPublicIpAddressPoolsResponseBody build() {
            return new ListPublicIpAddressPoolsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPublicIpAddressPoolsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPublicIpAddressPoolsResponseBody</p>
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
             * <p>The key of tag N.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
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
     * {@link ListPublicIpAddressPoolsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPublicIpAddressPoolsResponseBody</p>
     */
    public static class PublicIpAddressPoolList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizType")
        private String bizType;

        @com.aliyun.core.annotation.NameInMap("BusinessStatus")
        private String businessStatus;

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
        private java.util.List<String> securityProtectionTypes;

        @com.aliyun.core.annotation.NameInMap("ShareType")
        private String shareType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TotalIpNum")
        private Integer totalIpNum;

        @com.aliyun.core.annotation.NameInMap("UsedIpNum")
        private Integer usedIpNum;

        @com.aliyun.core.annotation.NameInMap("UserType")
        private String userType;

        @com.aliyun.core.annotation.NameInMap("Zones")
        private java.util.List<String> zones;

        private PublicIpAddressPoolList(Builder builder) {
            this.bizType = builder.bizType;
            this.businessStatus = builder.businessStatus;
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
         * @return businessStatus
         */
        public String getBusinessStatus() {
            return this.businessStatus;
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
        public java.util.List<String> getSecurityProtectionTypes() {
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
        public java.util.List<Tags> getTags() {
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
        public String getUserType() {
            return this.userType;
        }

        /**
         * @return zones
         */
        public java.util.List<String> getZones() {
            return this.zones;
        }

        public static final class Builder {
            private String bizType; 
            private String businessStatus; 
            private String creationTime; 
            private String description; 
            private Boolean ipAddressRemaining; 
            private String isp; 
            private String name; 
            private Long ownerId; 
            private String publicIpAddressPoolId; 
            private String regionId; 
            private String resourceGroupId; 
            private java.util.List<String> securityProtectionTypes; 
            private String shareType; 
            private String status; 
            private java.util.List<Tags> tags; 
            private Integer totalIpNum; 
            private Integer usedIpNum; 
            private String userType; 
            private java.util.List<String> zones; 

            /**
             * <p>The service type of the IP address pool.</p>
             * <ul>
             * <li><strong>CloudBox</strong> Only cloud box users can select this type.</li>
             * <li><strong>Default</strong> (default)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CloudBox</p>
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * <p>The status of the IP address pool.</p>
             * <ul>
             * <li><strong>Normal</strong></li>
             * <li><strong>FinancialLocked</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * <p>The time when the IP address pool was created. The time is displayed in the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-05-10T01:37:38Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the IP address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>AddressPoolDescription</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether idle IP addresses exist.</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ipAddressRemaining(Boolean ipAddressRemaining) {
                this.ipAddressRemaining = ipAddressRemaining;
                return this;
            }

            /**
             * <p>The line type.</p>
             * <ul>
             * <li><strong>BGP</strong>: BGP (Multi-ISP)</li>
             * <li><strong>BGP_PRO</strong>: BGP (Multi-ISP) Pro</li>
             * </ul>
             * <p>For more information about BGP (Multi-ISP) and BGP (Multi-ISP) Pro, see <a href="https://help.aliyun.com/document_detail/32321.html">EIP line types</a>.</p>
             * <p>If you are allowed to use single-ISP bandwidth, one of the following values may be returned:</p>
             * <ul>
             * <li><strong>ChinaTelecom</strong></li>
             * <li><strong>ChinaUnicom</strong></li>
             * <li><strong>ChinaMobile</strong></li>
             * <li><strong>ChinaTelecom_L2</strong></li>
             * <li><strong>ChinaUnicom_L2</strong></li>
             * <li><strong>ChinaMobile_L2</strong></li>
             * </ul>
             * <p>If your services are deployed in China East 1 Finance, <strong>BGP_FinanceCloud</strong> is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>BGP</p>
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * <p>The name of the IP address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>AddressPoolName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account to which the IP address pool belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>121012345612****</p>
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The ID of the IP address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>pippool-6wetvn6fumkgycssx****</p>
             */
            public Builder publicIpAddressPoolId(String publicIpAddressPoolId) {
                this.publicIpAddressPoolId = publicIpAddressPoolId;
                return this;
            }

            /**
             * <p>The region ID of the IP address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-chengdu</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the IP address pool belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmxazb4pcdvf****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The edition of Anti-DDoS.</p>
             * <ul>
             * <li>If you do not set this parameter, Anti-DDoS Origin Basic is used.</li>
             * <li>If the value is set to <strong>AntiDDoS_Enhanced</strong>, Anti-DDoS Pro/Premium is used.</li>
             * </ul>
             */
            public Builder securityProtectionTypes(java.util.List<String> securityProtectionTypes) {
                this.securityProtectionTypes = securityProtectionTypes;
                return this;
            }

            /**
             * <p>The sharing type of the IP address pool.</p>
             * <ul>
             * <li>If <strong>Shared</strong> is returned, the IP address pool is shared.</li>
             * <li>If an empty value is returned, the IP address pool is not shared.</li>
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
             * <p>The status of the IP address pool.</p>
             * <ul>
             * <li><strong>Created</strong></li>
             * <li><strong>Deleting</strong></li>
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
             * <p>The tag list.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The total number of available IP addresses in the public IP address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalIpNum(Integer totalIpNum) {
                this.totalIpNum = totalIpNum;
                return this;
            }

            /**
             * <p>The number of used IP addresses in the public IP address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder usedIpNum(Integer usedIpNum) {
                this.usedIpNum = usedIpNum;
                return this;
            }

            /**
             * <p>The user type. Valid values:</p>
             * <ul>
             * <li><strong>admin</strong>: An administrator can delete, modify, and query IP address pools, and can assign elastic IP addresses (EIPs) to the pool.</li>
             * <li><strong>user</strong>: A user can only assign EIPs to the IP address pool and query the IP address pool, but cannot modify or delete the IP address pool.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>admin</p>
             */
            public Builder userType(String userType) {
                this.userType = userType;
                return this;
            }

            /**
             * <p>The zone of the IP address pool. This parameter is returned only when the service type of the IP address pool is CloudBox.</p>
             */
            public Builder zones(java.util.List<String> zones) {
                this.zones = zones;
                return this;
            }

            public PublicIpAddressPoolList build() {
                return new PublicIpAddressPoolList(this);
            } 

        } 

    }
}
