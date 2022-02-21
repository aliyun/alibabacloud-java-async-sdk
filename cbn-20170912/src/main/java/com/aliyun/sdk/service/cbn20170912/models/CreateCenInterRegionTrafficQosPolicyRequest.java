// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCenInterRegionTrafficQosPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateCenInterRegionTrafficQosPolicyRequest</p>
 */
public class CreateCenInterRegionTrafficQosPolicyRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TrafficQosPolicyDescription")
    private String trafficQosPolicyDescription;

    @Query
    @NameInMap("TrafficQosPolicyName")
    private String trafficQosPolicyName;

    @Query
    @NameInMap("TrafficQosQueues")
    private java.util.List < TrafficQosQueues> trafficQosQueues;

    @Query
    @NameInMap("TransitRouterAttachmentId")
    @Validation(required = true)
    private String transitRouterAttachmentId;

    @Query
    @NameInMap("TransitRouterId")
    @Validation(required = true)
    private String transitRouterId;

    private CreateCenInterRegionTrafficQosPolicyRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.trafficQosPolicyDescription = builder.trafficQosPolicyDescription;
        this.trafficQosPolicyName = builder.trafficQosPolicyName;
        this.trafficQosQueues = builder.trafficQosQueues;
        this.transitRouterAttachmentId = builder.transitRouterAttachmentId;
        this.transitRouterId = builder.transitRouterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCenInterRegionTrafficQosPolicyRequest create() {
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
     * @return trafficQosPolicyDescription
     */
    public String getTrafficQosPolicyDescription() {
        return this.trafficQosPolicyDescription;
    }

    /**
     * @return trafficQosPolicyName
     */
    public String getTrafficQosPolicyName() {
        return this.trafficQosPolicyName;
    }

    /**
     * @return trafficQosQueues
     */
    public java.util.List < TrafficQosQueues> getTrafficQosQueues() {
        return this.trafficQosQueues;
    }

    /**
     * @return transitRouterAttachmentId
     */
    public String getTransitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }

    /**
     * @return transitRouterId
     */
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public static final class Builder extends Request.Builder<CreateCenInterRegionTrafficQosPolicyRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String trafficQosPolicyDescription; 
        private String trafficQosPolicyName; 
        private java.util.List < TrafficQosQueues> trafficQosQueues; 
        private String transitRouterAttachmentId; 
        private String transitRouterId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCenInterRegionTrafficQosPolicyRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.dryRun = response.dryRun;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.trafficQosPolicyDescription = response.trafficQosPolicyDescription;
            this.trafficQosPolicyName = response.trafficQosPolicyName;
            this.trafficQosQueues = response.trafficQosQueues;
            this.transitRouterAttachmentId = response.transitRouterAttachmentId;
            this.transitRouterId = response.transitRouterId;
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
         * TrafficQosPolicyDescription.
         */
        public Builder trafficQosPolicyDescription(String trafficQosPolicyDescription) {
            this.putQueryParameter("TrafficQosPolicyDescription", trafficQosPolicyDescription);
            this.trafficQosPolicyDescription = trafficQosPolicyDescription;
            return this;
        }

        /**
         * TrafficQosPolicyName.
         */
        public Builder trafficQosPolicyName(String trafficQosPolicyName) {
            this.putQueryParameter("TrafficQosPolicyName", trafficQosPolicyName);
            this.trafficQosPolicyName = trafficQosPolicyName;
            return this;
        }

        /**
         * TrafficQosQueues.
         */
        public Builder trafficQosQueues(java.util.List < TrafficQosQueues> trafficQosQueues) {
            this.putQueryParameter("TrafficQosQueues", trafficQosQueues);
            this.trafficQosQueues = trafficQosQueues;
            return this;
        }

        /**
         * TransitRouterAttachmentId.
         */
        public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
            this.putQueryParameter("TransitRouterAttachmentId", transitRouterAttachmentId);
            this.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }

        /**
         * TransitRouterId.
         */
        public Builder transitRouterId(String transitRouterId) {
            this.putQueryParameter("TransitRouterId", transitRouterId);
            this.transitRouterId = transitRouterId;
            return this;
        }

        @Override
        public CreateCenInterRegionTrafficQosPolicyRequest build() {
            return new CreateCenInterRegionTrafficQosPolicyRequest(this);
        } 

    } 

    public static class TrafficQosQueues extends TeaModel {
        @NameInMap("Dscps")
        private java.util.List < Integer > dscps;

        @NameInMap("QosQueueDescription")
        private String qosQueueDescription;

        @NameInMap("QosQueueName")
        private String qosQueueName;

        @NameInMap("RemainBandwidthPercent")
        private String remainBandwidthPercent;

        private TrafficQosQueues(Builder builder) {
            this.dscps = builder.dscps;
            this.qosQueueDescription = builder.qosQueueDescription;
            this.qosQueueName = builder.qosQueueName;
            this.remainBandwidthPercent = builder.remainBandwidthPercent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficQosQueues create() {
            return builder().build();
        }

        /**
         * @return dscps
         */
        public java.util.List < Integer > getDscps() {
            return this.dscps;
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

        public static final class Builder {
            private java.util.List < Integer > dscps; 
            private String qosQueueDescription; 
            private String qosQueueName; 
            private String remainBandwidthPercent; 

            /**
             * Dscps.
             */
            public Builder dscps(java.util.List < Integer > dscps) {
                this.dscps = dscps;
                return this;
            }

            /**
             * QosQueueDescription.
             */
            public Builder qosQueueDescription(String qosQueueDescription) {
                this.qosQueueDescription = qosQueueDescription;
                return this;
            }

            /**
             * QosQueueName.
             */
            public Builder qosQueueName(String qosQueueName) {
                this.qosQueueName = qosQueueName;
                return this;
            }

            /**
             * RemainBandwidthPercent.
             */
            public Builder remainBandwidthPercent(String remainBandwidthPercent) {
                this.remainBandwidthPercent = remainBandwidthPercent;
                return this;
            }

            public TrafficQosQueues build() {
                return new TrafficQosQueues(this);
            } 

        } 

    }
}
