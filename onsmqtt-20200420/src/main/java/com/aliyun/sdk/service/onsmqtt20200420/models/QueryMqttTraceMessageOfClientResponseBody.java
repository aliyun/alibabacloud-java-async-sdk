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
 * {@link QueryMqttTraceMessageOfClientResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMqttTraceMessageOfClientResponseBody</p>
 */
public class QueryMqttTraceMessageOfClientResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("MessageOfClientList")
    private java.util.List<MessageOfClientList> messageOfClientList;

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
    public java.util.List<MessageOfClientList> getMessageOfClientList() {
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
        private java.util.List<MessageOfClientList> messageOfClientList; 
        private Integer pageSize; 
        private String requestId; 
        private Long total; 

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The returned messages.</p>
         */
        public Builder messageOfClientList(java.util.List<MessageOfClientList> messageOfClientList) {
            this.messageOfClientList = messageOfClientList;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID. You can use the ID to troubleshoot issues. This parameter is a common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>B096B9D6-62F3-4567-BB59-58D1362E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of messages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public QueryMqttTraceMessageOfClientResponseBody build() {
            return new QueryMqttTraceMessageOfClientResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryMqttTraceMessageOfClientResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMqttTraceMessageOfClientResponseBody</p>
     */
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
             * <p>The action on the message. Valid values:</p>
             * <ul>
             * <li><strong>pub_mqtt</strong>: The ApsaraMQ for MQTT client sends the message.</li>
             * <li><strong>sub</strong>: The ApsaraMQ for MQTT client subscribes to the message.</li>
             * <li><strong>push_offline</strong>: The ApsaraMQ for MQTT broker pushes the offline message to the ApsaraMQ for MQTT client.</li>
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
             * <li><strong>mqtt.trace.action.msg.sub</strong>: This value is returned if the value of Action is <strong>sub</strong>.</li>
             * <li><strong>mqtt.trace.action.msg.push.offline</strong>: This value is returned if the value of Action is <strong>push_offline</strong>.</li>
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
             * <p>The information returned for the action on the message. Valid values:</p>
             * <ul>
             * <li><strong>Pub From Mqtt Client</strong>: This value is returned if the value of Action is <strong>pub_mqtt</strong>.</li>
             * <li><strong>Push To Mqtt Client</strong>: This value is returned if the value of Action is <strong>sub</strong>.</li>
             * <li><strong>Push Offline Msg To Mqtt Client</strong>: This value is returned if the value of Action is <strong>push_offline</strong>.</li>
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
             * <p>The client ID of the device.</p>
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
             * <p>AC1EC0030EAB78308DB16A3EC773****</p>
             */
            public Builder msgId(String msgId) {
                this.msgId = msgId;
                return this;
            }

            /**
             * <p>The time when the message was sent or received.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-21 15:08:19.234</p>
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
