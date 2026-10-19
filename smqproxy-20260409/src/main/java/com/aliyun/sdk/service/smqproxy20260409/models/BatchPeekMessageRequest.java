// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smqproxy20260409.models;

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
 * {@link BatchPeekMessageRequest} extends {@link RequestModel}
 *
 * <p>BatchPeekMessageRequest</p>
 */
public class BatchPeekMessageRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("queueName")
    private String queueName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("numOfMessages")
    private Integer numOfMessages;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("peekonly")
    private Boolean peekonly;

    private BatchPeekMessageRequest(Builder builder) {
        super(builder);
        this.queueName = builder.queueName;
        this.numOfMessages = builder.numOfMessages;
        this.peekonly = builder.peekonly;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchPeekMessageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return queueName
     */
    public String getQueueName() {
        return this.queueName;
    }

    /**
     * @return numOfMessages
     */
    public Integer getNumOfMessages() {
        return this.numOfMessages;
    }

    /**
     * @return peekonly
     */
    public Boolean getPeekonly() {
        return this.peekonly;
    }

    public static final class Builder extends Request.Builder<BatchPeekMessageRequest, Builder> {
        private String queueName; 
        private Integer numOfMessages; 
        private Boolean peekonly; 

        private Builder() {
            super();
        } 

        private Builder(BatchPeekMessageRequest request) {
            super(request);
            this.queueName = request.queueName;
            this.numOfMessages = request.numOfMessages;
            this.peekonly = request.peekonly;
        } 

        /**
         * <p>The queue name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-queue</p>
         */
        public Builder queueName(String queueName) {
            this.putPathParameter("queueName", queueName);
            this.queueName = queueName;
            return this;
        }

        /**
         * <p>The maximum number of messages to peek at in this BatchPeekMessage request.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder numOfMessages(Integer numOfMessages) {
            this.putQueryParameter("numOfMessages", numOfMessages);
            this.numOfMessages = numOfMessages;
            return this;
        }

        /**
         * <p>Indicates that this request only peeks at messages at the top of the queue without changing the message status. Fixed value: true.</p>
         */
        public Builder peekonly(Boolean peekonly) {
            this.putQueryParameter("peekonly", peekonly);
            this.peekonly = peekonly;
            return this;
        }

        @Override
        public BatchPeekMessageRequest build() {
            return new BatchPeekMessageRequest(this);
        } 

    } 

}
