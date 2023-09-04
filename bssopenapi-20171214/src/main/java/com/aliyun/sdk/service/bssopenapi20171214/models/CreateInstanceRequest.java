// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceRequest</p>
 */
public class CreateInstanceRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Logistics")
    private String logistics;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Parameter")
    private java.util.List < Parameter> parameter;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("ProductCode")
    @Validation(required = true)
    private String productCode;

    @Query
    @NameInMap("ProductType")
    private String productType;

    @Query
    @NameInMap("RenewPeriod")
    private Integer renewPeriod;

    @Query
    @NameInMap("RenewalStatus")
    private String renewalStatus;

    @Query
    @NameInMap("SubscriptionType")
    @Validation(required = true)
    private String subscriptionType;

    private CreateInstanceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.logistics = builder.logistics;
        this.ownerId = builder.ownerId;
        this.parameter = builder.parameter;
        this.period = builder.period;
        this.productCode = builder.productCode;
        this.productType = builder.productType;
        this.renewPeriod = builder.renewPeriod;
        this.renewalStatus = builder.renewalStatus;
        this.subscriptionType = builder.subscriptionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return logistics
     */
    public String getLogistics() {
        return this.logistics;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return parameter
     */
    public java.util.List < Parameter> getParameter() {
        return this.parameter;
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
     * @return renewPeriod
     */
    public Integer getRenewPeriod() {
        return this.renewPeriod;
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

    public static final class Builder extends Request.Builder<CreateInstanceRequest, Builder> {
        private String clientToken; 
        private String logistics; 
        private Long ownerId; 
        private java.util.List < Parameter> parameter; 
        private Integer period; 
        private String productCode; 
        private String productType; 
        private Integer renewPeriod; 
        private String renewalStatus; 
        private String subscriptionType; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.logistics = request.logistics;
            this.ownerId = request.ownerId;
            this.parameter = request.parameter;
            this.period = request.period;
            this.productCode = request.productCode;
            this.productType = request.productType;
            this.renewPeriod = request.renewPeriod;
            this.renewalStatus = request.renewalStatus;
            this.subscriptionType = request.subscriptionType;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request. The server checks whether a request that uses the same client token has been received. If a request that uses the same client token has been received, the server returns the same request result as the previous request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The logistics address of this order. This parameter is generally valid for physical orders.
         */
        public Builder logistics(String logistics) {
            this.putQueryParameter("Logistics", logistics);
            this.logistics = logistics;
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
         * The details of the modules.
         */
        public Builder parameter(java.util.List < Parameter> parameter) {
            this.putQueryParameter("Parameter", parameter);
            this.parameter = parameter;
            return this;
        }

        /**
         * The subscription duration. Unit: month. The value must be an integral multiple of 12.
         * <p>
         * 
         * >  This parameter is required if you create a subscription instance.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The code of the service to which the instance belongs. You can query the service code by calling the **QueryProductList** operation or viewing **Codes of Alibaba Cloud Services**.
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
         * The auto-renewal period. Unit: month.
         * <p>
         * 
         * >  This parameter is required if the **RenewalStatus** parameter is set to **AutoRenewal**.
         */
        public Builder renewPeriod(Integer renewPeriod) {
            this.putQueryParameter("RenewPeriod", renewPeriod);
            this.renewPeriod = renewPeriod;
            return this;
        }

        /**
         * The renewal method. Valid values:
         * <p>
         * 
         * *   AutoRenewal: The instance is automatically renewed.
         * *   ManualRenewal: The instance is manually renewed.
         * 
         * Default value: ManualRenewal.
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
         * *   Subscription: the subscription billing method.
         * *   PayAsYouGo: the pay-as-you-go billing method.
         */
        public Builder subscriptionType(String subscriptionType) {
            this.putQueryParameter("SubscriptionType", subscriptionType);
            this.subscriptionType = subscriptionType;
            return this;
        }

        @Override
        public CreateInstanceRequest build() {
            return new CreateInstanceRequest(this);
        } 

    } 

    public static class Parameter extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        private String code;

        @NameInMap("Value")
        @Validation(required = true)
        private String value;

        private Parameter(Builder builder) {
            this.code = builder.code;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameter create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String code; 
            private String value; 

            /**
             * The code property of the Nth module. Value of N: 1 to 100. If multiple module property parameters are involved, concatenate multiple parameters based on the value of N in sequence.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The value property of the Nth module. Value of N: 1 to 100.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Parameter build() {
                return new Parameter(this);
            } 

        } 

    }
}
