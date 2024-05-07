// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCircuitBreakerRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateCircuitBreakerRuleRequest</p>
 */
public class UpdateCircuitBreakerRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HalfOpenBaseAmountPerStep")
    private Integer halfOpenBaseAmountPerStep;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HalfOpenRecoveryStepNum")
    private Integer halfOpenRecoveryStepNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxAllowedRtMs")
    private Integer maxAllowedRtMs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinRequestAmount")
    private Integer minRequestAmount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetryTimeoutMs")
    private Integer retryTimeoutMs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatIntervalMs")
    private Integer statIntervalMs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Strategy")
    private Integer strategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Threshold")
    private Float threshold;

    private UpdateCircuitBreakerRuleRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.enable = builder.enable;
        this.halfOpenBaseAmountPerStep = builder.halfOpenBaseAmountPerStep;
        this.halfOpenRecoveryStepNum = builder.halfOpenRecoveryStepNum;
        this.maxAllowedRtMs = builder.maxAllowedRtMs;
        this.minRequestAmount = builder.minRequestAmount;
        this.namespace = builder.namespace;
        this.retryTimeoutMs = builder.retryTimeoutMs;
        this.ruleId = builder.ruleId;
        this.statIntervalMs = builder.statIntervalMs;
        this.strategy = builder.strategy;
        this.threshold = builder.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCircuitBreakerRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
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
     * @return retryTimeoutMs
     */
    public Integer getRetryTimeoutMs() {
        return this.retryTimeoutMs;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
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

    public static final class Builder extends Request.Builder<UpdateCircuitBreakerRuleRequest, Builder> {
        private String acceptLanguage; 
        private String appId; 
        private String appName; 
        private Boolean enable; 
        private Integer halfOpenBaseAmountPerStep; 
        private Integer halfOpenRecoveryStepNum; 
        private Integer maxAllowedRtMs; 
        private Integer minRequestAmount; 
        private String namespace; 
        private Integer retryTimeoutMs; 
        private Long ruleId; 
        private Integer statIntervalMs; 
        private Integer strategy; 
        private Float threshold; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCircuitBreakerRuleRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.appId = request.appId;
            this.appName = request.appName;
            this.enable = request.enable;
            this.halfOpenBaseAmountPerStep = request.halfOpenBaseAmountPerStep;
            this.halfOpenRecoveryStepNum = request.halfOpenRecoveryStepNum;
            this.maxAllowedRtMs = request.maxAllowedRtMs;
            this.minRequestAmount = request.minRequestAmount;
            this.namespace = request.namespace;
            this.retryTimeoutMs = request.retryTimeoutMs;
            this.ruleId = request.ruleId;
            this.statIntervalMs = request.statIntervalMs;
            this.strategy = request.strategy;
            this.threshold = request.threshold;
        } 

        /**
         * The language of the response. Valid values: zh-CN and en-US. Default value: zh-CN. The value zh-CN indicates Chinese, and the value en-US indicates English.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * The ID of the application.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The name of the application.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * Specifies whether to enable the rule.
         * <p>
         * 
         * Valid values:
         * 
         * *   true
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   false
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * The minimum number of requests that can be passed in each step after circuit breaking recovers. Default value: 1.
         */
        public Builder halfOpenBaseAmountPerStep(Integer halfOpenBaseAmountPerStep) {
            this.putQueryParameter("HalfOpenBaseAmountPerStep", halfOpenBaseAmountPerStep);
            this.halfOpenBaseAmountPerStep = halfOpenBaseAmountPerStep;
            return this;
        }

        /**
         * The number of circuit breaking recovery steps. Default value: 1.
         */
        public Builder halfOpenRecoveryStepNum(Integer halfOpenRecoveryStepNum) {
            this.putQueryParameter("HalfOpenRecoveryStepNum", halfOpenRecoveryStepNum);
            this.halfOpenRecoveryStepNum = halfOpenRecoveryStepNum;
            return this;
        }

        /**
         * The maximum response time (RT). Unit: milliseconds. If the RT of a request is greater than the value of this parameter, a slow call is counted. If you set Strategy to 0, you must specify this parameter.
         */
        public Builder maxAllowedRtMs(Integer maxAllowedRtMs) {
            this.putQueryParameter("MaxAllowedRtMs", maxAllowedRtMs);
            this.maxAllowedRtMs = maxAllowedRtMs;
            return this;
        }

        /**
         * The minimum number of requests to trigger circuit breaking. If the number of requests in the current time window is less than the value of this parameter, circuit breaking is not triggered even if the circuit breaking rule is met. Default value: 10.
         */
        public Builder minRequestAmount(Integer minRequestAmount) {
            this.putQueryParameter("MinRequestAmount", minRequestAmount);
            this.minRequestAmount = minRequestAmount;
            return this;
        }

        /**
         * The microservice namespace to which the application belongs.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The period in which circuit breaking is implemented. Unit: milliseconds. If circuit breaking is implemented on the requests for the route, the calls to all the requests for the route fail in the configured circuit breaking period. The value must be an integral multiple of 1,000. Default value: 10000. This value indicates 10 seconds.
         */
        public Builder retryTimeoutMs(Integer retryTimeoutMs) {
            this.putQueryParameter("RetryTimeoutMs", retryTimeoutMs);
            this.retryTimeoutMs = retryTimeoutMs;
            return this;
        }

        /**
         * The rule ID.
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * The length of the time window. Unit: milliseconds. The valid range is from 1 second to 120 minutes. The default value is 20000. This value indicates 20 seconds.
         */
        public Builder statIntervalMs(Integer statIntervalMs) {
            this.putQueryParameter("StatIntervalMs", statIntervalMs);
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
            this.putQueryParameter("Strategy", strategy);
            this.strategy = strategy;
            return this;
        }

        /**
         * A percentage threshold for triggering circuit breaking. Valid values: 0-1. These values represent 0% to 100%.
         */
        public Builder threshold(Float threshold) {
            this.putQueryParameter("Threshold", threshold);
            this.threshold = threshold;
            return this;
        }

        @Override
        public UpdateCircuitBreakerRuleRequest build() {
            return new UpdateCircuitBreakerRuleRequest(this);
        } 

    } 

}
