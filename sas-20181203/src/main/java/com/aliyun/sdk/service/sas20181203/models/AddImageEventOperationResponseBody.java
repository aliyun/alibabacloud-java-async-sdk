// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddImageEventOperationResponseBody} extends {@link TeaModel}
 *
 * <p>AddImageEventOperationResponseBody</p>
 */
public class AddImageEventOperationResponseBody extends TeaModel {
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

    private AddImageEventOperationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddImageEventOperationResponseBody create() {
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
         * The HTTP status code.
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

        public AddImageEventOperationResponseBody build() {
            return new AddImageEventOperationResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Conditions")
        private String conditions;

        @NameInMap("EventKey")
        private String eventKey;

        @NameInMap("EventName")
        private String eventName;

        @NameInMap("EventType")
        private String eventType;

        @NameInMap("Id")
        private Long id;

        @NameInMap("OperationCode")
        private String operationCode;

        @NameInMap("Scenarios")
        private String scenarios;

        private Data(Builder builder) {
            this.conditions = builder.conditions;
            this.eventKey = builder.eventKey;
            this.eventName = builder.eventName;
            this.eventType = builder.eventType;
            this.id = builder.id;
            this.operationCode = builder.operationCode;
            this.scenarios = builder.scenarios;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return conditions
         */
        public String getConditions() {
            return this.conditions;
        }

        /**
         * @return eventKey
         */
        public String getEventKey() {
            return this.eventKey;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return operationCode
         */
        public String getOperationCode() {
            return this.operationCode;
        }

        /**
         * @return scenarios
         */
        public String getScenarios() {
            return this.scenarios;
        }

        public static final class Builder {
            private String conditions; 
            private String eventKey; 
            private String eventName; 
            private String eventType; 
            private Long id; 
            private String operationCode; 
            private String scenarios; 

            /**
             * The rule conditions. The value is in the JSON format. Valid values of keys:
             * <p>
             * 
             * *   **condition**: the matching condition.
             * *   **type**: the matching type.
             * *   **value**: the matching value.
             */
            public Builder conditions(String conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * The keyword of the alert item.
             */
            public Builder eventKey(String eventKey) {
                this.eventKey = eventKey;
                return this;
            }

            /**
             * The name of the alert item.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

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
             * The primary key of the alert handling rule.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The operation code.
             * <p>
             * 
             * *   Only **whitelist** may be returned, which indicates that the alert item is added to the whitelist.
             */
            public Builder operationCode(String operationCode) {
                this.operationCode = operationCode;
                return this;
            }

            /**
             * The application scope of the rule. The value is in the JSON format. Valid values of keys:
             * <p>
             * 
             * *   **type**
             * *   **value**
             */
            public Builder scenarios(String scenarios) {
                this.scenarios = scenarios;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
