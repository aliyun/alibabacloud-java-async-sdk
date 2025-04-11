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
 * {@link CreateCenInterRegionTrafficQosQueueRequest} extends {@link RequestModel}
 *
 * <p>CreateCenInterRegionTrafficQosQueueRequest</p>
 */
public class CreateCenInterRegionTrafficQosQueueRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Long bandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dscps")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Integer> dscps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QosQueueDescription")
    private String qosQueueDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QosQueueName")
    private String qosQueueName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemainBandwidthPercent")
    private String remainBandwidthPercent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficQosPolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trafficQosPolicyId;

    private CreateCenInterRegionTrafficQosQueueRequest(Builder builder) {
        super(builder);
        this.bandwidth = builder.bandwidth;
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
     * @return bandwidth
     */
    public Long getBandwidth() {
        return this.bandwidth;
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
    public java.util.List<Integer> getDscps() {
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
        private Long bandwidth; 
        private String clientToken; 
        private Boolean dryRun; 
        private java.util.List<Integer> dscps; 
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
            this.bandwidth = request.bandwidth;
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
         * <p>The maximum absolute bandwidth value that can be allocated to the queue. Unit: Mbit/s.</p>
         * <ul>
         * <li>The value specifies an absolute bandwidth. For example, a value of 20 specifies that the queue can consume at most 20 Mbit/s of bandwidth.</li>
         * <li>The sum of the bandwidth values specified for all queues that belong to the same inter-region connection cannot exceed the maximum bandwidth of the inter-region connection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder bandwidth(Long bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs a dry run. The system checks the required parameters, the request format, and the service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and sends the request.</li>
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
         * <p>The differentiated services code point (DSCP) value that matches the current queue.</p>
         * <p>You can specify at most 20 DSCP values for a queue in each call. Separate DSCP values with commas (,).</p>
         * <p>This parameter is required.</p>
         */
        public Builder dscps(java.util.List<Integer> dscps) {
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
         * <p>The description of the queue.</p>
         * <p>This parameter is optional. If you enter a description, it must be 1 to 256 characters in length and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        public Builder qosQueueDescription(String qosQueueDescription) {
            this.putQueryParameter("QosQueueDescription", qosQueueDescription);
            this.qosQueueDescription = qosQueueDescription;
            return this;
        }

        /**
         * <p>The name of the queue.</p>
         * <p>The name can be empty or 1 to 128 characters in length, and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        public Builder qosQueueName(String qosQueueName) {
            this.putQueryParameter("QosQueueName", qosQueueName);
            this.qosQueueName = qosQueueName;
            return this;
        }

        /**
         * <p>The maximum percentage of inter-region bandwidth that can be allocated to the queue.</p>
         * <ul>
         * <li>Unit: percentage. For example, a value of 20 specifies that the queue can consume at most 20% of inter-region bandwidth.</li>
         * <li>The sum of the percentage values specified for all queues that belong to the same inter-region connection cannot exceed 100%.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>20</p>
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
         * <p>The ID of the QoS policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-qdvybn468kaoxx****</p>
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
