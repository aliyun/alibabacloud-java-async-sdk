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
 * {@link FlightOrderQueryResponseBody} extends {@link TeaModel}
 *
 * <p>FlightOrderQueryResponseBody</p>
 */
public class FlightOrderQueryResponseBody extends TeaModel {
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

        private Builder(FlightOrderQueryResponseBody model) {
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

    /**
     * 
     * {@link FlightOrderQueryResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderQueryResponseBody</p>
     */
    public static class FlightChangeTicketInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apply_id")
        private String applyId;

        @com.aliyun.core.annotation.NameInMap("arr_airport")
        private String arrAirport;

        @com.aliyun.core.annotation.NameInMap("arr_airport_code")
        private String arrAirportCode;

        @com.aliyun.core.annotation.NameInMap("arr_city")
        private String arrCity;

        @com.aliyun.core.annotation.NameInMap("arr_city_code")
        private String arrCityCode;

        @com.aliyun.core.annotation.NameInMap("arr_time")
        private String arrTime;

        @com.aliyun.core.annotation.NameInMap("change_cabin")
        private String changeCabin;

        @com.aliyun.core.annotation.NameInMap("change_cabin_level")
        private String changeCabinLevel;

        @com.aliyun.core.annotation.NameInMap("change_fee")
        private Double changeFee;

        @com.aliyun.core.annotation.NameInMap("change_flight_no")
        private String changeFlightNo;

        @com.aliyun.core.annotation.NameInMap("change_order_id")
        private Long changeOrderId;

        @com.aliyun.core.annotation.NameInMap("change_reason")
        private String changeReason;

        @com.aliyun.core.annotation.NameInMap("change_type")
        private Integer changeType;

        @com.aliyun.core.annotation.NameInMap("dep_airport")
        private String depAirport;

        @com.aliyun.core.annotation.NameInMap("dep_airport_code")
        private String depAirportCode;

        @com.aliyun.core.annotation.NameInMap("dep_city")
        private String depCity;

        @com.aliyun.core.annotation.NameInMap("dep_city_code")
        private String depCityCode;

        @com.aliyun.core.annotation.NameInMap("dep_time")
        private String depTime;

        @com.aliyun.core.annotation.NameInMap("discount")
        private String discount;

        @com.aliyun.core.annotation.NameInMap("gmt_create")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmt_modify")
        private String gmtModify;

        @com.aliyun.core.annotation.NameInMap("journey_index")
        private Integer journeyIndex;

        @com.aliyun.core.annotation.NameInMap("origin_ticket_no")
        private String originTicketNo;

        @com.aliyun.core.annotation.NameInMap("out_apply_id")
        private String outApplyId;

        @com.aliyun.core.annotation.NameInMap("segment_index")
        private Integer segmentIndex;

        @com.aliyun.core.annotation.NameInMap("stop_city")
        private String stopCity;

        @com.aliyun.core.annotation.NameInMap("ticket_no")
        private String ticketNo;

        @com.aliyun.core.annotation.NameInMap("ticket_status")
        private String ticketStatus;

        @com.aliyun.core.annotation.NameInMap("ticket_status_code")
        private Integer ticketStatusCode;

        @com.aliyun.core.annotation.NameInMap("upgrade_fee")
        private Double upgradeFee;

        private FlightChangeTicketInfoList(Builder builder) {
            this.applyId = builder.applyId;
            this.arrAirport = builder.arrAirport;
            this.arrAirportCode = builder.arrAirportCode;
            this.arrCity = builder.arrCity;
            this.arrCityCode = builder.arrCityCode;
            this.arrTime = builder.arrTime;
            this.changeCabin = builder.changeCabin;
            this.changeCabinLevel = builder.changeCabinLevel;
            this.changeFee = builder.changeFee;
            this.changeFlightNo = builder.changeFlightNo;
            this.changeOrderId = builder.changeOrderId;
            this.changeReason = builder.changeReason;
            this.changeType = builder.changeType;
            this.depAirport = builder.depAirport;
            this.depAirportCode = builder.depAirportCode;
            this.depCity = builder.depCity;
            this.depCityCode = builder.depCityCode;
            this.depTime = builder.depTime;
            this.discount = builder.discount;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModify = builder.gmtModify;
            this.journeyIndex = builder.journeyIndex;
            this.originTicketNo = builder.originTicketNo;
            this.outApplyId = builder.outApplyId;
            this.segmentIndex = builder.segmentIndex;
            this.stopCity = builder.stopCity;
            this.ticketNo = builder.ticketNo;
            this.ticketStatus = builder.ticketStatus;
            this.ticketStatusCode = builder.ticketStatusCode;
            this.upgradeFee = builder.upgradeFee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightChangeTicketInfoList create() {
            return builder().build();
        }

        /**
         * @return applyId
         */
        public String getApplyId() {
            return this.applyId;
        }

        /**
         * @return arrAirport
         */
        public String getArrAirport() {
            return this.arrAirport;
        }

        /**
         * @return arrAirportCode
         */
        public String getArrAirportCode() {
            return this.arrAirportCode;
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
         * @return depAirport
         */
        public String getDepAirport() {
            return this.depAirport;
        }

        /**
         * @return depAirportCode
         */
        public String getDepAirportCode() {
            return this.depAirportCode;
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
         * @return depTime
         */
        public String getDepTime() {
            return this.depTime;
        }

        /**
         * @return discount
         */
        public String getDiscount() {
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
         * @return journeyIndex
         */
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        /**
         * @return originTicketNo
         */
        public String getOriginTicketNo() {
            return this.originTicketNo;
        }

        /**
         * @return outApplyId
         */
        public String getOutApplyId() {
            return this.outApplyId;
        }

        /**
         * @return segmentIndex
         */
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        /**
         * @return stopCity
         */
        public String getStopCity() {
            return this.stopCity;
        }

        /**
         * @return ticketNo
         */
        public String getTicketNo() {
            return this.ticketNo;
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
         * @return upgradeFee
         */
        public Double getUpgradeFee() {
            return this.upgradeFee;
        }

        public static final class Builder {
            private String applyId; 
            private String arrAirport; 
            private String arrAirportCode; 
            private String arrCity; 
            private String arrCityCode; 
            private String arrTime; 
            private String changeCabin; 
            private String changeCabinLevel; 
            private Double changeFee; 
            private String changeFlightNo; 
            private Long changeOrderId; 
            private String changeReason; 
            private Integer changeType; 
            private String depAirport; 
            private String depAirportCode; 
            private String depCity; 
            private String depCityCode; 
            private String depTime; 
            private String discount; 
            private String gmtCreate; 
            private String gmtModify; 
            private Integer journeyIndex; 
            private String originTicketNo; 
            private String outApplyId; 
            private Integer segmentIndex; 
            private String stopCity; 
            private String ticketNo; 
            private String ticketStatus; 
            private Integer ticketStatusCode; 
            private Double upgradeFee; 

            private Builder() {
            } 

            private Builder(FlightChangeTicketInfoList model) {
                this.applyId = model.applyId;
                this.arrAirport = model.arrAirport;
                this.arrAirportCode = model.arrAirportCode;
                this.arrCity = model.arrCity;
                this.arrCityCode = model.arrCityCode;
                this.arrTime = model.arrTime;
                this.changeCabin = model.changeCabin;
                this.changeCabinLevel = model.changeCabinLevel;
                this.changeFee = model.changeFee;
                this.changeFlightNo = model.changeFlightNo;
                this.changeOrderId = model.changeOrderId;
                this.changeReason = model.changeReason;
                this.changeType = model.changeType;
                this.depAirport = model.depAirport;
                this.depAirportCode = model.depAirportCode;
                this.depCity = model.depCity;
                this.depCityCode = model.depCityCode;
                this.depTime = model.depTime;
                this.discount = model.discount;
                this.gmtCreate = model.gmtCreate;
                this.gmtModify = model.gmtModify;
                this.journeyIndex = model.journeyIndex;
                this.originTicketNo = model.originTicketNo;
                this.outApplyId = model.outApplyId;
                this.segmentIndex = model.segmentIndex;
                this.stopCity = model.stopCity;
                this.ticketNo = model.ticketNo;
                this.ticketStatus = model.ticketStatus;
                this.ticketStatusCode = model.ticketStatusCode;
                this.upgradeFee = model.upgradeFee;
            } 

            /**
             * apply_id.
             */
            public Builder applyId(String applyId) {
                this.applyId = applyId;
                return this;
            }

            /**
             * arr_airport.
             */
            public Builder arrAirport(String arrAirport) {
                this.arrAirport = arrAirport;
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
             * dep_airport.
             */
            public Builder depAirport(String depAirport) {
                this.depAirport = depAirport;
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
             * dep_time.
             */
            public Builder depTime(String depTime) {
                this.depTime = depTime;
                return this;
            }

            /**
             * discount.
             */
            public Builder discount(String discount) {
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
             * journey_index.
             */
            public Builder journeyIndex(Integer journeyIndex) {
                this.journeyIndex = journeyIndex;
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
             * out_apply_id.
             */
            public Builder outApplyId(String outApplyId) {
                this.outApplyId = outApplyId;
                return this;
            }

            /**
             * segment_index.
             */
            public Builder segmentIndex(Integer segmentIndex) {
                this.segmentIndex = segmentIndex;
                return this;
            }

            /**
             * stop_city.
             */
            public Builder stopCity(String stopCity) {
                this.stopCity = stopCity;
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
    /**
     * 
     * {@link FlightOrderQueryResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderQueryResponseBody</p>
     */
    public static class ArrAirportCityCounty extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("adcode")
        private String adcode;

        @com.aliyun.core.annotation.NameInMap("airport_city_code")
        private String airportCityCode;

        @com.aliyun.core.annotation.NameInMap("airport_city_name")
        private String airportCityName;

        @com.aliyun.core.annotation.NameInMap("airport_code")
        private String airportCode;

        @com.aliyun.core.annotation.NameInMap("airport_name")
        private String airportName;

        @com.aliyun.core.annotation.NameInMap("airport_parent_city_name")
        private String airportParentCityName;

        @com.aliyun.core.annotation.NameInMap("county_city_adcode")
        private String countyCityAdcode;

        @com.aliyun.core.annotation.NameInMap("county_city_name")
        private String countyCityName;

        @com.aliyun.core.annotation.NameInMap("prefecture_city_adcode")
        private String prefectureCityAdcode;

        @com.aliyun.core.annotation.NameInMap("prefecture_city_name")
        private String prefectureCityName;

        private ArrAirportCityCounty(Builder builder) {
            this.adcode = builder.adcode;
            this.airportCityCode = builder.airportCityCode;
            this.airportCityName = builder.airportCityName;
            this.airportCode = builder.airportCode;
            this.airportName = builder.airportName;
            this.airportParentCityName = builder.airportParentCityName;
            this.countyCityAdcode = builder.countyCityAdcode;
            this.countyCityName = builder.countyCityName;
            this.prefectureCityAdcode = builder.prefectureCityAdcode;
            this.prefectureCityName = builder.prefectureCityName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ArrAirportCityCounty create() {
            return builder().build();
        }

        /**
         * @return adcode
         */
        public String getAdcode() {
            return this.adcode;
        }

        /**
         * @return airportCityCode
         */
        public String getAirportCityCode() {
            return this.airportCityCode;
        }

        /**
         * @return airportCityName
         */
        public String getAirportCityName() {
            return this.airportCityName;
        }

        /**
         * @return airportCode
         */
        public String getAirportCode() {
            return this.airportCode;
        }

        /**
         * @return airportName
         */
        public String getAirportName() {
            return this.airportName;
        }

        /**
         * @return airportParentCityName
         */
        public String getAirportParentCityName() {
            return this.airportParentCityName;
        }

        /**
         * @return countyCityAdcode
         */
        public String getCountyCityAdcode() {
            return this.countyCityAdcode;
        }

        /**
         * @return countyCityName
         */
        public String getCountyCityName() {
            return this.countyCityName;
        }

        /**
         * @return prefectureCityAdcode
         */
        public String getPrefectureCityAdcode() {
            return this.prefectureCityAdcode;
        }

        /**
         * @return prefectureCityName
         */
        public String getPrefectureCityName() {
            return this.prefectureCityName;
        }

        public static final class Builder {
            private String adcode; 
            private String airportCityCode; 
            private String airportCityName; 
            private String airportCode; 
            private String airportName; 
            private String airportParentCityName; 
            private String countyCityAdcode; 
            private String countyCityName; 
            private String prefectureCityAdcode; 
            private String prefectureCityName; 

            private Builder() {
            } 

            private Builder(ArrAirportCityCounty model) {
                this.adcode = model.adcode;
                this.airportCityCode = model.airportCityCode;
                this.airportCityName = model.airportCityName;
                this.airportCode = model.airportCode;
                this.airportName = model.airportName;
                this.airportParentCityName = model.airportParentCityName;
                this.countyCityAdcode = model.countyCityAdcode;
                this.countyCityName = model.countyCityName;
                this.prefectureCityAdcode = model.prefectureCityAdcode;
                this.prefectureCityName = model.prefectureCityName;
            } 

            /**
             * adcode.
             */
            public Builder adcode(String adcode) {
                this.adcode = adcode;
                return this;
            }

            /**
             * airport_city_code.
             */
            public Builder airportCityCode(String airportCityCode) {
                this.airportCityCode = airportCityCode;
                return this;
            }

            /**
             * airport_city_name.
             */
            public Builder airportCityName(String airportCityName) {
                this.airportCityName = airportCityName;
                return this;
            }

            /**
             * airport_code.
             */
            public Builder airportCode(String airportCode) {
                this.airportCode = airportCode;
                return this;
            }

            /**
             * airport_name.
             */
            public Builder airportName(String airportName) {
                this.airportName = airportName;
                return this;
            }

            /**
             * airport_parent_city_name.
             */
            public Builder airportParentCityName(String airportParentCityName) {
                this.airportParentCityName = airportParentCityName;
                return this;
            }

            /**
             * county_city_adcode.
             */
            public Builder countyCityAdcode(String countyCityAdcode) {
                this.countyCityAdcode = countyCityAdcode;
                return this;
            }

            /**
             * county_city_name.
             */
            public Builder countyCityName(String countyCityName) {
                this.countyCityName = countyCityName;
                return this;
            }

            /**
             * prefecture_city_adcode.
             */
            public Builder prefectureCityAdcode(String prefectureCityAdcode) {
                this.prefectureCityAdcode = prefectureCityAdcode;
                return this;
            }

            /**
             * prefecture_city_name.
             */
            public Builder prefectureCityName(String prefectureCityName) {
                this.prefectureCityName = prefectureCityName;
                return this;
            }

            public ArrAirportCityCounty build() {
                return new ArrAirportCityCounty(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightOrderQueryResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderQueryResponseBody</p>
     */
    public static class DepAirportCityCounty extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("adcode")
        private String adcode;

        @com.aliyun.core.annotation.NameInMap("airport_city_code")
        private String airportCityCode;

        @com.aliyun.core.annotation.NameInMap("airport_city_name")
        private String airportCityName;

        @com.aliyun.core.annotation.NameInMap("airport_code")
        private String airportCode;

        @com.aliyun.core.annotation.NameInMap("airport_name")
        private String airportName;

        @com.aliyun.core.annotation.NameInMap("airport_parent_city_name")
        private String airportParentCityName;

        @com.aliyun.core.annotation.NameInMap("county_city_adcode")
        private String countyCityAdcode;

        @com.aliyun.core.annotation.NameInMap("county_city_name")
        private String countyCityName;

        @com.aliyun.core.annotation.NameInMap("prefecture_city_adcode")
        private String prefectureCityAdcode;

        @com.aliyun.core.annotation.NameInMap("prefecture_city_name")
        private String prefectureCityName;

        private DepAirportCityCounty(Builder builder) {
            this.adcode = builder.adcode;
            this.airportCityCode = builder.airportCityCode;
            this.airportCityName = builder.airportCityName;
            this.airportCode = builder.airportCode;
            this.airportName = builder.airportName;
            this.airportParentCityName = builder.airportParentCityName;
            this.countyCityAdcode = builder.countyCityAdcode;
            this.countyCityName = builder.countyCityName;
            this.prefectureCityAdcode = builder.prefectureCityAdcode;
            this.prefectureCityName = builder.prefectureCityName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DepAirportCityCounty create() {
            return builder().build();
        }

        /**
         * @return adcode
         */
        public String getAdcode() {
            return this.adcode;
        }

        /**
         * @return airportCityCode
         */
        public String getAirportCityCode() {
            return this.airportCityCode;
        }

        /**
         * @return airportCityName
         */
        public String getAirportCityName() {
            return this.airportCityName;
        }

        /**
         * @return airportCode
         */
        public String getAirportCode() {
            return this.airportCode;
        }

        /**
         * @return airportName
         */
        public String getAirportName() {
            return this.airportName;
        }

        /**
         * @return airportParentCityName
         */
        public String getAirportParentCityName() {
            return this.airportParentCityName;
        }

        /**
         * @return countyCityAdcode
         */
        public String getCountyCityAdcode() {
            return this.countyCityAdcode;
        }

        /**
         * @return countyCityName
         */
        public String getCountyCityName() {
            return this.countyCityName;
        }

        /**
         * @return prefectureCityAdcode
         */
        public String getPrefectureCityAdcode() {
            return this.prefectureCityAdcode;
        }

        /**
         * @return prefectureCityName
         */
        public String getPrefectureCityName() {
            return this.prefectureCityName;
        }

        public static final class Builder {
            private String adcode; 
            private String airportCityCode; 
            private String airportCityName; 
            private String airportCode; 
            private String airportName; 
            private String airportParentCityName; 
            private String countyCityAdcode; 
            private String countyCityName; 
            private String prefectureCityAdcode; 
            private String prefectureCityName; 

            private Builder() {
            } 

            private Builder(DepAirportCityCounty model) {
                this.adcode = model.adcode;
                this.airportCityCode = model.airportCityCode;
                this.airportCityName = model.airportCityName;
                this.airportCode = model.airportCode;
                this.airportName = model.airportName;
                this.airportParentCityName = model.airportParentCityName;
                this.countyCityAdcode = model.countyCityAdcode;
                this.countyCityName = model.countyCityName;
                this.prefectureCityAdcode = model.prefectureCityAdcode;
                this.prefectureCityName = model.prefectureCityName;
            } 

            /**
             * adcode.
             */
            public Builder adcode(String adcode) {
                this.adcode = adcode;
                return this;
            }

            /**
             * airport_city_code.
             */
            public Builder airportCityCode(String airportCityCode) {
                this.airportCityCode = airportCityCode;
                return this;
            }

            /**
             * airport_city_name.
             */
            public Builder airportCityName(String airportCityName) {
                this.airportCityName = airportCityName;
                return this;
            }

            /**
             * airport_code.
             */
            public Builder airportCode(String airportCode) {
                this.airportCode = airportCode;
                return this;
            }

            /**
             * airport_name.
             */
            public Builder airportName(String airportName) {
                this.airportName = airportName;
                return this;
            }

            /**
             * airport_parent_city_name.
             */
            public Builder airportParentCityName(String airportParentCityName) {
                this.airportParentCityName = airportParentCityName;
                return this;
            }

            /**
             * county_city_adcode.
             */
            public Builder countyCityAdcode(String countyCityAdcode) {
                this.countyCityAdcode = countyCityAdcode;
                return this;
            }

            /**
             * county_city_name.
             */
            public Builder countyCityName(String countyCityName) {
                this.countyCityName = countyCityName;
                return this;
            }

            /**
             * prefecture_city_adcode.
             */
            public Builder prefectureCityAdcode(String prefectureCityAdcode) {
                this.prefectureCityAdcode = prefectureCityAdcode;
                return this;
            }

            /**
             * prefecture_city_name.
             */
            public Builder prefectureCityName(String prefectureCityName) {
                this.prefectureCityName = prefectureCityName;
                return this;
            }

            public DepAirportCityCounty build() {
                return new DepAirportCityCounty(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightOrderQueryResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderQueryResponseBody</p>
     */
    public static class StopAirportCityCounty extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("adcode")
        private String adcode;

        @com.aliyun.core.annotation.NameInMap("airport_city_code")
        private String airportCityCode;

        @com.aliyun.core.annotation.NameInMap("airport_city_name")
        private String airportCityName;

        @com.aliyun.core.annotation.NameInMap("airport_code")
        private String airportCode;

        @com.aliyun.core.annotation.NameInMap("airport_name")
        private String airportName;

        @com.aliyun.core.annotation.NameInMap("airport_parent_city_name")
        private String airportParentCityName;

        @com.aliyun.core.annotation.NameInMap("county_city_adcode")
        private String countyCityAdcode;

        @com.aliyun.core.annotation.NameInMap("county_city_name")
        private String countyCityName;

        @com.aliyun.core.annotation.NameInMap("prefecture_city_adcode")
        private String prefectureCityAdcode;

        @com.aliyun.core.annotation.NameInMap("prefecture_city_name")
        private String prefectureCityName;

        private StopAirportCityCounty(Builder builder) {
            this.adcode = builder.adcode;
            this.airportCityCode = builder.airportCityCode;
            this.airportCityName = builder.airportCityName;
            this.airportCode = builder.airportCode;
            this.airportName = builder.airportName;
            this.airportParentCityName = builder.airportParentCityName;
            this.countyCityAdcode = builder.countyCityAdcode;
            this.countyCityName = builder.countyCityName;
            this.prefectureCityAdcode = builder.prefectureCityAdcode;
            this.prefectureCityName = builder.prefectureCityName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StopAirportCityCounty create() {
            return builder().build();
        }

        /**
         * @return adcode
         */
        public String getAdcode() {
            return this.adcode;
        }

        /**
         * @return airportCityCode
         */
        public String getAirportCityCode() {
            return this.airportCityCode;
        }

        /**
         * @return airportCityName
         */
        public String getAirportCityName() {
            return this.airportCityName;
        }

        /**
         * @return airportCode
         */
        public String getAirportCode() {
            return this.airportCode;
        }

        /**
         * @return airportName
         */
        public String getAirportName() {
            return this.airportName;
        }

        /**
         * @return airportParentCityName
         */
        public String getAirportParentCityName() {
            return this.airportParentCityName;
        }

        /**
         * @return countyCityAdcode
         */
        public String getCountyCityAdcode() {
            return this.countyCityAdcode;
        }

        /**
         * @return countyCityName
         */
        public String getCountyCityName() {
            return this.countyCityName;
        }

        /**
         * @return prefectureCityAdcode
         */
        public String getPrefectureCityAdcode() {
            return this.prefectureCityAdcode;
        }

        /**
         * @return prefectureCityName
         */
        public String getPrefectureCityName() {
            return this.prefectureCityName;
        }

        public static final class Builder {
            private String adcode; 
            private String airportCityCode; 
            private String airportCityName; 
            private String airportCode; 
            private String airportName; 
            private String airportParentCityName; 
            private String countyCityAdcode; 
            private String countyCityName; 
            private String prefectureCityAdcode; 
            private String prefectureCityName; 

            private Builder() {
            } 

            private Builder(StopAirportCityCounty model) {
                this.adcode = model.adcode;
                this.airportCityCode = model.airportCityCode;
                this.airportCityName = model.airportCityName;
                this.airportCode = model.airportCode;
                this.airportName = model.airportName;
                this.airportParentCityName = model.airportParentCityName;
                this.countyCityAdcode = model.countyCityAdcode;
                this.countyCityName = model.countyCityName;
                this.prefectureCityAdcode = model.prefectureCityAdcode;
                this.prefectureCityName = model.prefectureCityName;
            } 

            /**
             * adcode.
             */
            public Builder adcode(String adcode) {
                this.adcode = adcode;
                return this;
            }

            /**
             * airport_city_code.
             */
            public Builder airportCityCode(String airportCityCode) {
                this.airportCityCode = airportCityCode;
                return this;
            }

            /**
             * airport_city_name.
             */
            public Builder airportCityName(String airportCityName) {
                this.airportCityName = airportCityName;
                return this;
            }

            /**
             * airport_code.
             */
            public Builder airportCode(String airportCode) {
                this.airportCode = airportCode;
                return this;
            }

            /**
             * airport_name.
             */
            public Builder airportName(String airportName) {
                this.airportName = airportName;
                return this;
            }

            /**
             * airport_parent_city_name.
             */
            public Builder airportParentCityName(String airportParentCityName) {
                this.airportParentCityName = airportParentCityName;
                return this;
            }

            /**
             * county_city_adcode.
             */
            public Builder countyCityAdcode(String countyCityAdcode) {
                this.countyCityAdcode = countyCityAdcode;
                return this;
            }

            /**
             * county_city_name.
             */
            public Builder countyCityName(String countyCityName) {
                this.countyCityName = countyCityName;
                return this;
            }

            /**
             * prefecture_city_adcode.
             */
            public Builder prefectureCityAdcode(String prefectureCityAdcode) {
                this.prefectureCityAdcode = prefectureCityAdcode;
                return this;
            }

            /**
             * prefecture_city_name.
             */
            public Builder prefectureCityName(String prefectureCityName) {
                this.prefectureCityName = prefectureCityName;
                return this;
            }

            public StopAirportCityCounty build() {
                return new StopAirportCityCounty(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightOrderQueryResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderQueryResponseBody</p>
     */
    public static class StopCityInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("stop_airport_city_county")
        private StopAirportCityCounty stopAirportCityCounty;

        @com.aliyun.core.annotation.NameInMap("stop_airport_code")
        private String stopAirportCode;

        private StopCityInfoList(Builder builder) {
            this.stopAirportCityCounty = builder.stopAirportCityCounty;
            this.stopAirportCode = builder.stopAirportCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StopCityInfoList create() {
            return builder().build();
        }

        /**
         * @return stopAirportCityCounty
         */
        public StopAirportCityCounty getStopAirportCityCounty() {
            return this.stopAirportCityCounty;
        }

        /**
         * @return stopAirportCode
         */
        public String getStopAirportCode() {
            return this.stopAirportCode;
        }

        public static final class Builder {
            private StopAirportCityCounty stopAirportCityCounty; 
            private String stopAirportCode; 

            private Builder() {
            } 

            private Builder(StopCityInfoList model) {
                this.stopAirportCityCounty = model.stopAirportCityCounty;
                this.stopAirportCode = model.stopAirportCode;
            } 

            /**
             * stop_airport_city_county.
             */
            public Builder stopAirportCityCounty(StopAirportCityCounty stopAirportCityCounty) {
                this.stopAirportCityCounty = stopAirportCityCounty;
                return this;
            }

            /**
             * stop_airport_code.
             */
            public Builder stopAirportCode(String stopAirportCode) {
                this.stopAirportCode = stopAirportCode;
                return this;
            }

            public StopCityInfoList build() {
                return new StopCityInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightOrderQueryResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderQueryResponseBody</p>
     */
    public static class FlightInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("airline_code")
        private String airlineCode;

        @com.aliyun.core.annotation.NameInMap("airline_name")
        private String airlineName;

        @com.aliyun.core.annotation.NameInMap("arr_airport_city_county")
        private ArrAirportCityCounty arrAirportCityCounty;

        @com.aliyun.core.annotation.NameInMap("arr_airport_code")
        private String arrAirportCode;

        @com.aliyun.core.annotation.NameInMap("arr_airport_name")
        private String arrAirportName;

        @com.aliyun.core.annotation.NameInMap("arr_city_ad_code")
        private String arrCityAdCode;

        @com.aliyun.core.annotation.NameInMap("arr_city_code")
        private String arrCityCode;

        @com.aliyun.core.annotation.NameInMap("arr_city_name")
        private String arrCityName;

        @com.aliyun.core.annotation.NameInMap("arr_terminal")
        private String arrTerminal;

        @com.aliyun.core.annotation.NameInMap("arr_time")
        private String arrTime;

        @com.aliyun.core.annotation.NameInMap("cabin")
        private String cabin;

        @com.aliyun.core.annotation.NameInMap("cabin_level")
        private String cabinLevel;

        @com.aliyun.core.annotation.NameInMap("dep_airport_city_county")
        private DepAirportCityCounty depAirportCityCounty;

        @com.aliyun.core.annotation.NameInMap("dep_airport_code")
        private String depAirportCode;

        @com.aliyun.core.annotation.NameInMap("dep_airport_name")
        private String depAirportName;

        @com.aliyun.core.annotation.NameInMap("dep_city_ad_code")
        private String depCityAdCode;

        @com.aliyun.core.annotation.NameInMap("dep_city_code")
        private String depCityCode;

        @com.aliyun.core.annotation.NameInMap("dep_city_name")
        private String depCityName;

        @com.aliyun.core.annotation.NameInMap("dep_terminal")
        private String depTerminal;

        @com.aliyun.core.annotation.NameInMap("dep_time")
        private String depTime;

        @com.aliyun.core.annotation.NameInMap("flight_mile")
        private Integer flightMile;

        @com.aliyun.core.annotation.NameInMap("flight_no")
        private String flightNo;

        @com.aliyun.core.annotation.NameInMap("journey_index")
        private Integer journeyIndex;

        @com.aliyun.core.annotation.NameInMap("segment_index")
        private Integer segmentIndex;

        @com.aliyun.core.annotation.NameInMap("stop_city")
        private java.util.List<String> stopCity;

        @com.aliyun.core.annotation.NameInMap("stop_city_info_list")
        private java.util.List<StopCityInfoList> stopCityInfoList;

        private FlightInfoList(Builder builder) {
            this.airlineCode = builder.airlineCode;
            this.airlineName = builder.airlineName;
            this.arrAirportCityCounty = builder.arrAirportCityCounty;
            this.arrAirportCode = builder.arrAirportCode;
            this.arrAirportName = builder.arrAirportName;
            this.arrCityAdCode = builder.arrCityAdCode;
            this.arrCityCode = builder.arrCityCode;
            this.arrCityName = builder.arrCityName;
            this.arrTerminal = builder.arrTerminal;
            this.arrTime = builder.arrTime;
            this.cabin = builder.cabin;
            this.cabinLevel = builder.cabinLevel;
            this.depAirportCityCounty = builder.depAirportCityCounty;
            this.depAirportCode = builder.depAirportCode;
            this.depAirportName = builder.depAirportName;
            this.depCityAdCode = builder.depCityAdCode;
            this.depCityCode = builder.depCityCode;
            this.depCityName = builder.depCityName;
            this.depTerminal = builder.depTerminal;
            this.depTime = builder.depTime;
            this.flightMile = builder.flightMile;
            this.flightNo = builder.flightNo;
            this.journeyIndex = builder.journeyIndex;
            this.segmentIndex = builder.segmentIndex;
            this.stopCity = builder.stopCity;
            this.stopCityInfoList = builder.stopCityInfoList;
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
         * @return arrAirportCityCounty
         */
        public ArrAirportCityCounty getArrAirportCityCounty() {
            return this.arrAirportCityCounty;
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
         * @return arrCityAdCode
         */
        public String getArrCityAdCode() {
            return this.arrCityAdCode;
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
         * @return arrTerminal
         */
        public String getArrTerminal() {
            return this.arrTerminal;
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
         * @return depAirportCityCounty
         */
        public DepAirportCityCounty getDepAirportCityCounty() {
            return this.depAirportCityCounty;
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
         * @return depCityAdCode
         */
        public String getDepCityAdCode() {
            return this.depCityAdCode;
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
         * @return depTerminal
         */
        public String getDepTerminal() {
            return this.depTerminal;
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

        /**
         * @return journeyIndex
         */
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        /**
         * @return segmentIndex
         */
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        /**
         * @return stopCity
         */
        public java.util.List<String> getStopCity() {
            return this.stopCity;
        }

        /**
         * @return stopCityInfoList
         */
        public java.util.List<StopCityInfoList> getStopCityInfoList() {
            return this.stopCityInfoList;
        }

        public static final class Builder {
            private String airlineCode; 
            private String airlineName; 
            private ArrAirportCityCounty arrAirportCityCounty; 
            private String arrAirportCode; 
            private String arrAirportName; 
            private String arrCityAdCode; 
            private String arrCityCode; 
            private String arrCityName; 
            private String arrTerminal; 
            private String arrTime; 
            private String cabin; 
            private String cabinLevel; 
            private DepAirportCityCounty depAirportCityCounty; 
            private String depAirportCode; 
            private String depAirportName; 
            private String depCityAdCode; 
            private String depCityCode; 
            private String depCityName; 
            private String depTerminal; 
            private String depTime; 
            private Integer flightMile; 
            private String flightNo; 
            private Integer journeyIndex; 
            private Integer segmentIndex; 
            private java.util.List<String> stopCity; 
            private java.util.List<StopCityInfoList> stopCityInfoList; 

            private Builder() {
            } 

            private Builder(FlightInfoList model) {
                this.airlineCode = model.airlineCode;
                this.airlineName = model.airlineName;
                this.arrAirportCityCounty = model.arrAirportCityCounty;
                this.arrAirportCode = model.arrAirportCode;
                this.arrAirportName = model.arrAirportName;
                this.arrCityAdCode = model.arrCityAdCode;
                this.arrCityCode = model.arrCityCode;
                this.arrCityName = model.arrCityName;
                this.arrTerminal = model.arrTerminal;
                this.arrTime = model.arrTime;
                this.cabin = model.cabin;
                this.cabinLevel = model.cabinLevel;
                this.depAirportCityCounty = model.depAirportCityCounty;
                this.depAirportCode = model.depAirportCode;
                this.depAirportName = model.depAirportName;
                this.depCityAdCode = model.depCityAdCode;
                this.depCityCode = model.depCityCode;
                this.depCityName = model.depCityName;
                this.depTerminal = model.depTerminal;
                this.depTime = model.depTime;
                this.flightMile = model.flightMile;
                this.flightNo = model.flightNo;
                this.journeyIndex = model.journeyIndex;
                this.segmentIndex = model.segmentIndex;
                this.stopCity = model.stopCity;
                this.stopCityInfoList = model.stopCityInfoList;
            } 

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
             * arr_airport_city_county.
             */
            public Builder arrAirportCityCounty(ArrAirportCityCounty arrAirportCityCounty) {
                this.arrAirportCityCounty = arrAirportCityCounty;
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
             * arr_city_ad_code.
             */
            public Builder arrCityAdCode(String arrCityAdCode) {
                this.arrCityAdCode = arrCityAdCode;
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
             * arr_terminal.
             */
            public Builder arrTerminal(String arrTerminal) {
                this.arrTerminal = arrTerminal;
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
             * dep_airport_city_county.
             */
            public Builder depAirportCityCounty(DepAirportCityCounty depAirportCityCounty) {
                this.depAirportCityCounty = depAirportCityCounty;
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
             * dep_city_ad_code.
             */
            public Builder depCityAdCode(String depCityAdCode) {
                this.depCityAdCode = depCityAdCode;
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
             * dep_terminal.
             */
            public Builder depTerminal(String depTerminal) {
                this.depTerminal = depTerminal;
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

            /**
             * journey_index.
             */
            public Builder journeyIndex(Integer journeyIndex) {
                this.journeyIndex = journeyIndex;
                return this;
            }

            /**
             * segment_index.
             */
            public Builder segmentIndex(Integer segmentIndex) {
                this.segmentIndex = segmentIndex;
                return this;
            }

            /**
             * stop_city.
             */
            public Builder stopCity(java.util.List<String> stopCity) {
                this.stopCity = stopCity;
                return this;
            }

            /**
             * stop_city_info_list.
             */
            public Builder stopCityInfoList(java.util.List<StopCityInfoList> stopCityInfoList) {
                this.stopCityInfoList = stopCityInfoList;
                return this;
            }

            public FlightInfoList build() {
                return new FlightInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightOrderQueryResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderQueryResponseBody</p>
     */
    public static class FlightRefundTicketInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apply_id")
        private String applyId;

        @com.aliyun.core.annotation.NameInMap("arr_airport")
        private String arrAirport;

        @com.aliyun.core.annotation.NameInMap("arr_airport_code")
        private String arrAirportCode;

        @com.aliyun.core.annotation.NameInMap("arr_city")
        private String arrCity;

        @com.aliyun.core.annotation.NameInMap("arr_city_code")
        private String arrCityCode;

        @com.aliyun.core.annotation.NameInMap("company_refund_ticket_fee")
        private Double companyRefundTicketFee;

        @com.aliyun.core.annotation.NameInMap("dep_airport")
        private String depAirport;

        @com.aliyun.core.annotation.NameInMap("dep_airport_code")
        private String depAirportCode;

        @com.aliyun.core.annotation.NameInMap("dep_city")
        private String depCity;

        @com.aliyun.core.annotation.NameInMap("dep_city_code")
        private String depCityCode;

        @com.aliyun.core.annotation.NameInMap("flight_no")
        private String flightNo;

        @com.aliyun.core.annotation.NameInMap("gmt_create")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmt_modify")
        private String gmtModify;

        @com.aliyun.core.annotation.NameInMap("journey_index")
        private Integer journeyIndex;

        @com.aliyun.core.annotation.NameInMap("out_apply_id")
        private String outApplyId;

        @com.aliyun.core.annotation.NameInMap("personal_refund_ticket_fee")
        private Double personalRefundTicketFee;

        @com.aliyun.core.annotation.NameInMap("refund_order_id")
        private Long refundOrderId;

        @com.aliyun.core.annotation.NameInMap("refund_reason")
        private String refundReason;

        @com.aliyun.core.annotation.NameInMap("refund_ticket_fee")
        private Double refundTicketFee;

        @com.aliyun.core.annotation.NameInMap("refund_type")
        private Integer refundType;

        @com.aliyun.core.annotation.NameInMap("segment_index")
        private Integer segmentIndex;

        @com.aliyun.core.annotation.NameInMap("ticket_no")
        private String ticketNo;

        private FlightRefundTicketInfoList(Builder builder) {
            this.applyId = builder.applyId;
            this.arrAirport = builder.arrAirport;
            this.arrAirportCode = builder.arrAirportCode;
            this.arrCity = builder.arrCity;
            this.arrCityCode = builder.arrCityCode;
            this.companyRefundTicketFee = builder.companyRefundTicketFee;
            this.depAirport = builder.depAirport;
            this.depAirportCode = builder.depAirportCode;
            this.depCity = builder.depCity;
            this.depCityCode = builder.depCityCode;
            this.flightNo = builder.flightNo;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModify = builder.gmtModify;
            this.journeyIndex = builder.journeyIndex;
            this.outApplyId = builder.outApplyId;
            this.personalRefundTicketFee = builder.personalRefundTicketFee;
            this.refundOrderId = builder.refundOrderId;
            this.refundReason = builder.refundReason;
            this.refundTicketFee = builder.refundTicketFee;
            this.refundType = builder.refundType;
            this.segmentIndex = builder.segmentIndex;
            this.ticketNo = builder.ticketNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightRefundTicketInfoList create() {
            return builder().build();
        }

        /**
         * @return applyId
         */
        public String getApplyId() {
            return this.applyId;
        }

        /**
         * @return arrAirport
         */
        public String getArrAirport() {
            return this.arrAirport;
        }

        /**
         * @return arrAirportCode
         */
        public String getArrAirportCode() {
            return this.arrAirportCode;
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
         * @return companyRefundTicketFee
         */
        public Double getCompanyRefundTicketFee() {
            return this.companyRefundTicketFee;
        }

        /**
         * @return depAirport
         */
        public String getDepAirport() {
            return this.depAirport;
        }

        /**
         * @return depAirportCode
         */
        public String getDepAirportCode() {
            return this.depAirportCode;
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
         * @return flightNo
         */
        public String getFlightNo() {
            return this.flightNo;
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
         * @return journeyIndex
         */
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        /**
         * @return outApplyId
         */
        public String getOutApplyId() {
            return this.outApplyId;
        }

        /**
         * @return personalRefundTicketFee
         */
        public Double getPersonalRefundTicketFee() {
            return this.personalRefundTicketFee;
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
         * @return segmentIndex
         */
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        /**
         * @return ticketNo
         */
        public String getTicketNo() {
            return this.ticketNo;
        }

        public static final class Builder {
            private String applyId; 
            private String arrAirport; 
            private String arrAirportCode; 
            private String arrCity; 
            private String arrCityCode; 
            private Double companyRefundTicketFee; 
            private String depAirport; 
            private String depAirportCode; 
            private String depCity; 
            private String depCityCode; 
            private String flightNo; 
            private String gmtCreate; 
            private String gmtModify; 
            private Integer journeyIndex; 
            private String outApplyId; 
            private Double personalRefundTicketFee; 
            private Long refundOrderId; 
            private String refundReason; 
            private Double refundTicketFee; 
            private Integer refundType; 
            private Integer segmentIndex; 
            private String ticketNo; 

            private Builder() {
            } 

            private Builder(FlightRefundTicketInfoList model) {
                this.applyId = model.applyId;
                this.arrAirport = model.arrAirport;
                this.arrAirportCode = model.arrAirportCode;
                this.arrCity = model.arrCity;
                this.arrCityCode = model.arrCityCode;
                this.companyRefundTicketFee = model.companyRefundTicketFee;
                this.depAirport = model.depAirport;
                this.depAirportCode = model.depAirportCode;
                this.depCity = model.depCity;
                this.depCityCode = model.depCityCode;
                this.flightNo = model.flightNo;
                this.gmtCreate = model.gmtCreate;
                this.gmtModify = model.gmtModify;
                this.journeyIndex = model.journeyIndex;
                this.outApplyId = model.outApplyId;
                this.personalRefundTicketFee = model.personalRefundTicketFee;
                this.refundOrderId = model.refundOrderId;
                this.refundReason = model.refundReason;
                this.refundTicketFee = model.refundTicketFee;
                this.refundType = model.refundType;
                this.segmentIndex = model.segmentIndex;
                this.ticketNo = model.ticketNo;
            } 

            /**
             * apply_id.
             */
            public Builder applyId(String applyId) {
                this.applyId = applyId;
                return this;
            }

            /**
             * arr_airport.
             */
            public Builder arrAirport(String arrAirport) {
                this.arrAirport = arrAirport;
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
             * company_refund_ticket_fee.
             */
            public Builder companyRefundTicketFee(Double companyRefundTicketFee) {
                this.companyRefundTicketFee = companyRefundTicketFee;
                return this;
            }

            /**
             * dep_airport.
             */
            public Builder depAirport(String depAirport) {
                this.depAirport = depAirport;
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
             * flight_no.
             */
            public Builder flightNo(String flightNo) {
                this.flightNo = flightNo;
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
             * journey_index.
             */
            public Builder journeyIndex(Integer journeyIndex) {
                this.journeyIndex = journeyIndex;
                return this;
            }

            /**
             * out_apply_id.
             */
            public Builder outApplyId(String outApplyId) {
                this.outApplyId = outApplyId;
                return this;
            }

            /**
             * personal_refund_ticket_fee.
             */
            public Builder personalRefundTicketFee(Double personalRefundTicketFee) {
                this.personalRefundTicketFee = personalRefundTicketFee;
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
             * segment_index.
             */
            public Builder segmentIndex(Integer segmentIndex) {
                this.segmentIndex = segmentIndex;
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
    /**
     * 
     * {@link FlightOrderQueryResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderQueryResponseBody</p>
     */
    public static class FlightTicketInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arr_airport")
        private String arrAirport;

        @com.aliyun.core.annotation.NameInMap("arr_airport_code")
        private String arrAirportCode;

        @com.aliyun.core.annotation.NameInMap("arr_city")
        private String arrCity;

        @com.aliyun.core.annotation.NameInMap("arr_city_code")
        private String arrCityCode;

        @com.aliyun.core.annotation.NameInMap("build_price")
        private Double buildPrice;

        @com.aliyun.core.annotation.NameInMap("changed")
        private Boolean changed;

        @com.aliyun.core.annotation.NameInMap("dep_airport")
        private String depAirport;

        @com.aliyun.core.annotation.NameInMap("dep_airport_code")
        private String depAirportCode;

        @com.aliyun.core.annotation.NameInMap("dep_city")
        private String depCity;

        @com.aliyun.core.annotation.NameInMap("dep_city_code")
        private String depCityCode;

        @com.aliyun.core.annotation.NameInMap("discount")
        private Integer discount;

        @com.aliyun.core.annotation.NameInMap("flight_no")
        private String flightNo;

        @com.aliyun.core.annotation.NameInMap("gmt_create")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmt_modify")
        private String gmtModify;

        @com.aliyun.core.annotation.NameInMap("journey_index")
        private Integer journeyIndex;

        @com.aliyun.core.annotation.NameInMap("oil_price")
        private Double oilPrice;

        @com.aliyun.core.annotation.NameInMap("pay_type")
        private Integer payType;

        @com.aliyun.core.annotation.NameInMap("personal_price")
        private Double personalPrice;

        @com.aliyun.core.annotation.NameInMap("segment_index")
        private Integer segmentIndex;

        @com.aliyun.core.annotation.NameInMap("settle_price")
        private Double settlePrice;

        @com.aliyun.core.annotation.NameInMap("ticket_no")
        private String ticketNo;

        @com.aliyun.core.annotation.NameInMap("ticket_price")
        private Double ticketPrice;

        @com.aliyun.core.annotation.NameInMap("ticket_status")
        private String ticketStatus;

        @com.aliyun.core.annotation.NameInMap("ticket_status_code")
        private Integer ticketStatusCode;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        private FlightTicketInfoList(Builder builder) {
            this.arrAirport = builder.arrAirport;
            this.arrAirportCode = builder.arrAirportCode;
            this.arrCity = builder.arrCity;
            this.arrCityCode = builder.arrCityCode;
            this.buildPrice = builder.buildPrice;
            this.changed = builder.changed;
            this.depAirport = builder.depAirport;
            this.depAirportCode = builder.depAirportCode;
            this.depCity = builder.depCity;
            this.depCityCode = builder.depCityCode;
            this.discount = builder.discount;
            this.flightNo = builder.flightNo;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModify = builder.gmtModify;
            this.journeyIndex = builder.journeyIndex;
            this.oilPrice = builder.oilPrice;
            this.payType = builder.payType;
            this.personalPrice = builder.personalPrice;
            this.segmentIndex = builder.segmentIndex;
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
         * @return arrAirport
         */
        public String getArrAirport() {
            return this.arrAirport;
        }

        /**
         * @return arrAirportCode
         */
        public String getArrAirportCode() {
            return this.arrAirportCode;
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
         * @return depAirport
         */
        public String getDepAirport() {
            return this.depAirport;
        }

        /**
         * @return depAirportCode
         */
        public String getDepAirportCode() {
            return this.depAirportCode;
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
         * @return discount
         */
        public Integer getDiscount() {
            return this.discount;
        }

        /**
         * @return flightNo
         */
        public String getFlightNo() {
            return this.flightNo;
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
         * @return journeyIndex
         */
        public Integer getJourneyIndex() {
            return this.journeyIndex;
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
         * @return personalPrice
         */
        public Double getPersonalPrice() {
            return this.personalPrice;
        }

        /**
         * @return segmentIndex
         */
        public Integer getSegmentIndex() {
            return this.segmentIndex;
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
            private String arrAirport; 
            private String arrAirportCode; 
            private String arrCity; 
            private String arrCityCode; 
            private Double buildPrice; 
            private Boolean changed; 
            private String depAirport; 
            private String depAirportCode; 
            private String depCity; 
            private String depCityCode; 
            private Integer discount; 
            private String flightNo; 
            private String gmtCreate; 
            private String gmtModify; 
            private Integer journeyIndex; 
            private Double oilPrice; 
            private Integer payType; 
            private Double personalPrice; 
            private Integer segmentIndex; 
            private Double settlePrice; 
            private String ticketNo; 
            private Double ticketPrice; 
            private String ticketStatus; 
            private Integer ticketStatusCode; 
            private String userId; 

            private Builder() {
            } 

            private Builder(FlightTicketInfoList model) {
                this.arrAirport = model.arrAirport;
                this.arrAirportCode = model.arrAirportCode;
                this.arrCity = model.arrCity;
                this.arrCityCode = model.arrCityCode;
                this.buildPrice = model.buildPrice;
                this.changed = model.changed;
                this.depAirport = model.depAirport;
                this.depAirportCode = model.depAirportCode;
                this.depCity = model.depCity;
                this.depCityCode = model.depCityCode;
                this.discount = model.discount;
                this.flightNo = model.flightNo;
                this.gmtCreate = model.gmtCreate;
                this.gmtModify = model.gmtModify;
                this.journeyIndex = model.journeyIndex;
                this.oilPrice = model.oilPrice;
                this.payType = model.payType;
                this.personalPrice = model.personalPrice;
                this.segmentIndex = model.segmentIndex;
                this.settlePrice = model.settlePrice;
                this.ticketNo = model.ticketNo;
                this.ticketPrice = model.ticketPrice;
                this.ticketStatus = model.ticketStatus;
                this.ticketStatusCode = model.ticketStatusCode;
                this.userId = model.userId;
            } 

            /**
             * arr_airport.
             */
            public Builder arrAirport(String arrAirport) {
                this.arrAirport = arrAirport;
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
             * dep_airport.
             */
            public Builder depAirport(String depAirport) {
                this.depAirport = depAirport;
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
             * discount.
             */
            public Builder discount(Integer discount) {
                this.discount = discount;
                return this;
            }

            /**
             * flight_no.
             */
            public Builder flightNo(String flightNo) {
                this.flightNo = flightNo;
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
             * journey_index.
             */
            public Builder journeyIndex(Integer journeyIndex) {
                this.journeyIndex = journeyIndex;
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
             * personal_price.
             */
            public Builder personalPrice(Double personalPrice) {
                this.personalPrice = personalPrice;
                return this;
            }

            /**
             * segment_index.
             */
            public Builder segmentIndex(Integer segmentIndex) {
                this.segmentIndex = segmentIndex;
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
    /**
     * 
     * {@link FlightOrderQueryResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderQueryResponseBody</p>
     */
    public static class InsuranceInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("amount")
        private Double amount;

        @com.aliyun.core.annotation.NameInMap("insurance_no")
        private String insuranceNo;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private InsuranceInfoList(Builder builder) {
            this.amount = builder.amount;
            this.insuranceNo = builder.insuranceNo;
            this.name = builder.name;
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
         * @return name
         */
        public String getName() {
            return this.name;
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
            private String name; 
            private Integer status; 
            private String type; 

            private Builder() {
            } 

            private Builder(InsuranceInfoList model) {
                this.amount = model.amount;
                this.insuranceNo = model.insuranceNo;
                this.name = model.name;
                this.status = model.status;
                this.type = model.type;
            } 

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
             * name.
             */
            public Builder name(String name) {
                this.name = name;
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
    /**
     * 
     * {@link FlightOrderQueryResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderQueryResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(InvoiceInfo model) {
                this.id = model.id;
                this.title = model.title;
            } 

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
    /**
     * 
     * {@link FlightOrderQueryResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderQueryResponseBody</p>
     */
    public static class OrderBaseInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apply_id")
        private String applyId;

        @com.aliyun.core.annotation.NameInMap("btrip_title")
        private String btripTitle;

        @com.aliyun.core.annotation.NameInMap("contact_name")
        private String contactName;

        @com.aliyun.core.annotation.NameInMap("corp_id")
        private String corpId;

        @com.aliyun.core.annotation.NameInMap("corp_name")
        private String corpName;

        @com.aliyun.core.annotation.NameInMap("depart_id")
        private String departId;

        @com.aliyun.core.annotation.NameInMap("depart_name")
        private String departName;

        @com.aliyun.core.annotation.NameInMap("exceed_apply_id")
        private String exceedApplyId;

        @com.aliyun.core.annotation.NameInMap("exceed_third_part_apply_id")
        private String exceedThirdPartApplyId;

        @com.aliyun.core.annotation.NameInMap("gmt_create")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmt_modify")
        private String gmtModify;

        @com.aliyun.core.annotation.NameInMap("itinerary_id")
        private String itineraryId;

        @com.aliyun.core.annotation.NameInMap("order_id")
        private Long orderId;

        @com.aliyun.core.annotation.NameInMap("order_status")
        private Integer orderStatus;

        @com.aliyun.core.annotation.NameInMap("supplier")
        private String supplier;

        @com.aliyun.core.annotation.NameInMap("thirdpart_apply_id")
        private String thirdpartApplyId;

        @com.aliyun.core.annotation.NameInMap("thirdpart_business_id")
        private String thirdpartBusinessId;

        @com.aliyun.core.annotation.NameInMap("thirdpart_corp_id")
        private String thirdpartCorpId;

        @com.aliyun.core.annotation.NameInMap("thirdpart_itinerary_id")
        private String thirdpartItineraryId;

        @com.aliyun.core.annotation.NameInMap("trip_type")
        private Integer tripType;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        private OrderBaseInfo(Builder builder) {
            this.applyId = builder.applyId;
            this.btripTitle = builder.btripTitle;
            this.contactName = builder.contactName;
            this.corpId = builder.corpId;
            this.corpName = builder.corpName;
            this.departId = builder.departId;
            this.departName = builder.departName;
            this.exceedApplyId = builder.exceedApplyId;
            this.exceedThirdPartApplyId = builder.exceedThirdPartApplyId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModify = builder.gmtModify;
            this.itineraryId = builder.itineraryId;
            this.orderId = builder.orderId;
            this.orderStatus = builder.orderStatus;
            this.supplier = builder.supplier;
            this.thirdpartApplyId = builder.thirdpartApplyId;
            this.thirdpartBusinessId = builder.thirdpartBusinessId;
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
         * @return exceedApplyId
         */
        public String getExceedApplyId() {
            return this.exceedApplyId;
        }

        /**
         * @return exceedThirdPartApplyId
         */
        public String getExceedThirdPartApplyId() {
            return this.exceedThirdPartApplyId;
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
         * @return supplier
         */
        public String getSupplier() {
            return this.supplier;
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
            private String exceedApplyId; 
            private String exceedThirdPartApplyId; 
            private String gmtCreate; 
            private String gmtModify; 
            private String itineraryId; 
            private Long orderId; 
            private Integer orderStatus; 
            private String supplier; 
            private String thirdpartApplyId; 
            private String thirdpartBusinessId; 
            private String thirdpartCorpId; 
            private String thirdpartItineraryId; 
            private Integer tripType; 
            private String userId; 

            private Builder() {
            } 

            private Builder(OrderBaseInfo model) {
                this.applyId = model.applyId;
                this.btripTitle = model.btripTitle;
                this.contactName = model.contactName;
                this.corpId = model.corpId;
                this.corpName = model.corpName;
                this.departId = model.departId;
                this.departName = model.departName;
                this.exceedApplyId = model.exceedApplyId;
                this.exceedThirdPartApplyId = model.exceedThirdPartApplyId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModify = model.gmtModify;
                this.itineraryId = model.itineraryId;
                this.orderId = model.orderId;
                this.orderStatus = model.orderStatus;
                this.supplier = model.supplier;
                this.thirdpartApplyId = model.thirdpartApplyId;
                this.thirdpartBusinessId = model.thirdpartBusinessId;
                this.thirdpartCorpId = model.thirdpartCorpId;
                this.thirdpartItineraryId = model.thirdpartItineraryId;
                this.tripType = model.tripType;
                this.userId = model.userId;
            } 

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
             * exceed_apply_id.
             */
            public Builder exceedApplyId(String exceedApplyId) {
                this.exceedApplyId = exceedApplyId;
                return this;
            }

            /**
             * exceed_third_part_apply_id.
             */
            public Builder exceedThirdPartApplyId(String exceedThirdPartApplyId) {
                this.exceedThirdPartApplyId = exceedThirdPartApplyId;
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
             * supplier.
             */
            public Builder supplier(String supplier) {
                this.supplier = supplier;
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
    /**
     * 
     * {@link FlightOrderQueryResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderQueryResponseBody</p>
     */
    public static class PassengerInfoList extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("thirdpart_project_id")
        private String thirdpartProjectId;

        @com.aliyun.core.annotation.NameInMap("user_id")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("user_name")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("user_type")
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

            private Builder() {
            } 

            private Builder(PassengerInfoList model) {
                this.costCenterId = model.costCenterId;
                this.costCenterName = model.costCenterName;
                this.costCenterNumber = model.costCenterNumber;
                this.projectCode = model.projectCode;
                this.projectId = model.projectId;
                this.projectTitle = model.projectTitle;
                this.thirdpartProjectId = model.thirdpartProjectId;
                this.userId = model.userId;
                this.userName = model.userName;
                this.userType = model.userType;
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
    /**
     * 
     * {@link FlightOrderQueryResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderQueryResponseBody</p>
     */
    public static class PriceInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("category_code")
        private Integer categoryCode;

        @com.aliyun.core.annotation.NameInMap("gmt_create")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("passenger_name")
        private String passengerName;

        @com.aliyun.core.annotation.NameInMap("pay_type")
        private Integer payType;

        @com.aliyun.core.annotation.NameInMap("price")
        private Double price;

        @com.aliyun.core.annotation.NameInMap("trade_id")
        private String tradeId;

        @com.aliyun.core.annotation.NameInMap("type")
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

            private Builder() {
            } 

            private Builder(PriceInfoList model) {
                this.categoryCode = model.categoryCode;
                this.gmtCreate = model.gmtCreate;
                this.passengerName = model.passengerName;
                this.payType = model.payType;
                this.price = model.price;
                this.tradeId = model.tradeId;
                this.type = model.type;
            } 

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
    /**
     * 
     * {@link FlightOrderQueryResponseBody} extends {@link TeaModel}
     *
     * <p>FlightOrderQueryResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("flight_change_ticket_info_list")
        private java.util.List<FlightChangeTicketInfoList> flightChangeTicketInfoList;

        @com.aliyun.core.annotation.NameInMap("flight_info_list")
        private java.util.List<FlightInfoList> flightInfoList;

        @com.aliyun.core.annotation.NameInMap("flight_refund_ticket_info_list")
        private java.util.List<FlightRefundTicketInfoList> flightRefundTicketInfoList;

        @com.aliyun.core.annotation.NameInMap("flight_ticket_info_list")
        private java.util.List<FlightTicketInfoList> flightTicketInfoList;

        @com.aliyun.core.annotation.NameInMap("insurance_info_list")
        private java.util.List<InsuranceInfoList> insuranceInfoList;

        @com.aliyun.core.annotation.NameInMap("invoice_info")
        private InvoiceInfo invoiceInfo;

        @com.aliyun.core.annotation.NameInMap("order_base_info")
        private OrderBaseInfo orderBaseInfo;

        @com.aliyun.core.annotation.NameInMap("passenger_info_list")
        private java.util.List<PassengerInfoList> passengerInfoList;

        @com.aliyun.core.annotation.NameInMap("price_info_list")
        private java.util.List<PriceInfoList> priceInfoList;

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
        public java.util.List<FlightChangeTicketInfoList> getFlightChangeTicketInfoList() {
            return this.flightChangeTicketInfoList;
        }

        /**
         * @return flightInfoList
         */
        public java.util.List<FlightInfoList> getFlightInfoList() {
            return this.flightInfoList;
        }

        /**
         * @return flightRefundTicketInfoList
         */
        public java.util.List<FlightRefundTicketInfoList> getFlightRefundTicketInfoList() {
            return this.flightRefundTicketInfoList;
        }

        /**
         * @return flightTicketInfoList
         */
        public java.util.List<FlightTicketInfoList> getFlightTicketInfoList() {
            return this.flightTicketInfoList;
        }

        /**
         * @return insuranceInfoList
         */
        public java.util.List<InsuranceInfoList> getInsuranceInfoList() {
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
        public java.util.List<PassengerInfoList> getPassengerInfoList() {
            return this.passengerInfoList;
        }

        /**
         * @return priceInfoList
         */
        public java.util.List<PriceInfoList> getPriceInfoList() {
            return this.priceInfoList;
        }

        public static final class Builder {
            private java.util.List<FlightChangeTicketInfoList> flightChangeTicketInfoList; 
            private java.util.List<FlightInfoList> flightInfoList; 
            private java.util.List<FlightRefundTicketInfoList> flightRefundTicketInfoList; 
            private java.util.List<FlightTicketInfoList> flightTicketInfoList; 
            private java.util.List<InsuranceInfoList> insuranceInfoList; 
            private InvoiceInfo invoiceInfo; 
            private OrderBaseInfo orderBaseInfo; 
            private java.util.List<PassengerInfoList> passengerInfoList; 
            private java.util.List<PriceInfoList> priceInfoList; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.flightChangeTicketInfoList = model.flightChangeTicketInfoList;
                this.flightInfoList = model.flightInfoList;
                this.flightRefundTicketInfoList = model.flightRefundTicketInfoList;
                this.flightTicketInfoList = model.flightTicketInfoList;
                this.insuranceInfoList = model.insuranceInfoList;
                this.invoiceInfo = model.invoiceInfo;
                this.orderBaseInfo = model.orderBaseInfo;
                this.passengerInfoList = model.passengerInfoList;
                this.priceInfoList = model.priceInfoList;
            } 

            /**
             * flight_change_ticket_info_list.
             */
            public Builder flightChangeTicketInfoList(java.util.List<FlightChangeTicketInfoList> flightChangeTicketInfoList) {
                this.flightChangeTicketInfoList = flightChangeTicketInfoList;
                return this;
            }

            /**
             * flight_info_list.
             */
            public Builder flightInfoList(java.util.List<FlightInfoList> flightInfoList) {
                this.flightInfoList = flightInfoList;
                return this;
            }

            /**
             * flight_refund_ticket_info_list.
             */
            public Builder flightRefundTicketInfoList(java.util.List<FlightRefundTicketInfoList> flightRefundTicketInfoList) {
                this.flightRefundTicketInfoList = flightRefundTicketInfoList;
                return this;
            }

            /**
             * flight_ticket_info_list.
             */
            public Builder flightTicketInfoList(java.util.List<FlightTicketInfoList> flightTicketInfoList) {
                this.flightTicketInfoList = flightTicketInfoList;
                return this;
            }

            /**
             * insurance_info_list.
             */
            public Builder insuranceInfoList(java.util.List<InsuranceInfoList> insuranceInfoList) {
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
            public Builder passengerInfoList(java.util.List<PassengerInfoList> passengerInfoList) {
                this.passengerInfoList = passengerInfoList;
                return this;
            }

            /**
             * price_info_list.
             */
            public Builder priceInfoList(java.util.List<PriceInfoList> priceInfoList) {
                this.priceInfoList = priceInfoList;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
