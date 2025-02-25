// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20180528.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMediaWorkflowRequest} extends {@link RequestModel}
 *
 * <p>UpdateMediaWorkflowRequest</p>
 */
public class UpdateMediaWorkflowRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaWorkflowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mediaWorkflowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Topology")
    @com.aliyun.core.annotation.Validation(required = true)
    private String topology;

    private UpdateMediaWorkflowRequest(Builder builder) {
        super(builder);
        this.mediaWorkflowId = builder.mediaWorkflowId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.topology = builder.topology;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMediaWorkflowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mediaWorkflowId
     */
    public String getMediaWorkflowId() {
        return this.mediaWorkflowId;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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

    /**
     * @return topology
     */
    public String getTopology() {
        return this.topology;
    }

    public static final class Builder extends Request.Builder<UpdateMediaWorkflowRequest, Builder> {
        private String mediaWorkflowId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String topology; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMediaWorkflowRequest request) {
            super(request);
            this.mediaWorkflowId = request.mediaWorkflowId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.topology = request.topology;
        } 

        /**
         * MediaWorkflowId.
         */
        public Builder mediaWorkflowId(String mediaWorkflowId) {
            this.putQueryParameter("MediaWorkflowId", mediaWorkflowId);
            this.mediaWorkflowId = mediaWorkflowId;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
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

        /**
         * Topology.
         */
        public Builder topology(String topology) {
            this.putQueryParameter("Topology", topology);
            this.topology = topology;
            return this;
        }

        @Override
        public UpdateMediaWorkflowRequest build() {
            return new UpdateMediaWorkflowRequest(this);
        } 

    } 

}
