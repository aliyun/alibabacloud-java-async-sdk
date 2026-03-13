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
 * {@link DescribeElasticBillsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeElasticBillsResponseBody</p>
 */
public class DescribeElasticBillsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Bills")
    private java.util.List<Bills> bills;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeElasticBillsResponseBody(Builder builder) {
        this.bills = builder.bills;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeElasticBillsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bills
     */
    public java.util.List<Bills> getBills() {
        return this.bills;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Bills> bills; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeElasticBillsResponseBody model) {
            this.bills = model.bills;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The pay-as-you-go bills.</p>
         */
        public Builder bills(java.util.List<Bills> bills) {
            this.bills = bills;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6FBF08CB-8691-5B65-BBF8-***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeElasticBillsResponseBody build() {
            return new DescribeElasticBillsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeElasticBillsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeElasticBillsResponseBody</p>
     */
    public static class Bills extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cu")
        private Double cu;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("FunctionCu")
        private Double functionCu;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("TrafficCu")
        private Double trafficCu;

        private Bills(Builder builder) {
            this.cu = builder.cu;
            this.endTime = builder.endTime;
            this.functionCu = builder.functionCu;
            this.startTime = builder.startTime;
            this.trafficCu = builder.trafficCu;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Bills create() {
            return builder().build();
        }

        /**
         * @return cu
         */
        public Double getCu() {
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
        public Double getFunctionCu() {
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
        public Double getTrafficCu() {
            return this.trafficCu;
        }

        public static final class Builder {
            private Double cu; 
            private Long endTime; 
            private Double functionCu; 
            private Long startTime; 
            private Double trafficCu; 

            private Builder() {
            } 

            private Builder(Bills model) {
                this.cu = model.cu;
                this.endTime = model.endTime;
                this.functionCu = model.functionCu;
                this.startTime = model.startTime;
                this.trafficCu = model.trafficCu;
            } 

            /**
             * <p>The total number of SeCUs.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cu(Double cu) {
                this.cu = cu;
                return this;
            }

            /**
             * <p>The billing end time. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1717084800000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The SeCUs generated by the features that you configure.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder functionCu(Double functionCu) {
                this.functionCu = functionCu;
                return this;
            }

            /**
             * <p>The billing start time. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1665484616000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The SeCUs generated by traffic processing.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder trafficCu(Double trafficCu) {
                this.trafficCu = trafficCu;
                return this;
            }

            public Bills build() {
                return new Bills(this);
            } 

        } 

    }
}
