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
         * <p>The status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
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

            /**
             * <p>The services to which the prepaid card is applicable.</p>
             * 
             * <strong>example:</strong>
             * <p>All Alibaba Cloud services</p>
             */
            public Builder applicableProducts(String applicableProducts) {
                this.applicableProducts = applicableProducts;
                return this;
            }

            /**
             * <p>The scenario to which the prepaid card is applicable.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder applicableScenarios(String applicableScenarios) {
                this.applicableScenarios = applicableScenarios;
                return this;
            }

            /**
             * <p>The balance of the prepaid card.</p>
             * 
             * <strong>example:</strong>
             * <p>100.00</p>
             */
            public Builder balance(String balance) {
                this.balance = balance;
                return this;
            }

            /**
             * <p>The time when the prepaid card took effect.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-08-03T01:39:11Z</p>
             */
            public Builder effectiveTime(String effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            /**
             * <p>The time when the prepaid card expired.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-08-04T01:39:11Z</p>
             */
            public Builder expiryTime(String expiryTime) {
                this.expiryTime = expiryTime;
                return this;
            }

            /**
             * <p>The time when the prepaid card was issued.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-08-03T01:39:11Z</p>
             */
            public Builder grantedTime(String grantedTime) {
                this.grantedTime = grantedTime;
                return this;
            }

            /**
             * <p>The nominal value of the prepaid card.</p>
             * 
             * <strong>example:</strong>
             * <p>100.00</p>
             */
            public Builder nominalValue(String nominalValue) {
                this.nominalValue = nominalValue;
                return this;
            }

            /**
             * <p>The ID of the prepaid card.</p>
             * 
             * <strong>example:</strong>
             * <p>213432432</p>
             */
            public Builder prepaidCardId(Long prepaidCardId) {
                this.prepaidCardId = prepaidCardId;
                return this;
            }

            /**
             * <p>The number of the prepaid card.</p>
             * 
             * <strong>example:</strong>
             * <p>Q-7edaab979fc9</p>
             */
            public Builder prepaidCardNo(String prepaidCardNo) {
                this.prepaidCardNo = prepaidCardNo;
                return this;
            }

            /**
             * <p>The status of the prepaid card. Valid values:</p>
             * <ul>
             * <li>Available: The prepaid card is valid.</li>
             * <li>Expired: The prepaid card expired.</li>
             * <li>Cancelled: The prepaid card is invalid.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
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
