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
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>Rule content, using conditional expressions to match user requests. This parameter is not required when adding global configuration. There are two usage scenarios:</p>
         * <ul>
         * <li>Match all incoming requests: Set the value to true</li>
         * <li>Match specific requests: Set the value to a custom expression, for example: (http.host eq &quot;video.example.com&quot;)</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>(http.request.uri.path.file_name eq &quot;jpg&quot;)</p>
         */
        public Builder rule(String rule) {
            this.putQueryParameter("Rule", rule);
            this.rule = rule;
            return this;
        }

        /**
         * <p>Rule switch. This parameter is not required when adding global configuration. Value range:</p>
         * <ul>
         * <li>on: Enable.</li>
         * <li>off: Disable.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder ruleEnable(String ruleEnable) {
            this.putQueryParameter("RuleEnable", ruleEnable);
            this.ruleEnable = ruleEnable;
            return this;
        }

        /**
         * <p>Rule name. This parameter is not required when adding global configuration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>Site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> interface.</p>
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

        /**
         * <p>The ID of the waiting room bypass rule to be updated, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850279.html">ListWaitingRoomRules</a> interface.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8987739839****</p>
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
