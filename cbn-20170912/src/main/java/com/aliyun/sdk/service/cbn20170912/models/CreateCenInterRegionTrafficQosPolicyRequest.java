// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link CreateCenInterRegionTrafficQosPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateCenInterRegionTrafficQosPolicyRequest</p>
 */
public class CreateCenInterRegionTrafficQosPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BandwidthGuaranteeMode")
    private String bandwidthGuaranteeMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

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
    @com.aliyun.core.annotation.NameInMap("TrafficQosPolicyDescription")
    private String trafficQosPolicyDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficQosPolicyName")
    private String trafficQosPolicyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficQosQueues")
    private java.util.List<TrafficQosQueues> trafficQosQueues;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterAttachmentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transitRouterAttachmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transitRouterId;

    private CreateCenInterRegionTrafficQosPolicyRequest(Builder builder) {
        super(builder);
        this.bandwidthGuaranteeMode = builder.bandwidthGuaranteeMode;
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
     * @return bandwidthGuaranteeMode
     */
    public String getBandwidthGuaranteeMode() {
        return this.bandwidthGuaranteeMode;
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
    public java.util.List<TrafficQosQueues> getTrafficQosQueues() {
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
        private String bandwidthGuaranteeMode; 
        private String clientToken; 
        private Boolean dryRun; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String trafficQosPolicyDescription; 
        private String trafficQosPolicyName; 
        private java.util.List<TrafficQosQueues> trafficQosQueues; 
        private String transitRouterAttachmentId; 
        private String transitRouterId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCenInterRegionTrafficQosPolicyRequest request) {
            super(request);
            this.bandwidthGuaranteeMode = request.bandwidthGuaranteeMode;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.trafficQosPolicyDescription = request.trafficQosPolicyDescription;
            this.trafficQosPolicyName = request.trafficQosPolicyName;
            this.trafficQosQueues = request.trafficQosQueues;
            this.transitRouterAttachmentId = request.transitRouterAttachmentId;
            this.transitRouterId = request.transitRouterId;
        } 

        /**
         * <p>The allocation mode of the guaranteed bandwidth. You can specify an absolute bandwidth value or a bandwidth percentage. Valid values:</p>
         * <ul>
         * <li><strong>byBandwidth</strong>: allocates an absolute bandwidth value for the QoS queue.</li>
         * <li><strong>byBandwidthPercent</strong> (default): allocates a bandwidth percentage for the OoS queue.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>byBandwidthPercent</p>
         */
        public Builder bandwidthGuaranteeMode(String bandwidthGuaranteeMode) {
            this.putQueryParameter("BandwidthGuaranteeMode", bandwidthGuaranteeMode);
            this.bandwidthGuaranteeMode = bandwidthGuaranteeMode;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether only to precheck the API request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: prechecks the request but does not create the QoS policy. The system checks the required parameters, the request format, and the service limits. If the request fails the check, an error message is returned. If the request passes the check, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong>: sends the API request. If the request passes the precheck, the QoS policy is created. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>The description of the QoS policy.</p>
         * <p>This parameter is optional. If you enter a description, it must be 1 to 256 characters in length, and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        public Builder trafficQosPolicyDescription(String trafficQosPolicyDescription) {
            this.putQueryParameter("TrafficQosPolicyDescription", trafficQosPolicyDescription);
            this.trafficQosPolicyDescription = trafficQosPolicyDescription;
            return this;
        }

        /**
         * <p>The name of the QoS policy.</p>
         * <p>The name can be empty or 1 to 128 characters in length, and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        public Builder trafficQosPolicyName(String trafficQosPolicyName) {
            this.putQueryParameter("TrafficQosPolicyName", trafficQosPolicyName);
            this.trafficQosPolicyName = trafficQosPolicyName;
            return this;
        }

        /**
         * <p>The information about the QoS queue.</p>
         * <p>You can add at most three QoS queues in a QoS policy by calling this operation. To add more QoS queues, call the CreateCenInterRegionTrafficQosQueue operation.</p>
         */
        public Builder trafficQosQueues(java.util.List<TrafficQosQueues> trafficQosQueues) {
            this.putQueryParameter("TrafficQosQueues", trafficQosQueues);
            this.trafficQosQueues = trafficQosQueues;
            return this;
        }

        /**
         * <p>The ID of the inter-region connection.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-attach-r6g0m3epjehw57****</p>
         */
        public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
            this.putQueryParameter("TransitRouterAttachmentId", transitRouterAttachmentId);
            this.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }

        /**
         * <p>The ID of the transit router.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-8vbuqeo5h5pu3m01d****</p>
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

    /**
     * 
     * {@link CreateCenInterRegionTrafficQosPolicyRequest} extends {@link TeaModel}
     *
     * <p>CreateCenInterRegionTrafficQosPolicyRequest</p>
     */
    public static class TrafficQosQueues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private String bandwidth;

        @com.aliyun.core.annotation.NameInMap("Dscps")
        private java.util.List<Integer> dscps;

        @com.aliyun.core.annotation.NameInMap("QosQueueDescription")
        private String qosQueueDescription;

        @com.aliyun.core.annotation.NameInMap("QosQueueName")
        private String qosQueueName;

        @com.aliyun.core.annotation.NameInMap("RemainBandwidthPercent")
        private String remainBandwidthPercent;

        private TrafficQosQueues(Builder builder) {
            this.bandwidth = builder.bandwidth;
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
         * @return bandwidth
         */
        public String getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return dscps
         */
        public java.util.List<Integer> getDscps() {
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
            private String bandwidth; 
            private java.util.List<Integer> dscps; 
            private String qosQueueDescription; 
            private String qosQueueName; 
            private String remainBandwidthPercent; 

            /**
             * <p>The absolute bandwidth that can be consumed by the QoS queue. Unit: Mbit/s.</p>
             * <p>Each QoS policy supports at most 10 queues. You can specify a valid bandwidth value for each queue.</p>
             * <p>For example, a value of 1 specifies that the queue can consume 1 Mbit/s of the inter-region bandwidth.</p>
             * <blockquote>
             * <p> The sum of the absolute bandwidth values of all the queues in a QoS policy cannot exceed the total bandwidth of the inter-region connection.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder bandwidth(String bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The Differentiated Services Code Point (DSCP) value that matches the current queue.</p>
             * <p>Each QoS policy supports at most three queues. You can specify at most 60 DSCP values for each queue. Separate multiple DCSP values with commas (,).</p>
             */
            public Builder dscps(java.util.List<Integer> dscps) {
                this.dscps = dscps;
                return this;
            }

            /**
             * <p>The description of the current queue.</p>
             * <p>Each QoS policy supports at most 10 queues. You can specify a description for each queue.</p>
             * <p>This parameter is optional. If you enter a description, it must be 1 to 256 characters in length and cannot start with http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>desctest</p>
             */
            public Builder qosQueueDescription(String qosQueueDescription) {
                this.qosQueueDescription = qosQueueDescription;
                return this;
            }

            /**
             * <p>The name of the current queue.</p>
             * <p>Each QoS policy supports at most three queues. You can specify a name for each queue.</p>
             * <p>The name can be empty or 1 to 128 characters in length, and cannot start with http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>nametest</p>
             */
            public Builder qosQueueName(String qosQueueName) {
                this.qosQueueName = qosQueueName;
                return this;
            }

            /**
             * <p>The percentage of the inter-region bandwidth that can be used by the queue.</p>
             * <p>Each QoS policy supports at most 10 queues. You can specify a valid percentage for each queue.</p>
             * <p>For example, a value of <strong>1</strong> specifies that the queue can consume 1% of the inter-region bandwidth.</p>
             * <blockquote>
             * <p> The sum of the percentage values of all the queues in a QoS policy cannot exceed 100%.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
