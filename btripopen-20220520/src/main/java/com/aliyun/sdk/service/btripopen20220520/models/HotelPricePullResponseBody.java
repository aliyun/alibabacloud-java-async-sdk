// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link HotelPricePullResponseBody} extends {@link TeaModel}
 *
 * <p>HotelPricePullResponseBody</p>
 */
public class HotelPricePullResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("request_id")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private HotelPricePullResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HotelPricePullResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
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
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Module module; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * request_id.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>traceId</p>
         * 
         * <strong>example:</strong>
         * <p>210f079e16603757182131635d866a</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public HotelPricePullResponseBody build() {
            return new HotelPricePullResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link HotelPricePullResponseBody} extends {@link TeaModel}
     *
     * <p>HotelPricePullResponseBody</p>
     */
    public static class BtripHotelCancelPolicyInfoDTOList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("hour")
        private Long hour;

        @com.aliyun.core.annotation.NameInMap("value")
        private Long value;

        private BtripHotelCancelPolicyInfoDTOList(Builder builder) {
            this.hour = builder.hour;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BtripHotelCancelPolicyInfoDTOList create() {
            return builder().build();
        }

        /**
         * @return hour
         */
        public Long getHour() {
            return this.hour;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long hour; 
            private Long value; 

            /**
             * hour.
             */
            public Builder hour(Long hour) {
                this.hour = hour;
                return this;
            }

            /**
             * value.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public BtripHotelCancelPolicyInfoDTOList build() {
                return new BtripHotelCancelPolicyInfoDTOList(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelPricePullResponseBody} extends {@link TeaModel}
     *
     * <p>HotelPricePullResponseBody</p>
     */
    public static class BtripHotelCancelPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("btrip_hotel_cancel_policy_info_d_t_o_list")
        private java.util.List<BtripHotelCancelPolicyInfoDTOList> btripHotelCancelPolicyInfoDTOList;

        @com.aliyun.core.annotation.NameInMap("cancel_policy_type")
        private Integer cancelPolicyType;

        private BtripHotelCancelPolicy(Builder builder) {
            this.btripHotelCancelPolicyInfoDTOList = builder.btripHotelCancelPolicyInfoDTOList;
            this.cancelPolicyType = builder.cancelPolicyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BtripHotelCancelPolicy create() {
            return builder().build();
        }

        /**
         * @return btripHotelCancelPolicyInfoDTOList
         */
        public java.util.List<BtripHotelCancelPolicyInfoDTOList> getBtripHotelCancelPolicyInfoDTOList() {
            return this.btripHotelCancelPolicyInfoDTOList;
        }

        /**
         * @return cancelPolicyType
         */
        public Integer getCancelPolicyType() {
            return this.cancelPolicyType;
        }

        public static final class Builder {
            private java.util.List<BtripHotelCancelPolicyInfoDTOList> btripHotelCancelPolicyInfoDTOList; 
            private Integer cancelPolicyType; 

            /**
             * btrip_hotel_cancel_policy_info_d_t_o_list.
             */
            public Builder btripHotelCancelPolicyInfoDTOList(java.util.List<BtripHotelCancelPolicyInfoDTOList> btripHotelCancelPolicyInfoDTOList) {
                this.btripHotelCancelPolicyInfoDTOList = btripHotelCancelPolicyInfoDTOList;
                return this;
            }

            /**
             * cancel_policy_type.
             */
            public Builder cancelPolicyType(Integer cancelPolicyType) {
                this.cancelPolicyType = cancelPolicyType;
                return this;
            }

            public BtripHotelCancelPolicy build() {
                return new BtripHotelCancelPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelPricePullResponseBody} extends {@link TeaModel}
     *
     * <p>HotelPricePullResponseBody</p>
     */
    public static class RateDailys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("discount_price")
        private Long discountPrice;

        @com.aliyun.core.annotation.NameInMap("last_discounts_price")
        private Long lastDiscountsPrice;

        @com.aliyun.core.annotation.NameInMap("price")
        private Long price;

        @com.aliyun.core.annotation.NameInMap("start_date")
        private String startDate;

        private RateDailys(Builder builder) {
            this.discountPrice = builder.discountPrice;
            this.lastDiscountsPrice = builder.lastDiscountsPrice;
            this.price = builder.price;
            this.startDate = builder.startDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RateDailys create() {
            return builder().build();
        }

        /**
         * @return discountPrice
         */
        public Long getDiscountPrice() {
            return this.discountPrice;
        }

        /**
         * @return lastDiscountsPrice
         */
        public Long getLastDiscountsPrice() {
            return this.lastDiscountsPrice;
        }

        /**
         * @return price
         */
        public Long getPrice() {
            return this.price;
        }

        /**
         * @return startDate
         */
        public String getStartDate() {
            return this.startDate;
        }

        public static final class Builder {
            private Long discountPrice; 
            private Long lastDiscountsPrice; 
            private Long price; 
            private String startDate; 

            /**
             * discount_price.
             */
            public Builder discountPrice(Long discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * last_discounts_price.
             */
            public Builder lastDiscountsPrice(Long lastDiscountsPrice) {
                this.lastDiscountsPrice = lastDiscountsPrice;
                return this;
            }

            /**
             * price.
             */
            public Builder price(Long price) {
                this.price = price;
                return this;
            }

            /**
             * start_date.
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            public RateDailys build() {
                return new RateDailys(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelPricePullResponseBody} extends {@link TeaModel}
     *
     * <p>HotelPricePullResponseBody</p>
     */
    public static class Rates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("breakfast")
        private String breakfast;

        @com.aliyun.core.annotation.NameInMap("breakfast_count")
        private Integer breakfastCount;

        @com.aliyun.core.annotation.NameInMap("btrip_hotel_cancel_policy")
        private BtripHotelCancelPolicy btripHotelCancelPolicy;

        @com.aliyun.core.annotation.NameInMap("cancel_policy_desc")
        private String cancelPolicyDesc;

        @com.aliyun.core.annotation.NameInMap("company_aassist")
        private String companyAassist;

        @com.aliyun.core.annotation.NameInMap("currency_code")
        private String currencyCode;

        @com.aliyun.core.annotation.NameInMap("instant_confirm")
        private Boolean instantConfirm;

        @com.aliyun.core.annotation.NameInMap("item_id")
        private String itemId;

        @com.aliyun.core.annotation.NameInMap("max_adv_hours")
        private Integer maxAdvHours;

        @com.aliyun.core.annotation.NameInMap("max_days")
        private Integer maxDays;

        @com.aliyun.core.annotation.NameInMap("min_adv_hours")
        private Integer minAdvHours;

        @com.aliyun.core.annotation.NameInMap("min_days")
        private Integer minDays;

        @com.aliyun.core.annotation.NameInMap("nod")
        private Integer nod;

        @com.aliyun.core.annotation.NameInMap("nop")
        private Integer nop;

        @com.aliyun.core.annotation.NameInMap("payment_type")
        private Integer paymentType;

        @com.aliyun.core.annotation.NameInMap("price")
        private Long price;

        @com.aliyun.core.annotation.NameInMap("promotion_info")
        private String promotionInfo;

        @com.aliyun.core.annotation.NameInMap("quota")
        private Integer quota;

        @com.aliyun.core.annotation.NameInMap("rate_dailys")
        private java.util.List<RateDailys> rateDailys;

        @com.aliyun.core.annotation.NameInMap("rate_id")
        private String rateId;

        @com.aliyun.core.annotation.NameInMap("rate_plan_name")
        private String ratePlanName;

        @com.aliyun.core.annotation.NameInMap("rp_id")
        private String rpId;

        @com.aliyun.core.annotation.NameInMap("seller_id")
        private String sellerId;

        @com.aliyun.core.annotation.NameInMap("support_special_invoice")
        private Boolean supportSpecialInvoice;

        private Rates(Builder builder) {
            this.breakfast = builder.breakfast;
            this.breakfastCount = builder.breakfastCount;
            this.btripHotelCancelPolicy = builder.btripHotelCancelPolicy;
            this.cancelPolicyDesc = builder.cancelPolicyDesc;
            this.companyAassist = builder.companyAassist;
            this.currencyCode = builder.currencyCode;
            this.instantConfirm = builder.instantConfirm;
            this.itemId = builder.itemId;
            this.maxAdvHours = builder.maxAdvHours;
            this.maxDays = builder.maxDays;
            this.minAdvHours = builder.minAdvHours;
            this.minDays = builder.minDays;
            this.nod = builder.nod;
            this.nop = builder.nop;
            this.paymentType = builder.paymentType;
            this.price = builder.price;
            this.promotionInfo = builder.promotionInfo;
            this.quota = builder.quota;
            this.rateDailys = builder.rateDailys;
            this.rateId = builder.rateId;
            this.ratePlanName = builder.ratePlanName;
            this.rpId = builder.rpId;
            this.sellerId = builder.sellerId;
            this.supportSpecialInvoice = builder.supportSpecialInvoice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rates create() {
            return builder().build();
        }

        /**
         * @return breakfast
         */
        public String getBreakfast() {
            return this.breakfast;
        }

        /**
         * @return breakfastCount
         */
        public Integer getBreakfastCount() {
            return this.breakfastCount;
        }

        /**
         * @return btripHotelCancelPolicy
         */
        public BtripHotelCancelPolicy getBtripHotelCancelPolicy() {
            return this.btripHotelCancelPolicy;
        }

        /**
         * @return cancelPolicyDesc
         */
        public String getCancelPolicyDesc() {
            return this.cancelPolicyDesc;
        }

        /**
         * @return companyAassist
         */
        public String getCompanyAassist() {
            return this.companyAassist;
        }

        /**
         * @return currencyCode
         */
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        /**
         * @return instantConfirm
         */
        public Boolean getInstantConfirm() {
            return this.instantConfirm;
        }

        /**
         * @return itemId
         */
        public String getItemId() {
            return this.itemId;
        }

        /**
         * @return maxAdvHours
         */
        public Integer getMaxAdvHours() {
            return this.maxAdvHours;
        }

        /**
         * @return maxDays
         */
        public Integer getMaxDays() {
            return this.maxDays;
        }

        /**
         * @return minAdvHours
         */
        public Integer getMinAdvHours() {
            return this.minAdvHours;
        }

        /**
         * @return minDays
         */
        public Integer getMinDays() {
            return this.minDays;
        }

        /**
         * @return nod
         */
        public Integer getNod() {
            return this.nod;
        }

        /**
         * @return nop
         */
        public Integer getNop() {
            return this.nop;
        }

        /**
         * @return paymentType
         */
        public Integer getPaymentType() {
            return this.paymentType;
        }

        /**
         * @return price
         */
        public Long getPrice() {
            return this.price;
        }

        /**
         * @return promotionInfo
         */
        public String getPromotionInfo() {
            return this.promotionInfo;
        }

        /**
         * @return quota
         */
        public Integer getQuota() {
            return this.quota;
        }

        /**
         * @return rateDailys
         */
        public java.util.List<RateDailys> getRateDailys() {
            return this.rateDailys;
        }

        /**
         * @return rateId
         */
        public String getRateId() {
            return this.rateId;
        }

        /**
         * @return ratePlanName
         */
        public String getRatePlanName() {
            return this.ratePlanName;
        }

        /**
         * @return rpId
         */
        public String getRpId() {
            return this.rpId;
        }

        /**
         * @return sellerId
         */
        public String getSellerId() {
            return this.sellerId;
        }

        /**
         * @return supportSpecialInvoice
         */
        public Boolean getSupportSpecialInvoice() {
            return this.supportSpecialInvoice;
        }

        public static final class Builder {
            private String breakfast; 
            private Integer breakfastCount; 
            private BtripHotelCancelPolicy btripHotelCancelPolicy; 
            private String cancelPolicyDesc; 
            private String companyAassist; 
            private String currencyCode; 
            private Boolean instantConfirm; 
            private String itemId; 
            private Integer maxAdvHours; 
            private Integer maxDays; 
            private Integer minAdvHours; 
            private Integer minDays; 
            private Integer nod; 
            private Integer nop; 
            private Integer paymentType; 
            private Long price; 
            private String promotionInfo; 
            private Integer quota; 
            private java.util.List<RateDailys> rateDailys; 
            private String rateId; 
            private String ratePlanName; 
            private String rpId; 
            private String sellerId; 
            private Boolean supportSpecialInvoice; 

            /**
             * breakfast.
             */
            public Builder breakfast(String breakfast) {
                this.breakfast = breakfast;
                return this;
            }

            /**
             * breakfast_count.
             */
            public Builder breakfastCount(Integer breakfastCount) {
                this.breakfastCount = breakfastCount;
                return this;
            }

            /**
             * btrip_hotel_cancel_policy.
             */
            public Builder btripHotelCancelPolicy(BtripHotelCancelPolicy btripHotelCancelPolicy) {
                this.btripHotelCancelPolicy = btripHotelCancelPolicy;
                return this;
            }

            /**
             * cancel_policy_desc.
             */
            public Builder cancelPolicyDesc(String cancelPolicyDesc) {
                this.cancelPolicyDesc = cancelPolicyDesc;
                return this;
            }

            /**
             * company_aassist.
             */
            public Builder companyAassist(String companyAassist) {
                this.companyAassist = companyAassist;
                return this;
            }

            /**
             * currency_code.
             */
            public Builder currencyCode(String currencyCode) {
                this.currencyCode = currencyCode;
                return this;
            }

            /**
             * instant_confirm.
             */
            public Builder instantConfirm(Boolean instantConfirm) {
                this.instantConfirm = instantConfirm;
                return this;
            }

            /**
             * item_id.
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * max_adv_hours.
             */
            public Builder maxAdvHours(Integer maxAdvHours) {
                this.maxAdvHours = maxAdvHours;
                return this;
            }

            /**
             * max_days.
             */
            public Builder maxDays(Integer maxDays) {
                this.maxDays = maxDays;
                return this;
            }

            /**
             * min_adv_hours.
             */
            public Builder minAdvHours(Integer minAdvHours) {
                this.minAdvHours = minAdvHours;
                return this;
            }

            /**
             * min_days.
             */
            public Builder minDays(Integer minDays) {
                this.minDays = minDays;
                return this;
            }

            /**
             * nod.
             */
            public Builder nod(Integer nod) {
                this.nod = nod;
                return this;
            }

            /**
             * nop.
             */
            public Builder nop(Integer nop) {
                this.nop = nop;
                return this;
            }

            /**
             * payment_type.
             */
            public Builder paymentType(Integer paymentType) {
                this.paymentType = paymentType;
                return this;
            }

            /**
             * price.
             */
            public Builder price(Long price) {
                this.price = price;
                return this;
            }

            /**
             * promotion_info.
             */
            public Builder promotionInfo(String promotionInfo) {
                this.promotionInfo = promotionInfo;
                return this;
            }

            /**
             * quota.
             */
            public Builder quota(Integer quota) {
                this.quota = quota;
                return this;
            }

            /**
             * rate_dailys.
             */
            public Builder rateDailys(java.util.List<RateDailys> rateDailys) {
                this.rateDailys = rateDailys;
                return this;
            }

            /**
             * rate_id.
             */
            public Builder rateId(String rateId) {
                this.rateId = rateId;
                return this;
            }

            /**
             * rate_plan_name.
             */
            public Builder ratePlanName(String ratePlanName) {
                this.ratePlanName = ratePlanName;
                return this;
            }

            /**
             * rp_id.
             */
            public Builder rpId(String rpId) {
                this.rpId = rpId;
                return this;
            }

            /**
             * seller_id.
             */
            public Builder sellerId(String sellerId) {
                this.sellerId = sellerId;
                return this;
            }

            /**
             * support_special_invoice.
             */
            public Builder supportSpecialInvoice(Boolean supportSpecialInvoice) {
                this.supportSpecialInvoice = supportSpecialInvoice;
                return this;
            }

            public Rates build() {
                return new Rates(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelPricePullResponseBody} extends {@link TeaModel}
     *
     * <p>HotelPricePullResponseBody</p>
     */
    public static class Rooms extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("area")
        private String area;

        @com.aliyun.core.annotation.NameInMap("bed")
        private String bed;

        @com.aliyun.core.annotation.NameInMap("bed_type_string")
        private String bedTypeString;

        @com.aliyun.core.annotation.NameInMap("facility")
        private String facility;

        @com.aliyun.core.annotation.NameInMap("floor")
        private String floor;

        @com.aliyun.core.annotation.NameInMap("max_occupancy")
        private Integer maxOccupancy;

        @com.aliyun.core.annotation.NameInMap("network_service")
        private String networkService;

        @com.aliyun.core.annotation.NameInMap("pics")
        private java.util.List<String> pics;

        @com.aliyun.core.annotation.NameInMap("rates")
        private java.util.List<Rates> rates;

        @com.aliyun.core.annotation.NameInMap("room_id")
        private String roomId;

        @com.aliyun.core.annotation.NameInMap("room_name")
        private String roomName;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("window_type")
        private String windowType;

        private Rooms(Builder builder) {
            this.area = builder.area;
            this.bed = builder.bed;
            this.bedTypeString = builder.bedTypeString;
            this.facility = builder.facility;
            this.floor = builder.floor;
            this.maxOccupancy = builder.maxOccupancy;
            this.networkService = builder.networkService;
            this.pics = builder.pics;
            this.rates = builder.rates;
            this.roomId = builder.roomId;
            this.roomName = builder.roomName;
            this.status = builder.status;
            this.windowType = builder.windowType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rooms create() {
            return builder().build();
        }

        /**
         * @return area
         */
        public String getArea() {
            return this.area;
        }

        /**
         * @return bed
         */
        public String getBed() {
            return this.bed;
        }

        /**
         * @return bedTypeString
         */
        public String getBedTypeString() {
            return this.bedTypeString;
        }

        /**
         * @return facility
         */
        public String getFacility() {
            return this.facility;
        }

        /**
         * @return floor
         */
        public String getFloor() {
            return this.floor;
        }

        /**
         * @return maxOccupancy
         */
        public Integer getMaxOccupancy() {
            return this.maxOccupancy;
        }

        /**
         * @return networkService
         */
        public String getNetworkService() {
            return this.networkService;
        }

        /**
         * @return pics
         */
        public java.util.List<String> getPics() {
            return this.pics;
        }

        /**
         * @return rates
         */
        public java.util.List<Rates> getRates() {
            return this.rates;
        }

        /**
         * @return roomId
         */
        public String getRoomId() {
            return this.roomId;
        }

        /**
         * @return roomName
         */
        public String getRoomName() {
            return this.roomName;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return windowType
         */
        public String getWindowType() {
            return this.windowType;
        }

        public static final class Builder {
            private String area; 
            private String bed; 
            private String bedTypeString; 
            private String facility; 
            private String floor; 
            private Integer maxOccupancy; 
            private String networkService; 
            private java.util.List<String> pics; 
            private java.util.List<Rates> rates; 
            private String roomId; 
            private String roomName; 
            private Integer status; 
            private String windowType; 

            /**
             * area.
             */
            public Builder area(String area) {
                this.area = area;
                return this;
            }

            /**
             * bed.
             */
            public Builder bed(String bed) {
                this.bed = bed;
                return this;
            }

            /**
             * bed_type_string.
             */
            public Builder bedTypeString(String bedTypeString) {
                this.bedTypeString = bedTypeString;
                return this;
            }

            /**
             * facility.
             */
            public Builder facility(String facility) {
                this.facility = facility;
                return this;
            }

            /**
             * floor.
             */
            public Builder floor(String floor) {
                this.floor = floor;
                return this;
            }

            /**
             * max_occupancy.
             */
            public Builder maxOccupancy(Integer maxOccupancy) {
                this.maxOccupancy = maxOccupancy;
                return this;
            }

            /**
             * network_service.
             */
            public Builder networkService(String networkService) {
                this.networkService = networkService;
                return this;
            }

            /**
             * pics.
             */
            public Builder pics(java.util.List<String> pics) {
                this.pics = pics;
                return this;
            }

            /**
             * rates.
             */
            public Builder rates(java.util.List<Rates> rates) {
                this.rates = rates;
                return this;
            }

            /**
             * room_id.
             */
            public Builder roomId(String roomId) {
                this.roomId = roomId;
                return this;
            }

            /**
             * room_name.
             */
            public Builder roomName(String roomName) {
                this.roomName = roomName;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * window_type.
             */
            public Builder windowType(String windowType) {
                this.windowType = windowType;
                return this;
            }

            public Rooms build() {
                return new Rooms(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelPricePullResponseBody} extends {@link TeaModel}
     *
     * <p>HotelPricePullResponseBody</p>
     */
    public static class HotelPriceInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("hotel_id")
        private String hotelId;

        @com.aliyun.core.annotation.NameInMap("hotel_name")
        private String hotelName;

        @com.aliyun.core.annotation.NameInMap("rooms")
        private java.util.List<Rooms> rooms;

        @com.aliyun.core.annotation.NameInMap("search_id")
        private String searchId;

        private HotelPriceInfos(Builder builder) {
            this.address = builder.address;
            this.hotelId = builder.hotelId;
            this.hotelName = builder.hotelName;
            this.rooms = builder.rooms;
            this.searchId = builder.searchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotelPriceInfos create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return hotelId
         */
        public String getHotelId() {
            return this.hotelId;
        }

        /**
         * @return hotelName
         */
        public String getHotelName() {
            return this.hotelName;
        }

        /**
         * @return rooms
         */
        public java.util.List<Rooms> getRooms() {
            return this.rooms;
        }

        /**
         * @return searchId
         */
        public String getSearchId() {
            return this.searchId;
        }

        public static final class Builder {
            private String address; 
            private String hotelId; 
            private String hotelName; 
            private java.util.List<Rooms> rooms; 
            private String searchId; 

            /**
             * address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * hotel_id.
             */
            public Builder hotelId(String hotelId) {
                this.hotelId = hotelId;
                return this;
            }

            /**
             * hotel_name.
             */
            public Builder hotelName(String hotelName) {
                this.hotelName = hotelName;
                return this;
            }

            /**
             * rooms.
             */
            public Builder rooms(java.util.List<Rooms> rooms) {
                this.rooms = rooms;
                return this;
            }

            /**
             * search_id.
             */
            public Builder searchId(String searchId) {
                this.searchId = searchId;
                return this;
            }

            public HotelPriceInfos build() {
                return new HotelPriceInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelPricePullResponseBody} extends {@link TeaModel}
     *
     * <p>HotelPricePullResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("hotel_price_infos")
        private java.util.List<HotelPriceInfos> hotelPriceInfos;

        private Module(Builder builder) {
            this.hotelPriceInfos = builder.hotelPriceInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return hotelPriceInfos
         */
        public java.util.List<HotelPriceInfos> getHotelPriceInfos() {
            return this.hotelPriceInfos;
        }

        public static final class Builder {
            private java.util.List<HotelPriceInfos> hotelPriceInfos; 

            /**
             * hotel_price_infos.
             */
            public Builder hotelPriceInfos(java.util.List<HotelPriceInfos> hotelPriceInfos) {
                this.hotelPriceInfos = hotelPriceInfos;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
