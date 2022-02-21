// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

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
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String scalingRuleAri; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteScalingRuleRequest response) {
            super(response);
            this.breachThreshold = response.breachThreshold;
            this.clientToken = response.clientToken;
            this.metricValue = response.metricValue;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.scalingRuleAri = response.scalingRuleAri;
        } 

        /**
         * BreachThreshold.
         */
        public Builder breachThreshold(Float breachThreshold) {
            this.putQueryParameter("BreachThreshold", breachThreshold);
            this.breachThreshold = breachThreshold;
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
         * MetricValue.
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
         * ScalingRuleAri.
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
