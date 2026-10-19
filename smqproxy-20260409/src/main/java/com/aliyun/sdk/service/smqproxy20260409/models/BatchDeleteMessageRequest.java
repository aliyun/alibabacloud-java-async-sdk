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
 * {@link BatchDeleteMessageRequest} extends {@link RequestModel}
 *
 * <p>BatchDeleteMessageRequest</p>
 */
public class BatchDeleteMessageRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("queueName")
    private String queueName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReceiptHandles")
    private java.util.List<String> receiptHandles;

    private BatchDeleteMessageRequest(Builder builder) {
        super(builder);
        this.queueName = builder.queueName;
        this.receiptHandles = builder.receiptHandles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeleteMessageRequest create() {
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
     * @return receiptHandles
     */
    public java.util.List<String> getReceiptHandles() {
        return this.receiptHandles;
    }

    public static final class Builder extends Request.Builder<BatchDeleteMessageRequest, Builder> {
        private String queueName; 
        private java.util.List<String> receiptHandles; 

        private Builder() {
            super();
        } 

        private Builder(BatchDeleteMessageRequest request) {
            super(request);
            this.queueName = request.queueName;
            this.receiptHandles = request.receiptHandles;
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
         * <p>The ReceiptHandle values of multiple messages.</p>
         */
        public Builder receiptHandles(java.util.List<String> receiptHandles) {
            this.putBodyParameter("ReceiptHandles", receiptHandles);
            this.receiptHandles = receiptHandles;
            return this;
        }

        @Override
        public BatchDeleteMessageRequest build() {
            return new BatchDeleteMessageRequest(this);
        } 

    } 

}
