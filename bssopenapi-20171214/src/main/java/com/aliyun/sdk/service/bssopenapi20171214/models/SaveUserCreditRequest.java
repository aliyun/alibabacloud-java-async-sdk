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

        private Builder(SaveUserCreditRequest request) {
            super(request);
            this.avoidExpiration = request.avoidExpiration;
            this.avoidNotification = request.avoidNotification;
            this.avoidPrepaidExpiration = request.avoidPrepaidExpiration;
            this.avoidPrepaidNotification = request.avoidPrepaidNotification;
            this.creditType = request.creditType;
            this.creditValue = request.creditValue;
            this.description = request.description;
            this.operator = request.operator;
        } 

        /**
         * Specifies whether to enable service suspension protection for pay-as-you-go services.
         */
        public Builder avoidExpiration(Boolean avoidExpiration) {
            this.putQueryParameter("AvoidExpiration", avoidExpiration);
            this.avoidExpiration = avoidExpiration;
            return this;
        }

        /**
         * Specifies whether to allow the use of pay-as-you-go services without the need to send notifications.
         */
        public Builder avoidNotification(Boolean avoidNotification) {
            this.putQueryParameter("AvoidNotification", avoidNotification);
            this.avoidNotification = avoidNotification;
            return this;
        }

        /**
         * Specifies whether to enable service suspension protection for subscription services.
         */
        public Builder avoidPrepaidExpiration(Boolean avoidPrepaidExpiration) {
            this.putQueryParameter("AvoidPrepaidExpiration", avoidPrepaidExpiration);
            this.avoidPrepaidExpiration = avoidPrepaidExpiration;
            return this;
        }

        /**
         * Specifies whether to allow the use of subscription services without the need to send notifications.
         */
        public Builder avoidPrepaidNotification(Boolean avoidPrepaidNotification) {
            this.putQueryParameter("AvoidPrepaidNotification", avoidPrepaidNotification);
            this.avoidPrepaidNotification = avoidPrepaidNotification;
            return this;
        }

        /**
         * The type of the credit.
         */
        public Builder creditType(String creditType) {
            this.putQueryParameter("CreditType", creditType);
            this.creditType = creditType;
            return this;
        }

        /**
         * The value of the credit.
         */
        public Builder creditValue(String creditValue) {
            this.putQueryParameter("CreditValue", creditValue);
            this.creditValue = creditValue;
            return this;
        }

        /**
         * Description
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The operator who performs the action.
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
