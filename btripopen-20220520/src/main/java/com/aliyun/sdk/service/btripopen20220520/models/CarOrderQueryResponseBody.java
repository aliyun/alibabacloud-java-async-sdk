// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CarOrderQueryResponseBody} extends {@link TeaModel}
 *
 * <p>CarOrderQueryResponseBody</p>
 */
public class CarOrderQueryResponseBody extends TeaModel {
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

    private CarOrderQueryResponseBody(Builder builder) {
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

    public static CarOrderQueryResponseBody create() {
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
         * requestId
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
         * traceId
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public CarOrderQueryResponseBody build() {
            return new CarOrderQueryResponseBody(this);
        } 

    } 

    public static class CarInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("business_category")
        private String businessCategory;

        @com.aliyun.core.annotation.NameInMap("cancel_time")
        private Long cancelTime;

        @com.aliyun.core.annotation.NameInMap("car_info")
        private String carInfo;

        @com.aliyun.core.annotation.NameInMap("car_level")
        private Integer carLevel;

        @com.aliyun.core.annotation.NameInMap("driver_card")
        private String driverCard;

        @com.aliyun.core.annotation.NameInMap("driver_confirm_time")
        private Long driverConfirmTime;

        @com.aliyun.core.annotation.NameInMap("driver_name")
        private String driverName;

        @com.aliyun.core.annotation.NameInMap("estimate_price")
        private Long estimatePrice;

        @com.aliyun.core.annotation.NameInMap("from_address")
        private String fromAddress;

        @com.aliyun.core.annotation.NameInMap("from_city_ad_code")
        private String fromCityAdCode;

        @com.aliyun.core.annotation.NameInMap("from_city_name")
        private String fromCityName;

        @com.aliyun.core.annotation.NameInMap("is_special")
        private Boolean isSpecial;

        @com.aliyun.core.annotation.NameInMap("memo")
        private String memo;

        @com.aliyun.core.annotation.NameInMap("pay_time")
        private Long payTime;

        @com.aliyun.core.annotation.NameInMap("publish_time")
        private Long publishTime;

        @com.aliyun.core.annotation.NameInMap("real_from_address")
        private String realFromAddress;

        @com.aliyun.core.annotation.NameInMap("real_from_city_ad_code")
        private String realFromCityAdCode;

        @com.aliyun.core.annotation.NameInMap("real_from_city_name")
        private String realFromCityName;

        @com.aliyun.core.annotation.NameInMap("real_to_address")
        private String realToAddress;

        @com.aliyun.core.annotation.NameInMap("real_to_city_ad_code")
        private String realToCityAdCode;

        @com.aliyun.core.annotation.NameInMap("real_to_city_name")
        private String realToCityName;

        @com.aliyun.core.annotation.NameInMap("service_type")
        private Integer serviceType;

        @com.aliyun.core.annotation.NameInMap("special_types")
        private String specialTypes;

        @com.aliyun.core.annotation.NameInMap("taken_time")
        private Long takenTime;

        @com.aliyun.core.annotation.NameInMap("to_address")
        private String toAddress;

        @com.aliyun.core.annotation.NameInMap("to_city_ad_code")
        private String toCityAdCode;

        @com.aliyun.core.annotation.NameInMap("to_city_name")
        private String toCityName;

        @com.aliyun.core.annotation.NameInMap("travel_distance")
        private String travelDistance;

        private CarInfo(Builder builder) {
            this.businessCategory = builder.businessCategory;
            this.cancelTime = builder.cancelTime;
            this.carInfo = builder.carInfo;
            this.carLevel = builder.carLevel;
            this.driverCard = builder.driverCard;
            this.driverConfirmTime = builder.driverConfirmTime;
            this.driverName = builder.driverName;
            this.estimatePrice = builder.estimatePrice;
            this.fromAddress = builder.fromAddress;
            this.fromCityAdCode = builder.fromCityAdCode;
            this.fromCityName = builder.fromCityName;
            this.isSpecial = builder.isSpecial;
            this.memo = builder.memo;
            this.payTime = builder.payTime;
            this.publishTime = builder.publishTime;
            this.realFromAddress = builder.realFromAddress;
            this.realFromCityAdCode = builder.realFromCityAdCode;
            this.realFromCityName = builder.realFromCityName;
            this.realToAddress = builder.realToAddress;
            this.realToCityAdCode = builder.realToCityAdCode;
            this.realToCityName = builder.realToCityName;
            this.serviceType = builder.serviceType;
            this.specialTypes = builder.specialTypes;
            this.takenTime = builder.takenTime;
            this.toAddress = builder.toAddress;
            this.toCityAdCode = builder.toCityAdCode;
            this.toCityName = builder.toCityName;
            this.travelDistance = builder.travelDistance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CarInfo create() {
            return builder().build();
        }

        /**
         * @return businessCategory
         */
        public String getBusinessCategory() {
            return this.businessCategory;
        }

        /**
         * @return cancelTime
         */
        public Long getCancelTime() {
            return this.cancelTime;
        }

        /**
         * @return carInfo
         */
        public String getCarInfo() {
            return this.carInfo;
        }

        /**
         * @return carLevel
         */
        public Integer getCarLevel() {
            return this.carLevel;
        }

        /**
         * @return driverCard
         */
        public String getDriverCard() {
            return this.driverCard;
        }

        /**
         * @return driverConfirmTime
         */
        public Long getDriverConfirmTime() {
            return this.driverConfirmTime;
        }

        /**
         * @return driverName
         */
        public String getDriverName() {
            return this.driverName;
        }

        /**
         * @return estimatePrice
         */
        public Long getEstimatePrice() {
            return this.estimatePrice;
        }

        /**
         * @return fromAddress
         */
        public String getFromAddress() {
            return this.fromAddress;
        }

        /**
         * @return fromCityAdCode
         */
        public String getFromCityAdCode() {
            return this.fromCityAdCode;
        }

        /**
         * @return fromCityName
         */
        public String getFromCityName() {
            return this.fromCityName;
        }

        /**
         * @return isSpecial
         */
        public Boolean getIsSpecial() {
            return this.isSpecial;
        }

        /**
         * @return memo
         */
        public String getMemo() {
            return this.memo;
        }

        /**
         * @return payTime
         */
        public Long getPayTime() {
            return this.payTime;
        }

        /**
         * @return publishTime
         */
        public Long getPublishTime() {
            return this.publishTime;
        }

        /**
         * @return realFromAddress
         */
        public String getRealFromAddress() {
            return this.realFromAddress;
        }

        /**
         * @return realFromCityAdCode
         */
        public String getRealFromCityAdCode() {
            return this.realFromCityAdCode;
        }

        /**
         * @return realFromCityName
         */
        public String getRealFromCityName() {
            return this.realFromCityName;
        }

        /**
         * @return realToAddress
         */
        public String getRealToAddress() {
            return this.realToAddress;
        }

        /**
         * @return realToCityAdCode
         */
        public String getRealToCityAdCode() {
            return this.realToCityAdCode;
        }

        /**
         * @return realToCityName
         */
        public String getRealToCityName() {
            return this.realToCityName;
        }

        /**
         * @return serviceType
         */
        public Integer getServiceType() {
            return this.serviceType;
        }

        /**
         * @return specialTypes
         */
        public String getSpecialTypes() {
            return this.specialTypes;
        }

        /**
         * @return takenTime
         */
        public Long getTakenTime() {
            return this.takenTime;
        }

        /**
         * @return toAddress
         */
        public String getToAddress() {
            return this.toAddress;
        }

        /**
         * @return toCityAdCode
         */
        public String getToCityAdCode() {
            return this.toCityAdCode;
        }

        /**
         * @return toCityName
         */
        public String getToCityName() {
            return this.toCityName;
        }

        /**
         * @return travelDistance
         */
        public String getTravelDistance() {
            return this.travelDistance;
        }

        public static final class Builder {
            private String businessCategory; 
            private Long cancelTime; 
            private String carInfo; 
            private Integer carLevel; 
            private String driverCard; 
            private Long driverConfirmTime; 
            private String driverName; 
            private Long estimatePrice; 
            private String fromAddress; 
            private String fromCityAdCode; 
            private String fromCityName; 
            private Boolean isSpecial; 
            private String memo; 
            private Long payTime; 
            private Long publishTime; 
            private String realFromAddress; 
            private String realFromCityAdCode; 
            private String realFromCityName; 
            private String realToAddress; 
            private String realToCityAdCode; 
            private String realToCityName; 
            private Integer serviceType; 
            private String specialTypes; 
            private Long takenTime; 
            private String toAddress; 
            private String toCityAdCode; 
            private String toCityName; 
            private String travelDistance; 

            /**
             * business_category.
             */
            public Builder businessCategory(String businessCategory) {
                this.businessCategory = businessCategory;
                return this;
            }

            /**
             * cancel_time.
             */
            public Builder cancelTime(Long cancelTime) {
                this.cancelTime = cancelTime;
                return this;
            }

            /**
             * car_info.
             */
            public Builder carInfo(String carInfo) {
                this.carInfo = carInfo;
                return this;
            }

            /**
             * car_level.
             */
            public Builder carLevel(Integer carLevel) {
                this.carLevel = carLevel;
                return this;
            }

            /**
             * driver_card.
             */
            public Builder driverCard(String driverCard) {
                this.driverCard = driverCard;
                return this;
            }

            /**
             * driver_confirm_time.
             */
            public Builder driverConfirmTime(Long driverConfirmTime) {
                this.driverConfirmTime = driverConfirmTime;
                return this;
            }

            /**
             * driver_name.
             */
            public Builder driverName(String driverName) {
                this.driverName = driverName;
                return this;
            }

            /**
             * estimate_price.
             */
            public Builder estimatePrice(Long estimatePrice) {
                this.estimatePrice = estimatePrice;
                return this;
            }

            /**
             * from_address.
             */
            public Builder fromAddress(String fromAddress) {
                this.fromAddress = fromAddress;
                return this;
            }

            /**
             * from_city_ad_code.
             */
            public Builder fromCityAdCode(String fromCityAdCode) {
                this.fromCityAdCode = fromCityAdCode;
                return this;
            }

            /**
             * from_city_name.
             */
            public Builder fromCityName(String fromCityName) {
                this.fromCityName = fromCityName;
                return this;
            }

            /**
             * is_special.
             */
            public Builder isSpecial(Boolean isSpecial) {
                this.isSpecial = isSpecial;
                return this;
            }

            /**
             * memo.
             */
            public Builder memo(String memo) {
                this.memo = memo;
                return this;
            }

            /**
             * pay_time.
             */
            public Builder payTime(Long payTime) {
                this.payTime = payTime;
                return this;
            }

            /**
             * publish_time.
             */
            public Builder publishTime(Long publishTime) {
                this.publishTime = publishTime;
                return this;
            }

            /**
             * real_from_address.
             */
            public Builder realFromAddress(String realFromAddress) {
                this.realFromAddress = realFromAddress;
                return this;
            }

            /**
             * real_from_city_ad_code.
             */
            public Builder realFromCityAdCode(String realFromCityAdCode) {
                this.realFromCityAdCode = realFromCityAdCode;
                return this;
            }

            /**
             * real_from_city_name.
             */
            public Builder realFromCityName(String realFromCityName) {
                this.realFromCityName = realFromCityName;
                return this;
            }

            /**
             * real_to_address.
             */
            public Builder realToAddress(String realToAddress) {
                this.realToAddress = realToAddress;
                return this;
            }

            /**
             * real_to_city_ad_code.
             */
            public Builder realToCityAdCode(String realToCityAdCode) {
                this.realToCityAdCode = realToCityAdCode;
                return this;
            }

            /**
             * real_to_city_name.
             */
            public Builder realToCityName(String realToCityName) {
                this.realToCityName = realToCityName;
                return this;
            }

            /**
             * service_type.
             */
            public Builder serviceType(Integer serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * special_types.
             */
            public Builder specialTypes(String specialTypes) {
                this.specialTypes = specialTypes;
                return this;
            }

            /**
             * taken_time.
             */
            public Builder takenTime(Long takenTime) {
                this.takenTime = takenTime;
                return this;
            }

            /**
             * to_address.
             */
            public Builder toAddress(String toAddress) {
                this.toAddress = toAddress;
                return this;
            }

            /**
             * to_city_ad_code.
             */
            public Builder toCityAdCode(String toCityAdCode) {
                this.toCityAdCode = toCityAdCode;
                return this;
            }

            /**
             * to_city_name.
             */
            public Builder toCityName(String toCityName) {
                this.toCityName = toCityName;
                return this;
            }

            /**
             * travel_distance.
             */
            public Builder travelDistance(String travelDistance) {
                this.travelDistance = travelDistance;
                return this;
            }

            public CarInfo build() {
                return new CarInfo(this);
            } 

        } 

    }
    public static class InvoiceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private InvoiceInfo(Builder builder) {
            this.id = builder.id;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvoiceInfo create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Long id; 
            private String title; 

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public InvoiceInfo build() {
                return new InvoiceInfo(this);
            } 

        } 

    }
    public static class OrderBaseInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apply_id")
        private String applyId;

        @com.aliyun.core.annotation.NameInMap("btrip_cause")
        private String btripCause;

        @com.aliyun.core.annotation.NameInMap("btrip_title")
        private String btripTitle;

        @com.aliyun.core.annotation.NameInMap("corp_id")
        private String corpId;

        @com.aliyun.core.annotation.NameInMap("corp_name")
        private String corpName;

        @com.aliyun.core.annotation.NameInMap("depart_id")
        private String departId;

        @com.aliyun.core.annotation.NameInMap("depart_name")
        private String departName;

        @com.aliyun.core.annotation.NameInMap("gmt_create")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmt_modified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("itinerary_id")
        private String itineraryId;

        @com.aliyun.core.annotation.NameInMap("order_id")
        private Long orderId;

        @com.aliyun.core.annotation.NameInMap("order_status")
        private Integer orderStatus;

        @com.aliyun.core.annotation.NameInMap("sub_order_id")
        private Long subOrderId;

        @com.aliyun.core.annotation.NameInMap("third_depart_id")
        private String thirdDepartId;

        @com.aliyun.core.annotation.NameInMap("thirdpart_apply_id")
        private String thirdpartApplyId;

        @com.aliyun.core.annotation.NameInMap("thirdpart_business_id")
        private String thirdpartBusinessId;

        @com.aliyun.core.annotation.NameInMap("thirdpart_itinerary_id")
        private String thirdpartItineraryId;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("user_name")
        private String userName;

        private OrderBaseInfo(Builder builder) {
            this.applyId = builder.applyId;
            this.btripCause = builder.btripCause;
            this.btripTitle = builder.btripTitle;
            this.corpId = builder.corpId;
            this.corpName = builder.corpName;
            this.departId = builder.departId;
            this.departName = builder.departName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.itineraryId = builder.itineraryId;
            this.orderId = builder.orderId;
            this.orderStatus = builder.orderStatus;
            this.subOrderId = builder.subOrderId;
            this.thirdDepartId = builder.thirdDepartId;
            this.thirdpartApplyId = builder.thirdpartApplyId;
            this.thirdpartBusinessId = builder.thirdpartBusinessId;
            this.thirdpartItineraryId = builder.thirdpartItineraryId;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderBaseInfo create() {
            return builder().build();
        }

        /**
         * @return applyId
         */
        public String getApplyId() {
            return this.applyId;
        }

        /**
         * @return btripCause
         */
        public String getBtripCause() {
            return this.btripCause;
        }

        /**
         * @return btripTitle
         */
        public String getBtripTitle() {
            return this.btripTitle;
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return corpName
         */
        public String getCorpName() {
            return this.corpName;
        }

        /**
         * @return departId
         */
        public String getDepartId() {
            return this.departId;
        }

        /**
         * @return departName
         */
        public String getDepartName() {
            return this.departName;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return itineraryId
         */
        public String getItineraryId() {
            return this.itineraryId;
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
        }

        /**
         * @return orderStatus
         */
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        /**
         * @return subOrderId
         */
        public Long getSubOrderId() {
            return this.subOrderId;
        }

        /**
         * @return thirdDepartId
         */
        public String getThirdDepartId() {
            return this.thirdDepartId;
        }

        /**
         * @return thirdpartApplyId
         */
        public String getThirdpartApplyId() {
            return this.thirdpartApplyId;
        }

        /**
         * @return thirdpartBusinessId
         */
        public String getThirdpartBusinessId() {
            return this.thirdpartBusinessId;
        }

        /**
         * @return thirdpartItineraryId
         */
        public String getThirdpartItineraryId() {
            return this.thirdpartItineraryId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String applyId; 
            private String btripCause; 
            private String btripTitle; 
            private String corpId; 
            private String corpName; 
            private String departId; 
            private String departName; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String itineraryId; 
            private Long orderId; 
            private Integer orderStatus; 
            private Long subOrderId; 
            private String thirdDepartId; 
            private String thirdpartApplyId; 
            private String thirdpartBusinessId; 
            private String thirdpartItineraryId; 
            private String userId; 
            private String userName; 

            /**
             * apply_id.
             */
            public Builder applyId(String applyId) {
                this.applyId = applyId;
                return this;
            }

            /**
             * btrip_cause.
             */
            public Builder btripCause(String btripCause) {
                this.btripCause = btripCause;
                return this;
            }

            /**
             * btrip_title.
             */
            public Builder btripTitle(String btripTitle) {
                this.btripTitle = btripTitle;
                return this;
            }

            /**
             * corp_id.
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * corp_name.
             */
            public Builder corpName(String corpName) {
                this.corpName = corpName;
                return this;
            }

            /**
             * depart_id.
             */
            public Builder departId(String departId) {
                this.departId = departId;
                return this;
            }

            /**
             * depart_name.
             */
            public Builder departName(String departName) {
                this.departName = departName;
                return this;
            }

            /**
             * gmt_create.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmt_modified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * itinerary_id.
             */
            public Builder itineraryId(String itineraryId) {
                this.itineraryId = itineraryId;
                return this;
            }

            /**
             * order_id.
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * order_status.
             */
            public Builder orderStatus(Integer orderStatus) {
                this.orderStatus = orderStatus;
                return this;
            }

            /**
             * sub_order_id.
             */
            public Builder subOrderId(Long subOrderId) {
                this.subOrderId = subOrderId;
                return this;
            }

            /**
             * third_depart_id.
             */
            public Builder thirdDepartId(String thirdDepartId) {
                this.thirdDepartId = thirdDepartId;
                return this;
            }

            /**
             * thirdpart_apply_id.
             */
            public Builder thirdpartApplyId(String thirdpartApplyId) {
                this.thirdpartApplyId = thirdpartApplyId;
                return this;
            }

            /**
             * thirdpart_business_id.
             */
            public Builder thirdpartBusinessId(String thirdpartBusinessId) {
                this.thirdpartBusinessId = thirdpartBusinessId;
                return this;
            }

            /**
             * thirdpart_itinerary_id.
             */
            public Builder thirdpartItineraryId(String thirdpartItineraryId) {
                this.thirdpartItineraryId = thirdpartItineraryId;
                return this;
            }

            /**
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * user_name.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public OrderBaseInfo build() {
                return new OrderBaseInfo(this);
            } 

        } 

    }
    public static class PassengerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cost_center_id")
        private Long costCenterId;

        @com.aliyun.core.annotation.NameInMap("cost_center_name")
        private String costCenterName;

        @com.aliyun.core.annotation.NameInMap("cost_center_number")
        private String costCenterNumber;

        @com.aliyun.core.annotation.NameInMap("project_code")
        private String projectCode;

        @com.aliyun.core.annotation.NameInMap("project_id")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("project_title")
        private String projectTitle;

        @com.aliyun.core.annotation.NameInMap("thirdpart_cost_center_id")
        private String thirdpartCostCenterId;

        @com.aliyun.core.annotation.NameInMap("thirdpart_project_id")
        private String thirdpartProjectId;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("user_name")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("user_type")
        private Integer userType;

        private PassengerList(Builder builder) {
            this.costCenterId = builder.costCenterId;
            this.costCenterName = builder.costCenterName;
            this.costCenterNumber = builder.costCenterNumber;
            this.projectCode = builder.projectCode;
            this.projectId = builder.projectId;
            this.projectTitle = builder.projectTitle;
            this.thirdpartCostCenterId = builder.thirdpartCostCenterId;
            this.thirdpartProjectId = builder.thirdpartProjectId;
            this.userId = builder.userId;
            this.userName = builder.userName;
            this.userType = builder.userType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PassengerList create() {
            return builder().build();
        }

        /**
         * @return costCenterId
         */
        public Long getCostCenterId() {
            return this.costCenterId;
        }

        /**
         * @return costCenterName
         */
        public String getCostCenterName() {
            return this.costCenterName;
        }

        /**
         * @return costCenterNumber
         */
        public String getCostCenterNumber() {
            return this.costCenterNumber;
        }

        /**
         * @return projectCode
         */
        public String getProjectCode() {
            return this.projectCode;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectTitle
         */
        public String getProjectTitle() {
            return this.projectTitle;
        }

        /**
         * @return thirdpartCostCenterId
         */
        public String getThirdpartCostCenterId() {
            return this.thirdpartCostCenterId;
        }

        /**
         * @return thirdpartProjectId
         */
        public String getThirdpartProjectId() {
            return this.thirdpartProjectId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return userType
         */
        public Integer getUserType() {
            return this.userType;
        }

        public static final class Builder {
            private Long costCenterId; 
            private String costCenterName; 
            private String costCenterNumber; 
            private String projectCode; 
            private Long projectId; 
            private String projectTitle; 
            private String thirdpartCostCenterId; 
            private String thirdpartProjectId; 
            private String userId; 
            private String userName; 
            private Integer userType; 

            /**
             * cost_center_id.
             */
            public Builder costCenterId(Long costCenterId) {
                this.costCenterId = costCenterId;
                return this;
            }

            /**
             * cost_center_name.
             */
            public Builder costCenterName(String costCenterName) {
                this.costCenterName = costCenterName;
                return this;
            }

            /**
             * cost_center_number.
             */
            public Builder costCenterNumber(String costCenterNumber) {
                this.costCenterNumber = costCenterNumber;
                return this;
            }

            /**
             * project_code.
             */
            public Builder projectCode(String projectCode) {
                this.projectCode = projectCode;
                return this;
            }

            /**
             * project_id.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * project_title.
             */
            public Builder projectTitle(String projectTitle) {
                this.projectTitle = projectTitle;
                return this;
            }

            /**
             * thirdpart_cost_center_id.
             */
            public Builder thirdpartCostCenterId(String thirdpartCostCenterId) {
                this.thirdpartCostCenterId = thirdpartCostCenterId;
                return this;
            }

            /**
             * thirdpart_project_id.
             */
            public Builder thirdpartProjectId(String thirdpartProjectId) {
                this.thirdpartProjectId = thirdpartProjectId;
                return this;
            }

            /**
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * user_name.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * user_type.
             */
            public Builder userType(Integer userType) {
                this.userType = userType;
                return this;
            }

            public PassengerList build() {
                return new PassengerList(this);
            } 

        } 

    }
    public static class PriceInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("category_code")
        private Integer categoryCode;

        @com.aliyun.core.annotation.NameInMap("gmt_create")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("pay_type")
        private Integer payType;

        @com.aliyun.core.annotation.NameInMap("person_price")
        private Long personPrice;

        @com.aliyun.core.annotation.NameInMap("price")
        private Long price;

        @com.aliyun.core.annotation.NameInMap("trade_id")
        private String tradeId;

        @com.aliyun.core.annotation.NameInMap("type")
        private Integer type;

        private PriceInfoList(Builder builder) {
            this.categoryCode = builder.categoryCode;
            this.gmtCreate = builder.gmtCreate;
            this.payType = builder.payType;
            this.personPrice = builder.personPrice;
            this.price = builder.price;
            this.tradeId = builder.tradeId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceInfoList create() {
            return builder().build();
        }

        /**
         * @return categoryCode
         */
        public Integer getCategoryCode() {
            return this.categoryCode;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return payType
         */
        public Integer getPayType() {
            return this.payType;
        }

        /**
         * @return personPrice
         */
        public Long getPersonPrice() {
            return this.personPrice;
        }

        /**
         * @return price
         */
        public Long getPrice() {
            return this.price;
        }

        /**
         * @return tradeId
         */
        public String getTradeId() {
            return this.tradeId;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer categoryCode; 
            private Long gmtCreate; 
            private Integer payType; 
            private Long personPrice; 
            private Long price; 
            private String tradeId; 
            private Integer type; 

            /**
             * category_code.
             */
            public Builder categoryCode(Integer categoryCode) {
                this.categoryCode = categoryCode;
                return this;
            }

            /**
             * gmt_create.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * pay_type.
             */
            public Builder payType(Integer payType) {
                this.payType = payType;
                return this;
            }

            /**
             * person_price.
             */
            public Builder personPrice(Long personPrice) {
                this.personPrice = personPrice;
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
             * trade_id.
             */
            public Builder tradeId(String tradeId) {
                this.tradeId = tradeId;
                return this;
            }

            /**
             * type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public PriceInfoList build() {
                return new PriceInfoList(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("car_info")
        private CarInfo carInfo;

        @com.aliyun.core.annotation.NameInMap("invoice_info")
        private InvoiceInfo invoiceInfo;

        @com.aliyun.core.annotation.NameInMap("order_base_info")
        private OrderBaseInfo orderBaseInfo;

        @com.aliyun.core.annotation.NameInMap("passenger_list")
        private java.util.List < PassengerList> passengerList;

        @com.aliyun.core.annotation.NameInMap("price_info_list")
        private java.util.List < PriceInfoList> priceInfoList;

        private Module(Builder builder) {
            this.carInfo = builder.carInfo;
            this.invoiceInfo = builder.invoiceInfo;
            this.orderBaseInfo = builder.orderBaseInfo;
            this.passengerList = builder.passengerList;
            this.priceInfoList = builder.priceInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return carInfo
         */
        public CarInfo getCarInfo() {
            return this.carInfo;
        }

        /**
         * @return invoiceInfo
         */
        public InvoiceInfo getInvoiceInfo() {
            return this.invoiceInfo;
        }

        /**
         * @return orderBaseInfo
         */
        public OrderBaseInfo getOrderBaseInfo() {
            return this.orderBaseInfo;
        }

        /**
         * @return passengerList
         */
        public java.util.List < PassengerList> getPassengerList() {
            return this.passengerList;
        }

        /**
         * @return priceInfoList
         */
        public java.util.List < PriceInfoList> getPriceInfoList() {
            return this.priceInfoList;
        }

        public static final class Builder {
            private CarInfo carInfo; 
            private InvoiceInfo invoiceInfo; 
            private OrderBaseInfo orderBaseInfo; 
            private java.util.List < PassengerList> passengerList; 
            private java.util.List < PriceInfoList> priceInfoList; 

            /**
             * car_info.
             */
            public Builder carInfo(CarInfo carInfo) {
                this.carInfo = carInfo;
                return this;
            }

            /**
             * invoice_info.
             */
            public Builder invoiceInfo(InvoiceInfo invoiceInfo) {
                this.invoiceInfo = invoiceInfo;
                return this;
            }

            /**
             * order_base_info.
             */
            public Builder orderBaseInfo(OrderBaseInfo orderBaseInfo) {
                this.orderBaseInfo = orderBaseInfo;
                return this;
            }

            /**
             * passenger_list.
             */
            public Builder passengerList(java.util.List < PassengerList> passengerList) {
                this.passengerList = passengerList;
                return this;
            }

            /**
             * price_info_list.
             */
            public Builder priceInfoList(java.util.List < PriceInfoList> priceInfoList) {
                this.priceInfoList = priceInfoList;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
