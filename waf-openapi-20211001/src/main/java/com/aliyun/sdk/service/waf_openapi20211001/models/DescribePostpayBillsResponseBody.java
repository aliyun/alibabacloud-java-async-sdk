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

        @com.aliyun.core.annotation.NameInMap("Cu")
        private String cu;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("FunctionCu")
        private String functionCu;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("TrafficCu")
        private String trafficCu;

        private BillDetail(Builder builder) {
            this.chargeData = builder.chargeData;
            this.cu = builder.cu;
            this.endTime = builder.endTime;
            this.functionCu = builder.functionCu;
            this.startTime = builder.startTime;
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
         * @return trafficCu
         */
        public String getTrafficCu() {
            return this.trafficCu;
        }

        public static final class Builder {
            private String chargeData; 
            private String cu; 
            private Long endTime; 
            private String functionCu; 
            private Long startTime; 
            private String trafficCu; 

            private Builder() {
            } 

            private Builder(BillDetail model) {
                this.chargeData = model.chargeData;
                this.cu = model.cu;
                this.endTime = model.endTime;
                this.functionCu = model.functionCu;
                this.startTime = model.startTime;
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
