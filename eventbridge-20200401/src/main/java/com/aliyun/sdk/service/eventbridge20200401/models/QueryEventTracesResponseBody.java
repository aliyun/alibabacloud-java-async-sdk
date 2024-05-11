// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link QueryEventTracesResponseBody} extends {@link TeaModel}
 *
 * <p>QueryEventTracesResponseBody</p>
 */
public class QueryEventTracesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryEventTracesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEventTracesResponseBody create() {
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
    public java.util.List < Data> getData() {
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
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The status code returned. The status code 200 indicates that the request was successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The name of the event source.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The error message that is returned if the request failed.
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
         * Indicates whether the request is successful. Valid values: true and false.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryEventTracesResponseBody build() {
            return new QueryEventTracesResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("ActionTime")
        private Long actionTime;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("EventBusName")
        private String eventBusName;

        @com.aliyun.core.annotation.NameInMap("EventId")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("EventSource")
        private String eventSource;

        @com.aliyun.core.annotation.NameInMap("NotifyLatency")
        private String notifyLatency;

        @com.aliyun.core.annotation.NameInMap("NotifyStatus")
        private String notifyStatus;

        @com.aliyun.core.annotation.NameInMap("NotifyTime")
        private Long notifyTime;

        @com.aliyun.core.annotation.NameInMap("ReceivedTime")
        private Long receivedTime;

        @com.aliyun.core.annotation.NameInMap("RuleMatchingTime")
        private String ruleMatchingTime;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        private Data(Builder builder) {
            this.action = builder.action;
            this.actionTime = builder.actionTime;
            this.endpoint = builder.endpoint;
            this.eventBusName = builder.eventBusName;
            this.eventId = builder.eventId;
            this.eventSource = builder.eventSource;
            this.notifyLatency = builder.notifyLatency;
            this.notifyStatus = builder.notifyStatus;
            this.notifyTime = builder.notifyTime;
            this.receivedTime = builder.receivedTime;
            this.ruleMatchingTime = builder.ruleMatchingTime;
            this.ruleName = builder.ruleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return actionTime
         */
        public Long getActionTime() {
            return this.actionTime;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return eventBusName
         */
        public String getEventBusName() {
            return this.eventBusName;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return eventSource
         */
        public String getEventSource() {
            return this.eventSource;
        }

        /**
         * @return notifyLatency
         */
        public String getNotifyLatency() {
            return this.notifyLatency;
        }

        /**
         * @return notifyStatus
         */
        public String getNotifyStatus() {
            return this.notifyStatus;
        }

        /**
         * @return notifyTime
         */
        public Long getNotifyTime() {
            return this.notifyTime;
        }

        /**
         * @return receivedTime
         */
        public Long getReceivedTime() {
            return this.receivedTime;
        }

        /**
         * @return ruleMatchingTime
         */
        public String getRuleMatchingTime() {
            return this.ruleMatchingTime;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        public static final class Builder {
            private String action; 
            private Long actionTime; 
            private String endpoint; 
            private String eventBusName; 
            private String eventId; 
            private String eventSource; 
            private String notifyLatency; 
            private String notifyStatus; 
            private Long notifyTime; 
            private Long receivedTime; 
            private String ruleMatchingTime; 
            private String ruleName; 

            /**
             * The type of the event trace. Valid values: PutEvent: a delivery event. FilterEvent: a filtering event. PushEvent: a pushing event.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * The execution time of the event trace.
             */
            public Builder actionTime(Long actionTime) {
                this.actionTime = actionTime;
                return this;
            }

            /**
             * The endpoint of the event target. This parameter is returned if the value of the Action parameter is PushEvent.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * The name of the event bus.
             */
            public Builder eventBusName(String eventBusName) {
                this.eventBusName = eventBusName;
                return this;
            }

            /**
             * The event ID.
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * The name of the event source.
             */
            public Builder eventSource(String eventSource) {
                this.eventSource = eventSource;
                return this;
            }

            /**
             * The delivery delay of the event target. This parameter is returned if the value of the Action parameter is PushEvent.
             */
            public Builder notifyLatency(String notifyLatency) {
                this.notifyLatency = notifyLatency;
                return this;
            }

            /**
             * The event target delivery status.
             */
            public Builder notifyStatus(String notifyStatus) {
                this.notifyStatus = notifyStatus;
                return this;
            }

            /**
             * The delivery time of the event target. This parameter is returned if the value of the Action parameter is PushEvent.
             */
            public Builder notifyTime(Long notifyTime) {
                this.notifyTime = notifyTime;
                return this;
            }

            /**
             * The time when the event was delivered to the event bus. This parameter is returned if the value of the Action parameter is PutEvent.
             */
            public Builder receivedTime(Long receivedTime) {
                this.receivedTime = receivedTime;
                return this;
            }

            /**
             * The time when the event rule was matched. This parameter is returned if the value of the Action parameter is FilterEvent.
             */
            public Builder ruleMatchingTime(String ruleMatchingTime) {
                this.ruleMatchingTime = ruleMatchingTime;
                return this;
            }

            /**
             * The name of the event rule.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
