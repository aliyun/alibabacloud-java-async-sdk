// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeCustomizeRuleCountResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeCustomizeRuleCountResponseBody build() {
            return new DescribeCustomizeRuleCountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCustomizeRuleCountResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomizeRuleCountResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.aggregationRuleNum = model.aggregationRuleNum;
                this.customizeRuleNum = model.customizeRuleNum;
                this.expertRuleNum = model.expertRuleNum;
                this.graphComputingRuleNum = model.graphComputingRuleNum;
                this.highRuleNum = model.highRuleNum;
                this.inUseRuleNum = model.inUseRuleNum;
                this.lowRuleNum = model.lowRuleNum;
                this.mediumRuleNum = model.mediumRuleNum;
                this.predefinedRuleNum = model.predefinedRuleNum;
                this.singleAlertRuleNum = model.singleAlertRuleNum;
                this.totalRuleNum = model.totalRuleNum;
                this.unEventRuleNum = model.unEventRuleNum;
            } 

            /**
             * <p>同类聚合规则数。</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder aggregationRuleNum(Integer aggregationRuleNum) {
                this.aggregationRuleNum = aggregationRuleNum;
                return this;
            }

            /**
             * <p>自定义规则数。</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder customizeRuleNum(Integer customizeRuleNum) {
                this.customizeRuleNum = customizeRuleNum;
                return this;
            }

            /**
             * <p>专家规则数。</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder expertRuleNum(Integer expertRuleNum) {
                this.expertRuleNum = expertRuleNum;
                return this;
            }

            /**
             * <p>图计算规则数。</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder graphComputingRuleNum(Integer graphComputingRuleNum) {
                this.graphComputingRuleNum = graphComputingRuleNum;
                return this;
            }

            /**
             * <p>The number of rules that are used to identify high-risk threats.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder highRuleNum(Integer highRuleNum) {
                this.highRuleNum = highRuleNum;
                return this;
            }

            /**
             * <p>The total number of rules.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder inUseRuleNum(Integer inUseRuleNum) {
                this.inUseRuleNum = inUseRuleNum;
                return this;
            }

            /**
             * <p>The number of rules that are used to identify low-risk threats.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder lowRuleNum(Integer lowRuleNum) {
                this.lowRuleNum = lowRuleNum;
                return this;
            }

            /**
             * <p>The number of rules that are used to identify medium-risk threats.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder mediumRuleNum(Integer mediumRuleNum) {
                this.mediumRuleNum = mediumRuleNum;
                return this;
            }

            /**
             * <p>预定义规则数。</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder predefinedRuleNum(Integer predefinedRuleNum) {
                this.predefinedRuleNum = predefinedRuleNum;
                return this;
            }

            /**
             * <p>告警透传规则数。</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder singleAlertRuleNum(Integer singleAlertRuleNum) {
                this.singleAlertRuleNum = singleAlertRuleNum;
                return this;
            }

            /**
             * <p>总规则数。</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalRuleNum(Integer totalRuleNum) {
                this.totalRuleNum = totalRuleNum;
                return this;
            }

            /**
             * <p>不产生事件规则数。</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
