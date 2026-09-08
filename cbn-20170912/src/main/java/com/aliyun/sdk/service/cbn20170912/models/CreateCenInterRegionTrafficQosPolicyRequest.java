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
    @com.aliyun.core.annotation.NameInMap("ConsoleDryRun")
    private Boolean consoleDryRun;

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
        this.consoleDryRun = builder.consoleDryRun;
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
     * @return consoleDryRun
     */
    public Boolean getConsoleDryRun() {
        return this.consoleDryRun;
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
        private Boolean consoleDryRun; 
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
            this.consoleDryRun = request.consoleDryRun;
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
         * <p>The bandwidth guarantee mode. You can configure QoS queues based on absolute bandwidth values or bandwidth percentages. Valid values:</p>
         * <ul>
         * <li><p><strong>byBandwidth</strong>: configures QoS queues based on absolute bandwidth values.</p>
         * </li>
         * <li><p><strong>byBandwidthPercent</strong> (default): configures QoS queues based on bandwidth percentages.</p>
         * </li>
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
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
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
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs a dry run. The system checks the required parameters, request syntax, and business restrictions. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and sends the request. If the request passes the dry run, the cross-region traffic scheduling policy is created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder consoleDryRun(Boolean consoleDryRun) {
            this.putQueryParameter("ConsoleDryRun", consoleDryRun);
            this.consoleDryRun = consoleDryRun;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs a dry run. The system checks the required parameters, request syntax, and business restrictions. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and sends the request. If the request passes the dry run, the traffic scheduling policy is created.</li>
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
         * <p>The description of the traffic scheduling policy.</p>
         * <p>The description can be empty or 1 to 256 characters in length and cannot start with http:// or https://.</p>
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
         * <p>The name of the traffic scheduling policy.</p>
         * <p>The name can be empty or 1 to 128 characters in length and cannot start with http:// or https://.</p>
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
         * <p>The queue information of the traffic scheduling policy.</p>
         * <p>You can create up to 3 queues. To create more queues, call CreateCenInterRegionTrafficQosQueue.</p>
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
         * <p>The ID of the transit router instance.</p>
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

            private Builder() {
            } 

            private Builder(TrafficQosQueues model) {
                this.bandwidth = model.bandwidth;
                this.dscps = model.dscps;
                this.qosQueueDescription = model.qosQueueDescription;
                this.qosQueueName = model.qosQueueName;
                this.remainBandwidthPercent = model.remainBandwidthPercent;
            } 

            /**
             * <p>The absolute bandwidth value that the queue can use for inter-region traffic, in Mbit/s.</p>
             * <p>A traffic scheduling policy supports up to 10 queues, and each queue can be assigned an absolute bandwidth value.</p>
             * <p>For example, if you enter 1, traffic that matches the queue can use up to 1 Mbit/s of inter-region bandwidth.</p>
             * <blockquote>
             * <p>The sum of absolute bandwidth values of all allocated queues in a traffic scheduling policy cannot exceed the inter-region bandwidth value.</p>
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
             * <p>The DSCP values that the queue matches.</p>
             * <p>A traffic scheduling policy supports up to 3 queues, and each queue can match up to 60 DSCP values. Separate multiple DSCP values with commas (,).</p>
             */
            public Builder dscps(java.util.List<Integer> dscps) {
                this.dscps = dscps;
                return this;
            }

            /**
             * <p>The description of the queue.</p>
             * <p>A traffic scheduling policy supports up to 10 queues, and each queue can have a description.</p>
             * <p>The description can be empty or 1 to 256 characters in length and cannot start with http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>desctest</p>
             */
            public Builder qosQueueDescription(String qosQueueDescription) {
                this.qosQueueDescription = qosQueueDescription;
                return this;
            }

            /**
             * <p>The name of the queue.</p>
             * <p>A traffic scheduling policy supports up to 3 queues, and each queue can be assigned a name.</p>
             * <p>The name can be empty or 1 to 128 characters in length and cannot start with http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>nametest</p>
             */
            public Builder qosQueueName(String qosQueueName) {
                this.qosQueueName = qosQueueName;
                return this;
            }

            /**
             * <p>The percentage of inter-region bandwidth that the queue can use.</p>
             * <p>A traffic scheduling policy supports up to 10 queues, and each queue can be assigned a percentage of inter-region bandwidth.</p>
             * <p>For example, if you enter <strong>1</strong>, traffic that matches the queue can use up to 1% of the inter-region bandwidth.</p>
             * <blockquote>
             * <p>The sum of bandwidth percentages of all queues in a traffic scheduling policy cannot exceed 100%.</p>
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
