// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

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
 * {@link GetSubnetResponseBody} extends {@link TeaModel}
 *
 * <p>GetSubnetResponseBody</p>
 */
public class GetSubnetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetSubnetResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.content = builder.content;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSubnetResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private Integer code; 
        private Content content; 
        private String message; 
        private String requestId; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0901F411-28FA-5B9C-BAEE-7776463FF0DC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSubnetResponseBody build() {
            return new GetSubnetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSubnetResponseBody} extends {@link TeaModel}
     *
     * <p>GetSubnetResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * <p>The tag key.</p>
             * <p>You cannot specify an empty string as a tag key. It can be up to 64 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
             * <p>You can specify at most 20 tag keys in each call.</p>
             * 
             * <strong>example:</strong>
             * <p>tag-subnet</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The value of the tag that is added to the resource.</p>
             * <p>The tag value can be empty or a string of up to 128 characters. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
             * <p>Each key-value pair must be unique. You can specify values for at most 20 tag keys in each call.</p>
             * 
             * <strong>example:</strong>
             * <p>subnet-group-1</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSubnetResponseBody} extends {@link TeaModel}
     *
     * <p>GetSubnetResponseBody</p>
     */
    public static class VpdBaseInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cidr")
        private String cidr;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("VpdId")
        private String vpdId;

        @com.aliyun.core.annotation.NameInMap("VpdName")
        private String vpdName;

        private VpdBaseInfo(Builder builder) {
            this.cidr = builder.cidr;
            this.createTime = builder.createTime;
            this.vpdId = builder.vpdId;
            this.vpdName = builder.vpdName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpdBaseInfo create() {
            return builder().build();
        }

        /**
         * @return cidr
         */
        public String getCidr() {
            return this.cidr;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return vpdId
         */
        public String getVpdId() {
            return this.vpdId;
        }

        /**
         * @return vpdName
         */
        public String getVpdName() {
            return this.vpdName;
        }

        public static final class Builder {
            private String cidr; 
            private String createTime; 
            private String vpdId; 
            private String vpdName; 

            /**
             * <p>The CIDR block of the VPD.</p>
             * <ul>
             * <li>We recommend that you use an RFC private endpoint as the Lingjun CIDR block, such as 10.0.0.0/8,172.16.0.0/12,192.168.0.0/16. In scenarios where the Doringjun CIDR block is connected to each other or where the Lingjun CIDR block is connected to a VPC, make sure that the addresses do not conflict with each other.</li>
             * <li>You can also use a custom CIDR block other than 100.64.0.0/10, 224.0.0.0/4, 127.0.0.0/8, or 169.254.0.0/16 and their subnets as the primary IPv4 CIDR block of the VPD.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.0/8</p>
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * <p>The time when the activation code was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1678273219000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the Lingjun CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>vpd-iv2zm1qf</p>
             */
            public Builder vpdId(String vpdId) {
                this.vpdId = vpdId;
                return this;
            }

            /**
             * <p>The name of the Lingjun CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>vpd-1</p>
             */
            public Builder vpdName(String vpdName) {
                this.vpdName = vpdName;
                return this;
            }

            public VpdBaseInfo build() {
                return new VpdBaseInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSubnetResponseBody} extends {@link TeaModel}
     *
     * <p>GetSubnetResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableIps")
        private Integer availableIps;

        @com.aliyun.core.annotation.NameInMap("Cidr")
        private String cidr;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("LbCount")
        private Long lbCount;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("NcCount")
        private Integer ncCount;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceCount")
        private Integer networkInterfaceCount;

        @com.aliyun.core.annotation.NameInMap("PrivateIpCount")
        private Long privateIpCount;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubnetId")
        private String subnetId;

        @com.aliyun.core.annotation.NameInMap("SubnetName")
        private String subnetName;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("VpdBaseInfo")
        private VpdBaseInfo vpdBaseInfo;

        @com.aliyun.core.annotation.NameInMap("VpdId")
        private String vpdId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Content(Builder builder) {
            this.availableIps = builder.availableIps;
            this.cidr = builder.cidr;
            this.createTime = builder.createTime;
            this.gmtModified = builder.gmtModified;
            this.lbCount = builder.lbCount;
            this.message = builder.message;
            this.ncCount = builder.ncCount;
            this.networkInterfaceCount = builder.networkInterfaceCount;
            this.privateIpCount = builder.privateIpCount;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.status = builder.status;
            this.subnetId = builder.subnetId;
            this.subnetName = builder.subnetName;
            this.tags = builder.tags;
            this.tenantId = builder.tenantId;
            this.type = builder.type;
            this.vpdBaseInfo = builder.vpdBaseInfo;
            this.vpdId = builder.vpdId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return availableIps
         */
        public Integer getAvailableIps() {
            return this.availableIps;
        }

        /**
         * @return cidr
         */
        public String getCidr() {
            return this.cidr;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return lbCount
         */
        public Long getLbCount() {
            return this.lbCount;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return ncCount
         */
        public Integer getNcCount() {
            return this.ncCount;
        }

        /**
         * @return networkInterfaceCount
         */
        public Integer getNetworkInterfaceCount() {
            return this.networkInterfaceCount;
        }

        /**
         * @return privateIpCount
         */
        public Long getPrivateIpCount() {
            return this.privateIpCount;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subnetId
         */
        public String getSubnetId() {
            return this.subnetId;
        }

        /**
         * @return subnetName
         */
        public String getSubnetName() {
            return this.subnetName;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return vpdBaseInfo
         */
        public VpdBaseInfo getVpdBaseInfo() {
            return this.vpdBaseInfo;
        }

        /**
         * @return vpdId
         */
        public String getVpdId() {
            return this.vpdId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Integer availableIps; 
            private String cidr; 
            private String createTime; 
            private String gmtModified; 
            private Long lbCount; 
            private String message; 
            private Integer ncCount; 
            private Integer networkInterfaceCount; 
            private Long privateIpCount; 
            private String regionId; 
            private String resourceGroupId; 
            private String status; 
            private String subnetId; 
            private String subnetName; 
            private java.util.List<Tags> tags; 
            private String tenantId; 
            private String type; 
            private VpdBaseInfo vpdBaseInfo; 
            private String vpdId; 
            private String zoneId; 

            /**
             * <p>The number of available IP addresses.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder availableIps(Integer availableIps) {
                this.availableIps = availableIps;
                return this;
            }

            /**
             * <p>The CIDR block of the Subnet.</p>
             * <ul>
             * <li>The network segment of the subnet must be a proper subset of the network segment of Lingjun to which it belongs, and the mask must be between 16 bits and 29 bits, which can provide 8 to 65536 addresses. For example, the CIDR block of the Lingjun CIDR block is 192.168.0.0/16, and the CIDR blocks of the subnets under the Lingjun CIDR block are 192.168.0.0/17 to 192.168.0.0/29.</li>
             * <li>The first and last three IP addresses of each subnet segment are reserved by the system. For example, the CIDR blocks of the subnet are 192.168.1.0/24,192.168.1.0, 192.168.1.253, 192.168.1.254, and 192.168.1.255.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>10.10.10.0/24</p>
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * <p>The time when the activation code was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1648085472000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the O&amp;M task was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1678273219000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The number of SLB.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder lbCount(Long lbCount) {
                this.lbCount = lbCount;
                return this;
            }

            /**
             * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
             * 
             * <strong>example:</strong>
             * <p>test example</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The number of NCs.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder ncCount(Integer ncCount) {
                this.ncCount = ncCount;
                return this;
            }

            /**
             * <p>Number of Lingjun network interface controller</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder networkInterfaceCount(Integer networkInterfaceCount) {
                this.networkInterfaceCount = networkInterfaceCount;
                return this;
            }

            /**
             * <p>The total number of secondary private IP addresses.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder privateIpCount(Long privateIpCount) {
                this.privateIpCount = privateIpCount;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-wulanchabu</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of your Alibaba Cloud resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek2l4sq6l7unhi</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The status of the cache reserve instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the Lingjun subnet instance.</p>
             * 
             * <strong>example:</strong>
             * <p>subnet-aj93mko8</p>
             */
            public Builder subnetId(String subnetId) {
                this.subnetId = subnetId;
                return this;
            }

            /**
             * <p>The name of the Lingjun subnet instance.</p>
             * 
             * <strong>example:</strong>
             * <p>subnet-1</p>
             */
            public Builder subnetName(String subnetName) {
                this.subnetName = subnetName;
                return this;
            }

            /**
             * <p>The tag information.</p>
             * <p>You can specify up to 20 tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1655449505171</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>Lingjun Subnet Usage Type; optional; optional. Valid values:</p>
             * <ul>
             * <li><strong>Empty for common data types</strong></li>
             * <li><strong>OOB</strong> :OOB type</li>
             * <li><strong>LB</strong>: LB type</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OOB</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The information about the network segment of Lingjun.</p>
             */
            public Builder vpdBaseInfo(VpdBaseInfo vpdBaseInfo) {
                this.vpdBaseInfo = vpdBaseInfo;
                return this;
            }

            /**
             * <p>The ID of the Lingjun CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>vpd-ze3na0wf</p>
             */
            public Builder vpdId(String vpdId) {
                this.vpdId = vpdId;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-wulanchabu-b</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
