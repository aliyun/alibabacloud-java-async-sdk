// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRequestHitResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRequestHitResponseBody</p>
 */
public class DescribeRequestHitResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private ResultObject resultObject;

    private DescribeRequestHitResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRequestHitResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private ResultObject resultObject; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resultObject.
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeRequestHitResponseBody build() {
            return new DescribeRequestHitResponseBody(this);
        } 

    } 

    public static class RuleHitRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cost")
        private Integer cost;

        @com.aliyun.core.annotation.NameInMap("hitSuccessful")
        private Boolean hitSuccessful;

        @com.aliyun.core.annotation.NameInMap("isShowDetail")
        private Boolean isShowDetail;

        @com.aliyun.core.annotation.NameInMap("order")
        private Integer order;

        @com.aliyun.core.annotation.NameInMap("ruleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("ruleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("ruleSnapshotId")
        private String ruleSnapshotId;

        @com.aliyun.core.annotation.NameInMap("ruleStatus")
        private String ruleStatus;

        private RuleHitRecords(Builder builder) {
            this.cost = builder.cost;
            this.hitSuccessful = builder.hitSuccessful;
            this.isShowDetail = builder.isShowDetail;
            this.order = builder.order;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.ruleSnapshotId = builder.ruleSnapshotId;
            this.ruleStatus = builder.ruleStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleHitRecords create() {
            return builder().build();
        }

        /**
         * @return cost
         */
        public Integer getCost() {
            return this.cost;
        }

        /**
         * @return hitSuccessful
         */
        public Boolean getHitSuccessful() {
            return this.hitSuccessful;
        }

        /**
         * @return isShowDetail
         */
        public Boolean getIsShowDetail() {
            return this.isShowDetail;
        }

        /**
         * @return order
         */
        public Integer getOrder() {
            return this.order;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return ruleSnapshotId
         */
        public String getRuleSnapshotId() {
            return this.ruleSnapshotId;
        }

        /**
         * @return ruleStatus
         */
        public String getRuleStatus() {
            return this.ruleStatus;
        }

        public static final class Builder {
            private Integer cost; 
            private Boolean hitSuccessful; 
            private Boolean isShowDetail; 
            private Integer order; 
            private String ruleId; 
            private String ruleName; 
            private String ruleSnapshotId; 
            private String ruleStatus; 

            /**
             * cost.
             */
            public Builder cost(Integer cost) {
                this.cost = cost;
                return this;
            }

            /**
             * hitSuccessful.
             */
            public Builder hitSuccessful(Boolean hitSuccessful) {
                this.hitSuccessful = hitSuccessful;
                return this;
            }

            /**
             * isShowDetail.
             */
            public Builder isShowDetail(Boolean isShowDetail) {
                this.isShowDetail = isShowDetail;
                return this;
            }

            /**
             * order.
             */
            public Builder order(Integer order) {
                this.order = order;
                return this;
            }

            /**
             * ruleId.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * ruleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * ruleSnapshotId.
             */
            public Builder ruleSnapshotId(String ruleSnapshotId) {
                this.ruleSnapshotId = ruleSnapshotId;
                return this;
            }

            /**
             * ruleStatus.
             */
            public Builder ruleStatus(String ruleStatus) {
                this.ruleStatus = ruleStatus;
                return this;
            }

            public RuleHitRecords build() {
                return new RuleHitRecords(this);
            } 

        } 

    }
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("eventCode")
        private String eventCode;

        @com.aliyun.core.annotation.NameInMap("eventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("inputs")
        private String inputs;

        @com.aliyun.core.annotation.NameInMap("outputs")
        private String outputs;

        @com.aliyun.core.annotation.NameInMap("requestTime")
        private Long requestTime;

        @com.aliyun.core.annotation.NameInMap("ruleHitRecords")
        private java.util.List < RuleHitRecords> ruleHitRecords;

        @com.aliyun.core.annotation.NameInMap("sRequestId")
        private String sRequestId;

        @com.aliyun.core.annotation.NameInMap("totalCost")
        private Long totalCost;

        private ResultObject(Builder builder) {
            this.eventCode = builder.eventCode;
            this.eventName = builder.eventName;
            this.inputs = builder.inputs;
            this.outputs = builder.outputs;
            this.requestTime = builder.requestTime;
            this.ruleHitRecords = builder.ruleHitRecords;
            this.sRequestId = builder.sRequestId;
            this.totalCost = builder.totalCost;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return eventCode
         */
        public String getEventCode() {
            return this.eventCode;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return inputs
         */
        public String getInputs() {
            return this.inputs;
        }

        /**
         * @return outputs
         */
        public String getOutputs() {
            return this.outputs;
        }

        /**
         * @return requestTime
         */
        public Long getRequestTime() {
            return this.requestTime;
        }

        /**
         * @return ruleHitRecords
         */
        public java.util.List < RuleHitRecords> getRuleHitRecords() {
            return this.ruleHitRecords;
        }

        /**
         * @return sRequestId
         */
        public String getSRequestId() {
            return this.sRequestId;
        }

        /**
         * @return totalCost
         */
        public Long getTotalCost() {
            return this.totalCost;
        }

        public static final class Builder {
            private String eventCode; 
            private String eventName; 
            private String inputs; 
            private String outputs; 
            private Long requestTime; 
            private java.util.List < RuleHitRecords> ruleHitRecords; 
            private String sRequestId; 
            private Long totalCost; 

            /**
             * eventCode.
             */
            public Builder eventCode(String eventCode) {
                this.eventCode = eventCode;
                return this;
            }

            /**
             * eventName.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * inputs.
             */
            public Builder inputs(String inputs) {
                this.inputs = inputs;
                return this;
            }

            /**
             * outputs.
             */
            public Builder outputs(String outputs) {
                this.outputs = outputs;
                return this;
            }

            /**
             * requestTime.
             */
            public Builder requestTime(Long requestTime) {
                this.requestTime = requestTime;
                return this;
            }

            /**
             * ruleHitRecords.
             */
            public Builder ruleHitRecords(java.util.List < RuleHitRecords> ruleHitRecords) {
                this.ruleHitRecords = ruleHitRecords;
                return this;
            }

            /**
             * sRequestId.
             */
            public Builder sRequestId(String sRequestId) {
                this.sRequestId = sRequestId;
                return this;
            }

            /**
             * totalCost.
             */
            public Builder totalCost(Long totalCost) {
                this.totalCost = totalCost;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
