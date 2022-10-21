// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CarApplyQueryResponseBody} extends {@link TeaModel}
 *
 * <p>CarApplyQueryResponseBody</p>
 */
public class CarApplyQueryResponseBody extends TeaModel {
    @NameInMap("apply_list")
    private java.util.List < ApplyList> applyList;

    @NameInMap("code")
    private String code;

    @NameInMap("message")
    private String message;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("total")
    private Integer total;

    @NameInMap("traceId")
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

    /**
     * @return applyList
     */
    public java.util.List < ApplyList> getApplyList() {
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
        private java.util.List < ApplyList> applyList; 
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 
        private String traceId; 

        /**
         * apply_list.
         */
        public Builder applyList(java.util.List < ApplyList> applyList) {
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

    public static class ApproverList extends TeaModel {
        @NameInMap("note")
        private String note;

        @NameInMap("operate_time")
        private String operateTime;

        @NameInMap("order")
        private Integer order;

        @NameInMap("status")
        private Integer status;

        @NameInMap("status_desc")
        private String statusDesc;

        @NameInMap("user_id")
        private String userId;

        @NameInMap("user_name")
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
    public static class ItineraryList extends TeaModel {
        @NameInMap("arr_city")
        private String arrCity;

        @NameInMap("arr_city_code")
        private String arrCityCode;

        @NameInMap("arr_date")
        private String arrDate;

        @NameInMap("cost_center_id")
        private Long costCenterId;

        @NameInMap("cost_center_name")
        private String costCenterName;

        @NameInMap("dep_city")
        private String depCity;

        @NameInMap("dep_city_code")
        private String depCityCode;

        @NameInMap("dep_date")
        private String depDate;

        @NameInMap("invoice_id")
        private Long invoiceId;

        @NameInMap("invoice_name")
        private String invoiceName;

        @NameInMap("itinerary_id")
        private String itineraryId;

        @NameInMap("project_code")
        private String projectCode;

        @NameInMap("project_title")
        private String projectTitle;

        @NameInMap("traffic_type")
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
    public static class ApplyList extends TeaModel {
        @NameInMap("approver_list")
        private java.util.List < ApproverList> approverList;

        @NameInMap("depart_id")
        private String departId;

        @NameInMap("depart_name")
        private String departName;

        @NameInMap("gmt_create")
        private String gmtCreate;

        @NameInMap("gmt_modified")
        private String gmtModified;

        @NameInMap("itinerary_list")
        private java.util.List < ItineraryList> itineraryList;

        @NameInMap("status")
        private Integer status;

        @NameInMap("status_desc")
        private String statusDesc;

        @NameInMap("thirdpart_id")
        private String thirdpartId;

        @NameInMap("trip_cause")
        private String tripCause;

        @NameInMap("trip_title")
        private String tripTitle;

        @NameInMap("user_id")
        private String userId;

        @NameInMap("user_name")
        private String userName;

        private ApplyList(Builder builder) {
            this.approverList = builder.approverList;
            this.departId = builder.departId;
            this.departName = builder.departName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.itineraryList = builder.itineraryList;
            this.status = builder.status;
            this.statusDesc = builder.statusDesc;
            this.thirdpartId = builder.thirdpartId;
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
        public java.util.List < ApproverList> getApproverList() {
            return this.approverList;
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
        public java.util.List < ItineraryList> getItineraryList() {
            return this.itineraryList;
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
            private java.util.List < ApproverList> approverList; 
            private String departId; 
            private String departName; 
            private String gmtCreate; 
            private String gmtModified; 
            private java.util.List < ItineraryList> itineraryList; 
            private Integer status; 
            private String statusDesc; 
            private String thirdpartId; 
            private String tripCause; 
            private String tripTitle; 
            private String userId; 
            private String userName; 

            /**
             * approver_list.
             */
            public Builder approverList(java.util.List < ApproverList> approverList) {
                this.approverList = approverList;
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
            public Builder itineraryList(java.util.List < ItineraryList> itineraryList) {
                this.itineraryList = itineraryList;
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
