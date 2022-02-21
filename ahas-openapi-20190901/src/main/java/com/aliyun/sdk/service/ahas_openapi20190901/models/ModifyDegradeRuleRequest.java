// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDegradeRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyDegradeRuleRequest</p>
 */
public class ModifyDegradeRuleRequest extends Request {
    @Query
    @NameInMap("AhasRegionId")
    private String ahasRegionId;

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
    @NameInMap("RecoveryTimeoutMs")
    private Integer recoveryTimeoutMs;

    @Query
    @NameInMap("RuleId")
    @Validation(required = true)
    private Long ruleId;

    @Query
    @NameInMap("SlowRtMs")
    private Integer slowRtMs;

    @Query
    @NameInMap("StatDurationMs")
    private Integer statDurationMs;

    @Query
    @NameInMap("Strategy")
    private Integer strategy;

    @Query
    @NameInMap("Threshold")
    private Float threshold;

    private ModifyDegradeRuleRequest(Builder builder) {
        super(builder);
        this.ahasRegionId = builder.ahasRegionId;
        this.halfOpenBaseAmountPerStep = builder.halfOpenBaseAmountPerStep;
        this.halfOpenRecoveryStepNum = builder.halfOpenRecoveryStepNum;
        this.minRequestAmount = builder.minRequestAmount;
        this.recoveryTimeoutMs = builder.recoveryTimeoutMs;
        this.ruleId = builder.ruleId;
        this.slowRtMs = builder.slowRtMs;
        this.statDurationMs = builder.statDurationMs;
        this.strategy = builder.strategy;
        this.threshold = builder.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDegradeRuleRequest create() {
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
     * @return recoveryTimeoutMs
     */
    public Integer getRecoveryTimeoutMs() {
        return this.recoveryTimeoutMs;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
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

    public static final class Builder extends Request.Builder<ModifyDegradeRuleRequest, Builder> {
        private String ahasRegionId; 
        private Integer halfOpenBaseAmountPerStep; 
        private Integer halfOpenRecoveryStepNum; 
        private Integer minRequestAmount; 
        private Integer recoveryTimeoutMs; 
        private Long ruleId; 
        private Integer slowRtMs; 
        private Integer statDurationMs; 
        private Integer strategy; 
        private Float threshold; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDegradeRuleRequest response) {
            super(response);
            this.ahasRegionId = response.ahasRegionId;
            this.halfOpenBaseAmountPerStep = response.halfOpenBaseAmountPerStep;
            this.halfOpenRecoveryStepNum = response.halfOpenRecoveryStepNum;
            this.minRequestAmount = response.minRequestAmount;
            this.recoveryTimeoutMs = response.recoveryTimeoutMs;
            this.ruleId = response.ruleId;
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
         * RecoveryTimeoutMs.
         */
        public Builder recoveryTimeoutMs(Integer recoveryTimeoutMs) {
            this.putQueryParameter("RecoveryTimeoutMs", recoveryTimeoutMs);
            this.recoveryTimeoutMs = recoveryTimeoutMs;
            return this;
        }

        /**
         * RuleId.
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
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
        public ModifyDegradeRuleRequest build() {
            return new ModifyDegradeRuleRequest(this);
        } 

    } 

}
