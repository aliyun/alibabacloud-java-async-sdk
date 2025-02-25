// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A73F3BD0-B1A8-42A9-A9B6-689BBABC4891</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2254</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The top three VPCs with the largest number of DNS requests.</p>
         */
        public Builder vpcRequestTops(VpcRequestTops vpcRequestTops) {
            this.vpcRequestTops = vpcRequestTops;
            return this;
        }

        /**
         * <p>The top three zones with the largest number of DNS requests.</p>
         */
        public Builder zoneRequestTops(ZoneRequestTops zoneRequestTops) {
            this.zoneRequestTops = zoneRequestTops;
            return this;
        }

        public DescribeStatisticSummaryResponseBody build() {
            return new DescribeStatisticSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeStatisticSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStatisticSummaryResponseBody</p>
     */
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
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The name of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>华北 2</p>
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * <p>The number of DNS requests on the previous day.</p>
             * 
             * <strong>example:</strong>
             * <p>2254</p>
             */
            public Builder requestCount(Long requestCount) {
                this.requestCount = requestCount;
                return this;
            }

            /**
             * <p>The tunnel ID.</p>
             * 
             * <strong>example:</strong>
             * <p>tun-7h33lkqfuhgnyy****</p>
             */
            public Builder tunnelId(String tunnelId) {
                this.tunnelId = tunnelId;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-f8zvrvr1payllgz38****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
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

            public VpcRequestTop build() {
                return new VpcRequestTop(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeStatisticSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStatisticSummaryResponseBody</p>
     */
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
    /**
     * 
     * {@link DescribeStatisticSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStatisticSummaryResponseBody</p>
     */
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
             * <p>The business type. Valid values:</p>
             * <ul>
             * <li>AUTH_ZONE: authoritative zone</li>
             * <li>RESOLVER_RULE: forwarding rule</li>
             * <li>INBOUND: inbound endpoint</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AUTH_ZONE</p>
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * <p>The number of DNS requests on the previous day.</p>
             * 
             * <strong>example:</strong>
             * <p>2251</p>
             */
            public Builder requestCount(Long requestCount) {
                this.requestCount = requestCount;
                return this;
            }

            /**
             * <p>The zone name.</p>
             * 
             * <strong>example:</strong>
             * <p>test.com</p>
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
    /**
     * 
     * {@link DescribeStatisticSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStatisticSummaryResponseBody</p>
     */
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
