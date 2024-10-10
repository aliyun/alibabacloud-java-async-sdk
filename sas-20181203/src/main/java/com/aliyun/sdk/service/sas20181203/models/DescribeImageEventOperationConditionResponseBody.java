// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeImageEventOperationConditionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageEventOperationConditionResponseBody</p>
 */
public class DescribeImageEventOperationConditionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ADE57832-9666-511C-9A80-B87DE2E8****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeImageEventOperationConditionResponseBody build() {
            return new DescribeImageEventOperationConditionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImageEventOperationConditionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageEventOperationConditionResponseBody</p>
     */
    public static class Conditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConditionKey")
        private String conditionKey;

        @com.aliyun.core.annotation.NameInMap("ConditionName")
        private String conditionName;

        @com.aliyun.core.annotation.NameInMap("SupportedMisType")
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
             * <p>The keyword of the condition. Valid values:</p>
             * <ul>
             * <li><strong>MD5</strong></li>
             * <li><strong>PATH</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MD5</p>
             */
            public Builder conditionKey(String conditionKey) {
                this.conditionKey = conditionKey;
                return this;
            }

            /**
             * <p>The name of the condition.</p>
             * 
             * <strong>example:</strong>
             * <p>MD5</p>
             */
            public Builder conditionName(String conditionName) {
                this.conditionName = conditionName;
                return this;
            }

            /**
             * <p>The matching types.</p>
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
    /**
     * 
     * {@link DescribeImageEventOperationConditionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageEventOperationConditionResponseBody</p>
     */
    public static class Operations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Conditions")
        private java.util.List < Conditions> conditions;

        @com.aliyun.core.annotation.NameInMap("OperationCode")
        private String operationCode;

        @com.aliyun.core.annotation.NameInMap("OperationName")
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
             * <p>The rule conditions.</p>
             */
            public Builder conditions(java.util.List < Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * <p>The operation code.</p>
             * <ul>
             * <li>Only <strong>whitelist</strong> may be returned, which indicates that the alert event is added to the whitelist.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>whitelist</p>
             */
            public Builder operationCode(String operationCode) {
                this.operationCode = operationCode;
                return this;
            }

            /**
             * <p>The name of the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>whitelist</p>
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
    /**
     * 
     * {@link DescribeImageEventOperationConditionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageEventOperationConditionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("Operations")
        private java.util.List < Operations> operations;

        @com.aliyun.core.annotation.NameInMap("Scenarios")
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
             * <p>The alert type.</p>
             * <ul>
             * <li>Only <strong>sensitiveFile</strong> may be returned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sensitiveFile</p>
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * <p>The operations.</p>
             */
            public Builder operations(java.util.List < Operations> operations) {
                this.operations = operations;
                return this;
            }

            /**
             * <p>The application scopes of the rules.</p>
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
