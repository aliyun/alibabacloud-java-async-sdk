// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCircuitBreakerRuleResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateCircuitBreakerRuleResponseBody</p>
 */
public class UpdateCircuitBreakerRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private UpdateCircuitBreakerRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCircuitBreakerRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The response code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The details of the rule.
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
         * Indicates whether the request was successful.
         * <p>
         * 
         * Valid values:
         * 
         * *   true
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     The request was successful.
         * 
         *     <!-- -->
         * 
         * *   false
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     The request failed.
         * 
         *     <!-- -->
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdateCircuitBreakerRuleResponseBody build() {
            return new UpdateCircuitBreakerRuleResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("Enable")
        private Boolean enable;

        @NameInMap("HalfOpenBaseAmountPerStep")
        private Integer halfOpenBaseAmountPerStep;

        @NameInMap("HalfOpenRecoveryStepNum")
        private Integer halfOpenRecoveryStepNum;

        @NameInMap("Id")
        private Long id;

        @NameInMap("MaxAllowedRtMs")
        private Integer maxAllowedRtMs;

        @NameInMap("MinRequestAmount")
        private Integer minRequestAmount;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("Resource")
        private String resource;

        @NameInMap("RetryTimeoutMs")
        private Integer retryTimeoutMs;

        @NameInMap("StatIntervalMs")
        private Integer statIntervalMs;

        @NameInMap("Strategy")
        private Integer strategy;

        @NameInMap("Threshold")
        private Float threshold;

        private Data(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.enable = builder.enable;
            this.halfOpenBaseAmountPerStep = builder.halfOpenBaseAmountPerStep;
            this.halfOpenRecoveryStepNum = builder.halfOpenRecoveryStepNum;
            this.id = builder.id;
            this.maxAllowedRtMs = builder.maxAllowedRtMs;
            this.minRequestAmount = builder.minRequestAmount;
            this.namespace = builder.namespace;
            this.resource = builder.resource;
            this.retryTimeoutMs = builder.retryTimeoutMs;
            this.statIntervalMs = builder.statIntervalMs;
            this.strategy = builder.strategy;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return halfOpenBaseAmountPerStep
         */
        public Integer getHalfOpenBaseAmountPerStep() {
            return this.halfOpenBaseAmountPerStep;
        }

        /**
         * @return halfOpenRecoveryStepNum
         */
        public Integer getHalfOpenRecoveryStepNum() {
            return this.halfOpenRecoveryStepNum;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return maxAllowedRtMs
         */
        public Integer getMaxAllowedRtMs() {
            return this.maxAllowedRtMs;
        }

        /**
         * @return minRequestAmount
         */
        public Integer getMinRequestAmount() {
            return this.minRequestAmount;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        /**
         * @return retryTimeoutMs
         */
        public Integer getRetryTimeoutMs() {
            return this.retryTimeoutMs;
        }

        /**
         * @return statIntervalMs
         */
        public Integer getStatIntervalMs() {
            return this.statIntervalMs;
        }

        /**
         * @return strategy
         */
        public Integer getStrategy() {
            return this.strategy;
        }

        /**
         * @return threshold
         */
        public Float getThreshold() {
            return this.threshold;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private Boolean enable; 
            private Integer halfOpenBaseAmountPerStep; 
            private Integer halfOpenRecoveryStepNum; 
            private Long id; 
            private Integer maxAllowedRtMs; 
            private Integer minRequestAmount; 
            private String namespace; 
            private String resource; 
            private Integer retryTimeoutMs; 
            private Integer statIntervalMs; 
            private Integer strategy; 
            private Float threshold; 

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The name of the application.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * Indicates whether the rule is enabled.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * The minimum number of requests that can be passed in each step after circuit breaking recovers.
             */
            public Builder halfOpenBaseAmountPerStep(Integer halfOpenBaseAmountPerStep) {
                this.halfOpenBaseAmountPerStep = halfOpenBaseAmountPerStep;
                return this;
            }

            /**
             * The number of circuit breaking recovery steps.
             */
            public Builder halfOpenRecoveryStepNum(Integer halfOpenRecoveryStepNum) {
                this.halfOpenRecoveryStepNum = halfOpenRecoveryStepNum;
                return this;
            }

            /**
             * The ID of the rule.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The maximum RT. Unit: milliseconds. If the RT of a request is greater than the value of this parameter, a slow call is counted. If you set Strategy to 0, you must specify this parameter.
             */
            public Builder maxAllowedRtMs(Integer maxAllowedRtMs) {
                this.maxAllowedRtMs = maxAllowedRtMs;
                return this;
            }

            /**
             * The minimum number of requests to trigger circuit breaking. If the number of requests in the current time window is less than the value of this parameter, circuit breaking is not triggered even if the circuit breaking rule is met.
             */
            public Builder minRequestAmount(Integer minRequestAmount) {
                this.minRequestAmount = minRequestAmount;
                return this;
            }

            /**
             * The microservice namespace to which the application belongs.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The name of the interface to which the rule is applicable. The interface name must be the same as the name on the interface details page in the console.
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * The period in which circuit breaking is implemented. Unit: milliseconds. If circuit breaking is implemented on the requests for the route, the calls to all the requests for the route fail in the configured circuit breaking period.
             */
            public Builder retryTimeoutMs(Integer retryTimeoutMs) {
                this.retryTimeoutMs = retryTimeoutMs;
                return this;
            }

            /**
             * The length of the time window. Unit: milliseconds. The valid range is from 1 second to 120 minutes.
             */
            public Builder statIntervalMs(Integer statIntervalMs) {
                this.statIntervalMs = statIntervalMs;
                return this;
            }

            /**
             * The threshold type.
             * <p>
             * 
             * Valid values:
             * 
             * *   0
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     slow call proportion
             * 
             *     <!-- -->
             * 
             * *   1
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     abnormal proportion
             * 
             *     <!-- -->
             */
            public Builder strategy(Integer strategy) {
                this.strategy = strategy;
                return this;
            }

            /**
             * A percentage threshold for triggering circuit breaking. Valid values: 0-1. These values represent 0% to 100%.
             */
            public Builder threshold(Float threshold) {
                this.threshold = threshold;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
