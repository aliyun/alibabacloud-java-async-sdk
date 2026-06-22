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
 * {@link DescribePostpayBillResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePostpayBillResponseBody</p>
 */
public class DescribePostpayBillResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AggregateInternetTraffic")
    private Float aggregateInternetTraffic;

    @com.aliyun.core.annotation.NameInMap("AggregateNatTraffic")
    private Float aggregateNatTraffic;

    @com.aliyun.core.annotation.NameInMap("AggregateSdlTraffic")
    private Float aggregateSdlTraffic;

    @com.aliyun.core.annotation.NameInMap("AggregateTotalTraffic")
    private Float aggregateTotalTraffic;

    @com.aliyun.core.annotation.NameInMap("AggregateVpcTraffic")
    private Float aggregateVpcTraffic;

    @com.aliyun.core.annotation.NameInMap("BillList")
    private java.util.List<BillList> billList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribePostpayBillResponseBody(Builder builder) {
        this.aggregateInternetTraffic = builder.aggregateInternetTraffic;
        this.aggregateNatTraffic = builder.aggregateNatTraffic;
        this.aggregateSdlTraffic = builder.aggregateSdlTraffic;
        this.aggregateTotalTraffic = builder.aggregateTotalTraffic;
        this.aggregateVpcTraffic = builder.aggregateVpcTraffic;
        this.billList = builder.billList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePostpayBillResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregateInternetTraffic
     */
    public Float getAggregateInternetTraffic() {
        return this.aggregateInternetTraffic;
    }

    /**
     * @return aggregateNatTraffic
     */
    public Float getAggregateNatTraffic() {
        return this.aggregateNatTraffic;
    }

    /**
     * @return aggregateSdlTraffic
     */
    public Float getAggregateSdlTraffic() {
        return this.aggregateSdlTraffic;
    }

    /**
     * @return aggregateTotalTraffic
     */
    public Float getAggregateTotalTraffic() {
        return this.aggregateTotalTraffic;
    }

    /**
     * @return aggregateVpcTraffic
     */
    public Float getAggregateVpcTraffic() {
        return this.aggregateVpcTraffic;
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
        private Float aggregateInternetTraffic; 
        private Float aggregateNatTraffic; 
        private Float aggregateSdlTraffic; 
        private Float aggregateTotalTraffic; 
        private Float aggregateVpcTraffic; 
        private java.util.List<BillList> billList; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribePostpayBillResponseBody model) {
            this.aggregateInternetTraffic = model.aggregateInternetTraffic;
            this.aggregateNatTraffic = model.aggregateNatTraffic;
            this.aggregateSdlTraffic = model.aggregateSdlTraffic;
            this.aggregateTotalTraffic = model.aggregateTotalTraffic;
            this.aggregateVpcTraffic = model.aggregateVpcTraffic;
            this.billList = model.billList;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * AggregateInternetTraffic.
         */
        public Builder aggregateInternetTraffic(Float aggregateInternetTraffic) {
            this.aggregateInternetTraffic = aggregateInternetTraffic;
            return this;
        }

        /**
         * AggregateNatTraffic.
         */
        public Builder aggregateNatTraffic(Float aggregateNatTraffic) {
            this.aggregateNatTraffic = aggregateNatTraffic;
            return this;
        }

        /**
         * AggregateSdlTraffic.
         */
        public Builder aggregateSdlTraffic(Float aggregateSdlTraffic) {
            this.aggregateSdlTraffic = aggregateSdlTraffic;
            return this;
        }

        /**
         * AggregateTotalTraffic.
         */
        public Builder aggregateTotalTraffic(Float aggregateTotalTraffic) {
            this.aggregateTotalTraffic = aggregateTotalTraffic;
            return this;
        }

        /**
         * AggregateVpcTraffic.
         */
        public Builder aggregateVpcTraffic(Float aggregateVpcTraffic) {
            this.aggregateVpcTraffic = aggregateVpcTraffic;
            return this;
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

        public DescribePostpayBillResponseBody build() {
            return new DescribePostpayBillResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePostpayBillResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePostpayBillResponseBody</p>
     */
    public static class BillList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("InternetInstanceCnt")
        private Long internetInstanceCnt;

        @com.aliyun.core.annotation.NameInMap("InternetTraffic")
        private Float internetTraffic;

        @com.aliyun.core.annotation.NameInMap("IsDerated")
        private Integer isDerated;

        @com.aliyun.core.annotation.NameInMap("LogStorage")
        private Long logStorage;

        @com.aliyun.core.annotation.NameInMap("NatInstanceCnt")
        private Long natInstanceCnt;

        @com.aliyun.core.annotation.NameInMap("NatTraffic")
        private Float natTraffic;

        @com.aliyun.core.annotation.NameInMap("Sdl")
        private Long sdl;

        @com.aliyun.core.annotation.NameInMap("SdlTraffic")
        private Float sdlTraffic;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("ThreatIntelligence")
        private Long threatIntelligence;

        @com.aliyun.core.annotation.NameInMap("VpcInstanceCnt")
        private Long vpcInstanceCnt;

        @com.aliyun.core.annotation.NameInMap("VpcTraffic")
        private Float vpcTraffic;

        private BillList(Builder builder) {
            this.endTime = builder.endTime;
            this.internetInstanceCnt = builder.internetInstanceCnt;
            this.internetTraffic = builder.internetTraffic;
            this.isDerated = builder.isDerated;
            this.logStorage = builder.logStorage;
            this.natInstanceCnt = builder.natInstanceCnt;
            this.natTraffic = builder.natTraffic;
            this.sdl = builder.sdl;
            this.sdlTraffic = builder.sdlTraffic;
            this.startTime = builder.startTime;
            this.threatIntelligence = builder.threatIntelligence;
            this.vpcInstanceCnt = builder.vpcInstanceCnt;
            this.vpcTraffic = builder.vpcTraffic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BillList create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return internetInstanceCnt
         */
        public Long getInternetInstanceCnt() {
            return this.internetInstanceCnt;
        }

        /**
         * @return internetTraffic
         */
        public Float getInternetTraffic() {
            return this.internetTraffic;
        }

        /**
         * @return isDerated
         */
        public Integer getIsDerated() {
            return this.isDerated;
        }

        /**
         * @return logStorage
         */
        public Long getLogStorage() {
            return this.logStorage;
        }

        /**
         * @return natInstanceCnt
         */
        public Long getNatInstanceCnt() {
            return this.natInstanceCnt;
        }

        /**
         * @return natTraffic
         */
        public Float getNatTraffic() {
            return this.natTraffic;
        }

        /**
         * @return sdl
         */
        public Long getSdl() {
            return this.sdl;
        }

        /**
         * @return sdlTraffic
         */
        public Float getSdlTraffic() {
            return this.sdlTraffic;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return threatIntelligence
         */
        public Long getThreatIntelligence() {
            return this.threatIntelligence;
        }

        /**
         * @return vpcInstanceCnt
         */
        public Long getVpcInstanceCnt() {
            return this.vpcInstanceCnt;
        }

        /**
         * @return vpcTraffic
         */
        public Float getVpcTraffic() {
            return this.vpcTraffic;
        }

        public static final class Builder {
            private Long endTime; 
            private Long internetInstanceCnt; 
            private Float internetTraffic; 
            private Integer isDerated; 
            private Long logStorage; 
            private Long natInstanceCnt; 
            private Float natTraffic; 
            private Long sdl; 
            private Float sdlTraffic; 
            private Long startTime; 
            private Long threatIntelligence; 
            private Long vpcInstanceCnt; 
            private Float vpcTraffic; 

            private Builder() {
            } 

            private Builder(BillList model) {
                this.endTime = model.endTime;
                this.internetInstanceCnt = model.internetInstanceCnt;
                this.internetTraffic = model.internetTraffic;
                this.isDerated = model.isDerated;
                this.logStorage = model.logStorage;
                this.natInstanceCnt = model.natInstanceCnt;
                this.natTraffic = model.natTraffic;
                this.sdl = model.sdl;
                this.sdlTraffic = model.sdlTraffic;
                this.startTime = model.startTime;
                this.threatIntelligence = model.threatIntelligence;
                this.vpcInstanceCnt = model.vpcInstanceCnt;
                this.vpcTraffic = model.vpcTraffic;
            } 

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * InternetInstanceCnt.
             */
            public Builder internetInstanceCnt(Long internetInstanceCnt) {
                this.internetInstanceCnt = internetInstanceCnt;
                return this;
            }

            /**
             * InternetTraffic.
             */
            public Builder internetTraffic(Float internetTraffic) {
                this.internetTraffic = internetTraffic;
                return this;
            }

            /**
             * IsDerated.
             */
            public Builder isDerated(Integer isDerated) {
                this.isDerated = isDerated;
                return this;
            }

            /**
             * LogStorage.
             */
            public Builder logStorage(Long logStorage) {
                this.logStorage = logStorage;
                return this;
            }

            /**
             * NatInstanceCnt.
             */
            public Builder natInstanceCnt(Long natInstanceCnt) {
                this.natInstanceCnt = natInstanceCnt;
                return this;
            }

            /**
             * NatTraffic.
             */
            public Builder natTraffic(Float natTraffic) {
                this.natTraffic = natTraffic;
                return this;
            }

            /**
             * Sdl.
             */
            public Builder sdl(Long sdl) {
                this.sdl = sdl;
                return this;
            }

            /**
             * SdlTraffic.
             */
            public Builder sdlTraffic(Float sdlTraffic) {
                this.sdlTraffic = sdlTraffic;
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
             * ThreatIntelligence.
             */
            public Builder threatIntelligence(Long threatIntelligence) {
                this.threatIntelligence = threatIntelligence;
                return this;
            }

            /**
             * VpcInstanceCnt.
             */
            public Builder vpcInstanceCnt(Long vpcInstanceCnt) {
                this.vpcInstanceCnt = vpcInstanceCnt;
                return this;
            }

            /**
             * VpcTraffic.
             */
            public Builder vpcTraffic(Float vpcTraffic) {
                this.vpcTraffic = vpcTraffic;
                return this;
            }

            public BillList build() {
                return new BillList(this);
            } 

        } 

    }
}
