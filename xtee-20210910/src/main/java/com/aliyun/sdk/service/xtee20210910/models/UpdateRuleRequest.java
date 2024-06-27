// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateRuleRequest</p>
 */
public class UpdateRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("consoleRuleId")
    private Long consoleRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventCode")
    private String eventCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("logicExpression")
    private String logicExpression;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("memo")
    private String memo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleActions")
    private String ruleActions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleExpressions")
    private String ruleExpressions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleId")
    private String ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleName")
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleStatus")
    private String ruleStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleVersionId")
    private Long ruleVersionId;

    private UpdateRuleRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.consoleRuleId = builder.consoleRuleId;
        this.eventCode = builder.eventCode;
        this.logicExpression = builder.logicExpression;
        this.memo = builder.memo;
        this.regId = builder.regId;
        this.ruleActions = builder.ruleActions;
        this.ruleExpressions = builder.ruleExpressions;
        this.ruleId = builder.ruleId;
        this.ruleName = builder.ruleName;
        this.ruleStatus = builder.ruleStatus;
        this.ruleVersionId = builder.ruleVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return consoleRuleId
     */
    public Long getConsoleRuleId() {
        return this.consoleRuleId;
    }

    /**
     * @return eventCode
     */
    public String getEventCode() {
        return this.eventCode;
    }

    /**
     * @return logicExpression
     */
    public String getLogicExpression() {
        return this.logicExpression;
    }

    /**
     * @return memo
     */
    public String getMemo() {
        return this.memo;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return ruleActions
     */
    public String getRuleActions() {
        return this.ruleActions;
    }

    /**
     * @return ruleExpressions
     */
    public String getRuleExpressions() {
        return this.ruleExpressions;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return ruleStatus
     */
    public String getRuleStatus() {
        return this.ruleStatus;
    }

    /**
     * @return ruleVersionId
     */
    public Long getRuleVersionId() {
        return this.ruleVersionId;
    }

    public static final class Builder extends Request.Builder<UpdateRuleRequest, Builder> {
        private String lang; 
        private Long consoleRuleId; 
        private String eventCode; 
        private String logicExpression; 
        private String memo; 
        private String regId; 
        private String ruleActions; 
        private String ruleExpressions; 
        private String ruleId; 
        private String ruleName; 
        private String ruleStatus; 
        private Long ruleVersionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRuleRequest request) {
            super(request);
            this.lang = request.lang;
            this.consoleRuleId = request.consoleRuleId;
            this.eventCode = request.eventCode;
            this.logicExpression = request.logicExpression;
            this.memo = request.memo;
            this.regId = request.regId;
            this.ruleActions = request.ruleActions;
            this.ruleExpressions = request.ruleExpressions;
            this.ruleId = request.ruleId;
            this.ruleName = request.ruleName;
            this.ruleStatus = request.ruleStatus;
            this.ruleVersionId = request.ruleVersionId;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * consoleRuleId.
         */
        public Builder consoleRuleId(Long consoleRuleId) {
            this.putQueryParameter("consoleRuleId", consoleRuleId);
            this.consoleRuleId = consoleRuleId;
            return this;
        }

        /**
         * eventCode.
         */
        public Builder eventCode(String eventCode) {
            this.putQueryParameter("eventCode", eventCode);
            this.eventCode = eventCode;
            return this;
        }

        /**
         * logicExpression.
         */
        public Builder logicExpression(String logicExpression) {
            this.putQueryParameter("logicExpression", logicExpression);
            this.logicExpression = logicExpression;
            return this;
        }

        /**
         * memo.
         */
        public Builder memo(String memo) {
            this.putQueryParameter("memo", memo);
            this.memo = memo;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * ruleActions.
         */
        public Builder ruleActions(String ruleActions) {
            this.putQueryParameter("ruleActions", ruleActions);
            this.ruleActions = ruleActions;
            return this;
        }

        /**
         * ruleExpressions.
         */
        public Builder ruleExpressions(String ruleExpressions) {
            this.putQueryParameter("ruleExpressions", ruleExpressions);
            this.ruleExpressions = ruleExpressions;
            return this;
        }

        /**
         * ruleId.
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("ruleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * ruleName.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("ruleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * ruleStatus.
         */
        public Builder ruleStatus(String ruleStatus) {
            this.putQueryParameter("ruleStatus", ruleStatus);
            this.ruleStatus = ruleStatus;
            return this;
        }

        /**
         * ruleVersionId.
         */
        public Builder ruleVersionId(Long ruleVersionId) {
            this.putQueryParameter("ruleVersionId", ruleVersionId);
            this.ruleVersionId = ruleVersionId;
            return this;
        }

        @Override
        public UpdateRuleRequest build() {
            return new UpdateRuleRequest(this);
        } 

    } 

}
