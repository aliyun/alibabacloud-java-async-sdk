// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateGroupMetricRulesResponseBody} extends {@link TeaModel}
 *
 * <p>CreateGroupMetricRulesResponseBody</p>
 */
public class CreateGroupMetricRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resources")
    private Resources resources;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The HTTP status code.</p>
         * <blockquote>
         * <p> The status code 200 indicates that the call is successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The Request is not authorization.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>461CF2CD-2FC3-4B26-8645-7BD27E7D0F1D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the alert rules.</p>
         */
        public Builder resources(Resources resources) {
            this.resources = resources;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. Valid value:</p>
         * <ul>
         * <li>true: The call is successful.</li>
         * <li>false: The call fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateGroupMetricRulesResponseBody build() {
            return new CreateGroupMetricRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateGroupMetricRulesResponseBody} extends {@link TeaModel}
     *
     * <p>CreateGroupMetricRulesResponseBody</p>
     */
    public static class AlertResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Success")
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
             * <p>The status code that is returned for the alert rule.</p>
             * <blockquote>
             * <p> The status code 200 indicates that the call is successful.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The error message that is returned for the alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Metric not found.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The ID of the alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>456789</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS_Rule1</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>Indicates whether the alert rule was created. Valid value:</p>
             * <ul>
             * <li>true: The alert rule was created.</li>
             * <li>false: The alert rule failed to be created.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link CreateGroupMetricRulesResponseBody} extends {@link TeaModel}
     *
     * <p>CreateGroupMetricRulesResponseBody</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertResult")
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
