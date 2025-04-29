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
 * {@link HotelOrderPreValidateResponseBody} extends {@link TeaModel}
 *
 * <p>HotelOrderPreValidateResponseBody</p>
 */
public class HotelOrderPreValidateResponseBody extends TeaModel {
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

    private HotelOrderPreValidateResponseBody(Builder builder) {
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

    public static HotelOrderPreValidateResponseBody create() {
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

        private Builder(HotelOrderPreValidateResponseBody model) {
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
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>B72B39C8-32DE-558D-AD1C-D53F11F6ADFE</p>
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

        public HotelOrderPreValidateResponseBody build() {
            return new HotelOrderPreValidateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link HotelOrderPreValidateResponseBody} extends {@link TeaModel}
     *
     * <p>HotelOrderPreValidateResponseBody</p>
     */
    public static class ItemInvoice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("support_special")
        private Boolean supportSpecial;

        private ItemInvoice(Builder builder) {
            this.supportSpecial = builder.supportSpecial;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemInvoice create() {
            return builder().build();
        }

        /**
         * @return supportSpecial
         */
        public Boolean getSupportSpecial() {
            return this.supportSpecial;
        }

        public static final class Builder {
            private Boolean supportSpecial; 

            private Builder() {
            } 

            private Builder(ItemInvoice model) {
                this.supportSpecial = model.supportSpecial;
            } 

            /**
             * support_special.
             */
            public Builder supportSpecial(Boolean supportSpecial) {
                this.supportSpecial = supportSpecial;
                return this;
            }

            public ItemInvoice build() {
                return new ItemInvoice(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelOrderPreValidateResponseBody} extends {@link TeaModel}
     *
     * <p>HotelOrderPreValidateResponseBody</p>
     */
    public static class PromotionDetailInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("check_status")
        private Boolean checkStatus;

        @com.aliyun.core.annotation.NameInMap("need_check")
        private Boolean needCheck;

        @com.aliyun.core.annotation.NameInMap("promotion_code")
        private String promotionCode;

        @com.aliyun.core.annotation.NameInMap("promotion_id")
        private String promotionId;

        @com.aliyun.core.annotation.NameInMap("promotion_name")
        private String promotionName;

        @com.aliyun.core.annotation.NameInMap("promotion_price")
        private Long promotionPrice;

        @com.aliyun.core.annotation.NameInMap("promotion_type")
        private String promotionType;

        private PromotionDetailInfoList(Builder builder) {
            this.checkStatus = builder.checkStatus;
            this.needCheck = builder.needCheck;
            this.promotionCode = builder.promotionCode;
            this.promotionId = builder.promotionId;
            this.promotionName = builder.promotionName;
            this.promotionPrice = builder.promotionPrice;
            this.promotionType = builder.promotionType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PromotionDetailInfoList create() {
            return builder().build();
        }

        /**
         * @return checkStatus
         */
        public Boolean getCheckStatus() {
            return this.checkStatus;
        }

        /**
         * @return needCheck
         */
        public Boolean getNeedCheck() {
            return this.needCheck;
        }

        /**
         * @return promotionCode
         */
        public String getPromotionCode() {
            return this.promotionCode;
        }

        /**
         * @return promotionId
         */
        public String getPromotionId() {
            return this.promotionId;
        }

        /**
         * @return promotionName
         */
        public String getPromotionName() {
            return this.promotionName;
        }

        /**
         * @return promotionPrice
         */
        public Long getPromotionPrice() {
            return this.promotionPrice;
        }

        /**
         * @return promotionType
         */
        public String getPromotionType() {
            return this.promotionType;
        }

        public static final class Builder {
            private Boolean checkStatus; 
            private Boolean needCheck; 
            private String promotionCode; 
            private String promotionId; 
            private String promotionName; 
            private Long promotionPrice; 
            private String promotionType; 

            private Builder() {
            } 

            private Builder(PromotionDetailInfoList model) {
                this.checkStatus = model.checkStatus;
                this.needCheck = model.needCheck;
                this.promotionCode = model.promotionCode;
                this.promotionId = model.promotionId;
                this.promotionName = model.promotionName;
                this.promotionPrice = model.promotionPrice;
                this.promotionType = model.promotionType;
            } 

            /**
             * check_status.
             */
            public Builder checkStatus(Boolean checkStatus) {
                this.checkStatus = checkStatus;
                return this;
            }

            /**
             * need_check.
             */
            public Builder needCheck(Boolean needCheck) {
                this.needCheck = needCheck;
                return this;
            }

            /**
             * promotion_code.
             */
            public Builder promotionCode(String promotionCode) {
                this.promotionCode = promotionCode;
                return this;
            }

            /**
             * promotion_id.
             */
            public Builder promotionId(String promotionId) {
                this.promotionId = promotionId;
                return this;
            }

            /**
             * promotion_name.
             */
            public Builder promotionName(String promotionName) {
                this.promotionName = promotionName;
                return this;
            }

            /**
             * promotion_price.
             */
            public Builder promotionPrice(Long promotionPrice) {
                this.promotionPrice = promotionPrice;
                return this;
            }

            /**
             * promotion_type.
             */
            public Builder promotionType(String promotionType) {
                this.promotionType = promotionType;
                return this;
            }

            public PromotionDetailInfoList build() {
                return new PromotionDetailInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelOrderPreValidateResponseBody} extends {@link TeaModel}
     *
     * <p>HotelOrderPreValidateResponseBody</p>
     */
    public static class PromotionInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ext_attr_map")
        private java.util.Map<String, String> extAttrMap;

        @com.aliyun.core.annotation.NameInMap("promotion_detail_info_list")
        private java.util.List<PromotionDetailInfoList> promotionDetailInfoList;

        @com.aliyun.core.annotation.NameInMap("promotion_total_price")
        private Long promotionTotalPrice;

        private PromotionInfo(Builder builder) {
            this.extAttrMap = builder.extAttrMap;
            this.promotionDetailInfoList = builder.promotionDetailInfoList;
            this.promotionTotalPrice = builder.promotionTotalPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PromotionInfo create() {
            return builder().build();
        }

        /**
         * @return extAttrMap
         */
        public java.util.Map<String, String> getExtAttrMap() {
            return this.extAttrMap;
        }

        /**
         * @return promotionDetailInfoList
         */
        public java.util.List<PromotionDetailInfoList> getPromotionDetailInfoList() {
            return this.promotionDetailInfoList;
        }

        /**
         * @return promotionTotalPrice
         */
        public Long getPromotionTotalPrice() {
            return this.promotionTotalPrice;
        }

        public static final class Builder {
            private java.util.Map<String, String> extAttrMap; 
            private java.util.List<PromotionDetailInfoList> promotionDetailInfoList; 
            private Long promotionTotalPrice; 

            private Builder() {
            } 

            private Builder(PromotionInfo model) {
                this.extAttrMap = model.extAttrMap;
                this.promotionDetailInfoList = model.promotionDetailInfoList;
                this.promotionTotalPrice = model.promotionTotalPrice;
            } 

            /**
             * ext_attr_map.
             */
            public Builder extAttrMap(java.util.Map<String, String> extAttrMap) {
                this.extAttrMap = extAttrMap;
                return this;
            }

            /**
             * promotion_detail_info_list.
             */
            public Builder promotionDetailInfoList(java.util.List<PromotionDetailInfoList> promotionDetailInfoList) {
                this.promotionDetailInfoList = promotionDetailInfoList;
                return this;
            }

            /**
             * promotion_total_price.
             */
            public Builder promotionTotalPrice(Long promotionTotalPrice) {
                this.promotionTotalPrice = promotionTotalPrice;
                return this;
            }

            public PromotionInfo build() {
                return new PromotionInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelOrderPreValidateResponseBody} extends {@link TeaModel}
     *
     * <p>HotelOrderPreValidateResponseBody</p>
     */
    public static class RatePlanDaily extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("board")
        private String board;

        @com.aliyun.core.annotation.NameInMap("discount_price")
        private String discountPrice;

        @com.aliyun.core.annotation.NameInMap("max_booking_num")
        private Integer maxBookingNum;

        @com.aliyun.core.annotation.NameInMap("price")
        private Long price;

        @com.aliyun.core.annotation.NameInMap("rate_start_time")
        private String rateStartTime;

        @com.aliyun.core.annotation.NameInMap("room_count")
        private Integer roomCount;

        @com.aliyun.core.annotation.NameInMap("rounding_discount_price")
        private String roundingDiscountPrice;

        @com.aliyun.core.annotation.NameInMap("rounding_price")
        private String roundingPrice;

        @com.aliyun.core.annotation.NameInMap("service_fee")
        private Long serviceFee;

        private RatePlanDaily(Builder builder) {
            this.board = builder.board;
            this.discountPrice = builder.discountPrice;
            this.maxBookingNum = builder.maxBookingNum;
            this.price = builder.price;
            this.rateStartTime = builder.rateStartTime;
            this.roomCount = builder.roomCount;
            this.roundingDiscountPrice = builder.roundingDiscountPrice;
            this.roundingPrice = builder.roundingPrice;
            this.serviceFee = builder.serviceFee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RatePlanDaily create() {
            return builder().build();
        }

        /**
         * @return board
         */
        public String getBoard() {
            return this.board;
        }

        /**
         * @return discountPrice
         */
        public String getDiscountPrice() {
            return this.discountPrice;
        }

        /**
         * @return maxBookingNum
         */
        public Integer getMaxBookingNum() {
            return this.maxBookingNum;
        }

        /**
         * @return price
         */
        public Long getPrice() {
            return this.price;
        }

        /**
         * @return rateStartTime
         */
        public String getRateStartTime() {
            return this.rateStartTime;
        }

        /**
         * @return roomCount
         */
        public Integer getRoomCount() {
            return this.roomCount;
        }

        /**
         * @return roundingDiscountPrice
         */
        public String getRoundingDiscountPrice() {
            return this.roundingDiscountPrice;
        }

        /**
         * @return roundingPrice
         */
        public String getRoundingPrice() {
            return this.roundingPrice;
        }

        /**
         * @return serviceFee
         */
        public Long getServiceFee() {
            return this.serviceFee;
        }

        public static final class Builder {
            private String board; 
            private String discountPrice; 
            private Integer maxBookingNum; 
            private Long price; 
            private String rateStartTime; 
            private Integer roomCount; 
            private String roundingDiscountPrice; 
            private String roundingPrice; 
            private Long serviceFee; 

            private Builder() {
            } 

            private Builder(RatePlanDaily model) {
                this.board = model.board;
                this.discountPrice = model.discountPrice;
                this.maxBookingNum = model.maxBookingNum;
                this.price = model.price;
                this.rateStartTime = model.rateStartTime;
                this.roomCount = model.roomCount;
                this.roundingDiscountPrice = model.roundingDiscountPrice;
                this.roundingPrice = model.roundingPrice;
                this.serviceFee = model.serviceFee;
            } 

            /**
             * board.
             */
            public Builder board(String board) {
                this.board = board;
                return this;
            }

            /**
             * discount_price.
             */
            public Builder discountPrice(String discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * max_booking_num.
             */
            public Builder maxBookingNum(Integer maxBookingNum) {
                this.maxBookingNum = maxBookingNum;
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
             * rate_start_time.
             */
            public Builder rateStartTime(String rateStartTime) {
                this.rateStartTime = rateStartTime;
                return this;
            }

            /**
             * room_count.
             */
            public Builder roomCount(Integer roomCount) {
                this.roomCount = roomCount;
                return this;
            }

            /**
             * rounding_discount_price.
             */
            public Builder roundingDiscountPrice(String roundingDiscountPrice) {
                this.roundingDiscountPrice = roundingDiscountPrice;
                return this;
            }

            /**
             * rounding_price.
             */
            public Builder roundingPrice(String roundingPrice) {
                this.roundingPrice = roundingPrice;
                return this;
            }

            /**
             * service_fee.
             */
            public Builder serviceFee(Long serviceFee) {
                this.serviceFee = serviceFee;
                return this;
            }

            public RatePlanDaily build() {
                return new RatePlanDaily(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelOrderPreValidateResponseBody} extends {@link TeaModel}
     *
     * <p>HotelOrderPreValidateResponseBody</p>
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
     * {@link HotelOrderPreValidateResponseBody} extends {@link TeaModel}
     *
     * <p>HotelOrderPreValidateResponseBody</p>
     */
    public static class BtripHotelCancelPolicyDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("btrip_hotel_cancel_policy_info_d_t_o_list")
        private java.util.List<BtripHotelCancelPolicyInfoDTOList> btripHotelCancelPolicyInfoDTOList;

        @com.aliyun.core.annotation.NameInMap("cancel_policy_type")
        private Integer cancelPolicyType;

        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("short_desc")
        private String shortDesc;

        private BtripHotelCancelPolicyDTO(Builder builder) {
            this.btripHotelCancelPolicyInfoDTOList = builder.btripHotelCancelPolicyInfoDTOList;
            this.cancelPolicyType = builder.cancelPolicyType;
            this.content = builder.content;
            this.shortDesc = builder.shortDesc;
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

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return shortDesc
         */
        public String getShortDesc() {
            return this.shortDesc;
        }

        public static final class Builder {
            private java.util.List<BtripHotelCancelPolicyInfoDTOList> btripHotelCancelPolicyInfoDTOList; 
            private Integer cancelPolicyType; 
            private String content; 
            private String shortDesc; 

            private Builder() {
            } 

            private Builder(BtripHotelCancelPolicyDTO model) {
                this.btripHotelCancelPolicyInfoDTOList = model.btripHotelCancelPolicyInfoDTOList;
                this.cancelPolicyType = model.cancelPolicyType;
                this.content = model.content;
                this.shortDesc = model.shortDesc;
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

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * short_desc.
             */
            public Builder shortDesc(String shortDesc) {
                this.shortDesc = shortDesc;
                return this;
            }

            public BtripHotelCancelPolicyDTO build() {
                return new BtripHotelCancelPolicyDTO(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelOrderPreValidateResponseBody} extends {@link TeaModel}
     *
     * <p>HotelOrderPreValidateResponseBody</p>
     */
    public static class RatePlanInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bed_desc")
        private String bedDesc;

        @com.aliyun.core.annotation.NameInMap("btrip_hotel_cancel_policy_d_t_o")
        private BtripHotelCancelPolicyDTO btripHotelCancelPolicyDTO;

        @com.aliyun.core.annotation.NameInMap("earliest_check_in_time")
        private String earliestCheckInTime;

        @com.aliyun.core.annotation.NameInMap("latest_check_out_time")
        private String latestCheckOutTime;

        @com.aliyun.core.annotation.NameInMap("max_booking_num")
        private Integer maxBookingNum;

        @com.aliyun.core.annotation.NameInMap("max_occupancy_num")
        private Integer maxOccupancyNum;

        @com.aliyun.core.annotation.NameInMap("need_certificate")
        private Boolean needCertificate;

        @com.aliyun.core.annotation.NameInMap("need_email")
        private Boolean needEmail;

        @com.aliyun.core.annotation.NameInMap("need_english_name")
        private Boolean needEnglishName;

        @com.aliyun.core.annotation.NameInMap("total_order_price")
        private Long totalOrderPrice;

        @com.aliyun.core.annotation.NameInMap("total_room_price")
        private Long totalRoomPrice;

        private RatePlanInfo(Builder builder) {
            this.bedDesc = builder.bedDesc;
            this.btripHotelCancelPolicyDTO = builder.btripHotelCancelPolicyDTO;
            this.earliestCheckInTime = builder.earliestCheckInTime;
            this.latestCheckOutTime = builder.latestCheckOutTime;
            this.maxBookingNum = builder.maxBookingNum;
            this.maxOccupancyNum = builder.maxOccupancyNum;
            this.needCertificate = builder.needCertificate;
            this.needEmail = builder.needEmail;
            this.needEnglishName = builder.needEnglishName;
            this.totalOrderPrice = builder.totalOrderPrice;
            this.totalRoomPrice = builder.totalRoomPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RatePlanInfo create() {
            return builder().build();
        }

        /**
         * @return bedDesc
         */
        public String getBedDesc() {
            return this.bedDesc;
        }

        /**
         * @return btripHotelCancelPolicyDTO
         */
        public BtripHotelCancelPolicyDTO getBtripHotelCancelPolicyDTO() {
            return this.btripHotelCancelPolicyDTO;
        }

        /**
         * @return earliestCheckInTime
         */
        public String getEarliestCheckInTime() {
            return this.earliestCheckInTime;
        }

        /**
         * @return latestCheckOutTime
         */
        public String getLatestCheckOutTime() {
            return this.latestCheckOutTime;
        }

        /**
         * @return maxBookingNum
         */
        public Integer getMaxBookingNum() {
            return this.maxBookingNum;
        }

        /**
         * @return maxOccupancyNum
         */
        public Integer getMaxOccupancyNum() {
            return this.maxOccupancyNum;
        }

        /**
         * @return needCertificate
         */
        public Boolean getNeedCertificate() {
            return this.needCertificate;
        }

        /**
         * @return needEmail
         */
        public Boolean getNeedEmail() {
            return this.needEmail;
        }

        /**
         * @return needEnglishName
         */
        public Boolean getNeedEnglishName() {
            return this.needEnglishName;
        }

        /**
         * @return totalOrderPrice
         */
        public Long getTotalOrderPrice() {
            return this.totalOrderPrice;
        }

        /**
         * @return totalRoomPrice
         */
        public Long getTotalRoomPrice() {
            return this.totalRoomPrice;
        }

        public static final class Builder {
            private String bedDesc; 
            private BtripHotelCancelPolicyDTO btripHotelCancelPolicyDTO; 
            private String earliestCheckInTime; 
            private String latestCheckOutTime; 
            private Integer maxBookingNum; 
            private Integer maxOccupancyNum; 
            private Boolean needCertificate; 
            private Boolean needEmail; 
            private Boolean needEnglishName; 
            private Long totalOrderPrice; 
            private Long totalRoomPrice; 

            private Builder() {
            } 

            private Builder(RatePlanInfo model) {
                this.bedDesc = model.bedDesc;
                this.btripHotelCancelPolicyDTO = model.btripHotelCancelPolicyDTO;
                this.earliestCheckInTime = model.earliestCheckInTime;
                this.latestCheckOutTime = model.latestCheckOutTime;
                this.maxBookingNum = model.maxBookingNum;
                this.maxOccupancyNum = model.maxOccupancyNum;
                this.needCertificate = model.needCertificate;
                this.needEmail = model.needEmail;
                this.needEnglishName = model.needEnglishName;
                this.totalOrderPrice = model.totalOrderPrice;
                this.totalRoomPrice = model.totalRoomPrice;
            } 

            /**
             * bed_desc.
             */
            public Builder bedDesc(String bedDesc) {
                this.bedDesc = bedDesc;
                return this;
            }

            /**
             * btrip_hotel_cancel_policy_d_t_o.
             */
            public Builder btripHotelCancelPolicyDTO(BtripHotelCancelPolicyDTO btripHotelCancelPolicyDTO) {
                this.btripHotelCancelPolicyDTO = btripHotelCancelPolicyDTO;
                return this;
            }

            /**
             * earliest_check_in_time.
             */
            public Builder earliestCheckInTime(String earliestCheckInTime) {
                this.earliestCheckInTime = earliestCheckInTime;
                return this;
            }

            /**
             * latest_check_out_time.
             */
            public Builder latestCheckOutTime(String latestCheckOutTime) {
                this.latestCheckOutTime = latestCheckOutTime;
                return this;
            }

            /**
             * max_booking_num.
             */
            public Builder maxBookingNum(Integer maxBookingNum) {
                this.maxBookingNum = maxBookingNum;
                return this;
            }

            /**
             * max_occupancy_num.
             */
            public Builder maxOccupancyNum(Integer maxOccupancyNum) {
                this.maxOccupancyNum = maxOccupancyNum;
                return this;
            }

            /**
             * need_certificate.
             */
            public Builder needCertificate(Boolean needCertificate) {
                this.needCertificate = needCertificate;
                return this;
            }

            /**
             * need_email.
             */
            public Builder needEmail(Boolean needEmail) {
                this.needEmail = needEmail;
                return this;
            }

            /**
             * need_english_name.
             */
            public Builder needEnglishName(Boolean needEnglishName) {
                this.needEnglishName = needEnglishName;
                return this;
            }

            /**
             * total_order_price.
             */
            public Builder totalOrderPrice(Long totalOrderPrice) {
                this.totalOrderPrice = totalOrderPrice;
                return this;
            }

            /**
             * total_room_price.
             */
            public Builder totalRoomPrice(Long totalRoomPrice) {
                this.totalRoomPrice = totalRoomPrice;
                return this;
            }

            public RatePlanInfo build() {
                return new RatePlanInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link HotelOrderPreValidateResponseBody} extends {@link TeaModel}
     *
     * <p>HotelOrderPreValidateResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("extend_info")
        private String extendInfo;

        @com.aliyun.core.annotation.NameInMap("item_invoice")
        private ItemInvoice itemInvoice;

        @com.aliyun.core.annotation.NameInMap("itinerary_no")
        private String itineraryNo;

        @com.aliyun.core.annotation.NameInMap("promotion_info")
        private PromotionInfo promotionInfo;

        @com.aliyun.core.annotation.NameInMap("rate_plan_daily")
        private java.util.List<RatePlanDaily> ratePlanDaily;

        @com.aliyun.core.annotation.NameInMap("rate_plan_id")
        private Long ratePlanId;

        @com.aliyun.core.annotation.NameInMap("rate_plan_info")
        private RatePlanInfo ratePlanInfo;

        @com.aliyun.core.annotation.NameInMap("validate_res_key")
        private String validateResKey;

        private Module(Builder builder) {
            this.extendInfo = builder.extendInfo;
            this.itemInvoice = builder.itemInvoice;
            this.itineraryNo = builder.itineraryNo;
            this.promotionInfo = builder.promotionInfo;
            this.ratePlanDaily = builder.ratePlanDaily;
            this.ratePlanId = builder.ratePlanId;
            this.ratePlanInfo = builder.ratePlanInfo;
            this.validateResKey = builder.validateResKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return extendInfo
         */
        public String getExtendInfo() {
            return this.extendInfo;
        }

        /**
         * @return itemInvoice
         */
        public ItemInvoice getItemInvoice() {
            return this.itemInvoice;
        }

        /**
         * @return itineraryNo
         */
        public String getItineraryNo() {
            return this.itineraryNo;
        }

        /**
         * @return promotionInfo
         */
        public PromotionInfo getPromotionInfo() {
            return this.promotionInfo;
        }

        /**
         * @return ratePlanDaily
         */
        public java.util.List<RatePlanDaily> getRatePlanDaily() {
            return this.ratePlanDaily;
        }

        /**
         * @return ratePlanId
         */
        public Long getRatePlanId() {
            return this.ratePlanId;
        }

        /**
         * @return ratePlanInfo
         */
        public RatePlanInfo getRatePlanInfo() {
            return this.ratePlanInfo;
        }

        /**
         * @return validateResKey
         */
        public String getValidateResKey() {
            return this.validateResKey;
        }

        public static final class Builder {
            private String extendInfo; 
            private ItemInvoice itemInvoice; 
            private String itineraryNo; 
            private PromotionInfo promotionInfo; 
            private java.util.List<RatePlanDaily> ratePlanDaily; 
            private Long ratePlanId; 
            private RatePlanInfo ratePlanInfo; 
            private String validateResKey; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.extendInfo = model.extendInfo;
                this.itemInvoice = model.itemInvoice;
                this.itineraryNo = model.itineraryNo;
                this.promotionInfo = model.promotionInfo;
                this.ratePlanDaily = model.ratePlanDaily;
                this.ratePlanId = model.ratePlanId;
                this.ratePlanInfo = model.ratePlanInfo;
                this.validateResKey = model.validateResKey;
            } 

            /**
             * extend_info.
             */
            public Builder extendInfo(String extendInfo) {
                this.extendInfo = extendInfo;
                return this;
            }

            /**
             * item_invoice.
             */
            public Builder itemInvoice(ItemInvoice itemInvoice) {
                this.itemInvoice = itemInvoice;
                return this;
            }

            /**
             * itinerary_no.
             */
            public Builder itineraryNo(String itineraryNo) {
                this.itineraryNo = itineraryNo;
                return this;
            }

            /**
             * promotion_info.
             */
            public Builder promotionInfo(PromotionInfo promotionInfo) {
                this.promotionInfo = promotionInfo;
                return this;
            }

            /**
             * rate_plan_daily.
             */
            public Builder ratePlanDaily(java.util.List<RatePlanDaily> ratePlanDaily) {
                this.ratePlanDaily = ratePlanDaily;
                return this;
            }

            /**
             * rate_plan_id.
             */
            public Builder ratePlanId(Long ratePlanId) {
                this.ratePlanId = ratePlanId;
                return this;
            }

            /**
             * rate_plan_info.
             */
            public Builder ratePlanInfo(RatePlanInfo ratePlanInfo) {
                this.ratePlanInfo = ratePlanInfo;
                return this;
            }

            /**
             * validate_res_key.
             */
            public Builder validateResKey(String validateResKey) {
                this.validateResKey = validateResKey;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
