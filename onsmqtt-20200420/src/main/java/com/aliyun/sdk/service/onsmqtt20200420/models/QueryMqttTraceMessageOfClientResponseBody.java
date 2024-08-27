// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMqttTraceMessageOfClientResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMqttTraceMessageOfClientResponseBody</p>
 */
public class QueryMqttTraceMessageOfClientResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("MessageOfClientList")
    private java.util.List < MessageOfClientList> messageOfClientList;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private QueryMqttTraceMessageOfClientResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.messageOfClientList = builder.messageOfClientList;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMqttTraceMessageOfClientResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return messageOfClientList
     */
    public java.util.List < MessageOfClientList> getMessageOfClientList() {
        return this.messageOfClientList;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer currentPage; 
        private java.util.List < MessageOfClientList> messageOfClientList; 
        private Integer pageSize; 
        private String requestId; 
        private Long total; 

        /**
         * The page number of the returned page.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The returned messages.
         */
        public Builder messageOfClientList(java.util.List < MessageOfClientList> messageOfClientList) {
            this.messageOfClientList = messageOfClientList;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID. You can use the ID to troubleshoot issues. This parameter is a common parameter.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of messages returned.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public QueryMqttTraceMessageOfClientResponseBody build() {
            return new QueryMqttTraceMessageOfClientResponseBody(this);
        } 

    } 

    public static class MessageOfClientList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("ActionCode")
        private String actionCode;

        @com.aliyun.core.annotation.NameInMap("ActionInfo")
        private String actionInfo;

        @com.aliyun.core.annotation.NameInMap("ClientId")
        private String clientId;

        @com.aliyun.core.annotation.NameInMap("MsgId")
        private String msgId;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        private MessageOfClientList(Builder builder) {
            this.action = builder.action;
            this.actionCode = builder.actionCode;
            this.actionInfo = builder.actionInfo;
            this.clientId = builder.clientId;
            this.msgId = builder.msgId;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MessageOfClientList create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return actionCode
         */
        public String getActionCode() {
            return this.actionCode;
        }

        /**
         * @return actionInfo
         */
        public String getActionInfo() {
            return this.actionInfo;
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return msgId
         */
        public String getMsgId() {
            return this.msgId;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private String action; 
            private String actionCode; 
            private String actionInfo; 
            private String clientId; 
            private String msgId; 
            private String time; 

            /**
             * The action on the message. Valid values:
             * <p>
             * 
             * *   **pub_mqtt**: The ApsaraMQ for MQTT client sends the message.
             * *   **sub**: The ApsaraMQ for MQTT client subscribes to the message.
             * *   **push_offline**: The ApsaraMQ for MQTT broker pushes the offline message to the ApsaraMQ for MQTT client.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * The returned code for the action on the message. Valid values:
             * <p>
             * 
             * *   **mqtt.trace.action.msg.pub.mqtt**: This value is returned if the value of Action is **pub_mqtt**.
             * *   **mqtt.trace.action.msg.sub**: This value is returned if the value of Action is **sub**.
             * *   **mqtt.trace.action.msg.push.offline**: This value is returned if the value of Action is **push_offline**.
             */
            public Builder actionCode(String actionCode) {
                this.actionCode = actionCode;
                return this;
            }

            /**
             * The information returned for the action on the message. Valid values:
             * <p>
             * 
             * *   **Pub From Mqtt Client**: This value is returned if the value of Action is **pub_mqtt**.
             * *   **Push To Mqtt Client**: This value is returned if the value of Action is **sub**.
             * *   **Push Offline Msg To Mqtt Client**: This value is returned if the value of Action is **push_offline**.
             */
            public Builder actionInfo(String actionInfo) {
                this.actionInfo = actionInfo;
                return this;
            }

            /**
             * The client ID of the device.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * The message ID.
             */
            public Builder msgId(String msgId) {
                this.msgId = msgId;
                return this;
            }

            /**
             * The time when the message was sent or received.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public MessageOfClientList build() {
                return new MessageOfClientList(this);
            } 

        } 

    }
}
