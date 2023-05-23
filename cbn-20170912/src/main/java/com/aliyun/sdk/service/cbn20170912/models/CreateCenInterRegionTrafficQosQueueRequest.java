// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCenInterRegionTrafficQosQueueRequest} extends {@link RequestModel}
 *
 * <p>CreateCenInterRegionTrafficQosQueueRequest</p>
 */
public class CreateCenInterRegionTrafficQosQueueRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("Dscps")
    @Validation(required = true)
    private java.util.List < Integer > dscps;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("QosQueueDescription")
    private String qosQueueDescription;

    @Query
    @NameInMap("QosQueueName")
    private String qosQueueName;

    @Query
    @NameInMap("RemainBandwidthPercent")
    @Validation(required = true)
    private String remainBandwidthPercent;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TrafficQosPolicyId")
    @Validation(required = true)
    private String trafficQosPolicyId;

    private CreateCenInterRegionTrafficQosQueueRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.dscps = builder.dscps;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.qosQueueDescription = builder.qosQueueDescription;
        this.qosQueueName = builder.qosQueueName;
        this.remainBandwidthPercent = builder.remainBandwidthPercent;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.trafficQosPolicyId = builder.trafficQosPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCenInterRegionTrafficQosQueueRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return dscps
     */
    public java.util.List < Integer > getDscps() {
        return this.dscps;
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
     * @return qosQueueDescription
     */
    public String getQosQueueDescription() {
        return this.qosQueueDescription;
    }

    /**
     * @return qosQueueName
     */
    public String getQosQueueName() {
        return this.qosQueueName;
    }

    /**
     * @return remainBandwidthPercent
     */
    public String getRemainBandwidthPercent() {
        return this.remainBandwidthPercent;
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
     * @return trafficQosPolicyId
     */
    public String getTrafficQosPolicyId() {
        return this.trafficQosPolicyId;
    }

    public static final class Builder extends Request.Builder<CreateCenInterRegionTrafficQosQueueRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private java.util.List < Integer > dscps; 
        private String ownerAccount; 
        private Long ownerId; 
        private String qosQueueDescription; 
        private String qosQueueName; 
        private String remainBandwidthPercent; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String trafficQosPolicyId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCenInterRegionTrafficQosQueueRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.dscps = request.dscps;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.qosQueueDescription = request.qosQueueDescription;
            this.qosQueueName = request.qosQueueName;
            this.remainBandwidthPercent = request.remainBandwidthPercent;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.trafficQosPolicyId = request.trafficQosPolicyId;
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
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Dscps.
         */
        public Builder dscps(java.util.List < Integer > dscps) {
            this.putQueryParameter("Dscps", dscps);
            this.dscps = dscps;
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
         * QosQueueDescription.
         */
        public Builder qosQueueDescription(String qosQueueDescription) {
            this.putQueryParameter("QosQueueDescription", qosQueueDescription);
            this.qosQueueDescription = qosQueueDescription;
            return this;
        }

        /**
         * QosQueueName.
         */
        public Builder qosQueueName(String qosQueueName) {
            this.putQueryParameter("QosQueueName", qosQueueName);
            this.qosQueueName = qosQueueName;
            return this;
        }

        /**
         * RemainBandwidthPercent.
         */
        public Builder remainBandwidthPercent(String remainBandwidthPercent) {
            this.putQueryParameter("RemainBandwidthPercent", remainBandwidthPercent);
            this.remainBandwidthPercent = remainBandwidthPercent;
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
         * TrafficQosPolicyId.
         */
        public Builder trafficQosPolicyId(String trafficQosPolicyId) {
            this.putQueryParameter("TrafficQosPolicyId", trafficQosPolicyId);
            this.trafficQosPolicyId = trafficQosPolicyId;
            return this;
        }

        @Override
        public CreateCenInterRegionTrafficQosQueueRequest build() {
            return new CreateCenInterRegionTrafficQosQueueRequest(this);
        } 

    } 

}
