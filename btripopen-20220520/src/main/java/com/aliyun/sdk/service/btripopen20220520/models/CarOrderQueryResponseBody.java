// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CarOrderQueryResponseBody} extends {@link TeaModel}
 *
 * <p>CarOrderQueryResponseBody</p>
 */
public class CarOrderQueryResponseBody extends TeaModel {
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
        @NameInMap("business_category")
        private String businessCategory;

        @NameInMap("cancel_time")
        private Long cancelTime;

        @NameInMap("car_info")
        private String carInfo;

        @NameInMap("car_level")
        private Integer carLevel;

        @NameInMap("driver_confirm_time")
        private Long driverConfirmTime;

        @NameInMap("estimate_price")
        private Long estimatePrice;

        @NameInMap("from_address")
        private String fromAddress;

        @NameInMap("from_city_name")
        private String fromCityName;

        @NameInMap("is_special")
        private Boolean isSpecial;

        @NameInMap("memo")
        private String memo;

        @NameInMap("pay_time")
        private Long payTime;

        @NameInMap("publish_time")
        private Long publishTime;

        @NameInMap("real_from_address")
        private String realFromAddress;

        @NameInMap("real_from_city_name")
        private String realFromCityName;

        @NameInMap("real_to_address")
        private String realToAddress;

        @NameInMap("real_to_city_name")
        private String realToCityName;

        @NameInMap("service_type")
        private Integer serviceType;

        @NameInMap("special_types")
        private String specialTypes;

        @NameInMap("taken_time")
        private Long takenTime;

        @NameInMap("to_address")
        private String toAddress;

        @NameInMap("to_city_name")
        private String toCityName;

        @NameInMap("travel_distance")
        private String travelDistance;

