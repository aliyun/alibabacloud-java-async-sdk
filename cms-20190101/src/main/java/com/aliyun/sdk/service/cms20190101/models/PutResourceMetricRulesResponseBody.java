// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutResourceMetricRulesResponseBody} extends {@link TeaModel}
 *
 * <p>PutResourceMetricRulesResponseBody</p>
 */
public class PutResourceMetricRulesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("FailedListResult")
    private FailedListResult failedListResult;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private PutResourceMetricRulesResponseBody(Builder builder) {
        this.code = builder.code;
        this.failedListResult = builder.failedListResult;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutResourceMetricRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return failedListResult
     */
    public FailedListResult getFailedListResult() {
        return this.failedListResult;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private FailedListResult failedListResult; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The callback URL to which a POST request is sent when an alert is triggered based on the alert rule.
         * <p>
         * 
         * Valid values of N: 1 to 500.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder failedListResult(FailedListResult failedListResult) {
            this.failedListResult = failedListResult;
            return this;
        }

        /**
         * The ID of the alert rule.
         * <p>
         * 
         * Valid values of N: 1 to 500.
         * 
         * You can specify a new ID or the ID of an existing alert rule. For information about how to query the ID of an alert rule, see [DescribeMetricRuleList](~~114941~~).
         * 
         * >  If you specify a new ID, you create a threshold-triggered alert rule.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The alert rule that failed to be created.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The key of the tag.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public PutResourceMetricRulesResponseBody build() {
            return new PutResourceMetricRulesResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Message")
        private String message;

        @NameInMap("Success")
        private Boolean success;

        private Result(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
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
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String code; 
            private String message; 
            private Boolean success; 

            /**
             * For more information about common request parameters, see [Common parameters](~~199331~~).
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The ID of the alert rule.
             * <p>
             * 
             * Valid values of N: 1 to 500.
             * 
             * You can specify a new ID or the ID of an existing alert rule. For information about how to query the ID of an alert rule, see [DescribeMetricRuleList](~~114941~~).
             * 
             * >  If you specify a new ID, you create a threshold-triggered alert rule.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The key of the tag.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    public static class Target extends TeaModel {
        @NameInMap("Result")
        private Result result;

        @NameInMap("RuleId")
        private String ruleId;

        private Target(Builder builder) {
            this.result = builder.result;
            this.ruleId = builder.ruleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Target create() {
            return builder().build();
        }

        /**
         * @return result
         */
        public Result getResult() {
            return this.result;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        public static final class Builder {
            private Result result; 
            private String ruleId; 

            /**
             * The alert rules that failed to be created for the resource.
             */
            public Builder result(Result result) {
                this.result = result;
                return this;
            }

            /**
             * The statistical period of the metric.
             * <p>
             * 
             * Unit: seconds. The default value is the interval at which the monitoring data of the metric is collected.
             * 
             * Valid values of N: 1 to 500.
             * 
             * >  For information about how to query the statistical period of a metric, see [Appendix 1: Metrics](~~163515~~).
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            public Target build() {
                return new Target(this);
            } 

        } 

    }
    public static class FailedListResult extends TeaModel {
        @NameInMap("Target")
        private java.util.List < Target> target;

        private FailedListResult(Builder builder) {
            this.target = builder.target;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedListResult create() {
            return builder().build();
        }

        /**
         * @return target
         */
        public java.util.List < Target> getTarget() {
            return this.target;
        }

        public static final class Builder {
            private java.util.List < Target> target; 

            /**
             * Target.
             */
            public Builder target(java.util.List < Target> target) {
                this.target = target;
                return this;
            }

            public FailedListResult build() {
                return new FailedListResult(this);
            } 

        } 

    }
}
