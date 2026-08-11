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
 * {@link DataHotelsValue} extends {@link TeaModel}
 *
 * <p>DataHotelsValue</p>
 */
public class DataHotelsValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CheckInDate")
    private String checkInDate;

    @com.aliyun.core.annotation.NameInMap("CheckOutDate")
    private String checkOutDate;

    @com.aliyun.core.annotation.NameInMap("Rooms")
    private java.util.List<Rooms> rooms;

    @com.aliyun.core.annotation.NameInMap("StandardRoomId")
    private String standardRoomId;

    @com.aliyun.core.annotation.NameInMap("Offers")
    private java.util.List<Offers> offers;

    private DataHotelsValue(Builder builder) {
        this.checkInDate = builder.checkInDate;
        this.checkOutDate = builder.checkOutDate;
        this.rooms = builder.rooms;
        this.standardRoomId = builder.standardRoomId;
        this.offers = builder.offers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataHotelsValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkInDate
     */
    public String getCheckInDate() {
        return this.checkInDate;
    }

    /**
     * @return checkOutDate
     */
    public String getCheckOutDate() {
        return this.checkOutDate;
    }

    /**
     * @return rooms
     */
    public java.util.List<Rooms> getRooms() {
        return this.rooms;
    }

    /**
     * @return standardRoomId
     */
    public String getStandardRoomId() {
        return this.standardRoomId;
    }

    /**
     * @return offers
     */
    public java.util.List<Offers> getOffers() {
        return this.offers;
    }

    public static final class Builder {
        private String checkInDate; 
        private String checkOutDate; 
        private java.util.List<Rooms> rooms; 
        private String standardRoomId; 
        private java.util.List<Offers> offers; 

        private Builder() {
        } 

        private Builder(DataHotelsValue model) {
            this.checkInDate = model.checkInDate;
            this.checkOutDate = model.checkOutDate;
            this.rooms = model.rooms;
            this.standardRoomId = model.standardRoomId;
            this.offers = model.offers;
        } 

        /**
         * CheckInDate.
         */
        public Builder checkInDate(String checkInDate) {
            this.checkInDate = checkInDate;
            return this;
        }

        /**
         * CheckOutDate.
         */
        public Builder checkOutDate(String checkOutDate) {
            this.checkOutDate = checkOutDate;
            return this;
        }

        /**
         * Rooms.
         */
        public Builder rooms(java.util.List<Rooms> rooms) {
            this.rooms = rooms;
            return this;
        }

        /**
         * StandardRoomId.
         */
        public Builder standardRoomId(String standardRoomId) {
            this.standardRoomId = standardRoomId;
            return this;
        }

        /**
         * Offers.
         */
        public Builder offers(java.util.List<Offers> offers) {
            this.offers = offers;
            return this;
        }

        public DataHotelsValue build() {
            return new DataHotelsValue(this);
        } 

    } 

    /**
     * 
     * {@link DataHotelsValue} extends {@link TeaModel}
     *
     * <p>DataHotelsValue</p>
     */
    public static class LowestPrice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private String amount;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("TracerId")
        private String tracerId;

        private LowestPrice(Builder builder) {
            this.amount = builder.amount;
            this.currency = builder.currency;
            this.tracerId = builder.tracerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LowestPrice create() {
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

            private Builder(LowestPrice model) {
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
             * TracerId.
             */
            public Builder tracerId(String tracerId) {
                this.tracerId = tracerId;
                return this;
            }

            public LowestPrice build() {
                return new LowestPrice(this);
            } 

        } 

    }
    /**
     * 
     * {@link DataHotelsValue} extends {@link TeaModel}
     *
     * <p>DataHotelsValue</p>
     */
    public static class Penalties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Start")
        private String start;

        @com.aliyun.core.annotation.NameInMap("End")
        private String end;

        @com.aliyun.core.annotation.NameInMap("PenaltyType")
        private String penaltyType;

        @com.aliyun.core.annotation.NameInMap("PenaltyValue")
        private String penaltyValue;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("TracerId")
        private String tracerId;

        private Penalties(Builder builder) {
            this.start = builder.start;
            this.end = builder.end;
            this.penaltyType = builder.penaltyType;
            this.penaltyValue = builder.penaltyValue;
            this.currency = builder.currency;
            this.tracerId = builder.tracerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Penalties create() {
            return builder().build();
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
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
            private String start; 
            private String end; 
            private String penaltyType; 
            private String penaltyValue; 
            private String currency; 
            private String tracerId; 

            private Builder() {
            } 

            private Builder(Penalties model) {
                this.start = model.start;
                this.end = model.end;
                this.penaltyType = model.penaltyType;
                this.penaltyValue = model.penaltyValue;
                this.currency = model.currency;
                this.tracerId = model.tracerId;
            } 

            /**
             * Start.
             */
            public Builder start(String start) {
                this.start = start;
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
             * Currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * <p>traceId</p>
             * 
             * <strong>example:</strong>
             * <p>TraceId</p>
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
     * {@link DataHotelsValue} extends {@link TeaModel}
     *
     * <p>DataHotelsValue</p>
     */
    public static class CancelPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        @com.aliyun.core.annotation.NameInMap("Penalties")
        private java.util.List<Penalties> penalties;

        @com.aliyun.core.annotation.NameInMap("TracerId")
        private String tracerId;

        private CancelPolicy(Builder builder) {
            this.policyType = builder.policyType;
            this.penalties = builder.penalties;
            this.tracerId = builder.tracerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CancelPolicy create() {
            return builder().build();
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        /**
         * @return penalties
         */
        public java.util.List<Penalties> getPenalties() {
            return this.penalties;
        }

        /**
         * @return tracerId
         */
        public String getTracerId() {
            return this.tracerId;
        }

        public static final class Builder {
            private String policyType; 
            private java.util.List<Penalties> penalties; 
            private String tracerId; 

            private Builder() {
            } 

            private Builder(CancelPolicy model) {
                this.policyType = model.policyType;
                this.penalties = model.penalties;
                this.tracerId = model.tracerId;
            } 

            /**
             * PolicyType.
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * Penalties.
             */
            public Builder penalties(java.util.List<Penalties> penalties) {
                this.penalties = penalties;
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

            public CancelPolicy build() {
                return new CancelPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link DataHotelsValue} extends {@link TeaModel}
     *
     * <p>DataHotelsValue</p>
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
             * <p>TraceId</p>
             * 
             * <strong>example:</strong>
             * <p>TraceId</p>
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
     * {@link DataHotelsValue} extends {@link TeaModel}
     *
     * <p>DataHotelsValue</p>
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
             * <p>TraceId</p>
             * 
             * <strong>example:</strong>
             * <p>TraceId</p>
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
     * {@link DataHotelsValue} extends {@link TeaModel}
     *
     * <p>DataHotelsValue</p>
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
             * <p>TraceId</p>
             * 
             * <strong>example:</strong>
             * <p>TraceId</p>
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
     * {@link DataHotelsValue} extends {@link TeaModel}
     *
     * <p>DataHotelsValue</p>
     */
    public static class RoomsOffers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ItemOfferKey")
        private String itemOfferKey;

        @com.aliyun.core.annotation.NameInMap("RatePlanName")
        private String ratePlanName;

        @com.aliyun.core.annotation.NameInMap("MealType")
        private String mealType;

        @com.aliyun.core.annotation.NameInMap("MealCount")
        private Integer mealCount;

        @com.aliyun.core.annotation.NameInMap("CancelPolicy")
        private CancelPolicy cancelPolicy;

        @com.aliyun.core.annotation.NameInMap("TotalPrice")
        private TotalPrice totalPrice;

        @com.aliyun.core.annotation.NameInMap("DailyPrices")
        private java.util.List<DailyPrices> dailyPrices;

        @com.aliyun.core.annotation.NameInMap("AvailableRooms")
        private Integer availableRooms;

        @com.aliyun.core.annotation.NameInMap("MaxOccupancy")
        private Integer maxOccupancy;

        @com.aliyun.core.annotation.NameInMap("ConfirmType")
        private String confirmType;

        private RoomsOffers(Builder builder) {
            this.itemOfferKey = builder.itemOfferKey;
            this.ratePlanName = builder.ratePlanName;
            this.mealType = builder.mealType;
            this.mealCount = builder.mealCount;
            this.cancelPolicy = builder.cancelPolicy;
            this.totalPrice = builder.totalPrice;
            this.dailyPrices = builder.dailyPrices;
            this.availableRooms = builder.availableRooms;
            this.maxOccupancy = builder.maxOccupancy;
            this.confirmType = builder.confirmType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoomsOffers create() {
            return builder().build();
        }

        /**
         * @return itemOfferKey
         */
        public String getItemOfferKey() {
            return this.itemOfferKey;
        }

        /**
         * @return ratePlanName
         */
        public String getRatePlanName() {
            return this.ratePlanName;
        }

        /**
         * @return mealType
         */
        public String getMealType() {
            return this.mealType;
        }

        /**
         * @return mealCount
         */
        public Integer getMealCount() {
            return this.mealCount;
        }

        /**
         * @return cancelPolicy
         */
        public CancelPolicy getCancelPolicy() {
            return this.cancelPolicy;
        }

        /**
         * @return totalPrice
         */
        public TotalPrice getTotalPrice() {
            return this.totalPrice;
        }

        /**
         * @return dailyPrices
         */
        public java.util.List<DailyPrices> getDailyPrices() {
            return this.dailyPrices;
        }

        /**
         * @return availableRooms
         */
        public Integer getAvailableRooms() {
            return this.availableRooms;
        }

        /**
         * @return maxOccupancy
         */
        public Integer getMaxOccupancy() {
            return this.maxOccupancy;
        }

        /**
         * @return confirmType
         */
        public String getConfirmType() {
            return this.confirmType;
        }

        public static final class Builder {
            private String itemOfferKey; 
            private String ratePlanName; 
            private String mealType; 
            private Integer mealCount; 
            private CancelPolicy cancelPolicy; 
            private TotalPrice totalPrice; 
            private java.util.List<DailyPrices> dailyPrices; 
            private Integer availableRooms; 
            private Integer maxOccupancy; 
            private String confirmType; 

            private Builder() {
            } 

            private Builder(RoomsOffers model) {
                this.itemOfferKey = model.itemOfferKey;
                this.ratePlanName = model.ratePlanName;
                this.mealType = model.mealType;
                this.mealCount = model.mealCount;
                this.cancelPolicy = model.cancelPolicy;
                this.totalPrice = model.totalPrice;
                this.dailyPrices = model.dailyPrices;
                this.availableRooms = model.availableRooms;
                this.maxOccupancy = model.maxOccupancy;
                this.confirmType = model.confirmType;
            } 

            /**
             * ItemOfferKey.
             */
            public Builder itemOfferKey(String itemOfferKey) {
                this.itemOfferKey = itemOfferKey;
                return this;
            }

            /**
             * RatePlanName.
             */
            public Builder ratePlanName(String ratePlanName) {
                this.ratePlanName = ratePlanName;
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
             * MealCount.
             */
            public Builder mealCount(Integer mealCount) {
                this.mealCount = mealCount;
                return this;
            }

            /**
             * CancelPolicy.
             */
            public Builder cancelPolicy(CancelPolicy cancelPolicy) {
                this.cancelPolicy = cancelPolicy;
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
             * DailyPrices.
             */
            public Builder dailyPrices(java.util.List<DailyPrices> dailyPrices) {
                this.dailyPrices = dailyPrices;
                return this;
            }

            /**
             * AvailableRooms.
             */
            public Builder availableRooms(Integer availableRooms) {
                this.availableRooms = availableRooms;
                return this;
            }

            /**
             * MaxOccupancy.
             */
            public Builder maxOccupancy(Integer maxOccupancy) {
                this.maxOccupancy = maxOccupancy;
                return this;
            }

            /**
             * ConfirmType.
             */
            public Builder confirmType(String confirmType) {
                this.confirmType = confirmType;
                return this;
            }

            public RoomsOffers build() {
                return new RoomsOffers(this);
            } 

        } 

    }
    /**
     * 
     * {@link DataHotelsValue} extends {@link TeaModel}
     *
     * <p>DataHotelsValue</p>
     */
    public static class Rooms extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StandardRoomId")
        private String standardRoomId;

        @com.aliyun.core.annotation.NameInMap("LowestPrice")
        private LowestPrice lowestPrice;

        @com.aliyun.core.annotation.NameInMap("Offers")
        private java.util.List<RoomsOffers> offers;

        private Rooms(Builder builder) {
            this.standardRoomId = builder.standardRoomId;
            this.lowestPrice = builder.lowestPrice;
            this.offers = builder.offers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rooms create() {
            return builder().build();
        }

        /**
         * @return standardRoomId
         */
        public String getStandardRoomId() {
            return this.standardRoomId;
        }

        /**
         * @return lowestPrice
         */
        public LowestPrice getLowestPrice() {
            return this.lowestPrice;
        }

        /**
         * @return offers
         */
        public java.util.List<RoomsOffers> getOffers() {
            return this.offers;
        }

        public static final class Builder {
            private String standardRoomId; 
            private LowestPrice lowestPrice; 
            private java.util.List<RoomsOffers> offers; 

            private Builder() {
            } 

            private Builder(Rooms model) {
                this.standardRoomId = model.standardRoomId;
                this.lowestPrice = model.lowestPrice;
                this.offers = model.offers;
            } 

            /**
             * StandardRoomId.
             */
            public Builder standardRoomId(String standardRoomId) {
                this.standardRoomId = standardRoomId;
                return this;
            }

            /**
             * LowestPrice.
             */
            public Builder lowestPrice(LowestPrice lowestPrice) {
                this.lowestPrice = lowestPrice;
                return this;
            }

            /**
             * Offers.
             */
            public Builder offers(java.util.List<RoomsOffers> offers) {
                this.offers = offers;
                return this;
            }

            public Rooms build() {
                return new Rooms(this);
            } 

        } 

    }
    /**
     * 
     * {@link DataHotelsValue} extends {@link TeaModel}
     *
     * <p>DataHotelsValue</p>
     */
    public static class CancelPolicyPenalties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Start")
        private String start;

        @com.aliyun.core.annotation.NameInMap("End")
        private String end;

        @com.aliyun.core.annotation.NameInMap("PenaltyType")
        private String penaltyType;

        @com.aliyun.core.annotation.NameInMap("PenaltyValue")
        private String penaltyValue;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("TracerId")
        private String tracerId;

        private CancelPolicyPenalties(Builder builder) {
            this.start = builder.start;
            this.end = builder.end;
            this.penaltyType = builder.penaltyType;
            this.penaltyValue = builder.penaltyValue;
            this.currency = builder.currency;
            this.tracerId = builder.tracerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CancelPolicyPenalties create() {
            return builder().build();
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
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
            private String start; 
            private String end; 
            private String penaltyType; 
            private String penaltyValue; 
            private String currency; 
            private String tracerId; 

            private Builder() {
            } 

            private Builder(CancelPolicyPenalties model) {
                this.start = model.start;
                this.end = model.end;
                this.penaltyType = model.penaltyType;
                this.penaltyValue = model.penaltyValue;
                this.currency = model.currency;
                this.tracerId = model.tracerId;
            } 

            /**
             * Start.
             */
            public Builder start(String start) {
                this.start = start;
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

            public CancelPolicyPenalties build() {
                return new CancelPolicyPenalties(this);
            } 

        } 

    }
    /**
     * 
     * {@link DataHotelsValue} extends {@link TeaModel}
     *
     * <p>DataHotelsValue</p>
     */
    public static class OffersCancelPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        @com.aliyun.core.annotation.NameInMap("Penalties")
        private java.util.List<CancelPolicyPenalties> penalties;

        @com.aliyun.core.annotation.NameInMap("TracerId")
        private String tracerId;

        private OffersCancelPolicy(Builder builder) {
            this.policyType = builder.policyType;
            this.penalties = builder.penalties;
            this.tracerId = builder.tracerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OffersCancelPolicy create() {
            return builder().build();
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        /**
         * @return penalties
         */
        public java.util.List<CancelPolicyPenalties> getPenalties() {
            return this.penalties;
        }

        /**
         * @return tracerId
         */
        public String getTracerId() {
            return this.tracerId;
        }

        public static final class Builder {
            private String policyType; 
            private java.util.List<CancelPolicyPenalties> penalties; 
            private String tracerId; 

            private Builder() {
            } 

            private Builder(OffersCancelPolicy model) {
                this.policyType = model.policyType;
                this.penalties = model.penalties;
                this.tracerId = model.tracerId;
            } 

            /**
             * PolicyType.
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * Penalties.
             */
            public Builder penalties(java.util.List<CancelPolicyPenalties> penalties) {
                this.penalties = penalties;
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

            public OffersCancelPolicy build() {
                return new OffersCancelPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link DataHotelsValue} extends {@link TeaModel}
     *
     * <p>DataHotelsValue</p>
     */
    public static class OffersTotalPrice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private String amount;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("TracerId")
        private String tracerId;

        private OffersTotalPrice(Builder builder) {
            this.amount = builder.amount;
            this.currency = builder.currency;
            this.tracerId = builder.tracerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OffersTotalPrice create() {
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

            private Builder(OffersTotalPrice model) {
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

            public OffersTotalPrice build() {
                return new OffersTotalPrice(this);
            } 

        } 

    }
    /**
     * 
     * {@link DataHotelsValue} extends {@link TeaModel}
     *
     * <p>DataHotelsValue</p>
     */
    public static class DailyPricesPrice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private String amount;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("TracerId")
        private String tracerId;

        private DailyPricesPrice(Builder builder) {
            this.amount = builder.amount;
            this.currency = builder.currency;
            this.tracerId = builder.tracerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DailyPricesPrice create() {
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

            private Builder(DailyPricesPrice model) {
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

            public DailyPricesPrice build() {
                return new DailyPricesPrice(this);
            } 

        } 

    }
    /**
     * 
     * {@link DataHotelsValue} extends {@link TeaModel}
     *
     * <p>DataHotelsValue</p>
     */
    public static class OffersDailyPrices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("Price")
        private DailyPricesPrice price;

        @com.aliyun.core.annotation.NameInMap("TracerId")
        private String tracerId;

        private OffersDailyPrices(Builder builder) {
            this.date = builder.date;
            this.price = builder.price;
            this.tracerId = builder.tracerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OffersDailyPrices create() {
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
        public DailyPricesPrice getPrice() {
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
            private DailyPricesPrice price; 
            private String tracerId; 

            private Builder() {
            } 

            private Builder(OffersDailyPrices model) {
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
            public Builder price(DailyPricesPrice price) {
                this.price = price;
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

            public OffersDailyPrices build() {
                return new OffersDailyPrices(this);
            } 

        } 

    }
    /**
     * 
     * {@link DataHotelsValue} extends {@link TeaModel}
     *
     * <p>DataHotelsValue</p>
     */
    public static class Offers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ItemOfferKey")
        private String itemOfferKey;

        @com.aliyun.core.annotation.NameInMap("RatePlanName")
        private String ratePlanName;

        @com.aliyun.core.annotation.NameInMap("MealType")
        private String mealType;

        @com.aliyun.core.annotation.NameInMap("MealCount")
        private Integer mealCount;

        @com.aliyun.core.annotation.NameInMap("CancelPolicy")
        private OffersCancelPolicy cancelPolicy;

        @com.aliyun.core.annotation.NameInMap("TotalPrice")
        private OffersTotalPrice totalPrice;

        @com.aliyun.core.annotation.NameInMap("DailyPrices")
        private java.util.List<OffersDailyPrices> dailyPrices;

        @com.aliyun.core.annotation.NameInMap("AvailableRooms")
        private Integer availableRooms;

        @com.aliyun.core.annotation.NameInMap("MaxOccupancy")
        private Integer maxOccupancy;

        @com.aliyun.core.annotation.NameInMap("ConfirmType")
        private String confirmType;

        private Offers(Builder builder) {
            this.itemOfferKey = builder.itemOfferKey;
            this.ratePlanName = builder.ratePlanName;
            this.mealType = builder.mealType;
            this.mealCount = builder.mealCount;
            this.cancelPolicy = builder.cancelPolicy;
            this.totalPrice = builder.totalPrice;
            this.dailyPrices = builder.dailyPrices;
            this.availableRooms = builder.availableRooms;
            this.maxOccupancy = builder.maxOccupancy;
            this.confirmType = builder.confirmType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Offers create() {
            return builder().build();
        }

        /**
         * @return itemOfferKey
         */
        public String getItemOfferKey() {
            return this.itemOfferKey;
        }

        /**
         * @return ratePlanName
         */
        public String getRatePlanName() {
            return this.ratePlanName;
        }

        /**
         * @return mealType
         */
        public String getMealType() {
            return this.mealType;
        }

        /**
         * @return mealCount
         */
        public Integer getMealCount() {
            return this.mealCount;
        }

        /**
         * @return cancelPolicy
         */
        public OffersCancelPolicy getCancelPolicy() {
            return this.cancelPolicy;
        }

        /**
         * @return totalPrice
         */
        public OffersTotalPrice getTotalPrice() {
            return this.totalPrice;
        }

        /**
         * @return dailyPrices
         */
        public java.util.List<OffersDailyPrices> getDailyPrices() {
            return this.dailyPrices;
        }

        /**
         * @return availableRooms
         */
        public Integer getAvailableRooms() {
            return this.availableRooms;
        }

        /**
         * @return maxOccupancy
         */
        public Integer getMaxOccupancy() {
            return this.maxOccupancy;
        }

        /**
         * @return confirmType
         */
        public String getConfirmType() {
            return this.confirmType;
        }

        public static final class Builder {
            private String itemOfferKey; 
            private String ratePlanName; 
            private String mealType; 
            private Integer mealCount; 
            private OffersCancelPolicy cancelPolicy; 
            private OffersTotalPrice totalPrice; 
            private java.util.List<OffersDailyPrices> dailyPrices; 
            private Integer availableRooms; 
            private Integer maxOccupancy; 
            private String confirmType; 

            private Builder() {
            } 

            private Builder(Offers model) {
                this.itemOfferKey = model.itemOfferKey;
                this.ratePlanName = model.ratePlanName;
                this.mealType = model.mealType;
                this.mealCount = model.mealCount;
                this.cancelPolicy = model.cancelPolicy;
                this.totalPrice = model.totalPrice;
                this.dailyPrices = model.dailyPrices;
                this.availableRooms = model.availableRooms;
                this.maxOccupancy = model.maxOccupancy;
                this.confirmType = model.confirmType;
            } 

            /**
             * ItemOfferKey.
             */
            public Builder itemOfferKey(String itemOfferKey) {
                this.itemOfferKey = itemOfferKey;
                return this;
            }

            /**
             * RatePlanName.
             */
            public Builder ratePlanName(String ratePlanName) {
                this.ratePlanName = ratePlanName;
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
             * MealCount.
             */
            public Builder mealCount(Integer mealCount) {
                this.mealCount = mealCount;
                return this;
            }

            /**
             * CancelPolicy.
             */
            public Builder cancelPolicy(OffersCancelPolicy cancelPolicy) {
                this.cancelPolicy = cancelPolicy;
                return this;
            }

            /**
             * TotalPrice.
             */
            public Builder totalPrice(OffersTotalPrice totalPrice) {
                this.totalPrice = totalPrice;
                return this;
            }

            /**
             * DailyPrices.
             */
            public Builder dailyPrices(java.util.List<OffersDailyPrices> dailyPrices) {
                this.dailyPrices = dailyPrices;
                return this;
            }

            /**
             * AvailableRooms.
             */
            public Builder availableRooms(Integer availableRooms) {
                this.availableRooms = availableRooms;
                return this;
            }

            /**
             * MaxOccupancy.
             */
            public Builder maxOccupancy(Integer maxOccupancy) {
                this.maxOccupancy = maxOccupancy;
                return this;
            }

            /**
             * ConfirmType.
             */
            public Builder confirmType(String confirmType) {
                this.confirmType = confirmType;
                return this;
            }

            public Offers build() {
                return new Offers(this);
            } 

        } 

    }
}
