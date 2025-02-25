// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeZoneInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeZoneInfoResponseBody</p>
 */
public class DescribeZoneInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BindVpcs")
    private BindVpcs bindVpcs;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
    private Long createTimestamp;

    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("CreatorType")
    private String creatorType;

    @com.aliyun.core.annotation.NameInMap("DnsGroup")
    private String dnsGroup;

    @com.aliyun.core.annotation.NameInMap("DnsGroupChanging")
    private Boolean dnsGroupChanging;

    @com.aliyun.core.annotation.NameInMap("IsPtr")
    private Boolean isPtr;

    @com.aliyun.core.annotation.NameInMap("ProxyPattern")
    private String proxyPattern;

    @com.aliyun.core.annotation.NameInMap("RecordCount")
    private Integer recordCount;

    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("SlaveDns")
    private Boolean slaveDns;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("UpdateTimestamp")
    private Long updateTimestamp;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    @com.aliyun.core.annotation.NameInMap("ZoneName")
    private String zoneName;

    @com.aliyun.core.annotation.NameInMap("ZoneTag")
    private String zoneTag;

    @com.aliyun.core.annotation.NameInMap("ZoneType")
    private String zoneType;

    private DescribeZoneInfoResponseBody(Builder builder) {
        this.bindVpcs = builder.bindVpcs;
        this.createTime = builder.createTime;
        this.createTimestamp = builder.createTimestamp;
        this.creator = builder.creator;
        this.creatorType = builder.creatorType;
        this.dnsGroup = builder.dnsGroup;
        this.dnsGroupChanging = builder.dnsGroupChanging;
        this.isPtr = builder.isPtr;
        this.proxyPattern = builder.proxyPattern;
        this.recordCount = builder.recordCount;
        this.remark = builder.remark;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.slaveDns = builder.slaveDns;
        this.updateTime = builder.updateTime;
        this.updateTimestamp = builder.updateTimestamp;
        this.zoneId = builder.zoneId;
        this.zoneName = builder.zoneName;
        this.zoneTag = builder.zoneTag;
        this.zoneType = builder.zoneType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeZoneInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return bindVpcs
     */
    public BindVpcs getBindVpcs() {
        return this.bindVpcs;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return createTimestamp
     */
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return creatorType
     */
    public String getCreatorType() {
        return this.creatorType;
    }

    /**
     * @return dnsGroup
     */
    public String getDnsGroup() {
        return this.dnsGroup;
    }

    /**
     * @return dnsGroupChanging
     */
    public Boolean getDnsGroupChanging() {
        return this.dnsGroupChanging;
    }

    /**
     * @return isPtr
     */
    public Boolean getIsPtr() {
        return this.isPtr;
    }

    /**
     * @return proxyPattern
     */
    public String getProxyPattern() {
        return this.proxyPattern;
    }

    /**
     * @return recordCount
     */
    public Integer getRecordCount() {
        return this.recordCount;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return slaveDns
     */
    public Boolean getSlaveDns() {
        return this.slaveDns;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return updateTimestamp
     */
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return zoneName
     */
    public String getZoneName() {
        return this.zoneName;
    }

    /**
     * @return zoneTag
     */
    public String getZoneTag() {
        return this.zoneTag;
    }

    /**
     * @return zoneType
     */
    public String getZoneType() {
        return this.zoneType;
    }

    public static final class Builder {
        private BindVpcs bindVpcs; 
        private String createTime; 
        private Long createTimestamp; 
        private String creator; 
        private String creatorType; 
        private String dnsGroup; 
        private Boolean dnsGroupChanging; 
        private Boolean isPtr; 
        private String proxyPattern; 
        private Integer recordCount; 
        private String remark; 
        private String requestId; 
        private String resourceGroupId; 
        private Boolean slaveDns; 
        private String updateTime; 
        private Long updateTimestamp; 
        private String zoneId; 
        private String zoneName; 
        private String zoneTag; 
        private String zoneType; 

        /**
         * <p>The VPCs associated with the zone.</p>
         */
        public Builder bindVpcs(BindVpcs bindVpcs) {
            this.bindVpcs = bindVpcs;
            return this;
        }

        /**
         * <p>The time when the zone was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-01-23T03:15Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The time when the zone was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1516775741000</p>
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * <p>The creator of the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>141339776561****</p>
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * <p>The type of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        public Builder creatorType(String creatorType) {
            this.creatorType = creatorType;
            return this;
        }

        /**
         * <p>The logical location type of the built-in authoritative module in which the zone is added. Valid values:</p>
         * <ul>
         * <li><strong>NORMAL_ZONE</strong>: regular module</li>
         * <li><strong>FAST_ZONE</strong>: acceleration module</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FAST_ZONE</p>
         */
        public Builder dnsGroup(String dnsGroup) {
            this.dnsGroup = dnsGroup;
            return this;
        }

        /**
         * <p>Indicates whether the zone is being removed to another logical location. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dnsGroupChanging(Boolean dnsGroupChanging) {
            this.dnsGroupChanging = dnsGroupChanging;
            return this;
        }

        /**
         * <p>Indicates whether the zone is a reverse lookup zone. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isPtr(Boolean isPtr) {
            this.isPtr = isPtr;
            return this;
        }

        /**
         * <p>Indicates whether the recursive resolution proxy for subdomain names is enabled. Valid values:</p>
         * <ul>
         * <li>ZONE: The recursive resolution proxy for subdomain names is disabled. In this case, NXDOMAIN is returned if the queried domain name does not exist in the zone.</li>
         * <li>RECORD: The recursive resolution proxy for subdomain names is enabled. In this case, if the queried domain name does not exist in the zone, DNS requests are recursively forwarded to the forward module and then to the recursion module until DNS results are returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ZONE</p>
         */
        public Builder proxyPattern(String proxyPattern) {
            this.proxyPattern = proxyPattern;
            return this;
        }

        /**
         * <p>The total number of DNS records added in the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder recordCount(Integer recordCount) {
            this.recordCount = recordCount;
            return this;
        }

        /**
         * <p>The description of the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F73F41A3-B6DD-42CA-A793-FFF93277835D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the zone belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmykd63gt****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Indicates whether the secondary Domain Name System (DNS) feature is enabled for the zone. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The secondary DNS feature is enabled.</li>
         * <li><strong>false</strong>: The secondary DNS feature is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder slaveDns(Boolean slaveDns) {
            this.slaveDns = slaveDns;
            return this;
        }

        /**
         * <p>The time when the zone was last updated. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-01-24T06:35Z</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * <p>The time when the zone was last updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1516775741000</p>
         */
        public Builder updateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }

        /**
         * <p>The zone ID. This ID uniquely identifies the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>df2d03865266bd9842306db586d3****</p>
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        /**
         * <p>The zone name.</p>
         * 
         * <strong>example:</strong>
         * <p>zone-test.cn</p>
         */
        public Builder zoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }

        /**
         * <p>The tag added to the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>pvtz</p>
         */
        public Builder zoneTag(String zoneTag) {
            this.zoneTag = zoneTag;
            return this;
        }

        /**
         * <p>The zone type. Valid values:</p>
         * <ul>
         * <li><strong>AUTH_ZONE</strong>: authoritative zone</li>
         * <li><strong>CLOUD_PRODUCT_ZONE</strong>: authoritative zone for cloud services</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CLOUD_PRODUCT_ZONE</p>
         */
        public Builder zoneType(String zoneType) {
            this.zoneType = zoneType;
            return this;
        }

        public DescribeZoneInfoResponseBody build() {
            return new DescribeZoneInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeZoneInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeZoneInfoResponseBody</p>
     */
    public static class Vpc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RegionName")
        private String regionName;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcName")
        private String vpcName;

        @com.aliyun.core.annotation.NameInMap("VpcType")
        private String vpcType;

        @com.aliyun.core.annotation.NameInMap("VpcUserId")
        private Long vpcUserId;

        private Vpc(Builder builder) {
            this.regionId = builder.regionId;
            this.regionName = builder.regionName;
            this.vpcId = builder.vpcId;
            this.vpcName = builder.vpcName;
            this.vpcType = builder.vpcType;
            this.vpcUserId = builder.vpcUserId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vpc create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return regionName
         */
        public String getRegionName() {
            return this.regionName;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcName
         */
        public String getVpcName() {
            return this.vpcName;
        }

        /**
         * @return vpcType
         */
        public String getVpcType() {
            return this.vpcType;
        }

        /**
         * @return vpcUserId
         */
        public Long getVpcUserId() {
            return this.vpcUserId;
        }

        public static final class Builder {
            private String regionId; 
            private String regionName; 
            private String vpcId; 
            private String vpcName; 
            private String vpcType; 
            private Long vpcUserId; 

            /**
             * <p>The region ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-heyuan</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The name of the region where the VPC resides.</p>
             * 
             * <strong>example:</strong>
             * <p>China (Heyuan)</p>
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * <p>The VPC ID. This ID uniquely identifies the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-f8zvrvr1payllgz38****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The VPC name.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc_test</p>
             */
            public Builder vpcName(String vpcName) {
                this.vpcName = vpcName;
                return this;
            }

            /**
             * <p>The VPC type. Valid values:</p>
             * <ul>
             * <li>STANDARD: standard VPC</li>
             * <li>EDS: Elastic Desktop Service (EDS) workspace VPC</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>STANDARD</p>
             */
            public Builder vpcType(String vpcType) {
                this.vpcType = vpcType;
                return this;
            }

            /**
             * <p>The user ID to which the VPC belongs. If null is returned, the VPC belongs to the current user.</p>
             * 
             * <strong>example:</strong>
             * <p>141339776561****</p>
             */
            public Builder vpcUserId(Long vpcUserId) {
                this.vpcUserId = vpcUserId;
                return this;
            }

            public Vpc build() {
                return new Vpc(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeZoneInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeZoneInfoResponseBody</p>
     */
    public static class BindVpcs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Vpc")
        private java.util.List < Vpc> vpc;

        private BindVpcs(Builder builder) {
            this.vpc = builder.vpc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BindVpcs create() {
            return builder().build();
        }

        /**
         * @return vpc
         */
        public java.util.List < Vpc> getVpc() {
            return this.vpc;
        }

        public static final class Builder {
            private java.util.List < Vpc> vpc; 

            /**
             * Vpc.
             */
            public Builder vpc(java.util.List < Vpc> vpc) {
                this.vpc = vpc;
                return this;
            }

            public BindVpcs build() {
                return new BindVpcs(this);
            } 

        } 

    }
}
