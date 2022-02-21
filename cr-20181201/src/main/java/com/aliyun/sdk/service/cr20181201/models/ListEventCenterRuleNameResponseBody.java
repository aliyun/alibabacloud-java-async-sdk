// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEventCenterRuleNameResponseBody} extends {@link TeaModel}
 *
 * <p>ListEventCenterRuleNameResponseBody</p>
 */
public class ListEventCenterRuleNameResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RuleNames")
    private java.util.List < RuleNames> ruleNames;

    private ListEventCenterRuleNameResponseBody(Builder builder) {
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.requestId = builder.requestId;
        this.ruleNames = builder.ruleNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEventCenterRuleNameResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleNames
     */
    public java.util.List < RuleNames> getRuleNames() {
        return this.ruleNames;
    }

    public static final class Builder {
        private String code; 
        private Boolean isSuccess; 
        private String requestId; 
        private java.util.List < RuleNames> ruleNames; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * IsSuccess.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RuleNames.
         */
        public Builder ruleNames(java.util.List < RuleNames> ruleNames) {
            this.ruleNames = ruleNames;
            return this;
        }

        public ListEventCenterRuleNameResponseBody build() {
            return new ListEventCenterRuleNameResponseBody(this);
        } 

    } 

    public static class RuleNames extends TeaModel {
        @NameInMap("RuleId")
        private String ruleId;

        @NameInMap("RuleName")
        private String ruleName;

        private RuleNames(Builder builder) {
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleNames create() {
            return builder().build();
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

        public static final class Builder {
            private String ruleId; 
            private String ruleName; 

            /**
             * RuleId.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            public RuleNames build() {
                return new RuleNames(this);
            } 

        } 

    }
}
