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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListPublicIpAddressPoolsResponseBody model) {
            this.nextToken = model.nextToken;
            this.publicIpAddressPoolList = model.publicIpAddressPoolList;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no subsequent request is to be sent.</li>
         * <li>If <strong>NextToken</strong> is returned, the value indicates the token for the next query.</li>
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
         * <p>The list of IP address pool instances.</p>
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
         * <p>The total number of entries returned under the current request conditions.</p>
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

            private Builder() {
            } 

            private Builder(PublicIpAddressPoolList model) {
                this.bizType = model.bizType;
                this.businessStatus = model.businessStatus;
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.ipAddressRemaining = model.ipAddressRemaining;
                this.isp = model.isp;
                this.name = model.name;
                this.ownerId = model.ownerId;
                this.publicIpAddressPoolId = model.publicIpAddressPoolId;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.securityProtectionTypes = model.securityProtectionTypes;
                this.shareType = model.shareType;
                this.status = model.status;
                this.tags = model.tags;
                this.totalIpNum = model.totalIpNum;
                this.usedIpNum = model.usedIpNum;
                this.userType = model.userType;
                this.zones = model.zones;
            } 

            /**
             * <p>The business type of the IP address pool.</p>
             * <ul>
             * <li><strong>CloudBox</strong>: CloudBox. Only CloudBox users support this type.</li>
             * <li><strong>Default</strong> (default): default, indicating a non-special type.</li>
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
             * <p>The business status of the IP address pool instance.</p>
             * <ul>
             * <li><strong>Normal</strong>: normal.</li>
             * <li><strong>FinancialLocked</strong>: locked.</li>
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
             * <p>The creation time, in the format of <code>YYYY-MM-DDThh:mm:ssZ</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-05-10T01:37:38Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the IP address pool instance.</p>
             * 
             * <strong>example:</strong>
             * <p>AddressPoolDescription</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether idle IP addresses are available.</p>
             * <ul>
             * <li><strong>true</strong>: yes.</li>
             * <li><strong>false</strong>: no.</li>
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
             * <li><p><strong>BGP</strong>: BGP (multi-ISP) line.</p>
             * </li>
             * <li><p><strong>BGP_PRO</strong>: BGP (multi-ISP) Pro line.</p>
             * </li>
             * </ul>
             * <p>For more information about BGP (multi-ISP) lines and BGP (multi-ISP) Pro lines, see <a href="https://help.aliyun.com/document_detail/32321.html">EIP line types</a>.</p>
             * <p>If you are a whitelist user of single-ISP bandwidth, the returned type may also be:</p>
             * <ul>
             * <li><strong>ChinaTelecom</strong>: China Telecom</li>
             * <li><strong>ChinaUnicom</strong>: China Unicom</li>
             * <li><strong>ChinaMobile</strong>: China Mobile</li>
             * <li><strong>ChinaTelecom_L2</strong>: China Telecom L2</li>
             * <li><strong>ChinaUnicom_L2</strong>: China Unicom L2</li>
             * <li><strong>ChinaMobile_L2</strong>: China Mobile L2</li>
             * </ul>
             * <p>If you are a China (Hangzhou) Finance Cloud user, <strong>BGP_FinanceCloud</strong> is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>BGP</p>
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * <p>The name of the IP address pool instance.</p>
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
             * <p>121012345612*****</p>
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The instance ID of the IP address pool.</p>
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
             * <p>The security protection level.</p>
             * <ul>
             * <li><p>If this parameter is empty, the default value is Anti-DDoS Basic.</p>
             * </li>
             * <li><p>If the value is <strong>AntiDDoS_Enhanced</strong>, it indicates Anti-DDoS (Enhanced).</p>
             * </li>
             * </ul>
             */
            public Builder securityProtectionTypes(java.util.List<String> securityProtectionTypes) {
                this.securityProtectionTypes = securityProtectionTypes;
                return this;
            }

            /**
             * <p>The sharing type of the IP address pool.</p>
             * <ul>
             * <li><strong>Shared</strong>: The IP address pool is a shared IP address pool.</li>
             * <li>Empty: The IP address pool is not a shared IP address pool.</li>
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
             * <p>The instance status of the IPAM pool.</p>
             * <ul>
             * <li><strong>Created</strong>: active.</li>
             * <li><strong>Deleting</strong>: being deleted.</li>
             * <li><strong>Modifying</strong>: being modified.</li>
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
             * <p>The list of tags.</p>
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
             * <p>The type of the user. Valid values:</p>
             * <ul>
             * <li><strong>admin</strong>: administrator. An administrator can delete, modify, and query IP address pools, and allocate elastic IP addresses (EIPs) from IP address pools.</li>
             * <li><strong>user</strong>: regular user. A regular user can only allocate EIPs from IP address pools and query IP address pools, but cannot modify or delete IP address pools.</li>
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
             * <p>The zones of the IP address pool.
             * This parameter is returned only when the business type of the IP address pool is CloudBox.</p>
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
