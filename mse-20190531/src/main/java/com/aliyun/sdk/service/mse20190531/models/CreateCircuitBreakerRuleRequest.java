// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link CreateCircuitBreakerRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateCircuitBreakerRuleRequest</p>
 */
public class CreateCircuitBreakerRuleRequest extends Request {
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
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resource")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private Integer resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetryTimeoutMs")
    private Integer retryTimeoutMs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatIntervalMs")
    private Integer statIntervalMs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Strategy")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer strategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Threshold")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>hkhon1po62@c3df23522bXXXXX</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The application name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>spring-cloud-a</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>Specifies whether to enable the rule.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>false</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * <p>The minimum number of requests that can be passed in each step after circuit breaking recovers. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder halfOpenBaseAmountPerStep(Integer halfOpenBaseAmountPerStep) {
            this.putQueryParameter("HalfOpenBaseAmountPerStep", halfOpenBaseAmountPerStep);
            this.halfOpenBaseAmountPerStep = halfOpenBaseAmountPerStep;
            return this;
        }

        /**
         * <p>The number of circuit breaking recovery steps. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder halfOpenRecoveryStepNum(Integer halfOpenRecoveryStepNum) {
            this.putQueryParameter("HalfOpenRecoveryStepNum", halfOpenRecoveryStepNum);
            this.halfOpenRecoveryStepNum = halfOpenRecoveryStepNum;
            return this;
        }

        /**
         * <p>The maximum response time (RT). Unit: milliseconds. If the RT of a request is greater than the value of this parameter, a slow call is counted. If you set Strategy to 0, you must specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder maxAllowedRtMs(Integer maxAllowedRtMs) {
            this.putQueryParameter("MaxAllowedRtMs", maxAllowedRtMs);
            this.maxAllowedRtMs = maxAllowedRtMs;
            return this;
        }

        /**
         * <p>The minimum number of requests to trigger circuit breaking. If the number of requests in the current time window is less than the value of this parameter, circuit breaking is not triggered even if the circuit breaking rule is met. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder minRequestAmount(Integer minRequestAmount) {
            this.putQueryParameter("MinRequestAmount", minRequestAmount);
            this.minRequestAmount = minRequestAmount;
            return this;
        }

        /**
         * <p>The microservice namespace to which the application belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The region in which the instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the interface to which the rule applies. The interface name must be the same as the name on the interface details page in the console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/a</p>
         */
        public Builder resource(String resource) {
            this.putQueryParameter("Resource", resource);
            this.resource = resource;
            return this;
        }

        /**
         * <p>The resource type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>0: custom interface</li>
         * <li>1: web</li>
         * <li>2: RPC</li>
         * <li>3: route</li>
         * <li>4: SQL</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder resourceType(Integer resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The period in which circuit breaking is implemented. Unit: milliseconds. If circuit breaking is implemented on the requests for the route, the calls to all the requests for the route fail in the configured circuit breaking period. The value must be an integral multiple of 1,000. Default value: 10000. This value indicates 10 seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder retryTimeoutMs(Integer retryTimeoutMs) {
            this.putQueryParameter("RetryTimeoutMs", retryTimeoutMs);
            this.retryTimeoutMs = retryTimeoutMs;
            return this;
        }

        /**
         * <p>The length of the time window. Unit: milliseconds. The valid range is from 1 second to 120 minutes. The default value is 20000. This value indicates 20 seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>20000</p>
         */
        public Builder statIntervalMs(Integer statIntervalMs) {
            this.putQueryParameter("StatIntervalMs", statIntervalMs);
            this.statIntervalMs = statIntervalMs;
            return this;
        }

        /**
         * <p>The threshold type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>0</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>slow call proportion</p>
         * <!-- -->
         * </li>
         * <li><p>1</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>abnormal proportion</p>
         * <!-- --></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder strategy(Integer strategy) {
            this.putQueryParameter("Strategy", strategy);
            this.strategy = strategy;
            return this;
        }

        /**
         * <p>A percentage threshold for triggering circuit breaking. Valid values: 0-1. These values represent 0% to 100%.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.8</p>
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
