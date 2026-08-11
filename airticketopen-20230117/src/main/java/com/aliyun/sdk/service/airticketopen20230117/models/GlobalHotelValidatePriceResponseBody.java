// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

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
 * {@link GlobalHotelValidatePriceResponseBody} extends {@link TeaModel}
 *
 * <p>GlobalHotelValidatePriceResponseBody</p>
 */
public class GlobalHotelValidatePriceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TracerId")
    private String tracerId;

    private GlobalHotelValidatePriceResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tracerId = builder.tracerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GlobalHotelValidatePriceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
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

    /**
     * @return tracerId
     */
    public String getTracerId() {
        return this.tracerId;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMsg; 
        private String requestId; 
        private Boolean success; 
        private String tracerId; 

        private Builder() {
        } 

        private Builder(GlobalHotelValidatePriceResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMsg = model.errorMsg;
            this.requestId = model.requestId;
            this.success = model.success;
            this.tracerId = model.tracerId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>TracerId</p>
         * 
         * <strong>example:</strong>
         * <p>TracerId</p>
         */
        public Builder tracerId(String tracerId) {
            this.tracerId = tracerId;
            return this;
        }

        public GlobalHotelValidatePriceResponseBody build() {
            return new GlobalHotelValidatePriceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GlobalHotelValidatePriceResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelValidatePriceResponseBody</p>
     */
    public static class Penalties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("End")
        private String end;

        @com.aliyun.core.annotation.NameInMap("PenaltyType")
        private String penaltyType;

        @com.aliyun.core.annotation.NameInMap("PenaltyValue")
        private String penaltyValue;

        @com.aliyun.core.annotation.NameInMap("Start")
        private String start;

        @com.aliyun.core.annotation.NameInMap("TracerId")
        private String tracerId;

        private Penalties(Builder builder) {
            this.currency = builder.currency;
            this.end = builder.end;
            this.penaltyType = builder.penaltyType;
            this.penaltyValue = builder.penaltyValue;
            this.start = builder.start;
            this.tracerId = builder.tracerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Penalties create() {
            return builder().build();
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return end
         */
        public String getEnd() {
            return this.end;
        }

        /**
         * @return penaltyType
         */
        public String getPenaltyType() {
            return this.penaltyType;
        }

        /**
         * @return penaltyValue
         */
        public String getPenaltyValue() {
            return this.penaltyValue;
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
        }

        /**
         * @return tracerId
         */
        public String getTracerId() {
            return this.tracerId;
        }

        public static final class Builder {
            private String currency; 
            private String end; 
            private String penaltyType; 
            private String penaltyValue; 
            private String start; 
            private String tracerId; 

            private Builder() {
            } 

            private Builder(Penalties model) {
                this.currency = model.currency;
                this.end = model.end;
                this.penaltyType = model.penaltyType;
                this.penaltyValue = model.penaltyValue;
                this.start = model.start;
                this.tracerId = model.tracerId;
            } 

            /**
             * Currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * End.
             */
            public Builder end(String end) {
                this.end = end;
                return this;
            }

            /**
             * PenaltyType.
             */
            public Builder penaltyType(String penaltyType) {
                this.penaltyType = penaltyType;
                return this;
            }

            /**
             * PenaltyValue.
             */
            public Builder penaltyValue(String penaltyValue) {
                this.penaltyValue = penaltyValue;
                return this;
            }

            /**
             * Start.
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            /**
             * <p>TracerId</p>
             * 
             * <strong>example:</strong>
             * <p>TracerId</p>
             */
            public Builder tracerId(String tracerId) {
                this.tracerId = tracerId;
                return this;
            }

            public Penalties build() {
                return new Penalties(this);
            } 

        } 

    }
    /**
     * 
     * {@link GlobalHotelValidatePriceResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelValidatePriceResponseBody</p>
     */
    public static class CancellationPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Penalties")
        private java.util.List<Penalties> penalties;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        @com.aliyun.core.annotation.NameInMap("TracerId")
        private String tracerId;

        private CancellationPolicies(Builder builder) {
            this.penalties = builder.penalties;
            this.policyType = builder.policyType;
            this.tracerId = builder.tracerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CancellationPolicies create() {
            return builder().build();
        }

        /**
         * @return penalties
         */
        public java.util.List<Penalties> getPenalties() {
            return this.penalties;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        /**
         * @return tracerId
         */
        public String getTracerId() {
            return this.tracerId;
        }

        public static final class Builder {
            private java.util.List<Penalties> penalties; 
            private String policyType; 
            private String tracerId; 

            private Builder() {
            } 

            private Builder(CancellationPolicies model) {
                this.penalties = model.penalties;
                this.policyType = model.policyType;
                this.tracerId = model.tracerId;
            } 

            /**
             * Penalties.
             */
            public Builder penalties(java.util.List<Penalties> penalties) {
                this.penalties = penalties;
                return this;
            }

            /**
             * PolicyType.
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * <p>TracerId</p>
             * 
             * <strong>example:</strong>
             * <p>TracerId</p>
             */
            public Builder tracerId(String tracerId) {
                this.tracerId = tracerId;
                return this;
            }

            public CancellationPolicies build() {
                return new CancellationPolicies(this);
            } 

        } 

    }
    /**
     * 
     * {@link GlobalHotelValidatePriceResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelValidatePriceResponseBody</p>
     */
    public static class Price extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private String amount;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("TracerId")
        private String tracerId;

        private Price(Builder builder) {
            this.amount = builder.amount;
            this.currency = builder.currency;
            this.tracerId = builder.tracerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Price create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public String getAmount() {
            return this.amount;
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return tracerId
         */
        public String getTracerId() {
            return this.tracerId;
        }

        public static final class Builder {
            private String amount; 
            private String currency; 
            private String tracerId; 

            private Builder() {
            } 

            private Builder(Price model) {
                this.amount = model.amount;
                this.currency = model.currency;
                this.tracerId = model.tracerId;
            } 

            /**
             * Amount.
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * Currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>TracerId</p>
             * 
             * <strong>example:</strong>
             * <p>TracerId</p>
             */
            public Builder tracerId(String tracerId) {
                this.tracerId = tracerId;
                return this;
            }

            public Price build() {
                return new Price(this);
            } 

        } 

    }
    /**
     * 
     * {@link GlobalHotelValidatePriceResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelValidatePriceResponseBody</p>
     */
    public static class DailyPrices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("Price")
        private Price price;

        @com.aliyun.core.annotation.NameInMap("TracerId")
        private String tracerId;

        private DailyPrices(Builder builder) {
            this.date = builder.date;
            this.price = builder.price;
            this.tracerId = builder.tracerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DailyPrices create() {
            return builder().build();
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return price
         */
        public Price getPrice() {
            return this.price;
        }

        /**
         * @return tracerId
         */
        public String getTracerId() {
            return this.tracerId;
        }

        public static final class Builder {
            private String date; 
            private Price price; 
            private String tracerId; 

            private Builder() {
            } 

            private Builder(DailyPrices model) {
                this.date = model.date;
                this.price = model.price;
                this.tracerId = model.tracerId;
            } 

            /**
             * Date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * Price.
             */
            public Builder price(Price price) {
                this.price = price;
                return this;
            }

            /**
             * <p>TracerId</p>
             * 
             * <strong>example:</strong>
             * <p>TracerId</p>
             */
            public Builder tracerId(String tracerId) {
                this.tracerId = tracerId;
                return this;
            }

            public DailyPrices build() {
                return new DailyPrices(this);
            } 

        } 

    }
    /**
     * 
     * {@link GlobalHotelValidatePriceResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelValidatePriceResponseBody</p>
     */
    public static class TotalPrice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private String amount;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("TracerId")
        private String tracerId;

        private TotalPrice(Builder builder) {
            this.amount = builder.amount;
            this.currency = builder.currency;
            this.tracerId = builder.tracerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TotalPrice create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public String getAmount() {
            return this.amount;
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return tracerId
         */
        public String getTracerId() {
            return this.tracerId;
        }

        public static final class Builder {
            private String amount; 
            private String currency; 
            private String tracerId; 

            private Builder() {
            } 

            private Builder(TotalPrice model) {
                this.amount = model.amount;
                this.currency = model.currency;
                this.tracerId = model.tracerId;
            } 

            /**
             * Amount.
             */
            public Builder amount(String amount) {
                this.amount = amount;
                return this;
            }

            /**
             * Currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>TracerId</p>
             * 
             * <strong>example:</strong>
             * <p>TracerId</p>
             */
            public Builder tracerId(String tracerId) {
                this.tracerId = tracerId;
                return this;
            }

            public TotalPrice build() {
                return new TotalPrice(this);
            } 

        } 

    }
    /**
     * 
     * {@link GlobalHotelValidatePriceResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelValidatePriceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CancellationPolicies")
        private java.util.List<CancellationPolicies> cancellationPolicies;

        @com.aliyun.core.annotation.NameInMap("DailyPrices")
        private java.util.List<DailyPrices> dailyPrices;

        @com.aliyun.core.annotation.NameInMap("ItemOfferId")
        private String itemOfferId;

        @com.aliyun.core.annotation.NameInMap("TotalPrice")
        private TotalPrice totalPrice;

        @com.aliyun.core.annotation.NameInMap("TracerId")
        private String tracerId;

        private Data(Builder builder) {
            this.cancellationPolicies = builder.cancellationPolicies;
            this.dailyPrices = builder.dailyPrices;
            this.itemOfferId = builder.itemOfferId;
            this.totalPrice = builder.totalPrice;
            this.tracerId = builder.tracerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cancellationPolicies
         */
        public java.util.List<CancellationPolicies> getCancellationPolicies() {
            return this.cancellationPolicies;
        }

        /**
         * @return dailyPrices
         */
        public java.util.List<DailyPrices> getDailyPrices() {
            return this.dailyPrices;
        }

        /**
         * @return itemOfferId
         */
        public String getItemOfferId() {
            return this.itemOfferId;
        }

        /**
         * @return totalPrice
         */
        public TotalPrice getTotalPrice() {
            return this.totalPrice;
        }

        /**
         * @return tracerId
         */
        public String getTracerId() {
            return this.tracerId;
        }

        public static final class Builder {
            private java.util.List<CancellationPolicies> cancellationPolicies; 
            private java.util.List<DailyPrices> dailyPrices; 
            private String itemOfferId; 
            private TotalPrice totalPrice; 
            private String tracerId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.cancellationPolicies = model.cancellationPolicies;
                this.dailyPrices = model.dailyPrices;
                this.itemOfferId = model.itemOfferId;
                this.totalPrice = model.totalPrice;
                this.tracerId = model.tracerId;
            } 

            /**
             * CancellationPolicies.
             */
            public Builder cancellationPolicies(java.util.List<CancellationPolicies> cancellationPolicies) {
                this.cancellationPolicies = cancellationPolicies;
                return this;
            }

            /**
             * DailyPrices.
             */
            public Builder dailyPrices(java.util.List<DailyPrices> dailyPrices) {
                this.dailyPrices = dailyPrices;
                return this;
            }

            /**
             * ItemOfferId.
             */
            public Builder itemOfferId(String itemOfferId) {
                this.itemOfferId = itemOfferId;
                return this;
            }

            /**
             * TotalPrice.
             */
            public Builder totalPrice(TotalPrice totalPrice) {
                this.totalPrice = totalPrice;
                return this;
            }

            /**
             * <p>TracerId</p>
             * 
             * <strong>example:</strong>
             * <p>TracerId</p>
             */
            public Builder tracerId(String tracerId) {
                this.tracerId = tracerId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
