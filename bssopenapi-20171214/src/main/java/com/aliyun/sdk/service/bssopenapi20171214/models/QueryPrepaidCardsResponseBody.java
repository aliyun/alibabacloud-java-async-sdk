// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPrepaidCardsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPrepaidCardsResponseBody</p>
 */
public class QueryPrepaidCardsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryPrepaidCardsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPrepaidCardsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The status code returned.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryPrepaidCardsResponseBody build() {
            return new QueryPrepaidCardsResponseBody(this);
        } 

    } 

    public static class PrepaidCard extends TeaModel {
        @NameInMap("ApplicableProducts")
        private String applicableProducts;

        @NameInMap("ApplicableScenarios")
        private String applicableScenarios;

        @NameInMap("Balance")
        private String balance;

        @NameInMap("EffectiveTime")
        private String effectiveTime;

        @NameInMap("ExpiryTime")
        private String expiryTime;

        @NameInMap("GrantedTime")
        private String grantedTime;

        @NameInMap("NominalValue")
        private String nominalValue;

        @NameInMap("PrepaidCardId")
        private Long prepaidCardId;

        @NameInMap("PrepaidCardNo")
        private String prepaidCardNo;

        @NameInMap("Status")
        private String status;

        private PrepaidCard(Builder builder) {
            this.applicableProducts = builder.applicableProducts;
            this.applicableScenarios = builder.applicableScenarios;
            this.balance = builder.balance;
            this.effectiveTime = builder.effectiveTime;
            this.expiryTime = builder.expiryTime;
            this.grantedTime = builder.grantedTime;
            this.nominalValue = builder.nominalValue;
            this.prepaidCardId = builder.prepaidCardId;
            this.prepaidCardNo = builder.prepaidCardNo;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrepaidCard create() {
            return builder().build();
        }

        /**
         * @return applicableProducts
         */
        public String getApplicableProducts() {
            return this.applicableProducts;
        }

        /**
         * @return applicableScenarios
         */
        public String getApplicableScenarios() {
            return this.applicableScenarios;
        }

        /**
         * @return balance
         */
        public String getBalance() {
            return this.balance;
        }

        /**
         * @return effectiveTime
         */
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        /**
         * @return expiryTime
         */
        public String getExpiryTime() {
            return this.expiryTime;
        }

        /**
         * @return grantedTime
         */
        public String getGrantedTime() {
            return this.grantedTime;
        }

        /**
         * @return nominalValue
         */
        public String getNominalValue() {
            return this.nominalValue;
        }

        /**
         * @return prepaidCardId
         */
        public Long getPrepaidCardId() {
            return this.prepaidCardId;
        }

        /**
         * @return prepaidCardNo
         */
        public String getPrepaidCardNo() {
            return this.prepaidCardNo;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String applicableProducts; 
            private String applicableScenarios; 
            private String balance; 
            private String effectiveTime; 
            private String expiryTime; 
            private String grantedTime; 
            private String nominalValue; 
            private Long prepaidCardId; 
            private String prepaidCardNo; 
            private String status; 

            /**
             * The services to which the prepaid card is applicable.
             */
            public Builder applicableProducts(String applicableProducts) {
                this.applicableProducts = applicableProducts;
                return this;
            }

            /**
             * The scenario to which the prepaid card is applicable.
             */
            public Builder applicableScenarios(String applicableScenarios) {
                this.applicableScenarios = applicableScenarios;
                return this;
            }

            /**
             * The balance of the prepaid card.
             */
            public Builder balance(String balance) {
                this.balance = balance;
                return this;
            }

            /**
             * The time when the prepaid card took effect.
             */
            public Builder effectiveTime(String effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            /**
             * The time when the prepaid card expired.
             */
            public Builder expiryTime(String expiryTime) {
                this.expiryTime = expiryTime;
                return this;
            }

            /**
             * The time when the prepaid card was issued.
             */
            public Builder grantedTime(String grantedTime) {
                this.grantedTime = grantedTime;
                return this;
            }

            /**
             * The nominal value of the prepaid card.
             */
            public Builder nominalValue(String nominalValue) {
                this.nominalValue = nominalValue;
                return this;
            }

            /**
             * The ID of the prepaid card.
             */
            public Builder prepaidCardId(Long prepaidCardId) {
                this.prepaidCardId = prepaidCardId;
                return this;
            }

            /**
             * The number of the prepaid card.
             */
            public Builder prepaidCardNo(String prepaidCardNo) {
                this.prepaidCardNo = prepaidCardNo;
                return this;
            }

            /**
             * The status of the prepaid card. Valid values:
             * <p>
             * 
             * *   Available: The prepaid card is valid.
             * *   Expired: The prepaid card expired.
             * *   Cancelled: The prepaid card is invalid.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public PrepaidCard build() {
                return new PrepaidCard(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PrepaidCard")
        private java.util.List < PrepaidCard> prepaidCard;

        private Data(Builder builder) {
            this.prepaidCard = builder.prepaidCard;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return prepaidCard
         */
        public java.util.List < PrepaidCard> getPrepaidCard() {
            return this.prepaidCard;
        }

        public static final class Builder {
            private java.util.List < PrepaidCard> prepaidCard; 

            /**
             * PrepaidCard.
             */
            public Builder prepaidCard(java.util.List < PrepaidCard> prepaidCard) {
                this.prepaidCard = prepaidCard;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
