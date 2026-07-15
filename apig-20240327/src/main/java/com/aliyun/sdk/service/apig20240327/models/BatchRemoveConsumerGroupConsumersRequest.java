// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link BatchRemoveConsumerGroupConsumersRequest} extends {@link RequestModel}
 *
 * <p>BatchRemoveConsumerGroupConsumersRequest</p>
 */
public class BatchRemoveConsumerGroupConsumersRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("consumerGroupId")
    private String consumerGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("consumerIds")
    private java.util.List<String> consumerIds;

    private BatchRemoveConsumerGroupConsumersRequest(Builder builder) {
        super(builder);
        this.consumerGroupId = builder.consumerGroupId;
        this.consumerIds = builder.consumerIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchRemoveConsumerGroupConsumersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consumerGroupId
     */
    public String getConsumerGroupId() {
        return this.consumerGroupId;
    }

    /**
     * @return consumerIds
     */
    public java.util.List<String> getConsumerIds() {
        return this.consumerIds;
    }

    public static final class Builder extends Request.Builder<BatchRemoveConsumerGroupConsumersRequest, Builder> {
        private String consumerGroupId; 
        private java.util.List<String> consumerIds; 

        private Builder() {
            super();
        } 

        private Builder(BatchRemoveConsumerGroupConsumersRequest request) {
            super(request);
            this.consumerGroupId = request.consumerGroupId;
            this.consumerIds = request.consumerIds;
        } 

        /**
         * consumerGroupId.
         */
        public Builder consumerGroupId(String consumerGroupId) {
            this.putPathParameter("consumerGroupId", consumerGroupId);
            this.consumerGroupId = consumerGroupId;
            return this;
        }

        /**
         * consumerIds.
         */
        public Builder consumerIds(java.util.List<String> consumerIds) {
            this.putBodyParameter("consumerIds", consumerIds);
            this.consumerIds = consumerIds;
            return this;
        }

        @Override
        public BatchRemoveConsumerGroupConsumersRequest build() {
            return new BatchRemoveConsumerGroupConsumersRequest(this);
        } 

    } 

}
