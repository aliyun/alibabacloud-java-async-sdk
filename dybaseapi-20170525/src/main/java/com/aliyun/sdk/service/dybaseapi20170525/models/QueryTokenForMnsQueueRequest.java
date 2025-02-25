// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dybaseapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTokenForMnsQueueRequest} extends {@link RequestModel}
 *
 * <p>QueryTokenForMnsQueueRequest</p>
 */
public class QueryTokenForMnsQueueRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String messageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueueName")
    private String queueName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private QueryTokenForMnsQueueRequest(Builder builder) {
        super(builder);
        this.messageType = builder.messageType;
        this.ownerId = builder.ownerId;
        this.queueName = builder.queueName;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTokenForMnsQueueRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return messageType
     */
    public String getMessageType() {
        return this.messageType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return queueName
     */
    public String getQueueName() {
        return this.queueName;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<QueryTokenForMnsQueueRequest, Builder> {
        private String messageType; 
        private Long ownerId; 
        private String queueName; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(QueryTokenForMnsQueueRequest request) {
            super(request);
            this.messageType = request.messageType;
            this.ownerId = request.ownerId;
            this.queueName = request.queueName;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * MessageType.
         */
        public Builder messageType(String messageType) {
            this.putQueryParameter("MessageType", messageType);
            this.messageType = messageType;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * QueueName.
         */
        public Builder queueName(String queueName) {
            this.putQueryParameter("QueueName", queueName);
            this.queueName = queueName;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public QueryTokenForMnsQueueRequest build() {
            return new QueryTokenForMnsQueueRequest(this);
        } 

    } 

}
