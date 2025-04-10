// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

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
 * {@link DescribeIpTrafficResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIpTrafficResponseBody</p>
 */
public class DescribeIpTrafficResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvgInBps")
    private Long avgInBps;

    @com.aliyun.core.annotation.NameInMap("AvgOutBps")
    private Long avgOutBps;

    @com.aliyun.core.annotation.NameInMap("IpTrafficPoints")
    private java.util.List<IpTrafficPoints> ipTrafficPoints;

    @com.aliyun.core.annotation.NameInMap("MaxInBps")
    private Long maxInBps;

    @com.aliyun.core.annotation.NameInMap("MaxOutBps")
    private Long maxOutBps;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeIpTrafficResponseBody(Builder builder) {
        this.avgInBps = builder.avgInBps;
        this.avgOutBps = builder.avgOutBps;
        this.ipTrafficPoints = builder.ipTrafficPoints;
        this.maxInBps = builder.maxInBps;
        this.maxOutBps = builder.maxOutBps;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIpTrafficResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return avgInBps
     */
    public Long getAvgInBps() {
        return this.avgInBps;
    }

    /**
     * @return avgOutBps
     */
    public Long getAvgOutBps() {
        return this.avgOutBps;
    }

    /**
     * @return ipTrafficPoints
     */
    public java.util.List<IpTrafficPoints> getIpTrafficPoints() {
        return this.ipTrafficPoints;
    }

    /**
     * @return maxInBps
     */
    public Long getMaxInBps() {
        return this.maxInBps;
    }

    /**
     * @return maxOutBps
     */
    public Long getMaxOutBps() {
        return this.maxOutBps;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long avgInBps; 
        private Long avgOutBps; 
        private java.util.List<IpTrafficPoints> ipTrafficPoints; 
        private Long maxInBps; 
        private Long maxOutBps; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeIpTrafficResponseBody model) {
            this.avgInBps = model.avgInBps;
            this.avgOutBps = model.avgOutBps;
            this.ipTrafficPoints = model.ipTrafficPoints;
            this.maxInBps = model.maxInBps;
            this.maxOutBps = model.maxOutBps;
            this.requestId = model.requestId;
        } 

        /**
         * AvgInBps.
         */
        public Builder avgInBps(Long avgInBps) {
            this.avgInBps = avgInBps;
            return this;
        }

        /**
         * AvgOutBps.
         */
        public Builder avgOutBps(Long avgOutBps) {
            this.avgOutBps = avgOutBps;
            return this;
        }

        /**
         * IpTrafficPoints.
         */
        public Builder ipTrafficPoints(java.util.List<IpTrafficPoints> ipTrafficPoints) {
            this.ipTrafficPoints = ipTrafficPoints;
            return this;
        }

        /**
         * MaxInBps.
         */
        public Builder maxInBps(Long maxInBps) {
            this.maxInBps = maxInBps;
            return this;
        }

        /**
         * MaxOutBps.
         */
        public Builder maxOutBps(Long maxOutBps) {
            this.maxOutBps = maxOutBps;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeIpTrafficResponseBody build() {
            return new DescribeIpTrafficResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeIpTrafficResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIpTrafficResponseBody</p>
     */
    public static class IpTrafficPoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActConns")
        private Integer actConns;

        @com.aliyun.core.annotation.NameInMap("Cps")
        private Integer cps;

        @com.aliyun.core.annotation.NameInMap("InactConns")
        private Integer inactConns;

        @com.aliyun.core.annotation.NameInMap("MaxInbps")
        private Long maxInbps;

        @com.aliyun.core.annotation.NameInMap("MaxOutbps")
        private Long maxOutbps;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        private IpTrafficPoints(Builder builder) {
            this.actConns = builder.actConns;
            this.cps = builder.cps;
            this.inactConns = builder.inactConns;
            this.maxInbps = builder.maxInbps;
            this.maxOutbps = builder.maxOutbps;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpTrafficPoints create() {
            return builder().build();
        }

        /**
         * @return actConns
         */
        public Integer getActConns() {
            return this.actConns;
        }

        /**
         * @return cps
         */
        public Integer getCps() {
            return this.cps;
        }

        /**
         * @return inactConns
         */
        public Integer getInactConns() {
            return this.inactConns;
        }

        /**
         * @return maxInbps
         */
        public Long getMaxInbps() {
            return this.maxInbps;
        }

        /**
         * @return maxOutbps
         */
        public Long getMaxOutbps() {
            return this.maxOutbps;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        public static final class Builder {
            private Integer actConns; 
            private Integer cps; 
            private Integer inactConns; 
            private Long maxInbps; 
            private Long maxOutbps; 
            private Long time; 

            private Builder() {
            } 

            private Builder(IpTrafficPoints model) {
                this.actConns = model.actConns;
                this.cps = model.cps;
                this.inactConns = model.inactConns;
                this.maxInbps = model.maxInbps;
                this.maxOutbps = model.maxOutbps;
                this.time = model.time;
            } 

            /**
             * ActConns.
             */
            public Builder actConns(Integer actConns) {
                this.actConns = actConns;
                return this;
            }

            /**
             * Cps.
             */
            public Builder cps(Integer cps) {
                this.cps = cps;
                return this;
            }

            /**
             * InactConns.
             */
            public Builder inactConns(Integer inactConns) {
                this.inactConns = inactConns;
                return this;
            }

            /**
             * MaxInbps.
             */
            public Builder maxInbps(Long maxInbps) {
                this.maxInbps = maxInbps;
                return this;
            }

            /**
             * MaxOutbps.
             */
            public Builder maxOutbps(Long maxOutbps) {
                this.maxOutbps = maxOutbps;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            public IpTrafficPoints build() {
                return new IpTrafficPoints(this);
            } 

        } 

    }
}
