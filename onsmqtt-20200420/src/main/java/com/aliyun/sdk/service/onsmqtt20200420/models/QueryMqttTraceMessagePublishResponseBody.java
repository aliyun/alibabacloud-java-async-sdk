// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMqttTraceMessagePublishResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMqttTraceMessagePublishResponseBody</p>
 */
public class QueryMqttTraceMessagePublishResponseBody extends TeaModel {
    @NameInMap("MessageTraceLists")
    private java.util.List < MessageTraceLists> messageTraceLists;

    @NameInMap("RequestId")
    private String requestId;

    private QueryMqttTraceMessagePublishResponseBody(Builder builder) {
        this.messageTraceLists = builder.messageTraceLists;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMqttTraceMessagePublishResponseBody create() {
        return builder().build();
    }

    /**
     * @return messageTraceLists
     */
    public java.util.List < MessageTraceLists> getMessageTraceLists() {
        return this.messageTraceLists;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < MessageTraceLists> messageTraceLists; 
        private String requestId; 

        /**
         * The message traces.
         */
        public Builder messageTraceLists(java.util.List < MessageTraceLists> messageTraceLists) {
            this.messageTraceLists = messageTraceLists;
            return this;
        }

        /**
         * The request ID. You can use the ID to troubleshoot issues. This parameter is a common parameter.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryMqttTraceMessagePublishResponseBody build() {
            return new QueryMqttTraceMessagePublishResponseBody(this);
        } 

    } 

    public static class MessageTraceLists extends TeaModel {
        @NameInMap("Action")
        private String action;

        @NameInMap("ActionCode")
        private String actionCode;

        @NameInMap("ActionInfo")
        private String actionInfo;

        @NameInMap("ClientId")
        private String clientId;

        @NameInMap("MsgId")
        private String msgId;

        @NameInMap("Time")
        private String time;

        private MessageTraceLists(Builder builder) {
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

        public static MessageTraceLists create() {
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
             * *   **pub_mqtt**: indicates that the message was sent by an ApsaraMQ for MQTT client.
             * *   **pub_mq**: indicates that the message was sent by an ApsaraMQ for RocketMQ client.
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
             * *   **mqtt.trace.action.msg.pub.mq**: This value is returned if the value of Action is **pub_mq**.
             */
            public Builder actionCode(String actionCode) {
                this.actionCode = actionCode;
                return this;
            }

            /**
             * The returned information for the action on the message. Valid values:
             * <p>
             * 
             * *   **Pub From Mqtt Client**: This value is returned if the value of Action is **pub_mqtt**.
             * *   **Pub From MQ**: This value is returned if the value of Action is **pub_mq**.
             */
            public Builder actionInfo(String actionInfo) {
                this.actionInfo = actionInfo;
                return this;
            }

            /**
             * The ID of the client that sends the message.
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
             * The time when the message was sent.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public MessageTraceLists build() {
                return new MessageTraceLists(this);
            } 

        } 

    }
}
