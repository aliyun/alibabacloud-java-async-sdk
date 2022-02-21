// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDegradeRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateDegradeRuleRequest</p>
 */
public class CreateDegradeRuleRequest extends Request {
    @Query
    @NameInMap("AhasRegionId")
    private String ahasRegionId;

    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("Enable")
    private Boolean enable;

    @Query
    @NameInMap("HalfOpenBaseAmountPerStep")
    private Integer halfOpenBaseAmountPerStep;

    @Query
    @NameInMap("HalfOpenRecoveryStepNum")
    private Integer halfOpenRecoveryStepNum;

    @Query
    @NameInMap("MinRequestAmount")
    private Integer minRequestAmount;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("RecoveryTimeoutMs")
    @Validation(required = true)
    private Integer recoveryTimeoutMs;

    @Query
    @NameInMap("Resource")
    @Validation(required = true)
    private String resource;

    @Query
    @NameInMap("SlowRtMs")
    private Integer slowRtMs;

    @Query
    @NameInMap("StatDurationMs")
    private Integer statDurationMs;

    @Query
    @NameInMap("Strategy")
    @Validation(required = true)
    private Integer strategy;

    @Query
    @NameInMap("Threshold")
    @Validation(required = true)
    private Float threshold;

    private CreateDegradeRuleRequest(Builder builder) {
        super(builder);
        this.ahasRegionId = builder.ahasRegionId;
        this.appName = builder.appName;
        this.enable = builder.enable;
        this.halfOpenBaseAmountPerStep = builder.halfOpenBaseAmountPerStep;
        this.halfOpenRecoveryStepNum = builder.halfOpenRecoveryStepNum;
        this.minRequestAmount = builder.minRequestAmount;
        this.namespace = builder.namespace;
        this.recoveryTimeoutMs = builder.recoveryTimeoutMs;
        this.resource = builder.resource;
        this.slowRtMs = builder.slowRtMs;
        this.statDurationMs = builder.statDurationMs;
        this.strategy = builder.strategy;
        this.threshold = builder.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDegradeRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ahasRegionId
     */
    public String getAhasRegionId() {
        return this.ahasRegionId;
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
     * @return recoveryTimeoutMs
     */
    public Integer getRecoveryTimeoutMs() {
        return this.recoveryTimeoutMs;
    }

    /**
     * @return resource
     */
    public String getResource() {
        return this.resource;
    }

    /**
     * @return slowRtMs
     */
    public Integer getSlowRtMs() {
        return this.slowRtMs;
    }

    /**
     * @return statDurationMs
     */
    public Integer getStatDurationMs() {
        return this.statDurationMs;
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

    public static final class Builder extends Request.Builder<CreateDegradeRuleRequest, Builder> {
        private String ahasRegionId; 
        private String appName; 
        private Boolean enable; 
        private Integer halfOpenBaseAmountPerStep; 
        private Integer halfOpenRecoveryStepNum; 
        private Integer minRequestAmount; 
        private String namespace; 
        private Integer recoveryTimeoutMs; 
        private String resource; 
        private Integer slowRtMs; 
        private Integer statDurationMs; 
        private Integer strategy; 
        private Float threshold; 

        private Builder() {
            super();
        } 

        private Builder(CreateDegradeRuleRequest response) {
            super(response);
            this.ahasRegionId = response.ahasRegionId;
            this.appName = response.appName;
            this.enable = response.enable;
            this.halfOpenBaseAmountPerStep = response.halfOpenBaseAmountPerStep;
            this.halfOpenRecoveryStepNum = response.halfOpenRecoveryStepNum;
            this.minRequestAmount = response.minRequestAmount;
            this.namespace = response.namespace;
            this.recoveryTimeoutMs = response.recoveryTimeoutMs;
            this.resource = response.resource;
            this.slowRtMs = response.slowRtMs;
            this.statDurationMs = response.statDurationMs;
            this.strategy = response.strategy;
            this.threshold = response.threshold;
        } 

        /**
         * AhasRegionId.
         */
        public Builder ahasRegionId(String ahasRegionId) {
            this.putQueryParameter("AhasRegionId", ahasRegionId);
            this.ahasRegionId = ahasRegionId;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * Enable.
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * HalfOpenBaseAmountPerStep.
         */
        public Builder halfOpenBaseAmountPerStep(Integer halfOpenBaseAmountPerStep) {
            this.putQueryParameter("HalfOpenBaseAmountPerStep", halfOpenBaseAmountPerStep);
            this.halfOpenBaseAmountPerStep = halfOpenBaseAmountPerStep;
            return this;
        }

        /**
         * HalfOpenRecoveryStepNum.
         */
        public Builder halfOpenRecoveryStepNum(Integer halfOpenRecoveryStepNum) {
            this.putQueryParameter("HalfOpenRecoveryStepNum", halfOpenRecoveryStepNum);
            this.halfOpenRecoveryStepNum = halfOpenRecoveryStepNum;
            return this;
        }

        /**
         * MinRequestAmount.
         */
        public Builder minRequestAmount(Integer minRequestAmount) {
            this.putQueryParameter("MinRequestAmount", minRequestAmount);
            this.minRequestAmount = minRequestAmount;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * RecoveryTimeoutMs.
         */
        public Builder recoveryTimeoutMs(Integer recoveryTimeoutMs) {
            this.putQueryParameter("RecoveryTimeoutMs", recoveryTimeoutMs);
            this.recoveryTimeoutMs = recoveryTimeoutMs;
            return this;
        }

        /**
         * Resource.
         */
        public Builder resource(String resource) {
            this.putQueryParameter("Resource", resource);
            this.resource = resource;
            return this;
        }

        /**
         * SlowRtMs.
         */
        public Builder slowRtMs(Integer slowRtMs) {
            this.putQueryParameter("SlowRtMs", slowRtMs);
            this.slowRtMs = slowRtMs;
            return this;
        }

        /**
         * StatDurationMs.
         */
        public Builder statDurationMs(Integer statDurationMs) {
            this.putQueryParameter("StatDurationMs", statDurationMs);
            this.statDurationMs = statDurationMs;
            return this;
        }

        /**
         * Strategy.
         */
        public Builder strategy(Integer strategy) {
            this.putQueryParameter("Strategy", strategy);
            this.strategy = strategy;
            return this;
        }

        /**
         * Threshold.
         */
        public Builder threshold(Float threshold) {
            this.putQueryParameter("Threshold", threshold);
            this.threshold = threshold;
            return this;
        }

        @Override
        public CreateDegradeRuleRequest build() {
            return new CreateDegradeRuleRequest(this);
        } 

    } 

}
