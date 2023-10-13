// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyListQueryResponseBody} extends {@link TeaModel}
 *
 * <p>ApplyListQueryResponseBody</p>
 */
public class ApplyListQueryResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("message")
    private String message;

    @NameInMap("module_list")
    private java.util.List < ModuleList> moduleList;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("traceId")
    private String traceId;

    private ApplyListQueryResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.moduleList = builder.moduleList;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyListQueryResponseBody create() {
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
     * @return moduleList
     */
    public java.util.List < ModuleList> getModuleList() {
        return this.moduleList;
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
        private java.util.List < ModuleList> moduleList; 
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
         * module_list.
         */
        public Builder moduleList(java.util.List < ModuleList> moduleList) {
            this.moduleList = moduleList;
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

        public ApplyListQueryResponseBody build() {
            return new ApplyListQueryResponseBody(this);
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
    public static class ExternalTravelerList extends TeaModel {
        @NameInMap("user_name")
        private String userName;

        private ExternalTravelerList(Builder builder) {
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExternalTravelerList create() {
            return builder().build();
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String userName; 

            /**
             * user_name.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public ExternalTravelerList build() {
                return new ExternalTravelerList(this);
            } 

        } 

    }
    public static class ItineraryList extends TeaModel {
        @NameInMap("arr_city")
        private String arrCity;

        @NameInMap("arr_date")
        private String arrDate;

        @NameInMap("cost_center_name")
        private String costCenterName;

        @NameInMap("dep_city")
        private String depCity;

        @NameInMap("dep_date")
        private String depDate;

        @NameInMap("invoice_name")
        private String invoiceName;

        @NameInMap("itinerary_id")
        private String itineraryId;

        @NameInMap("project_code")
        private String projectCode;

        @NameInMap("project_title")
        private String projectTitle;

        @NameInMap("thirdpart_itinerary_id")
        private String thirdpartItineraryId;

        @NameInMap("traffic_type")
        private Integer trafficType;

        @NameInMap("trip_way")
        private Integer tripWay;

        private ItineraryList(Builder builder) {
            this.arrCity = builder.arrCity;
            this.arrDate = builder.arrDate;
            this.costCenterName = builder.costCenterName;
            this.depCity = builder.depCity;
            this.depDate = builder.depDate;
            this.invoiceName = builder.invoiceName;
            this.itineraryId = builder.itineraryId;
            this.projectCode = builder.projectCode;
            this.projectTitle = builder.projectTitle;
            this.thirdpartItineraryId = builder.thirdpartItineraryId;
            this.trafficType = builder.trafficType;
            this.tripWay = builder.tripWay;
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
         * @return arrDate
         */
        public String getArrDate() {
            return this.arrDate;
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
         * @return depDate
         */
        public String getDepDate() {
            return this.depDate;
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
         * @return thirdpartItineraryId
         */
        public String getThirdpartItineraryId() {
            return this.thirdpartItineraryId;
        }

        /**
         * @return trafficType
         */
        public Integer getTrafficType() {
            return this.trafficType;
        }

        /**
         * @return tripWay
         */
        public Integer getTripWay() {
            return this.tripWay;
        }

        public static final class Builder {
            private String arrCity; 
            private String arrDate; 
            private String costCenterName; 
            private String depCity; 
            private String depDate; 
            private String invoiceName; 
            private String itineraryId; 
            private String projectCode; 
            private String projectTitle; 
            private String thirdpartItineraryId; 
            private Integer trafficType; 
            private Integer tripWay; 

            /**
             * arr_city.
             */
            public Builder arrCity(String arrCity) {
                this.arrCity = arrCity;
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
             * dep_date.
             */
            public Builder depDate(String depDate) {
                this.depDate = depDate;
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
             * thirdpart_itinerary_id.
             */
            public Builder thirdpartItineraryId(String thirdpartItineraryId) {
                this.thirdpartItineraryId = thirdpartItineraryId;
                return this;
            }

            /**
             * traffic_type.
             */
            public Builder trafficType(Integer trafficType) {
                this.trafficType = trafficType;
                return this;
            }

            /**
             * trip_way.
             */
            public Builder tripWay(Integer tripWay) {
                this.tripWay = tripWay;
                return this;
            }

            public ItineraryList build() {
                return new ItineraryList(this);
            } 

        } 

    }
    public static class ItinerarySetList extends TeaModel {
        @NameInMap("arr_date")
        private String arrDate;

        @NameInMap("city_code_set")
        private String cityCodeSet;

        @NameInMap("city_set")
        private String citySet;

        @NameInMap("cost_center_name")
        private String costCenterName;

        @NameInMap("dep_date")
        private String depDate;

        @NameInMap("invoice_name")
        private String invoiceName;

        @NameInMap("itinerary_id")
        private String itineraryId;

        @NameInMap("project_code")
        private String projectCode;

        @NameInMap("project_title")
        private String projectTitle;

        @NameInMap("thirdpart_itinerary_id")
        private String thirdpartItineraryId;

        @NameInMap("traffic_type")
        private Integer trafficType;

        private ItinerarySetList(Builder builder) {
            this.arrDate = builder.arrDate;
            this.cityCodeSet = builder.cityCodeSet;
            this.citySet = builder.citySet;
            this.costCenterName = builder.costCenterName;
            this.depDate = builder.depDate;
            this.invoiceName = builder.invoiceName;
            this.itineraryId = builder.itineraryId;
            this.projectCode = builder.projectCode;
            this.projectTitle = builder.projectTitle;
            this.thirdpartItineraryId = builder.thirdpartItineraryId;
            this.trafficType = builder.trafficType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItinerarySetList create() {
            return builder().build();
        }

        /**
         * @return arrDate
         */
        public String getArrDate() {
            return this.arrDate;
        }

        /**
         * @return cityCodeSet
         */
        public String getCityCodeSet() {
            return this.cityCodeSet;
        }

        /**
         * @return citySet
         */
        public String getCitySet() {
            return this.citySet;
        }

        /**
         * @return costCenterName
         */
        public String getCostCenterName() {
            return this.costCenterName;
        }

        /**
         * @return depDate
         */
        public String getDepDate() {
            return this.depDate;
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
         * @return thirdpartItineraryId
         */
        public String getThirdpartItineraryId() {
            return this.thirdpartItineraryId;
        }

        /**
         * @return trafficType
         */
        public Integer getTrafficType() {
            return this.trafficType;
        }

        public static final class Builder {
            private String arrDate; 
            private String cityCodeSet; 
            private String citySet; 
            private String costCenterName; 
            private String depDate; 
            private String invoiceName; 
            private String itineraryId; 
            private String projectCode; 
            private String projectTitle; 
            private String thirdpartItineraryId; 
            private Integer trafficType; 

            /**
             * arr_date.
             */
            public Builder arrDate(String arrDate) {
                this.arrDate = arrDate;
                return this;
            }

            /**
             * city_code_set.
             */
            public Builder cityCodeSet(String cityCodeSet) {
                this.cityCodeSet = cityCodeSet;
                return this;
            }

            /**
             * city_set.
             */
            public Builder citySet(String citySet) {
                this.citySet = citySet;
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
             * dep_date.
             */
            public Builder depDate(String depDate) {
                this.depDate = depDate;
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
             * thirdpart_itinerary_id.
             */
            public Builder thirdpartItineraryId(String thirdpartItineraryId) {
                this.thirdpartItineraryId = thirdpartItineraryId;
                return this;
            }

            /**
             * traffic_type.
             */
            public Builder trafficType(Integer trafficType) {
                this.trafficType = trafficType;
                return this;
            }

            public ItinerarySetList build() {
                return new ItinerarySetList(this);
            } 

        } 

    }
    public static class TravelerList extends TeaModel {
        @NameInMap("job_no")
        private String jobNo;

        @NameInMap("user_id")
        private String userId;

        @NameInMap("user_name")
        private String userName;

        private TravelerList(Builder builder) {
            this.jobNo = builder.jobNo;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TravelerList create() {
            return builder().build();
        }

        /**
         * @return jobNo
         */
        public String getJobNo() {
            return this.jobNo;
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
            private String jobNo; 
            private String userId; 
            private String userName; 

            /**
             * job_no.
             */
            public Builder jobNo(String jobNo) {
                this.jobNo = jobNo;
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

            public TravelerList build() {
                return new TravelerList(this);
            } 

        } 

    }
    public static class ModuleList extends TeaModel {
        @NameInMap("apply_show_id")
        private String applyShowId;

        @NameInMap("approver_list")
        private java.util.List < ApproverList> approverList;

        @NameInMap("corp_id")
        private String corpId;

        @NameInMap("corp_name")
        private String corpName;

        @NameInMap("depart_id")
        private String departId;

        @NameInMap("depart_name")
        private String departName;

        @NameInMap("external_traveler_list")
        private java.util.List < ExternalTravelerList> externalTravelerList;

        @NameInMap("flow_code")
        private String flowCode;

        @NameInMap("gmt_create")
        private String gmtCreate;

        @NameInMap("gmt_modified")
        private String gmtModified;

        @NameInMap("id")
        private Long id;

        @NameInMap("itinerary_list")
        private java.util.List < ItineraryList> itineraryList;

        @NameInMap("itinerary_rule")
        private Integer itineraryRule;

        @NameInMap("itinerary_set_list")
        private java.util.List < ItinerarySetList> itinerarySetList;

        @NameInMap("job_no")
        private String jobNo;

        @NameInMap("status")
        private Integer status;

        @NameInMap("status_desc")
        private String statusDesc;

        @NameInMap("thirdpart_business_id")
        private String thirdpartBusinessId;

        @NameInMap("thirdpart_id")
        private String thirdpartId;

        @NameInMap("traveler_list")
        private java.util.List < TravelerList> travelerList;

        @NameInMap("trip_cause")
        private String tripCause;

        @NameInMap("trip_day")
        private Integer tripDay;

        @NameInMap("trip_title")
        private String tripTitle;

        @NameInMap("type")
        private Integer type;

        @NameInMap("union_no")
        private String unionNo;

        @NameInMap("user_id")
        private String userId;

        @NameInMap("user_name")
        private String userName;

        private ModuleList(Builder builder) {
            this.applyShowId = builder.applyShowId;
            this.approverList = builder.approverList;
            this.corpId = builder.corpId;
            this.corpName = builder.corpName;
            this.departId = builder.departId;
            this.departName = builder.departName;
            this.externalTravelerList = builder.externalTravelerList;
            this.flowCode = builder.flowCode;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.itineraryList = builder.itineraryList;
            this.itineraryRule = builder.itineraryRule;
            this.itinerarySetList = builder.itinerarySetList;
            this.jobNo = builder.jobNo;
            this.status = builder.status;
            this.statusDesc = builder.statusDesc;
            this.thirdpartBusinessId = builder.thirdpartBusinessId;
            this.thirdpartId = builder.thirdpartId;
            this.travelerList = builder.travelerList;
            this.tripCause = builder.tripCause;
            this.tripDay = builder.tripDay;
            this.tripTitle = builder.tripTitle;
            this.type = builder.type;
            this.unionNo = builder.unionNo;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModuleList create() {
            return builder().build();
        }

        /**
         * @return applyShowId
         */
        public String getApplyShowId() {
            return this.applyShowId;
        }

        /**
         * @return approverList
         */
        public java.util.List < ApproverList> getApproverList() {
            return this.approverList;
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
         * @return externalTravelerList
         */
        public java.util.List < ExternalTravelerList> getExternalTravelerList() {
            return this.externalTravelerList;
        }

        /**
         * @return flowCode
         */
        public String getFlowCode() {
            return this.flowCode;
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
         * @return itineraryList
         */
        public java.util.List < ItineraryList> getItineraryList() {
            return this.itineraryList;
        }

        /**
         * @return itineraryRule
         */
        public Integer getItineraryRule() {
            return this.itineraryRule;
        }

        /**
         * @return itinerarySetList
         */
        public java.util.List < ItinerarySetList> getItinerarySetList() {
            return this.itinerarySetList;
        }

        /**
         * @return jobNo
         */
        public String getJobNo() {
            return this.jobNo;
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
         * @return thirdpartBusinessId
         */
        public String getThirdpartBusinessId() {
            return this.thirdpartBusinessId;
        }

        /**
         * @return thirdpartId
         */
        public String getThirdpartId() {
            return this.thirdpartId;
        }

        /**
         * @return travelerList
         */
        public java.util.List < TravelerList> getTravelerList() {
            return this.travelerList;
        }

        /**
         * @return tripCause
         */
        public String getTripCause() {
            return this.tripCause;
        }

        /**
         * @return tripDay
         */
        public Integer getTripDay() {
            return this.tripDay;
        }

        /**
         * @return tripTitle
         */
        public String getTripTitle() {
            return this.tripTitle;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return unionNo
         */
        public String getUnionNo() {
            return this.unionNo;
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
            private String applyShowId; 
            private java.util.List < ApproverList> approverList; 
            private String corpId; 
            private String corpName; 
            private String departId; 
            private String departName; 
            private java.util.List < ExternalTravelerList> externalTravelerList; 
            private String flowCode; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private java.util.List < ItineraryList> itineraryList; 
            private Integer itineraryRule; 
            private java.util.List < ItinerarySetList> itinerarySetList; 
            private String jobNo; 
            private Integer status; 
            private String statusDesc; 
            private String thirdpartBusinessId; 
            private String thirdpartId; 
            private java.util.List < TravelerList> travelerList; 
            private String tripCause; 
            private Integer tripDay; 
            private String tripTitle; 
            private Integer type; 
            private String unionNo; 
            private String userId; 
            private String userName; 

            /**
             * apply_show_id.
             */
            public Builder applyShowId(String applyShowId) {
                this.applyShowId = applyShowId;
                return this;
            }

            /**
             * approver_list.
             */
            public Builder approverList(java.util.List < ApproverList> approverList) {
                this.approverList = approverList;
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
             * external_traveler_list.
             */
            public Builder externalTravelerList(java.util.List < ExternalTravelerList> externalTravelerList) {
                this.externalTravelerList = externalTravelerList;
                return this;
            }

            /**
             * flow_code.
             */
            public Builder flowCode(String flowCode) {
                this.flowCode = flowCode;
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
             * itinerary_list.
             */
            public Builder itineraryList(java.util.List < ItineraryList> itineraryList) {
                this.itineraryList = itineraryList;
                return this;
            }

            /**
             * itinerary_rule.
             */
            public Builder itineraryRule(Integer itineraryRule) {
                this.itineraryRule = itineraryRule;
                return this;
            }

            /**
             * itinerary_set_list.
             */
            public Builder itinerarySetList(java.util.List < ItinerarySetList> itinerarySetList) {
                this.itinerarySetList = itinerarySetList;
                return this;
            }

            /**
             * job_no.
             */
            public Builder jobNo(String jobNo) {
                this.jobNo = jobNo;
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
             * thirdpart_business_id.
             */
            public Builder thirdpartBusinessId(String thirdpartBusinessId) {
                this.thirdpartBusinessId = thirdpartBusinessId;
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
             * traveler_list.
             */
            public Builder travelerList(java.util.List < TravelerList> travelerList) {
                this.travelerList = travelerList;
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
             * trip_day.
             */
            public Builder tripDay(Integer tripDay) {
                this.tripDay = tripDay;
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
             * type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * union_no.
             */
            public Builder unionNo(String unionNo) {
                this.unionNo = unionNo;
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

            public ModuleList build() {
                return new ModuleList(this);
            } 

        } 

    }
}
