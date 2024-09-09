// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTracesRequest} extends {@link RequestModel}
 *
 * <p>ListTracesRequest</p>
 */
public class ListTracesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("topicName")
    private String topicName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("messageId")
    private String messageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("messageKey")
    private String messageKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    @com.aliyun.core.annotation.Validation(maximum = 100000000, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    @com.aliyun.core.annotation.Validation(maximum = 10000, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("queryType")
    private String queryType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    private ListTracesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.topicName = builder.topicName;
        this.endTime = builder.endTime;
        this.messageId = builder.messageId;
        this.messageKey = builder.messageKey;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.queryType = builder.queryType;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTracesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return topicName
     */
    public String getTopicName() {
        return this.topicName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * @return messageKey
     */
    public String getMessageKey() {
        return this.messageKey;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return queryType
     */
    public String getQueryType() {
        return this.queryType;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListTracesRequest, Builder> {
        private String instanceId; 
        private String topicName; 
        private String endTime; 
        private String messageId; 
        private String messageKey; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String queryType; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListTracesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.topicName = request.topicName;
            this.endTime = request.endTime;
            this.messageId = request.messageId;
            this.messageKey = request.messageKey;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.queryType = request.queryType;
            this.startTime = request.startTime;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * topicName.
         */
        public Builder topicName(String topicName) {
            this.putPathParameter("topicName", topicName);
            this.topicName = topicName;
            return this;
        }

        /**
         * endTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * messageId.
         */
        public Builder messageId(String messageId) {
            this.putQueryParameter("messageId", messageId);
            this.messageId = messageId;
            return this;
        }

        /**
         * messageKey.
         */
        public Builder messageKey(String messageKey) {
            this.putQueryParameter("messageKey", messageKey);
            this.messageKey = messageKey;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * queryType.
         */
        public Builder queryType(String queryType) {
            this.putQueryParameter("queryType", queryType);
            this.queryType = queryType;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListTracesRequest build() {
            return new ListTracesRequest(this);
        } 

    } 

}
