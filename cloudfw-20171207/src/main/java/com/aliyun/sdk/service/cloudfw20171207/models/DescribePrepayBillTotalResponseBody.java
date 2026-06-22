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
         * BillList.
         */
        public Builder billList(java.util.List<BillList> billList) {
            this.billList = billList;
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
         * TotalCount.
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
             * BilledDetectionTraffic.
             */
            public Builder billedDetectionTraffic(Float billedDetectionTraffic) {
                this.billedDetectionTraffic = billedDetectionTraffic;
                return this;
            }

            /**
             * DailyDetectionTraffic.
             */
            public Builder dailyDetectionTraffic(Float dailyDetectionTraffic) {
                this.dailyDetectionTraffic = dailyDetectionTraffic;
                return this;
            }

            /**
             * DailyOverflowTraffic.
             */
            public Builder dailyOverflowTraffic(Float dailyOverflowTraffic) {
                this.dailyOverflowTraffic = dailyOverflowTraffic;
                return this;
            }

            /**
             * DefaultBandwidth.
             */
            public Builder defaultBandwidth(Long defaultBandwidth) {
                this.defaultBandwidth = defaultBandwidth;
                return this;
            }

            /**
             * ElasticBandwidth.
             */
            public Builder elasticBandwidth(Long elasticBandwidth) {
                this.elasticBandwidth = elasticBandwidth;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * ExtensionBandwidth.
             */
            public Builder extensionBandwidth(Long extensionBandwidth) {
                this.extensionBandwidth = extensionBandwidth;
                return this;
            }

            /**
             * InternetTrafficBandwidth.
             */
            public Builder internetTrafficBandwidth(Float internetTrafficBandwidth) {
                this.internetTrafficBandwidth = internetTrafficBandwidth;
                return this;
            }

            /**
             * MonthlyRemainingFreeTraffic.
             */
            public Builder monthlyRemainingFreeTraffic(Float monthlyRemainingFreeTraffic) {
                this.monthlyRemainingFreeTraffic = monthlyRemainingFreeTraffic;
                return this;
            }

            /**
             * NatTrafficBandwidth.
             */
            public Builder natTrafficBandwidth(Float natTrafficBandwidth) {
                this.natTrafficBandwidth = natTrafficBandwidth;
                return this;
            }

            /**
             * OverflowTime.
             */
            public Builder overflowTime(Long overflowTime) {
                this.overflowTime = overflowTime;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * TemporaryBandwidth.
             */
            public Builder temporaryBandwidth(Long temporaryBandwidth) {
                this.temporaryBandwidth = temporaryBandwidth;
                return this;
            }

            /**
             * VpcTrafficBandwidth.
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
