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
 * {@link CreateInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceRequest</p>
 */
public class CreateInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Logistics")
    private String logistics;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameter")
    private java.util.List<Parameter> parameter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PricingCycle")
    private Long pricingCycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenewPeriod")
    private Integer renewPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RenewalStatus")
    private String renewalStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subscriptionType;

    private CreateInstanceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.logistics = builder.logistics;
        this.ownerId = builder.ownerId;
        this.parameter = builder.parameter;
        this.period = builder.period;
        this.pricingCycle = builder.pricingCycle;
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
    public java.util.List<Parameter> getParameter() {
        return this.parameter;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return pricingCycle
     */
    public Long getPricingCycle() {
        return this.pricingCycle;
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
        private java.util.List<Parameter> parameter; 
        private Integer period; 
        private Long pricingCycle; 
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
            this.pricingCycle = request.pricingCycle;
            this.productCode = request.productCode;
            this.productType = request.productType;
            this.renewPeriod = request.renewPeriod;
            this.renewalStatus = request.renewalStatus;
            this.subscriptionType = request.subscriptionType;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. The server checks whether a request that uses the same client token has been received. If a request that uses the same client token has been received, the server returns the same request result as the previous request.</p>
         * 
         * <strong>example:</strong>
         * <p>JASIOFKVNVIXXXXXX</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The logistics address of this order. This parameter is generally valid for physical orders.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;cityCode&quot;:&quot;330100&quot;,&quot;cityName&quot;:&quot;Hangzhou&quot;,&quot;contactName&quot;:&quot;Test&quot;,&quot;countryCode&quot;:&quot;&quot;,&quot;districtName&quot;:&quot;Puyan Street&quot;,&quot;email&quot;:&quot;**@example.com&quot;,&quot;mobilePhone&quot;:&quot;153564848844&quot;,&quot;phone&quot;:&quot;1234567&quot;,&quot;provCode&quot;:&quot;330000&quot;,&quot;provName&quot;:&quot;Zhejiang&quot;,&quot;streetCode&quot;:&quot;33010610&quot;,&quot;streetName&quot;:&quot;Zhuantang&quot;,&quot;zipCode&quot;:&quot;0000&quot;}</p>
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
         * <p>The details of the modules.</p>
         */
        public Builder parameter(java.util.List<Parameter> parameter) {
            this.putQueryParameter("Parameter", parameter);
            this.parameter = parameter;
            return this;
        }

        /**
         * <p>The subscription duration. Unit: month. The value must be an integral multiple of 12.</p>
         * <blockquote>
         * <p> This parameter is required if you create a subscription instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * PricingCycle.
         */
        public Builder pricingCycle(Long pricingCycle) {
            this.putQueryParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * <p>The code of the service to which the instance belongs. You can query the service code by calling the <strong>QueryProductList</strong> operation or viewing <strong>Codes of Alibaba Cloud Services</strong>.</p>
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
         * <p>The auto-renewal period. Unit: month.</p>
         * <blockquote>
         * <p> This parameter is required if the <strong>RenewalStatus</strong> parameter is set to <strong>AutoRenewal</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder renewPeriod(Integer renewPeriod) {
            this.putQueryParameter("RenewPeriod", renewPeriod);
            this.renewPeriod = renewPeriod;
            return this;
        }

        /**
         * <p>The renewal method. Valid values:</p>
         * <ul>
         * <li>AutoRenewal: The instance is automatically renewed.</li>
         * <li>ManualRenewal: The instance is manually renewed.</li>
         * </ul>
         * <p>Default value: ManualRenewal.</p>
         * 
         * <strong>example:</strong>
         * <p>ManualRenewal</p>
         */
        public Builder renewalStatus(String renewalStatus) {
            this.putQueryParameter("RenewalStatus", renewalStatus);
            this.renewalStatus = renewalStatus;
            return this;
        }

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li>Subscription: the subscription billing method.</li>
         * <li>PayAsYouGo: the pay-as-you-go billing method.</li>
         * </ul>
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
        public CreateInstanceRequest build() {
            return new CreateInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
     */
    public static class Parameter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        @com.aliyun.core.annotation.Validation(required = true)
        private String code;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The code property of the Nth module. Value of N: 1 to 100. If multiple module property parameters are involved, concatenate multiple parameters based on the value of N in sequence.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>InstanceType</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The value property of the Nth module. Value of N: 1 to 100.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>disk</p>
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
