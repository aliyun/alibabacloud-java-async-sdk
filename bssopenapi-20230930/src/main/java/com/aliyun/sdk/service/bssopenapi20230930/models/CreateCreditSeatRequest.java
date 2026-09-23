// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link CreateCreditSeatRequest} extends {@link RequestModel}
 *
 * <p>CreateCreditSeatRequest</p>
 */
public class CreateCreditSeatRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodUnit")
    private String periodUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionConfigs")
    private java.util.List<SubscriptionConfigs> subscriptionConfigs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionType")
    private String subscriptionType;

    private CreateCreditSeatRequest(Builder builder) {
        super(builder);
        this.autoRenew = builder.autoRenew;
        this.clientToken = builder.clientToken;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.productCode = builder.productCode;
        this.productType = builder.productType;
        this.subscriptionConfigs = builder.subscriptionConfigs;
        this.subscriptionType = builder.subscriptionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCreditSeatRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
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
     * @return subscriptionConfigs
     */
    public java.util.List<SubscriptionConfigs> getSubscriptionConfigs() {
        return this.subscriptionConfigs;
    }

    /**
     * @return subscriptionType
     */
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    public static final class Builder extends Request.Builder<CreateCreditSeatRequest, Builder> {
        private Boolean autoRenew; 
        private String clientToken; 
        private Integer period; 
        private String periodUnit; 
        private String productCode; 
        private String productType; 
        private java.util.List<SubscriptionConfigs> subscriptionConfigs; 
        private String subscriptionType; 

        private Builder() {
            super();
        } 

        private Builder(CreateCreditSeatRequest request) {
            super(request);
            this.autoRenew = request.autoRenew;
            this.clientToken = request.clientToken;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.productCode = request.productCode;
            this.productType = request.productType;
            this.subscriptionConfigs = request.subscriptionConfigs;
            this.subscriptionType = request.subscriptionType;
        } 

        /**
         * AutoRenew.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
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
         * <p>This parameter is required.</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * PeriodUnit.
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
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
         * SubscriptionConfigs.
         */
        public Builder subscriptionConfigs(java.util.List<SubscriptionConfigs> subscriptionConfigs) {
            this.putQueryParameter("SubscriptionConfigs", subscriptionConfigs);
            this.subscriptionConfigs = subscriptionConfigs;
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
        public CreateCreditSeatRequest build() {
            return new CreateCreditSeatRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateCreditSeatRequest} extends {@link TeaModel}
     *
     * <p>CreateCreditSeatRequest</p>
     */
    public static class Configs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Configs(Builder builder) {
            this.code = builder.code;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configs create() {
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

            private Builder() {
            } 

            private Builder(Configs model) {
                this.code = model.code;
                this.value = model.value;
            } 

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

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateCreditSeatRequest} extends {@link TeaModel}
     *
     * <p>CreateCreditSeatRequest</p>
     */
    public static class SubscriptionConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Configs")
        private java.util.List<Configs> configs;

        @com.aliyun.core.annotation.NameInMap("Seats")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long seats;

        private SubscriptionConfigs(Builder builder) {
            this.configs = builder.configs;
            this.seats = builder.seats;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubscriptionConfigs create() {
            return builder().build();
        }

        /**
         * @return configs
         */
        public java.util.List<Configs> getConfigs() {
            return this.configs;
        }

        /**
         * @return seats
         */
        public Long getSeats() {
            return this.seats;
        }

        public static final class Builder {
            private java.util.List<Configs> configs; 
            private Long seats; 

            private Builder() {
            } 

            private Builder(SubscriptionConfigs model) {
                this.configs = model.configs;
                this.seats = model.seats;
            } 

            /**
             * Configs.
             */
            public Builder configs(java.util.List<Configs> configs) {
                this.configs = configs;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder seats(Long seats) {
                this.seats = seats;
                return this;
            }

            public SubscriptionConfigs build() {
                return new SubscriptionConfigs(this);
            } 

        } 

    }
}
