// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRuleBaseRequest} extends {@link RequestModel}
 *
 * <p>UpdateRuleBaseRequest</p>
 */
public class UpdateRuleBaseRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("memo")
    private String memo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleId")
    private String ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleName")
    private String ruleName;

    private UpdateRuleBaseRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.consoleRuleId = builder.consoleRuleId;
        this.eventCode = builder.eventCode;
        this.memo = builder.memo;
        this.regId = builder.regId;
        this.ruleId = builder.ruleId;
        this.ruleName = builder.ruleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRuleBaseRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateRuleBaseRequest, Builder> {
        private String lang; 
        private Long consoleRuleId; 
        private String eventCode; 
        private String memo; 
        private String regId; 
        private String ruleId; 
        private String ruleName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRuleBaseRequest request) {
            super(request);
            this.lang = request.lang;
            this.consoleRuleId = request.consoleRuleId;
            this.eventCode = request.eventCode;
            this.memo = request.memo;
            this.regId = request.regId;
            this.ruleId = request.ruleId;
            this.ruleName = request.ruleName;
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

        @Override
        public UpdateRuleBaseRequest build() {
            return new UpdateRuleBaseRequest(this);
        } 

    } 

}
