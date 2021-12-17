// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link UpdateCenInterRegionTrafficQosQueueAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateCenInterRegionTrafficQosQueueAttributeRequest</p>
 */
public class UpdateCenInterRegionTrafficQosQueueAttributeRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("Dscps")
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
    @NameInMap("QosQueueId")
    private String qosQueueId;

    @Query
    @NameInMap("QosQueueName")
    private String qosQueueName;

    @Query
    @NameInMap("RemainBandwidthPercent")
    private String remainBandwidthPercent;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;


    private UpdateCenInterRegionTrafficQosQueueAttributeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.dscps = builder.dscps;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.qosQueueDescription = builder.qosQueueDescription;
        this.qosQueueId = builder.qosQueueId;
        this.qosQueueName = builder.qosQueueName;
        this.remainBandwidthPercent = builder.remainBandwidthPercent;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCenInterRegionTrafficQosQueueAttributeRequest create() {
        return builder().build();
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
     * @return qosQueueId
     */
    public String getQosQueueId() {
        return this.qosQueueId;
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

    public static final class Builder extends Request.Builder<Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private java.util.List < Integer > dscps; 
        private String ownerAccount; 
        private Long ownerId; 
        private String qosQueueDescription; 
        private String qosQueueId; 
        private String qosQueueName; 
        private String remainBandwidthPercent; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        /**
         * <p>ClientToken.</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>DryRun.</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>Dscps.</p>
         */
        public Builder dscps(java.util.List < Integer > dscps) {
            this.putQueryParameter("Dscps", dscps);
            this.dscps = dscps;
            return this;
        }

        /**
         * <p>OwnerAccount.</p>
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * <p>OwnerId.</p>
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>QosQueueDescription.</p>
         */
        public Builder qosQueueDescription(String qosQueueDescription) {
            this.putQueryParameter("QosQueueDescription", qosQueueDescription);
            this.qosQueueDescription = qosQueueDescription;
            return this;
        }

        /**
         * <p>QosQueueId.</p>
         */
        public Builder qosQueueId(String qosQueueId) {
            this.putQueryParameter("QosQueueId", qosQueueId);
            this.qosQueueId = qosQueueId;
            return this;
        }

        /**
         * <p>QosQueueName.</p>
         */
        public Builder qosQueueName(String qosQueueName) {
            this.putQueryParameter("QosQueueName", qosQueueName);
            this.qosQueueName = qosQueueName;
            return this;
        }

        /**
         * <p>RemainBandwidthPercent.</p>
         */
        public Builder remainBandwidthPercent(String remainBandwidthPercent) {
            this.putQueryParameter("RemainBandwidthPercent", remainBandwidthPercent);
            this.remainBandwidthPercent = remainBandwidthPercent;
            return this;
        }

        /**
         * <p>ResourceOwnerAccount.</p>
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * <p>ResourceOwnerId.</p>
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        public UpdateCenInterRegionTrafficQosQueueAttributeRequest build() {
            return new UpdateCenInterRegionTrafficQosQueueAttributeRequest(this);
        } 

    } 

}
