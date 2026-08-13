// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link GetDataAgentTaskModelUsageResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataAgentTaskModelUsageResponseBody</p>
 */
public class GetDataAgentTaskModelUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private GetDataAgentTaskModelUsageResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataAgentTaskModelUsageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(GetDataAgentTaskModelUsageResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public GetDataAgentTaskModelUsageResponseBody build() {
            return new GetDataAgentTaskModelUsageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataAgentTaskModelUsageResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataAgentTaskModelUsageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccelerationRatio")
        private Double accelerationRatio;

        @com.aliyun.core.annotation.NameInMap("RateLimitedSessionCount")
        private Long rateLimitedSessionCount;

        @com.aliyun.core.annotation.NameInMap("TotalLlmWaitDuration")
        private Double totalLlmWaitDuration;

        @com.aliyun.core.annotation.NameInMap("TotalSessionCount")
        private Long totalSessionCount;

        @com.aliyun.core.annotation.NameInMap("peakTpm")
        private Long peakTpm;

        @com.aliyun.core.annotation.NameInMap("totalCallCount")
        private Long totalCallCount;

        @com.aliyun.core.annotation.NameInMap("totalTokenConsumed")
        private Long totalTokenConsumed;

        @com.aliyun.core.annotation.NameInMap("usedModels")
        private Long usedModels;

        private Data(Builder builder) {
            this.accelerationRatio = builder.accelerationRatio;
            this.rateLimitedSessionCount = builder.rateLimitedSessionCount;
            this.totalLlmWaitDuration = builder.totalLlmWaitDuration;
            this.totalSessionCount = builder.totalSessionCount;
            this.peakTpm = builder.peakTpm;
            this.totalCallCount = builder.totalCallCount;
            this.totalTokenConsumed = builder.totalTokenConsumed;
            this.usedModels = builder.usedModels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accelerationRatio
         */
        public Double getAccelerationRatio() {
            return this.accelerationRatio;
        }

        /**
         * @return rateLimitedSessionCount
         */
        public Long getRateLimitedSessionCount() {
            return this.rateLimitedSessionCount;
        }

        /**
         * @return totalLlmWaitDuration
         */
        public Double getTotalLlmWaitDuration() {
            return this.totalLlmWaitDuration;
        }

        /**
         * @return totalSessionCount
         */
        public Long getTotalSessionCount() {
            return this.totalSessionCount;
        }

        /**
         * @return peakTpm
         */
        public Long getPeakTpm() {
            return this.peakTpm;
        }

        /**
         * @return totalCallCount
         */
        public Long getTotalCallCount() {
            return this.totalCallCount;
        }

        /**
         * @return totalTokenConsumed
         */
        public Long getTotalTokenConsumed() {
            return this.totalTokenConsumed;
        }

        /**
         * @return usedModels
         */
        public Long getUsedModels() {
            return this.usedModels;
        }

        public static final class Builder {
            private Double accelerationRatio; 
            private Long rateLimitedSessionCount; 
            private Double totalLlmWaitDuration; 
            private Long totalSessionCount; 
            private Long peakTpm; 
            private Long totalCallCount; 
            private Long totalTokenConsumed; 
            private Long usedModels; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accelerationRatio = model.accelerationRatio;
                this.rateLimitedSessionCount = model.rateLimitedSessionCount;
                this.totalLlmWaitDuration = model.totalLlmWaitDuration;
                this.totalSessionCount = model.totalSessionCount;
                this.peakTpm = model.peakTpm;
                this.totalCallCount = model.totalCallCount;
                this.totalTokenConsumed = model.totalTokenConsumed;
                this.usedModels = model.usedModels;
            } 

            /**
             * AccelerationRatio.
             */
            public Builder accelerationRatio(Double accelerationRatio) {
                this.accelerationRatio = accelerationRatio;
                return this;
            }

            /**
             * RateLimitedSessionCount.
             */
            public Builder rateLimitedSessionCount(Long rateLimitedSessionCount) {
                this.rateLimitedSessionCount = rateLimitedSessionCount;
                return this;
            }

            /**
             * TotalLlmWaitDuration.
             */
            public Builder totalLlmWaitDuration(Double totalLlmWaitDuration) {
                this.totalLlmWaitDuration = totalLlmWaitDuration;
                return this;
            }

            /**
             * TotalSessionCount.
             */
            public Builder totalSessionCount(Long totalSessionCount) {
                this.totalSessionCount = totalSessionCount;
                return this;
            }

            /**
             * peakTpm.
             */
            public Builder peakTpm(Long peakTpm) {
                this.peakTpm = peakTpm;
                return this;
            }

            /**
             * totalCallCount.
             */
            public Builder totalCallCount(Long totalCallCount) {
                this.totalCallCount = totalCallCount;
                return this;
            }

            /**
             * totalTokenConsumed.
             */
            public Builder totalTokenConsumed(Long totalTokenConsumed) {
                this.totalTokenConsumed = totalTokenConsumed;
                return this;
            }

            /**
             * usedModels.
             */
            public Builder usedModels(Long usedModels) {
                this.usedModels = usedModels;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
