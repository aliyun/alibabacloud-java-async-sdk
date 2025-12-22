// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link SetHttpDDoSAttackRuleActionRequest} extends {@link RequestModel}
 *
 * <p>SetHttpDDoSAttackRuleActionRequest</p>
 */
public class SetHttpDDoSAttackRuleActionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleAction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleIds")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
    private String ruleIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long siteId;

    private SetHttpDDoSAttackRuleActionRequest(Builder builder) {
        super(builder);
        this.ruleAction = builder.ruleAction;
        this.ruleIds = builder.ruleIds;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetHttpDDoSAttackRuleActionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ruleAction
     */
    public String getRuleAction() {
        return this.ruleAction;
    }

    /**
     * @return ruleIds
     */
    public String getRuleIds() {
        return this.ruleIds;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<SetHttpDDoSAttackRuleActionRequest, Builder> {
        private String ruleAction; 
        private String ruleIds; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(SetHttpDDoSAttackRuleActionRequest request) {
            super(request);
            this.ruleAction = request.ruleAction;
            this.ruleIds = request.ruleIds;
            this.siteId = request.siteId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>js</p>
         */
        public Builder ruleAction(String ruleAction) {
            this.putQueryParameter("RuleAction", ruleAction);
            this.ruleAction = ruleAction;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        public Builder ruleIds(String ruleIds) {
            this.putQueryParameter("RuleIds", ruleIds);
            this.ruleIds = ruleIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public SetHttpDDoSAttackRuleActionRequest build() {
            return new SetHttpDDoSAttackRuleActionRequest(this);
        } 

    } 

}
