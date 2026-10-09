// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeNatFirewallTrafficTrendResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNatFirewallTrafficTrendResponseBody</p>
 */
public class DescribeNatFirewallTrafficTrendResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List<DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("MaxInBps")
    private Long maxInBps;

    @com.aliyun.core.annotation.NameInMap("MaxOutBps")
    private Long maxOutBps;

    @com.aliyun.core.annotation.NameInMap("MaxTotalBps")
    private Long maxTotalBps;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeNatFirewallTrafficTrendResponseBody(Builder builder) {
        this.dataList = builder.dataList;
        this.maxInBps = builder.maxInBps;
        this.maxOutBps = builder.maxOutBps;
        this.maxTotalBps = builder.maxTotalBps;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNatFirewallTrafficTrendResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataList
     */
    public java.util.List<DataList> getDataList() {
        return this.dataList;
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
     * @return maxTotalBps
     */
    public Long getMaxTotalBps() {
        return this.maxTotalBps;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DataList> dataList; 
        private Long maxInBps; 
        private Long maxOutBps; 
        private Long maxTotalBps; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeNatFirewallTrafficTrendResponseBody model) {
            this.dataList = model.dataList;
            this.maxInBps = model.maxInBps;
            this.maxOutBps = model.maxOutBps;
            this.maxTotalBps = model.maxTotalBps;
            this.requestId = model.requestId;
        } 

        /**
         * <p>A list of traffic statistics.</p>
         */
        public Builder dataList(java.util.List<DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * <p>The peak inbound network throughput. Unit: bps.</p>
         * 
         * <strong>example:</strong>
         * <p>18038632</p>
         */
        public Builder maxInBps(Long maxInBps) {
            this.maxInBps = maxInBps;
            return this;
        }

        /**
         * <p>The peak outbound network throughput. Unit: bps.</p>
         * 
         * <strong>example:</strong>
         * <p>122596487</p>
         */
        public Builder maxOutBps(Long maxOutBps) {
            this.maxOutBps = maxOutBps;
            return this;
        }

        /**
         * <p>The peak total network throughput for inbound and outbound traffic. Unit: bps.</p>
         * 
         * <strong>example:</strong>
         * <p>66953194</p>
         */
        public Builder maxTotalBps(Long maxTotalBps) {
            this.maxTotalBps = maxTotalBps;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>87F23A3A-6F57-59C3-8237-A090D0613D71</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNatFirewallTrafficTrendResponseBody build() {
            return new DescribeNatFirewallTrafficTrendResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNatFirewallTrafficTrendResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNatFirewallTrafficTrendResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxInBps")
        private Long maxInBps;

        @com.aliyun.core.annotation.NameInMap("MaxOutBps")
        private Long maxOutBps;

        @com.aliyun.core.annotation.NameInMap("MaxTotalBps")
        private Long maxTotalBps;

        @com.aliyun.core.annotation.NameInMap("TrafficTime")
        private Long trafficTime;

        private DataList(Builder builder) {
            this.maxInBps = builder.maxInBps;
            this.maxOutBps = builder.maxOutBps;
            this.maxTotalBps = builder.maxTotalBps;
            this.trafficTime = builder.trafficTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
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
         * @return maxTotalBps
         */
        public Long getMaxTotalBps() {
            return this.maxTotalBps;
        }

        /**
         * @return trafficTime
         */
        public Long getTrafficTime() {
            return this.trafficTime;
        }

        public static final class Builder {
            private Long maxInBps; 
            private Long maxOutBps; 
            private Long maxTotalBps; 
            private Long trafficTime; 

            private Builder() {
            } 

            private Builder(DataList model) {
                this.maxInBps = model.maxInBps;
                this.maxOutBps = model.maxOutBps;
                this.maxTotalBps = model.maxTotalBps;
                this.trafficTime = model.trafficTime;
            } 

            /**
             * <p>The peak inbound network throughput. Unit: bps.</p>
             * 
             * <strong>example:</strong>
             * <p>18038632</p>
             */
            public Builder maxInBps(Long maxInBps) {
                this.maxInBps = maxInBps;
                return this;
            }

            /**
             * <p>The peak outbound network throughput. Unit: bps.</p>
             * 
             * <strong>example:</strong>
             * <p>122596487</p>
             */
            public Builder maxOutBps(Long maxOutBps) {
                this.maxOutBps = maxOutBps;
                return this;
            }

            /**
             * <p>The peak total network throughput for inbound and outbound traffic. Unit: bps.</p>
             * 
             * <strong>example:</strong>
             * <p>66953194</p>
             */
            public Builder maxTotalBps(Long maxTotalBps) {
                this.maxTotalBps = maxTotalBps;
                return this;
            }

            /**
             * <p>The time of the query. This value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1734418980</p>
             */
            public Builder trafficTime(Long trafficTime) {
                this.trafficTime = trafficTime;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
}
