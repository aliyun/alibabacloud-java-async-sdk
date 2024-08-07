// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PreCheckCreateOrderForDeleteDBNodesResponseBody} extends {@link TeaModel}
 *
 * <p>PreCheckCreateOrderForDeleteDBNodesResponseBody</p>
 */
public class PreCheckCreateOrderForDeleteDBNodesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Failures")
    private Failures failures;

    @com.aliyun.core.annotation.NameInMap("PreCheckResult")
    private Boolean preCheckResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private PreCheckCreateOrderForDeleteDBNodesResponseBody(Builder builder) {
        this.failures = builder.failures;
        this.preCheckResult = builder.preCheckResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreCheckCreateOrderForDeleteDBNodesResponseBody create() {
        return builder().build();
    }

    /**
     * @return failures
     */
    public Failures getFailures() {
        return this.failures;
    }

    /**
     * @return preCheckResult
     */
    public Boolean getPreCheckResult() {
        return this.preCheckResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Failures failures; 
        private Boolean preCheckResult; 
        private String requestId; 

        /**
         * The information about the failed order.
         */
        public Builder failures(Failures failures) {
            this.failures = failures;
            return this;
        }

        /**
         * The precheck result.
         */
        public Builder preCheckResult(Boolean preCheckResult) {
            this.preCheckResult = preCheckResult;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PreCheckCreateOrderForDeleteDBNodesResponseBody build() {
            return new PreCheckCreateOrderForDeleteDBNodesResponseBody(this);
        } 

    } 

    public static class FailuresFailures extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        private FailuresFailures(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailuresFailures create() {
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

        public static final class Builder {
            private String code; 
            private String message; 

            /**
             * The response code. Valid values:
             * <p>
             * 
             * *   **200**: success
             * *   **400**: client error
             * *   **401**: identity authentication failed
             * *   **404**: requested page not found
             * *   **500**: server error
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

            public FailuresFailures build() {
                return new FailuresFailures(this);
            } 

        } 

    }
    public static class Failures extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Failures")
        private java.util.List < FailuresFailures> failures;

        private Failures(Builder builder) {
            this.failures = builder.failures;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Failures create() {
            return builder().build();
        }

        /**
         * @return failures
         */
        public java.util.List < FailuresFailures> getFailures() {
            return this.failures;
        }

        public static final class Builder {
            private java.util.List < FailuresFailures> failures; 

            /**
             * The information about the failed order.
             */
            public Builder failures(java.util.List < FailuresFailures> failures) {
                this.failures = failures;
                return this;
            }

            public Failures build() {
                return new Failures(this);
            } 

        } 

    }
}
