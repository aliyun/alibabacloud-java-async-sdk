// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDesensitizationRuleResponseBody} extends {@link TeaModel}
 *
 * <p>ListDesensitizationRuleResponseBody</p>
 */
public class ListDesensitizationRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DesensitizationRuleList")
    private java.util.List < DesensitizationRuleList> desensitizationRuleList;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListDesensitizationRuleResponseBody(Builder builder) {
        this.desensitizationRuleList = builder.desensitizationRuleList;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDesensitizationRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return desensitizationRuleList
     */
    public java.util.List < DesensitizationRuleList> getDesensitizationRuleList() {
        return this.desensitizationRuleList;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < DesensitizationRuleList> desensitizationRuleList; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * The list of masking rules.
         */
        public Builder desensitizationRuleList(java.util.List < DesensitizationRuleList> desensitizationRuleList) {
            this.desensitizationRuleList = desensitizationRuleList;
            return this;
        }

        /**
         * The error code returned if the request failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned if the request failed.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true: The request was successful.
         * *   false: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of entries returned. By default, this parameter is not returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDesensitizationRuleResponseBody build() {
            return new ListDesensitizationRuleResponseBody(this);
        } 

    } 

    public static class DesensitizationRuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FuncParams")
        private String funcParams;

        @com.aliyun.core.annotation.NameInMap("FuncSample")
        private String funcSample;

        @com.aliyun.core.annotation.NameInMap("FunctionType")
        private String functionType;

        @com.aliyun.core.annotation.NameInMap("LastModifierId")
        private String lastModifierId;

        @com.aliyun.core.annotation.NameInMap("LastModifierName")
        private String lastModifierName;

        @com.aliyun.core.annotation.NameInMap("ReferenceCount")
        private Integer referenceCount;

        @com.aliyun.core.annotation.NameInMap("RuleDesc")
        private String ruleDesc;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Integer ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("RuleType")
        private String ruleType;

        private DesensitizationRuleList(Builder builder) {
            this.funcParams = builder.funcParams;
            this.funcSample = builder.funcSample;
            this.functionType = builder.functionType;
            this.lastModifierId = builder.lastModifierId;
            this.lastModifierName = builder.lastModifierName;
            this.referenceCount = builder.referenceCount;
            this.ruleDesc = builder.ruleDesc;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.ruleType = builder.ruleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DesensitizationRuleList create() {
            return builder().build();
        }

        /**
         * @return funcParams
         */
        public String getFuncParams() {
            return this.funcParams;
        }

        /**
         * @return funcSample
         */
        public String getFuncSample() {
            return this.funcSample;
        }

        /**
         * @return functionType
         */
        public String getFunctionType() {
            return this.functionType;
        }

        /**
         * @return lastModifierId
         */
        public String getLastModifierId() {
            return this.lastModifierId;
        }

        /**
         * @return lastModifierName
         */
        public String getLastModifierName() {
            return this.lastModifierName;
        }

        /**
         * @return referenceCount
         */
        public Integer getReferenceCount() {
            return this.referenceCount;
        }

        /**
         * @return ruleDesc
         */
        public String getRuleDesc() {
            return this.ruleDesc;
        }

        /**
         * @return ruleId
         */
        public Integer getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return ruleType
         */
        public String getRuleType() {
            return this.ruleType;
        }

        public static final class Builder {
            private String funcParams; 
            private String funcSample; 
            private String functionType; 
            private String lastModifierId; 
            private String lastModifierName; 
            private Integer referenceCount; 
            private String ruleDesc; 
            private Integer ruleId; 
            private String ruleName; 
            private String ruleType; 

            /**
             * The parameter.
             */
            public Builder funcParams(String funcParams) {
                this.funcParams = funcParams;
                return this;
            }

            /**
             * The example.
             */
            public Builder funcSample(String funcSample) {
                this.funcSample = funcSample;
                return this;
            }

            /**
             * The algorithm type.
             */
            public Builder functionType(String functionType) {
                this.functionType = functionType;
                return this;
            }

            /**
             * The ID of the user who last modified the masking rule.
             */
            public Builder lastModifierId(String lastModifierId) {
                this.lastModifierId = lastModifierId;
                return this;
            }

            /**
             * The name of the user who last modified the masking rule.
             */
            public Builder lastModifierName(String lastModifierName) {
                this.lastModifierName = lastModifierName;
                return this;
            }

            /**
             * The number of times that the masking was used.
             */
            public Builder referenceCount(Integer referenceCount) {
                this.referenceCount = referenceCount;
                return this;
            }

            /**
             * The description of the rule.
             */
            public Builder ruleDesc(String ruleDesc) {
                this.ruleDesc = ruleDesc;
                return this;
            }

            /**
             * The ID of the masking rule.
             */
            public Builder ruleId(Integer ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * The name of the masking rule.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * The algorithm used for masking.
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            public DesensitizationRuleList build() {
                return new DesensitizationRuleList(this);
            } 

        } 

    }
}
