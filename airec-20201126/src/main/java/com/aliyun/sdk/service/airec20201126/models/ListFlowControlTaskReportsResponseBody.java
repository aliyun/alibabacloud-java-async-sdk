// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListFlowControlTaskReportsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFlowControlTaskReportsResponseBody</p>
 */
public class ListFlowControlTaskReportsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private ListFlowControlTaskReportsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFlowControlTaskReportsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListFlowControlTaskReportsResponseBody build() {
            return new ListFlowControlTaskReportsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFlowControlTaskReportsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFlowControlTaskReportsResponseBody</p>
     */
    public static class Details extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("val")
        private Long val;

        private Details(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
            this.val = builder.val;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Details create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return val
         */
        public Long getVal() {
            return this.val;
        }

        public static final class Builder {
            private Long endTime; 
            private Long startTime; 
            private Long val; 

            /**
             * endTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * val.
             */
            public Builder val(Long val) {
                this.val = val;
                return this;
            }

            public Details build() {
                return new Details(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListFlowControlTaskReportsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFlowControlTaskReportsResponseBody</p>
     */
    public static class Metrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("details")
        private java.util.List < Details> details;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Metrics(Builder builder) {
            this.details = builder.details;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metrics create() {
            return builder().build();
        }

        /**
         * @return details
         */
        public java.util.List < Details> getDetails() {
            return this.details;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < Details> details; 
            private String type; 

            /**
             * details.
             */
            public Builder details(java.util.List < Details> details) {
                this.details = details;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Metrics build() {
                return new Metrics(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListFlowControlTaskReportsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFlowControlTaskReportsResponseBody</p>
     */
    public static class Total extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InvalidPercent")
        private Double invalidPercent;

        @com.aliyun.core.annotation.NameInMap("accTaskCtr")
        private Double accTaskCtr;

        @com.aliyun.core.annotation.NameInMap("accTaskPv")
        private Long accTaskPv;

        @com.aliyun.core.annotation.NameInMap("accTotalCtr")
        private Double accTotalCtr;

        private Total(Builder builder) {
            this.invalidPercent = builder.invalidPercent;
            this.accTaskCtr = builder.accTaskCtr;
            this.accTaskPv = builder.accTaskPv;
            this.accTotalCtr = builder.accTotalCtr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Total create() {
            return builder().build();
        }

        /**
         * @return invalidPercent
         */
        public Double getInvalidPercent() {
            return this.invalidPercent;
        }

        /**
         * @return accTaskCtr
         */
        public Double getAccTaskCtr() {
            return this.accTaskCtr;
        }

        /**
         * @return accTaskPv
         */
        public Long getAccTaskPv() {
            return this.accTaskPv;
        }

        /**
         * @return accTotalCtr
         */
        public Double getAccTotalCtr() {
            return this.accTotalCtr;
        }

        public static final class Builder {
            private Double invalidPercent; 
            private Double accTaskCtr; 
            private Long accTaskPv; 
            private Double accTotalCtr; 

            /**
             * InvalidPercent.
             */
            public Builder invalidPercent(Double invalidPercent) {
                this.invalidPercent = invalidPercent;
                return this;
            }

            /**
             * accTaskCtr.
             */
            public Builder accTaskCtr(Double accTaskCtr) {
                this.accTaskCtr = accTaskCtr;
                return this;
            }

            /**
             * accTaskPv.
             */
            public Builder accTaskPv(Long accTaskPv) {
                this.accTaskPv = accTaskPv;
                return this;
            }

            /**
             * accTotalCtr.
             */
            public Builder accTotalCtr(Double accTotalCtr) {
                this.accTotalCtr = accTotalCtr;
                return this;
            }

            public Total build() {
                return new Total(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListFlowControlTaskReportsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFlowControlTaskReportsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("metrics")
        private java.util.List < Metrics> metrics;

        @com.aliyun.core.annotation.NameInMap("total")
        private Total total;

        private Result(Builder builder) {
            this.metrics = builder.metrics;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return metrics
         */
        public java.util.List < Metrics> getMetrics() {
            return this.metrics;
        }

        /**
         * @return total
         */
        public Total getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < Metrics> metrics; 
            private Total total; 

            /**
             * metrics.
             */
            public Builder metrics(java.util.List < Metrics> metrics) {
                this.metrics = metrics;
                return this;
            }

            /**
             * total.
             */
            public Builder total(Total total) {
                this.total = total;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
