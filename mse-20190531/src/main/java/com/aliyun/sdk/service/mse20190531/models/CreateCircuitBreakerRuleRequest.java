// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCircuitBreakerRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateCircuitBreakerRuleRequest</p>
 */
public class CreateCircuitBreakerRuleRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("Enable")
    @Validation(required = true)
    private Boolean enable;

    @Query
    @NameInMap("HalfOpenBaseAmountPerStep")
    private Integer halfOpenBaseAmountPerStep;

    @Query
    @NameInMap("HalfOpenRecoveryStepNum")
    private Integer halfOpenRecoveryStepNum;

    @Query
    @NameInMap("MaxAllowedRtMs")
    private Integer maxAllowedRtMs;

    @Query
    @NameInMap("MinRequestAmount")
    private Integer minRequestAmount;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Resource")
    @Validation(required = true)
    private String resource;

    @Query
    @NameInMap("ResourceType")
    private Integer resourceType;

    @Query
    @NameInMap("RetryTimeoutMs")
    private Integer retryTimeoutMs;

    @Query
    @NameInMap("StatIntervalMs")
    private Integer statIntervalMs;

    @Query
    @NameInMap("Strategy")
    @Validation(required = true)
    private Integer strategy;

    @Query
    @NameInMap("Threshold")
    @Validation(required = true)
    private Float threshold;

    private CreateCircuitBreakerRuleRequest(Builder builder) {
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
        this.regionId = builder.regionId;
        this.resource = builder.resource;
        this.resourceType = builder.resourceType;
        this.retryTimeoutMs = builder.retryTimeoutMs;
        this.statIntervalMs = builder.statIntervalMs;
        this.strategy = builder.strategy;
        this.threshold = builder.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCircuitBreakerRuleRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resource
     */
    public String getResource() {
        return this.resource;
    }

    /**
     * @return resourceType
     */
    public Integer getResourceType() {
        return this.resourceType;
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

    public static final class Builder extends Request.Builder<CreateCircuitBreakerRuleRequest, Builder> {
        private String acceptLanguage; 
        private String appId; 
        private String appName; 
        private Boolean enable; 
        private Integer halfOpenBaseAmountPerStep; 
        private Integer halfOpenRecoveryStepNum; 
        private Integer maxAllowedRtMs; 
        private Integer minRequestAmount; 
        private String namespace; 
        private String regionId; 
        private String resource; 
        private Integer resourceType; 
        private Integer retryTimeoutMs; 
        private Integer statIntervalMs; 
        private Integer strategy; 
        private Float threshold; 

        private Builder() {
            super();
        } 

        private Builder(CreateCircuitBreakerRuleRequest request) {
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
            this.regionId = request.regionId;
            this.resource = request.resource;
            this.resourceType = request.resourceType;
            this.retryTimeoutMs = request.retryTimeoutMs;
            this.statIntervalMs = request.statIntervalMs;
            this.strategy = request.strategy;
            this.threshold = request.threshold;
        } 

        /**
         * The language of the response. Valid values:
         * <p>
         * 
         * *   zh: Chinese
         * *   en: English
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
         * The application name.
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
         * The region in which the instance resides.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The name of the interface to which the rule applies. The interface name must be the same as the name on the interface details page in the console.
         */
        public Builder resource(String resource) {
            this.putQueryParameter("Resource", resource);
            this.resource = resource;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(Integer resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
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
        public CreateCircuitBreakerRuleRequest build() {
            return new CreateCircuitBreakerRuleRequest(this);
        } 

    } 

}
