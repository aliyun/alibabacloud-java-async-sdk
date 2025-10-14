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
         * DetectionStatistic.
         */
        public Builder detectionStatistic(DetectionStatistic detectionStatistic) {
            this.detectionStatistic = detectionStatistic;
            return this;
        }

        /**
         * RequestId.
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
            private Integer detectionRuleOnlineCount; 
            private Integer detectionRuleTemplateCount; 
            private Integer detectionRuleTestCount; 
            private Integer graphComputeRuleCount; 
            private Integer passthroughRuleCount; 
            private Integer windowRuleCount; 

            private Builder() {
            } 

            private Builder(DetectionStatistic model) {
                this.detectionRuleOnlineCount = model.detectionRuleOnlineCount;
                this.detectionRuleTemplateCount = model.detectionRuleTemplateCount;
                this.detectionRuleTestCount = model.detectionRuleTestCount;
                this.graphComputeRuleCount = model.graphComputeRuleCount;
                this.passthroughRuleCount = model.passthroughRuleCount;
                this.windowRuleCount = model.windowRuleCount;
            } 

            /**
             * DetectionRuleOnlineCount.
             */
            public Builder detectionRuleOnlineCount(Integer detectionRuleOnlineCount) {
                this.detectionRuleOnlineCount = detectionRuleOnlineCount;
                return this;
            }

            /**
             * DetectionRuleTemplateCount.
             */
            public Builder detectionRuleTemplateCount(Integer detectionRuleTemplateCount) {
                this.detectionRuleTemplateCount = detectionRuleTemplateCount;
                return this;
            }

            /**
             * DetectionRuleTestCount.
             */
            public Builder detectionRuleTestCount(Integer detectionRuleTestCount) {
                this.detectionRuleTestCount = detectionRuleTestCount;
                return this;
            }

            /**
             * GraphComputeRuleCount.
             */
            public Builder graphComputeRuleCount(Integer graphComputeRuleCount) {
                this.graphComputeRuleCount = graphComputeRuleCount;
                return this;
            }

            /**
             * PassthroughRuleCount.
             */
            public Builder passthroughRuleCount(Integer passthroughRuleCount) {
                this.passthroughRuleCount = passthroughRuleCount;
                return this;
            }

            /**
             * WindowRuleCount.
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
