// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypns20170620.models;

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
 * {@link CreateDypnsSmsVerifyMessageQueueRequest} extends {@link RequestModel}
 *
 * <p>CreateDypnsSmsVerifyMessageQueueRequest</p>
 */
public class CreateDypnsSmsVerifyMessageQueueRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryQueueTypes")
    private String queryQueueTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueueType")
    private String queueType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CreateDypnsSmsVerifyMessageQueueRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.queryQueueTypes = builder.queryQueueTypes;
        this.queueType = builder.queueType;
        this.region = builder.region;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDypnsSmsVerifyMessageQueueRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return queryQueueTypes
     */
    public String getQueryQueueTypes() {
        return this.queryQueueTypes;
    }

    /**
     * @return queueType
     */
    public String getQueueType() {
        return this.queueType;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
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

    public static final class Builder extends Request.Builder<CreateDypnsSmsVerifyMessageQueueRequest, Builder> {
        private Long ownerId; 
        private String queryQueueTypes; 
        private String queueType; 
        private String region; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDypnsSmsVerifyMessageQueueRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.queryQueueTypes = request.queryQueueTypes;
            this.queueType = request.queueType;
            this.region = request.region;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
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
         * QueryQueueTypes.
         */
        public Builder queryQueueTypes(String queryQueueTypes) {
            this.putQueryParameter("QueryQueueTypes", queryQueueTypes);
            this.queryQueueTypes = queryQueueTypes;
            return this;
        }

        /**
         * QueueType.
         */
        public Builder queueType(String queueType) {
            this.putQueryParameter("QueueType", queueType);
            this.queueType = queueType;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
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
        public CreateDypnsSmsVerifyMessageQueueRequest build() {
            return new CreateDypnsSmsVerifyMessageQueueRequest(this);
        } 

    } 

}
