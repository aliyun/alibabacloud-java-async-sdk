// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyIsolationRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyIsolationRuleRequest</p>
 */
public class ModifyIsolationRuleRequest extends Request {
    @Query
    @NameInMap("AhasRegionId")
    private String ahasRegionId;

    @Query
    @NameInMap("LimitOrigin")
    private String limitOrigin;

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

    private ModifyIsolationRuleRequest(Builder builder) {
        super(builder);
        this.ahasRegionId = builder.ahasRegionId;
        this.limitOrigin = builder.limitOrigin;
        this.refResource = builder.refResource;
        this.relationStrategy = builder.relationStrategy;
        this.ruleId = builder.ruleId;
        this.threshold = builder.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyIsolationRuleRequest create() {
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
     * @return limitOrigin
     */
    public String getLimitOrigin() {
        return this.limitOrigin;
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

    public static final class Builder extends Request.Builder<ModifyIsolationRuleRequest, Builder> {
        private String ahasRegionId; 
        private String limitOrigin; 
        private String refResource; 
        private Integer relationStrategy; 
        private Long ruleId; 
        private Float threshold; 

        private Builder() {
            super();
        } 

        private Builder(ModifyIsolationRuleRequest response) {
            super(response);
            this.ahasRegionId = response.ahasRegionId;
            this.limitOrigin = response.limitOrigin;
            this.refResource = response.refResource;
            this.relationStrategy = response.relationStrategy;
            this.ruleId = response.ruleId;
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
         * LimitOrigin.
         */
        public Builder limitOrigin(String limitOrigin) {
            this.putQueryParameter("LimitOrigin", limitOrigin);
            this.limitOrigin = limitOrigin;
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

        @Override
        public ModifyIsolationRuleRequest build() {
            return new ModifyIsolationRuleRequest(this);
        } 

    } 

}
