// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageEventOperationConditionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageEventOperationConditionResponseBody</p>
 */
public class DescribeImageEventOperationConditionResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeImageEventOperationConditionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageEventOperationConditionResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The response code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeImageEventOperationConditionResponseBody build() {
            return new DescribeImageEventOperationConditionResponseBody(this);
        } 

    } 

    public static class Conditions extends TeaModel {
        @NameInMap("ConditionKey")
        private String conditionKey;

        @NameInMap("ConditionName")
        private String conditionName;

        @NameInMap("SupportedMisType")
        private java.util.List < String > supportedMisType;

        private Conditions(Builder builder) {
            this.conditionKey = builder.conditionKey;
            this.conditionName = builder.conditionName;
            this.supportedMisType = builder.supportedMisType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conditions create() {
            return builder().build();
        }

        /**
         * @return conditionKey
         */
        public String getConditionKey() {
            return this.conditionKey;
        }

        /**
         * @return conditionName
         */
        public String getConditionName() {
            return this.conditionName;
        }

        /**
         * @return supportedMisType
         */
        public java.util.List < String > getSupportedMisType() {
            return this.supportedMisType;
        }

        public static final class Builder {
            private String conditionKey; 
            private String conditionName; 
            private java.util.List < String > supportedMisType; 

            /**
             * The keyword of the condition. Valid values:
             * <p>
             * 
             * *   **MD5**
             * *   **PATH**
             */
            public Builder conditionKey(String conditionKey) {
                this.conditionKey = conditionKey;
                return this;
            }

            /**
             * The name of the condition.
             */
            public Builder conditionName(String conditionName) {
                this.conditionName = conditionName;
                return this;
            }

            /**
             * The matching types.
             */
            public Builder supportedMisType(java.util.List < String > supportedMisType) {
                this.supportedMisType = supportedMisType;
                return this;
            }

            public Conditions build() {
                return new Conditions(this);
            } 

        } 

    }
    public static class Operations extends TeaModel {
        @NameInMap("Conditions")
        private java.util.List < Conditions> conditions;

        @NameInMap("OperationCode")
        private String operationCode;

        @NameInMap("OperationName")
        private String operationName;

        private Operations(Builder builder) {
            this.conditions = builder.conditions;
            this.operationCode = builder.operationCode;
            this.operationName = builder.operationName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Operations create() {
            return builder().build();
        }

        /**
         * @return conditions
         */
        public java.util.List < Conditions> getConditions() {
            return this.conditions;
        }

        /**
         * @return operationCode
         */
        public String getOperationCode() {
            return this.operationCode;
        }

        /**
         * @return operationName
         */
        public String getOperationName() {
            return this.operationName;
        }

        public static final class Builder {
            private java.util.List < Conditions> conditions; 
            private String operationCode; 
            private String operationName; 

            /**
             * The rule conditions.
             */
            public Builder conditions(java.util.List < Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * The operation code.
             * <p>
             * 
             * *   Only **whitelist** may be returned, which indicates that the alert event is added to the whitelist.
             */
            public Builder operationCode(String operationCode) {
                this.operationCode = operationCode;
                return this;
            }

            /**
             * The name of the operation.
             */
            public Builder operationName(String operationName) {
                this.operationName = operationName;
                return this;
            }

            public Operations build() {
                return new Operations(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("EventType")
        private String eventType;

        @NameInMap("Operations")
        private java.util.List < Operations> operations;

        @NameInMap("Scenarios")
        private java.util.List < String > scenarios;

        private Data(Builder builder) {
            this.eventType = builder.eventType;
            this.operations = builder.operations;
            this.scenarios = builder.scenarios;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return operations
         */
        public java.util.List < Operations> getOperations() {
            return this.operations;
        }

        /**
         * @return scenarios
         */
        public java.util.List < String > getScenarios() {
            return this.scenarios;
        }

        public static final class Builder {
            private String eventType; 
            private java.util.List < Operations> operations; 
            private java.util.List < String > scenarios; 

            /**
             * The alert type.
             * <p>
             * 
             * *   Only **sensitiveFile** may be returned.
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * The operations.
             */
            public Builder operations(java.util.List < Operations> operations) {
                this.operations = operations;
                return this;
            }

            /**
             * The application scopes of the rules.
             */
            public Builder scenarios(java.util.List < String > scenarios) {
                this.scenarios = scenarios;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
