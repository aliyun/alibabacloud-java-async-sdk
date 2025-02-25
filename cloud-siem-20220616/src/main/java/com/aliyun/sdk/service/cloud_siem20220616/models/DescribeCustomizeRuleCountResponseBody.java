// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomizeRuleCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomizeRuleCountResponseBody</p>
 */
public class DescribeCustomizeRuleCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeCustomizeRuleCountResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomizeRuleCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeCustomizeRuleCountResponseBody build() {
            return new DescribeCustomizeRuleCountResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AggregationRuleNum")
        private Integer aggregationRuleNum;

        @com.aliyun.core.annotation.NameInMap("CustomizeRuleNum")
        private Integer customizeRuleNum;

        @com.aliyun.core.annotation.NameInMap("ExpertRuleNum")
        private Integer expertRuleNum;

        @com.aliyun.core.annotation.NameInMap("GraphComputingRuleNum")
        private Integer graphComputingRuleNum;

        @com.aliyun.core.annotation.NameInMap("HighRuleNum")
        private Integer highRuleNum;

        @com.aliyun.core.annotation.NameInMap("InUseRuleNum")
        private Integer inUseRuleNum;

        @com.aliyun.core.annotation.NameInMap("LowRuleNum")
        private Integer lowRuleNum;

        @com.aliyun.core.annotation.NameInMap("MediumRuleNum")
        private Integer mediumRuleNum;

        @com.aliyun.core.annotation.NameInMap("PredefinedRuleNum")
        private Integer predefinedRuleNum;

        @com.aliyun.core.annotation.NameInMap("SingleAlertRuleNum")
        private Integer singleAlertRuleNum;

        @com.aliyun.core.annotation.NameInMap("TotalRuleNum")
        private Integer totalRuleNum;

        @com.aliyun.core.annotation.NameInMap("UnEventRuleNum")
        private Integer unEventRuleNum;

        private Data(Builder builder) {
            this.aggregationRuleNum = builder.aggregationRuleNum;
            this.customizeRuleNum = builder.customizeRuleNum;
            this.expertRuleNum = builder.expertRuleNum;
            this.graphComputingRuleNum = builder.graphComputingRuleNum;
            this.highRuleNum = builder.highRuleNum;
            this.inUseRuleNum = builder.inUseRuleNum;
            this.lowRuleNum = builder.lowRuleNum;
            this.mediumRuleNum = builder.mediumRuleNum;
            this.predefinedRuleNum = builder.predefinedRuleNum;
            this.singleAlertRuleNum = builder.singleAlertRuleNum;
            this.totalRuleNum = builder.totalRuleNum;
            this.unEventRuleNum = builder.unEventRuleNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aggregationRuleNum
         */
        public Integer getAggregationRuleNum() {
            return this.aggregationRuleNum;
        }

        /**
         * @return customizeRuleNum
         */
        public Integer getCustomizeRuleNum() {
            return this.customizeRuleNum;
        }

        /**
         * @return expertRuleNum
         */
        public Integer getExpertRuleNum() {
            return this.expertRuleNum;
        }

        /**
         * @return graphComputingRuleNum
         */
        public Integer getGraphComputingRuleNum() {
            return this.graphComputingRuleNum;
        }

        /**
         * @return highRuleNum
         */
        public Integer getHighRuleNum() {
            return this.highRuleNum;
        }

        /**
         * @return inUseRuleNum
         */
        public Integer getInUseRuleNum() {
            return this.inUseRuleNum;
        }

        /**
         * @return lowRuleNum
         */
        public Integer getLowRuleNum() {
            return this.lowRuleNum;
        }

        /**
         * @return mediumRuleNum
         */
        public Integer getMediumRuleNum() {
            return this.mediumRuleNum;
        }

        /**
         * @return predefinedRuleNum
         */
        public Integer getPredefinedRuleNum() {
            return this.predefinedRuleNum;
        }

        /**
         * @return singleAlertRuleNum
         */
        public Integer getSingleAlertRuleNum() {
            return this.singleAlertRuleNum;
        }

        /**
         * @return totalRuleNum
         */
        public Integer getTotalRuleNum() {
            return this.totalRuleNum;
        }

        /**
         * @return unEventRuleNum
         */
        public Integer getUnEventRuleNum() {
            return this.unEventRuleNum;
        }

        public static final class Builder {
            private Integer aggregationRuleNum; 
            private Integer customizeRuleNum; 
            private Integer expertRuleNum; 
            private Integer graphComputingRuleNum; 
            private Integer highRuleNum; 
            private Integer inUseRuleNum; 
            private Integer lowRuleNum; 
            private Integer mediumRuleNum; 
            private Integer predefinedRuleNum; 
            private Integer singleAlertRuleNum; 
            private Integer totalRuleNum; 
            private Integer unEventRuleNum; 

            /**
             * 同类聚合规则数。
             */
            public Builder aggregationRuleNum(Integer aggregationRuleNum) {
                this.aggregationRuleNum = aggregationRuleNum;
                return this;
            }

            /**
             * 自定义规则数。
             */
            public Builder customizeRuleNum(Integer customizeRuleNum) {
                this.customizeRuleNum = customizeRuleNum;
                return this;
            }

            /**
             * 专家规则数。
             */
            public Builder expertRuleNum(Integer expertRuleNum) {
                this.expertRuleNum = expertRuleNum;
                return this;
            }

            /**
             * 图计算规则数。
             */
            public Builder graphComputingRuleNum(Integer graphComputingRuleNum) {
                this.graphComputingRuleNum = graphComputingRuleNum;
                return this;
            }

            /**
             * The number of rules that are used to identify high-risk threats.
             */
            public Builder highRuleNum(Integer highRuleNum) {
                this.highRuleNum = highRuleNum;
                return this;
            }

            /**
             * The total number of rules.
             */
            public Builder inUseRuleNum(Integer inUseRuleNum) {
                this.inUseRuleNum = inUseRuleNum;
                return this;
            }

            /**
             * The number of rules that are used to identify low-risk threats.
             */
            public Builder lowRuleNum(Integer lowRuleNum) {
                this.lowRuleNum = lowRuleNum;
                return this;
            }

            /**
             * The number of rules that are used to identify medium-risk threats.
             */
            public Builder mediumRuleNum(Integer mediumRuleNum) {
                this.mediumRuleNum = mediumRuleNum;
                return this;
            }

            /**
             * 预定义规则数。
             */
            public Builder predefinedRuleNum(Integer predefinedRuleNum) {
                this.predefinedRuleNum = predefinedRuleNum;
                return this;
            }

            /**
             * 告警透传规则数。
             */
            public Builder singleAlertRuleNum(Integer singleAlertRuleNum) {
                this.singleAlertRuleNum = singleAlertRuleNum;
                return this;
            }

            /**
             * 总规则数。
             */
            public Builder totalRuleNum(Integer totalRuleNum) {
                this.totalRuleNum = totalRuleNum;
                return this;
            }

            /**
             * 不产生事件规则数。
             */
            public Builder unEventRuleNum(Integer unEventRuleNum) {
                this.unEventRuleNum = unEventRuleNum;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
