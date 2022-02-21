// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMqttTraceMessageSubscribeResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMqttTraceMessageSubscribeResponseBody</p>
 */
public class QueryMqttTraceMessageSubscribeResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("MessageTraceLists")
    private java.util.List < MessageTraceLists> messageTraceLists;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
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
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * MessageTraceLists.
         */
        public Builder messageTraceLists(java.util.List < MessageTraceLists> messageTraceLists) {
            this.messageTraceLists = messageTraceLists;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public QueryMqttTraceMessageSubscribeResponseBody build() {
            return new QueryMqttTraceMessageSubscribeResponseBody(this);
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
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * ActionCode.
             */
            public Builder actionCode(String actionCode) {
                this.actionCode = actionCode;
                return this;
            }

            /**
             * ActionInfo.
             */
            public Builder actionInfo(String actionInfo) {
                this.actionInfo = actionInfo;
                return this;
            }

            /**
             * ClientId.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * MsgId.
             */
            public Builder msgId(String msgId) {
                this.msgId = msgId;
                return this;
            }

            /**
             * Time.
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
