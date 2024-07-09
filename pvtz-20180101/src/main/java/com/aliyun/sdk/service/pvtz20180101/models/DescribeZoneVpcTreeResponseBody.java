// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeZoneVpcTreeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeZoneVpcTreeResponseBody</p>
 */
public class DescribeZoneVpcTreeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Zones")
    private Zones zones;

    private DescribeZoneVpcTreeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.zones = builder.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeZoneVpcTreeResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return zones
     */
    public Zones getZones() {
        return this.zones;
    }

    public static final class Builder {
        private String requestId; 
        private Zones zones; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The zones.
         */
        public Builder zones(Zones zones) {
            this.zones = zones;
            return this;
        }

        public DescribeZoneVpcTreeResponseBody build() {
            return new DescribeZoneVpcTreeResponseBody(this);
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

        private Vpc(Builder builder) {
            this.regionId = builder.regionId;
            this.regionName = builder.regionName;
            this.vpcId = builder.vpcId;
            this.vpcName = builder.vpcName;
            this.vpcType = builder.vpcType;
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

        public static final class Builder {
            private String regionId; 
            private String regionName; 
            private String vpcId; 
            private String vpcName; 
            private String vpcType; 

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

            public Vpc build() {
                return new Vpc(this);
            } 

        } 

    }
    public static class Vpcs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Vpc")
        private java.util.List < Vpc> vpc;

        private Vpcs(Builder builder) {
            this.vpc = builder.vpc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vpcs create() {
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

            public Vpcs build() {
                return new Vpcs(this);
            } 

        } 

    }
    public static class Zone extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("RecordCount")
        private Integer recordCount;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UpdateTimestamp")
        private Long updateTimestamp;

        @com.aliyun.core.annotation.NameInMap("Vpcs")
        private Vpcs vpcs;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        @com.aliyun.core.annotation.NameInMap("ZoneName")
        private String zoneName;

        @com.aliyun.core.annotation.NameInMap("ZoneTag")
        private String zoneTag;

        @com.aliyun.core.annotation.NameInMap("ZoneType")
        private String zoneType;

        private Zone(Builder builder) {
            this.createTime = builder.createTime;
            this.createTimestamp = builder.createTimestamp;
            this.creator = builder.creator;
            this.creatorType = builder.creatorType;
            this.dnsGroup = builder.dnsGroup;
            this.dnsGroupChanging = builder.dnsGroupChanging;
            this.isPtr = builder.isPtr;
            this.recordCount = builder.recordCount;
            this.remark = builder.remark;
            this.updateTime = builder.updateTime;
            this.updateTimestamp = builder.updateTimestamp;
            this.vpcs = builder.vpcs;
            this.zoneId = builder.zoneId;
            this.zoneName = builder.zoneName;
            this.zoneTag = builder.zoneTag;
            this.zoneType = builder.zoneType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Zone create() {
            return builder().build();
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
         * @return vpcs
         */
        public Vpcs getVpcs() {
            return this.vpcs;
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
            private String createTime; 
            private Long createTimestamp; 
            private String creator; 
            private String creatorType; 
            private String dnsGroup; 
            private Boolean dnsGroupChanging; 
            private Boolean isPtr; 
            private Integer recordCount; 
            private String remark; 
            private String updateTime; 
            private Long updateTimestamp; 
            private Vpcs vpcs; 
            private String zoneId; 
            private String zoneName; 
            private String zoneTag; 
            private String zoneType; 

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
             * The operator type.
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
             * Indicates whether the zone is a reverse lookup zone. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder isPtr(Boolean isPtr) {
                this.isPtr = isPtr;
                return this;
            }

            /**
             * The number of Domain Name System (DNS) records.
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
             * The VPCs bound to the zones.
             */
            public Builder vpcs(Vpcs vpcs) {
                this.vpcs = vpcs;
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
             * The name of the zone.
             */
            public Builder zoneName(String zoneName) {
                this.zoneName = zoneName;
                return this;
            }

            /**
             * The type of the cloud service.
             * <p>
             * 
             * *   If the value of the ZoneType parameter is AUTH_ZONE, no value is returned for this parameter.
             * *   If the value of the ZoneType parameter is CLOUD_PRODUCT_ZONE, the type of the cloud service is returned.
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

            public Zone build() {
                return new Zone(this);
            } 

        } 

    }
    public static class Zones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Zone")
        private java.util.List < Zone> zone;

        private Zones(Builder builder) {
            this.zone = builder.zone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Zones create() {
            return builder().build();
        }

        /**
         * @return zone
         */
        public java.util.List < Zone> getZone() {
            return this.zone;
        }

        public static final class Builder {
            private java.util.List < Zone> zone; 

            /**
             * Zone.
             */
            public Builder zone(java.util.List < Zone> zone) {
                this.zone = zone;
                return this;
            }

            public Zones build() {
                return new Zones(this);
            } 

        } 

    }
}
