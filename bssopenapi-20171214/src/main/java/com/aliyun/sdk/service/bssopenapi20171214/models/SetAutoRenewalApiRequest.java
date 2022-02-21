// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetAutoRenewalApiRequest} extends {@link RequestModel}
 *
 * <p>SetAutoRenewalApiRequest</p>
 */
public class SetAutoRenewalApiRequest extends Request {
    @Query
    @NameInMap("InstanceIDs")
    @Validation(required = true)
    private String instanceIDs;

    @Query
    @NameInMap("IsAutoRenewal")
    private Boolean isAutoRenewal;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ProductCode")
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
    @NameInMap("SubscriptionType")
    private String subscriptionType;

    private SetAutoRenewalApiRequest(Builder builder) {
        super(builder);
        this.instanceIDs = builder.instanceIDs;
        this.isAutoRenewal = builder.isAutoRenewal;
        this.ownerId = builder.ownerId;
        this.productCode = builder.productCode;
        this.productType = builder.productType;
        this.renewalPeriod = builder.renewalPeriod;
        this.renewalPeriodUnit = builder.renewalPeriodUnit;
        this.subscriptionType = builder.subscriptionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetAutoRenewalApiRequest create() {
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
     * @return isAutoRenewal
     */
    public Boolean getIsAutoRenewal() {
        return this.isAutoRenewal;
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
     * @return subscriptionType
     */
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    public static final class Builder extends Request.Builder<SetAutoRenewalApiRequest, Builder> {
        private String instanceIDs; 
        private Boolean isAutoRenewal; 
        private Long ownerId; 
        private String productCode; 
        private String productType; 
        private Integer renewalPeriod; 
        private String renewalPeriodUnit; 
        private String subscriptionType; 

        private Builder() {
            super();
        } 

        private Builder(SetAutoRenewalApiRequest response) {
            super(response);
            this.instanceIDs = response.instanceIDs;
            this.isAutoRenewal = response.isAutoRenewal;
            this.ownerId = response.ownerId;
            this.productCode = response.productCode;
            this.productType = response.productType;
            this.renewalPeriod = response.renewalPeriod;
            this.renewalPeriodUnit = response.renewalPeriodUnit;
            this.subscriptionType = response.subscriptionType;
        } 

        /**
         * InstanceIDs.
         */
        public Builder instanceIDs(String instanceIDs) {
            this.putQueryParameter("InstanceIDs", instanceIDs);
            this.instanceIDs = instanceIDs;
            return this;
        }

        /**
         * IsAutoRenewal.
         */
        public Builder isAutoRenewal(Boolean isAutoRenewal) {
            this.putQueryParameter("IsAutoRenewal", isAutoRenewal);
            this.isAutoRenewal = isAutoRenewal;
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
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * ProductType.
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * RenewalPeriod.
         */
        public Builder renewalPeriod(Integer renewalPeriod) {
            this.putQueryParameter("RenewalPeriod", renewalPeriod);
            this.renewalPeriod = renewalPeriod;
            return this;
        }

        /**
         * RenewalPeriodUnit.
         */
        public Builder renewalPeriodUnit(String renewalPeriodUnit) {
            this.putQueryParameter("RenewalPeriodUnit", renewalPeriodUnit);
            this.renewalPeriodUnit = renewalPeriodUnit;
            return this;
        }

        /**
         * SubscriptionType.
         */
        public Builder subscriptionType(String subscriptionType) {
            this.putQueryParameter("SubscriptionType", subscriptionType);
            this.subscriptionType = subscriptionType;
            return this;
        }

        @Override
        public SetAutoRenewalApiRequest build() {
            return new SetAutoRenewalApiRequest(this);
        } 

    } 

}
