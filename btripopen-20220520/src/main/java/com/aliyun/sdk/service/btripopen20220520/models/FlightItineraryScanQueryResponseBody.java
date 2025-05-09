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
 * {@link FlightItineraryScanQueryResponseBody} extends {@link TeaModel}
 *
 * <p>FlightItineraryScanQueryResponseBody</p>
 */
public class FlightItineraryScanQueryResponseBody extends TeaModel {
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

    private FlightItineraryScanQueryResponseBody(Builder builder) {
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

    public static FlightItineraryScanQueryResponseBody create() {
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

        private Builder(FlightItineraryScanQueryResponseBody model) {
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
         * <p>A5009956-1077-52FB-B520-EA8C7E91D722</p>
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
         * <p>traceId</p>
         * 
         * <strong>example:</strong>
         * <p>21041ce316577904808056433edbb2</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public FlightItineraryScanQueryResponseBody build() {
            return new FlightItineraryScanQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link FlightItineraryScanQueryResponseBody} extends {@link TeaModel}
     *
     * <p>FlightItineraryScanQueryResponseBody</p>
     */
    public static class Flights extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arrival_station")
        private String arrivalStation;

        @com.aliyun.core.annotation.NameInMap("cabin_class")
        private String cabinClass;

        @com.aliyun.core.annotation.NameInMap("carrier")
        private String carrier;

        @com.aliyun.core.annotation.NameInMap("departure_station")
        private String departureStation;

        @com.aliyun.core.annotation.NameInMap("flight_date")
        private String flightDate;

        @com.aliyun.core.annotation.NameInMap("flight_number")
        private String flightNumber;

        @com.aliyun.core.annotation.NameInMap("flight_time")
        private String flightTime;

        @com.aliyun.core.annotation.NameInMap("free_baggage_allowance")
        private String freeBaggageAllowance;

        @com.aliyun.core.annotation.NameInMap("index")
        private String index;

        @com.aliyun.core.annotation.NameInMap("seat_class")
        private String seatClass;

        @com.aliyun.core.annotation.NameInMap("valid_from_date")
        private String validFromDate;

        @com.aliyun.core.annotation.NameInMap("valid_to_date")
        private String validToDate;

        private Flights(Builder builder) {
            this.arrivalStation = builder.arrivalStation;
            this.cabinClass = builder.cabinClass;
            this.carrier = builder.carrier;
            this.departureStation = builder.departureStation;
            this.flightDate = builder.flightDate;
            this.flightNumber = builder.flightNumber;
            this.flightTime = builder.flightTime;
            this.freeBaggageAllowance = builder.freeBaggageAllowance;
            this.index = builder.index;
            this.seatClass = builder.seatClass;
            this.validFromDate = builder.validFromDate;
            this.validToDate = builder.validToDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Flights create() {
            return builder().build();
        }

        /**
         * @return arrivalStation
         */
        public String getArrivalStation() {
            return this.arrivalStation;
        }

        /**
         * @return cabinClass
         */
        public String getCabinClass() {
            return this.cabinClass;
        }

        /**
         * @return carrier
         */
        public String getCarrier() {
            return this.carrier;
        }

        /**
         * @return departureStation
         */
        public String getDepartureStation() {
            return this.departureStation;
        }

        /**
         * @return flightDate
         */
        public String getFlightDate() {
            return this.flightDate;
        }

        /**
         * @return flightNumber
         */
        public String getFlightNumber() {
            return this.flightNumber;
        }

        /**
         * @return flightTime
         */
        public String getFlightTime() {
            return this.flightTime;
        }

        /**
         * @return freeBaggageAllowance
         */
        public String getFreeBaggageAllowance() {
            return this.freeBaggageAllowance;
        }

        /**
         * @return index
         */
        public String getIndex() {
            return this.index;
        }

        /**
         * @return seatClass
         */
        public String getSeatClass() {
            return this.seatClass;
        }

        /**
         * @return validFromDate
         */
        public String getValidFromDate() {
            return this.validFromDate;
        }

        /**
         * @return validToDate
         */
        public String getValidToDate() {
            return this.validToDate;
        }

        public static final class Builder {
            private String arrivalStation; 
            private String cabinClass; 
            private String carrier; 
            private String departureStation; 
            private String flightDate; 
            private String flightNumber; 
            private String flightTime; 
            private String freeBaggageAllowance; 
            private String index; 
            private String seatClass; 
            private String validFromDate; 
            private String validToDate; 

            private Builder() {
            } 

            private Builder(Flights model) {
                this.arrivalStation = model.arrivalStation;
                this.cabinClass = model.cabinClass;
                this.carrier = model.carrier;
                this.departureStation = model.departureStation;
                this.flightDate = model.flightDate;
                this.flightNumber = model.flightNumber;
                this.flightTime = model.flightTime;
                this.freeBaggageAllowance = model.freeBaggageAllowance;
                this.index = model.index;
                this.seatClass = model.seatClass;
                this.validFromDate = model.validFromDate;
                this.validToDate = model.validToDate;
            } 

            /**
             * <p>航班至</p>
             */
            public Builder arrivalStation(String arrivalStation) {
                this.arrivalStation = arrivalStation;
                return this;
            }

            /**
             * <p>座位等级</p>
             * 
             * <strong>example:</strong>
             * <p>M</p>
             */
            public Builder cabinClass(String cabinClass) {
                this.cabinClass = cabinClass;
                return this;
            }

            /**
             * <p>承运人</p>
             */
            public Builder carrier(String carrier) {
                this.carrier = carrier;
                return this;
            }

            /**
             * <p>航班从</p>
             */
            public Builder departureStation(String departureStation) {
                this.departureStation = departureStation;
                return this;
            }

            /**
             * <p>日期</p>
             * 
             * <strong>example:</strong>
             * <p>2018-11-18</p>
             */
            public Builder flightDate(String flightDate) {
                this.flightDate = flightDate;
                return this;
            }

            /**
             * <p>航班号</p>
             * 
             * <strong>example:</strong>
             * <p>MU2271</p>
             */
            public Builder flightNumber(String flightNumber) {
                this.flightNumber = flightNumber;
                return this;
            }

            /**
             * <p>时间</p>
             * 
             * <strong>example:</strong>
             * <p>18:25</p>
             */
            public Builder flightTime(String flightTime) {
                this.flightTime = flightTime;
                return this;
            }

            /**
             * <p>免费行李</p>
             * 
             * <strong>example:</strong>
             * <p>20K</p>
             */
            public Builder freeBaggageAllowance(String freeBaggageAllowance) {
                this.freeBaggageAllowance = freeBaggageAllowance;
                return this;
            }

            /**
             * <p>行号</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * <p>客票级别</p>
             * 
             * <strong>example:</strong>
             * <p>M</p>
             */
            public Builder seatClass(String seatClass) {
                this.seatClass = seatClass;
                return this;
            }

            /**
             * <p>客票生效日期</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-01</p>
             */
            public Builder validFromDate(String validFromDate) {
                this.validFromDate = validFromDate;
                return this;
            }

            /**
             * <p>有效截止日期</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-01</p>
             */
            public Builder validToDate(String validToDate) {
                this.validToDate = validToDate;
                return this;
            }

            public Flights build() {
                return new Flights(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightItineraryScanQueryResponseBody} extends {@link TeaModel}
     *
     * <p>FlightItineraryScanQueryResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agent_code")
        private String agentCode;

        @com.aliyun.core.annotation.NameInMap("apply_id")
        private String applyId;

        @com.aliyun.core.annotation.NameInMap("bill_date")
        private String billDate;

        @com.aliyun.core.annotation.NameInMap("build")
        private String build;

        @com.aliyun.core.annotation.NameInMap("cost_center")
        private String costCenter;

        @com.aliyun.core.annotation.NameInMap("department")
        private String department;

        @com.aliyun.core.annotation.NameInMap("flights")
        private java.util.List<Flights> flights;

        @com.aliyun.core.annotation.NameInMap("fuel_surcharge")
        private String fuelSurcharge;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("insurance")
        private String insurance;

        @com.aliyun.core.annotation.NameInMap("invoice_title")
        private String invoiceTitle;

        @com.aliyun.core.annotation.NameInMap("invoice_type")
        private Integer invoiceType;

        @com.aliyun.core.annotation.NameInMap("issue_company")
        private String issueCompany;

        @com.aliyun.core.annotation.NameInMap("issue_date")
        private String issueDate;

        @com.aliyun.core.annotation.NameInMap("itinerary_num")
        private String itineraryNum;

        @com.aliyun.core.annotation.NameInMap("ofd_oss_url")
        private String ofdOssUrl;

        @com.aliyun.core.annotation.NameInMap("order_id")
        private Long orderId;

        @com.aliyun.core.annotation.NameInMap("oss_url")
        private String ossUrl;

        @com.aliyun.core.annotation.NameInMap("passenger_name")
        private String passengerName;

        @com.aliyun.core.annotation.NameInMap("pdf_oss_url")
        private String pdfOssUrl;

        @com.aliyun.core.annotation.NameInMap("project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("prompt_message")
        private String promptMessage;

        @com.aliyun.core.annotation.NameInMap("purchaser_name")
        private String purchaserName;

        @com.aliyun.core.annotation.NameInMap("purchaser_tax_no")
        private String purchaserTaxNo;

        @com.aliyun.core.annotation.NameInMap("purchaser_type")
        private Integer purchaserType;

        @com.aliyun.core.annotation.NameInMap("tax_amount")
        private String taxAmount;

        @com.aliyun.core.annotation.NameInMap("tax_rate")
        private String taxRate;

        @com.aliyun.core.annotation.NameInMap("ticket_no")
        private String ticketNo;

        @com.aliyun.core.annotation.NameInMap("ticket_price")
        private String ticketPrice;

        @com.aliyun.core.annotation.NameInMap("total_price")
        private String totalPrice;

        @com.aliyun.core.annotation.NameInMap("validation_code")
        private String validationCode;

        private Items(Builder builder) {
            this.agentCode = builder.agentCode;
            this.applyId = builder.applyId;
            this.billDate = builder.billDate;
            this.build = builder.build;
            this.costCenter = builder.costCenter;
            this.department = builder.department;
            this.flights = builder.flights;
            this.fuelSurcharge = builder.fuelSurcharge;
            this.id = builder.id;
            this.insurance = builder.insurance;
            this.invoiceTitle = builder.invoiceTitle;
            this.invoiceType = builder.invoiceType;
            this.issueCompany = builder.issueCompany;
            this.issueDate = builder.issueDate;
            this.itineraryNum = builder.itineraryNum;
            this.ofdOssUrl = builder.ofdOssUrl;
            this.orderId = builder.orderId;
            this.ossUrl = builder.ossUrl;
            this.passengerName = builder.passengerName;
            this.pdfOssUrl = builder.pdfOssUrl;
            this.project = builder.project;
            this.promptMessage = builder.promptMessage;
            this.purchaserName = builder.purchaserName;
            this.purchaserTaxNo = builder.purchaserTaxNo;
            this.purchaserType = builder.purchaserType;
            this.taxAmount = builder.taxAmount;
            this.taxRate = builder.taxRate;
            this.ticketNo = builder.ticketNo;
            this.ticketPrice = builder.ticketPrice;
            this.totalPrice = builder.totalPrice;
            this.validationCode = builder.validationCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return agentCode
         */
        public String getAgentCode() {
            return this.agentCode;
        }

        /**
         * @return applyId
         */
        public String getApplyId() {
            return this.applyId;
        }

        /**
         * @return billDate
         */
        public String getBillDate() {
            return this.billDate;
        }

        /**
         * @return build
         */
        public String getBuild() {
            return this.build;
        }

        /**
         * @return costCenter
         */
        public String getCostCenter() {
            return this.costCenter;
        }

        /**
         * @return department
         */
        public String getDepartment() {
            return this.department;
        }

        /**
         * @return flights
         */
        public java.util.List<Flights> getFlights() {
            return this.flights;
        }

        /**
         * @return fuelSurcharge
         */
        public String getFuelSurcharge() {
            return this.fuelSurcharge;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return insurance
         */
        public String getInsurance() {
            return this.insurance;
        }

        /**
         * @return invoiceTitle
         */
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        /**
         * @return invoiceType
         */
        public Integer getInvoiceType() {
            return this.invoiceType;
        }

        /**
         * @return issueCompany
         */
        public String getIssueCompany() {
            return this.issueCompany;
        }

        /**
         * @return issueDate
         */
        public String getIssueDate() {
            return this.issueDate;
        }

        /**
         * @return itineraryNum
         */
        public String getItineraryNum() {
            return this.itineraryNum;
        }

        /**
         * @return ofdOssUrl
         */
        public String getOfdOssUrl() {
            return this.ofdOssUrl;
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
        }

        /**
         * @return ossUrl
         */
        public String getOssUrl() {
            return this.ossUrl;
        }

        /**
         * @return passengerName
         */
        public String getPassengerName() {
            return this.passengerName;
        }

        /**
         * @return pdfOssUrl
         */
        public String getPdfOssUrl() {
            return this.pdfOssUrl;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return promptMessage
         */
        public String getPromptMessage() {
            return this.promptMessage;
        }

        /**
         * @return purchaserName
         */
        public String getPurchaserName() {
            return this.purchaserName;
        }

        /**
         * @return purchaserTaxNo
         */
        public String getPurchaserTaxNo() {
            return this.purchaserTaxNo;
        }

        /**
         * @return purchaserType
         */
        public Integer getPurchaserType() {
            return this.purchaserType;
        }

        /**
         * @return taxAmount
         */
        public String getTaxAmount() {
            return this.taxAmount;
        }

        /**
         * @return taxRate
         */
        public String getTaxRate() {
            return this.taxRate;
        }

        /**
         * @return ticketNo
         */
        public String getTicketNo() {
            return this.ticketNo;
        }

        /**
         * @return ticketPrice
         */
        public String getTicketPrice() {
            return this.ticketPrice;
        }

        /**
         * @return totalPrice
         */
        public String getTotalPrice() {
            return this.totalPrice;
        }

        /**
         * @return validationCode
         */
        public String getValidationCode() {
            return this.validationCode;
        }

        public static final class Builder {
            private String agentCode; 
            private String applyId; 
            private String billDate; 
            private String build; 
            private String costCenter; 
            private String department; 
            private java.util.List<Flights> flights; 
            private String fuelSurcharge; 
            private String id; 
            private String insurance; 
            private String invoiceTitle; 
            private Integer invoiceType; 
            private String issueCompany; 
            private String issueDate; 
            private String itineraryNum; 
            private String ofdOssUrl; 
            private Long orderId; 
            private String ossUrl; 
            private String passengerName; 
            private String pdfOssUrl; 
            private String project; 
            private String promptMessage; 
            private String purchaserName; 
            private String purchaserTaxNo; 
            private Integer purchaserType; 
            private String taxAmount; 
            private String taxRate; 
            private String ticketNo; 
            private String ticketPrice; 
            private String totalPrice; 
            private String validationCode; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.agentCode = model.agentCode;
                this.applyId = model.applyId;
                this.billDate = model.billDate;
                this.build = model.build;
                this.costCenter = model.costCenter;
                this.department = model.department;
                this.flights = model.flights;
                this.fuelSurcharge = model.fuelSurcharge;
                this.id = model.id;
                this.insurance = model.insurance;
                this.invoiceTitle = model.invoiceTitle;
                this.invoiceType = model.invoiceType;
                this.issueCompany = model.issueCompany;
                this.issueDate = model.issueDate;
                this.itineraryNum = model.itineraryNum;
                this.ofdOssUrl = model.ofdOssUrl;
                this.orderId = model.orderId;
                this.ossUrl = model.ossUrl;
                this.passengerName = model.passengerName;
                this.pdfOssUrl = model.pdfOssUrl;
                this.project = model.project;
                this.promptMessage = model.promptMessage;
                this.purchaserName = model.purchaserName;
                this.purchaserTaxNo = model.purchaserTaxNo;
                this.purchaserType = model.purchaserType;
                this.taxAmount = model.taxAmount;
                this.taxRate = model.taxRate;
                this.ticketNo = model.ticketNo;
                this.ticketPrice = model.ticketPrice;
                this.totalPrice = model.totalPrice;
                this.validationCode = model.validationCode;
            } 

            /**
             * <p>销售单位代号</p>
             * 
             * <strong>example:</strong>
             * <p>SIA25608336893</p>
             */
            public Builder agentCode(String agentCode) {
                this.agentCode = agentCode;
                return this;
            }

            /**
             * apply_id.
             */
            public Builder applyId(String applyId) {
                this.applyId = applyId;
                return this;
            }

            /**
             * bill_date.
             */
            public Builder billDate(String billDate) {
                this.billDate = billDate;
                return this;
            }

            /**
             * build.
             */
            public Builder build(String build) {
                this.build = build;
                return this;
            }

            /**
             * cost_center.
             */
            public Builder costCenter(String costCenter) {
                this.costCenter = costCenter;
                return this;
            }

            /**
             * department.
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * <p>机票行程明细</p>
             */
            public Builder flights(java.util.List<Flights> flights) {
                this.flights = flights;
                return this;
            }

            /**
             * fuel_surcharge.
             */
            public Builder fuelSurcharge(String fuelSurcharge) {
                this.fuelSurcharge = fuelSurcharge;
                return this;
            }

            /**
             * <p>UK</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * insurance.
             */
            public Builder insurance(String insurance) {
                this.insurance = insurance;
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
             * invoice_type.
             */
            public Builder invoiceType(Integer invoiceType) {
                this.invoiceType = invoiceType;
                return this;
            }

            /**
             * <p>填开单位</p>
             */
            public Builder issueCompany(String issueCompany) {
                this.issueCompany = issueCompany;
                return this;
            }

            /**
             * <p>填开日期</p>
             * 
             * <strong>example:</strong>
             * <p>2019-02-28</p>
             */
            public Builder issueDate(String issueDate) {
                this.issueDate = issueDate;
                return this;
            }

            /**
             * itinerary_num.
             */
            public Builder itineraryNum(String itineraryNum) {
                this.itineraryNum = itineraryNum;
                return this;
            }

            /**
             * ofd_oss_url.
             */
            public Builder ofdOssUrl(String ofdOssUrl) {
                this.ofdOssUrl = ofdOssUrl;
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
             * oss_url.
             */
            public Builder ossUrl(String ossUrl) {
                this.ossUrl = ossUrl;
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
             * pdf_oss_url.
             */
            public Builder pdfOssUrl(String pdfOssUrl) {
                this.pdfOssUrl = pdfOssUrl;
                return this;
            }

            /**
             * project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * <p>提示信息</p>
             */
            public Builder promptMessage(String promptMessage) {
                this.promptMessage = promptMessage;
                return this;
            }

            /**
             * purchaser_name.
             */
            public Builder purchaserName(String purchaserName) {
                this.purchaserName = purchaserName;
                return this;
            }

            /**
             * purchaser_tax_no.
             */
            public Builder purchaserTaxNo(String purchaserTaxNo) {
                this.purchaserTaxNo = purchaserTaxNo;
                return this;
            }

            /**
             * purchaser_type.
             */
            public Builder purchaserType(Integer purchaserType) {
                this.purchaserType = purchaserType;
                return this;
            }

            /**
             * tax_amount.
             */
            public Builder taxAmount(String taxAmount) {
                this.taxAmount = taxAmount;
                return this;
            }

            /**
             * tax_rate.
             */
            public Builder taxRate(String taxRate) {
                this.taxRate = taxRate;
                return this;
            }

            /**
             * ticket_no.
             */
            public Builder ticketNo(String ticketNo) {
                this.ticketNo = ticketNo;
                return this;
            }

            /**
             * ticket_price.
             */
            public Builder ticketPrice(String ticketPrice) {
                this.ticketPrice = ticketPrice;
                return this;
            }

            /**
             * total_price.
             */
            public Builder totalPrice(String totalPrice) {
                this.totalPrice = totalPrice;
                return this;
            }

            /**
             * <p>验证码</p>
             * 
             * <strong>example:</strong>
             * <p>9817</p>
             */
            public Builder validationCode(String validationCode) {
                this.validationCode = validationCode;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightItineraryScanQueryResponseBody} extends {@link TeaModel}
     *
     * <p>FlightItineraryScanQueryResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("page_no")
        private Integer pageNo;

        @com.aliyun.core.annotation.NameInMap("page_size")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("total_page")
        private Integer totalPage;

        @com.aliyun.core.annotation.NameInMap("total_size")
        private Integer totalSize;

        private Module(Builder builder) {
            this.items = builder.items;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.totalPage = builder.totalPage;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        /**
         * @return pageNo
         */
        public Integer getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalPage
         */
        public Integer getTotalPage() {
            return this.totalPage;
        }

        /**
         * @return totalSize
         */
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private java.util.List<Items> items; 
            private Integer pageNo; 
            private Integer pageSize; 
            private Integer totalPage; 
            private Integer totalSize; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.items = model.items;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.totalPage = model.totalPage;
                this.totalSize = model.totalSize;
            } 

            /**
             * items.
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * page_no.
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
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
             * total_page.
             */
            public Builder totalPage(Integer totalPage) {
                this.totalPage = totalPage;
                return this;
            }

            /**
             * total_size.
             */
            public Builder totalSize(Integer totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
