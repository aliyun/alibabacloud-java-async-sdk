// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
 * {@link ConvertChargeTypeRequest} extends {@link RequestModel}
 *
 * <p>ConvertChargeTypeRequest</p>
 */
public class ConvertChargeTypeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subscriptionType;

    private ConvertChargeTypeRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.ownerId = builder.ownerId;
        this.period = builder.period;
        this.productCode = builder.productCode;
        this.productType = builder.productType;
        this.subscriptionType = builder.subscriptionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConvertChargeTypeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return subscriptionType
     */
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    public static final class Builder extends Request.Builder<ConvertChargeTypeRequest, Builder> {
        private String instanceId; 
        private Long ownerId; 
        private Integer period; 
        private String productCode; 
        private String productType; 
        private String subscriptionType; 

        private Builder() {
            super();
        } 

        private Builder(ConvertChargeTypeRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.ownerId = request.ownerId;
            this.period = request.period;
            this.productCode = request.productCode;
            this.productType = request.productType;
            this.subscriptionType = request.subscriptionType;
        } 

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-kasjgfjshgf</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * <p>The subscription duration. Unit: months. This parameter is required if you switch the billing method to subscription. Valid values:</p>
         * <ul>
         * <li>1 to 9</li>
         * <li>12</li>
         * <li>24</li>
         * <li>36</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The code of the service to which the instance belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The type of the service to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li>Subscription: subscription</li>
         * <li>PayAsYouGo: pay-as-you-go</li>
         * </ul>
         * <blockquote>
         * <p> After the call is successful, the billing method of the instance is switched.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Subscription</p>
         */
        public Builder subscriptionType(String subscriptionType) {
            this.putQueryParameter("SubscriptionType", subscriptionType);
            this.subscriptionType = subscriptionType;
            return this;
        }

        @Override
        public ConvertChargeTypeRequest build() {
            return new ConvertChargeTypeRequest(this);
        } 

    } 

}