        private CarInfo(Builder builder) {
            this.businessCategory = builder.businessCategory;
            this.cancelTime = builder.cancelTime;
            this.carInfo = builder.carInfo;
            this.carLevel = builder.carLevel;
            this.driverConfirmTime = builder.driverConfirmTime;
            this.estimatePrice = builder.estimatePrice;
            this.fromAddress = builder.fromAddress;
            this.fromCityName = builder.fromCityName;
            this.isSpecial = builder.isSpecial;
            this.memo = builder.memo;
            this.payTime = builder.payTime;
            this.publishTime = builder.publishTime;
            this.realFromAddress = builder.realFromAddress;
            this.realFromCityName = builder.realFromCityName;
            this.realToAddress = builder.realToAddress;
            this.realToCityName = builder.realToCityName;
            this.serviceType = builder.serviceType;
            this.specialTypes = builder.specialTypes;
            this.takenTime = builder.takenTime;
            this.toAddress = builder.toAddress;
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
         * @return driverConfirmTime
         */
        public Long getDriverConfirmTime() {
            return this.driverConfirmTime;
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
            private Long driverConfirmTime; 
            private Long estimatePrice; 
            private String fromAddress; 
            private String fromCityName; 
            private Boolean isSpecial; 
            private String memo; 
            private Long payTime; 
            private Long publishTime; 
            private String realFromAddress; 
            private String realFromCityName; 
            private String realToAddress; 
            private String realToCityName; 
            private Integer serviceType; 
            private String specialTypes; 
            private Long takenTime; 
            private String toAddress; 
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
             * driver_confirm_time.
             */
            public Builder driverConfirmTime(Long driverConfirmTime) {
                this.driverConfirmTime = driverConfirmTime;
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
        @NameInMap("id")
        private Long id;

        @NameInMap("title")
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
             * 发票id
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * 发票抬头
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
        @NameInMap("apply_id")
        private String applyId;

        @NameInMap("btrip_cause")
        private String btripCause;

        @NameInMap("btrip_title")
        private String btripTitle;

        @NameInMap("corp_id")
        private String corpId;

        @NameInMap("corp_name")
        private String corpName;

        @NameInMap("depart_id")
        private String departId;

        @NameInMap("depart_name")
        private String departName;

        @NameInMap("gmt_create")
        private Long gmtCreate;

        @NameInMap("gmt_modified")
        private Long gmtModified;

        @NameInMap("itinerary_id")
        private String itineraryId;

        @NameInMap("order_id")
        private Long orderId;

        @NameInMap("order_status")
        private Integer orderStatus;

        @NameInMap("sub_order_id")
        private Long subOrderId;

        @NameInMap("third_depart_id")
        private String thirdDepartId;

        @NameInMap("thirdpart_apply_id")
        private String thirdpartApplyId;

        @NameInMap("thirdpart_itinerary_id")
        private String thirdpartItineraryId;

        @NameInMap("user_id")
        private String userId;

        @NameInMap("user_name")
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
            private String thirdpartItineraryId; 
            private String userId; 
            private String userName; 

            /**
             * 申请单id
             */
            public Builder applyId(String applyId) {
                this.applyId = applyId;
                return this;
            }

            /**
             * 申请单-出行事由
             */
            public Builder btripCause(String btripCause) {
                this.btripCause = btripCause;
                return this;
            }

            /**
             * 申请单-出行标题
             */
            public Builder btripTitle(String btripTitle) {
                this.btripTitle = btripTitle;
                return this;
            }

            /**
             * 企业id
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * 企业名称
             */
            public Builder corpName(String corpName) {
                this.corpName = corpName;
                return this;
            }

            /**
             * 部门id
             */
            public Builder departId(String departId) {
                this.departId = departId;
                return this;
            }

            /**
             * 部门名称
             */
            public Builder departName(String departName) {
                this.departName = departName;
                return this;
            }

            /**
             * 订单创建时间
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * 订单更新时间
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * 行程单id
             */
            public Builder itineraryId(String itineraryId) {
                this.itineraryId = itineraryId;
                return this;
            }

            /**
             * 订单id
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * 订单状态 0: 初始化状态 1: 已超时 2: 派单成功 3: 派单失败 4: 已退款 5: 已支付 6: 已取消
             */
            public Builder orderStatus(Integer orderStatus) {
                this.orderStatus = orderStatus;
                return this;
            }

            /**
             * 子订单id
             */
            public Builder subOrderId(Long subOrderId) {
                this.subOrderId = subOrderId;
                return this;
            }

            /**
             * 三方部门id
             */
            public Builder thirdDepartId(String thirdDepartId) {
                this.thirdDepartId = thirdDepartId;
                return this;
            }

            /**
             * 三方申请单id
             */
            public Builder thirdpartApplyId(String thirdpartApplyId) {
                this.thirdpartApplyId = thirdpartApplyId;
                return this;
            }

            /**
             * 三方行程单id
             */
            public Builder thirdpartItineraryId(String thirdpartItineraryId) {
                this.thirdpartItineraryId = thirdpartItineraryId;
                return this;
            }

            /**
             * 预订人id
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * 预订人姓名
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
        @NameInMap("cost_center_id")
        private Long costCenterId;

        @NameInMap("cost_center_name")
        private String costCenterName;

        @NameInMap("cost_center_number")
        private String costCenterNumber;

        @NameInMap("project_code")
        private String projectCode;

        @NameInMap("project_id")
        private Long projectId;

        @NameInMap("project_title")
        private String projectTitle;

        @NameInMap("thirdpart_cost_center_id")
        private String thirdpartCostCenterId;

        @NameInMap("thirdpart_project_id")
        private String thirdpartProjectId;

        @NameInMap("user_id")
        private String userId;

        @NameInMap("user_name")
        private String userName;

        @NameInMap("user_type")
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
             * 成本中心id
             */
            public Builder costCenterId(Long costCenterId) {
                this.costCenterId = costCenterId;
                return this;
            }

            /**
             * 成本中心名称
             */
            public Builder costCenterName(String costCenterName) {
                this.costCenterName = costCenterName;
                return this;
            }

            /**
             * 成本中心编码
             */
            public Builder costCenterNumber(String costCenterNumber) {
                this.costCenterNumber = costCenterNumber;
                return this;
            }

            /**
             * 项目编码
             */
            public Builder projectCode(String projectCode) {
                this.projectCode = projectCode;
                return this;
            }

            /**
             * 项目id
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * 项目名称
             */
            public Builder projectTitle(String projectTitle) {
                this.projectTitle = projectTitle;
                return this;
            }

            /**
             * 第三方成本中心id
             */
            public Builder thirdpartCostCenterId(String thirdpartCostCenterId) {
                this.thirdpartCostCenterId = thirdpartCostCenterId;
                return this;
            }

            /**
             * 三方项目id
             */
            public Builder thirdpartProjectId(String thirdpartProjectId) {
                this.thirdpartProjectId = thirdpartProjectId;
                return this;
            }

            /**
             * 出行人dingId
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * 出行人姓名
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * 出行人类型 0:内部/1:外部
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
        @NameInMap("category_code")
        private Integer categoryCode;

        @NameInMap("gmt_create")
        private Long gmtCreate;

        @NameInMap("pay_type")
        private Integer payType;

        @NameInMap("person_price")
        private Long personPrice;

        @NameInMap("price")
        private Long price;

        @NameInMap("trade_id")
        private String tradeId;

        @NameInMap("type")
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
             * 交易类目编码
             */
            public Builder categoryCode(Integer categoryCode) {
                this.categoryCode = categoryCode;
                return this;
            }

            /**
             * 订单创建时间
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
        @NameInMap("car_info")
        private CarInfo carInfo;

        @NameInMap("invoice_info")
        private InvoiceInfo invoiceInfo;

        @NameInMap("order_base_info")
        private OrderBaseInfo orderBaseInfo;

        @NameInMap("passenger_list")
        private java.util.List < PassengerList> passengerList;

        @NameInMap("price_info_list")
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
