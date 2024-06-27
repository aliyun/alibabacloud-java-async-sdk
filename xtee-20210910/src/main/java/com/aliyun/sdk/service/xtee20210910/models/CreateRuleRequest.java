// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateRuleRequest</p>
 */
public class CreateRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("consoleRuleId")
    private Long consoleRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("createType")
    private String createType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventCode")
    private String eventCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventName")
    private String eventName;

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
    @com.aliyun.core.annotation.NameInMap("ruleName")
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleStatus")
    private String ruleStatus;

    private CreateRuleRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.consoleRuleId = builder.consoleRuleId;
        this.createType = builder.createType;
        this.eventCode = builder.eventCode;
        this.eventName = builder.eventName;
        this.logicExpression = builder.logicExpression;
        this.memo = builder.memo;
        this.regId = builder.regId;
        this.ruleActions = builder.ruleActions;
        this.ruleExpressions = builder.ruleExpressions;
        this.ruleName = builder.ruleName;
        this.ruleStatus = builder.ruleStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRuleRequest create() {
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
     * @return createType
     */
    public String getCreateType() {
        return this.createType;
    }

    /**
     * @return eventCode
     */
    public String getEventCode() {
        return this.eventCode;
    }

    /**
     * @return eventName
     */
    public String getEventName() {
        return this.eventName;
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

    public static final class Builder extends Request.Builder<CreateRuleRequest, Builder> {
        private String lang; 
        private Long consoleRuleId; 
        private String createType; 
        private String eventCode; 
        private String eventName; 
        private String logicExpression; 
        private String memo; 
        private String regId; 
        private String ruleActions; 
        private String ruleExpressions; 
        private String ruleName; 
        private String ruleStatus; 

        private Builder() {
            super();
        } 

        private Builder(CreateRuleRequest request) {
            super(request);
            this.lang = request.lang;
            this.consoleRuleId = request.consoleRuleId;
            this.createType = request.createType;
            this.eventCode = request.eventCode;
            this.eventName = request.eventName;
            this.logicExpression = request.logicExpression;
            this.memo = request.memo;
            this.regId = request.regId;
            this.ruleActions = request.ruleActions;
            this.ruleExpressions = request.ruleExpressions;
            this.ruleName = request.ruleName;
            this.ruleStatus = request.ruleStatus;
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
         * createType.
         */
        public Builder createType(String createType) {
            this.putQueryParameter("createType", createType);
            this.createType = createType;
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
         * eventName.
         */
        public Builder eventName(String eventName) {
            this.putQueryParameter("eventName", eventName);
            this.eventName = eventName;
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

        @Override
        public CreateRuleRequest build() {
            return new CreateRuleRequest(this);
        } 

    } 

}
