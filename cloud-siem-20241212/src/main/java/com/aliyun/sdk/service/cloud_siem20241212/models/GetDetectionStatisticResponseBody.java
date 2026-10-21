// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link GetDetectionStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>GetDetectionStatisticResponseBody</p>
 */
public class GetDetectionStatisticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DetectionStatistic")
    private DetectionStatistic detectionStatistic;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDetectionStatisticResponseBody(Builder builder) {
        this.detectionStatistic = builder.detectionStatistic;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDetectionStatisticResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return detectionStatistic
     */
    public DetectionStatistic getDetectionStatistic() {
        return this.detectionStatistic;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DetectionStatistic detectionStatistic; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDetectionStatisticResponseBody model) {
            this.detectionStatistic = model.detectionStatistic;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The count results of detection rules.</p>
         */
        public Builder detectionStatistic(DetectionStatistic detectionStatistic) {
            this.detectionStatistic = detectionStatistic;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6FB890AC-90B2-5EEA-845B-F7C86FB2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDetectionStatisticResponseBody build() {
            return new GetDetectionStatisticResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDetectionStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>GetDetectionStatisticResponseBody</p>
     */
    public static class DetectionStatistic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AiPoweredAggregationRuleCount")
        private Integer aiPoweredAggregationRuleCount;

        @com.aliyun.core.annotation.NameInMap("DetectionRuleOnlineCount")
        private Integer detectionRuleOnlineCount;

        @com.aliyun.core.annotation.NameInMap("DetectionRuleTemplateCount")
        private Integer detectionRuleTemplateCount;

        @com.aliyun.core.annotation.NameInMap("DetectionRuleTestCount")
        private Integer detectionRuleTestCount;

        @com.aliyun.core.annotation.NameInMap("GraphComputeRuleCount")
        private Integer graphComputeRuleCount;

        @com.aliyun.core.annotation.NameInMap("PassthroughRuleCount")
        private Integer passthroughRuleCount;

        @com.aliyun.core.annotation.NameInMap("WindowRuleCount")
        private Integer windowRuleCount;

        private DetectionStatistic(Builder builder) {
            this.aiPoweredAggregationRuleCount = builder.aiPoweredAggregationRuleCount;
            this.detectionRuleOnlineCount = builder.detectionRuleOnlineCount;
            this.detectionRuleTemplateCount = builder.detectionRuleTemplateCount;
            this.detectionRuleTestCount = builder.detectionRuleTestCount;
            this.graphComputeRuleCount = builder.graphComputeRuleCount;
            this.passthroughRuleCount = builder.passthroughRuleCount;
            this.windowRuleCount = builder.windowRuleCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetectionStatistic create() {
            return builder().build();
        }

        /**
         * @return aiPoweredAggregationRuleCount
         */
        public Integer getAiPoweredAggregationRuleCount() {
            return this.aiPoweredAggregationRuleCount;
        }

        /**
         * @return detectionRuleOnlineCount
         */
        public Integer getDetectionRuleOnlineCount() {
            return this.detectionRuleOnlineCount;
        }

        /**
         * @return detectionRuleTemplateCount
         */
        public Integer getDetectionRuleTemplateCount() {
            return this.detectionRuleTemplateCount;
        }

        /**
         * @return detectionRuleTestCount
         */
        public Integer getDetectionRuleTestCount() {
            return this.detectionRuleTestCount;
        }

        /**
         * @return graphComputeRuleCount
         */
        public Integer getGraphComputeRuleCount() {
            return this.graphComputeRuleCount;
        }

        /**
         * @return passthroughRuleCount
         */
        public Integer getPassthroughRuleCount() {
            return this.passthroughRuleCount;
        }

        /**
         * @return windowRuleCount
         */
        public Integer getWindowRuleCount() {
            return this.windowRuleCount;
        }

        public static final class Builder {
            private Integer aiPoweredAggregationRuleCount; 
            private Integer detectionRuleOnlineCount; 
            private Integer detectionRuleTemplateCount; 
            private Integer detectionRuleTestCount; 
            private Integer graphComputeRuleCount; 
            private Integer passthroughRuleCount; 
            private Integer windowRuleCount; 

            private Builder() {
            } 

            private Builder(DetectionStatistic model) {
                this.aiPoweredAggregationRuleCount = model.aiPoweredAggregationRuleCount;
                this.detectionRuleOnlineCount = model.detectionRuleOnlineCount;
                this.detectionRuleTemplateCount = model.detectionRuleTemplateCount;
                this.detectionRuleTestCount = model.detectionRuleTestCount;
                this.graphComputeRuleCount = model.graphComputeRuleCount;
                this.passthroughRuleCount = model.passthroughRuleCount;
                this.windowRuleCount = model.windowRuleCount;
            } 

            /**
             * <p>The number of AI-powered aggregation rules.</p>
             */
            public Builder aiPoweredAggregationRuleCount(Integer aiPoweredAggregationRuleCount) {
                this.aiPoweredAggregationRuleCount = aiPoweredAggregationRuleCount;
                return this;
            }

            /**
             * <p>The number of online rules.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder detectionRuleOnlineCount(Integer detectionRuleOnlineCount) {
                this.detectionRuleOnlineCount = detectionRuleOnlineCount;
                return this;
            }

            /**
             * <p>The number of rule templates.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder detectionRuleTemplateCount(Integer detectionRuleTemplateCount) {
                this.detectionRuleTemplateCount = detectionRuleTemplateCount;
                return this;
            }

            /**
             * <p>The number of test rules.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder detectionRuleTestCount(Integer detectionRuleTestCount) {
                this.detectionRuleTestCount = detectionRuleTestCount;
                return this;
            }

            /**
             * <p>The number of graph computing rules.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder graphComputeRuleCount(Integer graphComputeRuleCount) {
                this.graphComputeRuleCount = graphComputeRuleCount;
                return this;
            }

            /**
             * <p>The number of alert pass-through rules.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder passthroughRuleCount(Integer passthroughRuleCount) {
                this.passthroughRuleCount = passthroughRuleCount;
                return this;
            }

            /**
             * <p>The number of same-type aggregation rules.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder windowRuleCount(Integer windowRuleCount) {
                this.windowRuleCount = windowRuleCount;
                return this;
            }

            public DetectionStatistic build() {
                return new DetectionStatistic(this);
            } 

        } 

    }
}
