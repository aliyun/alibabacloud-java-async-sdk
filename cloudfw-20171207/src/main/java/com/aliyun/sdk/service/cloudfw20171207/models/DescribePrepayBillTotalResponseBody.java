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
 * {@link DescribePrepayBillTotalResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePrepayBillTotalResponseBody</p>
 */
public class DescribePrepayBillTotalResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BillList")
    private java.util.List<BillList> billList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribePrepayBillTotalResponseBody(Builder builder) {
        this.billList = builder.billList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePrepayBillTotalResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billList
     */
    public java.util.List<BillList> getBillList() {
        return this.billList;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<BillList> billList; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribePrepayBillTotalResponseBody model) {
            this.billList = model.billList;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The bill list, aggregated by day.</p>
         */
        public Builder billList(java.util.List<BillList> billList) {
            this.billList = billList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>450D47F5-956E-543E-8502-***********</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>132</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribePrepayBillTotalResponseBody build() {
            return new DescribePrepayBillTotalResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePrepayBillTotalResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePrepayBillTotalResponseBody</p>
     */
    public static class BillList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BilledDetectionTraffic")
        private Float billedDetectionTraffic;

        @com.aliyun.core.annotation.NameInMap("DailyDetectionTraffic")
        private Float dailyDetectionTraffic;

        @com.aliyun.core.annotation.NameInMap("DailyOverflowTraffic")
        private Float dailyOverflowTraffic;

        @com.aliyun.core.annotation.NameInMap("DefaultBandwidth")
        private Long defaultBandwidth;

        @com.aliyun.core.annotation.NameInMap("ElasticBandwidth")
        private Long elasticBandwidth;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("ExtensionBandwidth")
        private Long extensionBandwidth;

        @com.aliyun.core.annotation.NameInMap("InternetTrafficBandwidth")
        private Float internetTrafficBandwidth;

        @com.aliyun.core.annotation.NameInMap("MonthlyRemainingFreeTraffic")
        private Float monthlyRemainingFreeTraffic;

        @com.aliyun.core.annotation.NameInMap("NatTrafficBandwidth")
        private Float natTrafficBandwidth;

        @com.aliyun.core.annotation.NameInMap("OverflowTime")
        private Long overflowTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("TemporaryBandwidth")
        private Long temporaryBandwidth;

        @com.aliyun.core.annotation.NameInMap("VpcTrafficBandwidth")
        private Float vpcTrafficBandwidth;

        private BillList(Builder builder) {
            this.billedDetectionTraffic = builder.billedDetectionTraffic;
            this.dailyDetectionTraffic = builder.dailyDetectionTraffic;
            this.dailyOverflowTraffic = builder.dailyOverflowTraffic;
            this.defaultBandwidth = builder.defaultBandwidth;
            this.elasticBandwidth = builder.elasticBandwidth;
            this.endTime = builder.endTime;
            this.extensionBandwidth = builder.extensionBandwidth;
            this.internetTrafficBandwidth = builder.internetTrafficBandwidth;
            this.monthlyRemainingFreeTraffic = builder.monthlyRemainingFreeTraffic;
            this.natTrafficBandwidth = builder.natTrafficBandwidth;
            this.overflowTime = builder.overflowTime;
            this.startTime = builder.startTime;
            this.temporaryBandwidth = builder.temporaryBandwidth;
            this.vpcTrafficBandwidth = builder.vpcTrafficBandwidth;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BillList create() {
            return builder().build();
        }

        /**
         * @return billedDetectionTraffic
         */
        public Float getBilledDetectionTraffic() {
            return this.billedDetectionTraffic;
        }

        /**
         * @return dailyDetectionTraffic
         */
        public Float getDailyDetectionTraffic() {
            return this.dailyDetectionTraffic;
        }

        /**
         * @return dailyOverflowTraffic
         */
        public Float getDailyOverflowTraffic() {
            return this.dailyOverflowTraffic;
        }

        /**
         * @return defaultBandwidth
         */
        public Long getDefaultBandwidth() {
            return this.defaultBandwidth;
        }

        /**
         * @return elasticBandwidth
         */
        public Long getElasticBandwidth() {
            return this.elasticBandwidth;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return extensionBandwidth
         */
        public Long getExtensionBandwidth() {
            return this.extensionBandwidth;
        }

        /**
         * @return internetTrafficBandwidth
         */
        public Float getInternetTrafficBandwidth() {
            return this.internetTrafficBandwidth;
        }

        /**
         * @return monthlyRemainingFreeTraffic
         */
        public Float getMonthlyRemainingFreeTraffic() {
            return this.monthlyRemainingFreeTraffic;
        }

        /**
         * @return natTrafficBandwidth
         */
        public Float getNatTrafficBandwidth() {
            return this.natTrafficBandwidth;
        }

        /**
         * @return overflowTime
         */
        public Long getOverflowTime() {
            return this.overflowTime;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return temporaryBandwidth
         */
        public Long getTemporaryBandwidth() {
            return this.temporaryBandwidth;
        }

        /**
         * @return vpcTrafficBandwidth
         */
        public Float getVpcTrafficBandwidth() {
            return this.vpcTrafficBandwidth;
        }

        public static final class Builder {
            private Float billedDetectionTraffic; 
            private Float dailyDetectionTraffic; 
            private Float dailyOverflowTraffic; 
            private Long defaultBandwidth; 
            private Long elasticBandwidth; 
            private Long endTime; 
            private Long extensionBandwidth; 
            private Float internetTrafficBandwidth; 
            private Float monthlyRemainingFreeTraffic; 
            private Float natTrafficBandwidth; 
            private Long overflowTime; 
            private Long startTime; 
            private Long temporaryBandwidth; 
            private Float vpcTrafficBandwidth; 

            private Builder() {
            } 

            private Builder(BillList model) {
                this.billedDetectionTraffic = model.billedDetectionTraffic;
                this.dailyDetectionTraffic = model.dailyDetectionTraffic;
                this.dailyOverflowTraffic = model.dailyOverflowTraffic;
                this.defaultBandwidth = model.defaultBandwidth;
                this.elasticBandwidth = model.elasticBandwidth;
                this.endTime = model.endTime;
                this.extensionBandwidth = model.extensionBandwidth;
                this.internetTrafficBandwidth = model.internetTrafficBandwidth;
                this.monthlyRemainingFreeTraffic = model.monthlyRemainingFreeTraffic;
                this.natTrafficBandwidth = model.natTrafficBandwidth;
                this.overflowTime = model.overflowTime;
                this.startTime = model.startTime;
                this.temporaryBandwidth = model.temporaryBandwidth;
                this.vpcTrafficBandwidth = model.vpcTrafficBandwidth;
            } 

            /**
             * <p>The actual billed traffic for sensitive data leak detection.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder billedDetectionTraffic(Float billedDetectionTraffic) {
                this.billedDetectionTraffic = billedDetectionTraffic;
                return this;
            }

            /**
             * <p>The sensitive data detection traffic of the day.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder dailyDetectionTraffic(Float dailyDetectionTraffic) {
                this.dailyDetectionTraffic = dailyDetectionTraffic;
                return this;
            }

            /**
             * <p>The total elastic traffic of the day. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder dailyOverflowTraffic(Float dailyOverflowTraffic) {
                this.dailyOverflowTraffic = dailyOverflowTraffic;
                return this;
            }

            /**
             * <p>The default bandwidth of the edition. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder defaultBandwidth(Long defaultBandwidth) {
                this.defaultBandwidth = defaultBandwidth;
                return this;
            }

            /**
             * <p>The elastic bandwidth value. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder elasticBandwidth(Long elasticBandwidth) {
                this.elasticBandwidth = elasticBandwidth;
                return this;
            }

            /**
             * <p>The end time of the day. The value is a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1761667200</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The extended bandwidth. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder extensionBandwidth(Long extensionBandwidth) {
                this.extensionBandwidth = extensionBandwidth;
                return this;
            }

            /**
             * <p>The Internet traffic bandwidth. Unit: Gbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder internetTrafficBandwidth(Float internetTrafficBandwidth) {
                this.internetTrafficBandwidth = internetTrafficBandwidth;
                return this;
            }

            /**
             * <p>The monthly free traffic for sensitive data detection. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder monthlyRemainingFreeTraffic(Float monthlyRemainingFreeTraffic) {
                this.monthlyRemainingFreeTraffic = monthlyRemainingFreeTraffic;
                return this;
            }

            /**
             * <p>The NAT traffic bandwidth. Unit: Gbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder natTrafficBandwidth(Float natTrafficBandwidth) {
                this.natTrafficBandwidth = natTrafficBandwidth;
                return this;
            }

            /**
             * <p>The timestamp when the maximum bandwidth (Internet + VPC + NAT) of the day occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>1761588300</p>
             */
            public Builder overflowTime(Long overflowTime) {
                this.overflowTime = overflowTime;
                return this;
            }

            /**
             * <p>The start time of the day. The value is a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1761580800</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The temporary upgrade bandwidth. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder temporaryBandwidth(Long temporaryBandwidth) {
                this.temporaryBandwidth = temporaryBandwidth;
                return this;
            }

            /**
             * <p>The VPC traffic bandwidth. Unit: Gbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder vpcTrafficBandwidth(Float vpcTrafficBandwidth) {
                this.vpcTrafficBandwidth = vpcTrafficBandwidth;
                return this;
            }

            public BillList build() {
                return new BillList(this);
            } 

        } 

    }
}
