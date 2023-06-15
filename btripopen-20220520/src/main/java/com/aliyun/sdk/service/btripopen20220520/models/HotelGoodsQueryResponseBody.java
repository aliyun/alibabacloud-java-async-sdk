// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotelGoodsQueryResponseBody} extends {@link TeaModel}
 *
 * <p>HotelGoodsQueryResponseBody</p>
 */
public class HotelGoodsQueryResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("message")
    private String message;

    @NameInMap("module")
    private Module module;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("traceId")
    private String traceId;

    private HotelGoodsQueryResponseBody(Builder builder) {
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

    public static HotelGoodsQueryResponseBody create() {
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
         * requestId.
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
         * traceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public HotelGoodsQueryResponseBody build() {
            return new HotelGoodsQueryResponseBody(this);
        } 

    } 

    public static class BtripHotelCancelPolicyInfoDTOList extends TeaModel {
        @NameInMap("hour")
        private Long hour;

        @NameInMap("value")
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
    public static class BtripHotelCancelPolicyDTO extends TeaModel {
        @NameInMap("btrip_hotel_cancel_policy_info_d_t_o_list")
        private java.util.List < BtripHotelCancelPolicyInfoDTOList> btripHotelCancelPolicyInfoDTOList;

        @NameInMap("cancel_policy_type")
        private Integer cancelPolicyType;

        private BtripHotelCancelPolicyDTO(Builder builder) {
            this.btripHotelCancelPolicyInfoDTOList = builder.btripHotelCancelPolicyInfoDTOList;
            this.cancelPolicyType = builder.cancelPolicyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BtripHotelCancelPolicyDTO create() {
            return builder().build();
        }

        /**
         * @return btripHotelCancelPolicyInfoDTOList
         */
        public java.util.List < BtripHotelCancelPolicyInfoDTOList> getBtripHotelCancelPolicyInfoDTOList() {
            return this.btripHotelCancelPolicyInfoDTOList;
        }

        /**
         * @return cancelPolicyType
         */
        public Integer getCancelPolicyType() {
            return this.cancelPolicyType;
        }

        public static final class Builder {
            private java.util.List < BtripHotelCancelPolicyInfoDTOList> btripHotelCancelPolicyInfoDTOList; 
            private Integer cancelPolicyType; 

            /**
             * btrip_hotel_cancel_policy_info_d_t_o_list.
             */
            public Builder btripHotelCancelPolicyInfoDTOList(java.util.List < BtripHotelCancelPolicyInfoDTOList> btripHotelCancelPolicyInfoDTOList) {
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

            public BtripHotelCancelPolicyDTO build() {
                return new BtripHotelCancelPolicyDTO(this);
            } 

        } 

    }
    public static class BtripCancelRule extends TeaModel {
        @NameInMap("btrip_hotel_cancel_policy_d_t_o")
        private BtripHotelCancelPolicyDTO btripHotelCancelPolicyDTO;

        @NameInMap("cancel_policy_title")
        private String cancelPolicyTitle;

        @NameInMap("check_in")
        private String checkIn;

        private BtripCancelRule(Builder builder) {
            this.btripHotelCancelPolicyDTO = builder.btripHotelCancelPolicyDTO;
            this.cancelPolicyTitle = builder.cancelPolicyTitle;
            this.checkIn = builder.checkIn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BtripCancelRule create() {
            return builder().build();
        }

        /**
         * @return btripHotelCancelPolicyDTO
         */
        public BtripHotelCancelPolicyDTO getBtripHotelCancelPolicyDTO() {
            return this.btripHotelCancelPolicyDTO;
        }

        /**
         * @return cancelPolicyTitle
         */
        public String getCancelPolicyTitle() {
            return this.cancelPolicyTitle;
        }

        /**
         * @return checkIn
         */
        public String getCheckIn() {
            return this.checkIn;
        }

        public static final class Builder {
            private BtripHotelCancelPolicyDTO btripHotelCancelPolicyDTO; 
            private String cancelPolicyTitle; 
            private String checkIn; 

            /**
             * btrip_hotel_cancel_policy_d_t_o.
             */
            public Builder btripHotelCancelPolicyDTO(BtripHotelCancelPolicyDTO btripHotelCancelPolicyDTO) {
                this.btripHotelCancelPolicyDTO = btripHotelCancelPolicyDTO;
                return this;
            }

            /**
             * cancel_policy_title.
             */
            public Builder cancelPolicyTitle(String cancelPolicyTitle) {
                this.cancelPolicyTitle = cancelPolicyTitle;
                return this;
            }

            /**
             * check_in.
             */
            public Builder checkIn(String checkIn) {
                this.checkIn = checkIn;
                return this;
            }

            public BtripCancelRule build() {
                return new BtripCancelRule(this);
            } 

        } 

    }
    public static class BtripHotelCancelDesc extends TeaModel {
        @NameInMap("desc")
        private String desc;

        @NameInMap("title")
        private String title;

        private BtripHotelCancelDesc(Builder builder) {
            this.desc = builder.desc;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BtripHotelCancelDesc create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String desc; 
            private String title; 

            /**
             * desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public BtripHotelCancelDesc build() {
                return new BtripHotelCancelDesc(this);
            } 

        } 

    }
    public static class HotelDetailRatePriceDTO extends TeaModel {
        @NameInMap("before_discount_price")
        private Long beforeDiscountPrice;

        @NameInMap("breakfast")
        private String breakfast;

        @NameInMap("discount_price")
        private Long discountPrice;

        @NameInMap("last_discounts_price")
        private Long lastDiscountsPrice;

        @NameInMap("last_num")
        private Integer lastNum;

        @NameInMap("rate_start_time")
        private String rateStartTime;

        @NameInMap("status")
        private Integer status;

        private HotelDetailRatePriceDTO(Builder builder) {
            this.beforeDiscountPrice = builder.beforeDiscountPrice;
            this.breakfast = builder.breakfast;
            this.discountPrice = builder.discountPrice;
            this.lastDiscountsPrice = builder.lastDiscountsPrice;
            this.lastNum = builder.lastNum;
            this.rateStartTime = builder.rateStartTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotelDetailRatePriceDTO create() {
            return builder().build();
        }

        /**
         * @return beforeDiscountPrice
         */
        public Long getBeforeDiscountPrice() {
            return this.beforeDiscountPrice;
        }

        /**
         * @return breakfast
         */
        public String getBreakfast() {
            return this.breakfast;
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
         * @return lastNum
         */
        public Integer getLastNum() {
            return this.lastNum;
        }

        /**
         * @return rateStartTime
         */
        public String getRateStartTime() {
            return this.rateStartTime;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long beforeDiscountPrice; 
            private String breakfast; 
            private Long discountPrice; 
            private Long lastDiscountsPrice; 
            private Integer lastNum; 
            private String rateStartTime; 
            private Integer status; 

            /**
             * before_discount_price.
             */
            public Builder beforeDiscountPrice(Long beforeDiscountPrice) {
                this.beforeDiscountPrice = beforeDiscountPrice;
                return this;
            }

            /**
             * breakfast.
             */
            public Builder breakfast(String breakfast) {
                this.breakfast = breakfast;
                return this;
            }

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
             * last_num.
             */
            public Builder lastNum(Integer lastNum) {
                this.lastNum = lastNum;
                return this;
            }

            /**
             * rate_start_time.
             */
            public Builder rateStartTime(String rateStartTime) {
                this.rateStartTime = rateStartTime;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public HotelDetailRatePriceDTO build() {
                return new HotelDetailRatePriceDTO(this);
            } 

        } 

    }
    public static class Rates extends TeaModel {
        @NameInMap("bed_desc")
        private String bedDesc;

        @NameInMap("bed_type")
        private String bedType;

        @NameInMap("breakfast")
        private String breakfast;

        @NameInMap("btrip_cancel_rule")
        private BtripCancelRule btripCancelRule;

        @NameInMap("btrip_hotel_cancel_desc")
        private java.util.List < BtripHotelCancelDesc> btripHotelCancelDesc;

        @NameInMap("can_smoking")
        private Boolean canSmoking;

        @NameInMap("cancel_policy_desc")
        private String cancelPolicyDesc;

        @NameInMap("cancel_policy_type")
        private Integer cancelPolicyType;

        @NameInMap("company_aassist")
        private String companyAassist;

        @NameInMap("confirm_type")
        private Integer confirmType;

        @NameInMap("currency_code")
        private String currencyCode;

        @NameInMap("daily_price_format_yuan")
        private String dailyPriceFormatYuan;

        @NameInMap("daily_price_view")
        private String dailyPriceView;

        @NameInMap("end_time_daily")
        private String endTimeDaily;

        @NameInMap("hotel_detail_rate_price_d_t_o")
        private java.util.List < HotelDetailRatePriceDTO> hotelDetailRatePriceDTO;

        @NameInMap("instant_confirm")
        private Boolean instantConfirm;

        @NameInMap("inventory_price")
        private String inventoryPrice;

        @NameInMap("is_business_pay4_goods")
        private Boolean isBusinessPay4Goods;

        @NameInMap("is_guarantee")
        private Integer isGuarantee;

        @NameInMap("is_need_email")
        private Boolean isNeedEmail;

        @NameInMap("item_id")
        private Long itemId;

        @NameInMap("last_cancel_time")
        private String lastCancelTime;

        @NameInMap("max_occupancy")
        private Integer maxOccupancy;

        @NameInMap("min_adv_hours")
        private Integer minAdvHours;

        @NameInMap("min_days")
        private Integer minDays;

        @NameInMap("nod")
        private Integer nod;

        @NameInMap("nop")
        private Integer nop;

        @NameInMap("order_ship_time")
        private Integer orderShipTime;

        @NameInMap("payment_type")
        private Integer paymentType;

        @NameInMap("price_type")
        private Integer priceType;

        @NameInMap("promotion_info")
        private String promotionInfo;

        @NameInMap("rate_id")
        private Long rateId;

        @NameInMap("rate_plan_name")
        private String ratePlanName;

        @NameInMap("rp_id")
        private Long rpId;

        @NameInMap("seller_id")
        private Long sellerId;

        @NameInMap("start_time_daily")
        private String startTimeDaily;

        @NameInMap("status")
        private Integer status;

        @NameInMap("supplier_code")
        private String supplierCode;

        @NameInMap("supplier_name")
        private String supplierName;

        @NameInMap("support_special_invoice")
        private Boolean supportSpecialInvoice;

        @NameInMap("unrounding_daily_price_format_yuan")
        private String unroundingDailyPriceFormatYuan;

        private Rates(Builder builder) {
            this.bedDesc = builder.bedDesc;
            this.bedType = builder.bedType;
            this.breakfast = builder.breakfast;
            this.btripCancelRule = builder.btripCancelRule;
            this.btripHotelCancelDesc = builder.btripHotelCancelDesc;
            this.canSmoking = builder.canSmoking;
            this.cancelPolicyDesc = builder.cancelPolicyDesc;
            this.cancelPolicyType = builder.cancelPolicyType;
            this.companyAassist = builder.companyAassist;
            this.confirmType = builder.confirmType;
            this.currencyCode = builder.currencyCode;
            this.dailyPriceFormatYuan = builder.dailyPriceFormatYuan;
            this.dailyPriceView = builder.dailyPriceView;
            this.endTimeDaily = builder.endTimeDaily;
            this.hotelDetailRatePriceDTO = builder.hotelDetailRatePriceDTO;
            this.instantConfirm = builder.instantConfirm;
            this.inventoryPrice = builder.inventoryPrice;
            this.isBusinessPay4Goods = builder.isBusinessPay4Goods;
            this.isGuarantee = builder.isGuarantee;
            this.isNeedEmail = builder.isNeedEmail;
            this.itemId = builder.itemId;
            this.lastCancelTime = builder.lastCancelTime;
            this.maxOccupancy = builder.maxOccupancy;
            this.minAdvHours = builder.minAdvHours;
            this.minDays = builder.minDays;
            this.nod = builder.nod;
            this.nop = builder.nop;
            this.orderShipTime = builder.orderShipTime;
            this.paymentType = builder.paymentType;
            this.priceType = builder.priceType;
            this.promotionInfo = builder.promotionInfo;
            this.rateId = builder.rateId;
            this.ratePlanName = builder.ratePlanName;
            this.rpId = builder.rpId;
            this.sellerId = builder.sellerId;
            this.startTimeDaily = builder.startTimeDaily;
            this.status = builder.status;
            this.supplierCode = builder.supplierCode;
            this.supplierName = builder.supplierName;
            this.supportSpecialInvoice = builder.supportSpecialInvoice;
            this.unroundingDailyPriceFormatYuan = builder.unroundingDailyPriceFormatYuan;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rates create() {
            return builder().build();
        }

        /**
         * @return bedDesc
         */
        public String getBedDesc() {
            return this.bedDesc;
        }

        /**
         * @return bedType
         */
        public String getBedType() {
            return this.bedType;
        }

        /**
         * @return breakfast
         */
        public String getBreakfast() {
            return this.breakfast;
        }

        /**
         * @return btripCancelRule
         */
        public BtripCancelRule getBtripCancelRule() {
            return this.btripCancelRule;
        }

        /**
         * @return btripHotelCancelDesc
         */
        public java.util.List < BtripHotelCancelDesc> getBtripHotelCancelDesc() {
            return this.btripHotelCancelDesc;
        }

        /**
         * @return canSmoking
         */
        public Boolean getCanSmoking() {
            return this.canSmoking;
        }

        /**
         * @return cancelPolicyDesc
         */
        public String getCancelPolicyDesc() {
            return this.cancelPolicyDesc;
        }

        /**
         * @return cancelPolicyType
         */
        public Integer getCancelPolicyType() {
            return this.cancelPolicyType;
        }

        /**
         * @return companyAassist
         */
        public String getCompanyAassist() {
            return this.companyAassist;
        }

        /**
         * @return confirmType
         */
        public Integer getConfirmType() {
            return this.confirmType;
        }

        /**
         * @return currencyCode
         */
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        /**
         * @return dailyPriceFormatYuan
         */
        public String getDailyPriceFormatYuan() {
            return this.dailyPriceFormatYuan;
        }

        /**
         * @return dailyPriceView
         */
        public String getDailyPriceView() {
            return this.dailyPriceView;
        }

        /**
         * @return endTimeDaily
         */
        public String getEndTimeDaily() {
            return this.endTimeDaily;
        }

        /**
         * @return hotelDetailRatePriceDTO
         */
        public java.util.List < HotelDetailRatePriceDTO> getHotelDetailRatePriceDTO() {
            return this.hotelDetailRatePriceDTO;
        }

        /**
         * @return instantConfirm
         */
        public Boolean getInstantConfirm() {
            return this.instantConfirm;
        }

        /**
         * @return inventoryPrice
         */
        public String getInventoryPrice() {
            return this.inventoryPrice;
        }

        /**
         * @return isBusinessPay4Goods
         */
        public Boolean getIsBusinessPay4Goods() {
            return this.isBusinessPay4Goods;
        }

        /**
         * @return isGuarantee
         */
        public Integer getIsGuarantee() {
            return this.isGuarantee;
        }

        /**
         * @return isNeedEmail
         */
        public Boolean getIsNeedEmail() {
            return this.isNeedEmail;
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return lastCancelTime
         */
        public String getLastCancelTime() {
            return this.lastCancelTime;
        }

        /**
         * @return maxOccupancy
         */
        public Integer getMaxOccupancy() {
            return this.maxOccupancy;
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
         * @return orderShipTime
         */
        public Integer getOrderShipTime() {
            return this.orderShipTime;
        }

        /**
         * @return paymentType
         */
        public Integer getPaymentType() {
            return this.paymentType;
        }

        /**
         * @return priceType
         */
        public Integer getPriceType() {
            return this.priceType;
        }

        /**
         * @return promotionInfo
         */
        public String getPromotionInfo() {
            return this.promotionInfo;
        }

        /**
         * @return rateId
         */
        public Long getRateId() {
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
        public Long getRpId() {
            return this.rpId;
        }

        /**
         * @return sellerId
         */
        public Long getSellerId() {
            return this.sellerId;
        }

        /**
         * @return startTimeDaily
         */
        public String getStartTimeDaily() {
            return this.startTimeDaily;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return supplierCode
         */
        public String getSupplierCode() {
            return this.supplierCode;
        }

        /**
         * @return supplierName
         */
        public String getSupplierName() {
            return this.supplierName;
        }

        /**
         * @return supportSpecialInvoice
         */
        public Boolean getSupportSpecialInvoice() {
            return this.supportSpecialInvoice;
        }

        /**
         * @return unroundingDailyPriceFormatYuan
         */
        public String getUnroundingDailyPriceFormatYuan() {
            return this.unroundingDailyPriceFormatYuan;
        }

        public static final class Builder {
            private String bedDesc; 
            private String bedType; 
            private String breakfast; 
            private BtripCancelRule btripCancelRule; 
            private java.util.List < BtripHotelCancelDesc> btripHotelCancelDesc; 
            private Boolean canSmoking; 
            private String cancelPolicyDesc; 
            private Integer cancelPolicyType; 
            private String companyAassist; 
            private Integer confirmType; 
            private String currencyCode; 
            private String dailyPriceFormatYuan; 
            private String dailyPriceView; 
            private String endTimeDaily; 
            private java.util.List < HotelDetailRatePriceDTO> hotelDetailRatePriceDTO; 
            private Boolean instantConfirm; 
            private String inventoryPrice; 
            private Boolean isBusinessPay4Goods; 
            private Integer isGuarantee; 
            private Boolean isNeedEmail; 
            private Long itemId; 
            private String lastCancelTime; 
            private Integer maxOccupancy; 
            private Integer minAdvHours; 
            private Integer minDays; 
            private Integer nod; 
            private Integer nop; 
            private Integer orderShipTime; 
            private Integer paymentType; 
            private Integer priceType; 
            private String promotionInfo; 
            private Long rateId; 
            private String ratePlanName; 
            private Long rpId; 
            private Long sellerId; 
            private String startTimeDaily; 
            private Integer status; 
            private String supplierCode; 
            private String supplierName; 
            private Boolean supportSpecialInvoice; 
            private String unroundingDailyPriceFormatYuan; 

            /**
             * bed_desc.
             */
            public Builder bedDesc(String bedDesc) {
                this.bedDesc = bedDesc;
                return this;
            }

            /**
             * bed_type.
             */
            public Builder bedType(String bedType) {
                this.bedType = bedType;
                return this;
            }

            /**
             * breakfast.
             */
            public Builder breakfast(String breakfast) {
                this.breakfast = breakfast;
                return this;
            }

            /**
             * btrip_cancel_rule.
             */
            public Builder btripCancelRule(BtripCancelRule btripCancelRule) {
                this.btripCancelRule = btripCancelRule;
                return this;
            }

            /**
             * btrip_hotel_cancel_desc.
             */
            public Builder btripHotelCancelDesc(java.util.List < BtripHotelCancelDesc> btripHotelCancelDesc) {
                this.btripHotelCancelDesc = btripHotelCancelDesc;
                return this;
            }

            /**
             * can_smoking.
             */
            public Builder canSmoking(Boolean canSmoking) {
                this.canSmoking = canSmoking;
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
             * cancel_policy_type.
             */
            public Builder cancelPolicyType(Integer cancelPolicyType) {
                this.cancelPolicyType = cancelPolicyType;
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
             * confirm_type.
             */
            public Builder confirmType(Integer confirmType) {
                this.confirmType = confirmType;
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
             * daily_price_format_yuan.
             */
            public Builder dailyPriceFormatYuan(String dailyPriceFormatYuan) {
                this.dailyPriceFormatYuan = dailyPriceFormatYuan;
                return this;
            }

            /**
             * daily_price_view.
             */
            public Builder dailyPriceView(String dailyPriceView) {
                this.dailyPriceView = dailyPriceView;
                return this;
            }

            /**
             * end_time_daily.
             */
            public Builder endTimeDaily(String endTimeDaily) {
                this.endTimeDaily = endTimeDaily;
                return this;
            }

            /**
             * hotel_detail_rate_price_d_t_o.
             */
            public Builder hotelDetailRatePriceDTO(java.util.List < HotelDetailRatePriceDTO> hotelDetailRatePriceDTO) {
                this.hotelDetailRatePriceDTO = hotelDetailRatePriceDTO;
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
             * inventory_price.
             */
            public Builder inventoryPrice(String inventoryPrice) {
                this.inventoryPrice = inventoryPrice;
                return this;
            }

            /**
             * is_business_pay4_goods.
             */
            public Builder isBusinessPay4Goods(Boolean isBusinessPay4Goods) {
                this.isBusinessPay4Goods = isBusinessPay4Goods;
                return this;
            }

            /**
             * is_guarantee.
             */
            public Builder isGuarantee(Integer isGuarantee) {
                this.isGuarantee = isGuarantee;
                return this;
            }

            /**
             * is_need_email.
             */
            public Builder isNeedEmail(Boolean isNeedEmail) {
                this.isNeedEmail = isNeedEmail;
                return this;
            }

            /**
             * item_id.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * last_cancel_time.
             */
            public Builder lastCancelTime(String lastCancelTime) {
                this.lastCancelTime = lastCancelTime;
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
             * order_ship_time.
             */
            public Builder orderShipTime(Integer orderShipTime) {
                this.orderShipTime = orderShipTime;
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
             * price_type.
             */
            public Builder priceType(Integer priceType) {
                this.priceType = priceType;
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
             * rate_id.
             */
            public Builder rateId(Long rateId) {
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
            public Builder rpId(Long rpId) {
                this.rpId = rpId;
                return this;
            }

            /**
             * seller_id.
             */
            public Builder sellerId(Long sellerId) {
                this.sellerId = sellerId;
                return this;
            }

            /**
             * start_time_daily.
             */
            public Builder startTimeDaily(String startTimeDaily) {
                this.startTimeDaily = startTimeDaily;
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
             * supplier_code.
             */
            public Builder supplierCode(String supplierCode) {
                this.supplierCode = supplierCode;
                return this;
            }

            /**
             * supplier_name.
             */
            public Builder supplierName(String supplierName) {
                this.supplierName = supplierName;
                return this;
            }

            /**
             * support_special_invoice.
             */
            public Builder supportSpecialInvoice(Boolean supportSpecialInvoice) {
                this.supportSpecialInvoice = supportSpecialInvoice;
                return this;
            }

            /**
             * unrounding_daily_price_format_yuan.
             */
            public Builder unroundingDailyPriceFormatYuan(String unroundingDailyPriceFormatYuan) {
                this.unroundingDailyPriceFormatYuan = unroundingDailyPriceFormatYuan;
                return this;
            }

            public Rates build() {
                return new Rates(this);
            } 

        } 

    }
    public static class RoomService extends TeaModel {
        @NameInMap("color")
        private String color;

        @NameInMap("desc")
        private String desc;

        @NameInMap("highlight_color_color")
        private String highlightColorColor;

        @NameInMap("title")
        private String title;

        private RoomService(Builder builder) {
            this.color = builder.color;
            this.desc = builder.desc;
            this.highlightColorColor = builder.highlightColorColor;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoomService create() {
            return builder().build();
        }

        /**
         * @return color
         */
        public String getColor() {
            return this.color;
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return highlightColorColor
         */
        public String getHighlightColorColor() {
            return this.highlightColorColor;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String color; 
            private String desc; 
            private String highlightColorColor; 
            private String title; 

            /**
             * color.
             */
            public Builder color(String color) {
                this.color = color;
                return this;
            }

            /**
             * desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * highlight_color_color.
             */
            public Builder highlightColorColor(String highlightColorColor) {
                this.highlightColorColor = highlightColorColor;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public RoomService build() {
                return new RoomService(this);
            } 

        } 

    }
    public static class Rooms extends TeaModel {
        @NameInMap("area")
        private String area;

        @NameInMap("bed_type_string")
        private String bedTypeString;

        @NameInMap("extra_bed")
        private Boolean extraBed;

        @NameInMap("facility")
        private String facility;

        @NameInMap("floor")
        private String floor;

        @NameInMap("max_occupancy")
        private Integer maxOccupancy;

        @NameInMap("name")
        private String name;

        @NameInMap("network_service")
        private String networkService;

        @NameInMap("pics")
        private String pics;

        @NameInMap("rates")
        private java.util.List < Rates> rates;

        @NameInMap("room_dasc")
        private String roomDasc;

        @NameInMap("room_facility")
        private java.util.List < String > roomFacility;

        @NameInMap("room_service")
        private java.util.List < RoomService> roomService;

        @NameInMap("srid")
        private Long srid;

        @NameInMap("status")
        private Integer status;

        @NameInMap("window_type")
        private String windowType;

        private Rooms(Builder builder) {
            this.area = builder.area;
            this.bedTypeString = builder.bedTypeString;
            this.extraBed = builder.extraBed;
            this.facility = builder.facility;
            this.floor = builder.floor;
            this.maxOccupancy = builder.maxOccupancy;
            this.name = builder.name;
            this.networkService = builder.networkService;
            this.pics = builder.pics;
            this.rates = builder.rates;
            this.roomDasc = builder.roomDasc;
            this.roomFacility = builder.roomFacility;
            this.roomService = builder.roomService;
            this.srid = builder.srid;
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
         * @return bedTypeString
         */
        public String getBedTypeString() {
            return this.bedTypeString;
        }

        /**
         * @return extraBed
         */
        public Boolean getExtraBed() {
            return this.extraBed;
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
         * @return name
         */
        public String getName() {
            return this.name;
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
        public String getPics() {
            return this.pics;
        }

        /**
         * @return rates
         */
        public java.util.List < Rates> getRates() {
            return this.rates;
        }

        /**
         * @return roomDasc
         */
        public String getRoomDasc() {
            return this.roomDasc;
        }

        /**
         * @return roomFacility
         */
        public java.util.List < String > getRoomFacility() {
            return this.roomFacility;
        }

        /**
         * @return roomService
         */
        public java.util.List < RoomService> getRoomService() {
            return this.roomService;
        }

        /**
         * @return srid
         */
        public Long getSrid() {
            return this.srid;
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
            private String bedTypeString; 
            private Boolean extraBed; 
            private String facility; 
            private String floor; 
            private Integer maxOccupancy; 
            private String name; 
            private String networkService; 
            private String pics; 
            private java.util.List < Rates> rates; 
            private String roomDasc; 
            private java.util.List < String > roomFacility; 
            private java.util.List < RoomService> roomService; 
            private Long srid; 
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
             * bed_type_string.
             */
            public Builder bedTypeString(String bedTypeString) {
                this.bedTypeString = bedTypeString;
                return this;
            }

            /**
             * extra_bed.
             */
            public Builder extraBed(Boolean extraBed) {
                this.extraBed = extraBed;
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
             * name.
             */
            public Builder name(String name) {
                this.name = name;
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
            public Builder pics(String pics) {
                this.pics = pics;
                return this;
            }

            /**
             * rates.
             */
            public Builder rates(java.util.List < Rates> rates) {
                this.rates = rates;
                return this;
            }

            /**
             * room_dasc.
             */
            public Builder roomDasc(String roomDasc) {
                this.roomDasc = roomDasc;
                return this;
            }

            /**
             * room_facility.
             */
            public Builder roomFacility(java.util.List < String > roomFacility) {
                this.roomFacility = roomFacility;
                return this;
            }

            /**
             * room_service.
             */
            public Builder roomService(java.util.List < RoomService> roomService) {
                this.roomService = roomService;
                return this;
            }

            /**
             * srid.
             */
            public Builder srid(Long srid) {
                this.srid = srid;
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
    public static class Module extends TeaModel {
        @NameInMap("address")
        private String address;

        @NameInMap("booking_instructions")
        private java.util.Map < String, String > bookingInstructions;

        @NameInMap("can_foreigner")
        private Boolean canForeigner;

        @NameInMap("check_in")
        private String checkIn;

        @NameInMap("check_out")
        private String checkOut;

        @NameInMap("descriptions")
        private java.util.List < String > descriptions;

        @NameInMap("dinamic_banner_pic_urls")
        private java.util.List < String > dinamicBannerPicUrls;

        @NameInMap("early_arrival_time")
        private String earlyArrivalTime;

        @NameInMap("hotel_id")
        private Long hotelId;

        @NameInMap("hotel_name")
        private String hotelName;

        @NameInMap("late_arrival_time")
        private String lateArrivalTime;

        @NameInMap("rooms")
        private java.util.List < Rooms> rooms;

        @NameInMap("search_id")
        private String searchId;

        private Module(Builder builder) {
            this.address = builder.address;
            this.bookingInstructions = builder.bookingInstructions;
            this.canForeigner = builder.canForeigner;
            this.checkIn = builder.checkIn;
            this.checkOut = builder.checkOut;
            this.descriptions = builder.descriptions;
            this.dinamicBannerPicUrls = builder.dinamicBannerPicUrls;
            this.earlyArrivalTime = builder.earlyArrivalTime;
            this.hotelId = builder.hotelId;
            this.hotelName = builder.hotelName;
            this.lateArrivalTime = builder.lateArrivalTime;
            this.rooms = builder.rooms;
            this.searchId = builder.searchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return bookingInstructions
         */
        public java.util.Map < String, String > getBookingInstructions() {
            return this.bookingInstructions;
        }

        /**
         * @return canForeigner
         */
        public Boolean getCanForeigner() {
            return this.canForeigner;
        }

        /**
         * @return checkIn
         */
        public String getCheckIn() {
            return this.checkIn;
        }

        /**
         * @return checkOut
         */
        public String getCheckOut() {
            return this.checkOut;
        }

        /**
         * @return descriptions
         */
        public java.util.List < String > getDescriptions() {
            return this.descriptions;
        }

        /**
         * @return dinamicBannerPicUrls
         */
        public java.util.List < String > getDinamicBannerPicUrls() {
            return this.dinamicBannerPicUrls;
        }

        /**
         * @return earlyArrivalTime
         */
        public String getEarlyArrivalTime() {
            return this.earlyArrivalTime;
        }

        /**
         * @return hotelId
         */
        public Long getHotelId() {
            return this.hotelId;
        }

        /**
         * @return hotelName
         */
        public String getHotelName() {
            return this.hotelName;
        }

        /**
         * @return lateArrivalTime
         */
        public String getLateArrivalTime() {
            return this.lateArrivalTime;
        }

        /**
         * @return rooms
         */
        public java.util.List < Rooms> getRooms() {
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
            private java.util.Map < String, String > bookingInstructions; 
            private Boolean canForeigner; 
            private String checkIn; 
            private String checkOut; 
            private java.util.List < String > descriptions; 
            private java.util.List < String > dinamicBannerPicUrls; 
            private String earlyArrivalTime; 
            private Long hotelId; 
            private String hotelName; 
            private String lateArrivalTime; 
            private java.util.List < Rooms> rooms; 
            private String searchId; 

            /**
             * address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * booking_instructions.
             */
            public Builder bookingInstructions(java.util.Map < String, String > bookingInstructions) {
                this.bookingInstructions = bookingInstructions;
                return this;
            }

            /**
             * can_foreigner.
             */
            public Builder canForeigner(Boolean canForeigner) {
                this.canForeigner = canForeigner;
                return this;
            }

            /**
             * check_in.
             */
            public Builder checkIn(String checkIn) {
                this.checkIn = checkIn;
                return this;
            }

            /**
             * check_out.
             */
            public Builder checkOut(String checkOut) {
                this.checkOut = checkOut;
                return this;
            }

            /**
             * descriptions.
             */
            public Builder descriptions(java.util.List < String > descriptions) {
                this.descriptions = descriptions;
                return this;
            }

            /**
             * dinamic_banner_pic_urls.
             */
            public Builder dinamicBannerPicUrls(java.util.List < String > dinamicBannerPicUrls) {
                this.dinamicBannerPicUrls = dinamicBannerPicUrls;
                return this;
            }

            /**
             * early_arrival_time.
             */
            public Builder earlyArrivalTime(String earlyArrivalTime) {
                this.earlyArrivalTime = earlyArrivalTime;
                return this;
            }

            /**
             * hotel_id.
             */
            public Builder hotelId(Long hotelId) {
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
             * late_arrival_time.
             */
            public Builder lateArrivalTime(String lateArrivalTime) {
                this.lateArrivalTime = lateArrivalTime;
                return this;
            }

            /**
             * rooms.
             */
            public Builder rooms(java.util.List < Rooms> rooms) {
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

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
