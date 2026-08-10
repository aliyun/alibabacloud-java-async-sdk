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
 * {@link GlobalHotelQueryOrderResponseBody} extends {@link TeaModel}
 *
 * <p>GlobalHotelQueryOrderResponseBody</p>
 */
public class GlobalHotelQueryOrderResponseBody extends TeaModel {
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

    private GlobalHotelQueryOrderResponseBody(Builder builder) {
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

    public static GlobalHotelQueryOrderResponseBody create() {
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

        private Builder(GlobalHotelQueryOrderResponseBody model) {
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

        public GlobalHotelQueryOrderResponseBody build() {
            return new GlobalHotelQueryOrderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GlobalHotelQueryOrderResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelQueryOrderResponseBody</p>
     */
    public static class Penalties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("End")
        private Long end;

        @com.aliyun.core.annotation.NameInMap("PenaltyType")
        private String penaltyType;

        @com.aliyun.core.annotation.NameInMap("PenaltyValue")
        private String penaltyValue;

        @com.aliyun.core.annotation.NameInMap("Start")
        private Long start;

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
        public Long getEnd() {
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
        public Long getStart() {
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
            private Long end; 
            private String penaltyType; 
            private String penaltyValue; 
            private Long start; 
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
            public Builder end(Long end) {
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
            public Builder start(Long start) {
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
     * {@link GlobalHotelQueryOrderResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelQueryOrderResponseBody</p>
     */
    public static class CancelPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Penalties")
        private java.util.List<Penalties> penalties;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        @com.aliyun.core.annotation.NameInMap("TracerId")
        private String tracerId;

        private CancelPolicy(Builder builder) {
            this.penalties = builder.penalties;
            this.policyType = builder.policyType;
            this.tracerId = builder.tracerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CancelPolicy create() {
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

            private Builder(CancelPolicy model) {
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

            public CancelPolicy build() {
                return new CancelPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link GlobalHotelQueryOrderResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelQueryOrderResponseBody</p>
     */
    public static class Currency extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrencyCode")
        private String currencyCode;

        @com.aliyun.core.annotation.NameInMap("DefaultFractionDigits")
        private Integer defaultFractionDigits;

        @com.aliyun.core.annotation.NameInMap("NumericCode")
        private Integer numericCode;

        private Currency(Builder builder) {
            this.currencyCode = builder.currencyCode;
            this.defaultFractionDigits = builder.defaultFractionDigits;
            this.numericCode = builder.numericCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Currency create() {
            return builder().build();
        }

        /**
         * @return currencyCode
         */
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        /**
         * @return defaultFractionDigits
         */
        public Integer getDefaultFractionDigits() {
            return this.defaultFractionDigits;
        }

        /**
         * @return numericCode
         */
        public Integer getNumericCode() {
            return this.numericCode;
        }

        public static final class Builder {
            private String currencyCode; 
            private Integer defaultFractionDigits; 
            private Integer numericCode; 

            private Builder() {
            } 

            private Builder(Currency model) {
                this.currencyCode = model.currencyCode;
                this.defaultFractionDigits = model.defaultFractionDigits;
                this.numericCode = model.numericCode;
            } 

            /**
             * CurrencyCode.
             */
            public Builder currencyCode(String currencyCode) {
                this.currencyCode = currencyCode;
                return this;
            }

            /**
             * <p>DefaultFractionDigits</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder defaultFractionDigits(Integer defaultFractionDigits) {
                this.defaultFractionDigits = defaultFractionDigits;
                return this;
            }

            /**
             * <p>NumericCode</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder numericCode(Integer numericCode) {
                this.numericCode = numericCode;
                return this;
            }

            public Currency build() {
                return new Currency(this);
            } 

        } 

    }
    /**
     * 
     * {@link GlobalHotelQueryOrderResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelQueryOrderResponseBody</p>
     */
    public static class Price extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cent")
        private Long cent;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private Currency currency;

        private Price(Builder builder) {
            this.cent = builder.cent;
            this.currency = builder.currency;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Price create() {
            return builder().build();
        }

        /**
         * @return cent
         */
        public Long getCent() {
            return this.cent;
        }

        /**
         * @return currency
         */
        public Currency getCurrency() {
            return this.currency;
        }

        public static final class Builder {
            private Long cent; 
            private Currency currency; 

            private Builder() {
            } 

            private Builder(Price model) {
                this.cent = model.cent;
                this.currency = model.currency;
            } 

            /**
             * <p>cent</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cent(Long cent) {
                this.cent = cent;
                return this;
            }

            /**
             * Currency.
             */
            public Builder currency(Currency currency) {
                this.currency = currency;
                return this;
            }

            public Price build() {
                return new Price(this);
            } 

        } 

    }
    /**
     * 
     * {@link GlobalHotelQueryOrderResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelQueryOrderResponseBody</p>
     */
    public static class DailyPrices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("Price")
        private Price price;

        private DailyPrices(Builder builder) {
            this.date = builder.date;
            this.price = builder.price;
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

        public static final class Builder {
            private String date; 
            private Price price; 

            private Builder() {
            } 

            private Builder(DailyPrices model) {
                this.date = model.date;
                this.price = model.price;
            } 

            /**
             * <p>LocalDate</p>
             * 
             * <strong>example:</strong>
             * <p>LocalDate</p>
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

            public DailyPrices build() {
                return new DailyPrices(this);
            } 

        } 

    }
    /**
     * 
     * {@link GlobalHotelQueryOrderResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelQueryOrderResponseBody</p>
     */
    public static class Meal extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("MealType")
        private String mealType;

        @com.aliyun.core.annotation.NameInMap("TracerId")
        private String tracerId;

        private Meal(Builder builder) {
            this.description = builder.description;
            this.mealType = builder.mealType;
            this.tracerId = builder.tracerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Meal create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return mealType
         */
        public String getMealType() {
            return this.mealType;
        }

        /**
         * @return tracerId
         */
        public String getTracerId() {
            return this.tracerId;
        }

        public static final class Builder {
            private String description; 
            private String mealType; 
            private String tracerId; 

            private Builder() {
            } 

            private Builder(Meal model) {
                this.description = model.description;
                this.mealType = model.mealType;
                this.tracerId = model.tracerId;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * MealType.
             */
            public Builder mealType(String mealType) {
                this.mealType = mealType;
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

            public Meal build() {
                return new Meal(this);
            } 

        } 

    }
    /**
     * 
     * {@link GlobalHotelQueryOrderResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelQueryOrderResponseBody</p>
     */
    public static class SellingTotalPrice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private String amount;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("TracerId")
        private String tracerId;

        private SellingTotalPrice(Builder builder) {
            this.amount = builder.amount;
            this.currency = builder.currency;
            this.tracerId = builder.tracerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SellingTotalPrice create() {
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

            private Builder(SellingTotalPrice model) {
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

            public SellingTotalPrice build() {
                return new SellingTotalPrice(this);
            } 

        } 

    }
    /**
     * 
     * {@link GlobalHotelQueryOrderResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelQueryOrderResponseBody</p>
     */
    public static class ItemInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CancelPolicy")
        private CancelPolicy cancelPolicy;

        @com.aliyun.core.annotation.NameInMap("CheckIn")
        private String checkIn;

        @com.aliyun.core.annotation.NameInMap("CheckInNumber")
        private Integer checkInNumber;

        @com.aliyun.core.annotation.NameInMap("CheckOut")
        private String checkOut;

        @com.aliyun.core.annotation.NameInMap("DailyPrices")
        private java.util.List<DailyPrices> dailyPrices;

        @com.aliyun.core.annotation.NameInMap("Meal")
        private Meal meal;

        @com.aliyun.core.annotation.NameInMap("RoomCount")
        private Integer roomCount;

        @com.aliyun.core.annotation.NameInMap("SellingTotalPrice")
        private SellingTotalPrice sellingTotalPrice;

        private ItemInfo(Builder builder) {
            this.cancelPolicy = builder.cancelPolicy;
            this.checkIn = builder.checkIn;
            this.checkInNumber = builder.checkInNumber;
            this.checkOut = builder.checkOut;
            this.dailyPrices = builder.dailyPrices;
            this.meal = builder.meal;
            this.roomCount = builder.roomCount;
            this.sellingTotalPrice = builder.sellingTotalPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemInfo create() {
            return builder().build();
        }

        /**
         * @return cancelPolicy
         */
        public CancelPolicy getCancelPolicy() {
            return this.cancelPolicy;
        }

        /**
         * @return checkIn
         */
        public String getCheckIn() {
            return this.checkIn;
        }

        /**
         * @return checkInNumber
         */
        public Integer getCheckInNumber() {
            return this.checkInNumber;
        }

        /**
         * @return checkOut
         */
        public String getCheckOut() {
            return this.checkOut;
        }

        /**
         * @return dailyPrices
         */
        public java.util.List<DailyPrices> getDailyPrices() {
            return this.dailyPrices;
        }

        /**
         * @return meal
         */
        public Meal getMeal() {
            return this.meal;
        }

        /**
         * @return roomCount
         */
        public Integer getRoomCount() {
            return this.roomCount;
        }

        /**
         * @return sellingTotalPrice
         */
        public SellingTotalPrice getSellingTotalPrice() {
            return this.sellingTotalPrice;
        }

        public static final class Builder {
            private CancelPolicy cancelPolicy; 
            private String checkIn; 
            private Integer checkInNumber; 
            private String checkOut; 
            private java.util.List<DailyPrices> dailyPrices; 
            private Meal meal; 
            private Integer roomCount; 
            private SellingTotalPrice sellingTotalPrice; 

            private Builder() {
            } 

            private Builder(ItemInfo model) {
                this.cancelPolicy = model.cancelPolicy;
                this.checkIn = model.checkIn;
                this.checkInNumber = model.checkInNumber;
                this.checkOut = model.checkOut;
                this.dailyPrices = model.dailyPrices;
                this.meal = model.meal;
                this.roomCount = model.roomCount;
                this.sellingTotalPrice = model.sellingTotalPrice;
            } 

            /**
             * CancelPolicy.
             */
            public Builder cancelPolicy(CancelPolicy cancelPolicy) {
                this.cancelPolicy = cancelPolicy;
                return this;
            }

            /**
             * CheckIn.
             */
            public Builder checkIn(String checkIn) {
                this.checkIn = checkIn;
                return this;
            }

            /**
             * CheckInNumber.
             */
            public Builder checkInNumber(Integer checkInNumber) {
                this.checkInNumber = checkInNumber;
                return this;
            }

            /**
             * CheckOut.
             */
            public Builder checkOut(String checkOut) {
                this.checkOut = checkOut;
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
             * Meal.
             */
            public Builder meal(Meal meal) {
                this.meal = meal;
                return this;
            }

            /**
             * RoomCount.
             */
            public Builder roomCount(Integer roomCount) {
                this.roomCount = roomCount;
                return this;
            }

            /**
             * SellingTotalPrice.
             */
            public Builder sellingTotalPrice(SellingTotalPrice sellingTotalPrice) {
                this.sellingTotalPrice = sellingTotalPrice;
                return this;
            }

            public ItemInfo build() {
                return new ItemInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GlobalHotelQueryOrderResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelQueryOrderResponseBody</p>
     */
    public static class Amount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private String amount;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("TracerId")
        private String tracerId;

        private Amount(Builder builder) {
            this.amount = builder.amount;
            this.currency = builder.currency;
            this.tracerId = builder.tracerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Amount create() {
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

            private Builder(Amount model) {
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

            public Amount build() {
                return new Amount(this);
            } 

        } 

    }
    /**
     * 
     * {@link GlobalHotelQueryOrderResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelQueryOrderResponseBody</p>
     */
    public static class Payment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private Amount amount;

        @com.aliyun.core.annotation.NameInMap("GmtPaid")
        private Long gmtPaid;

        @com.aliyun.core.annotation.NameInMap("PaymentMethod")
        private String paymentMethod;

        @com.aliyun.core.annotation.NameInMap("PaymentTransactionId")
        private String paymentTransactionId;

        private Payment(Builder builder) {
            this.amount = builder.amount;
            this.gmtPaid = builder.gmtPaid;
            this.paymentMethod = builder.paymentMethod;
            this.paymentTransactionId = builder.paymentTransactionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Payment create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Amount getAmount() {
            return this.amount;
        }

        /**
         * @return gmtPaid
         */
        public Long getGmtPaid() {
            return this.gmtPaid;
        }

        /**
         * @return paymentMethod
         */
        public String getPaymentMethod() {
            return this.paymentMethod;
        }

        /**
         * @return paymentTransactionId
         */
        public String getPaymentTransactionId() {
            return this.paymentTransactionId;
        }

        public static final class Builder {
            private Amount amount; 
            private Long gmtPaid; 
            private String paymentMethod; 
            private String paymentTransactionId; 

            private Builder() {
            } 

            private Builder(Payment model) {
                this.amount = model.amount;
                this.gmtPaid = model.gmtPaid;
                this.paymentMethod = model.paymentMethod;
                this.paymentTransactionId = model.paymentTransactionId;
            } 

            /**
             * Amount.
             */
            public Builder amount(Amount amount) {
                this.amount = amount;
                return this;
            }

            /**
             * GmtPaid.
             */
            public Builder gmtPaid(Long gmtPaid) {
                this.gmtPaid = gmtPaid;
                return this;
            }

            /**
             * PaymentMethod.
             */
            public Builder paymentMethod(String paymentMethod) {
                this.paymentMethod = paymentMethod;
                return this;
            }

            /**
             * PaymentTransactionId.
             */
            public Builder paymentTransactionId(String paymentTransactionId) {
                this.paymentTransactionId = paymentTransactionId;
                return this;
            }

            public Payment build() {
                return new Payment(this);
            } 

        } 

    }
    /**
     * 
     * {@link GlobalHotelQueryOrderResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelQueryOrderResponseBody</p>
     */
    public static class TotalPenaltyAmount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private String amount;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("TracerId")
        private String tracerId;

        private TotalPenaltyAmount(Builder builder) {
            this.amount = builder.amount;
            this.currency = builder.currency;
            this.tracerId = builder.tracerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TotalPenaltyAmount create() {
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

            private Builder(TotalPenaltyAmount model) {
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
             * <p>TraceId</p>
             * 
             * <strong>example:</strong>
             * <p>TraceId</p>
             */
            public Builder tracerId(String tracerId) {
                this.tracerId = tracerId;
                return this;
            }

            public TotalPenaltyAmount build() {
                return new TotalPenaltyAmount(this);
            } 

        } 

    }
    /**
     * 
     * {@link GlobalHotelQueryOrderResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelQueryOrderResponseBody</p>
     */
    public static class TotalRefundAmount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private String amount;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("TracerId")
        private String tracerId;

        private TotalRefundAmount(Builder builder) {
            this.amount = builder.amount;
            this.currency = builder.currency;
            this.tracerId = builder.tracerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TotalRefundAmount create() {
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

            private Builder(TotalRefundAmount model) {
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
             * <p>TraceId</p>
             * 
             * <strong>example:</strong>
             * <p>TraceId</p>
             */
            public Builder tracerId(String tracerId) {
                this.tracerId = tracerId;
                return this;
            }

            public TotalRefundAmount build() {
                return new TotalRefundAmount(this);
            } 

        } 

    }
    /**
     * 
     * {@link GlobalHotelQueryOrderResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelQueryOrderResponseBody</p>
     */
    public static class RefundOrders extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("RefundTransactionId")
        private String refundTransactionId;

        @com.aliyun.core.annotation.NameInMap("RejectReason")
        private String rejectReason;

        @com.aliyun.core.annotation.NameInMap("SellRefundOrderNo")
        private String sellRefundOrderNo;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TotalPenaltyAmount")
        private TotalPenaltyAmount totalPenaltyAmount;

        @com.aliyun.core.annotation.NameInMap("TotalRefundAmount")
        private TotalRefundAmount totalRefundAmount;

        private RefundOrders(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.refundTransactionId = builder.refundTransactionId;
            this.rejectReason = builder.rejectReason;
            this.sellRefundOrderNo = builder.sellRefundOrderNo;
            this.status = builder.status;
            this.totalPenaltyAmount = builder.totalPenaltyAmount;
            this.totalRefundAmount = builder.totalRefundAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundOrders create() {
            return builder().build();
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return refundTransactionId
         */
        public String getRefundTransactionId() {
            return this.refundTransactionId;
        }

        /**
         * @return rejectReason
         */
        public String getRejectReason() {
            return this.rejectReason;
        }

        /**
         * @return sellRefundOrderNo
         */
        public String getSellRefundOrderNo() {
            return this.sellRefundOrderNo;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalPenaltyAmount
         */
        public TotalPenaltyAmount getTotalPenaltyAmount() {
            return this.totalPenaltyAmount;
        }

        /**
         * @return totalRefundAmount
         */
        public TotalRefundAmount getTotalRefundAmount() {
            return this.totalRefundAmount;
        }

        public static final class Builder {
            private Long gmtCreate; 
            private String refundTransactionId; 
            private String rejectReason; 
            private String sellRefundOrderNo; 
            private String status; 
            private TotalPenaltyAmount totalPenaltyAmount; 
            private TotalRefundAmount totalRefundAmount; 

            private Builder() {
            } 

            private Builder(RefundOrders model) {
                this.gmtCreate = model.gmtCreate;
                this.refundTransactionId = model.refundTransactionId;
                this.rejectReason = model.rejectReason;
                this.sellRefundOrderNo = model.sellRefundOrderNo;
                this.status = model.status;
                this.totalPenaltyAmount = model.totalPenaltyAmount;
                this.totalRefundAmount = model.totalRefundAmount;
            } 

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * RefundTransactionId.
             */
            public Builder refundTransactionId(String refundTransactionId) {
                this.refundTransactionId = refundTransactionId;
                return this;
            }

            /**
             * RejectReason.
             */
            public Builder rejectReason(String rejectReason) {
                this.rejectReason = rejectReason;
                return this;
            }

            /**
             * SellRefundOrderNo.
             */
            public Builder sellRefundOrderNo(String sellRefundOrderNo) {
                this.sellRefundOrderNo = sellRefundOrderNo;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TotalPenaltyAmount.
             */
            public Builder totalPenaltyAmount(TotalPenaltyAmount totalPenaltyAmount) {
                this.totalPenaltyAmount = totalPenaltyAmount;
                return this;
            }

            /**
             * TotalRefundAmount.
             */
            public Builder totalRefundAmount(TotalRefundAmount totalRefundAmount) {
                this.totalRefundAmount = totalRefundAmount;
                return this;
            }

            public RefundOrders build() {
                return new RefundOrders(this);
            } 

        } 

    }
    /**
     * 
     * {@link GlobalHotelQueryOrderResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelQueryOrderResponseBody</p>
     */
    public static class Guests extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FirstName")
        private String firstName;

        @com.aliyun.core.annotation.NameInMap("LastName")
        private String lastName;

        @com.aliyun.core.annotation.NameInMap("TracerId")
        private String tracerId;

        private Guests(Builder builder) {
            this.firstName = builder.firstName;
            this.lastName = builder.lastName;
            this.tracerId = builder.tracerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Guests create() {
            return builder().build();
        }

        /**
         * @return firstName
         */
        public String getFirstName() {
            return this.firstName;
        }

        /**
         * @return lastName
         */
        public String getLastName() {
            return this.lastName;
        }

        /**
         * @return tracerId
         */
        public String getTracerId() {
            return this.tracerId;
        }

        public static final class Builder {
            private String firstName; 
            private String lastName; 
            private String tracerId; 

            private Builder() {
            } 

            private Builder(Guests model) {
                this.firstName = model.firstName;
                this.lastName = model.lastName;
                this.tracerId = model.tracerId;
            } 

            /**
             * FirstName.
             */
            public Builder firstName(String firstName) {
                this.firstName = firstName;
                return this;
            }

            /**
             * LastName.
             */
            public Builder lastName(String lastName) {
                this.lastName = lastName;
                return this;
            }

            /**
             * <p>TraceId</p>
             * 
             * <strong>example:</strong>
             * <p>TraceId</p>
             */
            public Builder tracerId(String tracerId) {
                this.tracerId = tracerId;
                return this;
            }

            public Guests build() {
                return new Guests(this);
            } 

        } 

    }
    /**
     * 
     * {@link GlobalHotelQueryOrderResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelQueryOrderResponseBody</p>
     */
    public static class RoomStays extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfirmationId")
        private String confirmationId;

        @com.aliyun.core.annotation.NameInMap("Guests")
        private java.util.List<Guests> guests;

        @com.aliyun.core.annotation.NameInMap("RoomIndex")
        private Integer roomIndex;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private RoomStays(Builder builder) {
            this.confirmationId = builder.confirmationId;
            this.guests = builder.guests;
            this.roomIndex = builder.roomIndex;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoomStays create() {
            return builder().build();
        }

        /**
         * @return confirmationId
         */
        public String getConfirmationId() {
            return this.confirmationId;
        }

        /**
         * @return guests
         */
        public java.util.List<Guests> getGuests() {
            return this.guests;
        }

        /**
         * @return roomIndex
         */
        public Integer getRoomIndex() {
            return this.roomIndex;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String confirmationId; 
            private java.util.List<Guests> guests; 
            private Integer roomIndex; 
            private String status; 

            private Builder() {
            } 

            private Builder(RoomStays model) {
                this.confirmationId = model.confirmationId;
                this.guests = model.guests;
                this.roomIndex = model.roomIndex;
                this.status = model.status;
            } 

            /**
             * ConfirmationId.
             */
            public Builder confirmationId(String confirmationId) {
                this.confirmationId = confirmationId;
                return this;
            }

            /**
             * Guests.
             */
            public Builder guests(java.util.List<Guests> guests) {
                this.guests = guests;
                return this;
            }

            /**
             * RoomIndex.
             */
            public Builder roomIndex(Integer roomIndex) {
                this.roomIndex = roomIndex;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public RoomStays build() {
                return new RoomStays(this);
            } 

        } 

    }
    /**
     * 
     * {@link GlobalHotelQueryOrderResponseBody} extends {@link TeaModel}
     *
     * <p>GlobalHotelQueryOrderResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BuyerId")
        private String buyerId;

        @com.aliyun.core.annotation.NameInMap("ExternalOrderNo")
        private String externalOrderNo;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("ItemInfo")
        private ItemInfo itemInfo;

        @com.aliyun.core.annotation.NameInMap("OrderNo")
        private String orderNo;

        @com.aliyun.core.annotation.NameInMap("Payment")
        private Payment payment;

        @com.aliyun.core.annotation.NameInMap("RefundOrders")
        private java.util.List<RefundOrders> refundOrders;

        @com.aliyun.core.annotation.NameInMap("RoomStays")
        private java.util.List<RoomStays> roomStays;

        @com.aliyun.core.annotation.NameInMap("SalesChannel")
        private String salesChannel;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TracerId")
        private String tracerId;

        private Data(Builder builder) {
            this.buyerId = builder.buyerId;
            this.externalOrderNo = builder.externalOrderNo;
            this.gmtCreate = builder.gmtCreate;
            this.itemInfo = builder.itemInfo;
            this.orderNo = builder.orderNo;
            this.payment = builder.payment;
            this.refundOrders = builder.refundOrders;
            this.roomStays = builder.roomStays;
            this.salesChannel = builder.salesChannel;
            this.status = builder.status;
            this.tracerId = builder.tracerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return buyerId
         */
        public String getBuyerId() {
            return this.buyerId;
        }

        /**
         * @return externalOrderNo
         */
        public String getExternalOrderNo() {
            return this.externalOrderNo;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return itemInfo
         */
        public ItemInfo getItemInfo() {
            return this.itemInfo;
        }

        /**
         * @return orderNo
         */
        public String getOrderNo() {
            return this.orderNo;
        }

        /**
         * @return payment
         */
        public Payment getPayment() {
            return this.payment;
        }

        /**
         * @return refundOrders
         */
        public java.util.List<RefundOrders> getRefundOrders() {
            return this.refundOrders;
        }

        /**
         * @return roomStays
         */
        public java.util.List<RoomStays> getRoomStays() {
            return this.roomStays;
        }

        /**
         * @return salesChannel
         */
        public String getSalesChannel() {
            return this.salesChannel;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tracerId
         */
        public String getTracerId() {
            return this.tracerId;
        }

        public static final class Builder {
            private String buyerId; 
            private String externalOrderNo; 
            private Long gmtCreate; 
            private ItemInfo itemInfo; 
            private String orderNo; 
            private Payment payment; 
            private java.util.List<RefundOrders> refundOrders; 
            private java.util.List<RoomStays> roomStays; 
            private String salesChannel; 
            private String status; 
            private String tracerId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.buyerId = model.buyerId;
                this.externalOrderNo = model.externalOrderNo;
                this.gmtCreate = model.gmtCreate;
                this.itemInfo = model.itemInfo;
                this.orderNo = model.orderNo;
                this.payment = model.payment;
                this.refundOrders = model.refundOrders;
                this.roomStays = model.roomStays;
                this.salesChannel = model.salesChannel;
                this.status = model.status;
                this.tracerId = model.tracerId;
            } 

            /**
             * BuyerId.
             */
            public Builder buyerId(String buyerId) {
                this.buyerId = buyerId;
                return this;
            }

            /**
             * ExternalOrderNo.
             */
            public Builder externalOrderNo(String externalOrderNo) {
                this.externalOrderNo = externalOrderNo;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * ItemInfo.
             */
            public Builder itemInfo(ItemInfo itemInfo) {
                this.itemInfo = itemInfo;
                return this;
            }

            /**
             * OrderNo.
             */
            public Builder orderNo(String orderNo) {
                this.orderNo = orderNo;
                return this;
            }

            /**
             * Payment.
             */
            public Builder payment(Payment payment) {
                this.payment = payment;
                return this;
            }

            /**
             * RefundOrders.
             */
            public Builder refundOrders(java.util.List<RefundOrders> refundOrders) {
                this.refundOrders = refundOrders;
                return this;
            }

            /**
             * RoomStays.
             */
            public Builder roomStays(java.util.List<RoomStays> roomStays) {
                this.roomStays = roomStays;
                return this;
            }

            /**
             * SalesChannel.
             */
            public Builder salesChannel(String salesChannel) {
                this.salesChannel = salesChannel;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
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
