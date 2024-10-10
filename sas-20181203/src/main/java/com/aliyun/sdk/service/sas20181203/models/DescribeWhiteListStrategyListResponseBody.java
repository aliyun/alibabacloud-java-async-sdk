// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>571B2642-BF51-5BDD-906B-D2340DB9****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the policies.</p>
         */
        public Builder strategies(java.util.List < Strategies> strategies) {
            this.strategies = strategies;
            return this;
        }

        public DescribeWhiteListStrategyListResponseBody build() {
            return new DescribeWhiteListStrategyListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeWhiteListStrategyListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWhiteListStrategyListResponseBody</p>
     */
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
             * <p>The status of the policy. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: disabled</li>
             * <li><strong>1</strong>: learning</li>
             * <li><strong>2</strong>: paused</li>
             * <li><strong>3</strong>: learning completed</li>
             * <li><strong>4</strong>: enabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>8795555</p>
             */
            public Builder strategyId(Long strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            /**
             * <p>The name of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder strategyName(String strategyName) {
                this.strategyName = strategyName;
                return this;
            }

            /**
             * <p>The intelligent learning duration. Unit: hour.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
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
