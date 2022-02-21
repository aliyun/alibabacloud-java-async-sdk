// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyHotParamRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyHotParamRuleRequest</p>
 */
public class ModifyHotParamRuleRequest extends Request {
    @Query
    @NameInMap("AhasRegionId")
    private String ahasRegionId;

    @Query
    @NameInMap("BurstCount")
    private Integer burstCount;

    @Query
    @NameInMap("ControlBehavior")
    private Integer controlBehavior;

    @Query
    @NameInMap("Enable")
    private Boolean enable;

    @Query
    @NameInMap("MaxQueueingTimeMs")
    private Integer maxQueueingTimeMs;

    @Query
    @NameInMap("MetricType")
    private Integer metricType;

    @Query
    @NameInMap("ParamIdx")
    private Integer paramIdx;

    @Query
    @NameInMap("RuleId")
    @Validation(required = true)
    private Long ruleId;

    @Query
    @NameInMap("StatDurationSec")
    private Long statDurationSec;

    @Query
    @NameInMap("Threshold")
    private Float threshold;

    private ModifyHotParamRuleRequest(Builder builder) {
        super(builder);
        this.ahasRegionId = builder.ahasRegionId;
        this.burstCount = builder.burstCount;
        this.controlBehavior = builder.controlBehavior;
        this.enable = builder.enable;
        this.maxQueueingTimeMs = builder.maxQueueingTimeMs;
        this.metricType = builder.metricType;
        this.paramIdx = builder.paramIdx;
        this.ruleId = builder.ruleId;
        this.statDurationSec = builder.statDurationSec;
        this.threshold = builder.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyHotParamRuleRequest create() {
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
     * @return burstCount
     */
    public Integer getBurstCount() {
        return this.burstCount;
    }

    /**
     * @return controlBehavior
     */
    public Integer getControlBehavior() {
        return this.controlBehavior;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return maxQueueingTimeMs
     */
    public Integer getMaxQueueingTimeMs() {
        return this.maxQueueingTimeMs;
    }

    /**
     * @return metricType
     */
    public Integer getMetricType() {
        return this.metricType;
    }

    /**
     * @return paramIdx
     */
    public Integer getParamIdx() {
        return this.paramIdx;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    /**
     * @return statDurationSec
     */
    public Long getStatDurationSec() {
        return this.statDurationSec;
    }

    /**
     * @return threshold
     */
    public Float getThreshold() {
        return this.threshold;
    }

    public static final class Builder extends Request.Builder<ModifyHotParamRuleRequest, Builder> {
        private String ahasRegionId; 
        private Integer burstCount; 
        private Integer controlBehavior; 
        private Boolean enable; 
        private Integer maxQueueingTimeMs; 
        private Integer metricType; 
        private Integer paramIdx; 
        private Long ruleId; 
        private Long statDurationSec; 
        private Float threshold; 

        private Builder() {
            super();
        } 

        private Builder(ModifyHotParamRuleRequest response) {
            super(response);
            this.ahasRegionId = response.ahasRegionId;
            this.burstCount = response.burstCount;
            this.controlBehavior = response.controlBehavior;
            this.enable = response.enable;
            this.maxQueueingTimeMs = response.maxQueueingTimeMs;
            this.metricType = response.metricType;
            this.paramIdx = response.paramIdx;
            this.ruleId = response.ruleId;
            this.statDurationSec = response.statDurationSec;
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
         * BurstCount.
         */
        public Builder burstCount(Integer burstCount) {
            this.putQueryParameter("BurstCount", burstCount);
            this.burstCount = burstCount;
            return this;
        }

        /**
         * ControlBehavior.
         */
        public Builder controlBehavior(Integer controlBehavior) {
            this.putQueryParameter("ControlBehavior", controlBehavior);
            this.controlBehavior = controlBehavior;
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
         * MaxQueueingTimeMs.
         */
        public Builder maxQueueingTimeMs(Integer maxQueueingTimeMs) {
            this.putQueryParameter("MaxQueueingTimeMs", maxQueueingTimeMs);
            this.maxQueueingTimeMs = maxQueueingTimeMs;
            return this;
        }

        /**
         * MetricType.
         */
        public Builder metricType(Integer metricType) {
            this.putQueryParameter("MetricType", metricType);
            this.metricType = metricType;
            return this;
        }

        /**
         * ParamIdx.
         */
        public Builder paramIdx(Integer paramIdx) {
            this.putQueryParameter("ParamIdx", paramIdx);
            this.paramIdx = paramIdx;
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
         * StatDurationSec.
         */
        public Builder statDurationSec(Long statDurationSec) {
            this.putQueryParameter("StatDurationSec", statDurationSec);
            this.statDurationSec = statDurationSec;
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
        public ModifyHotParamRuleRequest build() {
            return new ModifyHotParamRuleRequest(this);
        } 

    } 

}
