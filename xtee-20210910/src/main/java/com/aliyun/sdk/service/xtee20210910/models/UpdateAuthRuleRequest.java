// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAuthRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateAuthRuleRequest</p>
 */
public class UpdateAuthRuleRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("regId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleActions")
    private String ruleActions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleExpressions")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleExpressions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleVersionId")
    private Long ruleVersionId;

    private UpdateAuthRuleRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.consoleRuleId = builder.consoleRuleId;
        this.eventCode = builder.eventCode;
        this.regId = builder.regId;
        this.ruleActions = builder.ruleActions;
        this.ruleExpressions = builder.ruleExpressions;
        this.ruleId = builder.ruleId;
        this.ruleVersionId = builder.ruleVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAuthRuleRequest create() {
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
     * @return ruleVersionId
     */
    public Long getRuleVersionId() {
        return this.ruleVersionId;
    }

    public static final class Builder extends Request.Builder<UpdateAuthRuleRequest, Builder> {
        private String lang; 
        private Long consoleRuleId; 
        private String eventCode; 
        private String regId; 
        private String ruleActions; 
        private String ruleExpressions; 
        private String ruleId; 
        private Long ruleVersionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAuthRuleRequest request) {
            super(request);
            this.lang = request.lang;
            this.consoleRuleId = request.consoleRuleId;
            this.eventCode = request.eventCode;
            this.regId = request.regId;
            this.ruleActions = request.ruleActions;
            this.ruleExpressions = request.ruleExpressions;
            this.ruleId = request.ruleId;
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
         * ruleVersionId.
         */
        public Builder ruleVersionId(Long ruleVersionId) {
            this.putQueryParameter("ruleVersionId", ruleVersionId);
            this.ruleVersionId = ruleVersionId;
            return this;
        }

        @Override
        public UpdateAuthRuleRequest build() {
            return new UpdateAuthRuleRequest(this);
        } 

    } 

}
