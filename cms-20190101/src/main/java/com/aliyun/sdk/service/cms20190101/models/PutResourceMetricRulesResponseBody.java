// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PutResourceMetricRulesResponseBody} extends {@link TeaModel}
 *
 * <p>PutResourceMetricRulesResponseBody</p>
 */
public class PutResourceMetricRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("FailedListResult")
    private FailedListResult failedListResult;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The response code.</p>
         * <blockquote>
         * <p> The status code 200 indicates that the request was successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The alert rules that failed to be created for the resource.</p>
         */
        public Builder failedListResult(FailedListResult failedListResult) {
            this.failedListResult = failedListResult;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The request processing has failed due to some unknown error.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>15D1440E-BF24-5A41-93E4-36864635179E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public PutResourceMetricRulesResponseBody build() {
            return new PutResourceMetricRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PutResourceMetricRulesResponseBody} extends {@link TeaModel}
     *
     * <p>PutResourceMetricRulesResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Success")
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
             * <p>The response code.</p>
             * 
             * <strong>example:</strong>
             * <p>404</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The error message returned.</p>
             * 
             * <strong>example:</strong>
             * <p>The request processing has failed due to some unknown error.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>Indicates whether the request was successful. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link PutResourceMetricRulesResponseBody} extends {@link TeaModel}
     *
     * <p>PutResourceMetricRulesResponseBody</p>
     */
    public static class Target extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Result")
        private Result result;

        @com.aliyun.core.annotation.NameInMap("RuleId")
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
             * <p>The alert rule that failed to be created.</p>
             */
            public Builder result(Result result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The ID of the alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>a151cd6023eacee2f0978e03863cc1697c89508****</p>
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
    /**
     * 
     * {@link PutResourceMetricRulesResponseBody} extends {@link TeaModel}
     *
     * <p>PutResourceMetricRulesResponseBody</p>
     */
    public static class FailedListResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Target")
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
