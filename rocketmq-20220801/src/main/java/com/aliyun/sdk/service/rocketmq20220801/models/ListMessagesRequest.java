// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMessagesRequest} extends {@link RequestModel}
 *
 * <p>ListMessagesRequest</p>
 */
public class ListMessagesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("topicName")
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.Validation(maximum = 20, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("scrollId")
    private String scrollId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    private ListMessagesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.topicName = builder.topicName;
        this.endTime = builder.endTime;
        this.messageId = builder.messageId;
        this.messageKey = builder.messageKey;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.scrollId = builder.scrollId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMessagesRequest create() {
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
     * @return scrollId
     */
    public String getScrollId() {
        return this.scrollId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListMessagesRequest, Builder> {
        private String instanceId; 
        private String topicName; 
        private String endTime; 
        private String messageId; 
        private String messageKey; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String scrollId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListMessagesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.topicName = request.topicName;
            this.endTime = request.endTime;
            this.messageId = request.messageId;
            this.messageKey = request.messageKey;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.scrollId = request.scrollId;
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
         * scrollId.
         */
        public Builder scrollId(String scrollId) {
            this.putQueryParameter("scrollId", scrollId);
            this.scrollId = scrollId;
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
        public ListMessagesRequest build() {
            return new ListMessagesRequest(this);
        } 

    } 

}
