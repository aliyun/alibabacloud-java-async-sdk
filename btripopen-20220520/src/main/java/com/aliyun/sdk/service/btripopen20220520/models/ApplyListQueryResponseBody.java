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
 * {@link ApplyListQueryResponseBody} extends {@link TeaModel}
 *
 * <p>ApplyListQueryResponseBody</p>
 */
public class ApplyListQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("module_list")
    private java.util.List<ModuleList> moduleList;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
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
     * @return moduleList
     */
    public java.util.List<ModuleList> getModuleList() {
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
        private java.util.List<ModuleList> moduleList; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(ApplyListQueryResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.moduleList = model.moduleList;
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
         * module_list.
         */
        public Builder moduleList(java.util.List<ModuleList> moduleList) {
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

    /**
     * 
     * {@link ApplyListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>ApplyListQueryResponseBody</p>
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
     * {@link ApplyListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>ApplyListQueryResponseBody</p>
     */
    public static class CarRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("scenario_template_id")
        private String scenarioTemplateId;

        @com.aliyun.core.annotation.NameInMap("scenario_template_name")
        private String scenarioTemplateName;

        private CarRule(Builder builder) {
            this.scenarioTemplateId = builder.scenarioTemplateId;
            this.scenarioTemplateName = builder.scenarioTemplateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CarRule create() {
            return builder().build();
        }

        /**
         * @return scenarioTemplateId
         */
        public String getScenarioTemplateId() {
            return this.scenarioTemplateId;
        }

        /**
         * @return scenarioTemplateName
         */
        public String getScenarioTemplateName() {
            return this.scenarioTemplateName;
        }

        public static final class Builder {
            private String scenarioTemplateId; 
            private String scenarioTemplateName; 

            private Builder() {
            } 

            private Builder(CarRule model) {
                this.scenarioTemplateId = model.scenarioTemplateId;
                this.scenarioTemplateName = model.scenarioTemplateName;
            } 

            /**
             * scenario_template_id.
             */
            public Builder scenarioTemplateId(String scenarioTemplateId) {
                this.scenarioTemplateId = scenarioTemplateId;
                return this;
            }

            /**
             * scenario_template_name.
             */
            public Builder scenarioTemplateName(String scenarioTemplateName) {
                this.scenarioTemplateName = scenarioTemplateName;
                return this;
            }

            public CarRule build() {
                return new CarRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link ApplyListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>ApplyListQueryResponseBody</p>
     */
    public static class ExternalTravelerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("attribute")
        private String attribute;

        @com.aliyun.core.annotation.NameInMap("cost_center_name")
        private String costCenterName;

        @com.aliyun.core.annotation.NameInMap("depart_id")
        private String departId;

        @com.aliyun.core.annotation.NameInMap("external_user_id")
        private String externalUserId;

        @com.aliyun.core.annotation.NameInMap("invoice_name")
        private String invoiceName;

        @com.aliyun.core.annotation.NameInMap("payment_department_name")
        private String paymentDepartmentName;

        @com.aliyun.core.annotation.NameInMap("project_code")
        private String projectCode;

        @com.aliyun.core.annotation.NameInMap("project_title")
        private String projectTitle;

        @com.aliyun.core.annotation.NameInMap("thirdpart_depart_id")
        private String thirdpartDepartId;

        @com.aliyun.core.annotation.NameInMap("user_name")
        private String userName;

        private ExternalTravelerList(Builder builder) {
            this.attribute = builder.attribute;
            this.costCenterName = builder.costCenterName;
            this.departId = builder.departId;
            this.externalUserId = builder.externalUserId;
            this.invoiceName = builder.invoiceName;
            this.paymentDepartmentName = builder.paymentDepartmentName;
            this.projectCode = builder.projectCode;
            this.projectTitle = builder.projectTitle;
            this.thirdpartDepartId = builder.thirdpartDepartId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExternalTravelerList create() {
            return builder().build();
        }

        /**
         * @return attribute
         */
        public String getAttribute() {
            return this.attribute;
        }

        /**
         * @return costCenterName
         */
        public String getCostCenterName() {
            return this.costCenterName;
        }

        /**
         * @return departId
         */
        public String getDepartId() {
            return this.departId;
        }

        /**
         * @return externalUserId
         */
        public String getExternalUserId() {
            return this.externalUserId;
        }

        /**
         * @return invoiceName
         */
        public String getInvoiceName() {
            return this.invoiceName;
        }

        /**
         * @return paymentDepartmentName
         */
        public String getPaymentDepartmentName() {
            return this.paymentDepartmentName;
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
         * @return thirdpartDepartId
         */
        public String getThirdpartDepartId() {
            return this.thirdpartDepartId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String attribute; 
            private String costCenterName; 
            private String departId; 
            private String externalUserId; 
            private String invoiceName; 
            private String paymentDepartmentName; 
            private String projectCode; 
            private String projectTitle; 
            private String thirdpartDepartId; 
            private String userName; 

            private Builder() {
            } 

            private Builder(ExternalTravelerList model) {
                this.attribute = model.attribute;
                this.costCenterName = model.costCenterName;
                this.departId = model.departId;
                this.externalUserId = model.externalUserId;
                this.invoiceName = model.invoiceName;
                this.paymentDepartmentName = model.paymentDepartmentName;
                this.projectCode = model.projectCode;
                this.projectTitle = model.projectTitle;
                this.thirdpartDepartId = model.thirdpartDepartId;
                this.userName = model.userName;
            } 

            /**
             * attribute.
             */
            public Builder attribute(String attribute) {
                this.attribute = attribute;
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
             * depart_id.
             */
            public Builder departId(String departId) {
                this.departId = departId;
                return this;
            }

            /**
             * external_user_id.
             */
            public Builder externalUserId(String externalUserId) {
                this.externalUserId = externalUserId;
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
             * payment_department_name.
             */
            public Builder paymentDepartmentName(String paymentDepartmentName) {
                this.paymentDepartmentName = paymentDepartmentName;
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
             * thirdpart_depart_id.
             */
            public Builder thirdpartDepartId(String thirdpartDepartId) {
                this.thirdpartDepartId = thirdpartDepartId;
                return this;
            }

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
    /**
     * 
     * {@link ApplyListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>ApplyListQueryResponseBody</p>
     */
    public static class ItineraryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arr_city")
        private String arrCity;

        @com.aliyun.core.annotation.NameInMap("arr_date")
        private String arrDate;

        @com.aliyun.core.annotation.NameInMap("cost_center_name")
        private String costCenterName;

        @com.aliyun.core.annotation.NameInMap("dep_city")
        private String depCity;

        @com.aliyun.core.annotation.NameInMap("dep_date")
        private String depDate;

        @com.aliyun.core.annotation.NameInMap("invoice_name")
        private String invoiceName;

        @com.aliyun.core.annotation.NameInMap("itinerary_id")
        private String itineraryId;

        @com.aliyun.core.annotation.NameInMap("project_code")
        private String projectCode;

        @com.aliyun.core.annotation.NameInMap("project_title")
        private String projectTitle;

        @com.aliyun.core.annotation.NameInMap("thirdpart_cost_center_id")
        private String thirdpartCostCenterId;

        @com.aliyun.core.annotation.NameInMap("thirdpart_invoice_id")
        private String thirdpartInvoiceId;

        @com.aliyun.core.annotation.NameInMap("thirdpart_itinerary_id")
        private String thirdpartItineraryId;

        @com.aliyun.core.annotation.NameInMap("traffic_type")
        private Integer trafficType;

        @com.aliyun.core.annotation.NameInMap("trip_way")
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
            this.thirdpartCostCenterId = builder.thirdpartCostCenterId;
            this.thirdpartInvoiceId = builder.thirdpartInvoiceId;
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
         * @return thirdpartCostCenterId
         */
        public String getThirdpartCostCenterId() {
            return this.thirdpartCostCenterId;
        }

        /**
         * @return thirdpartInvoiceId
         */
        public String getThirdpartInvoiceId() {
            return this.thirdpartInvoiceId;
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
            private String thirdpartCostCenterId; 
            private String thirdpartInvoiceId; 
            private String thirdpartItineraryId; 
            private Integer trafficType; 
            private Integer tripWay; 

            private Builder() {
            } 

            private Builder(ItineraryList model) {
                this.arrCity = model.arrCity;
                this.arrDate = model.arrDate;
                this.costCenterName = model.costCenterName;
                this.depCity = model.depCity;
                this.depDate = model.depDate;
                this.invoiceName = model.invoiceName;
                this.itineraryId = model.itineraryId;
                this.projectCode = model.projectCode;
                this.projectTitle = model.projectTitle;
                this.thirdpartCostCenterId = model.thirdpartCostCenterId;
                this.thirdpartInvoiceId = model.thirdpartInvoiceId;
                this.thirdpartItineraryId = model.thirdpartItineraryId;
                this.trafficType = model.trafficType;
                this.tripWay = model.tripWay;
            } 

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
             * thirdpart_cost_center_id.
             */
            public Builder thirdpartCostCenterId(String thirdpartCostCenterId) {
                this.thirdpartCostCenterId = thirdpartCostCenterId;
                return this;
            }

            /**
             * thirdpart_invoice_id.
             */
            public Builder thirdpartInvoiceId(String thirdpartInvoiceId) {
                this.thirdpartInvoiceId = thirdpartInvoiceId;
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
    /**
     * 
     * {@link ApplyListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>ApplyListQueryResponseBody</p>
     */
    public static class ItinerarySetList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arr_date")
        private String arrDate;

        @com.aliyun.core.annotation.NameInMap("city_code_set")
        private String cityCodeSet;

        @com.aliyun.core.annotation.NameInMap("city_set")
        private String citySet;

        @com.aliyun.core.annotation.NameInMap("cost_center_name")
        private String costCenterName;

        @com.aliyun.core.annotation.NameInMap("dep_date")
        private String depDate;

        @com.aliyun.core.annotation.NameInMap("invoice_name")
        private String invoiceName;

        @com.aliyun.core.annotation.NameInMap("itinerary_id")
        private String itineraryId;

        @com.aliyun.core.annotation.NameInMap("project_code")
        private String projectCode;

        @com.aliyun.core.annotation.NameInMap("project_title")
        private String projectTitle;

        @com.aliyun.core.annotation.NameInMap("thirdpart_cost_center_id")
        private String thirdpartCostCenterId;

        @com.aliyun.core.annotation.NameInMap("thirdpart_invoice_id")
        private String thirdpartInvoiceId;

        @com.aliyun.core.annotation.NameInMap("thirdpart_itinerary_id")
        private String thirdpartItineraryId;

        @com.aliyun.core.annotation.NameInMap("traffic_type")
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
            this.thirdpartCostCenterId = builder.thirdpartCostCenterId;
            this.thirdpartInvoiceId = builder.thirdpartInvoiceId;
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
         * @return thirdpartCostCenterId
         */
        public String getThirdpartCostCenterId() {
            return this.thirdpartCostCenterId;
        }

        /**
         * @return thirdpartInvoiceId
         */
        public String getThirdpartInvoiceId() {
            return this.thirdpartInvoiceId;
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
            private String thirdpartCostCenterId; 
            private String thirdpartInvoiceId; 
            private String thirdpartItineraryId; 
            private Integer trafficType; 

            private Builder() {
            } 

            private Builder(ItinerarySetList model) {
                this.arrDate = model.arrDate;
                this.cityCodeSet = model.cityCodeSet;
                this.citySet = model.citySet;
                this.costCenterName = model.costCenterName;
                this.depDate = model.depDate;
                this.invoiceName = model.invoiceName;
                this.itineraryId = model.itineraryId;
                this.projectCode = model.projectCode;
                this.projectTitle = model.projectTitle;
                this.thirdpartCostCenterId = model.thirdpartCostCenterId;
                this.thirdpartInvoiceId = model.thirdpartInvoiceId;
                this.thirdpartItineraryId = model.thirdpartItineraryId;
                this.trafficType = model.trafficType;
            } 

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
             * thirdpart_cost_center_id.
             */
            public Builder thirdpartCostCenterId(String thirdpartCostCenterId) {
                this.thirdpartCostCenterId = thirdpartCostCenterId;
                return this;
            }

            /**
             * thirdpart_invoice_id.
             */
            public Builder thirdpartInvoiceId(String thirdpartInvoiceId) {
                this.thirdpartInvoiceId = thirdpartInvoiceId;
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
    /**
     * 
     * {@link ApplyListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>ApplyListQueryResponseBody</p>
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
     * {@link ApplyListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>ApplyListQueryResponseBody</p>
     */
    public static class TravelerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("attribute")
        private String attribute;

        @com.aliyun.core.annotation.NameInMap("car_city_set")
        private java.util.List<CarCitySet> carCitySet;

        @com.aliyun.core.annotation.NameInMap("cost_center_name")
        private String costCenterName;

        @com.aliyun.core.annotation.NameInMap("depart_id")
        private String departId;

        @com.aliyun.core.annotation.NameInMap("invoice_name")
        private String invoiceName;

        @com.aliyun.core.annotation.NameInMap("job_no")
        private String jobNo;

        @com.aliyun.core.annotation.NameInMap("payment_department_name")
        private String paymentDepartmentName;

        @com.aliyun.core.annotation.NameInMap("project_code")
        private String projectCode;

        @com.aliyun.core.annotation.NameInMap("project_title")
        private String projectTitle;

        @com.aliyun.core.annotation.NameInMap("thirdpart_depart_id")
        private String thirdpartDepartId;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("user_name")
        private String userName;

        private TravelerList(Builder builder) {
            this.attribute = builder.attribute;
            this.carCitySet = builder.carCitySet;
            this.costCenterName = builder.costCenterName;
            this.departId = builder.departId;
            this.invoiceName = builder.invoiceName;
            this.jobNo = builder.jobNo;
            this.paymentDepartmentName = builder.paymentDepartmentName;
            this.projectCode = builder.projectCode;
            this.projectTitle = builder.projectTitle;
            this.thirdpartDepartId = builder.thirdpartDepartId;
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
         * @return attribute
         */
        public String getAttribute() {
            return this.attribute;
        }

        /**
         * @return carCitySet
         */
        public java.util.List<CarCitySet> getCarCitySet() {
            return this.carCitySet;
        }

        /**
         * @return costCenterName
         */
        public String getCostCenterName() {
            return this.costCenterName;
        }

        /**
         * @return departId
         */
        public String getDepartId() {
            return this.departId;
        }

        /**
         * @return invoiceName
         */
        public String getInvoiceName() {
            return this.invoiceName;
        }

        /**
         * @return jobNo
         */
        public String getJobNo() {
            return this.jobNo;
        }

        /**
         * @return paymentDepartmentName
         */
        public String getPaymentDepartmentName() {
            return this.paymentDepartmentName;
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
         * @return thirdpartDepartId
         */
        public String getThirdpartDepartId() {
            return this.thirdpartDepartId;
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
            private String attribute; 
            private java.util.List<CarCitySet> carCitySet; 
            private String costCenterName; 
            private String departId; 
            private String invoiceName; 
            private String jobNo; 
            private String paymentDepartmentName; 
            private String projectCode; 
            private String projectTitle; 
            private String thirdpartDepartId; 
            private String userId; 
            private String userName; 

            private Builder() {
            } 

            private Builder(TravelerList model) {
                this.attribute = model.attribute;
                this.carCitySet = model.carCitySet;
                this.costCenterName = model.costCenterName;
                this.departId = model.departId;
                this.invoiceName = model.invoiceName;
                this.jobNo = model.jobNo;
                this.paymentDepartmentName = model.paymentDepartmentName;
                this.projectCode = model.projectCode;
                this.projectTitle = model.projectTitle;
                this.thirdpartDepartId = model.thirdpartDepartId;
                this.userId = model.userId;
                this.userName = model.userName;
            } 

            /**
             * attribute.
             */
            public Builder attribute(String attribute) {
                this.attribute = attribute;
                return this;
            }

            /**
             * car_city_set.
             */
            public Builder carCitySet(java.util.List<CarCitySet> carCitySet) {
                this.carCitySet = carCitySet;
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
             * depart_id.
             */
            public Builder departId(String departId) {
                this.departId = departId;
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
             * job_no.
             */
            public Builder jobNo(String jobNo) {
                this.jobNo = jobNo;
                return this;
            }

            /**
             * payment_department_name.
             */
            public Builder paymentDepartmentName(String paymentDepartmentName) {
                this.paymentDepartmentName = paymentDepartmentName;
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
             * thirdpart_depart_id.
             */
            public Builder thirdpartDepartId(String thirdpartDepartId) {
                this.thirdpartDepartId = thirdpartDepartId;
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
    /**
     * 
     * {@link ApplyListQueryResponseBody} extends {@link TeaModel}
     *
     * <p>ApplyListQueryResponseBody</p>
     */
    public static class ModuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apply_show_id")
        private String applyShowId;

        @com.aliyun.core.annotation.NameInMap("approver_list")
        private java.util.List<ApproverList> approverList;

        @com.aliyun.core.annotation.NameInMap("car_rule")
        private CarRule carRule;

        @com.aliyun.core.annotation.NameInMap("corp_id")
        private String corpId;

        @com.aliyun.core.annotation.NameInMap("corp_name")
        private String corpName;

        @com.aliyun.core.annotation.NameInMap("depart_id")
        private String departId;

        @com.aliyun.core.annotation.NameInMap("depart_name")
        private String departName;

        @com.aliyun.core.annotation.NameInMap("external_traveler_list")
        private java.util.List<ExternalTravelerList> externalTravelerList;

        @com.aliyun.core.annotation.NameInMap("flow_code")
        private String flowCode;

        @com.aliyun.core.annotation.NameInMap("gmt_create")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmt_modified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("itinerary_list")
        private java.util.List<ItineraryList> itineraryList;

        @com.aliyun.core.annotation.NameInMap("itinerary_rule")
        private Integer itineraryRule;

        @com.aliyun.core.annotation.NameInMap("itinerary_set_list")
        private java.util.List<ItinerarySetList> itinerarySetList;

        @com.aliyun.core.annotation.NameInMap("job_no")
        private String jobNo;

        @com.aliyun.core.annotation.NameInMap("payment_department_id")
        private String paymentDepartmentId;

        @com.aliyun.core.annotation.NameInMap("payment_department_name")
        private String paymentDepartmentName;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("status_desc")
        private String statusDesc;

        @com.aliyun.core.annotation.NameInMap("thirdpart_business_id")
        private String thirdpartBusinessId;

        @com.aliyun.core.annotation.NameInMap("thirdpart_id")
        private String thirdpartId;

        @com.aliyun.core.annotation.NameInMap("traveler_list")
        private java.util.List<TravelerList> travelerList;

        @com.aliyun.core.annotation.NameInMap("trip_cause")
        private String tripCause;

        @com.aliyun.core.annotation.NameInMap("trip_day")
        private Integer tripDay;

        @com.aliyun.core.annotation.NameInMap("trip_title")
        private String tripTitle;

        @com.aliyun.core.annotation.NameInMap("type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("union_no")
        private String unionNo;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("user_name")
        private String userName;

        private ModuleList(Builder builder) {
            this.applyShowId = builder.applyShowId;
            this.approverList = builder.approverList;
            this.carRule = builder.carRule;
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
            this.paymentDepartmentId = builder.paymentDepartmentId;
            this.paymentDepartmentName = builder.paymentDepartmentName;
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
        public java.util.List<ApproverList> getApproverList() {
            return this.approverList;
        }

        /**
         * @return carRule
         */
        public CarRule getCarRule() {
            return this.carRule;
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
        public java.util.List<ExternalTravelerList> getExternalTravelerList() {
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
        public java.util.List<ItineraryList> getItineraryList() {
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
        public java.util.List<ItinerarySetList> getItinerarySetList() {
            return this.itinerarySetList;
        }

        /**
         * @return jobNo
         */
        public String getJobNo() {
            return this.jobNo;
        }

        /**
         * @return paymentDepartmentId
         */
        public String getPaymentDepartmentId() {
            return this.paymentDepartmentId;
        }

        /**
         * @return paymentDepartmentName
         */
        public String getPaymentDepartmentName() {
            return this.paymentDepartmentName;
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
        public java.util.List<TravelerList> getTravelerList() {
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
            private java.util.List<ApproverList> approverList; 
            private CarRule carRule; 
            private String corpId; 
            private String corpName; 
            private String departId; 
            private String departName; 
            private java.util.List<ExternalTravelerList> externalTravelerList; 
            private String flowCode; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private java.util.List<ItineraryList> itineraryList; 
            private Integer itineraryRule; 
            private java.util.List<ItinerarySetList> itinerarySetList; 
            private String jobNo; 
            private String paymentDepartmentId; 
            private String paymentDepartmentName; 
            private Integer status; 
            private String statusDesc; 
            private String thirdpartBusinessId; 
            private String thirdpartId; 
            private java.util.List<TravelerList> travelerList; 
            private String tripCause; 
            private Integer tripDay; 
            private String tripTitle; 
            private Integer type; 
            private String unionNo; 
            private String userId; 
            private String userName; 

            private Builder() {
            } 

            private Builder(ModuleList model) {
                this.applyShowId = model.applyShowId;
                this.approverList = model.approverList;
                this.carRule = model.carRule;
                this.corpId = model.corpId;
                this.corpName = model.corpName;
                this.departId = model.departId;
                this.departName = model.departName;
                this.externalTravelerList = model.externalTravelerList;
                this.flowCode = model.flowCode;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.itineraryList = model.itineraryList;
                this.itineraryRule = model.itineraryRule;
                this.itinerarySetList = model.itinerarySetList;
                this.jobNo = model.jobNo;
                this.paymentDepartmentId = model.paymentDepartmentId;
                this.paymentDepartmentName = model.paymentDepartmentName;
                this.status = model.status;
                this.statusDesc = model.statusDesc;
                this.thirdpartBusinessId = model.thirdpartBusinessId;
                this.thirdpartId = model.thirdpartId;
                this.travelerList = model.travelerList;
                this.tripCause = model.tripCause;
                this.tripDay = model.tripDay;
                this.tripTitle = model.tripTitle;
                this.type = model.type;
                this.unionNo = model.unionNo;
                this.userId = model.userId;
                this.userName = model.userName;
            } 

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
            public Builder approverList(java.util.List<ApproverList> approverList) {
                this.approverList = approverList;
                return this;
            }

            /**
             * car_rule.
             */
            public Builder carRule(CarRule carRule) {
                this.carRule = carRule;
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
            public Builder externalTravelerList(java.util.List<ExternalTravelerList> externalTravelerList) {
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
            public Builder itineraryList(java.util.List<ItineraryList> itineraryList) {
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
            public Builder itinerarySetList(java.util.List<ItinerarySetList> itinerarySetList) {
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
             * payment_department_id.
             */
            public Builder paymentDepartmentId(String paymentDepartmentId) {
                this.paymentDepartmentId = paymentDepartmentId;
                return this;
            }

            /**
             * payment_department_name.
             */
            public Builder paymentDepartmentName(String paymentDepartmentName) {
                this.paymentDepartmentName = paymentDepartmentName;
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
            public Builder travelerList(java.util.List<TravelerList> travelerList) {
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
