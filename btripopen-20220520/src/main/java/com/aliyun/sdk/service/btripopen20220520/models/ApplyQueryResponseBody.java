// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ApplyQueryResponseBody} extends {@link TeaModel}
 *
 * <p>ApplyQueryResponseBody</p>
 */
public class ApplyQueryResponseBody extends TeaModel {
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

    private ApplyQueryResponseBody(Builder builder) {
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

    public static ApplyQueryResponseBody create() {
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

        public ApplyQueryResponseBody build() {
            return new ApplyQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ApplyQueryResponseBody} extends {@link TeaModel}
     *
     * <p>ApplyQueryResponseBody</p>
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
     * {@link ApplyQueryResponseBody} extends {@link TeaModel}
     *
     * <p>ApplyQueryResponseBody</p>
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
     * {@link ApplyQueryResponseBody} extends {@link TeaModel}
     *
     * <p>ApplyQueryResponseBody</p>
     */
    public static class HotelCitys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("city_code")
        private String cityCode;

        @com.aliyun.core.annotation.NameInMap("city_name")
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("fee")
        private Long fee;

        private HotelCitys(Builder builder) {
            this.cityCode = builder.cityCode;
            this.cityName = builder.cityName;
            this.fee = builder.fee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotelCitys create() {
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

        /**
         * @return fee
         */
        public Long getFee() {
            return this.fee;
        }

        public static final class Builder {
            private String cityCode; 
            private String cityName; 
            private Long fee; 

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

            /**
             * fee.
             */
            public Builder fee(Long fee) {
                this.fee = fee;
                return this;
            }

            public HotelCitys build() {
                return new HotelCitys(this);
            } 

        } 

    }
    /**
     * 
     * {@link ApplyQueryResponseBody} extends {@link TeaModel}
     *
     * <p>ApplyQueryResponseBody</p>
     */
    public static class HotelIntlCitys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("city_code")
        private String cityCode;

        @com.aliyun.core.annotation.NameInMap("city_name")
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("fee")
        private Long fee;

        private HotelIntlCitys(Builder builder) {
            this.cityCode = builder.cityCode;
            this.cityName = builder.cityName;
            this.fee = builder.fee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotelIntlCitys create() {
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

        /**
         * @return fee
         */
        public Long getFee() {
            return this.fee;
        }

        public static final class Builder {
            private String cityCode; 
            private String cityName; 
            private Long fee; 

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

            /**
             * fee.
             */
            public Builder fee(Long fee) {
                this.fee = fee;
                return this;
            }

            public HotelIntlCitys build() {
                return new HotelIntlCitys(this);
            } 

        } 

    }
    /**
     * 
     * {@link ApplyQueryResponseBody} extends {@link TeaModel}
     *
     * <p>ApplyQueryResponseBody</p>
     */
    public static class ExternalTravelerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("attribute")
        private String attribute;

        @com.aliyun.core.annotation.NameInMap("business_discount")
        private Integer businessDiscount;

        @com.aliyun.core.annotation.NameInMap("cost_center_name")
        private String costCenterName;

        @com.aliyun.core.annotation.NameInMap("depart_id")
        private String departId;

        @com.aliyun.core.annotation.NameInMap("economy_discount")
        private Integer economyDiscount;

        @com.aliyun.core.annotation.NameInMap("external_user_id")
        private String externalUserId;

        @com.aliyun.core.annotation.NameInMap("first_discount")
        private Integer firstDiscount;

        @com.aliyun.core.annotation.NameInMap("flight_cabins")
        private String flightCabins;

        @com.aliyun.core.annotation.NameInMap("flight_intl_rule_code")
        private Long flightIntlRuleCode;

        @com.aliyun.core.annotation.NameInMap("flight_rule_code")
        private Long flightRuleCode;

        @com.aliyun.core.annotation.NameInMap("hotel_citys")
        private java.util.List < HotelCitys> hotelCitys;

        @com.aliyun.core.annotation.NameInMap("hotel_intl_citys")
        private java.util.List < HotelIntlCitys> hotelIntlCitys;

        @com.aliyun.core.annotation.NameInMap("hotel_intl_rule_code")
        private Long hotelIntlRuleCode;

        @com.aliyun.core.annotation.NameInMap("hotel_rule_code")
        private Long hotelRuleCode;

        @com.aliyun.core.annotation.NameInMap("invoice_name")
        private String invoiceName;

        @com.aliyun.core.annotation.NameInMap("payment_department_id")
        private String paymentDepartmentId;

        @com.aliyun.core.annotation.NameInMap("payment_department_name")
        private String paymentDepartmentName;

        @com.aliyun.core.annotation.NameInMap("premium_economy_discount")
        private Integer premiumEconomyDiscount;

        @com.aliyun.core.annotation.NameInMap("project_code")
        private String projectCode;

        @com.aliyun.core.annotation.NameInMap("project_title")
        private String projectTitle;

        @com.aliyun.core.annotation.NameInMap("reserve_type")
        private Integer reserveType;

        @com.aliyun.core.annotation.NameInMap("third_part_invoice_id")
        private String thirdPartInvoiceId;

        @com.aliyun.core.annotation.NameInMap("thirdpart_cost_center_id")
        private String thirdpartCostCenterId;

        @com.aliyun.core.annotation.NameInMap("thirdpart_depart_id")
        private String thirdpartDepartId;

        @com.aliyun.core.annotation.NameInMap("train_rule_code")
        private Long trainRuleCode;

        @com.aliyun.core.annotation.NameInMap("train_seats")
        private String trainSeats;

        @com.aliyun.core.annotation.NameInMap("user_name")
        private String userName;

        private ExternalTravelerList(Builder builder) {
            this.attribute = builder.attribute;
            this.businessDiscount = builder.businessDiscount;
            this.costCenterName = builder.costCenterName;
            this.departId = builder.departId;
            this.economyDiscount = builder.economyDiscount;
            this.externalUserId = builder.externalUserId;
            this.firstDiscount = builder.firstDiscount;
            this.flightCabins = builder.flightCabins;
            this.flightIntlRuleCode = builder.flightIntlRuleCode;
            this.flightRuleCode = builder.flightRuleCode;
            this.hotelCitys = builder.hotelCitys;
            this.hotelIntlCitys = builder.hotelIntlCitys;
            this.hotelIntlRuleCode = builder.hotelIntlRuleCode;
            this.hotelRuleCode = builder.hotelRuleCode;
            this.invoiceName = builder.invoiceName;
            this.paymentDepartmentId = builder.paymentDepartmentId;
            this.paymentDepartmentName = builder.paymentDepartmentName;
            this.premiumEconomyDiscount = builder.premiumEconomyDiscount;
            this.projectCode = builder.projectCode;
            this.projectTitle = builder.projectTitle;
            this.reserveType = builder.reserveType;
            this.thirdPartInvoiceId = builder.thirdPartInvoiceId;
            this.thirdpartCostCenterId = builder.thirdpartCostCenterId;
            this.thirdpartDepartId = builder.thirdpartDepartId;
            this.trainRuleCode = builder.trainRuleCode;
            this.trainSeats = builder.trainSeats;
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
         * @return businessDiscount
         */
        public Integer getBusinessDiscount() {
            return this.businessDiscount;
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
         * @return economyDiscount
         */
        public Integer getEconomyDiscount() {
            return this.economyDiscount;
        }

        /**
         * @return externalUserId
         */
        public String getExternalUserId() {
            return this.externalUserId;
        }

        /**
         * @return firstDiscount
         */
        public Integer getFirstDiscount() {
            return this.firstDiscount;
        }

        /**
         * @return flightCabins
         */
        public String getFlightCabins() {
            return this.flightCabins;
        }

        /**
         * @return flightIntlRuleCode
         */
        public Long getFlightIntlRuleCode() {
            return this.flightIntlRuleCode;
        }

        /**
         * @return flightRuleCode
         */
        public Long getFlightRuleCode() {
            return this.flightRuleCode;
        }

        /**
         * @return hotelCitys
         */
        public java.util.List < HotelCitys> getHotelCitys() {
            return this.hotelCitys;
        }

        /**
         * @return hotelIntlCitys
         */
        public java.util.List < HotelIntlCitys> getHotelIntlCitys() {
            return this.hotelIntlCitys;
        }

        /**
         * @return hotelIntlRuleCode
         */
        public Long getHotelIntlRuleCode() {
            return this.hotelIntlRuleCode;
        }

        /**
         * @return hotelRuleCode
         */
        public Long getHotelRuleCode() {
            return this.hotelRuleCode;
        }

        /**
         * @return invoiceName
         */
        public String getInvoiceName() {
            return this.invoiceName;
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
         * @return premiumEconomyDiscount
         */
        public Integer getPremiumEconomyDiscount() {
            return this.premiumEconomyDiscount;
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
         * @return reserveType
         */
        public Integer getReserveType() {
            return this.reserveType;
        }

        /**
         * @return thirdPartInvoiceId
         */
        public String getThirdPartInvoiceId() {
            return this.thirdPartInvoiceId;
        }

        /**
         * @return thirdpartCostCenterId
         */
        public String getThirdpartCostCenterId() {
            return this.thirdpartCostCenterId;
        }

        /**
         * @return thirdpartDepartId
         */
        public String getThirdpartDepartId() {
            return this.thirdpartDepartId;
        }

        /**
         * @return trainRuleCode
         */
        public Long getTrainRuleCode() {
            return this.trainRuleCode;
        }

        /**
         * @return trainSeats
         */
        public String getTrainSeats() {
            return this.trainSeats;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String attribute; 
            private Integer businessDiscount; 
            private String costCenterName; 
            private String departId; 
            private Integer economyDiscount; 
            private String externalUserId; 
            private Integer firstDiscount; 
            private String flightCabins; 
            private Long flightIntlRuleCode; 
            private Long flightRuleCode; 
            private java.util.List < HotelCitys> hotelCitys; 
            private java.util.List < HotelIntlCitys> hotelIntlCitys; 
            private Long hotelIntlRuleCode; 
            private Long hotelRuleCode; 
            private String invoiceName; 
            private String paymentDepartmentId; 
            private String paymentDepartmentName; 
            private Integer premiumEconomyDiscount; 
            private String projectCode; 
            private String projectTitle; 
            private Integer reserveType; 
            private String thirdPartInvoiceId; 
            private String thirdpartCostCenterId; 
            private String thirdpartDepartId; 
            private Long trainRuleCode; 
            private String trainSeats; 
            private String userName; 

            /**
             * attribute.
             */
            public Builder attribute(String attribute) {
                this.attribute = attribute;
                return this;
            }

            /**
             * business_discount.
             */
            public Builder businessDiscount(Integer businessDiscount) {
                this.businessDiscount = businessDiscount;
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
             * economy_discount.
             */
            public Builder economyDiscount(Integer economyDiscount) {
                this.economyDiscount = economyDiscount;
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
             * first_discount.
             */
            public Builder firstDiscount(Integer firstDiscount) {
                this.firstDiscount = firstDiscount;
                return this;
            }

            /**
             * flight_cabins.
             */
            public Builder flightCabins(String flightCabins) {
                this.flightCabins = flightCabins;
                return this;
            }

            /**
             * flight_intl_rule_code.
             */
            public Builder flightIntlRuleCode(Long flightIntlRuleCode) {
                this.flightIntlRuleCode = flightIntlRuleCode;
                return this;
            }

            /**
             * flight_rule_code.
             */
            public Builder flightRuleCode(Long flightRuleCode) {
                this.flightRuleCode = flightRuleCode;
                return this;
            }

            /**
             * hotel_citys.
             */
            public Builder hotelCitys(java.util.List < HotelCitys> hotelCitys) {
                this.hotelCitys = hotelCitys;
                return this;
            }

            /**
             * hotel_intl_citys.
             */
            public Builder hotelIntlCitys(java.util.List < HotelIntlCitys> hotelIntlCitys) {
                this.hotelIntlCitys = hotelIntlCitys;
                return this;
            }

            /**
             * hotel_intl_rule_code.
             */
            public Builder hotelIntlRuleCode(Long hotelIntlRuleCode) {
                this.hotelIntlRuleCode = hotelIntlRuleCode;
                return this;
            }

            /**
             * hotel_rule_code.
             */
            public Builder hotelRuleCode(Long hotelRuleCode) {
                this.hotelRuleCode = hotelRuleCode;
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
             * premium_economy_discount.
             */
            public Builder premiumEconomyDiscount(Integer premiumEconomyDiscount) {
                this.premiumEconomyDiscount = premiumEconomyDiscount;
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
             * reserve_type.
             */
            public Builder reserveType(Integer reserveType) {
                this.reserveType = reserveType;
                return this;
            }

            /**
             * third_part_invoice_id.
             */
            public Builder thirdPartInvoiceId(String thirdPartInvoiceId) {
                this.thirdPartInvoiceId = thirdPartInvoiceId;
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
             * thirdpart_depart_id.
             */
            public Builder thirdpartDepartId(String thirdpartDepartId) {
                this.thirdpartDepartId = thirdpartDepartId;
                return this;
            }

            /**
             * train_rule_code.
             */
            public Builder trainRuleCode(Long trainRuleCode) {
                this.trainRuleCode = trainRuleCode;
                return this;
            }

            /**
             * train_seats.
             */
            public Builder trainSeats(String trainSeats) {
                this.trainSeats = trainSeats;
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
     * {@link ApplyQueryResponseBody} extends {@link TeaModel}
     *
     * <p>ApplyQueryResponseBody</p>
     */
    public static class HotelShare extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("param")
        private String param;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private HotelShare(Builder builder) {
            this.param = builder.param;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotelShare create() {
            return builder().build();
        }

        /**
         * @return param
         */
        public String getParam() {
            return this.param;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String param; 
            private String type; 

            /**
             * param.
             */
            public Builder param(String param) {
                this.param = param;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public HotelShare build() {
                return new HotelShare(this);
            } 

        } 

    }
    /**
     * 
     * {@link ApplyQueryResponseBody} extends {@link TeaModel}
     *
     * <p>ApplyQueryResponseBody</p>
     */
    public static class ItineraryTravelStandard extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("hotel_available_nights_per_day")
        private Integer hotelAvailableNightsPerDay;

        private ItineraryTravelStandard(Builder builder) {
            this.hotelAvailableNightsPerDay = builder.hotelAvailableNightsPerDay;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItineraryTravelStandard create() {
            return builder().build();
        }

        /**
         * @return hotelAvailableNightsPerDay
         */
        public Integer getHotelAvailableNightsPerDay() {
            return this.hotelAvailableNightsPerDay;
        }

        public static final class Builder {
            private Integer hotelAvailableNightsPerDay; 

            /**
             * hotel_available_nights_per_day.
             */
            public Builder hotelAvailableNightsPerDay(Integer hotelAvailableNightsPerDay) {
                this.hotelAvailableNightsPerDay = hotelAvailableNightsPerDay;
                return this;
            }

            public ItineraryTravelStandard build() {
                return new ItineraryTravelStandard(this);
            } 

        } 

    }
    /**
     * 
     * {@link ApplyQueryResponseBody} extends {@link TeaModel}
     *
     * <p>ApplyQueryResponseBody</p>
     */
    public static class ItineraryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arr_city")
        private String arrCity;

        @com.aliyun.core.annotation.NameInMap("arr_city_code")
        private String arrCityCode;

        @com.aliyun.core.annotation.NameInMap("arr_date")
        private String arrDate;

        @com.aliyun.core.annotation.NameInMap("attribute")
        private String attribute;

        @com.aliyun.core.annotation.NameInMap("cost_center_name")
        private String costCenterName;

        @com.aliyun.core.annotation.NameInMap("dep_city")
        private String depCity;

        @com.aliyun.core.annotation.NameInMap("dep_city_code")
        private String depCityCode;

        @com.aliyun.core.annotation.NameInMap("dep_date")
        private String depDate;

        @com.aliyun.core.annotation.NameInMap("invoice_name")
        private String invoiceName;

        @com.aliyun.core.annotation.NameInMap("itinerary_id")
        private String itineraryId;

        @com.aliyun.core.annotation.NameInMap("itinerary_travel_standard")
        private ItineraryTravelStandard itineraryTravelStandard;

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
            this.arrCityCode = builder.arrCityCode;
            this.arrDate = builder.arrDate;
            this.attribute = builder.attribute;
            this.costCenterName = builder.costCenterName;
            this.depCity = builder.depCity;
            this.depCityCode = builder.depCityCode;
            this.depDate = builder.depDate;
            this.invoiceName = builder.invoiceName;
            this.itineraryId = builder.itineraryId;
            this.itineraryTravelStandard = builder.itineraryTravelStandard;
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
         * @return itineraryTravelStandard
         */
        public ItineraryTravelStandard getItineraryTravelStandard() {
            return this.itineraryTravelStandard;
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
            private String arrCityCode; 
            private String arrDate; 
            private String attribute; 
            private String costCenterName; 
            private String depCity; 
            private String depCityCode; 
            private String depDate; 
            private String invoiceName; 
            private String itineraryId; 
            private ItineraryTravelStandard itineraryTravelStandard; 
            private String projectCode; 
            private String projectTitle; 
            private String thirdpartCostCenterId; 
            private String thirdpartInvoiceId; 
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
             * itinerary_travel_standard.
             */
            public Builder itineraryTravelStandard(ItineraryTravelStandard itineraryTravelStandard) {
                this.itineraryTravelStandard = itineraryTravelStandard;
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
     * {@link ApplyQueryResponseBody} extends {@link TeaModel}
     *
     * <p>ApplyQueryResponseBody</p>
     */
    public static class ItinerarySetListItineraryTravelStandard extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("hotel_available_nights_per_day")
        private Integer hotelAvailableNightsPerDay;

        private ItinerarySetListItineraryTravelStandard(Builder builder) {
            this.hotelAvailableNightsPerDay = builder.hotelAvailableNightsPerDay;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItinerarySetListItineraryTravelStandard create() {
            return builder().build();
        }

        /**
         * @return hotelAvailableNightsPerDay
         */
        public Integer getHotelAvailableNightsPerDay() {
            return this.hotelAvailableNightsPerDay;
        }

        public static final class Builder {
            private Integer hotelAvailableNightsPerDay; 

            /**
             * hotel_available_nights_per_day.
             */
            public Builder hotelAvailableNightsPerDay(Integer hotelAvailableNightsPerDay) {
                this.hotelAvailableNightsPerDay = hotelAvailableNightsPerDay;
                return this;
            }

            public ItinerarySetListItineraryTravelStandard build() {
                return new ItinerarySetListItineraryTravelStandard(this);
            } 

        } 

    }
    /**
     * 
     * {@link ApplyQueryResponseBody} extends {@link TeaModel}
     *
     * <p>ApplyQueryResponseBody</p>
     */
    public static class ItinerarySetList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arr_date")
        private String arrDate;

        @com.aliyun.core.annotation.NameInMap("attribute")
        private String attribute;

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

        @com.aliyun.core.annotation.NameInMap("itinerary_travel_standard")
        private ItinerarySetListItineraryTravelStandard itineraryTravelStandard;

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
            this.attribute = builder.attribute;
            this.cityCodeSet = builder.cityCodeSet;
            this.citySet = builder.citySet;
            this.costCenterName = builder.costCenterName;
            this.depDate = builder.depDate;
            this.invoiceName = builder.invoiceName;
            this.itineraryId = builder.itineraryId;
            this.itineraryTravelStandard = builder.itineraryTravelStandard;
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
         * @return attribute
         */
        public String getAttribute() {
            return this.attribute;
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
         * @return itineraryTravelStandard
         */
        public ItinerarySetListItineraryTravelStandard getItineraryTravelStandard() {
            return this.itineraryTravelStandard;
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
            private String attribute; 
            private String cityCodeSet; 
            private String citySet; 
            private String costCenterName; 
            private String depDate; 
            private String invoiceName; 
            private String itineraryId; 
            private ItinerarySetListItineraryTravelStandard itineraryTravelStandard; 
            private String projectCode; 
            private String projectTitle; 
            private String thirdpartCostCenterId; 
            private String thirdpartInvoiceId; 
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
             * attribute.
             */
            public Builder attribute(String attribute) {
                this.attribute = attribute;
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
             * itinerary_travel_standard.
             */
            public Builder itineraryTravelStandard(ItinerarySetListItineraryTravelStandard itineraryTravelStandard) {
                this.itineraryTravelStandard = itineraryTravelStandard;
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
     * {@link ApplyQueryResponseBody} extends {@link TeaModel}
     *
     * <p>ApplyQueryResponseBody</p>
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
     * {@link ApplyQueryResponseBody} extends {@link TeaModel}
     *
     * <p>ApplyQueryResponseBody</p>
     */
    public static class TravelerListHotelCitys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("city_code")
        private String cityCode;

        @com.aliyun.core.annotation.NameInMap("city_name")
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("fee")
        private Long fee;

        private TravelerListHotelCitys(Builder builder) {
            this.cityCode = builder.cityCode;
            this.cityName = builder.cityName;
            this.fee = builder.fee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TravelerListHotelCitys create() {
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

        /**
         * @return fee
         */
        public Long getFee() {
            return this.fee;
        }

        public static final class Builder {
            private String cityCode; 
            private String cityName; 
            private Long fee; 

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

            /**
             * fee.
             */
            public Builder fee(Long fee) {
                this.fee = fee;
                return this;
            }

            public TravelerListHotelCitys build() {
                return new TravelerListHotelCitys(this);
            } 

        } 

    }
    /**
     * 
     * {@link ApplyQueryResponseBody} extends {@link TeaModel}
     *
     * <p>ApplyQueryResponseBody</p>
     */
    public static class TravelerListHotelIntlCitys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("city_code")
        private String cityCode;

        @com.aliyun.core.annotation.NameInMap("city_name")
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("fee")
        private Long fee;

        private TravelerListHotelIntlCitys(Builder builder) {
            this.cityCode = builder.cityCode;
            this.cityName = builder.cityName;
            this.fee = builder.fee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TravelerListHotelIntlCitys create() {
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

        /**
         * @return fee
         */
        public Long getFee() {
            return this.fee;
        }

        public static final class Builder {
            private String cityCode; 
            private String cityName; 
            private Long fee; 

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

            /**
             * fee.
             */
            public Builder fee(Long fee) {
                this.fee = fee;
                return this;
            }

            public TravelerListHotelIntlCitys build() {
                return new TravelerListHotelIntlCitys(this);
            } 

        } 

    }
    /**
     * 
     * {@link ApplyQueryResponseBody} extends {@link TeaModel}
     *
     * <p>ApplyQueryResponseBody</p>
     */
    public static class TravelerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("attribute")
        private String attribute;

        @com.aliyun.core.annotation.NameInMap("business_discount")
        private Integer businessDiscount;

        @com.aliyun.core.annotation.NameInMap("car_city_set")
        private java.util.List < CarCitySet> carCitySet;

        @com.aliyun.core.annotation.NameInMap("cost_center_name")
        private String costCenterName;

        @com.aliyun.core.annotation.NameInMap("depart_id")
        private String departId;

        @com.aliyun.core.annotation.NameInMap("economy_discount")
        private Integer economyDiscount;

        @com.aliyun.core.annotation.NameInMap("first_discount")
        private Integer firstDiscount;

        @com.aliyun.core.annotation.NameInMap("flight_cabins")
        private String flightCabins;

        @com.aliyun.core.annotation.NameInMap("flight_intl_rule_code")
        private Long flightIntlRuleCode;

        @com.aliyun.core.annotation.NameInMap("flight_rule_code")
        private Long flightRuleCode;

        @com.aliyun.core.annotation.NameInMap("hotel_citys")
        private java.util.List < TravelerListHotelCitys> hotelCitys;

        @com.aliyun.core.annotation.NameInMap("hotel_intl_citys")
        private java.util.List < TravelerListHotelIntlCitys> hotelIntlCitys;

        @com.aliyun.core.annotation.NameInMap("hotel_intl_rule_code")
        private Long hotelIntlRuleCode;

        @com.aliyun.core.annotation.NameInMap("hotel_rule_code")
        private Long hotelRuleCode;

        @com.aliyun.core.annotation.NameInMap("invoice_name")
        private String invoiceName;

        @com.aliyun.core.annotation.NameInMap("payment_department_id")
        private String paymentDepartmentId;

        @com.aliyun.core.annotation.NameInMap("payment_department_name")
        private String paymentDepartmentName;

        @com.aliyun.core.annotation.NameInMap("premium_economy_discount")
        private Integer premiumEconomyDiscount;

        @com.aliyun.core.annotation.NameInMap("project_code")
        private String projectCode;

        @com.aliyun.core.annotation.NameInMap("project_title")
        private String projectTitle;

        @com.aliyun.core.annotation.NameInMap("reserve_type")
        private Integer reserveType;

        @com.aliyun.core.annotation.NameInMap("third_part_invoice_id")
        private String thirdPartInvoiceId;

        @com.aliyun.core.annotation.NameInMap("thirdpart_cost_center_id")
        private String thirdpartCostCenterId;

        @com.aliyun.core.annotation.NameInMap("thirdpart_depart_id")
        private String thirdpartDepartId;

        @com.aliyun.core.annotation.NameInMap("train_rule_code")
        private Long trainRuleCode;

        @com.aliyun.core.annotation.NameInMap("train_seats")
        private String trainSeats;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("user_name")
        private String userName;

        private TravelerList(Builder builder) {
            this.attribute = builder.attribute;
            this.businessDiscount = builder.businessDiscount;
            this.carCitySet = builder.carCitySet;
            this.costCenterName = builder.costCenterName;
            this.departId = builder.departId;
            this.economyDiscount = builder.economyDiscount;
            this.firstDiscount = builder.firstDiscount;
            this.flightCabins = builder.flightCabins;
            this.flightIntlRuleCode = builder.flightIntlRuleCode;
            this.flightRuleCode = builder.flightRuleCode;
            this.hotelCitys = builder.hotelCitys;
            this.hotelIntlCitys = builder.hotelIntlCitys;
            this.hotelIntlRuleCode = builder.hotelIntlRuleCode;
            this.hotelRuleCode = builder.hotelRuleCode;
            this.invoiceName = builder.invoiceName;
            this.paymentDepartmentId = builder.paymentDepartmentId;
            this.paymentDepartmentName = builder.paymentDepartmentName;
            this.premiumEconomyDiscount = builder.premiumEconomyDiscount;
            this.projectCode = builder.projectCode;
            this.projectTitle = builder.projectTitle;
            this.reserveType = builder.reserveType;
            this.thirdPartInvoiceId = builder.thirdPartInvoiceId;
            this.thirdpartCostCenterId = builder.thirdpartCostCenterId;
            this.thirdpartDepartId = builder.thirdpartDepartId;
            this.trainRuleCode = builder.trainRuleCode;
            this.trainSeats = builder.trainSeats;
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
         * @return businessDiscount
         */
        public Integer getBusinessDiscount() {
            return this.businessDiscount;
        }

        /**
         * @return carCitySet
         */
        public java.util.List < CarCitySet> getCarCitySet() {
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
         * @return economyDiscount
         */
        public Integer getEconomyDiscount() {
            return this.economyDiscount;
        }

        /**
         * @return firstDiscount
         */
        public Integer getFirstDiscount() {
            return this.firstDiscount;
        }

        /**
         * @return flightCabins
         */
        public String getFlightCabins() {
            return this.flightCabins;
        }

        /**
         * @return flightIntlRuleCode
         */
        public Long getFlightIntlRuleCode() {
            return this.flightIntlRuleCode;
        }

        /**
         * @return flightRuleCode
         */
        public Long getFlightRuleCode() {
            return this.flightRuleCode;
        }

        /**
         * @return hotelCitys
         */
        public java.util.List < TravelerListHotelCitys> getHotelCitys() {
            return this.hotelCitys;
        }

        /**
         * @return hotelIntlCitys
         */
        public java.util.List < TravelerListHotelIntlCitys> getHotelIntlCitys() {
            return this.hotelIntlCitys;
        }

        /**
         * @return hotelIntlRuleCode
         */
        public Long getHotelIntlRuleCode() {
            return this.hotelIntlRuleCode;
        }

        /**
         * @return hotelRuleCode
         */
        public Long getHotelRuleCode() {
            return this.hotelRuleCode;
        }

        /**
         * @return invoiceName
         */
        public String getInvoiceName() {
            return this.invoiceName;
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
         * @return premiumEconomyDiscount
         */
        public Integer getPremiumEconomyDiscount() {
            return this.premiumEconomyDiscount;
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
         * @return reserveType
         */
        public Integer getReserveType() {
            return this.reserveType;
        }

        /**
         * @return thirdPartInvoiceId
         */
        public String getThirdPartInvoiceId() {
            return this.thirdPartInvoiceId;
        }

        /**
         * @return thirdpartCostCenterId
         */
        public String getThirdpartCostCenterId() {
            return this.thirdpartCostCenterId;
        }

        /**
         * @return thirdpartDepartId
         */
        public String getThirdpartDepartId() {
            return this.thirdpartDepartId;
        }

        /**
         * @return trainRuleCode
         */
        public Long getTrainRuleCode() {
            return this.trainRuleCode;
        }

        /**
         * @return trainSeats
         */
        public String getTrainSeats() {
            return this.trainSeats;
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
            private Integer businessDiscount; 
            private java.util.List < CarCitySet> carCitySet; 
            private String costCenterName; 
            private String departId; 
            private Integer economyDiscount; 
            private Integer firstDiscount; 
            private String flightCabins; 
            private Long flightIntlRuleCode; 
            private Long flightRuleCode; 
            private java.util.List < TravelerListHotelCitys> hotelCitys; 
            private java.util.List < TravelerListHotelIntlCitys> hotelIntlCitys; 
            private Long hotelIntlRuleCode; 
            private Long hotelRuleCode; 
            private String invoiceName; 
            private String paymentDepartmentId; 
            private String paymentDepartmentName; 
            private Integer premiumEconomyDiscount; 
            private String projectCode; 
            private String projectTitle; 
            private Integer reserveType; 
            private String thirdPartInvoiceId; 
            private String thirdpartCostCenterId; 
            private String thirdpartDepartId; 
            private Long trainRuleCode; 
            private String trainSeats; 
            private String userId; 
            private String userName; 

            /**
             * attribute.
             */
            public Builder attribute(String attribute) {
                this.attribute = attribute;
                return this;
            }

            /**
             * business_discount.
             */
            public Builder businessDiscount(Integer businessDiscount) {
                this.businessDiscount = businessDiscount;
                return this;
            }

            /**
             * car_city_set.
             */
            public Builder carCitySet(java.util.List < CarCitySet> carCitySet) {
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
             * economy_discount.
             */
            public Builder economyDiscount(Integer economyDiscount) {
                this.economyDiscount = economyDiscount;
                return this;
            }

            /**
             * first_discount.
             */
            public Builder firstDiscount(Integer firstDiscount) {
                this.firstDiscount = firstDiscount;
                return this;
            }

            /**
             * flight_cabins.
             */
            public Builder flightCabins(String flightCabins) {
                this.flightCabins = flightCabins;
                return this;
            }

            /**
             * flight_intl_rule_code.
             */
            public Builder flightIntlRuleCode(Long flightIntlRuleCode) {
                this.flightIntlRuleCode = flightIntlRuleCode;
                return this;
            }

            /**
             * flight_rule_code.
             */
            public Builder flightRuleCode(Long flightRuleCode) {
                this.flightRuleCode = flightRuleCode;
                return this;
            }

            /**
             * hotel_citys.
             */
            public Builder hotelCitys(java.util.List < TravelerListHotelCitys> hotelCitys) {
                this.hotelCitys = hotelCitys;
                return this;
            }

            /**
             * hotel_intl_citys.
             */
            public Builder hotelIntlCitys(java.util.List < TravelerListHotelIntlCitys> hotelIntlCitys) {
                this.hotelIntlCitys = hotelIntlCitys;
                return this;
            }

            /**
             * hotel_intl_rule_code.
             */
            public Builder hotelIntlRuleCode(Long hotelIntlRuleCode) {
                this.hotelIntlRuleCode = hotelIntlRuleCode;
                return this;
            }

            /**
             * hotel_rule_code.
             */
            public Builder hotelRuleCode(Long hotelRuleCode) {
                this.hotelRuleCode = hotelRuleCode;
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
             * premium_economy_discount.
             */
            public Builder premiumEconomyDiscount(Integer premiumEconomyDiscount) {
                this.premiumEconomyDiscount = premiumEconomyDiscount;
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
             * reserve_type.
             */
            public Builder reserveType(Integer reserveType) {
                this.reserveType = reserveType;
                return this;
            }

            /**
             * third_part_invoice_id.
             */
            public Builder thirdPartInvoiceId(String thirdPartInvoiceId) {
                this.thirdPartInvoiceId = thirdPartInvoiceId;
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
             * thirdpart_depart_id.
             */
            public Builder thirdpartDepartId(String thirdpartDepartId) {
                this.thirdpartDepartId = thirdpartDepartId;
                return this;
            }

            /**
             * train_rule_code.
             */
            public Builder trainRuleCode(Long trainRuleCode) {
                this.trainRuleCode = trainRuleCode;
                return this;
            }

            /**
             * train_seats.
             */
            public Builder trainSeats(String trainSeats) {
                this.trainSeats = trainSeats;
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
     * {@link ApplyQueryResponseBody} extends {@link TeaModel}
     *
     * <p>ApplyQueryResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apply_show_id")
        private String applyShowId;

        @com.aliyun.core.annotation.NameInMap("approver_list")
        private java.util.List < ApproverList> approverList;

        @com.aliyun.core.annotation.NameInMap("budget")
        private Long budget;

        @com.aliyun.core.annotation.NameInMap("budget_merge")
        private Integer budgetMerge;

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

        @com.aliyun.core.annotation.NameInMap("extend_field")
        private String extendField;

        @com.aliyun.core.annotation.NameInMap("external_traveler_list")
        private java.util.List < ExternalTravelerList> externalTravelerList;

        @com.aliyun.core.annotation.NameInMap("flight_budget")
        private Long flightBudget;

        @com.aliyun.core.annotation.NameInMap("gmt_create")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmt_modified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("hotel_budget")
        private Long hotelBudget;

        @com.aliyun.core.annotation.NameInMap("hotel_share")
        private HotelShare hotelShare;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("itinerary_list")
        private java.util.List < ItineraryList> itineraryList;

        @com.aliyun.core.annotation.NameInMap("itinerary_rule")
        private Integer itineraryRule;

        @com.aliyun.core.annotation.NameInMap("itinerary_set_list")
        private java.util.List < ItinerarySetList> itinerarySetList;

        @com.aliyun.core.annotation.NameInMap("limit_traveler")
        private Integer limitTraveler;

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

        @com.aliyun.core.annotation.NameInMap("together_book_rule")
        private Integer togetherBookRule;

        @com.aliyun.core.annotation.NameInMap("train_budget")
        private Long trainBudget;

        @com.aliyun.core.annotation.NameInMap("traveler_list")
        private java.util.List < TravelerList> travelerList;

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

        @com.aliyun.core.annotation.NameInMap("vehicle_budget")
        private Long vehicleBudget;

        private Module(Builder builder) {
            this.applyShowId = builder.applyShowId;
            this.approverList = builder.approverList;
            this.budget = builder.budget;
            this.budgetMerge = builder.budgetMerge;
            this.carRule = builder.carRule;
            this.corpId = builder.corpId;
            this.corpName = builder.corpName;
            this.departId = builder.departId;
            this.departName = builder.departName;
            this.extendField = builder.extendField;
            this.externalTravelerList = builder.externalTravelerList;
            this.flightBudget = builder.flightBudget;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.hotelBudget = builder.hotelBudget;
            this.hotelShare = builder.hotelShare;
            this.id = builder.id;
            this.itineraryList = builder.itineraryList;
            this.itineraryRule = builder.itineraryRule;
            this.itinerarySetList = builder.itinerarySetList;
            this.limitTraveler = builder.limitTraveler;
            this.paymentDepartmentId = builder.paymentDepartmentId;
            this.paymentDepartmentName = builder.paymentDepartmentName;
            this.status = builder.status;
            this.statusDesc = builder.statusDesc;
            this.thirdpartBusinessId = builder.thirdpartBusinessId;
            this.thirdpartId = builder.thirdpartId;
            this.togetherBookRule = builder.togetherBookRule;
            this.trainBudget = builder.trainBudget;
            this.travelerList = builder.travelerList;
            this.tripCause = builder.tripCause;
            this.tripDay = builder.tripDay;
            this.tripTitle = builder.tripTitle;
            this.type = builder.type;
            this.unionNo = builder.unionNo;
            this.userId = builder.userId;
            this.userName = builder.userName;
            this.vehicleBudget = builder.vehicleBudget;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
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
         * @return budget
         */
        public Long getBudget() {
            return this.budget;
        }

        /**
         * @return budgetMerge
         */
        public Integer getBudgetMerge() {
            return this.budgetMerge;
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
         * @return extendField
         */
        public String getExtendField() {
            return this.extendField;
        }

        /**
         * @return externalTravelerList
         */
        public java.util.List < ExternalTravelerList> getExternalTravelerList() {
            return this.externalTravelerList;
        }

        /**
         * @return flightBudget
         */
        public Long getFlightBudget() {
            return this.flightBudget;
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
         * @return hotelBudget
         */
        public Long getHotelBudget() {
            return this.hotelBudget;
        }

        /**
         * @return hotelShare
         */
        public HotelShare getHotelShare() {
            return this.hotelShare;
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
         * @return limitTraveler
         */
        public Integer getLimitTraveler() {
            return this.limitTraveler;
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
         * @return togetherBookRule
         */
        public Integer getTogetherBookRule() {
            return this.togetherBookRule;
        }

        /**
         * @return trainBudget
         */
        public Long getTrainBudget() {
            return this.trainBudget;
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

        /**
         * @return vehicleBudget
         */
        public Long getVehicleBudget() {
            return this.vehicleBudget;
        }

        public static final class Builder {
            private String applyShowId; 
            private java.util.List < ApproverList> approverList; 
            private Long budget; 
            private Integer budgetMerge; 
            private CarRule carRule; 
            private String corpId; 
            private String corpName; 
            private String departId; 
            private String departName; 
            private String extendField; 
            private java.util.List < ExternalTravelerList> externalTravelerList; 
            private Long flightBudget; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long hotelBudget; 
            private HotelShare hotelShare; 
            private Long id; 
            private java.util.List < ItineraryList> itineraryList; 
            private Integer itineraryRule; 
            private java.util.List < ItinerarySetList> itinerarySetList; 
            private Integer limitTraveler; 
            private String paymentDepartmentId; 
            private String paymentDepartmentName; 
            private Integer status; 
            private String statusDesc; 
            private String thirdpartBusinessId; 
            private String thirdpartId; 
            private Integer togetherBookRule; 
            private Long trainBudget; 
            private java.util.List < TravelerList> travelerList; 
            private String tripCause; 
            private Integer tripDay; 
            private String tripTitle; 
            private Integer type; 
            private String unionNo; 
            private String userId; 
            private String userName; 
            private Long vehicleBudget; 

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
             * budget.
             */
            public Builder budget(Long budget) {
                this.budget = budget;
                return this;
            }

            /**
             * budget_merge.
             */
            public Builder budgetMerge(Integer budgetMerge) {
                this.budgetMerge = budgetMerge;
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
             * <p>补充描述，账单中将会体现此字段的值。可以用于企业的统计和对账</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;cost_center&quot;:&quot;成本中心&quot;}</p>
             */
            public Builder extendField(String extendField) {
                this.extendField = extendField;
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
             * flight_budget.
             */
            public Builder flightBudget(Long flightBudget) {
                this.flightBudget = flightBudget;
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
             * hotel_budget.
             */
            public Builder hotelBudget(Long hotelBudget) {
                this.hotelBudget = hotelBudget;
                return this;
            }

            /**
             * hotel_share.
             */
            public Builder hotelShare(HotelShare hotelShare) {
                this.hotelShare = hotelShare;
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
             * limit_traveler.
             */
            public Builder limitTraveler(Integer limitTraveler) {
                this.limitTraveler = limitTraveler;
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
             * together_book_rule.
             */
            public Builder togetherBookRule(Integer togetherBookRule) {
                this.togetherBookRule = togetherBookRule;
                return this;
            }

            /**
             * train_budget.
             */
            public Builder trainBudget(Long trainBudget) {
                this.trainBudget = trainBudget;
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

            /**
             * vehicle_budget.
             */
            public Builder vehicleBudget(Long vehicleBudget) {
                this.vehicleBudget = vehicleBudget;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
