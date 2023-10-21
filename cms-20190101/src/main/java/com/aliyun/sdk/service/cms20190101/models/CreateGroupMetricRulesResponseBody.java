// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGroupMetricRulesResponseBody} extends {@link TeaModel}
 *
 * <p>CreateGroupMetricRulesResponseBody</p>
 */
public class CreateGroupMetricRulesResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Resources")
    private Resources resources;

    @NameInMap("Success")
    private Boolean success;

    private CreateGroupMetricRulesResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resources = builder.resources;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGroupMetricRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resources
     */
    public Resources getResources() {
        return this.resources;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private Resources resources; 
        private Boolean success; 

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call is successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The error message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * The details of the alert rules.
         */
        public Builder resources(Resources resources) {
            this.resources = resources;
            return this;
        }

        /**
         * Indicates whether the call is successful. Valid value:
         * <p>
         * 
         * - true: The call is successful.
         * - false: The call fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateGroupMetricRulesResponseBody build() {
            return new CreateGroupMetricRulesResponseBody(this);
        } 

    } 

    public static class AlertResult extends TeaModel {
        @NameInMap("Code")
        private Integer code;

        @NameInMap("Message")
        private String message;

        @NameInMap("RuleId")
        private String ruleId;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("Success")
        private Boolean success;

        private AlertResult(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertResult create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
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
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private Integer code; 
            private String message; 
            private String ruleId; 
            private String ruleName; 
            private Boolean success; 

            /**
             * The status code that is returned for the alert rule.
             * <p>
             * 
             * >  The status code 200 indicates that the call is successful.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * The error message that is returned for the alert rule.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The ID of the alert rule.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * The name of the alert rule.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * Indicates whether the alert rule was created. Valid value:
             * <p>
             * 
             * - true: The alert rule was created.
             * - false: The alert rule failed to be created.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public AlertResult build() {
                return new AlertResult(this);
            } 

        } 

    }
    public static class Resources extends TeaModel {
        @NameInMap("AlertResult")
        private java.util.List < AlertResult> alertResult;

        private Resources(Builder builder) {
            this.alertResult = builder.alertResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return alertResult
         */
        public java.util.List < AlertResult> getAlertResult() {
            return this.alertResult;
        }

        public static final class Builder {
            private java.util.List < AlertResult> alertResult; 

            /**
             * AlertResult.
             */
            public Builder alertResult(java.util.List < AlertResult> alertResult) {
                this.alertResult = alertResult;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
}
