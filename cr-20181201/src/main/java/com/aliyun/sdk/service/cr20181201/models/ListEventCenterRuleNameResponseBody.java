// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link ListEventCenterRuleNameResponseBody} extends {@link TeaModel}
 *
 * <p>ListEventCenterRuleNameResponseBody</p>
 */
public class ListEventCenterRuleNameResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleNames")
    private java.util.List<RuleNames> ruleNames;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<RuleNames> getRuleNames() {
        return this.ruleNames;
    }

    public static final class Builder {
        private String code; 
        private Boolean isSuccess; 
        private String requestId; 
        private java.util.List<RuleNames> ruleNames; 

        private Builder() {
        } 

        private Builder(ListEventCenterRuleNameResponseBody model) {
            this.code = model.code;
            this.isSuccess = model.isSuccess;
            this.requestId = model.requestId;
            this.ruleNames = model.ruleNames;
        } 

        /**
         * <p>The return value.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>031572FA-7D8F-4C05-B790-1071E0E05DE6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of names of event notification rules.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;RuleName&quot;: &quot;mlf&quot;, &quot;RuleId&quot;: &quot;crecr-73q93pgljm1pc2fp&quot;}]</p>
         */
        public Builder ruleNames(java.util.List<RuleNames> ruleNames) {
            this.ruleNames = ruleNames;
            return this;
        }

        public ListEventCenterRuleNameResponseBody build() {
            return new ListEventCenterRuleNameResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEventCenterRuleNameResponseBody} extends {@link TeaModel}
     *
     * <p>ListEventCenterRuleNameResponseBody</p>
     */
    public static class RuleNames extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
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

            private Builder() {
            } 

            private Builder(RuleNames model) {
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
            } 

            /**
             * <p>The ID of the event notification rule.</p>
             * 
             * <strong>example:</strong>
             * <p>crecr-n6pbhgjxtl*****</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the event notification rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test-chain</p>
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
