// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetRenewalRequest} extends {@link RequestModel}
 *
 * <p>SetRenewalRequest</p>
 */
public class SetRenewalRequest extends Request {
    @Query
    @NameInMap("InstanceIDs")
    @Validation(required = true)
    private String instanceIDs;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ProductCode")
    @Validation(required = true)
    private String productCode;

    @Query
    @NameInMap("ProductType")
    private String productType;

    @Query
    @NameInMap("RenewalPeriod")
    private Integer renewalPeriod;

    @Query
    @NameInMap("RenewalPeriodUnit")
    private String renewalPeriodUnit;

    @Query
    @NameInMap("RenewalStatus")
    @Validation(required = true)
    private String renewalStatus;

    @Query
    @NameInMap("SubscriptionType")
    private String subscriptionType;

    private SetRenewalRequest(Builder builder) {
        super(builder);
        this.instanceIDs = builder.instanceIDs;
        this.ownerId = builder.ownerId;
        this.productCode = builder.productCode;
        this.productType = builder.productType;
        this.renewalPeriod = builder.renewalPeriod;
        this.renewalPeriodUnit = builder.renewalPeriodUnit;
        this.renewalStatus = builder.renewalStatus;
        this.subscriptionType = builder.subscriptionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetRenewalRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIDs
     */
    public String getInstanceIDs() {
        return this.instanceIDs;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return renewalPeriod
     */
    public Integer getRenewalPeriod() {
        return this.renewalPeriod;
    }

    /**
     * @return renewalPeriodUnit
     */
    public String getRenewalPeriodUnit() {
        return this.renewalPeriodUnit;
    }

    /**
     * @return renewalStatus
     */
    public String getRenewalStatus() {
        return this.renewalStatus;
    }

    /**
     * @return subscriptionType
     */
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    public static final class Builder extends Request.Builder<SetRenewalRequest, Builder> {
        private String instanceIDs; 
        private Long ownerId; 
        private String productCode; 
        private String productType; 
        private Integer renewalPeriod; 
        private String renewalPeriodUnit; 
        private String renewalStatus; 
        private String subscriptionType; 

        private Builder() {
            super();
        } 

        private Builder(SetRenewalRequest request) {
            super(request);
            this.instanceIDs = request.instanceIDs;
            this.ownerId = request.ownerId;
            this.productCode = request.productCode;
            this.productType = request.productType;
            this.renewalPeriod = request.renewalPeriod;
            this.renewalPeriodUnit = request.renewalPeriodUnit;
            this.renewalStatus = request.renewalStatus;
            this.subscriptionType = request.subscriptionType;
        } 

        /**
         * The ID of the instance. You can enable auto-renewal for up to 100 subscription instances at a time. Separate multiple instance IDs with commas (,).
         */
        public Builder instanceIDs(String instanceIDs) {
            this.putQueryParameter("InstanceIDs", instanceIDs);
            this.instanceIDs = instanceIDs;
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
         * The code of the service.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * The type of the service.
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * The auto-renewal period. Valid values:
         * <p>
         * 
         * *   1
         * *   2
         * *   3
         * *   6
         * *   12
         * 
         * >  This parameter is required if the RenewalStatus parameter is set to AutoRenewal.
         */
        public Builder renewalPeriod(Integer renewalPeriod) {
            this.putQueryParameter("RenewalPeriod", renewalPeriod);
            this.renewalPeriod = renewalPeriod;
            return this;
        }

        /**
         * The unit of the auto-renewal period. Valid values:
         * <p>
         * 
         * *   M: months
         * *   Y: years
         * 
         * >  This parameter is required if the RenewalStatus parameter is set to AutoRenewal.
         */
        public Builder renewalPeriodUnit(String renewalPeriodUnit) {
            this.putQueryParameter("RenewalPeriodUnit", renewalPeriodUnit);
            this.renewalPeriodUnit = renewalPeriodUnit;
            return this;
        }

        /**
         * The status of renewal. Valid values:
         * <p>
         * 
         * *   AutoRenewal: The instance is automatically renewed.
         * *   ManualRenewal: The instance is manually renewed.
         * *   NotRenewal: The instance is not renewed.
         */
        public Builder renewalStatus(String renewalStatus) {
            this.putQueryParameter("RenewalStatus", renewalStatus);
            this.renewalStatus = renewalStatus;
            return this;
        }

        /**
         * The billing method. Valid values:
         * <p>
         * 
         * *   Subscription: subscription
         * *   PayAsYouGo: pay-as-you-go
         */
        public Builder subscriptionType(String subscriptionType) {
            this.putQueryParameter("SubscriptionType", subscriptionType);
            this.subscriptionType = subscriptionType;
            return this;
        }

        @Override
        public SetRenewalRequest build() {
            return new SetRenewalRequest(this);
        } 

    } 

}
