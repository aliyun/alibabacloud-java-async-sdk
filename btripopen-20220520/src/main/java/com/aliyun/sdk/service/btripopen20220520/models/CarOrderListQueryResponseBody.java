// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CarOrderListQueryResponseBody} extends {@link TeaModel}
 *
 * <p>CarOrderListQueryResponseBody</p>
 */
public class CarOrderListQueryResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("message")
    private String message;

    @NameInMap("module")
    private java.util.List < Module> module;

    @NameInMap("page_info")
    private PageInfo pageInfo;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("traceId")
    private String traceId;

    private CarOrderListQueryResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CarOrderListQueryResponseBody create() {
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
    public java.util.List < Module> getModule() {
        return this.module;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
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
        private java.util.List < Module> module; 
        private PageInfo pageInfo; 
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
        public Builder module(java.util.List < Module> module) {
            this.module = module;
            return this;
        }

        /**
         * page_info.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
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
         * traceId
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public CarOrderListQueryResponseBody build() {
            return new CarOrderListQueryResponseBody(this);
        } 

    } 

    public static class PriceInfoList extends TeaModel {
        @NameInMap("category_code")
        private Integer categoryCode;

        @NameInMap("category_type")
        private Integer categoryType;

        @NameInMap("gmt_create")
        private String gmtCreate;

        @NameInMap("passenger_name")
        private String passengerName;

        @NameInMap("pay_type")
        private Integer payType;

        @NameInMap("person_price")
        private Double personPrice;

        @NameInMap("price")
        private Double price;

        @NameInMap("trade_id")
        private String tradeId;

        @NameInMap("type")
        private Integer type;

        private PriceInfoList(Builder builder) {
            this.categoryCode = builder.categoryCode;
            this.categoryType = builder.categoryType;
            this.gmtCreate = builder.gmtCreate;
            this.passengerName = builder.passengerName;
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
         * @return categoryType
         */
        public Integer getCategoryType() {
            return this.categoryType;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return passengerName
         */
        public String getPassengerName() {
            return this.passengerName;
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
        public Double getPersonPrice() {
            return this.personPrice;
        }

        /**
         * @return price
         */
        public Double getPrice() {
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
            private Integer categoryType; 
            private String gmtCreate; 
            private String passengerName; 
            private Integer payType; 
            private Double personPrice; 
            private Double price; 
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
             * category_type.
             */
            public Builder categoryType(Integer categoryType) {
                this.categoryType = categoryType;
                return this;
            }

            /**
             * gmt_create.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * passenger_name.
             */
            public Builder passengerName(String passengerName) {
                this.passengerName = passengerName;
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
            public Builder personPrice(Double personPrice) {
                this.personPrice = personPrice;
                return this;
            }

            /**
             * price.
             */
            public Builder price(Double price) {
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
    public static class UserAffiliateList extends TeaModel {
        @NameInMap("user_id")
        private String userId;

        @NameInMap("user_name")
        private String userName;

        private UserAffiliateList(Builder builder) {
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserAffiliateList create() {
            return builder().build();
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
            private String userId; 
            private String userName; 

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

            public UserAffiliateList build() {
                return new UserAffiliateList(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @NameInMap("apply_id")
        private Long applyId;

        @NameInMap("apply_show_id")
        private String applyShowId;

        @NameInMap("btrip_title")
        private String btripTitle;

        @NameInMap("business_category")
        private String businessCategory;

        @NameInMap("cancel_time")
        private String cancelTime;

        @NameInMap("car_info")
        private String carInfo;

        @NameInMap("car_level")
        private Integer carLevel;

        @NameInMap("corp_id")
        private String corpId;

        @NameInMap("corp_name")
        private String corpName;

        @NameInMap("cost_center_id")
        private Long costCenterId;

        @NameInMap("cost_center_name")
        private String costCenterName;

        @NameInMap("cost_center_number")
        private String costCenterNumber;

        @NameInMap("dept_id")
        private Long deptId;

        @NameInMap("dept_name")
        private String deptName;

        @NameInMap("driver_confirm_time")
        private String driverConfirmTime;

        @NameInMap("estimate_price")
        private Double estimatePrice;

        @NameInMap("from_address")
        private String fromAddress;

        @NameInMap("from_city_ad_code")
        private String fromCityAdCode;

        @NameInMap("from_city_name")
        private String fromCityName;

        @NameInMap("gmt_create")
        private String gmtCreate;

        @NameInMap("gmt_modified")
        private String gmtModified;

        @NameInMap("id")
        private Long id;

        @NameInMap("invoice_id")
        private Long invoiceId;

        @NameInMap("invoice_title")
        private String invoiceTitle;

        @NameInMap("is_special")
        private Boolean isSpecial;

        @NameInMap("memo")
        private String memo;

        @NameInMap("order_status")
        private Integer orderStatus;

        @NameInMap("passenger_name")
        private String passengerName;

        @NameInMap("pay_time")
        private String payTime;

        @NameInMap("price_info_list")
        private java.util.List < PriceInfoList> priceInfoList;

        @NameInMap("project_code")
        private String projectCode;

        @NameInMap("project_id")
        private Long projectId;

        @NameInMap("project_title")
        private String projectTitle;

        @NameInMap("provider")
        private Integer provider;

        @NameInMap("publish_time")
        private String publishTime;

        @NameInMap("real_from_address")
        private String realFromAddress;

        @NameInMap("real_from_city_ad_code")
        private String realFromCityAdCode;

        @NameInMap("real_from_city_name")
        private String realFromCityName;

        @NameInMap("real_to_address")
        private String realToAddress;

        @NameInMap("real_to_city_ad_code")
        private String realToCityAdCode;

        @NameInMap("real_to_city_name")
        private String realToCityName;

        @NameInMap("service_type")
        private Integer serviceType;

        @NameInMap("special_types")
        private java.util.List < String > specialTypes;

        @NameInMap("taken_time")
        private String takenTime;

        @NameInMap("thirdpart_apply_id")
        private String thirdpartApplyId;

        @NameInMap("thirdpart_itinerary_id")
        private String thirdpartItineraryId;

        @NameInMap("to_address")
        private String toAddress;

        @NameInMap("to_city_ad_code")
        private String toCityAdCode;

        @NameInMap("to_city_name")
        private String toCityName;

        @NameInMap("travel_distance")
        private Double travelDistance;

        @NameInMap("user_affiliate_list")
        private java.util.List < UserAffiliateList> userAffiliateList;

        @NameInMap("user_confirm")
        private Integer userConfirm;

        @NameInMap("user_id")
        private String userId;

        @NameInMap("user_name")
        private String userName;

        private Module(Builder builder) {
            this.applyId = builder.applyId;
            this.applyShowId = builder.applyShowId;
            this.btripTitle = builder.btripTitle;
            this.businessCategory = builder.businessCategory;
            this.cancelTime = builder.cancelTime;
            this.carInfo = builder.carInfo;
            this.carLevel = builder.carLevel;
            this.corpId = builder.corpId;
            this.corpName = builder.corpName;
            this.costCenterId = builder.costCenterId;
            this.costCenterName = builder.costCenterName;
            this.costCenterNumber = builder.costCenterNumber;
            this.deptId = builder.deptId;
            this.deptName = builder.deptName;
            this.driverConfirmTime = builder.driverConfirmTime;
            this.estimatePrice = builder.estimatePrice;
            this.fromAddress = builder.fromAddress;
            this.fromCityAdCode = builder.fromCityAdCode;
            this.fromCityName = builder.fromCityName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.invoiceId = builder.invoiceId;
            this.invoiceTitle = builder.invoiceTitle;
            this.isSpecial = builder.isSpecial;
            this.memo = builder.memo;
            this.orderStatus = builder.orderStatus;
            this.passengerName = builder.passengerName;
            this.payTime = builder.payTime;
            this.priceInfoList = builder.priceInfoList;
            this.projectCode = builder.projectCode;
            this.projectId = builder.projectId;
            this.projectTitle = builder.projectTitle;
            this.provider = builder.provider;
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
            this.thirdpartApplyId = builder.thirdpartApplyId;
            this.thirdpartItineraryId = builder.thirdpartItineraryId;
            this.toAddress = builder.toAddress;
            this.toCityAdCode = builder.toCityAdCode;
            this.toCityName = builder.toCityName;
            this.travelDistance = builder.travelDistance;
            this.userAffiliateList = builder.userAffiliateList;
            this.userConfirm = builder.userConfirm;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return applyId
         */
        public Long getApplyId() {
            return this.applyId;
        }

        /**
         * @return applyShowId
         */
        public String getApplyShowId() {
            return this.applyShowId;
        }

        /**
         * @return btripTitle
         */
        public String getBtripTitle() {
            return this.btripTitle;
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
        public String getCancelTime() {
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
         * @return deptId
         */
        public Long getDeptId() {
            return this.deptId;
        }

        /**
         * @return deptName
         */
        public String getDeptName() {
            return this.deptName;
        }

        /**
         * @return driverConfirmTime
         */
        public String getDriverConfirmTime() {
            return this.driverConfirmTime;
        }

        /**
         * @return estimatePrice
         */
        public Double getEstimatePrice() {
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
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return invoiceId
         */
        public Long getInvoiceId() {
            return this.invoiceId;
        }

        /**
         * @return invoiceTitle
         */
        public String getInvoiceTitle() {
            return this.invoiceTitle;
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
         * @return orderStatus
         */
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        /**
         * @return passengerName
         */
        public String getPassengerName() {
            return this.passengerName;
        }

        /**
         * @return payTime
         */
        public String getPayTime() {
            return this.payTime;
        }

        /**
         * @return priceInfoList
         */
        public java.util.List < PriceInfoList> getPriceInfoList() {
            return this.priceInfoList;
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
         * @return provider
         */
        public Integer getProvider() {
            return this.provider;
        }

        /**
         * @return publishTime
         */
        public String getPublishTime() {
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
        public java.util.List < String > getSpecialTypes() {
            return this.specialTypes;
        }

        /**
         * @return takenTime
         */
        public String getTakenTime() {
            return this.takenTime;
        }

        /**
         * @return thirdpartApplyId
         */
        public String getThirdpartApplyId() {
            return this.thirdpartApplyId;
        }

        /**
         * @return thirdpartItineraryId
         */
        public String getThirdpartItineraryId() {
            return this.thirdpartItineraryId;
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
        public Double getTravelDistance() {
            return this.travelDistance;
        }

        /**
         * @return userAffiliateList
         */
        public java.util.List < UserAffiliateList> getUserAffiliateList() {
            return this.userAffiliateList;
        }

        /**
         * @return userConfirm
         */
        public Integer getUserConfirm() {
            return this.userConfirm;
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
            private Long applyId; 
            private String applyShowId; 
            private String btripTitle; 
            private String businessCategory; 
            private String cancelTime; 
            private String carInfo; 
            private Integer carLevel; 
            private String corpId; 
            private String corpName; 
            private Long costCenterId; 
            private String costCenterName; 
            private String costCenterNumber; 
            private Long deptId; 
            private String deptName; 
            private String driverConfirmTime; 
            private Double estimatePrice; 
            private String fromAddress; 
            private String fromCityAdCode; 
            private String fromCityName; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private Long invoiceId; 
            private String invoiceTitle; 
            private Boolean isSpecial; 
            private String memo; 
            private Integer orderStatus; 
            private String passengerName; 
            private String payTime; 
            private java.util.List < PriceInfoList> priceInfoList; 
            private String projectCode; 
            private Long projectId; 
            private String projectTitle; 
            private Integer provider; 
            private String publishTime; 
            private String realFromAddress; 
            private String realFromCityAdCode; 
            private String realFromCityName; 
            private String realToAddress; 
            private String realToCityAdCode; 
            private String realToCityName; 
            private Integer serviceType; 
            private java.util.List < String > specialTypes; 
            private String takenTime; 
            private String thirdpartApplyId; 
            private String thirdpartItineraryId; 
            private String toAddress; 
            private String toCityAdCode; 
            private String toCityName; 
            private Double travelDistance; 
            private java.util.List < UserAffiliateList> userAffiliateList; 
            private Integer userConfirm; 
            private String userId; 
            private String userName; 

            /**
             * apply_id.
             */
            public Builder applyId(Long applyId) {
                this.applyId = applyId;
                return this;
            }

            /**
             * apply_show_id.
             */
            public Builder applyShowId(String applyShowId) {
                this.applyShowId = applyShowId;
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
             * business_category.
             */
            public Builder businessCategory(String businessCategory) {
                this.businessCategory = businessCategory;
                return this;
            }

            /**
             * cancel_time.
             */
            public Builder cancelTime(String cancelTime) {
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
             * dept_id.
             */
            public Builder deptId(Long deptId) {
                this.deptId = deptId;
                return this;
            }

            /**
             * dept_name.
             */
            public Builder deptName(String deptName) {
                this.deptName = deptName;
                return this;
            }

            /**
             * driver_confirm_time.
             */
            public Builder driverConfirmTime(String driverConfirmTime) {
                this.driverConfirmTime = driverConfirmTime;
                return this;
            }

            /**
             * estimate_price.
             */
            public Builder estimatePrice(Double estimatePrice) {
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
             * gmt_create.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmt_modified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * invoice_id.
             */
            public Builder invoiceId(Long invoiceId) {
                this.invoiceId = invoiceId;
                return this;
            }

            /**
             * invoice_title.
             */
            public Builder invoiceTitle(String invoiceTitle) {
                this.invoiceTitle = invoiceTitle;
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
             * order_status.
             */
            public Builder orderStatus(Integer orderStatus) {
                this.orderStatus = orderStatus;
                return this;
            }

            /**
             * passenger_name.
             */
            public Builder passengerName(String passengerName) {
                this.passengerName = passengerName;
                return this;
            }

            /**
             * pay_time.
             */
            public Builder payTime(String payTime) {
                this.payTime = payTime;
                return this;
            }

            /**
             * price_info_list.
             */
            public Builder priceInfoList(java.util.List < PriceInfoList> priceInfoList) {
                this.priceInfoList = priceInfoList;
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
             * provider.
             */
            public Builder provider(Integer provider) {
                this.provider = provider;
                return this;
            }

            /**
             * publish_time.
             */
            public Builder publishTime(String publishTime) {
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
            public Builder specialTypes(java.util.List < String > specialTypes) {
                this.specialTypes = specialTypes;
                return this;
            }

            /**
             * taken_time.
             */
            public Builder takenTime(String takenTime) {
                this.takenTime = takenTime;
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
             * thirdpart_itinerary_id.
             */
            public Builder thirdpartItineraryId(String thirdpartItineraryId) {
                this.thirdpartItineraryId = thirdpartItineraryId;
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
            public Builder travelDistance(Double travelDistance) {
                this.travelDistance = travelDistance;
                return this;
            }

            /**
             * user_affiliate_list.
             */
            public Builder userAffiliateList(java.util.List < UserAffiliateList> userAffiliateList) {
                this.userAffiliateList = userAffiliateList;
                return this;
            }

            /**
             * user_confirm.
             */
            public Builder userConfirm(Integer userConfirm) {
                this.userConfirm = userConfirm;
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

            public Module build() {
                return new Module(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @NameInMap("page")
        private Integer page;

        @NameInMap("page_size")
        private Integer pageSize;

        @NameInMap("total_number")
        private Integer totalNumber;

        private PageInfo(Builder builder) {
            this.page = builder.page;
            this.pageSize = builder.pageSize;
            this.totalNumber = builder.totalNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return page
         */
        public Integer getPage() {
            return this.page;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalNumber
         */
        public Integer getTotalNumber() {
            return this.totalNumber;
        }

        public static final class Builder {
            private Integer page; 
            private Integer pageSize; 
            private Integer totalNumber; 

            /**
             * page.
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * page_size.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * total_number.
             */
            public Builder totalNumber(Integer totalNumber) {
                this.totalNumber = totalNumber;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
