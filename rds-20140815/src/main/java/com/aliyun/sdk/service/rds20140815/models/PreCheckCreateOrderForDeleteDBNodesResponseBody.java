// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(PreCheckCreateOrderForDeleteDBNodesResponseBody model) {
            this.failures = model.failures;
            this.preCheckResult = model.preCheckResult;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the failed order.</p>
         */
        public Builder failures(Failures failures) {
            this.failures = failures;
            return this;
        }

        /**
         * <p>The precheck result.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder preCheckResult(Boolean preCheckResult) {
            this.preCheckResult = preCheckResult;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9B415BC6-FE84-5323-A255-42CF330DB99C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PreCheckCreateOrderForDeleteDBNodesResponseBody build() {
            return new PreCheckCreateOrderForDeleteDBNodesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PreCheckCreateOrderForDeleteDBNodesResponseBody} extends {@link TeaModel}
     *
     * <p>PreCheckCreateOrderForDeleteDBNodesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(FailuresFailures model) {
                this.code = model.code;
                this.message = model.message;
            } 

            /**
             * <p>The response code. Valid values:</p>
             * <ul>
             * <li><strong>200</strong>: success</li>
             * <li><strong>400</strong>: client error</li>
             * <li><strong>401</strong>: identity authentication failed</li>
             * <li><strong>404</strong>: requested page not found</li>
             * <li><strong>500</strong>: server error</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The returned message.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
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
    /**
     * 
     * {@link PreCheckCreateOrderForDeleteDBNodesResponseBody} extends {@link TeaModel}
     *
     * <p>PreCheckCreateOrderForDeleteDBNodesResponseBody</p>
     */
    public static class Failures extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Failures")
        private java.util.List<FailuresFailures> failures;

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
        public java.util.List<FailuresFailures> getFailures() {
            return this.failures;
        }

        public static final class Builder {
            private java.util.List<FailuresFailures> failures; 

            private Builder() {
            } 

            private Builder(Failures model) {
                this.failures = model.failures;
            } 

            /**
             * <p>The information about the failed order.</p>
             */
            public Builder failures(java.util.List<FailuresFailures> failures) {
                this.failures = failures;
                return this;
            }

            public Failures build() {
                return new Failures(this);
            } 

        } 

    }
}
