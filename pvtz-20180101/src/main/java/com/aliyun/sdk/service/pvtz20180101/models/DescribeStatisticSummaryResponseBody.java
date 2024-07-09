// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStatisticSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStatisticSummaryResponseBody</p>
 */
public class DescribeStatisticSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("VpcRequestTops")
    private VpcRequestTops vpcRequestTops;

    @com.aliyun.core.annotation.NameInMap("ZoneRequestTops")
    private ZoneRequestTops zoneRequestTops;

    private DescribeStatisticSummaryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vpcRequestTops = builder.vpcRequestTops;
        this.zoneRequestTops = builder.zoneRequestTops;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStatisticSummaryResponseBody create() {
        return builder().build();
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return vpcRequestTops
     */
    public VpcRequestTops getVpcRequestTops() {
        return this.vpcRequestTops;
    }

    /**
     * @return zoneRequestTops
     */
    public ZoneRequestTops getZoneRequestTops() {
        return this.zoneRequestTops;
    }

    public static final class Builder {
        private String requestId; 
        private Long totalCount; 
        private VpcRequestTops vpcRequestTops; 
        private ZoneRequestTops zoneRequestTops; 

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
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The top 3 virtual private clouds (VPCs) that initiate the largest number of DNS requests.
         */
        public Builder vpcRequestTops(VpcRequestTops vpcRequestTops) {
            this.vpcRequestTops = vpcRequestTops;
            return this;
        }

        /**
         * The top 3 zones with the largest number of DNS requests.
         */
        public Builder zoneRequestTops(ZoneRequestTops zoneRequestTops) {
            this.zoneRequestTops = zoneRequestTops;
            return this;
        }

        public DescribeStatisticSummaryResponseBody build() {
            return new DescribeStatisticSummaryResponseBody(this);
        } 

    } 

    public static class VpcRequestTop extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RegionName")
        private String regionName;

        @com.aliyun.core.annotation.NameInMap("RequestCount")
        private Long requestCount;

        @com.aliyun.core.annotation.NameInMap("TunnelId")
        private String tunnelId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcType")
        private String vpcType;

        private VpcRequestTop(Builder builder) {
            this.regionId = builder.regionId;
            this.regionName = builder.regionName;
            this.requestCount = builder.requestCount;
            this.tunnelId = builder.tunnelId;
            this.vpcId = builder.vpcId;
            this.vpcType = builder.vpcType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcRequestTop create() {
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
         * @return requestCount
         */
        public Long getRequestCount() {
            return this.requestCount;
        }

        /**
         * @return tunnelId
         */
        public String getTunnelId() {
            return this.tunnelId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
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
            private Long requestCount; 
            private String tunnelId; 
            private String vpcId; 
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
             * The number of DNS requests.
             */
            public Builder requestCount(Long requestCount) {
                this.requestCount = requestCount;
                return this;
            }

            /**
             * The tunnel ID.
             */
            public Builder tunnelId(String tunnelId) {
                this.tunnelId = tunnelId;
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

            public VpcRequestTop build() {
                return new VpcRequestTop(this);
            } 

        } 

    }
    public static class VpcRequestTops extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VpcRequestTop")
        private java.util.List < VpcRequestTop> vpcRequestTop;

        private VpcRequestTops(Builder builder) {
            this.vpcRequestTop = builder.vpcRequestTop;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcRequestTops create() {
            return builder().build();
        }

        /**
         * @return vpcRequestTop
         */
        public java.util.List < VpcRequestTop> getVpcRequestTop() {
            return this.vpcRequestTop;
        }

        public static final class Builder {
            private java.util.List < VpcRequestTop> vpcRequestTop; 

            /**
             * VpcRequestTop.
             */
            public Builder vpcRequestTop(java.util.List < VpcRequestTop> vpcRequestTop) {
                this.vpcRequestTop = vpcRequestTop;
                return this;
            }

            public VpcRequestTops build() {
                return new VpcRequestTops(this);
            } 

        } 

    }
    public static class ZoneRequestTop extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizType")
        private String bizType;

        @com.aliyun.core.annotation.NameInMap("RequestCount")
        private Long requestCount;

        @com.aliyun.core.annotation.NameInMap("ZoneName")
        private String zoneName;

        private ZoneRequestTop(Builder builder) {
            this.bizType = builder.bizType;
            this.requestCount = builder.requestCount;
            this.zoneName = builder.zoneName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneRequestTop create() {
            return builder().build();
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return requestCount
         */
        public Long getRequestCount() {
            return this.requestCount;
        }

        /**
         * @return zoneName
         */
        public String getZoneName() {
            return this.zoneName;
        }

        public static final class Builder {
            private String bizType; 
            private Long requestCount; 
            private String zoneName; 

            /**
             * The business type. Valid values:
             * <p>
             * 
             * *   AUTH_ZONE: authoritative zone
             * *   RESOLVER_RULE: forwarding rule
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * The number of DNS requests.
             */
            public Builder requestCount(Long requestCount) {
                this.requestCount = requestCount;
                return this;
            }

            /**
             * The name of the zone.
             */
            public Builder zoneName(String zoneName) {
                this.zoneName = zoneName;
                return this;
            }

            public ZoneRequestTop build() {
                return new ZoneRequestTop(this);
            } 

        } 

    }
    public static class ZoneRequestTops extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ZoneRequestTop")
        private java.util.List < ZoneRequestTop> zoneRequestTop;

        private ZoneRequestTops(Builder builder) {
            this.zoneRequestTop = builder.zoneRequestTop;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneRequestTops create() {
            return builder().build();
        }

        /**
         * @return zoneRequestTop
         */
        public java.util.List < ZoneRequestTop> getZoneRequestTop() {
            return this.zoneRequestTop;
        }

        public static final class Builder {
            private java.util.List < ZoneRequestTop> zoneRequestTop; 

            /**
             * ZoneRequestTop.
             */
            public Builder zoneRequestTop(java.util.List < ZoneRequestTop> zoneRequestTop) {
                this.zoneRequestTop = zoneRequestTop;
                return this;
            }

            public ZoneRequestTops build() {
                return new ZoneRequestTops(this);
            } 

        } 

    }
}
