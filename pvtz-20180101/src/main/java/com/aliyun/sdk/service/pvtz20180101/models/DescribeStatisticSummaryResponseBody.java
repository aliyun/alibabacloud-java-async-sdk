// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStatisticSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStatisticSummaryResponseBody</p>
 */
public class DescribeStatisticSummaryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    @NameInMap("VpcRequestTops")
    private VpcRequestTops vpcRequestTops;

    @NameInMap("ZoneRequestTops")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * VpcRequestTops.
         */
        public Builder vpcRequestTops(VpcRequestTops vpcRequestTops) {
            this.vpcRequestTops = vpcRequestTops;
            return this;
        }

        /**
         * ZoneRequestTops.
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
        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RegionName")
        private String regionName;

        @NameInMap("RequestCount")
        private Long requestCount;

        @NameInMap("TunnelId")
        private String tunnelId;

        @NameInMap("VpcId")
        private String vpcId;

        private VpcRequestTop(Builder builder) {
            this.regionId = builder.regionId;
            this.regionName = builder.regionName;
            this.requestCount = builder.requestCount;
            this.tunnelId = builder.tunnelId;
            this.vpcId = builder.vpcId;
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

        public static final class Builder {
            private String regionId; 
            private String regionName; 
            private Long requestCount; 
            private String tunnelId; 
            private String vpcId; 

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
             * RequestCount.
             */
            public Builder requestCount(Long requestCount) {
                this.requestCount = requestCount;
                return this;
            }

            /**
             * TunnelId.
             */
            public Builder tunnelId(String tunnelId) {
                this.tunnelId = tunnelId;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public VpcRequestTop build() {
                return new VpcRequestTop(this);
            } 

        } 

    }
    public static class VpcRequestTops extends TeaModel {
        @NameInMap("VpcRequestTop")
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
        @NameInMap("BizType")
        private String bizType;

        @NameInMap("RequestCount")
        private Long requestCount;

        @NameInMap("ZoneName")
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
             * BizType.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * RequestCount.
             */
            public Builder requestCount(Long requestCount) {
                this.requestCount = requestCount;
                return this;
            }

            /**
             * ZoneName.
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
        @NameInMap("ZoneRequestTop")
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
