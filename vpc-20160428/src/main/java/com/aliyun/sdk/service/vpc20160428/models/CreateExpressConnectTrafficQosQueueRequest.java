// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateExpressConnectTrafficQosQueueRequest} extends {@link RequestModel}
 *
 * <p>CreateExpressConnectTrafficQosQueueRequest</p>
 */
public class CreateExpressConnectTrafficQosQueueRequest extends Request {
    @Query
    @NameInMap("BandwidthPercent")
    private String bandwidthPercent;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("QosId")
    @Validation(required = true)
    private String qosId;

    @Query
    @NameInMap("QueueDescription")
    private String queueDescription;

    @Query
    @NameInMap("QueueName")
    private String queueName;

    @Query
    @NameInMap("QueueType")
    @Validation(required = true)
    private String queueType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    private CreateExpressConnectTrafficQosQueueRequest(Builder builder) {
        super(builder);
        this.bandwidthPercent = builder.bandwidthPercent;
        this.clientToken = builder.clientToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.qosId = builder.qosId;
        this.queueDescription = builder.queueDescription;
        this.queueName = builder.queueName;
        this.queueType = builder.queueType;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExpressConnectTrafficQosQueueRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bandwidthPercent
     */
    public String getBandwidthPercent() {
        return this.bandwidthPercent;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return qosId
     */
    public String getQosId() {
        return this.qosId;
    }

    /**
     * @return queueDescription
     */
    public String getQueueDescription() {
        return this.queueDescription;
    }

    /**
     * @return queueName
     */
    public String getQueueName() {
        return this.queueName;
    }

    /**
     * @return queueType
     */
    public String getQueueType() {
        return this.queueType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public static final class Builder extends Request.Builder<CreateExpressConnectTrafficQosQueueRequest, Builder> {
        private String bandwidthPercent; 
        private String clientToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private String qosId; 
        private String queueDescription; 
        private String queueName; 
        private String queueType; 
        private String regionId; 
        private String resourceOwnerAccount; 

        private Builder() {
            super();
        } 

        private Builder(CreateExpressConnectTrafficQosQueueRequest request) {
            super(request);
            this.bandwidthPercent = request.bandwidthPercent;
            this.clientToken = request.clientToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.qosId = request.qosId;
            this.queueDescription = request.queueDescription;
            this.queueName = request.queueName;
            this.queueType = request.queueType;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
        } 

        /**
         * BandwidthPercent.
         */
        public Builder bandwidthPercent(String bandwidthPercent) {
            this.putQueryParameter("BandwidthPercent", bandwidthPercent);
            this.bandwidthPercent = bandwidthPercent;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
         * QosId.
         */
        public Builder qosId(String qosId) {
            this.putQueryParameter("QosId", qosId);
            this.qosId = qosId;
            return this;
        }

        /**
         * QueueDescription.
         */
        public Builder queueDescription(String queueDescription) {
            this.putQueryParameter("QueueDescription", queueDescription);
            this.queueDescription = queueDescription;
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
         * QueueType.
         */
        public Builder queueType(String queueType) {
            this.putQueryParameter("QueueType", queueType);
            this.queueType = queueType;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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

        @Override
        public CreateExpressConnectTrafficQosQueueRequest build() {
            return new CreateExpressConnectTrafficQosQueueRequest(this);
        } 

    } 

}
