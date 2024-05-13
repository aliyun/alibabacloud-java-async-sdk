// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTaskFlowTimeVariablesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTaskFlowTimeVariablesResponseBody</p>
 */
public class ListTaskFlowTimeVariablesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TimeVariables")
    private TimeVariables timeVariables;

    private ListTaskFlowTimeVariablesResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.timeVariables = builder.timeVariables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTaskFlowTimeVariablesResponseBody create() {
        return builder().build();
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
     * @return timeVariables
     */
    public TimeVariables getTimeVariables() {
        return this.timeVariables;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private TimeVariables timeVariables; 

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
         * *   **true**: The request was successful.
         * *   **false**: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The time variables for the task flow.
         */
        public Builder timeVariables(TimeVariables timeVariables) {
            this.timeVariables = timeVariables;
            return this;
        }

        public ListTaskFlowTimeVariablesResponseBody build() {
            return new ListTaskFlowTimeVariablesResponseBody(this);
        } 

    } 

    public static class TimeVariable extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Pattern")
        private String pattern;

        private TimeVariable(Builder builder) {
            this.name = builder.name;
            this.pattern = builder.pattern;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeVariable create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pattern
         */
        public String getPattern() {
            return this.pattern;
        }

        public static final class Builder {
            private String name; 
            private String pattern; 

            /**
             * The name of the time variable.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The format of the time variable.
             */
            public Builder pattern(String pattern) {
                this.pattern = pattern;
                return this;
            }

            public TimeVariable build() {
                return new TimeVariable(this);
            } 

        } 

    }
    public static class TimeVariables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TimeVariable")
        private java.util.List < TimeVariable> timeVariable;

        private TimeVariables(Builder builder) {
            this.timeVariable = builder.timeVariable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeVariables create() {
            return builder().build();
        }

        /**
         * @return timeVariable
         */
        public java.util.List < TimeVariable> getTimeVariable() {
            return this.timeVariable;
        }

        public static final class Builder {
            private java.util.List < TimeVariable> timeVariable; 

            /**
             * TimeVariable.
             */
            public Builder timeVariable(java.util.List < TimeVariable> timeVariable) {
                this.timeVariable = timeVariable;
                return this;
            }

            public TimeVariables build() {
                return new TimeVariables(this);
            } 

        } 

    }
}
