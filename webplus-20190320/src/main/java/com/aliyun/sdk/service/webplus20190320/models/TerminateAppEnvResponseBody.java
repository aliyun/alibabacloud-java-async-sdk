// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TerminateAppEnvResponseBody} extends {@link TeaModel}
 *
 * <p>TerminateAppEnvResponseBody</p>
 */
public class TerminateAppEnvResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("EnvChangeDetail")
    private EnvChangeDetail envChangeDetail;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private TerminateAppEnvResponseBody(Builder builder) {
        this.code = builder.code;
        this.envChangeDetail = builder.envChangeDetail;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TerminateAppEnvResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return envChangeDetail
     */
    public EnvChangeDetail getEnvChangeDetail() {
        return this.envChangeDetail;
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

    public static final class Builder {
        private String code; 
        private EnvChangeDetail envChangeDetail; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * EnvChangeDetail.
         */
        public Builder envChangeDetail(EnvChangeDetail envChangeDetail) {
            this.envChangeDetail = envChangeDetail;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public TerminateAppEnvResponseBody build() {
            return new TerminateAppEnvResponseBody(this);
        } 

    } 

    public static class Operation extends TeaModel {
        @NameInMap("OperationDescription")
        private String operationDescription;

        @NameInMap("OperationType")
        private String operationType;

        private Operation(Builder builder) {
            this.operationDescription = builder.operationDescription;
            this.operationType = builder.operationType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Operation create() {
            return builder().build();
        }

        /**
         * @return operationDescription
         */
        public String getOperationDescription() {
            return this.operationDescription;
        }

        /**
         * @return operationType
         */
        public String getOperationType() {
            return this.operationType;
        }

        public static final class Builder {
            private String operationDescription; 
            private String operationType; 

            /**
             * OperationDescription.
             */
            public Builder operationDescription(String operationDescription) {
                this.operationDescription = operationDescription;
                return this;
            }

            /**
             * OperationType.
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            public Operation build() {
                return new Operation(this);
            } 

        } 

    }
    public static class Operations extends TeaModel {
        @NameInMap("Operation")
        private java.util.List < Operation> operation;

        private Operations(Builder builder) {
            this.operation = builder.operation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Operations create() {
            return builder().build();
        }

        /**
         * @return operation
         */
        public java.util.List < Operation> getOperation() {
            return this.operation;
        }

        public static final class Builder {
            private java.util.List < Operation> operation; 

            /**
             * Operation.
             */
            public Builder operation(java.util.List < Operation> operation) {
                this.operation = operation;
                return this;
            }

            public Operations build() {
                return new Operations(this);
            } 

        } 

    }
    public static class EnvChangeDetail extends TeaModel {
        @NameInMap("ChangeId")
        private String changeId;

        @NameInMap("EnvId")
        private String envId;

        @NameInMap("Operations")
        private Operations operations;

        @NameInMap("StartTime")
        private String startTime;

        private EnvChangeDetail(Builder builder) {
            this.changeId = builder.changeId;
            this.envId = builder.envId;
            this.operations = builder.operations;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnvChangeDetail create() {
            return builder().build();
        }

        /**
         * @return changeId
         */
        public String getChangeId() {
            return this.changeId;
        }

        /**
         * @return envId
         */
        public String getEnvId() {
            return this.envId;
        }

        /**
         * @return operations
         */
        public Operations getOperations() {
            return this.operations;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String changeId; 
            private String envId; 
            private Operations operations; 
            private String startTime; 

            /**
             * ChangeId.
             */
            public Builder changeId(String changeId) {
                this.changeId = changeId;
                return this;
            }

            /**
             * EnvId.
             */
            public Builder envId(String envId) {
                this.envId = envId;
                return this;
            }

            /**
             * Operations.
             */
            public Builder operations(Operations operations) {
                this.operations = operations;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public EnvChangeDetail build() {
                return new EnvChangeDetail(this);
            } 

        } 

    }
}
