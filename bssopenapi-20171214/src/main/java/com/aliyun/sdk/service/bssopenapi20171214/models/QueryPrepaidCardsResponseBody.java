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
 * {@link QueryPrepaidCardsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPrepaidCardsResponseBody</p>
 */
public class QueryPrepaidCardsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(QueryPrepaidCardsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful!</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7EA6C02D-06D0-4213-9C3B-E67910F7D1EB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryPrepaidCardsResponseBody build() {
            return new QueryPrepaidCardsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryPrepaidCardsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryPrepaidCardsResponseBody</p>
     */
    public static class PrepaidCard extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicableProducts")
        private String applicableProducts;

        @com.aliyun.core.annotation.NameInMap("ApplicableScenarios")
        private String applicableScenarios;

        @com.aliyun.core.annotation.NameInMap("Balance")
        private String balance;

        @com.aliyun.core.annotation.NameInMap("EffectiveTime")
        private String effectiveTime;

        @com.aliyun.core.annotation.NameInMap("ExpiryTime")
        private String expiryTime;

        @com.aliyun.core.annotation.NameInMap("GrantedTime")
        private String grantedTime;

        @com.aliyun.core.annotation.NameInMap("NominalValue")
        private String nominalValue;

        @com.aliyun.core.annotation.NameInMap("PrepaidCardId")
        private Long prepaidCardId;

        @com.aliyun.core.annotation.NameInMap("PrepaidCardNo")
        private String prepaidCardNo;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(PrepaidCard model) {
                this.applicableProducts = model.applicableProducts;
                this.applicableScenarios = model.applicableScenarios;
                this.balance = model.balance;
                this.effectiveTime = model.effectiveTime;
                this.expiryTime = model.expiryTime;
                this.grantedTime = model.grantedTime;
                this.nominalValue = model.nominalValue;
                this.prepaidCardId = model.prepaidCardId;
                this.prepaidCardNo = model.prepaidCardNo;
                this.status = model.status;
            } 

            /**
             * ApplicableProducts.
             */
            public Builder applicableProducts(String applicableProducts) {
                this.applicableProducts = applicableProducts;
                return this;
            }

            /**
             * ApplicableScenarios.
             */
            public Builder applicableScenarios(String applicableScenarios) {
                this.applicableScenarios = applicableScenarios;
                return this;
            }

            /**
             * Balance.
             */
            public Builder balance(String balance) {
                this.balance = balance;
                return this;
            }

            /**
             * EffectiveTime.
             */
            public Builder effectiveTime(String effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            /**
             * ExpiryTime.
             */
            public Builder expiryTime(String expiryTime) {
                this.expiryTime = expiryTime;
                return this;
            }

            /**
             * GrantedTime.
             */
            public Builder grantedTime(String grantedTime) {
                this.grantedTime = grantedTime;
                return this;
            }

            /**
             * NominalValue.
             */
            public Builder nominalValue(String nominalValue) {
                this.nominalValue = nominalValue;
                return this;
            }

            /**
             * PrepaidCardId.
             */
            public Builder prepaidCardId(Long prepaidCardId) {
                this.prepaidCardId = prepaidCardId;
                return this;
            }

            /**
             * PrepaidCardNo.
             */
            public Builder prepaidCardNo(String prepaidCardNo) {
                this.prepaidCardNo = prepaidCardNo;
                return this;
            }

            /**
             * Status.
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
    /**
     * 
     * {@link QueryPrepaidCardsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryPrepaidCardsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrepaidCard")
        private java.util.List<PrepaidCard> prepaidCard;

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
        public java.util.List<PrepaidCard> getPrepaidCard() {
            return this.prepaidCard;
        }

        public static final class Builder {
            private java.util.List<PrepaidCard> prepaidCard; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.prepaidCard = model.prepaidCard;
            } 

            /**
             * PrepaidCard.
             */
            public Builder prepaidCard(java.util.List<PrepaidCard> prepaidCard) {
                this.prepaidCard = prepaidCard;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
