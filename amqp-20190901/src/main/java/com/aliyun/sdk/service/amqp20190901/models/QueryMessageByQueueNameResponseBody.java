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
 * {@link QueryMessageByQueueNameResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMessageByQueueNameResponseBody</p>
 */
public class QueryMessageByQueueNameResponseBody extends TeaModel {
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

    private QueryMessageByQueueNameResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMessageByQueueNameResponseBody create() {
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

        private Builder(QueryMessageByQueueNameResponseBody model) {
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

        public QueryMessageByQueueNameResponseBody build() {
            return new QueryMessageByQueueNameResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryMessageByQueueNameResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMessageByQueueNameResponseBody</p>
     */
    public static class AmqpMessageVO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("Body")
        private String body;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ContentEncoding")
        private String contentEncoding;

        @com.aliyun.core.annotation.NameInMap("ContentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("CorrelationId")
        private String correlationId;

        @com.aliyun.core.annotation.NameInMap("DeliveryMode")
        private Integer deliveryMode;

        @com.aliyun.core.annotation.NameInMap("ExchangeName")
        private String exchangeName;

        @com.aliyun.core.annotation.NameInMap("Expiration")
        private String expiration;

        @com.aliyun.core.annotation.NameInMap("Headers")
        private String headers;

        @com.aliyun.core.annotation.NameInMap("Immediate")
        private Boolean immediate;

        @com.aliyun.core.annotation.NameInMap("Mandatory")
        private Boolean mandatory;

        @com.aliyun.core.annotation.NameInMap("MessageId")
        private String messageId;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("ProcessToken")
        private String processToken;

        @com.aliyun.core.annotation.NameInMap("ReconsumeTimes")
        private Integer reconsumeTimes;

        @com.aliyun.core.annotation.NameInMap("ReplyTo")
        private String replyTo;

        @com.aliyun.core.annotation.NameInMap("RoutingKey")
        private String routingKey;

        @com.aliyun.core.annotation.NameInMap("StoreTimestamp")
        private Long storeTimestamp;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private AmqpMessageVO(Builder builder) {
            this.appId = builder.appId;
            this.body = builder.body;
            this.clusterId = builder.clusterId;
            this.contentEncoding = builder.contentEncoding;
            this.contentType = builder.contentType;
            this.correlationId = builder.correlationId;
            this.deliveryMode = builder.deliveryMode;
            this.exchangeName = builder.exchangeName;
            this.expiration = builder.expiration;
            this.headers = builder.headers;
            this.immediate = builder.immediate;
            this.mandatory = builder.mandatory;
            this.messageId = builder.messageId;
            this.priority = builder.priority;
            this.processToken = builder.processToken;
            this.reconsumeTimes = builder.reconsumeTimes;
            this.replyTo = builder.replyTo;
            this.routingKey = builder.routingKey;
            this.storeTimestamp = builder.storeTimestamp;
            this.timestamp = builder.timestamp;
            this.type = builder.type;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AmqpMessageVO create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return body
         */
        public String getBody() {
            return this.body;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return contentEncoding
         */
        public String getContentEncoding() {
            return this.contentEncoding;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return correlationId
         */
        public String getCorrelationId() {
            return this.correlationId;
        }

        /**
         * @return deliveryMode
         */
        public Integer getDeliveryMode() {
            return this.deliveryMode;
        }

        /**
         * @return exchangeName
         */
        public String getExchangeName() {
            return this.exchangeName;
        }

        /**
         * @return expiration
         */
        public String getExpiration() {
            return this.expiration;
        }

        /**
         * @return headers
         */
        public String getHeaders() {
            return this.headers;
        }

        /**
         * @return immediate
         */
        public Boolean getImmediate() {
            return this.immediate;
        }

        /**
         * @return mandatory
         */
        public Boolean getMandatory() {
            return this.mandatory;
        }

        /**
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return processToken
         */
        public String getProcessToken() {
            return this.processToken;
        }

        /**
         * @return reconsumeTimes
         */
        public Integer getReconsumeTimes() {
            return this.reconsumeTimes;
        }

        /**
         * @return replyTo
         */
        public String getReplyTo() {
            return this.replyTo;
        }

        /**
         * @return routingKey
         */
        public String getRoutingKey() {
            return this.routingKey;
        }

        /**
         * @return storeTimestamp
         */
        public Long getStoreTimestamp() {
            return this.storeTimestamp;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String appId; 
            private String body; 
            private String clusterId; 
            private String contentEncoding; 
            private String contentType; 
            private String correlationId; 
            private Integer deliveryMode; 
            private String exchangeName; 
            private String expiration; 
            private String headers; 
            private Boolean immediate; 
            private Boolean mandatory; 
            private String messageId; 
            private Integer priority; 
            private String processToken; 
            private Integer reconsumeTimes; 
            private String replyTo; 
            private String routingKey; 
            private Long storeTimestamp; 
            private Long timestamp; 
            private String type; 
            private String userId; 

            private Builder() {
            } 

            private Builder(AmqpMessageVO model) {
                this.appId = model.appId;
                this.body = model.body;
                this.clusterId = model.clusterId;
                this.contentEncoding = model.contentEncoding;
                this.contentType = model.contentType;
                this.correlationId = model.correlationId;
                this.deliveryMode = model.deliveryMode;
                this.exchangeName = model.exchangeName;
                this.expiration = model.expiration;
                this.headers = model.headers;
                this.immediate = model.immediate;
                this.mandatory = model.mandatory;
                this.messageId = model.messageId;
                this.priority = model.priority;
                this.processToken = model.processToken;
                this.reconsumeTimes = model.reconsumeTimes;
                this.replyTo = model.replyTo;
                this.routingKey = model.routingKey;
                this.storeTimestamp = model.storeTimestamp;
                this.timestamp = model.timestamp;
                this.type = model.type;
                this.userId = model.userId;
            } 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * Body.
             */
            public Builder body(String body) {
                this.body = body;
                return this;
            }

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * ContentEncoding.
             */
            public Builder contentEncoding(String contentEncoding) {
                this.contentEncoding = contentEncoding;
                return this;
            }

            /**
             * ContentType.
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * CorrelationId.
             */
            public Builder correlationId(String correlationId) {
                this.correlationId = correlationId;
                return this;
            }

            /**
             * DeliveryMode.
             */
            public Builder deliveryMode(Integer deliveryMode) {
                this.deliveryMode = deliveryMode;
                return this;
            }

            /**
             * ExchangeName.
             */
            public Builder exchangeName(String exchangeName) {
                this.exchangeName = exchangeName;
                return this;
            }

            /**
             * Expiration.
             */
            public Builder expiration(String expiration) {
                this.expiration = expiration;
                return this;
            }

            /**
             * Headers.
             */
            public Builder headers(String headers) {
                this.headers = headers;
                return this;
            }

            /**
             * Immediate.
             */
            public Builder immediate(Boolean immediate) {
                this.immediate = immediate;
                return this;
            }

            /**
             * Mandatory.
             */
            public Builder mandatory(Boolean mandatory) {
                this.mandatory = mandatory;
                return this;
            }

            /**
             * MessageId.
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * ProcessToken.
             */
            public Builder processToken(String processToken) {
                this.processToken = processToken;
                return this;
            }

            /**
             * ReconsumeTimes.
             */
            public Builder reconsumeTimes(Integer reconsumeTimes) {
                this.reconsumeTimes = reconsumeTimes;
                return this;
            }

            /**
             * ReplyTo.
             */
            public Builder replyTo(String replyTo) {
                this.replyTo = replyTo;
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
             * StoreTimestamp.
             */
            public Builder storeTimestamp(Long storeTimestamp) {
                this.storeTimestamp = storeTimestamp;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public AmqpMessageVO build() {
                return new AmqpMessageVO(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMessageByQueueNameResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMessageByQueueNameResponseBody</p>
     */
    public static class VoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AmqpMessageVO")
        private java.util.List<AmqpMessageVO> amqpMessageVO;

        private VoList(Builder builder) {
            this.amqpMessageVO = builder.amqpMessageVO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VoList create() {
            return builder().build();
        }

        /**
         * @return amqpMessageVO
         */
        public java.util.List<AmqpMessageVO> getAmqpMessageVO() {
            return this.amqpMessageVO;
        }

        public static final class Builder {
            private java.util.List<AmqpMessageVO> amqpMessageVO; 

            private Builder() {
            } 

            private Builder(VoList model) {
                this.amqpMessageVO = model.amqpMessageVO;
            } 

            /**
             * AmqpMessageVO.
             */
            public Builder amqpMessageVO(java.util.List<AmqpMessageVO> amqpMessageVO) {
                this.amqpMessageVO = amqpMessageVO;
                return this;
            }

            public VoList build() {
                return new VoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryMessageByQueueNameResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMessageByQueueNameResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        @com.aliyun.core.annotation.NameInMap("VoList")
        private VoList voList;

        private Data(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.taskId = builder.taskId;
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
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return voList
         */
        public VoList getVoList() {
            return this.voList;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private String taskId; 
            private Long totalCount; 
            private VoList voList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.taskId = model.taskId;
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
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * VoList.
             */
            public Builder voList(VoList voList) {
                this.voList = voList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
