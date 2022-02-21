// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableIsolationRuleRequest} extends {@link RequestModel}
 *
 * <p>DisableIsolationRuleRequest</p>
 */
public class DisableIsolationRuleRequest extends Request {
    @Query
    @NameInMap("AhasRegionId")
    private String ahasRegionId;

    @Query
    @NameInMap("RuleId")
    @Validation(required = true, maximum = 100000000000000D)
    private Long ruleId;

    private DisableIsolationRuleRequest(Builder builder) {
        super(builder);
        this.ahasRegionId = builder.ahasRegionId;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableIsolationRuleRequest create() {
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
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<DisableIsolationRuleRequest, Builder> {
        private String ahasRegionId; 
        private Long ruleId; 

        private Builder() {
            super();
        } 

        private Builder(DisableIsolationRuleRequest response) {
            super(response);
            this.ahasRegionId = response.ahasRegionId;
            this.ruleId = response.ruleId;
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
         * RuleId.
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public DisableIsolationRuleRequest build() {
            return new DisableIsolationRuleRequest(this);
        } 

    } 

}
