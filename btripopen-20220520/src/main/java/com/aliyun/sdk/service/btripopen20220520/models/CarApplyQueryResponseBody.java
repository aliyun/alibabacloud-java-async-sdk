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
 * {@link CarApplyQueryResponseBody} extends {@link TeaModel}
 *
 * <p>CarApplyQueryResponseBody</p>
 */
public class CarApplyQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apply_list")
    private java.util.List<ApplyList> applyList;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private CarApplyQueryResponseBody(Builder builder) {
        this.applyList = builder.applyList;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CarApplyQueryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applyList
     */
    public java.util.List<ApplyList> getApplyList() {
        return this.applyList;
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
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private java.util.List<ApplyList> applyList; 
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(CarApplyQueryResponseBody model) {
            this.applyList = model.applyList;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
            this.traceId = model.traceId;
        } 

        /**
         * apply_list.
         */
        public Builder applyList(java.util.List<ApplyList> applyList) {
            this.applyList = applyList;
            return this;
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
         * total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        /**
         * traceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public CarApplyQueryResponseBody build() {
            return new CarApplyQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CarApplyQueryResponseBody} extends {@link TeaModel}
     *
     * <p>CarApplyQueryResponseBody</p>
     */
    public static class ApproverList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("note")
        private String note;

        @com.aliyun.core.annotation.NameInMap("operate_time")
        private String operateTime;

        @com.aliyun.core.annotation.NameInMap("order")
        private Integer order;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("status_desc")
        private String statusDesc;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("user_name")
        private String userName;

        private ApproverList(Builder builder) {
            this.note = builder.note;
            this.operateTime = builder.operateTime;
            this.order = builder.order;
            this.status = builder.status;
            this.statusDesc = builder.statusDesc;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApproverList create() {
            return builder().build();
        }

        /**
         * @return note
         */
        public String getNote() {
            return this.note;
        }

        /**
         * @return operateTime
         */
        public String getOperateTime() {
            return this.operateTime;
        }

        /**
         * @return order
         */
        public Integer getOrder() {
            return this.order;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return statusDesc
         */
        public String getStatusDesc() {
            return this.statusDesc;
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
            private String note; 
            private String operateTime; 
            private Integer order; 
            private Integer status; 
            private String statusDesc; 
            private String userId; 
            private String userName; 

            private Builder() {
            } 

            private Builder(ApproverList model) {
                this.note = model.note;
                this.operateTime = model.operateTime;
                this.order = model.order;
                this.status = model.status;
                this.statusDesc = model.statusDesc;
                this.userId = model.userId;
                this.userName = model.userName;
            } 

            /**
             * note.
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            /**
             * operate_time.
             */
            public Builder operateTime(String operateTime) {
                this.operateTime = operateTime;
                return this;
            }

            /**
             * order.
             */
            public Builder order(Integer order) {
                this.order = order;
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
             * status_desc.
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
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

            public ApproverList build() {
                return new ApproverList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CarApplyQueryResponseBody} extends {@link TeaModel}
     *
     * <p>CarApplyQueryResponseBody</p>
     */
    public static class ItineraryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arr_city")
        private String arrCity;

        @com.aliyun.core.annotation.NameInMap("arr_city_code")
        private String arrCityCode;

        @com.aliyun.core.annotation.NameInMap("arr_date")
        private String arrDate;

        @com.aliyun.core.annotation.NameInMap("cost_center_id")
        private Long costCenterId;

        @com.aliyun.core.annotation.NameInMap("cost_center_name")
        private String costCenterName;

        @com.aliyun.core.annotation.NameInMap("dep_city")
        private String depCity;

        @com.aliyun.core.annotation.NameInMap("dep_city_code")
        private String depCityCode;

        @com.aliyun.core.annotation.NameInMap("dep_date")
        private String depDate;

        @com.aliyun.core.annotation.NameInMap("invoice_id")
        private Long invoiceId;

        @com.aliyun.core.annotation.NameInMap("invoice_name")
        private String invoiceName;

        @com.aliyun.core.annotation.NameInMap("itinerary_id")
        private String itineraryId;

        @com.aliyun.core.annotation.NameInMap("project_code")
        private String projectCode;

        @com.aliyun.core.annotation.NameInMap("project_title")
        private String projectTitle;

        @com.aliyun.core.annotation.NameInMap("traffic_type")
        private Integer trafficType;

        private ItineraryList(Builder builder) {
            this.arrCity = builder.arrCity;
            this.arrCityCode = builder.arrCityCode;
            this.arrDate = builder.arrDate;
            this.costCenterId = builder.costCenterId;
            this.costCenterName = builder.costCenterName;
            this.depCity = builder.depCity;
            this.depCityCode = builder.depCityCode;
            this.depDate = builder.depDate;
            this.invoiceId = builder.invoiceId;
            this.invoiceName = builder.invoiceName;
            this.itineraryId = builder.itineraryId;
            this.projectCode = builder.projectCode;
            this.projectTitle = builder.projectTitle;
            this.trafficType = builder.trafficType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItineraryList create() {
            return builder().build();
        }

        /**
         * @return arrCity
         */
        public String getArrCity() {
            return this.arrCity;
        }

        /**
         * @return arrCityCode
         */
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        /**
         * @return arrDate
         */
        public String getArrDate() {
            return this.arrDate;
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
         * @return depCity
         */
        public String getDepCity() {
            return this.depCity;
        }

        /**
         * @return depCityCode
         */
        public String getDepCityCode() {
            return this.depCityCode;
        }

        /**
         * @return depDate
         */
        public String getDepDate() {
            return this.depDate;
        }

        /**
         * @return invoiceId
         */
        public Long getInvoiceId() {
            return this.invoiceId;
        }

        /**
         * @return invoiceName
         */
        public String getInvoiceName() {
            return this.invoiceName;
        }

        /**
         * @return itineraryId
         */
        public String getItineraryId() {
            return this.itineraryId;
        }

        /**
         * @return projectCode
         */
        public String getProjectCode() {
            return this.projectCode;
        }

        /**
         * @return projectTitle
         */
        public String getProjectTitle() {
            return this.projectTitle;
        }

        /**
         * @return trafficType
         */
        public Integer getTrafficType() {
            return this.trafficType;
        }

        public static final class Builder {
            private String arrCity; 
            private String arrCityCode; 
            private String arrDate; 
            private Long costCenterId; 
            private String costCenterName; 
            private String depCity; 
            private String depCityCode; 
            private String depDate; 
            private Long invoiceId; 
            private String invoiceName; 
            private String itineraryId; 
            private String projectCode; 
            private String projectTitle; 
            private Integer trafficType; 

            private Builder() {
            } 

            private Builder(ItineraryList model) {
                this.arrCity = model.arrCity;
                this.arrCityCode = model.arrCityCode;
                this.arrDate = model.arrDate;
                this.costCenterId = model.costCenterId;
                this.costCenterName = model.costCenterName;
                this.depCity = model.depCity;
                this.depCityCode = model.depCityCode;
                this.depDate = model.depDate;
                this.invoiceId = model.invoiceId;
                this.invoiceName = model.invoiceName;
                this.itineraryId = model.itineraryId;
                this.projectCode = model.projectCode;
                this.projectTitle = model.projectTitle;
                this.trafficType = model.trafficType;
            } 

            /**
             * arr_city.
             */
            public Builder arrCity(String arrCity) {
                this.arrCity = arrCity;
                return this;
            }

            /**
             * arr_city_code.
             */
            public Builder arrCityCode(String arrCityCode) {
                this.arrCityCode = arrCityCode;
                return this;
            }

            /**
             * arr_date.
             */
            public Builder arrDate(String arrDate) {
                this.arrDate = arrDate;
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
             * dep_city.
             */
            public Builder depCity(String depCity) {
                this.depCity = depCity;
                return this;
            }

            /**
             * dep_city_code.
             */
            public Builder depCityCode(String depCityCode) {
                this.depCityCode = depCityCode;
                return this;
            }

            /**
             * dep_date.
             */
            public Builder depDate(String depDate) {
                this.depDate = depDate;
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
             * invoice_name.
             */
            public Builder invoiceName(String invoiceName) {
                this.invoiceName = invoiceName;
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
             * project_code.
             */
            public Builder projectCode(String projectCode) {
                this.projectCode = projectCode;
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
             * traffic_type.
             */
            public Builder trafficType(Integer trafficType) {
                this.trafficType = trafficType;
                return this;
            }

            public ItineraryList build() {
                return new ItineraryList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CarApplyQueryResponseBody} extends {@link TeaModel}
     *
     * <p>CarApplyQueryResponseBody</p>
     */
    public static class CarCitySet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("city_code")
        private String cityCode;

        @com.aliyun.core.annotation.NameInMap("city_name")
        private String cityName;

        private CarCitySet(Builder builder) {
            this.cityCode = builder.cityCode;
            this.cityName = builder.cityName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CarCitySet create() {
            return builder().build();
        }

        /**
         * @return cityCode
         */
        public String getCityCode() {
            return this.cityCode;
        }

        /**
         * @return cityName
         */
        public String getCityName() {
            return this.cityName;
        }

        public static final class Builder {
            private String cityCode; 
            private String cityName; 

            private Builder() {
            } 

            private Builder(CarCitySet model) {
                this.cityCode = model.cityCode;
                this.cityName = model.cityName;
            } 

            /**
             * city_code.
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * city_name.
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            public CarCitySet build() {
                return new CarCitySet(this);
            } 

        } 

    }
    /**
     * 
     * {@link CarApplyQueryResponseBody} extends {@link TeaModel}
     *
     * <p>CarApplyQueryResponseBody</p>
     */
    public static class TravelerStandard extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("car_city_set")
        private java.util.List<CarCitySet> carCitySet;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        private TravelerStandard(Builder builder) {
            this.carCitySet = builder.carCitySet;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TravelerStandard create() {
            return builder().build();
        }

        /**
         * @return carCitySet
         */
        public java.util.List<CarCitySet> getCarCitySet() {
            return this.carCitySet;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private java.util.List<CarCitySet> carCitySet; 
            private String userId; 

            private Builder() {
            } 

            private Builder(TravelerStandard model) {
                this.carCitySet = model.carCitySet;
                this.userId = model.userId;
            } 

            /**
             * car_city_set.
             */
            public Builder carCitySet(java.util.List<CarCitySet> carCitySet) {
                this.carCitySet = carCitySet;
                return this;
            }

            /**
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public TravelerStandard build() {
                return new TravelerStandard(this);
            } 

        } 

    }
    /**
     * 
     * {@link CarApplyQueryResponseBody} extends {@link TeaModel}
     *
     * <p>CarApplyQueryResponseBody</p>
     */
    public static class ApplyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("approver_list")
        private java.util.List<ApproverList> approverList;

        @com.aliyun.core.annotation.NameInMap("business_type")
        private String businessType;

        @com.aliyun.core.annotation.NameInMap("depart_id")
        private String departId;

        @com.aliyun.core.annotation.NameInMap("depart_name")
        private String departName;

        @com.aliyun.core.annotation.NameInMap("gmt_create")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmt_modified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("itinerary_list")
        private java.util.List<ItineraryList> itineraryList;

        @com.aliyun.core.annotation.NameInMap("order_id")
        private Long orderId;

        @com.aliyun.core.annotation.NameInMap("related_third_apply_id")
        private String relatedThirdApplyId;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("status_desc")
        private String statusDesc;

        @com.aliyun.core.annotation.NameInMap("thirdpart_id")
        private String thirdpartId;

        @com.aliyun.core.annotation.NameInMap("traveler_standard")
        private java.util.List<TravelerStandard> travelerStandard;

        @com.aliyun.core.annotation.NameInMap("trip_cause")
        private String tripCause;

        @com.aliyun.core.annotation.NameInMap("trip_title")
        private String tripTitle;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("user_name")
        private String userName;

        private ApplyList(Builder builder) {
            this.approverList = builder.approverList;
            this.businessType = builder.businessType;
            this.departId = builder.departId;
            this.departName = builder.departName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.itineraryList = builder.itineraryList;
            this.orderId = builder.orderId;
            this.relatedThirdApplyId = builder.relatedThirdApplyId;
            this.status = builder.status;
            this.statusDesc = builder.statusDesc;
            this.thirdpartId = builder.thirdpartId;
            this.travelerStandard = builder.travelerStandard;
            this.tripCause = builder.tripCause;
            this.tripTitle = builder.tripTitle;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplyList create() {
            return builder().build();
        }

        /**
         * @return approverList
         */
        public java.util.List<ApproverList> getApproverList() {
            return this.approverList;
        }

        /**
         * @return businessType
         */
        public String getBusinessType() {
            return this.businessType;
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
         * @return itineraryList
         */
        public java.util.List<ItineraryList> getItineraryList() {
            return this.itineraryList;
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
        }

        /**
         * @return relatedThirdApplyId
         */
        public String getRelatedThirdApplyId() {
            return this.relatedThirdApplyId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return statusDesc
         */
        public String getStatusDesc() {
            return this.statusDesc;
        }

        /**
         * @return thirdpartId
         */
        public String getThirdpartId() {
            return this.thirdpartId;
        }

        /**
         * @return travelerStandard
         */
        public java.util.List<TravelerStandard> getTravelerStandard() {
            return this.travelerStandard;
        }

        /**
         * @return tripCause
         */
        public String getTripCause() {
            return this.tripCause;
        }

        /**
         * @return tripTitle
         */
        public String getTripTitle() {
            return this.tripTitle;
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
            private java.util.List<ApproverList> approverList; 
            private String businessType; 
            private String departId; 
            private String departName; 
            private String gmtCreate; 
            private String gmtModified; 
            private java.util.List<ItineraryList> itineraryList; 
            private Long orderId; 
            private String relatedThirdApplyId; 
            private Integer status; 
            private String statusDesc; 
            private String thirdpartId; 
            private java.util.List<TravelerStandard> travelerStandard; 
            private String tripCause; 
            private String tripTitle; 
            private String userId; 
            private String userName; 

            private Builder() {
            } 

            private Builder(ApplyList model) {
                this.approverList = model.approverList;
                this.businessType = model.businessType;
                this.departId = model.departId;
                this.departName = model.departName;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.itineraryList = model.itineraryList;
                this.orderId = model.orderId;
                this.relatedThirdApplyId = model.relatedThirdApplyId;
                this.status = model.status;
                this.statusDesc = model.statusDesc;
                this.thirdpartId = model.thirdpartId;
                this.travelerStandard = model.travelerStandard;
                this.tripCause = model.tripCause;
                this.tripTitle = model.tripTitle;
                this.userId = model.userId;
                this.userName = model.userName;
            } 

            /**
             * approver_list.
             */
            public Builder approverList(java.util.List<ApproverList> approverList) {
                this.approverList = approverList;
                return this;
            }

            /**
             * business_type.
             */
            public Builder businessType(String businessType) {
                this.businessType = businessType;
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
             * itinerary_list.
             */
            public Builder itineraryList(java.util.List<ItineraryList> itineraryList) {
                this.itineraryList = itineraryList;
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
             * related_third_apply_id.
             */
            public Builder relatedThirdApplyId(String relatedThirdApplyId) {
                this.relatedThirdApplyId = relatedThirdApplyId;
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
             * status_desc.
             */
            public Builder statusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
                return this;
            }

            /**
             * thirdpart_id.
             */
            public Builder thirdpartId(String thirdpartId) {
                this.thirdpartId = thirdpartId;
                return this;
            }

            /**
             * traveler_standard.
             */
            public Builder travelerStandard(java.util.List<TravelerStandard> travelerStandard) {
                this.travelerStandard = travelerStandard;
                return this;
            }

            /**
             * trip_cause.
             */
            public Builder tripCause(String tripCause) {
                this.tripCause = tripCause;
                return this;
            }

            /**
             * trip_title.
             */
            public Builder tripTitle(String tripTitle) {
                this.tripTitle = tripTitle;
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

            public ApplyList build() {
                return new ApplyList(this);
            } 

        } 

    }
}
