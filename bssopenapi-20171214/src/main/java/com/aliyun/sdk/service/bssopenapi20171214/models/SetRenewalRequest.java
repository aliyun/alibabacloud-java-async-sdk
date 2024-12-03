// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetRenewalRequest} extends {@link RequestModel}
 *
 * <p>SetRenewalRequest</p>
 */
public class SetRenewalRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIDs")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceIDs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenewalPeriod")
    private Integer renewalPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenewalPeriodUnit")
    private String renewalPeriodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenewalStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String renewalStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionType")
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
         * <p>The ID of the instance. You can enable auto-renewal for up to 100 subscription instances at a time. Separate multiple instance IDs with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-askjdhaskfjh</p>
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
         * <p>The code of the service.</p>
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
         * <p>The type of the service.</p>
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
         * <p>The auto-renewal period. Valid values:</p>
         * <ul>
         * <li>1</li>
         * <li>2</li>
         * <li>3</li>
         * <li>6</li>
         * <li>12</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is required if the RenewalStatus parameter is set to AutoRenewal.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder renewalPeriod(Integer renewalPeriod) {
            this.putQueryParameter("RenewalPeriod", renewalPeriod);
            this.renewalPeriod = renewalPeriod;
            return this;
        }

        /**
         * <p>The unit of the auto-renewal period. Valid values:</p>
         * <ul>
         * <li>M: months</li>
         * <li>Y: years</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is required if the RenewalStatus parameter is set to AutoRenewal.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>M</p>
         */
        public Builder renewalPeriodUnit(String renewalPeriodUnit) {
            this.putQueryParameter("RenewalPeriodUnit", renewalPeriodUnit);
            this.renewalPeriodUnit = renewalPeriodUnit;
            return this;
        }

        /**
         * <p>The status of renewal. Valid values:</p>
         * <ul>
         * <li>AutoRenewal: The instance is automatically renewed.</li>
         * <li>ManualRenewal: The instance is manually renewed.</li>
         * <li>NotRenewal: The instance is not renewed.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AutoRenewal</p>
         */
        public Builder renewalStatus(String renewalStatus) {
            this.putQueryParameter("RenewalStatus", renewalStatus);
            this.renewalStatus = renewalStatus;
            return this;
        }

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li>Subscription: subscription</li>
         * <li>PayAsYouGo: pay-as-you-go</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayAsYouGo</p>
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
