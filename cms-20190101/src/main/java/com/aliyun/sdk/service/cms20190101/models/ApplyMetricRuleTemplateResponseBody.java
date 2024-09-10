// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyMetricRuleTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>ApplyMetricRuleTemplateResponseBody</p>
 */
public class ApplyMetricRuleTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resource")
    private Resource resource;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ApplyMetricRuleTemplateResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resource = builder.resource;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyMetricRuleTemplateResponseBody create() {
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
     * @return resource
     */
    public Resource getResource() {
        return this.resource;
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
        private Resource resource; 
        private Boolean success; 

        /**
         * The responses code.
         * <p>
         * 
         * >  The status code 200 indicates that the request was successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The resources that are affected by the alert rule.
         */
        public Builder resource(Resource resource) {
            this.resource = resource;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ApplyMetricRuleTemplateResponseBody build() {
            return new ApplyMetricRuleTemplateResponseBody(this);
        } 

    } 

    public static class AlertResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private AlertResults(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertResults create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
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
            private String code; 
            private String message; 
            private String ruleId; 
            private String ruleName; 
            private Boolean success; 

            /**
             * The responses code.
             * <p>
             * 
             * >  The status code 200 indicates that the request was successful.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The returned message.
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
             * Indicates whether the request was successful. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public AlertResults build() {
                return new AlertResults(this);
            } 

        } 

    }
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertResults")
        private java.util.List < AlertResults> alertResults;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Long groupId;

        private Resource(Builder builder) {
            this.alertResults = builder.alertResults;
            this.groupId = builder.groupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
        }

        /**
         * @return alertResults
         */
        public java.util.List < AlertResults> getAlertResults() {
            return this.alertResults;
        }

        /**
         * @return groupId
         */
        public Long getGroupId() {
            return this.groupId;
        }

        public static final class Builder {
            private java.util.List < AlertResults> alertResults; 
            private Long groupId; 

            /**
             * The details of the generated alert rule.
             */
            public Builder alertResults(java.util.List < AlertResults> alertResults) {
                this.alertResults = alertResults;
                return this;
            }

            /**
             * The ID of the application group.
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
}
