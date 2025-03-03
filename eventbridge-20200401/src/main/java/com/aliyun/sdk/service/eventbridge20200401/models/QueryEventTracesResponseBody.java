// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link QueryEventTracesResponseBody} extends {@link TeaModel}
 *
 * <p>QueryEventTracesResponseBody</p>
 */
public class QueryEventTracesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The response code. Valid values:</p>
         * <p>200: The request was successful.</p>
         * <p>Other codes: The request failed. For information about error codes, see Error codes.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The name of the event source.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message that is returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>EventBusNotExist</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BB934571-1F5A-5E17-91DD-E2BC3E1BFBFF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryEventTracesResponseBody build() {
            return new QueryEventTracesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryEventTracesResponseBody} extends {@link TeaModel}
     *
     * <p>QueryEventTracesResponseBody</p>
     */
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
             * <p>The type of the event trace. Valid values: PutEvent, FilterEvent, and PushEvent. The value PutEvent indicates that the event was delivered. The value FilterEvent indicates that the event was filtered. The value PushEvent indicates that the event was pushed.</p>
             * 
             * <strong>example:</strong>
             * <p>PutEvent</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The execution time of the event trace.</p>
             * 
             * <strong>example:</strong>
             * <p>1659495343896</p>
             */
            public Builder actionTime(Long actionTime) {
                this.actionTime = actionTime;
                return this;
            }

            /**
             * <p>The endpoint of the event target. This parameter is returned only if Action is set to PushEvent.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:mns:cn-zhangjiakou:123456789098****:queues/testQueue</p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The name of the event bus.</p>
             * 
             * <strong>example:</strong>
             * <p>demo</p>
             */
            public Builder eventBusName(String eventBusName) {
                this.eventBusName = eventBusName;
                return this;
            }

            /**
             * <p>The event ID.</p>
             * 
             * <strong>example:</strong>
             * <p>a5747e4f-2af2-40b6-b262-d0140e995bf7</p>
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>The name of the event source.</p>
             * 
             * <strong>example:</strong>
             * <p>cert-api</p>
             */
            public Builder eventSource(String eventSource) {
                this.eventSource = eventSource;
                return this;
            }

            /**
             * <p>The delay period for which the event was delivered to the event target. This parameter is returned only if Action is set to PushEvent.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder notifyLatency(String notifyLatency) {
                this.notifyLatency = notifyLatency;
                return this;
            }

            /**
             * <p>The delivery status.</p>
             * 
             * <strong>example:</strong>
             * <p>[200]Ok</p>
             */
            public Builder notifyStatus(String notifyStatus) {
                this.notifyStatus = notifyStatus;
                return this;
            }

            /**
             * <p>The time when the event was delivered to the event target. This parameter is returned only if Action is set to PushEvent.</p>
             * 
             * <strong>example:</strong>
             * <p>1659495343896</p>
             */
            public Builder notifyTime(Long notifyTime) {
                this.notifyTime = notifyTime;
                return this;
            }

            /**
             * <p>The time when the event was delivered to the event bus. This parameter is returned only if Action is set to PutEvent.</p>
             * 
             * <strong>example:</strong>
             * <p>1659495343896</p>
             */
            public Builder receivedTime(Long receivedTime) {
                this.receivedTime = receivedTime;
                return this;
            }

            /**
             * <p>The time when the event rule was matched. This parameter is returned only if Action is set to FilterEvent.</p>
             * 
             * <strong>example:</strong>
             * <p>1659495343896</p>
             */
            public Builder ruleMatchingTime(String ruleMatchingTime) {
                this.ruleMatchingTime = ruleMatchingTime;
                return this;
            }

            /**
             * <p>The name of the event rule.</p>
             * 
             * <strong>example:</strong>
             * <p>ramrolechange-mns</p>
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
