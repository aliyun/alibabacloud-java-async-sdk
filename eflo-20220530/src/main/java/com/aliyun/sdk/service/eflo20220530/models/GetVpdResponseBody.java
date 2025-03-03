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
 * {@link GetVpdResponseBody} extends {@link TeaModel}
 *
 * <p>GetVpdResponseBody</p>
 */
public class GetVpdResponseBody extends TeaModel {
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

    private GetVpdResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.content = builder.content;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVpdResponseBody create() {
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
         * <p>The details about the access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
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
         * <p>The data returned.</p>
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The additional information that is returned.</p>
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
         * <p>A88DFED5-24B7-5A3E-87DE-380BF06F3C90</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetVpdResponseBody build() {
            return new GetVpdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVpdResponseBody} extends {@link TeaModel}
     *
     * <p>GetVpdResponseBody</p>
     */
    public static class ErInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Connections")
        private Long connections;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ErId")
        private String erId;

        @com.aliyun.core.annotation.NameInMap("ErName")
        private String erName;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("MasterZoneId")
        private String masterZoneId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RouteMaps")
        private Long routeMaps;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        private ErInfos(Builder builder) {
            this.connections = builder.connections;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.erId = builder.erId;
            this.erName = builder.erName;
            this.gmtModified = builder.gmtModified;
            this.masterZoneId = builder.masterZoneId;
            this.message = builder.message;
            this.regionId = builder.regionId;
            this.routeMaps = builder.routeMaps;
            this.status = builder.status;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErInfos create() {
            return builder().build();
        }

        /**
         * @return connections
         */
        public Long getConnections() {
            return this.connections;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return erId
         */
        public String getErId() {
            return this.erId;
        }

        /**
         * @return erName
         */
        public String getErName() {
            return this.erName;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return masterZoneId
         */
        public String getMasterZoneId() {
            return this.masterZoneId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return routeMaps
         */
        public Long getRouteMaps() {
            return this.routeMaps;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private Long connections; 
            private String createTime; 
            private String description; 
            private String erId; 
            private String erName; 
            private String gmtModified; 
            private String masterZoneId; 
            private String message; 
            private String regionId; 
            private Long routeMaps; 
            private String status; 
            private String tenantId; 

            /**
             * <p>The number of connections.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder connections(Long connections) {
                this.connections = connections;
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
             * <p>The description of the synchronization task.</p>
             * 
             * <strong>example:</strong>
             * <p>Restore verifying</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the Elastic Router (ER) instance.</p>
             * 
             * <strong>example:</strong>
             * <p>er-a7rqv1rq</p>
             */
            public Builder erId(String erId) {
                this.erId = erId;
                return this;
            }

            /**
             * <p>Elastic Router (ER) Instance Name</p>
             * 
             * <strong>example:</strong>
             * <p>er-1</p>
             */
            public Builder erName(String erName) {
                this.erName = erName;
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
             * <p>The primary zone.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-wulanchabu-b</p>
             */
            public Builder masterZoneId(String masterZoneId) {
                this.masterZoneId = masterZoneId;
                return this;
            }

            /**
             * <p>The returned message.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The ID of the region to which the Elastic Router (ER) belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-wulanchabu</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The number of routing policy.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder routeMaps(Long routeMaps) {
                this.routeMaps = routeMaps;
                return this;
            }

            /**
             * <p>The task status.</p>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>t464p4fql1bog</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public ErInfos build() {
                return new ErInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVpdResponseBody} extends {@link TeaModel}
     *
     * <p>GetVpdResponseBody</p>
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
             * <p>tag-subent-region</p>
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
             * <p>cn-wulanchabu</p>
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
     * {@link GetVpdResponseBody} extends {@link TeaModel}
     *
     * <p>GetVpdResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachErStatus")
        private Boolean attachErStatus;

        @com.aliyun.core.annotation.NameInMap("Cidr")
        private String cidr;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ErInfos")
        private java.util.List<ErInfos> erInfos;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("NcCount")
        private Integer ncCount;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceCount")
        private Integer networkInterfaceCount;

        @com.aliyun.core.annotation.NameInMap("PrivateIpCount")
        private Long privateIpCount;

        @com.aliyun.core.annotation.NameInMap("Quota")
        private Integer quota;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SecondaryCidrBlocks")
        private java.util.List<String> secondaryCidrBlocks;

        @com.aliyun.core.annotation.NameInMap("ServiceCidr")
        private String serviceCidr;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubnetCount")
        private Long subnetCount;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("VpdId")
        private String vpdId;

        @com.aliyun.core.annotation.NameInMap("VpdName")
        private String vpdName;

        private Content(Builder builder) {
            this.attachErStatus = builder.attachErStatus;
            this.cidr = builder.cidr;
            this.createTime = builder.createTime;
            this.erInfos = builder.erInfos;
            this.gmtModified = builder.gmtModified;
            this.message = builder.message;
            this.ncCount = builder.ncCount;
            this.networkInterfaceCount = builder.networkInterfaceCount;
            this.privateIpCount = builder.privateIpCount;
            this.quota = builder.quota;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.secondaryCidrBlocks = builder.secondaryCidrBlocks;
            this.serviceCidr = builder.serviceCidr;
            this.status = builder.status;
            this.subnetCount = builder.subnetCount;
            this.tags = builder.tags;
            this.tenantId = builder.tenantId;
            this.vpdId = builder.vpdId;
            this.vpdName = builder.vpdName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return attachErStatus
         */
        public Boolean getAttachErStatus() {
            return this.attachErStatus;
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
         * @return erInfos
         */
        public java.util.List<ErInfos> getErInfos() {
            return this.erInfos;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
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
         * @return quota
         */
        public Integer getQuota() {
            return this.quota;
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
         * @return secondaryCidrBlocks
         */
        public java.util.List<String> getSecondaryCidrBlocks() {
            return this.secondaryCidrBlocks;
        }

        /**
         * @return serviceCidr
         */
        public String getServiceCidr() {
            return this.serviceCidr;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subnetCount
         */
        public Long getSubnetCount() {
            return this.subnetCount;
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
            private Boolean attachErStatus; 
            private String cidr; 
            private String createTime; 
            private java.util.List<ErInfos> erInfos; 
            private String gmtModified; 
            private String message; 
            private Integer ncCount; 
            private Integer networkInterfaceCount; 
            private Long privateIpCount; 
            private Integer quota; 
            private String regionId; 
            private String resourceGroupId; 
            private java.util.List<String> secondaryCidrBlocks; 
            private String serviceCidr; 
            private String status; 
            private Long subnetCount; 
            private java.util.List<Tags> tags; 
            private String tenantId; 
            private String vpdId; 
            private String vpdName; 

            /**
             * <p>Whether the Lingjun HUB(ER) has been bound.</p>
             * <ul>
             * <li><strong>true</strong>: ER is bound.</li>
             * <li><strong>false</strong>: No ER is bound.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder attachErStatus(Boolean attachErStatus) {
                this.attachErStatus = attachErStatus;
                return this;
            }

            /**
             * <p>The CIDR block.</p>
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
             * <p>The information of the bound Lingjun HUB(ER).</p>
             */
            public Builder erInfos(java.util.List<ErInfos> erInfos) {
                this.erInfos = erInfos;
                return this;
            }

            /**
             * <p>The time when the O&amp;M task was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-10-25 15:57:16</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
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
             * <p>Number of Lingjun network interface controller.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder networkInterfaceCount(Integer networkInterfaceCount) {
                this.networkInterfaceCount = networkInterfaceCount;
                return this;
            }

            /**
             * <p>The total number of secondary private IP addresses.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder privateIpCount(Long privateIpCount) {
                this.privateIpCount = privateIpCount;
                return this;
            }

            /**
             * <p>The total quota information.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder quota(Integer quota) {
                this.quota = quota;
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
             * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/94475.htm?spm=a2c4g.11186623.0.0.29e15d7akXhpuu">Resource groups</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek2l4sq6l7unhi</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The list of additional CIDR blocks.</p>
             */
            public Builder secondaryCidrBlocks(java.util.List<String> secondaryCidrBlocks) {
                this.secondaryCidrBlocks = secondaryCidrBlocks;
                return this;
            }

            /**
             * <p>Internal Service CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>169.254.252.0/23</p>
             */
            public Builder serviceCidr(String serviceCidr) {
                this.serviceCidr = serviceCidr;
                return this;
            }

            /**
             * <p>The current state of the instance.</p>
             * <p>Valid value:</p>
             * <ul>
             * <li>Not Available: Not Available.</li>
             * <li>Available: Normal: Available: Normal.</li>
             * <li>Deleting: Deleting: Deleting: Deleting.</li>
             * <li>Executing: executing: Executing: executing.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The number of subnets.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder subnetCount(Long subnetCount) {
                this.subnetCount = subnetCount;
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
             * <p>1620939556166279</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The ID of the VPD instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vpd-fuliephf</p>
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

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
