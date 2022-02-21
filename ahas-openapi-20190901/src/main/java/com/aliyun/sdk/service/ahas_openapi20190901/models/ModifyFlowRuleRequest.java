// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyFlowRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyFlowRuleRequest</p>
 */
public class ModifyFlowRuleRequest extends Request {
    @Query
    @NameInMap("AhasRegionId")
    private String ahasRegionId;

    @Query
    @NameInMap("ControlBehavior")
    private String controlBehavior;

    @Query
    @NameInMap("LimitOrigin")
    private String limitOrigin;

    @Query
    @NameInMap("MaxQueueingTimeMs")
    private Integer maxQueueingTimeMs;

    @Query
    @NameInMap("Namespace")
    private String namespace;

    @Query
    @NameInMap("RefResource")
    private String refResource;

    @Query
    @NameInMap("RelationStrategy")
    private Integer relationStrategy;

    @Query
    @NameInMap("RuleId")
    @Validation(required = true)
    private Long ruleId;

    @Query
    @NameInMap("Threshold")
    private Float threshold;

    @Query
    @NameInMap("WarmUpPeriodSec")
    private Integer warmUpPeriodSec;

    private ModifyFlowRuleRequest(Builder builder) {
        super(builder);
        this.ahasRegionId = builder.ahasRegionId;
        this.controlBehavior = builder.controlBehavior;
        this.limitOrigin = builder.limitOrigin;
        this.maxQueueingTimeMs = builder.maxQueueingTimeMs;
        this.namespace = builder.namespace;
        this.refResource = builder.refResource;
        this.relationStrategy = builder.relationStrategy;
        this.ruleId = builder.ruleId;
        this.threshold = builder.threshold;
        this.warmUpPeriodSec = builder.warmUpPeriodSec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyFlowRuleRequest create() {
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
     * @return controlBehavior
     */
    public String getControlBehavior() {
        return this.controlBehavior;
    }

    /**
     * @return limitOrigin
     */
    public String getLimitOrigin() {
        return this.limitOrigin;
    }

    /**
     * @return maxQueueingTimeMs
     */
    public Integer getMaxQueueingTimeMs() {
        return this.maxQueueingTimeMs;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return refResource
     */
    public String getRefResource() {
        return this.refResource;
    }

    /**
     * @return relationStrategy
     */
    public Integer getRelationStrategy() {
        return this.relationStrategy;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    /**
     * @return threshold
     */
    public Float getThreshold() {
        return this.threshold;
    }

    /**
     * @return warmUpPeriodSec
     */
    public Integer getWarmUpPeriodSec() {
        return this.warmUpPeriodSec;
    }

    public static final class Builder extends Request.Builder<ModifyFlowRuleRequest, Builder> {
        private String ahasRegionId; 
        private String controlBehavior; 
        private String limitOrigin; 
        private Integer maxQueueingTimeMs; 
        private String namespace; 
        private String refResource; 
        private Integer relationStrategy; 
        private Long ruleId; 
        private Float threshold; 
        private Integer warmUpPeriodSec; 

        private Builder() {
            super();
        } 

        private Builder(ModifyFlowRuleRequest response) {
            super(response);
            this.ahasRegionId = response.ahasRegionId;
            this.controlBehavior = response.controlBehavior;
            this.limitOrigin = response.limitOrigin;
            this.maxQueueingTimeMs = response.maxQueueingTimeMs;
            this.namespace = response.namespace;
            this.refResource = response.refResource;
            this.relationStrategy = response.relationStrategy;
            this.ruleId = response.ruleId;
            this.threshold = response.threshold;
            this.warmUpPeriodSec = response.warmUpPeriodSec;
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
         * ControlBehavior.
         */
        public Builder controlBehavior(String controlBehavior) {
            this.putQueryParameter("ControlBehavior", controlBehavior);
            this.controlBehavior = controlBehavior;
            return this;
        }

        /**
         * LimitOrigin.
         */
        public Builder limitOrigin(String limitOrigin) {
            this.putQueryParameter("LimitOrigin", limitOrigin);
            this.limitOrigin = limitOrigin;
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
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * RefResource.
         */
        public Builder refResource(String refResource) {
            this.putQueryParameter("RefResource", refResource);
            this.refResource = refResource;
            return this;
        }

        /**
         * RelationStrategy.
         */
        public Builder relationStrategy(Integer relationStrategy) {
            this.putQueryParameter("RelationStrategy", relationStrategy);
            this.relationStrategy = relationStrategy;
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
         * Threshold.
         */
        public Builder threshold(Float threshold) {
            this.putQueryParameter("Threshold", threshold);
            this.threshold = threshold;
            return this;
        }

        /**
         * WarmUpPeriodSec.
         */
        public Builder warmUpPeriodSec(Integer warmUpPeriodSec) {
            this.putQueryParameter("WarmUpPeriodSec", warmUpPeriodSec);
            this.warmUpPeriodSec = warmUpPeriodSec;
            return this;
        }

        @Override
        public ModifyFlowRuleRequest build() {
            return new ModifyFlowRuleRequest(this);
        } 

    } 

}
