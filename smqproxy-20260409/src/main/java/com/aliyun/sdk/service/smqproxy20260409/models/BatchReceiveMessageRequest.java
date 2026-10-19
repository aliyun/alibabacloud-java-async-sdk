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
 * {@link BatchReceiveMessageRequest} extends {@link RequestModel}
 *
 * <p>BatchReceiveMessageRequest</p>
 */
public class BatchReceiveMessageRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("queueName")
    private String queueName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("numOfMessages")
    private Integer numOfMessages;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("waitseconds")
    private Integer waitseconds;

    private BatchReceiveMessageRequest(Builder builder) {
        super(builder);
        this.queueName = builder.queueName;
        this.numOfMessages = builder.numOfMessages;
        this.waitseconds = builder.waitseconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchReceiveMessageRequest create() {
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
     * @return waitseconds
     */
    public Integer getWaitseconds() {
        return this.waitseconds;
    }

    public static final class Builder extends Request.Builder<BatchReceiveMessageRequest, Builder> {
        private String queueName; 
        private Integer numOfMessages; 
        private Integer waitseconds; 

        private Builder() {
            super();
        } 

        private Builder(BatchReceiveMessageRequest request) {
            super(request);
            this.queueName = request.queueName;
            this.numOfMessages = request.numOfMessages;
            this.waitseconds = request.waitseconds;
        } 

        /**
         * <p>The queue name.</p>
         * 
         * <strong>example:</strong>
         * <p>MyQueue</p>
         */
        public Builder queueName(String queueName) {
            this.putPathParameter("queueName", queueName);
            this.queueName = queueName;
            return this;
        }

        /**
         * <p>The maximum number of messages to receive in this request.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder numOfMessages(Integer numOfMessages) {
            this.putQueryParameter("numOfMessages", numOfMessages);
            this.numOfMessages = numOfMessages;
            return this;
        }

        /**
         * <p>The maximum polling wait time for this request, in seconds. Set to 0 for an immediate return.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder waitseconds(Integer waitseconds) {
            this.putQueryParameter("waitseconds", waitseconds);
            this.waitseconds = waitseconds;
            return this;
        }

        @Override
        public BatchReceiveMessageRequest build() {
            return new BatchReceiveMessageRequest(this);
        } 

    } 

}
