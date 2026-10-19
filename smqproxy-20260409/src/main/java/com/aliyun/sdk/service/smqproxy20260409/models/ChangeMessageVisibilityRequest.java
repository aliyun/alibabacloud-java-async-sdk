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
 * {@link ChangeMessageVisibilityRequest} extends {@link RequestModel}
 *
 * <p>ChangeMessageVisibilityRequest</p>
 */
public class ChangeMessageVisibilityRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("queueName")
    private String queueName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("receiptHandle")
    private String receiptHandle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("visibilityTimeout")
    private Integer visibilityTimeout;

    private ChangeMessageVisibilityRequest(Builder builder) {
        super(builder);
        this.queueName = builder.queueName;
        this.receiptHandle = builder.receiptHandle;
        this.visibilityTimeout = builder.visibilityTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeMessageVisibilityRequest create() {
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
     * @return receiptHandle
     */
    public String getReceiptHandle() {
        return this.receiptHandle;
    }

    /**
     * @return visibilityTimeout
     */
    public Integer getVisibilityTimeout() {
        return this.visibilityTimeout;
    }

    public static final class Builder extends Request.Builder<ChangeMessageVisibilityRequest, Builder> {
        private String queueName; 
        private String receiptHandle; 
        private Integer visibilityTimeout; 

        private Builder() {
            super();
        } 

        private Builder(ChangeMessageVisibilityRequest request) {
            super(request);
            this.queueName = request.queueName;
            this.receiptHandle = request.receiptHandle;
            this.visibilityTimeout = request.visibilityTimeout;
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
         * <p>The temporary handle of the message returned after the last consumption.</p>
         * 
         * <strong>example:</strong>
         * <p>1-ODU4OTkzNDU5My0xNDMyNzI3ODI3LTItOA==</p>
         */
        public Builder receiptHandle(String receiptHandle) {
            this.putQueryParameter("receiptHandle", receiptHandle);
            this.receiptHandle = receiptHandle;
            return this;
        }

        /**
         * <p>The countdown from the current moment until the message becomes Active again. Valid values: 1 to 43200. Unit: seconds (1 second to 12 hours).</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder visibilityTimeout(Integer visibilityTimeout) {
            this.putQueryParameter("visibilityTimeout", visibilityTimeout);
            this.visibilityTimeout = visibilityTimeout;
            return this;
        }

        @Override
        public ChangeMessageVisibilityRequest build() {
            return new ChangeMessageVisibilityRequest(this);
        } 

    } 

}
