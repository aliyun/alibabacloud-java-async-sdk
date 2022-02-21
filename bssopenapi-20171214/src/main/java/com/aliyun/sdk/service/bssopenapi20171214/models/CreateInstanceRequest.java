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

        private Builder(CreateInstanceRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.logistics = response.logistics;
            this.ownerId = response.ownerId;
            this.parameter = response.parameter;
            this.period = response.period;
            this.productCode = response.productCode;
            this.productType = response.productType;
            this.renewPeriod = response.renewPeriod;
            this.renewalStatus = response.renewalStatus;
            this.subscriptionType = response.subscriptionType;
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
         * Logistics.
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
         * Parameter.
         */
        public Builder parameter(java.util.List < Parameter> parameter) {
            this.putQueryParameter("Parameter", parameter);
            this.parameter = parameter;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
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
         * RenewPeriod.
         */
        public Builder renewPeriod(Integer renewPeriod) {
            this.putQueryParameter("RenewPeriod", renewPeriod);
            this.renewPeriod = renewPeriod;
            return this;
        }

        /**
         * RenewalStatus.
         */
        public Builder renewalStatus(String renewalStatus) {
            this.putQueryParameter("RenewalStatus", renewalStatus);
            this.renewalStatus = renewalStatus;
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
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Value.
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
