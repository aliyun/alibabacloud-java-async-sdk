// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryMqttTraceMessageSubscribeResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMqttTraceMessageSubscribeResponseBody</p>
 */
public class QueryMqttTraceMessageSubscribeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("MessageTraceLists")
    private java.util.List < MessageTraceLists> messageTraceLists;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private QueryMqttTraceMessageSubscribeResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.messageTraceLists = builder.messageTraceLists;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMqttTraceMessageSubscribeResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return messageTraceLists
     */
    public java.util.List < MessageTraceLists> getMessageTraceLists() {
        return this.messageTraceLists;
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
        private java.util.List < MessageTraceLists> messageTraceLists; 
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
         * <p>The delivery trace of the queried message.</p>
         */
        public Builder messageTraceLists(java.util.List < MessageTraceLists> messageTraceLists) {
            this.messageTraceLists = messageTraceLists;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The unique ID that the system generates for the request. You can use the ID to troubleshoot issues. This parameter is a common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>4E685844-ADAF-4D85-9EAC-F9471E8C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned delivery traces.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public QueryMqttTraceMessageSubscribeResponseBody build() {
            return new QueryMqttTraceMessageSubscribeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryMqttTraceMessageSubscribeResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMqttTraceMessageSubscribeResponseBody</p>
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

            /**
             * <p>The action on the message. Valid values:</p>
             * <ul>
             * <li><strong>sub</strong>: The ApsaraMQ for MQTT client subscribes to the message.</li>
             * <li><strong>push_offline</strong>: The ApsaraMQ for MQTT broker pushes the offline message to the ApsaraMQ for MQTT client.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sub</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The code returned for the action on the message. Valid values:</p>
             * <ul>
             * <li><strong>mqtt.trace.action.msg.sub</strong>: The value that is returned if the value of Action is <strong>sub</strong>.</li>
             * <li><strong>mqtt.trace.action.msg.push.offline</strong>: The value that is returned if the value of Action is <strong>push_offline</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>mqtt.trace.action.msg.sub</p>
             */
            public Builder actionCode(String actionCode) {
                this.actionCode = actionCode;
                return this;
            }

            /**
             * <p>The returned information for the action on the message. Valid values:</p>
             * <ul>
             * <li><strong>Push To Mqtt Client</strong>: The value that is returned if the value of Action is <strong>sub</strong>.</li>
             * <li><strong>Push Offline Msg To Mqtt Client</strong>: The value that is returned if the value of Action is <strong>push_offline</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Push To Mqtt Client</p>
             */
            public Builder actionInfo(String actionInfo) {
                this.actionInfo = actionInfo;
                return this;
            }

            /**
             * <p>The ID of the client that subscribes to the message.</p>
             * 
             * <strong>example:</strong>
             * <p>GID_test@@@consumer</p>
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * <p>The message ID.</p>
             * 
             * <strong>example:</strong>
             * <p>AC1EC1B33D5978308DB17F3245E4****</p>
             */
            public Builder msgId(String msgId) {
                this.msgId = msgId;
                return this;
            }

            /**
             * <p>The time when the message was delivered.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-25 16:46:41.274</p>
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
