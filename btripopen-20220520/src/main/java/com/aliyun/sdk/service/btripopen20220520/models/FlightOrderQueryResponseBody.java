// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightOrderQueryResponseBody} extends {@link TeaModel}
 *
 * <p>FlightOrderQueryResponseBody</p>
 */
public class FlightOrderQueryResponseBody extends TeaModel {
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

    private FlightOrderQueryResponseBody(Builder builder) {
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

    public static FlightOrderQueryResponseBody create() {
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

        public FlightOrderQueryResponseBody build() {
            return new FlightOrderQueryResponseBody(this);
        } 

    } 

    public static class FlightChangeTicketInfoList extends TeaModel {
        @NameInMap("arr_time")
        private String arrTime;

        @NameInMap("change_cabin")
        private String changeCabin;

        @NameInMap("change_cabin_level")
        private String changeCabinLevel;

        @NameInMap("change_fee")
        private Double changeFee;

        @NameInMap("change_flight_no")
        private String changeFlightNo;

        @NameInMap("change_order_id")
        private Long changeOrderId;

        @NameInMap("change_reason")
        private String changeReason;

        @NameInMap("change_type")
        private Integer changeType;

        @NameInMap("dep_time")
        private String depTime;

        @NameInMap("gmt_create")
        private String gmtCreate;

        @NameInMap("gmt_modify")
        private String gmtModify;

        @NameInMap("origin_ticket_no")
        private String originTicketNo;

        @NameInMap("ticket_no")
        private String ticketNo;

        @NameInMap("upgrade_fee")
        private Double upgradeFee;

        private FlightChangeTicketInfoList(Builder builder) {
            this.arrTime = builder.arrTime;
            this.changeCabin = builder.changeCabin;
            this.changeCabinLevel = builder.changeCabinLevel;
            this.changeFee = builder.changeFee;
            this.changeFlightNo = builder.changeFlightNo;
            this.changeOrderId = builder.changeOrderId;
            this.changeReason = builder.changeReason;
            this.changeType = builder.changeType;
            this.depTime = builder.depTime;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModify = builder.gmtModify;
            this.originTicketNo = builder.originTicketNo;
            this.ticketNo = builder.ticketNo;
            this.upgradeFee = builder.upgradeFee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightChangeTicketInfoList create() {
            return builder().build();
        }

        /**
         * @return arrTime
         */
        public String getArrTime() {
            return this.arrTime;
        }

        /**
         * @return changeCabin
         */
        public String getChangeCabin() {
            return this.changeCabin;
        }

        /**
         * @return changeCabinLevel
         */
        public String getChangeCabinLevel() {
            return this.changeCabinLevel;
        }

        /**
         * @return changeFee
         */
        public Double getChangeFee() {
            return this.changeFee;
        }

        /**
         * @return changeFlightNo
         */
        public String getChangeFlightNo() {
            return this.changeFlightNo;
        }

        /**
         * @return changeOrderId
         */
        public Long getChangeOrderId() {
            return this.changeOrderId;
        }

        /**
         * @return changeReason
         */
        public String getChangeReason() {
            return this.changeReason;
        }

        /**
         * @return changeType
         */
        public Integer getChangeType() {
            return this.changeType;
        }

        /**
         * @return depTime
         */
        public String getDepTime() {
            return this.depTime;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModify
         */
        public String getGmtModify() {
            return this.gmtModify;
        }

        /**
         * @return originTicketNo
         */
        public String getOriginTicketNo() {
            return this.originTicketNo;
        }

        /**
         * @return ticketNo
         */
        public String getTicketNo() {
            return this.ticketNo;
        }

        /**
         * @return upgradeFee
         */
        public Double getUpgradeFee() {
            return this.upgradeFee;
        }

        public static final class Builder {
            private String arrTime; 
            private String changeCabin; 
            private String changeCabinLevel; 
            private Double changeFee; 
            private String changeFlightNo; 
            private Long changeOrderId; 
            private String changeReason; 
            private Integer changeType; 
            private String depTime; 
            private String gmtCreate; 
            private String gmtModify; 
            private String originTicketNo; 
            private String ticketNo; 
            private Double upgradeFee; 

            /**
             * arr_time.
             */
            public Builder arrTime(String arrTime) {
                this.arrTime = arrTime;
                return this;
            }

            /**
             * change_cabin.
             */
            public Builder changeCabin(String changeCabin) {
                this.changeCabin = changeCabin;
                return this;
            }

            /**
             * change_cabin_level.
             */
            public Builder changeCabinLevel(String changeCabinLevel) {
                this.changeCabinLevel = changeCabinLevel;
                return this;
            }

            /**
             * change_fee.
             */
            public Builder changeFee(Double changeFee) {
                this.changeFee = changeFee;
                return this;
            }

            /**
             * change_flight_no.
             */
            public Builder changeFlightNo(String changeFlightNo) {
                this.changeFlightNo = changeFlightNo;
                return this;
            }

            /**
             * change_order_id.
             */
            public Builder changeOrderId(Long changeOrderId) {
                this.changeOrderId = changeOrderId;
                return this;
            }

            /**
             * change_reason.
             */
            public Builder changeReason(String changeReason) {
                this.changeReason = changeReason;
                return this;
            }

            /**
             * change_type.
             */
            public Builder changeType(Integer changeType) {
                this.changeType = changeType;
                return this;
            }

            /**
             * dep_time.
             */
            public Builder depTime(String depTime) {
                this.depTime = depTime;
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
             * gmt_modify.
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * origin_ticket_no.
             */
            public Builder originTicketNo(String originTicketNo) {
                this.originTicketNo = originTicketNo;
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
             * upgrade_fee.
             */
            public Builder upgradeFee(Double upgradeFee) {
                this.upgradeFee = upgradeFee;
                return this;
            }

            public FlightChangeTicketInfoList build() {
                return new FlightChangeTicketInfoList(this);
            } 

        } 

    }
    public static class FlightInfoList extends TeaModel {
        @NameInMap("airline_code")
        private String airlineCode;

        @NameInMap("airline_name")
        private String airlineName;

        @NameInMap("arr_airport_code")
        private String arrAirportCode;

        @NameInMap("arr_airport_name")
        private String arrAirportName;

        @NameInMap("arr_city_code")
        private String arrCityCode;

        @NameInMap("arr_city_name")
        private String arrCityName;

        @NameInMap("arr_time")
        private String arrTime;

        @NameInMap("cabin")
        private String cabin;

        @NameInMap("cabin_level")
        private String cabinLevel;

        @NameInMap("dep_airport_code")
        private String depAirportCode;

        @NameInMap("dep_airport_name")
        private String depAirportName;

        @NameInMap("dep_city_code")
        private String depCityCode;

        @NameInMap("dep_city_name")
        private String depCityName;

        @NameInMap("dep_time")
        private String depTime;

        @NameInMap("flight_mile")
        private Integer flightMile;

        @NameInMap("flight_no")
        private String flightNo;

        private FlightInfoList(Builder builder) {
            this.airlineCode = builder.airlineCode;
            this.airlineName = builder.airlineName;
            this.arrAirportCode = builder.arrAirportCode;
            this.arrAirportName = builder.arrAirportName;
            this.arrCityCode = builder.arrCityCode;
            this.arrCityName = builder.arrCityName;
            this.arrTime = builder.arrTime;
            this.cabin = builder.cabin;
            this.cabinLevel = builder.cabinLevel;
            this.depAirportCode = builder.depAirportCode;
            this.depAirportName = builder.depAirportName;
            this.depCityCode = builder.depCityCode;
            this.depCityName = builder.depCityName;
            this.depTime = builder.depTime;
            this.flightMile = builder.flightMile;
            this.flightNo = builder.flightNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightInfoList create() {
            return builder().build();
        }

        /**
         * @return airlineCode
         */
        public String getAirlineCode() {
            return this.airlineCode;
        }

        /**
         * @return airlineName
         */
        public String getAirlineName() {
            return this.airlineName;
        }

        /**
         * @return arrAirportCode
         */
        public String getArrAirportCode() {
            return this.arrAirportCode;
        }

        /**
         * @return arrAirportName
         */
        public String getArrAirportName() {
            return this.arrAirportName;
        }

        /**
         * @return arrCityCode
         */
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        /**
         * @return arrCityName
         */
        public String getArrCityName() {
            return this.arrCityName;
        }

        /**
         * @return arrTime
         */
        public String getArrTime() {
            return this.arrTime;
        }

        /**
         * @return cabin
         */
        public String getCabin() {
            return this.cabin;
        }

        /**
         * @return cabinLevel
         */
        public String getCabinLevel() {
            return this.cabinLevel;
        }

        /**
         * @return depAirportCode
         */
        public String getDepAirportCode() {
            return this.depAirportCode;
        }

        /**
         * @return depAirportName
         */
        public String getDepAirportName() {
            return this.depAirportName;
        }

        /**
         * @return depCityCode
         */
        public String getDepCityCode() {
            return this.depCityCode;
        }

        /**
         * @return depCityName
         */
        public String getDepCityName() {
            return this.depCityName;
        }

        /**
         * @return depTime
         */
        public String getDepTime() {
            return this.depTime;
        }

        /**
         * @return flightMile
         */
        public Integer getFlightMile() {
            return this.flightMile;
        }

        /**
         * @return flightNo
         */
        public String getFlightNo() {
            return this.flightNo;
        }

        public static final class Builder {
            private String airlineCode; 
            private String airlineName; 
            private String arrAirportCode; 
            private String arrAirportName; 
            private String arrCityCode; 
            private String arrCityName; 
            private String arrTime; 
            private String cabin; 
            private String cabinLevel; 
            private String depAirportCode; 
            private String depAirportName; 
            private String depCityCode; 
            private String depCityName; 
            private String depTime; 
            private Integer flightMile; 
            private String flightNo; 

            /**
             * airline_code.
             */
            public Builder airlineCode(String airlineCode) {
                this.airlineCode = airlineCode;
                return this;
            }

            /**
             * airline_name.
             */
            public Builder airlineName(String airlineName) {
                this.airlineName = airlineName;
                return this;
            }

            /**
             * arr_airport_code.
             */
            public Builder arrAirportCode(String arrAirportCode) {
                this.arrAirportCode = arrAirportCode;
                return this;
            }

            /**
             * arr_airport_name.
             */
            public Builder arrAirportName(String arrAirportName) {
                this.arrAirportName = arrAirportName;
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
             * arr_city_name.
             */
            public Builder arrCityName(String arrCityName) {
                this.arrCityName = arrCityName;
                return this;
            }

            /**
             * arr_time.
             */
            public Builder arrTime(String arrTime) {
                this.arrTime = arrTime;
                return this;
            }

            /**
             * cabin.
             */
            public Builder cabin(String cabin) {
                this.cabin = cabin;
                return this;
            }

            /**
             * cabin_level.
             */
            public Builder cabinLevel(String cabinLevel) {
                this.cabinLevel = cabinLevel;
                return this;
            }

            /**
             * dep_airport_code.
             */
            public Builder depAirportCode(String depAirportCode) {
                this.depAirportCode = depAirportCode;
                return this;
            }

            /**
             * dep_airport_name.
             */
            public Builder depAirportName(String depAirportName) {
                this.depAirportName = depAirportName;
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
             * dep_city_name.
             */
            public Builder depCityName(String depCityName) {
                this.depCityName = depCityName;
                return this;
            }

            /**
             * dep_time.
             */
            public Builder depTime(String depTime) {
                this.depTime = depTime;
                return this;
            }

            /**
             * flight_mile.
             */
            public Builder flightMile(Integer flightMile) {
                this.flightMile = flightMile;
                return this;
            }

            /**
             * flight_no.
             */
            public Builder flightNo(String flightNo) {
                this.flightNo = flightNo;
                return this;
            }

            public FlightInfoList build() {
                return new FlightInfoList(this);
            } 

        } 

    }
    public static class FlightRefundTicketInfoList extends TeaModel {
        @NameInMap("gmt_create")
        private String gmtCreate;

        @NameInMap("gmt_modify")
        private String gmtModify;

        @NameInMap("refund_order_id")
        private Long refundOrderId;

        @NameInMap("refund_reason")
        private String refundReason;

        @NameInMap("refund_ticket_fee")
        private Double refundTicketFee;

        @NameInMap("refund_type")
        private Integer refundType;

        @NameInMap("ticket_no")
        private String ticketNo;

        private FlightRefundTicketInfoList(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.gmtModify = builder.gmtModify;
            this.refundOrderId = builder.refundOrderId;
            this.refundReason = builder.refundReason;
            this.refundTicketFee = builder.refundTicketFee;
            this.refundType = builder.refundType;
            this.ticketNo = builder.ticketNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightRefundTicketInfoList create() {
            return builder().build();
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModify
         */
        public String getGmtModify() {
            return this.gmtModify;
        }

        /**
         * @return refundOrderId
         */
        public Long getRefundOrderId() {
            return this.refundOrderId;
        }

        /**
         * @return refundReason
         */
        public String getRefundReason() {
            return this.refundReason;
        }

        /**
         * @return refundTicketFee
         */
        public Double getRefundTicketFee() {
            return this.refundTicketFee;
        }

        /**
         * @return refundType
         */
        public Integer getRefundType() {
            return this.refundType;
        }

        /**
         * @return ticketNo
         */
        public String getTicketNo() {
            return this.ticketNo;
        }

        public static final class Builder {
            private String gmtCreate; 
            private String gmtModify; 
            private Long refundOrderId; 
            private String refundReason; 
            private Double refundTicketFee; 
            private Integer refundType; 
            private String ticketNo; 

            /**
             * gmt_create.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmt_modify.
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * refund_order_id.
             */
            public Builder refundOrderId(Long refundOrderId) {
                this.refundOrderId = refundOrderId;
                return this;
            }

            /**
             * refund_reason.
             */
            public Builder refundReason(String refundReason) {
                this.refundReason = refundReason;
                return this;
            }

            /**
             * refund_ticket_fee.
             */
            public Builder refundTicketFee(Double refundTicketFee) {
                this.refundTicketFee = refundTicketFee;
                return this;
            }

            /**
             * refund_type.
             */
            public Builder refundType(Integer refundType) {
                this.refundType = refundType;
                return this;
            }

            /**
             * ticket_no.
             */
            public Builder ticketNo(String ticketNo) {
                this.ticketNo = ticketNo;
                return this;
            }

            public FlightRefundTicketInfoList build() {
                return new FlightRefundTicketInfoList(this);
            } 

        } 

    }
    public static class FlightTicketInfoList extends TeaModel {
        @NameInMap("build_price")
        private Double buildPrice;

        @NameInMap("changed")
        private Boolean changed;

        @NameInMap("discount")
        private Integer discount;

        @NameInMap("gmt_create")
        private String gmtCreate;

        @NameInMap("gmt_modify")
        private String gmtModify;

        @NameInMap("oil_price")
        private Double oilPrice;

        @NameInMap("pay_type")
        private Integer payType;

        @NameInMap("settle_price")
        private Double settlePrice;

        @NameInMap("ticket_no")
        private String ticketNo;

        @NameInMap("ticket_price")
        private Double ticketPrice;

        @NameInMap("ticket_status")
        private String ticketStatus;

        @NameInMap("ticket_status_code")
        private Integer ticketStatusCode;

        @NameInMap("user_id")
        private String userId;

        private FlightTicketInfoList(Builder builder) {
            this.buildPrice = builder.buildPrice;
            this.changed = builder.changed;
            this.discount = builder.discount;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModify = builder.gmtModify;
            this.oilPrice = builder.oilPrice;
            this.payType = builder.payType;
            this.settlePrice = builder.settlePrice;
            this.ticketNo = builder.ticketNo;
            this.ticketPrice = builder.ticketPrice;
            this.ticketStatus = builder.ticketStatus;
            this.ticketStatusCode = builder.ticketStatusCode;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightTicketInfoList create() {
            return builder().build();
        }

        /**
         * @return buildPrice
         */
        public Double getBuildPrice() {
            return this.buildPrice;
        }

        /**
         * @return changed
         */
        public Boolean getChanged() {
            return this.changed;
        }

        /**
         * @return discount
         */
        public Integer getDiscount() {
            return this.discount;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModify
         */
        public String getGmtModify() {
            return this.gmtModify;
        }

        /**
         * @return oilPrice
         */
        public Double getOilPrice() {
            return this.oilPrice;
        }

        /**
         * @return payType
         */
        public Integer getPayType() {
            return this.payType;
        }

        /**
         * @return settlePrice
         */
        public Double getSettlePrice() {
            return this.settlePrice;
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
        public Double getTicketPrice() {
            return this.ticketPrice;
        }

        /**
         * @return ticketStatus
         */
        public String getTicketStatus() {
            return this.ticketStatus;
        }

        /**
         * @return ticketStatusCode
         */
        public Integer getTicketStatusCode() {
            return this.ticketStatusCode;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Double buildPrice; 
            private Boolean changed; 
            private Integer discount; 
            private String gmtCreate; 
            private String gmtModify; 
            private Double oilPrice; 
            private Integer payType; 
            private Double settlePrice; 
            private String ticketNo; 
            private Double ticketPrice; 
            private String ticketStatus; 
            private Integer ticketStatusCode; 
            private String userId; 

            /**
             * build_price.
             */
            public Builder buildPrice(Double buildPrice) {
                this.buildPrice = buildPrice;
                return this;
            }

            /**
             * changed.
             */
            public Builder changed(Boolean changed) {
                this.changed = changed;
                return this;
            }

            /**
             * discount.
             */
            public Builder discount(Integer discount) {
                this.discount = discount;
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
             * gmt_modify.
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * oil_price.
             */
            public Builder oilPrice(Double oilPrice) {
                this.oilPrice = oilPrice;
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
             * settle_price.
             */
            public Builder settlePrice(Double settlePrice) {
                this.settlePrice = settlePrice;
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
            public Builder ticketPrice(Double ticketPrice) {
                this.ticketPrice = ticketPrice;
                return this;
            }

            /**
             * ticket_status.
             */
            public Builder ticketStatus(String ticketStatus) {
                this.ticketStatus = ticketStatus;
                return this;
            }

            /**
             * ticket_status_code.
             */
            public Builder ticketStatusCode(Integer ticketStatusCode) {
                this.ticketStatusCode = ticketStatusCode;
                return this;
            }

            /**
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public FlightTicketInfoList build() {
                return new FlightTicketInfoList(this);
            } 

        } 

    }
    public static class InsuranceInfoList extends TeaModel {
        @NameInMap("amount")
        private Double amount;

        @NameInMap("insurance_no")
        private String insuranceNo;

        @NameInMap("status")
        private Integer status;

        @NameInMap("type")
        private String type;

        private InsuranceInfoList(Builder builder) {
            this.amount = builder.amount;
            this.insuranceNo = builder.insuranceNo;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InsuranceInfoList create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Double getAmount() {
            return this.amount;
        }

        /**
         * @return insuranceNo
         */
        public String getInsuranceNo() {
            return this.insuranceNo;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Double amount; 
            private String insuranceNo; 
            private Integer status; 
            private String type; 

            /**
             * amount.
             */
            public Builder amount(Double amount) {
                this.amount = amount;
                return this;
            }

            /**
             * insurance_no.
             */
            public Builder insuranceNo(String insuranceNo) {
                this.insuranceNo = insuranceNo;
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
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public InsuranceInfoList build() {
                return new InsuranceInfoList(this);
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
        @NameInMap("apply_id")
        private String applyId;

        @NameInMap("btrip_title")
        private String btripTitle;

        @NameInMap("contact_name")
        private String contactName;

        @NameInMap("corp_id")
        private String corpId;

        @NameInMap("corp_name")
        private String corpName;

        @NameInMap("depart_id")
        private String departId;

        @NameInMap("depart_name")
        private String departName;

        @NameInMap("gmt_create")
        private String gmtCreate;

        @NameInMap("gmt_modify")
        private String gmtModify;

        @NameInMap("itinerary_id")
        private String itineraryId;

        @NameInMap("order_id")
        private Long orderId;

        @NameInMap("order_status")
        private Integer orderStatus;

        @NameInMap("thirdpart_apply_id")
        private String thirdpartApplyId;

        @NameInMap("thirdpart_corp_id")
        private String thirdpartCorpId;

        @NameInMap("thirdpart_itinerary_id")
        private String thirdpartItineraryId;

        @NameInMap("trip_type")
        private Integer tripType;

        @NameInMap("user_id")
        private String userId;

        private OrderBaseInfo(Builder builder) {
            this.applyId = builder.applyId;
            this.btripTitle = builder.btripTitle;
            this.contactName = builder.contactName;
            this.corpId = builder.corpId;
            this.corpName = builder.corpName;
            this.departId = builder.departId;
            this.departName = builder.departName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModify = builder.gmtModify;
            this.itineraryId = builder.itineraryId;
            this.orderId = builder.orderId;
            this.orderStatus = builder.orderStatus;
            this.thirdpartApplyId = builder.thirdpartApplyId;
            this.thirdpartCorpId = builder.thirdpartCorpId;
            this.thirdpartItineraryId = builder.thirdpartItineraryId;
            this.tripType = builder.tripType;
            this.userId = builder.userId;
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
         * @return btripTitle
         */
        public String getBtripTitle() {
            return this.btripTitle;
        }

        /**
         * @return contactName
         */
        public String getContactName() {
            return this.contactName;
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
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModify
         */
        public String getGmtModify() {
            return this.gmtModify;
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
         * @return thirdpartApplyId
         */
        public String getThirdpartApplyId() {
            return this.thirdpartApplyId;
        }

        /**
         * @return thirdpartCorpId
         */
        public String getThirdpartCorpId() {
            return this.thirdpartCorpId;
        }

        /**
         * @return thirdpartItineraryId
         */
        public String getThirdpartItineraryId() {
            return this.thirdpartItineraryId;
        }

        /**
         * @return tripType
         */
        public Integer getTripType() {
            return this.tripType;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String applyId; 
            private String btripTitle; 
            private String contactName; 
            private String corpId; 
            private String corpName; 
            private String departId; 
            private String departName; 
            private String gmtCreate; 
            private String gmtModify; 
            private String itineraryId; 
            private Long orderId; 
            private Integer orderStatus; 
            private String thirdpartApplyId; 
            private String thirdpartCorpId; 
            private String thirdpartItineraryId; 
            private Integer tripType; 
            private String userId; 

            /**
             * apply_id.
             */
            public Builder applyId(String applyId) {
                this.applyId = applyId;
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
             * contact_name.
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
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
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmt_modify.
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
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
             * thirdpart_apply_id.
             */
            public Builder thirdpartApplyId(String thirdpartApplyId) {
                this.thirdpartApplyId = thirdpartApplyId;
                return this;
            }

            /**
             * thirdpart_corp_id.
             */
            public Builder thirdpartCorpId(String thirdpartCorpId) {
                this.thirdpartCorpId = thirdpartCorpId;
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
             * trip_type.
             */
            public Builder tripType(Integer tripType) {
                this.tripType = tripType;
                return this;
            }

            /**
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public OrderBaseInfo build() {
                return new OrderBaseInfo(this);
            } 

        } 

    }
    public static class PassengerInfoList extends TeaModel {
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

        @NameInMap("thirdpart_project_id")
        private String thirdpartProjectId;

        @NameInMap("user_id")
        private String userId;

        @NameInMap("user_name")
        private String userName;

        @NameInMap("user_type")
        private Integer userType;

        private PassengerInfoList(Builder builder) {
            this.costCenterId = builder.costCenterId;
            this.costCenterName = builder.costCenterName;
            this.costCenterNumber = builder.costCenterNumber;
            this.projectCode = builder.projectCode;
            this.projectId = builder.projectId;
            this.projectTitle = builder.projectTitle;
            this.thirdpartProjectId = builder.thirdpartProjectId;
            this.userId = builder.userId;
            this.userName = builder.userName;
            this.userType = builder.userType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PassengerInfoList create() {
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

            public PassengerInfoList build() {
                return new PassengerInfoList(this);
            } 

        } 

    }
    public static class PriceInfoList extends TeaModel {
        @NameInMap("category_code")
        private Integer categoryCode;

        @NameInMap("gmt_create")
        private String gmtCreate;

        @NameInMap("passenger_name")
        private String passengerName;

        @NameInMap("pay_type")
        private Integer payType;

        @NameInMap("price")
        private Double price;

        @NameInMap("trade_id")
        private String tradeId;

        @NameInMap("type")
        private Integer type;

        private PriceInfoList(Builder builder) {
            this.categoryCode = builder.categoryCode;
            this.gmtCreate = builder.gmtCreate;
            this.passengerName = builder.passengerName;
            this.payType = builder.payType;
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
            private String gmtCreate; 
            private String passengerName; 
            private Integer payType; 
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
    public static class Module extends TeaModel {
        @NameInMap("flight_change_ticket_info_list")
        private java.util.List < FlightChangeTicketInfoList> flightChangeTicketInfoList;

        @NameInMap("flight_info_list")
        private java.util.List < FlightInfoList> flightInfoList;

        @NameInMap("flight_refund_ticket_info_list")
        private java.util.List < FlightRefundTicketInfoList> flightRefundTicketInfoList;

        @NameInMap("flight_ticket_info_list")
        private java.util.List < FlightTicketInfoList> flightTicketInfoList;

        @NameInMap("insurance_info_list")
        private java.util.List < InsuranceInfoList> insuranceInfoList;

        @NameInMap("invoice_info")
        private InvoiceInfo invoiceInfo;

        @NameInMap("order_base_info")
        private OrderBaseInfo orderBaseInfo;

        @NameInMap("passenger_info_list")
        private java.util.List < PassengerInfoList> passengerInfoList;

        @NameInMap("price_info_list")
        private java.util.List < PriceInfoList> priceInfoList;

        private Module(Builder builder) {
            this.flightChangeTicketInfoList = builder.flightChangeTicketInfoList;
            this.flightInfoList = builder.flightInfoList;
            this.flightRefundTicketInfoList = builder.flightRefundTicketInfoList;
            this.flightTicketInfoList = builder.flightTicketInfoList;
            this.insuranceInfoList = builder.insuranceInfoList;
            this.invoiceInfo = builder.invoiceInfo;
            this.orderBaseInfo = builder.orderBaseInfo;
            this.passengerInfoList = builder.passengerInfoList;
            this.priceInfoList = builder.priceInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return flightChangeTicketInfoList
         */
        public java.util.List < FlightChangeTicketInfoList> getFlightChangeTicketInfoList() {
            return this.flightChangeTicketInfoList;
        }

        /**
         * @return flightInfoList
         */
        public java.util.List < FlightInfoList> getFlightInfoList() {
            return this.flightInfoList;
        }

        /**
         * @return flightRefundTicketInfoList
         */
        public java.util.List < FlightRefundTicketInfoList> getFlightRefundTicketInfoList() {
            return this.flightRefundTicketInfoList;
        }

        /**
         * @return flightTicketInfoList
         */
        public java.util.List < FlightTicketInfoList> getFlightTicketInfoList() {
            return this.flightTicketInfoList;
        }

        /**
         * @return insuranceInfoList
         */
        public java.util.List < InsuranceInfoList> getInsuranceInfoList() {
            return this.insuranceInfoList;
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
         * @return passengerInfoList
         */
        public java.util.List < PassengerInfoList> getPassengerInfoList() {
            return this.passengerInfoList;
        }

        /**
         * @return priceInfoList
         */
        public java.util.List < PriceInfoList> getPriceInfoList() {
            return this.priceInfoList;
        }

        public static final class Builder {
            private java.util.List < FlightChangeTicketInfoList> flightChangeTicketInfoList; 
            private java.util.List < FlightInfoList> flightInfoList; 
            private java.util.List < FlightRefundTicketInfoList> flightRefundTicketInfoList; 
            private java.util.List < FlightTicketInfoList> flightTicketInfoList; 
            private java.util.List < InsuranceInfoList> insuranceInfoList; 
            private InvoiceInfo invoiceInfo; 
            private OrderBaseInfo orderBaseInfo; 
            private java.util.List < PassengerInfoList> passengerInfoList; 
            private java.util.List < PriceInfoList> priceInfoList; 

            /**
             * flight_change_ticket_info_list.
             */
            public Builder flightChangeTicketInfoList(java.util.List < FlightChangeTicketInfoList> flightChangeTicketInfoList) {
                this.flightChangeTicketInfoList = flightChangeTicketInfoList;
                return this;
            }

            /**
             * flight_info_list.
             */
            public Builder flightInfoList(java.util.List < FlightInfoList> flightInfoList) {
                this.flightInfoList = flightInfoList;
                return this;
            }

            /**
             * flight_refund_ticket_info_list.
             */
            public Builder flightRefundTicketInfoList(java.util.List < FlightRefundTicketInfoList> flightRefundTicketInfoList) {
                this.flightRefundTicketInfoList = flightRefundTicketInfoList;
                return this;
            }

            /**
             * flight_ticket_info_list.
             */
            public Builder flightTicketInfoList(java.util.List < FlightTicketInfoList> flightTicketInfoList) {
                this.flightTicketInfoList = flightTicketInfoList;
                return this;
            }

            /**
             * insurance_info_list.
             */
            public Builder insuranceInfoList(java.util.List < InsuranceInfoList> insuranceInfoList) {
                this.insuranceInfoList = insuranceInfoList;
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
             * passenger_info_list.
             */
            public Builder passengerInfoList(java.util.List < PassengerInfoList> passengerInfoList) {
                this.passengerInfoList = passengerInfoList;
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
