// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveUserCreditRequest} extends {@link RequestModel}
 *
 * <p>SaveUserCreditRequest</p>
 */
public class SaveUserCreditRequest extends Request {
    @Query
    @NameInMap("AvoidExpiration")
    @Validation(required = true)
    private Boolean avoidExpiration;

    @Query
    @NameInMap("AvoidNotification")
    @Validation(required = true)
    private Boolean avoidNotification;

    @Query
    @NameInMap("AvoidPrepaidExpiration")
    @Validation(required = true)
    private Boolean avoidPrepaidExpiration;

    @Query
    @NameInMap("AvoidPrepaidNotification")
    @Validation(required = true)
    private Boolean avoidPrepaidNotification;

    @Query
    @NameInMap("CreditType")
    @Validation(required = true)
    private String creditType;

    @Query
    @NameInMap("CreditValue")
    @Validation(required = true)
    private String creditValue;

    @Query
    @NameInMap("Description")
    @Validation(required = true)
    private String description;

    @Query
    @NameInMap("Operator")
    @Validation(required = true)
    private String operator;

    private SaveUserCreditRequest(Builder builder) {
        super(builder);
        this.avoidExpiration = builder.avoidExpiration;
        this.avoidNotification = builder.avoidNotification;
        this.avoidPrepaidExpiration = builder.avoidPrepaidExpiration;
        this.avoidPrepaidNotification = builder.avoidPrepaidNotification;
        this.creditType = builder.creditType;
        this.creditValue = builder.creditValue;
        this.description = builder.description;
        this.operator = builder.operator;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveUserCreditRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return avoidExpiration
     */
    public Boolean getAvoidExpiration() {
        return this.avoidExpiration;
    }

    /**
     * @return avoidNotification
     */
    public Boolean getAvoidNotification() {
        return this.avoidNotification;
    }

    /**
     * @return avoidPrepaidExpiration
     */
    public Boolean getAvoidPrepaidExpiration() {
        return this.avoidPrepaidExpiration;
    }

    /**
     * @return avoidPrepaidNotification
     */
    public Boolean getAvoidPrepaidNotification() {
        return this.avoidPrepaidNotification;
    }

    /**
     * @return creditType
     */
    public String getCreditType() {
        return this.creditType;
    }

    /**
     * @return creditValue
     */
    public String getCreditValue() {
        return this.creditValue;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    public static final class Builder extends Request.Builder<SaveUserCreditRequest, Builder> {
        private Boolean avoidExpiration; 
        private Boolean avoidNotification; 
        private Boolean avoidPrepaidExpiration; 
        private Boolean avoidPrepaidNotification; 
        private String creditType; 
        private String creditValue; 
        private String description; 
        private String operator; 

        private Builder() {
            super();
        } 

        private Builder(SaveUserCreditRequest response) {
            super(response);
            this.avoidExpiration = response.avoidExpiration;
            this.avoidNotification = response.avoidNotification;
            this.avoidPrepaidExpiration = response.avoidPrepaidExpiration;
            this.avoidPrepaidNotification = response.avoidPrepaidNotification;
            this.creditType = response.creditType;
            this.creditValue = response.creditValue;
            this.description = response.description;
            this.operator = response.operator;
        } 

        /**
         * AvoidExpiration.
         */
        public Builder avoidExpiration(Boolean avoidExpiration) {
            this.putQueryParameter("AvoidExpiration", avoidExpiration);
            this.avoidExpiration = avoidExpiration;
            return this;
        }

        /**
         * AvoidNotification.
         */
        public Builder avoidNotification(Boolean avoidNotification) {
            this.putQueryParameter("AvoidNotification", avoidNotification);
            this.avoidNotification = avoidNotification;
            return this;
        }

        /**
         * AvoidPrepaidExpiration.
         */
        public Builder avoidPrepaidExpiration(Boolean avoidPrepaidExpiration) {
            this.putQueryParameter("AvoidPrepaidExpiration", avoidPrepaidExpiration);
            this.avoidPrepaidExpiration = avoidPrepaidExpiration;
            return this;
        }

        /**
         * AvoidPrepaidNotification.
         */
        public Builder avoidPrepaidNotification(Boolean avoidPrepaidNotification) {
            this.putQueryParameter("AvoidPrepaidNotification", avoidPrepaidNotification);
            this.avoidPrepaidNotification = avoidPrepaidNotification;
            return this;
        }

        /**
         * CreditType.
         */
        public Builder creditType(String creditType) {
            this.putQueryParameter("CreditType", creditType);
            this.creditType = creditType;
            return this;
        }

        /**
         * CreditValue.
         */
        public Builder creditValue(String creditValue) {
            this.putQueryParameter("CreditValue", creditValue);
            this.creditValue = creditValue;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Operator.
         */
        public Builder operator(String operator) {
            this.putQueryParameter("Operator", operator);
            this.operator = operator;
            return this;
        }

        @Override
        public SaveUserCreditRequest build() {
            return new SaveUserCreditRequest(this);
        } 

    } 

}
