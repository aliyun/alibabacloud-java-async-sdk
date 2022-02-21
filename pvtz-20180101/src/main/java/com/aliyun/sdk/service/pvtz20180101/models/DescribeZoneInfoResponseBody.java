// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeZoneInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeZoneInfoResponseBody</p>
 */
public class DescribeZoneInfoResponseBody extends TeaModel {
    @NameInMap("BindVpcs")
    private BindVpcs bindVpcs;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("CreateTimestamp")
    private Long createTimestamp;

    @NameInMap("IsPtr")
    private Boolean isPtr;

    @NameInMap("ProxyPattern")
    private String proxyPattern;

    @NameInMap("RecordCount")
    private Integer recordCount;

    @NameInMap("Remark")
    private String remark;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("SlaveDns")
    private Boolean slaveDns;

    @NameInMap("UpdateTime")
    private String updateTime;

    @NameInMap("UpdateTimestamp")
    private Long updateTimestamp;

    @NameInMap("ZoneId")
    private String zoneId;

    @NameInMap("ZoneName")
    private String zoneName;

    @NameInMap("ZoneTag")
    private String zoneTag;

    @NameInMap("ZoneType")
    private String zoneType;

    private DescribeZoneInfoResponseBody(Builder builder) {
        this.bindVpcs = builder.bindVpcs;
        this.createTime = builder.createTime;
        this.createTimestamp = builder.createTimestamp;
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
         * BindVpcs.
         */
        public Builder bindVpcs(BindVpcs bindVpcs) {
            this.bindVpcs = bindVpcs;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * CreateTimestamp.
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * IsPtr.
         */
        public Builder isPtr(Boolean isPtr) {
            this.isPtr = isPtr;
            return this;
        }

        /**
         * ProxyPattern.
         */
        public Builder proxyPattern(String proxyPattern) {
            this.proxyPattern = proxyPattern;
            return this;
        }

        /**
         * RecordCount.
         */
        public Builder recordCount(Integer recordCount) {
            this.recordCount = recordCount;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.remark = remark;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * SlaveDns.
         */
        public Builder slaveDns(Boolean slaveDns) {
            this.slaveDns = slaveDns;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * UpdateTimestamp.
         */
        public Builder updateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        /**
         * ZoneName.
         */
        public Builder zoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }

        /**
         * ZoneTag.
         */
        public Builder zoneTag(String zoneTag) {
            this.zoneTag = zoneTag;
            return this;
        }

        /**
         * ZoneType.
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
        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RegionName")
        private String regionName;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VpcName")
        private String vpcName;

        @NameInMap("VpcUserId")
        private Long vpcUserId;

        private Vpc(Builder builder) {
            this.regionId = builder.regionId;
            this.regionName = builder.regionName;
            this.vpcId = builder.vpcId;
            this.vpcName = builder.vpcName;
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
            private Long vpcUserId; 

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * RegionName.
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VpcName.
             */
            public Builder vpcName(String vpcName) {
                this.vpcName = vpcName;
                return this;
            }

            /**
             * VpcUserId.
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
        @NameInMap("Vpc")
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
