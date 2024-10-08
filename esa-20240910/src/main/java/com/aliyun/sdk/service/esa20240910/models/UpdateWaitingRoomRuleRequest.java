// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateWaitingRoomRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateWaitingRoomRuleRequest</p>
 */
public class UpdateWaitingRoomRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rule")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleEnable")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WaitingRoomRuleId")
    private Long waitingRoomRuleId;

    private UpdateWaitingRoomRuleRequest(Builder builder) {
        super(builder);
        this.rule = builder.rule;
        this.ruleEnable = builder.ruleEnable;
        this.ruleName = builder.ruleName;
        this.siteId = builder.siteId;
        this.waitingRoomRuleId = builder.waitingRoomRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWaitingRoomRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return rule
     */
    public String getRule() {
        return this.rule;
    }

    /**
     * @return ruleEnable
     */
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return waitingRoomRuleId
     */
    public Long getWaitingRoomRuleId() {
        return this.waitingRoomRuleId;
    }

    public static final class Builder extends Request.Builder<UpdateWaitingRoomRuleRequest, Builder> {
        private String rule; 
        private String ruleEnable; 
        private String ruleName; 
        private Long siteId; 
        private Long waitingRoomRuleId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWaitingRoomRuleRequest request) {
            super(request);
            this.rule = request.rule;
            this.ruleEnable = request.ruleEnable;
            this.ruleName = request.ruleName;
            this.siteId = request.siteId;
            this.waitingRoomRuleId = request.waitingRoomRuleId;
        } 

        /**
         * Rule.
         */
        public Builder rule(String rule) {
            this.putQueryParameter("Rule", rule);
            this.rule = rule;
            return this;
        }

        /**
         * RuleEnable.
         */
        public Builder ruleEnable(String ruleEnable) {
            this.putQueryParameter("RuleEnable", ruleEnable);
            this.ruleEnable = ruleEnable;
            return this;
        }

        /**
         * RuleName.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * SiteId.
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * WaitingRoomRuleId.
         */
        public Builder waitingRoomRuleId(Long waitingRoomRuleId) {
            this.putQueryParameter("WaitingRoomRuleId", waitingRoomRuleId);
            this.waitingRoomRuleId = waitingRoomRuleId;
            return this;
        }

        @Override
        public UpdateWaitingRoomRuleRequest build() {
            return new UpdateWaitingRoomRuleRequest(this);
        } 

    } 

}
