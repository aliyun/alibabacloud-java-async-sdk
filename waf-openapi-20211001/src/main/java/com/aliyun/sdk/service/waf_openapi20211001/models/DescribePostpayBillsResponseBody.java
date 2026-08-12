// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribePostpayBillsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePostpayBillsResponseBody</p>
 */
public class DescribePostpayBillsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BillDetail")
    private java.util.List<BillDetail> billDetail;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePostpayBillsResponseBody(Builder builder) {
        this.billDetail = builder.billDetail;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePostpayBillsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billDetail
     */
    public java.util.List<BillDetail> getBillDetail() {
        return this.billDetail;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<BillDetail> billDetail; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribePostpayBillsResponseBody model) {
            this.billDetail = model.billDetail;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * BillDetail.
         */
        public Builder billDetail(java.util.List<BillDetail> billDetail) {
            this.billDetail = billDetail;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePostpayBillsResponseBody build() {
            return new DescribePostpayBillsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePostpayBillsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePostpayBillsResponseBody</p>
     */
    public static class BillDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChargeData")
        private String chargeData;

        @com.aliyun.core.annotation.NameInMap("Credit")
        private Double credit;

        @com.aliyun.core.annotation.NameInMap("CreditChargeData")
        private String creditChargeData;

        @com.aliyun.core.annotation.NameInMap("Cu")
        private String cu;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("FunctionCredit")
        private Double functionCredit;

        @com.aliyun.core.annotation.NameInMap("FunctionCu")
        private String functionCu;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("TrafficCredit")
        private Double trafficCredit;

        @com.aliyun.core.annotation.NameInMap("TrafficCu")
        private String trafficCu;

        private BillDetail(Builder builder) {
            this.chargeData = builder.chargeData;
            this.credit = builder.credit;
            this.creditChargeData = builder.creditChargeData;
            this.cu = builder.cu;
            this.endTime = builder.endTime;
            this.functionCredit = builder.functionCredit;
            this.functionCu = builder.functionCu;
            this.startTime = builder.startTime;
            this.trafficCredit = builder.trafficCredit;
            this.trafficCu = builder.trafficCu;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BillDetail create() {
            return builder().build();
        }

        /**
         * @return chargeData
         */
        public String getChargeData() {
            return this.chargeData;
        }

        /**
         * @return credit
         */
        public Double getCredit() {
            return this.credit;
        }

        /**
         * @return creditChargeData
         */
        public String getCreditChargeData() {
            return this.creditChargeData;
        }

        /**
         * @return cu
         */
        public String getCu() {
            return this.cu;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return functionCredit
         */
        public Double getFunctionCredit() {
            return this.functionCredit;
        }

        /**
         * @return functionCu
         */
        public String getFunctionCu() {
            return this.functionCu;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return trafficCredit
         */
        public Double getTrafficCredit() {
            return this.trafficCredit;
        }

        /**
         * @return trafficCu
         */
        public String getTrafficCu() {
            return this.trafficCu;
        }

        public static final class Builder {
            private String chargeData; 
            private Double credit; 
            private String creditChargeData; 
            private String cu; 
            private Long endTime; 
            private Double functionCredit; 
            private String functionCu; 
            private Long startTime; 
            private Double trafficCredit; 
            private String trafficCu; 

            private Builder() {
            } 

            private Builder(BillDetail model) {
                this.chargeData = model.chargeData;
                this.credit = model.credit;
                this.creditChargeData = model.creditChargeData;
                this.cu = model.cu;
                this.endTime = model.endTime;
                this.functionCredit = model.functionCredit;
                this.functionCu = model.functionCu;
                this.startTime = model.startTime;
                this.trafficCredit = model.trafficCredit;
                this.trafficCu = model.trafficCu;
            } 

            /**
             * ChargeData.
             */
            public Builder chargeData(String chargeData) {
                this.chargeData = chargeData;
                return this;
            }

            /**
             * Credit.
             */
            public Builder credit(Double credit) {
                this.credit = credit;
                return this;
            }

            /**
             * CreditChargeData.
             */
            public Builder creditChargeData(String creditChargeData) {
                this.creditChargeData = creditChargeData;
                return this;
            }

            /**
             * Cu.
             */
            public Builder cu(String cu) {
                this.cu = cu;
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
             * FunctionCredit.
             */
            public Builder functionCredit(Double functionCredit) {
                this.functionCredit = functionCredit;
                return this;
            }

            /**
             * FunctionCu.
             */
            public Builder functionCu(String functionCu) {
                this.functionCu = functionCu;
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
             * TrafficCredit.
             */
            public Builder trafficCredit(Double trafficCredit) {
                this.trafficCredit = trafficCredit;
                return this;
            }

            /**
             * TrafficCu.
             */
            public Builder trafficCu(String trafficCu) {
                this.trafficCu = trafficCu;
                return this;
            }

            public BillDetail build() {
                return new BillDetail(this);
            } 

        } 

    }
}
