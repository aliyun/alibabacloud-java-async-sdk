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
 * {@link DescribeFirewallTrafficTrendResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFirewallTrafficTrendResponseBody</p>
 */
public class DescribeFirewallTrafficTrendResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List<DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("MaxBandwidthTime")
    private Long maxBandwidthTime;

    @com.aliyun.core.annotation.NameInMap("MaxBandwidthTimeBps")
    private MaxBandwidthTimeBps maxBandwidthTimeBps;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeFirewallTrafficTrendResponseBody(Builder builder) {
        this.dataList = builder.dataList;
        this.maxBandwidthTime = builder.maxBandwidthTime;
        this.maxBandwidthTimeBps = builder.maxBandwidthTimeBps;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFirewallTrafficTrendResponseBody create() {
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
     * @return maxBandwidthTime
     */
    public Long getMaxBandwidthTime() {
        return this.maxBandwidthTime;
    }

    /**
     * @return maxBandwidthTimeBps
     */
    public MaxBandwidthTimeBps getMaxBandwidthTimeBps() {
        return this.maxBandwidthTimeBps;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DataList> dataList; 
        private Long maxBandwidthTime; 
        private MaxBandwidthTimeBps maxBandwidthTimeBps; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeFirewallTrafficTrendResponseBody model) {
            this.dataList = model.dataList;
            this.maxBandwidthTime = model.maxBandwidthTime;
            this.maxBandwidthTimeBps = model.maxBandwidthTimeBps;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data list.</p>
         */
        public Builder dataList(java.util.List<DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * <p>The timestamp when the peak total traffic occurred. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1758470400</p>
         */
        public Builder maxBandwidthTime(Long maxBandwidthTime) {
            this.maxBandwidthTime = maxBandwidthTime;
            return this;
        }

        /**
         * <p>The traffic distribution at the time of peak total traffic.</p>
         */
        public Builder maxBandwidthTimeBps(MaxBandwidthTimeBps maxBandwidthTimeBps) {
            this.maxBandwidthTimeBps = maxBandwidthTimeBps;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4E7F94C7-781F-5192-86CF-DB085****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeFirewallTrafficTrendResponseBody build() {
            return new DescribeFirewallTrafficTrendResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFirewallTrafficTrendResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFirewallTrafficTrendResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InternetBps")
        private Long internetBps;

        @com.aliyun.core.annotation.NameInMap("NatBps")
        private Long natBps;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        @com.aliyun.core.annotation.NameInMap("TotalBps")
        private Long totalBps;

        @com.aliyun.core.annotation.NameInMap("VpcBps")
        private Long vpcBps;

        private DataList(Builder builder) {
            this.internetBps = builder.internetBps;
            this.natBps = builder.natBps;
            this.time = builder.time;
            this.totalBps = builder.totalBps;
            this.vpcBps = builder.vpcBps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return internetBps
         */
        public Long getInternetBps() {
            return this.internetBps;
        }

        /**
         * @return natBps
         */
        public Long getNatBps() {
            return this.natBps;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        /**
         * @return totalBps
         */
        public Long getTotalBps() {
            return this.totalBps;
        }

        /**
         * @return vpcBps
         */
        public Long getVpcBps() {
            return this.vpcBps;
        }

        public static final class Builder {
            private Long internetBps; 
            private Long natBps; 
            private Long time; 
            private Long totalBps; 
            private Long vpcBps; 

            private Builder() {
            } 

            private Builder(DataList model) {
                this.internetBps = model.internetBps;
                this.natBps = model.natBps;
                this.time = model.time;
                this.totalBps = model.totalBps;
                this.vpcBps = model.vpcBps;
            } 

            /**
             * <p>The Internet firewall traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder internetBps(Long internetBps) {
                this.internetBps = internetBps;
                return this;
            }

            /**
             * <p>The NAT firewall traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder natBps(Long natBps) {
                this.natBps = natBps;
                return this;
            }

            /**
             * <p>The time when the traffic occurred. The value is a UNIX timestamp in seconds.</p>
             * <p>If the data at this point in time has not been processed, the values of other fields are -1.</p>
             * 
             * <strong>example:</strong>
             * <p>1758470400</p>
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The total firewall traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder totalBps(Long totalBps) {
                this.totalBps = totalBps;
                return this;
            }

            /**
             * <p>The VPC firewall traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder vpcBps(Long vpcBps) {
                this.vpcBps = vpcBps;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFirewallTrafficTrendResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFirewallTrafficTrendResponseBody</p>
     */
    public static class MaxBandwidthTimeBps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InternetBps")
        private Long internetBps;

        @com.aliyun.core.annotation.NameInMap("NatBps")
        private Long natBps;

        @com.aliyun.core.annotation.NameInMap("TotalBps")
        private Long totalBps;

        @com.aliyun.core.annotation.NameInMap("VpcBps")
        private Long vpcBps;

        private MaxBandwidthTimeBps(Builder builder) {
            this.internetBps = builder.internetBps;
            this.natBps = builder.natBps;
            this.totalBps = builder.totalBps;
            this.vpcBps = builder.vpcBps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MaxBandwidthTimeBps create() {
            return builder().build();
        }

        /**
         * @return internetBps
         */
        public Long getInternetBps() {
            return this.internetBps;
        }

        /**
         * @return natBps
         */
        public Long getNatBps() {
            return this.natBps;
        }

        /**
         * @return totalBps
         */
        public Long getTotalBps() {
            return this.totalBps;
        }

        /**
         * @return vpcBps
         */
        public Long getVpcBps() {
            return this.vpcBps;
        }

        public static final class Builder {
            private Long internetBps; 
            private Long natBps; 
            private Long totalBps; 
            private Long vpcBps; 

            private Builder() {
            } 

            private Builder(MaxBandwidthTimeBps model) {
                this.internetBps = model.internetBps;
                this.natBps = model.natBps;
                this.totalBps = model.totalBps;
                this.vpcBps = model.vpcBps;
            } 

            /**
             * <p>The Internet firewall traffic at the time of peak total traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder internetBps(Long internetBps) {
                this.internetBps = internetBps;
                return this;
            }

            /**
             * <p>The NAT firewall traffic at the time of peak total traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder natBps(Long natBps) {
                this.natBps = natBps;
                return this;
            }

            /**
             * <p>The peak total traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder totalBps(Long totalBps) {
                this.totalBps = totalBps;
                return this;
            }

            /**
             * <p>The VPC firewall traffic at the time of peak total traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder vpcBps(Long vpcBps) {
                this.vpcBps = vpcBps;
                return this;
            }

            public MaxBandwidthTimeBps build() {
                return new MaxBandwidthTimeBps(this);
            } 

        } 

    }
}
