// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWhiteListStrategyListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWhiteListStrategyListResponseBody</p>
 */
public class DescribeWhiteListStrategyListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Strategies")
    private java.util.List < Strategies> strategies;

    private DescribeWhiteListStrategyListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.strategies = builder.strategies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWhiteListStrategyListResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return strategies
     */
    public java.util.List < Strategies> getStrategies() {
        return this.strategies;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Strategies> strategies; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the policies.
         */
        public Builder strategies(java.util.List < Strategies> strategies) {
            this.strategies = strategies;
            return this;
        }

        public DescribeWhiteListStrategyListResponseBody build() {
            return new DescribeWhiteListStrategyListResponseBody(this);
        } 

    } 

    public static class Strategies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("StrategyId")
        private Long strategyId;

        @com.aliyun.core.annotation.NameInMap("StrategyName")
        private String strategyName;

        @com.aliyun.core.annotation.NameInMap("StudyTime")
        private Integer studyTime;

        private Strategies(Builder builder) {
            this.status = builder.status;
            this.strategyId = builder.strategyId;
            this.strategyName = builder.strategyName;
            this.studyTime = builder.studyTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Strategies create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return strategyId
         */
        public Long getStrategyId() {
            return this.strategyId;
        }

        /**
         * @return strategyName
         */
        public String getStrategyName() {
            return this.strategyName;
        }

        /**
         * @return studyTime
         */
        public Integer getStudyTime() {
            return this.studyTime;
        }

        public static final class Builder {
            private Integer status; 
            private Long strategyId; 
            private String strategyName; 
            private Integer studyTime; 

            /**
             * The status of the policy. Valid values:
             * <p>
             * 
             * *   **0**: disabled
             * *   **1**: learning
             * *   **2**: paused
             * *   **3**: learning completed
             * *   **4**: enabled
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the policy.
             */
            public Builder strategyId(Long strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            /**
             * The name of the policy.
             */
            public Builder strategyName(String strategyName) {
                this.strategyName = strategyName;
                return this;
            }

            /**
             * The intelligent learning duration. Unit: hour.
             */
            public Builder studyTime(Integer studyTime) {
                this.studyTime = studyTime;
                return this;
            }

            public Strategies build() {
                return new Strategies(this);
            } 

        } 

    }
}
