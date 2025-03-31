// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

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
 * {@link QueryMqttTraceMessagePublishResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMqttTraceMessagePublishResponseBody</p>
 */
public class QueryMqttTraceMessagePublishResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MessageTraceLists")
    private java.util.List<MessageTraceLists> messageTraceLists;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return messageTraceLists
     */
    public java.util.List<MessageTraceLists> getMessageTraceLists() {
        return this.messageTraceLists;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<MessageTraceLists> messageTraceLists; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryMqttTraceMessagePublishResponseBody model) {
            this.messageTraceLists = model.messageTraceLists;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The message traces.</p>
         */
        public Builder messageTraceLists(java.util.List<MessageTraceLists> messageTraceLists) {
            this.messageTraceLists = messageTraceLists;
            return this;
        }

        /**
         * <p>The request ID. You can use the ID to troubleshoot issues. This parameter is a common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>69AD5550-BF22-438A-9202-A6E89185****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryMqttTraceMessagePublishResponseBody build() {
            return new QueryMqttTraceMessagePublishResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryMqttTraceMessagePublishResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMqttTraceMessagePublishResponseBody</p>
     */
    public static class MessageTraceLists extends TeaModel {
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

            private Builder() {
            } 

            private Builder(MessageTraceLists model) {
                this.action = model.action;
                this.actionCode = model.actionCode;
                this.actionInfo = model.actionInfo;
                this.clientId = model.clientId;
                this.msgId = model.msgId;
                this.time = model.time;
            } 

            /**
             * <p>The action on the message. Valid values:</p>
             * <ul>
             * <li><strong>pub_mqtt</strong>: indicates that the message was sent by an ApsaraMQ for MQTT client.</li>
             * <li><strong>pub_mq</strong>: indicates that the message was sent by an ApsaraMQ for RocketMQ client.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pub_mqtt</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The returned code for the action on the message. Valid values:</p>
             * <ul>
             * <li><strong>mqtt.trace.action.msg.pub.mqtt</strong>: This value is returned if the value of Action is <strong>pub_mqtt</strong>.</li>
             * <li><strong>mqtt.trace.action.msg.pub.mq</strong>: This value is returned if the value of Action is <strong>pub_mq</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>mqtt.trace.action.msg.pub.mqtt</p>
             */
            public Builder actionCode(String actionCode) {
                this.actionCode = actionCode;
                return this;
            }

            /**
             * <p>The returned information for the action on the message. Valid values:</p>
             * <ul>
             * <li><strong>Pub From Mqtt Client</strong>: This value is returned if the value of Action is <strong>pub_mqtt</strong>.</li>
             * <li><strong>Pub From MQ</strong>: This value is returned if the value of Action is <strong>pub_mq</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Pub From Mqtt Client</p>
             */
            public Builder actionInfo(String actionInfo) {
                this.actionInfo = actionInfo;
                return this;
            }

            /**
             * <p>The ID of the client that sends the message.</p>
             * 
             * <strong>example:</strong>
             * <p>GID_test@@@producer</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The message ID.</p>
             * 
             * <strong>example:</strong>
             * <p>AC1EC0030EAB78308DB16A3EC773BD95</p>
             */
            public Builder msgId(String msgId) {
                this.msgId = msgId;
                return this;
            }

            /**
             * <p>The time when the message was sent.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-21 15:08:19.210</p>
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
