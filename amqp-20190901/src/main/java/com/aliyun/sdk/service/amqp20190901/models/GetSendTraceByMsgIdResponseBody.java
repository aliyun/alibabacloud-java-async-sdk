// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp20190901.models;

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
 * {@link GetSendTraceByMsgIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetSendTraceByMsgIdResponseBody</p>
 */
public class GetSendTraceByMsgIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetSendTraceByMsgIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSendTraceByMsgIdResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetSendTraceByMsgIdResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetSendTraceByMsgIdResponseBody build() {
            return new GetSendTraceByMsgIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSendTraceByMsgIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetSendTraceByMsgIdResponseBody</p>
     */
    public static class VoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Exchange")
        private String exchange;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("MessageBodyLength")
        private String messageBodyLength;

        @com.aliyun.core.annotation.NameInMap("MessagePropertiesMap")
        private java.util.Map<String, ?> messagePropertiesMap;

        @com.aliyun.core.annotation.NameInMap("QueueMsgIdMap")
        private java.util.Map<String, ?> queueMsgIdMap;

        @com.aliyun.core.annotation.NameInMap("RemoteAddress")
        private String remoteAddress;

        @com.aliyun.core.annotation.NameInMap("RoutingKey")
        private String routingKey;

        @com.aliyun.core.annotation.NameInMap("SendErrorInfo")
        private String sendErrorInfo;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("Vhost")
        private String vhost;

        private VoList(Builder builder) {
            this.code = builder.code;
            this.exchange = builder.exchange;
            this.instanceId = builder.instanceId;
            this.messageBodyLength = builder.messageBodyLength;
            this.messagePropertiesMap = builder.messagePropertiesMap;
            this.queueMsgIdMap = builder.queueMsgIdMap;
            this.remoteAddress = builder.remoteAddress;
            this.routingKey = builder.routingKey;
            this.sendErrorInfo = builder.sendErrorInfo;
            this.timeStamp = builder.timeStamp;
            this.userId = builder.userId;
            this.vhost = builder.vhost;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VoList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return exchange
         */
        public String getExchange() {
            return this.exchange;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return messageBodyLength
         */
        public String getMessageBodyLength() {
            return this.messageBodyLength;
        }

        /**
         * @return messagePropertiesMap
         */
        public java.util.Map<String, ?> getMessagePropertiesMap() {
            return this.messagePropertiesMap;
        }

        /**
         * @return queueMsgIdMap
         */
        public java.util.Map<String, ?> getQueueMsgIdMap() {
            return this.queueMsgIdMap;
        }

        /**
         * @return remoteAddress
         */
        public String getRemoteAddress() {
            return this.remoteAddress;
        }

        /**
         * @return routingKey
         */
        public String getRoutingKey() {
            return this.routingKey;
        }

        /**
         * @return sendErrorInfo
         */
        public String getSendErrorInfo() {
            return this.sendErrorInfo;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return vhost
         */
        public String getVhost() {
            return this.vhost;
        }

        public static final class Builder {
            private String code; 
            private String exchange; 
            private String instanceId; 
            private String messageBodyLength; 
            private java.util.Map<String, ?> messagePropertiesMap; 
            private java.util.Map<String, ?> queueMsgIdMap; 
            private String remoteAddress; 
            private String routingKey; 
            private String sendErrorInfo; 
            private String timeStamp; 
            private String userId; 
            private String vhost; 

            private Builder() {
            } 

            private Builder(VoList model) {
                this.code = model.code;
                this.exchange = model.exchange;
                this.instanceId = model.instanceId;
                this.messageBodyLength = model.messageBodyLength;
                this.messagePropertiesMap = model.messagePropertiesMap;
                this.queueMsgIdMap = model.queueMsgIdMap;
                this.remoteAddress = model.remoteAddress;
                this.routingKey = model.routingKey;
                this.sendErrorInfo = model.sendErrorInfo;
                this.timeStamp = model.timeStamp;
                this.userId = model.userId;
                this.vhost = model.vhost;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Exchange.
             */
            public Builder exchange(String exchange) {
                this.exchange = exchange;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * MessageBodyLength.
             */
            public Builder messageBodyLength(String messageBodyLength) {
                this.messageBodyLength = messageBodyLength;
                return this;
            }

            /**
             * MessagePropertiesMap.
             */
            public Builder messagePropertiesMap(java.util.Map<String, ?> messagePropertiesMap) {
                this.messagePropertiesMap = messagePropertiesMap;
                return this;
            }

            /**
             * QueueMsgIdMap.
             */
            public Builder queueMsgIdMap(java.util.Map<String, ?> queueMsgIdMap) {
                this.queueMsgIdMap = queueMsgIdMap;
                return this;
            }

            /**
             * RemoteAddress.
             */
            public Builder remoteAddress(String remoteAddress) {
                this.remoteAddress = remoteAddress;
                return this;
            }

            /**
             * RoutingKey.
             */
            public Builder routingKey(String routingKey) {
                this.routingKey = routingKey;
                return this;
            }

            /**
             * SendErrorInfo.
             */
            public Builder sendErrorInfo(String sendErrorInfo) {
                this.sendErrorInfo = sendErrorInfo;
                return this;
            }

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * Vhost.
             */
            public Builder vhost(String vhost) {
                this.vhost = vhost;
                return this;
            }

            public VoList build() {
                return new VoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSendTraceByMsgIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetSendTraceByMsgIdResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        @com.aliyun.core.annotation.NameInMap("VoList")
        private java.util.List<VoList> voList;

        private Data(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
            this.voList = builder.voList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return voList
         */
        public java.util.List<VoList> getVoList() {
            return this.voList;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 
            private java.util.List<VoList> voList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
                this.voList = model.voList;
            } 

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
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
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * VoList.
             */
            public Builder voList(java.util.List<VoList> voList) {
                this.voList = voList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
