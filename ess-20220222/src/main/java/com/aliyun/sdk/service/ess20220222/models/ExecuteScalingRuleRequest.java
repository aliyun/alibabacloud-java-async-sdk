// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteScalingRuleRequest} extends {@link RequestModel}
 *
 * <p>ExecuteScalingRuleRequest</p>
 */
public class ExecuteScalingRuleRequest extends Request {
    @Query
    @NameInMap("BreachThreshold")
    private Float breachThreshold;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("MetricValue")
    private Float metricValue;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ScalingRuleAri")
    @Validation(required = true)
    private String scalingRuleAri;

    private ExecuteScalingRuleRequest(Builder builder) {
        super(builder);
        this.breachThreshold = builder.breachThreshold;
        this.clientToken = builder.clientToken;
        this.metricValue = builder.metricValue;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scalingRuleAri = builder.scalingRuleAri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteScalingRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return breachThreshold
     */
    public Float getBreachThreshold() {
        return this.breachThreshold;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return metricValue
     */
    public Float getMetricValue() {
        return this.metricValue;
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

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return scalingRuleAri
     */
    public String getScalingRuleAri() {
        return this.scalingRuleAri;
    }

    public static final class Builder extends Request.Builder<ExecuteScalingRuleRequest, Builder> {
        private Float breachThreshold; 
        private String clientToken; 
        private Float metricValue; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String scalingRuleAri; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteScalingRuleRequest request) {
            super(request);
            this.breachThreshold = request.breachThreshold;
            this.clientToken = request.clientToken;
            this.metricValue = request.metricValue;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scalingRuleAri = request.scalingRuleAri;
        } 

        /**
         * The threshold specified when the step scaling rule is executed. Valid values: -9.999999E18 to 9.999999E18.
         */
        public Builder breachThreshold(Float breachThreshold) {
            this.putQueryParameter("BreachThreshold", breachThreshold);
            this.breachThreshold = breachThreshold;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25965~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The metric value specified when the step scaling rule is executed. Valid values: -9.999999E18 to 9.999999E18.
         */
        public Builder metricValue(Float metricValue) {
            this.putQueryParameter("MetricValue", metricValue);
            this.metricValue = metricValue;
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
         * The region ID of the scaling group.
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

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The unique identifier of the scaling rule.
         * <p>
         * 
         * > You can call the ExecuteScalingRule operation to execute only simple scaling rules and step scaling rules. To execute a step scaling rule, you must specify the BreachThreshold and MetricValue parameters.
         */
        public Builder scalingRuleAri(String scalingRuleAri) {
            this.putQueryParameter("ScalingRuleAri", scalingRuleAri);
            this.scalingRuleAri = scalingRuleAri;
            return this;
        }

        @Override
        public ExecuteScalingRuleRequest build() {
            return new ExecuteScalingRuleRequest(this);
        } 

    } 

}
