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
 * {@link HotelGoodsQueryResponseBody} extends {@link TeaModel}
 *
 * <p>HotelGoodsQueryResponseBody</p>
 */
public class HotelGoodsQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
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

        private Builder() {
        } 

        private Builder(HotelGoodsQueryResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.module = model.module;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

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

    /**
     * 
     * {@link HotelGoodsQueryResponseBody} extends {@link TeaModel}
     *
     * <p>HotelGoodsQueryResponseBody</p>
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

            private Builder() {
            } 

            private Builder(BtripHotelCancelPolicyInfoDTOList model) {
                this.hour = model.hour;
                this.value = model.value;
            } 

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
     * {@link HotelGoodsQueryResponseBody} extends {@link TeaModel}
     *
     * <p>HotelGoodsQueryResponseBody</p>
     */
    public static class BtripHotelCancelPolicyDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("btrip_hotel_cancel_policy_info_d_t_o_list")
        private java.util.List<BtripHotelCancelPolicyInfoDTOList> btripHotelCancelPolicyInfoDTOList;

        @com.aliyun.core.annotation.NameInMap("cancel_policy_type")
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

            private Builder() {
            } 

            private Builder(BtripHotelCancelPolicyDTO model) {
                this.btripHotelCancelPolicyInfoDTOList = model.btripHotelCancelPolicyInfoDTOList;
                this.cancelPolicyType = model.cancelPolicyType;
            } 

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

            public BtripHotelCancelPolicyDTO build() {
                return new BtripHotelCancelPolicyDTO(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelGoodsQueryResponseBody} extends {@link TeaModel}
     *
     * <p>HotelGoodsQueryResponseBody</p>
     */
    public static class BtripCancelRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("btrip_hotel_cancel_policy_d_t_o")
        private BtripHotelCancelPolicyDTO btripHotelCancelPolicyDTO;

        @com.aliyun.core.annotation.NameInMap("cancel_policy_title")
        private String cancelPolicyTitle;

        @com.aliyun.core.annotation.NameInMap("check_in")
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

            private Builder() {
            } 

            private Builder(BtripCancelRule model) {
                this.btripHotelCancelPolicyDTO = model.btripHotelCancelPolicyDTO;
                this.cancelPolicyTitle = model.cancelPolicyTitle;
                this.checkIn = model.checkIn;
            } 

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
    /**
     * 
     * {@link HotelGoodsQueryResponseBody} extends {@link TeaModel}
     *
     * <p>HotelGoodsQueryResponseBody</p>
     */
    public static class BtripHotelCancelDesc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("title")
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

            private Builder() {
            } 

            private Builder(BtripHotelCancelDesc model) {
                this.desc = model.desc;
                this.title = model.title;
            } 

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
    /**
     * 
     * {@link HotelGoodsQueryResponseBody} extends {@link TeaModel}
     *
     * <p>HotelGoodsQueryResponseBody</p>
     */
    public static class DiscountDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("label_name")
        private java.util.List<String> labelName;

        @com.aliyun.core.annotation.NameInMap("money_desc")
        private String moneyDesc;

        private DiscountDetail(Builder builder) {
            this.labelName = builder.labelName;
            this.moneyDesc = builder.moneyDesc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiscountDetail create() {
            return builder().build();
        }

        /**
         * @return labelName
         */
        public java.util.List<String> getLabelName() {
            return this.labelName;
        }

        /**
         * @return moneyDesc
         */
        public String getMoneyDesc() {
            return this.moneyDesc;
        }

        public static final class Builder {
            private java.util.List<String> labelName; 
            private String moneyDesc; 

            private Builder() {
            } 

            private Builder(DiscountDetail model) {
                this.labelName = model.labelName;
                this.moneyDesc = model.moneyDesc;
            } 

            /**
             * label_name.
             */
            public Builder labelName(java.util.List<String> labelName) {
                this.labelName = labelName;
                return this;
            }

            /**
             * money_desc.
             */
            public Builder moneyDesc(String moneyDesc) {
                this.moneyDesc = moneyDesc;
                return this;
            }

            public DiscountDetail build() {
                return new DiscountDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelGoodsQueryResponseBody} extends {@link TeaModel}
     *
     * <p>HotelGoodsQueryResponseBody</p>
     */
    public static class DiscountDesc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cash_reduce_total")
        private String cashReduceTotal;

        @com.aliyun.core.annotation.NameInMap("dinamic_label")
        private String dinamicLabel;

        @com.aliyun.core.annotation.NameInMap("discount_detail")
        private java.util.List<DiscountDetail> discountDetail;

        @com.aliyun.core.annotation.NameInMap("sub_title")
        private String subTitle;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private DiscountDesc(Builder builder) {
            this.cashReduceTotal = builder.cashReduceTotal;
            this.dinamicLabel = builder.dinamicLabel;
            this.discountDetail = builder.discountDetail;
            this.subTitle = builder.subTitle;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiscountDesc create() {
            return builder().build();
        }

        /**
         * @return cashReduceTotal
         */
        public String getCashReduceTotal() {
            return this.cashReduceTotal;
        }

        /**
         * @return dinamicLabel
         */
        public String getDinamicLabel() {
            return this.dinamicLabel;
        }

        /**
         * @return discountDetail
         */
        public java.util.List<DiscountDetail> getDiscountDetail() {
            return this.discountDetail;
        }

        /**
         * @return subTitle
         */
        public String getSubTitle() {
            return this.subTitle;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String cashReduceTotal; 
            private String dinamicLabel; 
            private java.util.List<DiscountDetail> discountDetail; 
            private String subTitle; 
            private String title; 

            private Builder() {
            } 

            private Builder(DiscountDesc model) {
                this.cashReduceTotal = model.cashReduceTotal;
                this.dinamicLabel = model.dinamicLabel;
                this.discountDetail = model.discountDetail;
                this.subTitle = model.subTitle;
                this.title = model.title;
            } 

            /**
             * cash_reduce_total.
             */
            public Builder cashReduceTotal(String cashReduceTotal) {
                this.cashReduceTotal = cashReduceTotal;
                return this;
            }

            /**
             * dinamic_label.
             */
            public Builder dinamicLabel(String dinamicLabel) {
                this.dinamicLabel = dinamicLabel;
                return this;
            }

            /**
             * discount_detail.
             */
            public Builder discountDetail(java.util.List<DiscountDetail> discountDetail) {
                this.discountDetail = discountDetail;
                return this;
            }

            /**
             * sub_title.
             */
            public Builder subTitle(String subTitle) {
                this.subTitle = subTitle;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public DiscountDesc build() {
                return new DiscountDesc(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelGoodsQueryResponseBody} extends {@link TeaModel}
     *
     * <p>HotelGoodsQueryResponseBody</p>
     */
    public static class HotelDetailRatePriceDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("before_discount_price")
        private Long beforeDiscountPrice;

        @com.aliyun.core.annotation.NameInMap("breakfast")
        private String breakfast;

        @com.aliyun.core.annotation.NameInMap("discount_price")
        private Long discountPrice;

        @com.aliyun.core.annotation.NameInMap("last_discounts_price")
        private Long lastDiscountsPrice;

        @com.aliyun.core.annotation.NameInMap("last_discounts_rounding_price")
        private Long lastDiscountsRoundingPrice;

        @com.aliyun.core.annotation.NameInMap("last_num")
        private Integer lastNum;

        @com.aliyun.core.annotation.NameInMap("rate_start_time")
        private String rateStartTime;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        private HotelDetailRatePriceDTO(Builder builder) {
            this.beforeDiscountPrice = builder.beforeDiscountPrice;
            this.breakfast = builder.breakfast;
            this.discountPrice = builder.discountPrice;
            this.lastDiscountsPrice = builder.lastDiscountsPrice;
            this.lastDiscountsRoundingPrice = builder.lastDiscountsRoundingPrice;
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
         * @return lastDiscountsRoundingPrice
         */
        public Long getLastDiscountsRoundingPrice() {
            return this.lastDiscountsRoundingPrice;
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
            private Long lastDiscountsRoundingPrice; 
            private Integer lastNum; 
            private String rateStartTime; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(HotelDetailRatePriceDTO model) {
                this.beforeDiscountPrice = model.beforeDiscountPrice;
                this.breakfast = model.breakfast;
                this.discountPrice = model.discountPrice;
                this.lastDiscountsPrice = model.lastDiscountsPrice;
                this.lastDiscountsRoundingPrice = model.lastDiscountsRoundingPrice;
                this.lastNum = model.lastNum;
                this.rateStartTime = model.rateStartTime;
                this.status = model.status;
            } 

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
             * last_discounts_rounding_price.
             */
            public Builder lastDiscountsRoundingPrice(Long lastDiscountsRoundingPrice) {
                this.lastDiscountsRoundingPrice = lastDiscountsRoundingPrice;
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
    /**
     * 
     * {@link HotelGoodsQueryResponseBody} extends {@link TeaModel}
     *
     * <p>HotelGoodsQueryResponseBody</p>
     */
    public static class Rates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bed_desc")
        private String bedDesc;

        @com.aliyun.core.annotation.NameInMap("bed_type")
        private String bedType;

        @com.aliyun.core.annotation.NameInMap("breakfast")
        private String breakfast;

        @com.aliyun.core.annotation.NameInMap("btrip_cancel_rule")
        private BtripCancelRule btripCancelRule;

        @com.aliyun.core.annotation.NameInMap("btrip_hotel_cancel_desc")
        private java.util.List<BtripHotelCancelDesc> btripHotelCancelDesc;

        @com.aliyun.core.annotation.NameInMap("can_smoking")
        private Boolean canSmoking;

        @com.aliyun.core.annotation.NameInMap("cancel_policy_desc")
        private String cancelPolicyDesc;

        @com.aliyun.core.annotation.NameInMap("cancel_policy_type")
        private Integer cancelPolicyType;

        @com.aliyun.core.annotation.NameInMap("company_aassist")
        private String companyAassist;

        @com.aliyun.core.annotation.NameInMap("confirm_type")
        private Integer confirmType;

        @com.aliyun.core.annotation.NameInMap("currency_code")
        private String currencyCode;

        @com.aliyun.core.annotation.NameInMap("daily_price_format_yuan")
        private String dailyPriceFormatYuan;

        @com.aliyun.core.annotation.NameInMap("daily_price_view")
        private String dailyPriceView;

        @com.aliyun.core.annotation.NameInMap("discount_desc")
        private DiscountDesc discountDesc;

        @com.aliyun.core.annotation.NameInMap("end_time_daily")
        private String endTimeDaily;

        @com.aliyun.core.annotation.NameInMap("hotel_detail_rate_price_d_t_o")
        private java.util.List<HotelDetailRatePriceDTO> hotelDetailRatePriceDTO;

        @com.aliyun.core.annotation.NameInMap("instant_confirm")
        private Boolean instantConfirm;

        @com.aliyun.core.annotation.NameInMap("inventory_desc")
        private String inventoryDesc;

        @com.aliyun.core.annotation.NameInMap("inventory_price")
        private String inventoryPrice;

        @com.aliyun.core.annotation.NameInMap("is_business_pay4_goods")
        private Boolean isBusinessPay4Goods;

        @com.aliyun.core.annotation.NameInMap("is_guarantee")
        private Integer isGuarantee;

        @com.aliyun.core.annotation.NameInMap("is_need_email")
        private Boolean isNeedEmail;

        @com.aliyun.core.annotation.NameInMap("item_id")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("last_cancel_time")
        private String lastCancelTime;

        @com.aliyun.core.annotation.NameInMap("max_occupancy")
        private Integer maxOccupancy;

        @com.aliyun.core.annotation.NameInMap("min_adv_hours")
        private Integer minAdvHours;

        @com.aliyun.core.annotation.NameInMap("min_days")
        private Integer minDays;

        @com.aliyun.core.annotation.NameInMap("nod")
        private Integer nod;

        @com.aliyun.core.annotation.NameInMap("nop")
        private Integer nop;

        @com.aliyun.core.annotation.NameInMap("order_ship_time")
        private Integer orderShipTime;

        @com.aliyun.core.annotation.NameInMap("payment_type")
        private Integer paymentType;

        @com.aliyun.core.annotation.NameInMap("price_type")
        private Integer priceType;

        @com.aliyun.core.annotation.NameInMap("promotion_info")
        private String promotionInfo;

        @com.aliyun.core.annotation.NameInMap("rate_id")
        private Long rateId;

        @com.aliyun.core.annotation.NameInMap("rate_plan_name")
        private String ratePlanName;

        @com.aliyun.core.annotation.NameInMap("rp_id")
        private Long rpId;

        @com.aliyun.core.annotation.NameInMap("seller_id")
        private Long sellerId;

        @com.aliyun.core.annotation.NameInMap("start_time_daily")
        private String startTimeDaily;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("supplier_code")
        private String supplierCode;

        @com.aliyun.core.annotation.NameInMap("supplier_name")
        private String supplierName;

        @com.aliyun.core.annotation.NameInMap("support_special_invoice")
        private Boolean supportSpecialInvoice;

        @com.aliyun.core.annotation.NameInMap("unrounding_daily_price_format_yuan")
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
            this.discountDesc = builder.discountDesc;
            this.endTimeDaily = builder.endTimeDaily;
            this.hotelDetailRatePriceDTO = builder.hotelDetailRatePriceDTO;
            this.instantConfirm = builder.instantConfirm;
            this.inventoryDesc = builder.inventoryDesc;
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
        public java.util.List<BtripHotelCancelDesc> getBtripHotelCancelDesc() {
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
         * @return discountDesc
         */
        public DiscountDesc getDiscountDesc() {
            return this.discountDesc;
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
        public java.util.List<HotelDetailRatePriceDTO> getHotelDetailRatePriceDTO() {
            return this.hotelDetailRatePriceDTO;
        }

        /**
         * @return instantConfirm
         */
        public Boolean getInstantConfirm() {
            return this.instantConfirm;
        }

        /**
         * @return inventoryDesc
         */
        public String getInventoryDesc() {
            return this.inventoryDesc;
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
            private java.util.List<BtripHotelCancelDesc> btripHotelCancelDesc; 
            private Boolean canSmoking; 
            private String cancelPolicyDesc; 
            private Integer cancelPolicyType; 
            private String companyAassist; 
            private Integer confirmType; 
            private String currencyCode; 
            private String dailyPriceFormatYuan; 
            private String dailyPriceView; 
            private DiscountDesc discountDesc; 
            private String endTimeDaily; 
            private java.util.List<HotelDetailRatePriceDTO> hotelDetailRatePriceDTO; 
            private Boolean instantConfirm; 
            private String inventoryDesc; 
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

            private Builder() {
            } 

            private Builder(Rates model) {
                this.bedDesc = model.bedDesc;
                this.bedType = model.bedType;
                this.breakfast = model.breakfast;
                this.btripCancelRule = model.btripCancelRule;
                this.btripHotelCancelDesc = model.btripHotelCancelDesc;
                this.canSmoking = model.canSmoking;
                this.cancelPolicyDesc = model.cancelPolicyDesc;
                this.cancelPolicyType = model.cancelPolicyType;
                this.companyAassist = model.companyAassist;
                this.confirmType = model.confirmType;
                this.currencyCode = model.currencyCode;
                this.dailyPriceFormatYuan = model.dailyPriceFormatYuan;
                this.dailyPriceView = model.dailyPriceView;
                this.discountDesc = model.discountDesc;
                this.endTimeDaily = model.endTimeDaily;
                this.hotelDetailRatePriceDTO = model.hotelDetailRatePriceDTO;
                this.instantConfirm = model.instantConfirm;
                this.inventoryDesc = model.inventoryDesc;
                this.inventoryPrice = model.inventoryPrice;
                this.isBusinessPay4Goods = model.isBusinessPay4Goods;
                this.isGuarantee = model.isGuarantee;
                this.isNeedEmail = model.isNeedEmail;
                this.itemId = model.itemId;
                this.lastCancelTime = model.lastCancelTime;
                this.maxOccupancy = model.maxOccupancy;
                this.minAdvHours = model.minAdvHours;
                this.minDays = model.minDays;
                this.nod = model.nod;
                this.nop = model.nop;
                this.orderShipTime = model.orderShipTime;
                this.paymentType = model.paymentType;
                this.priceType = model.priceType;
                this.promotionInfo = model.promotionInfo;
                this.rateId = model.rateId;
                this.ratePlanName = model.ratePlanName;
                this.rpId = model.rpId;
                this.sellerId = model.sellerId;
                this.startTimeDaily = model.startTimeDaily;
                this.status = model.status;
                this.supplierCode = model.supplierCode;
                this.supplierName = model.supplierName;
                this.supportSpecialInvoice = model.supportSpecialInvoice;
                this.unroundingDailyPriceFormatYuan = model.unroundingDailyPriceFormatYuan;
            } 

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
            public Builder btripHotelCancelDesc(java.util.List<BtripHotelCancelDesc> btripHotelCancelDesc) {
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
             * discount_desc.
             */
            public Builder discountDesc(DiscountDesc discountDesc) {
                this.discountDesc = discountDesc;
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
            public Builder hotelDetailRatePriceDTO(java.util.List<HotelDetailRatePriceDTO> hotelDetailRatePriceDTO) {
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
             * inventory_desc.
             */
            public Builder inventoryDesc(String inventoryDesc) {
                this.inventoryDesc = inventoryDesc;
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
    /**
     * 
     * {@link HotelGoodsQueryResponseBody} extends {@link TeaModel}
     *
     * <p>HotelGoodsQueryResponseBody</p>
     */
    public static class RoomService extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("color")
        private String color;

        @com.aliyun.core.annotation.NameInMap("desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("highlight_color_color")
        private String highlightColorColor;

        @com.aliyun.core.annotation.NameInMap("title")
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

            private Builder() {
            } 

            private Builder(RoomService model) {
                this.color = model.color;
                this.desc = model.desc;
                this.highlightColorColor = model.highlightColorColor;
                this.title = model.title;
            } 

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
    /**
     * 
     * {@link HotelGoodsQueryResponseBody} extends {@link TeaModel}
     *
     * <p>HotelGoodsQueryResponseBody</p>
     */
    public static class Rooms extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("area")
        private String area;

        @com.aliyun.core.annotation.NameInMap("bed_type_string")
        private String bedTypeString;

        @com.aliyun.core.annotation.NameInMap("extra_bed")
        private Boolean extraBed;

        @com.aliyun.core.annotation.NameInMap("facility")
        private String facility;

        @com.aliyun.core.annotation.NameInMap("floor")
        private String floor;

        @com.aliyun.core.annotation.NameInMap("max_occupancy")
        private Integer maxOccupancy;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("network_service")
        private String networkService;

        @com.aliyun.core.annotation.NameInMap("pics")
        private String pics;

        @com.aliyun.core.annotation.NameInMap("rates")
        private java.util.List<Rates> rates;

        @com.aliyun.core.annotation.NameInMap("room_dasc")
        private String roomDasc;

        @com.aliyun.core.annotation.NameInMap("room_facility")
        private java.util.List<String> roomFacility;

        @com.aliyun.core.annotation.NameInMap("room_service")
        private java.util.List<RoomService> roomService;

        @com.aliyun.core.annotation.NameInMap("srid")
        private Long srid;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("window_type")
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
        public java.util.List<Rates> getRates() {
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
        public java.util.List<String> getRoomFacility() {
            return this.roomFacility;
        }

        /**
         * @return roomService
         */
        public java.util.List<RoomService> getRoomService() {
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
            private java.util.List<Rates> rates; 
            private String roomDasc; 
            private java.util.List<String> roomFacility; 
            private java.util.List<RoomService> roomService; 
            private Long srid; 
            private Integer status; 
            private String windowType; 

            private Builder() {
            } 

            private Builder(Rooms model) {
                this.area = model.area;
                this.bedTypeString = model.bedTypeString;
                this.extraBed = model.extraBed;
                this.facility = model.facility;
                this.floor = model.floor;
                this.maxOccupancy = model.maxOccupancy;
                this.name = model.name;
                this.networkService = model.networkService;
                this.pics = model.pics;
                this.rates = model.rates;
                this.roomDasc = model.roomDasc;
                this.roomFacility = model.roomFacility;
                this.roomService = model.roomService;
                this.srid = model.srid;
                this.status = model.status;
                this.windowType = model.windowType;
            } 

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
            public Builder rates(java.util.List<Rates> rates) {
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
            public Builder roomFacility(java.util.List<String> roomFacility) {
                this.roomFacility = roomFacility;
                return this;
            }

            /**
             * room_service.
             */
            public Builder roomService(java.util.List<RoomService> roomService) {
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
    /**
     * 
     * {@link HotelGoodsQueryResponseBody} extends {@link TeaModel}
     *
     * <p>HotelGoodsQueryResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("booking_instructions")
        private java.util.Map<String, String> bookingInstructions;

        @com.aliyun.core.annotation.NameInMap("can_foreigner")
        private Boolean canForeigner;

        @com.aliyun.core.annotation.NameInMap("check_in")
        private String checkIn;

        @com.aliyun.core.annotation.NameInMap("check_out")
        private String checkOut;

        @com.aliyun.core.annotation.NameInMap("descriptions")
        private java.util.List<String> descriptions;

        @com.aliyun.core.annotation.NameInMap("dinamic_banner_pic_urls")
        private java.util.List<String> dinamicBannerPicUrls;

        @com.aliyun.core.annotation.NameInMap("early_arrival_time")
        private String earlyArrivalTime;

        @com.aliyun.core.annotation.NameInMap("hotel_id")
        private Long hotelId;

        @com.aliyun.core.annotation.NameInMap("hotel_name")
        private String hotelName;

        @com.aliyun.core.annotation.NameInMap("late_arrival_time")
        private String lateArrivalTime;

        @com.aliyun.core.annotation.NameInMap("rooms")
        private java.util.List<Rooms> rooms;

        @com.aliyun.core.annotation.NameInMap("search_id")
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
        public java.util.Map<String, String> getBookingInstructions() {
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
        public java.util.List<String> getDescriptions() {
            return this.descriptions;
        }

        /**
         * @return dinamicBannerPicUrls
         */
        public java.util.List<String> getDinamicBannerPicUrls() {
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
            private java.util.Map<String, String> bookingInstructions; 
            private Boolean canForeigner; 
            private String checkIn; 
            private String checkOut; 
            private java.util.List<String> descriptions; 
            private java.util.List<String> dinamicBannerPicUrls; 
            private String earlyArrivalTime; 
            private Long hotelId; 
            private String hotelName; 
            private String lateArrivalTime; 
            private java.util.List<Rooms> rooms; 
            private String searchId; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.address = model.address;
                this.bookingInstructions = model.bookingInstructions;
                this.canForeigner = model.canForeigner;
                this.checkIn = model.checkIn;
                this.checkOut = model.checkOut;
                this.descriptions = model.descriptions;
                this.dinamicBannerPicUrls = model.dinamicBannerPicUrls;
                this.earlyArrivalTime = model.earlyArrivalTime;
                this.hotelId = model.hotelId;
                this.hotelName = model.hotelName;
                this.lateArrivalTime = model.lateArrivalTime;
                this.rooms = model.rooms;
                this.searchId = model.searchId;
            } 

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
            public Builder bookingInstructions(java.util.Map<String, String> bookingInstructions) {
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
            public Builder descriptions(java.util.List<String> descriptions) {
                this.descriptions = descriptions;
                return this;
            }

            /**
             * dinamic_banner_pic_urls.
             */
            public Builder dinamicBannerPicUrls(java.util.List<String> dinamicBannerPicUrls) {
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

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
