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
         * <p>The list of bill details.</p>
         */
        public Builder billDetail(java.util.List<BillDetail> billDetail) {
            this.billDetail = billDetail;
            return this;
        }

        /**
         * <p>The number of entries per page in a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token for the next page. If a next page exists, this field has a return value.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0*****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0FBBDE11-C35F-531B-96BA-64CA****C875</p>
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
             * <p>The bill usage details. The value is a JSON string constructed from a series of parameters. For more information, refer to <strong>Supplementary description of response parameters</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;aiWhiteListTemplateCount\&quot;:4,\&quot;apisecResourceCount\&quot;:2,\&quot;botAppTemplateCount\&quot;:1,\&quot;botWebTemplateCount\&quot;:4,\&quot;ccRuleCount\&quot;:1,\&quot;customAclAdvanceRuleCount\&quot;:4,\&quot;customResponseRuleCount\&quot;:5,\&quot;dlpRuleCount\&quot;:1,\&quot;gslb\&quot;:1,\&quot;instanceFee\&quot;:1,\&quot;ipv6\&quot;:1,\&quot;nonPort\&quot;:1,\&quot;qps\&quot;:0,\&quot;regionBlockRuleCount\&quot;:1,\&quot;threatIntelligenceTemplateCount\&quot;:1,\&quot;wafBaseTemplateCount\&quot;:4}</p>
             */
            public Builder chargeData(String chargeData) {
                this.chargeData = chargeData;
                return this;
            }

            /**
             * <p>The total Credit.</p>
             * 
             * <strong>example:</strong>
             * <p>382</p>
             */
            public Builder credit(Double credit) {
                this.credit = credit;
                return this;
            }

            /**
             * <p>The Credit bill usage details. The value is a JSON string constructed from a series of parameters. For more information, refer to <strong>Supplementary description of response parameters</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;apisecTraffic\&quot;:\&quot;8000\&quot;,\&quot;apisecResourceCount\&quot;:\&quot;3\&quot;}</p>
             */
            public Builder creditChargeData(String creditChargeData) {
                this.creditChargeData = creditChargeData;
                return this;
            }

            /**
             * <p>The total SeCU.</p>
             * 
             * <strong>example:</strong>
             * <p>51</p>
             */
            public Builder cu(String cu) {
                this.cu = cu;
                return this;
            }

            /**
             * <p>The end time. The value is a UNIX timestamp (UTC). Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1779123599</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The Credit consumed by features.</p>
             * 
             * <strong>example:</strong>
             * <p>375</p>
             */
            public Builder functionCredit(Double functionCredit) {
                this.functionCredit = functionCredit;
                return this;
            }

            /**
             * <p>The SeCU consumed by features.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder functionCu(String functionCu) {
                this.functionCu = functionCu;
                return this;
            }

            /**
             * <p>The start time. The value is a UNIX timestamp (UTC). Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1779120000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The Credit consumed by traffic processing.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder trafficCredit(Double trafficCredit) {
                this.trafficCredit = trafficCredit;
                return this;
            }

            /**
             * <p>The SeCU consumed by traffic processing.</p>
             * 
             * <strong>example:</strong>
             * <p>21</p>
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
