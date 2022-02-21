// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScaleStrategysResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScaleStrategysResponseBody</p>
 */
public class DescribeScaleStrategysResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScaleStrategys")
    private java.util.List < ScaleStrategys> scaleStrategys;

    private DescribeScaleStrategysResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.scaleStrategys = builder.scaleStrategys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScaleStrategysResponseBody create() {
        return builder().build();
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

    /**
     * @return scaleStrategys
     */
    public java.util.List < ScaleStrategys> getScaleStrategys() {
        return this.scaleStrategys;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List < ScaleStrategys> scaleStrategys; 

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ScaleStrategys.
         */
        public Builder scaleStrategys(java.util.List < ScaleStrategys> scaleStrategys) {
            this.scaleStrategys = scaleStrategys;
            return this;
        }

        public DescribeScaleStrategysResponseBody build() {
            return new DescribeScaleStrategysResponseBody(this);
        } 

    } 

    public static class ScaleStrategys extends TeaModel {
        @NameInMap("MaxAvailableDesktopsCount")
        private Integer maxAvailableDesktopsCount;

        @NameInMap("MaxDesktopsCount")
        private Integer maxDesktopsCount;

        @NameInMap("MinAvailableDesktopsCount")
        private Integer minAvailableDesktopsCount;

        @NameInMap("MinDesktopsCount")
        private Integer minDesktopsCount;

        @NameInMap("ScaleStep")
        private Integer scaleStep;

        @NameInMap("ScaleStrategyId")
        private String scaleStrategyId;

        @NameInMap("ScaleStrategyName")
        private String scaleStrategyName;

        @NameInMap("ScaleStrategyType")
        private String scaleStrategyType;

        private ScaleStrategys(Builder builder) {
            this.maxAvailableDesktopsCount = builder.maxAvailableDesktopsCount;
            this.maxDesktopsCount = builder.maxDesktopsCount;
            this.minAvailableDesktopsCount = builder.minAvailableDesktopsCount;
            this.minDesktopsCount = builder.minDesktopsCount;
            this.scaleStep = builder.scaleStep;
            this.scaleStrategyId = builder.scaleStrategyId;
            this.scaleStrategyName = builder.scaleStrategyName;
            this.scaleStrategyType = builder.scaleStrategyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScaleStrategys create() {
            return builder().build();
        }

        /**
         * @return maxAvailableDesktopsCount
         */
        public Integer getMaxAvailableDesktopsCount() {
            return this.maxAvailableDesktopsCount;
        }

        /**
         * @return maxDesktopsCount
         */
        public Integer getMaxDesktopsCount() {
            return this.maxDesktopsCount;
        }

        /**
         * @return minAvailableDesktopsCount
         */
        public Integer getMinAvailableDesktopsCount() {
            return this.minAvailableDesktopsCount;
        }

        /**
         * @return minDesktopsCount
         */
        public Integer getMinDesktopsCount() {
            return this.minDesktopsCount;
        }

        /**
         * @return scaleStep
         */
        public Integer getScaleStep() {
            return this.scaleStep;
        }

        /**
         * @return scaleStrategyId
         */
        public String getScaleStrategyId() {
            return this.scaleStrategyId;
        }

        /**
         * @return scaleStrategyName
         */
        public String getScaleStrategyName() {
            return this.scaleStrategyName;
        }

        /**
         * @return scaleStrategyType
         */
        public String getScaleStrategyType() {
            return this.scaleStrategyType;
        }

        public static final class Builder {
            private Integer maxAvailableDesktopsCount; 
            private Integer maxDesktopsCount; 
            private Integer minAvailableDesktopsCount; 
            private Integer minDesktopsCount; 
            private Integer scaleStep; 
            private String scaleStrategyId; 
            private String scaleStrategyName; 
            private String scaleStrategyType; 

            /**
             * MaxAvailableDesktopsCount.
             */
            public Builder maxAvailableDesktopsCount(Integer maxAvailableDesktopsCount) {
                this.maxAvailableDesktopsCount = maxAvailableDesktopsCount;
                return this;
            }

            /**
             * MaxDesktopsCount.
             */
            public Builder maxDesktopsCount(Integer maxDesktopsCount) {
                this.maxDesktopsCount = maxDesktopsCount;
                return this;
            }

            /**
             * MinAvailableDesktopsCount.
             */
            public Builder minAvailableDesktopsCount(Integer minAvailableDesktopsCount) {
                this.minAvailableDesktopsCount = minAvailableDesktopsCount;
                return this;
            }

            /**
             * MinDesktopsCount.
             */
            public Builder minDesktopsCount(Integer minDesktopsCount) {
                this.minDesktopsCount = minDesktopsCount;
                return this;
            }

            /**
             * ScaleStep.
             */
            public Builder scaleStep(Integer scaleStep) {
                this.scaleStep = scaleStep;
                return this;
            }

            /**
             * ScaleStrategyId.
             */
            public Builder scaleStrategyId(String scaleStrategyId) {
                this.scaleStrategyId = scaleStrategyId;
                return this;
            }

            /**
             * ScaleStrategyName.
             */
            public Builder scaleStrategyName(String scaleStrategyName) {
                this.scaleStrategyName = scaleStrategyName;
                return this;
            }

            /**
             * ScaleStrategyType.
             */
            public Builder scaleStrategyType(String scaleStrategyType) {
                this.scaleStrategyType = scaleStrategyType;
                return this;
            }

            public ScaleStrategys build() {
                return new ScaleStrategys(this);
            } 

        } 

    }
}
