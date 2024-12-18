// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link Describe95TrafficResponseBody} extends {@link TeaModel}
 *
 * <p>Describe95TrafficResponseBody</p>
 */
public class Describe95TrafficResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Traffic95Summary")
    private Traffic95Summary traffic95Summary;

    private Describe95TrafficResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.traffic95Summary = builder.traffic95Summary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Describe95TrafficResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return traffic95Summary
     */
    public Traffic95Summary getTraffic95Summary() {
        return this.traffic95Summary;
    }

    public static final class Builder {
        private String requestId; 
        private Traffic95Summary traffic95Summary; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0ED8D006-F706-4D23-88ED-E11ED28DCAC0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information returned.</p>
         */
        public Builder traffic95Summary(Traffic95Summary traffic95Summary) {
            this.traffic95Summary = traffic95Summary;
            return this;
        }

        public Describe95TrafficResponseBody build() {
            return new Describe95TrafficResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link Describe95TrafficResponseBody} extends {@link TeaModel}
     *
     * <p>Describe95TrafficResponseBody</p>
     */
    public static class Traffic95Detail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BillBandwidth")
        private String billBandwidth;

        @com.aliyun.core.annotation.NameInMap("InBandwidth")
        private String inBandwidth;

        @com.aliyun.core.annotation.NameInMap("OutBandwidth")
        private String outBandwidth;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        private Traffic95Detail(Builder builder) {
            this.billBandwidth = builder.billBandwidth;
            this.inBandwidth = builder.inBandwidth;
            this.outBandwidth = builder.outBandwidth;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Traffic95Detail create() {
            return builder().build();
        }

        /**
         * @return billBandwidth
         */
        public String getBillBandwidth() {
            return this.billBandwidth;
        }

        /**
         * @return inBandwidth
         */
        public String getInBandwidth() {
            return this.inBandwidth;
        }

        /**
         * @return outBandwidth
         */
        public String getOutBandwidth() {
            return this.outBandwidth;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private String billBandwidth; 
            private String inBandwidth; 
            private String outBandwidth; 
            private String time; 

            /**
             * <p>The sampled bandwidth value, which is the larger bandwidth value in the inbound and outbound directions within a sampling interval. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>118.5090322113037</p>
             */
            public Builder billBandwidth(String billBandwidth) {
                this.billBandwidth = billBandwidth;
                return this;
            }

            /**
             * <p>The inbound bandwidth. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>118.5090322113037</p>
             */
            public Builder inBandwidth(String inBandwidth) {
                this.inBandwidth = inBandwidth;
                return this;
            }

            /**
             * <p>The outbound bandwidth. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>96.41217480977376</p>
             */
            public Builder outBandwidth(String outBandwidth) {
                this.outBandwidth = outBandwidth;
                return this;
            }

            /**
             * <p>The statistical time. The value is a string.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-01T00:00:00Z</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public Traffic95Detail build() {
                return new Traffic95Detail(this);
            } 

        } 

    }
    /**
     * 
     * {@link Describe95TrafficResponseBody} extends {@link TeaModel}
     *
     * <p>Describe95TrafficResponseBody</p>
     */
    public static class Traffic95DetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Traffic95Detail")
        private java.util.List<Traffic95Detail> traffic95Detail;

        private Traffic95DetailList(Builder builder) {
            this.traffic95Detail = builder.traffic95Detail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Traffic95DetailList create() {
            return builder().build();
        }

        /**
         * @return traffic95Detail
         */
        public java.util.List<Traffic95Detail> getTraffic95Detail() {
            return this.traffic95Detail;
        }

        public static final class Builder {
            private java.util.List<Traffic95Detail> traffic95Detail; 

            /**
             * Traffic95Detail.
             */
            public Builder traffic95Detail(java.util.List<Traffic95Detail> traffic95Detail) {
                this.traffic95Detail = traffic95Detail;
                return this;
            }

            public Traffic95DetailList build() {
                return new Traffic95DetailList(this);
            } 

        } 

    }
    /**
     * 
     * {@link Describe95TrafficResponseBody} extends {@link TeaModel}
     *
     * <p>Describe95TrafficResponseBody</p>
     */
    public static class Traffic95Summary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Long bandwidth;

        @com.aliyun.core.annotation.NameInMap("FifthPeakBandwidth")
        private String fifthPeakBandwidth;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InternetChargeType")
        private String internetChargeType;

        @com.aliyun.core.annotation.NameInMap("MinimumConsumeBandwidth")
        private String minimumConsumeBandwidth;

        @com.aliyun.core.annotation.NameInMap("Traffic95DetailList")
        private Traffic95DetailList traffic95DetailList;

        private Traffic95Summary(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.fifthPeakBandwidth = builder.fifthPeakBandwidth;
            this.instanceId = builder.instanceId;
            this.internetChargeType = builder.internetChargeType;
            this.minimumConsumeBandwidth = builder.minimumConsumeBandwidth;
            this.traffic95DetailList = builder.traffic95DetailList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Traffic95Summary create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Long getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return fifthPeakBandwidth
         */
        public String getFifthPeakBandwidth() {
            return this.fifthPeakBandwidth;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return internetChargeType
         */
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        /**
         * @return minimumConsumeBandwidth
         */
        public String getMinimumConsumeBandwidth() {
            return this.minimumConsumeBandwidth;
        }

        /**
         * @return traffic95DetailList
         */
        public Traffic95DetailList getTraffic95DetailList() {
            return this.traffic95DetailList;
        }

        public static final class Builder {
            private Long bandwidth; 
            private String fifthPeakBandwidth; 
            private String instanceId; 
            private String internetChargeType; 
            private String minimumConsumeBandwidth; 
            private Traffic95DetailList traffic95DetailList; 

            /**
             * <p>The peak bandwidth of the Internet Shared Bandwidth instance. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>20000.0</p>
             */
            public Builder bandwidth(Long bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The daily peak bandwidth. Unit: Mbit/s.
             * &lt;props=&quot;china&quot;&gt; For more information, see <a href="https://help.aliyun.com/document_detail/89729.html">Daily peak bandwidth</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>1064.244837773641</p>
             */
            public Builder fifthPeakBandwidth(String fifthPeakBandwidth) {
                this.fifthPeakBandwidth = fifthPeakBandwidth;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cbwp-wz9j19xrwf78fvz7*****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The metering method of the Internet Shared Bandwidth instance. Valid values:</p>
             * <ul>
             * <li>PayBy95: pay-by-enhanced-95th-percentile</li>
             * <li>PayByBandwidth: pay-by-bandwidth</li>
             * <li>PayByDominantTraffic: pay-by-dominant-traffic</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PayBy95</p>
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * <p>The guaranteed bandwidth of the Internet Shared Bandwidth instance. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0</p>
             */
            public Builder minimumConsumeBandwidth(String minimumConsumeBandwidth) {
                this.minimumConsumeBandwidth = minimumConsumeBandwidth;
                return this;
            }

            /**
             * <p>The average bandwidth every 5 minutes in the inbound and outbound directions.</p>
             */
            public Builder traffic95DetailList(Traffic95DetailList traffic95DetailList) {
                this.traffic95DetailList = traffic95DetailList;
                return this;
            }

            public Traffic95Summary build() {
                return new Traffic95Summary(this);
            } 

        } 

    }
}
