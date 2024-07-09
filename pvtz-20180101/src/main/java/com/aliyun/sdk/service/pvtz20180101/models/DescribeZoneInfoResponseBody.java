// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The virtual private clouds (VPCs) bound to the zone.
         */
        public Builder bindVpcs(BindVpcs bindVpcs) {
            this.bindVpcs = bindVpcs;
            return this;
        }

        /**
         * The time when the zone was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * The time when the zone was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * The creator of the zone.
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * The type of the operator.
         */
        public Builder creatorType(String creatorType) {
            this.creatorType = creatorType;
            return this;
        }

        /**
         * The logical location of the built-in authoritative module in which the zone is added. Valid values:
         * <p>
         * 
         * *   NORMAL_ZONE: regular module
         * *   FAST_ZONE: acceleration module
         */
        public Builder dnsGroup(String dnsGroup) {
            this.dnsGroup = dnsGroup;
            return this;
        }

        /**
         * Indicates whether the zone is being removed to another logical location. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder dnsGroupChanging(Boolean dnsGroupChanging) {
            this.dnsGroupChanging = dnsGroupChanging;
            return this;
        }

        /**
         * *   Indicates whether the zone is a reverse lookup zone. Valid values: true and false. The value true indicates that the zone is a reverse lookup zone.
         * <p>
         * *   The value false indicates that the zone is not a reverse lookup zone.
         */
        public Builder isPtr(Boolean isPtr) {
            this.isPtr = isPtr;
            return this;
        }

        /**
         * *   Indicates whether the recursive resolution proxy feature is enabled for the zone. Valid values: **ZONE**: The recursive resolution proxy feature is disabled for the zone.
         * <p>
         * *   **RECORD**: The recursive resolution proxy feature is enabled for the zone.
         */
        public Builder proxyPattern(String proxyPattern) {
            this.proxyPattern = proxyPattern;
            return this;
        }

        /**
         * The total number of DNS records.
         */
        public Builder recordCount(Integer recordCount) {
            this.recordCount = recordCount;
            return this;
        }

        /**
         * The description of the zone.
         */
        public Builder remark(String remark) {
            this.remark = remark;
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
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Indicates whether the secondary Domain Name System (DNS) feature is enabled for the zone. Valid values:
         * <p>
         * 
         * *   **true**: The secondary DNS feature is enabled.
         * *   **false**: The secondary DNS feature is disabled.
         */
        public Builder slaveDns(Boolean slaveDns) {
            this.slaveDns = slaveDns;
            return this;
        }

        /**
         * The time when the zone was last modified. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * The time when the zone was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder updateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }

        /**
         * The global ID of the zone.
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        /**
         * The zone name.
         */
        public Builder zoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }

        /**
         * *   If ZoneType is set to AUTH_ZONE, no value is returned for this parameter.
         * <p>
         * *   If ZoneType is set to CLOUD_PRODUCT_ZONE, the type of the cloud service is returned.
         */
        public Builder zoneTag(String zoneTag) {
            this.zoneTag = zoneTag;
            return this;
        }

        /**
         * The type of the zone. Valid values:
         * <p>
         * 
         * *   AUTH_ZONE: authoritative zone
         * *   CLOUD_PRODUCT_ZONE: authoritative zone for cloud services
         */
        public Builder zoneType(String zoneType) {
            this.zoneType = zoneType;
            return this;
        }

        public DescribeZoneInfoResponseBody build() {
            return new DescribeZoneInfoResponseBody(this);
        } 

    } 

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
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The name of the region.
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * The VPC ID.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The name of the VPC.
             */
            public Builder vpcName(String vpcName) {
                this.vpcName = vpcName;
                return this;
            }

            /**
             * The type of the VPC. Valid values:
             * <p>
             * 
             * *   STANDARD: standard VPC
             * *   EDS: Elastic Desktop Service (EDS) workspace VPC
             */
            public Builder vpcType(String vpcType) {
                this.vpcType = vpcType;
                return this;
            }

            /**
             * The ID of the user to which the VPC belongs. The value null indicates that the VPC belongs to the current user.
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
