// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ExecuteScalingRuleRequest} extends {@link RequestModel}
 *
 * <p>ExecuteScalingRuleRequest</p>
 */
public class ExecuteScalingRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BreachThreshold")
    private Float breachThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricValue")
    private Float metricValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingRuleAri")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The threshold specified when the step scaling rule is executed. Valid values: -9.999999E18 to 9.999999E18.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        public Builder breachThreshold(Float breachThreshold) {
            this.putQueryParameter("BreachThreshold", breachThreshold);
            this.breachThreshold = breachThreshold;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25965.html">Ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The metric value specified when the step scaling rule is executed. Valid values: -9.999999E18 to 9.999999E18.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
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
         * <p>The region ID of the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
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
         * <p>The unique identifier of the scaling rule.</p>
         * <blockquote>
         * <p> You can call this operation to execute simple scaling rules and step scaling rules. If you want to call this operation to execute a step scaling rule, you must specify <code>BreachThreshold</code> and <code>MetricValue</code>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ari:acs:ess:cn-hangzhou:140692647406****:scalingrule/asr-bp1dvirgwkoowxk7****</p>
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
