// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlightExceedApplyQueryResponseBody} extends {@link TeaModel}
 *
 * <p>FlightExceedApplyQueryResponseBody</p>
 */
public class FlightExceedApplyQueryResponseBody extends TeaModel {
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

    private FlightExceedApplyQueryResponseBody(Builder builder) {
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

    public static FlightExceedApplyQueryResponseBody create() {
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

        public FlightExceedApplyQueryResponseBody build() {
            return new FlightExceedApplyQueryResponseBody(this);
        } 

    } 

    public static class ApplyIntentionInfoDo extends TeaModel {
        @NameInMap("arr_airport_name")
        private String arrAirportName;

        @NameInMap("arr_city")
        private String arrCity;

        @NameInMap("arr_city_name")
        private String arrCityName;

        @NameInMap("arr_time")
        private String arrTime;

        @NameInMap("cabin")
        private String cabin;

        @NameInMap("cabin_class")
        private Integer cabinClass;

        @NameInMap("cabin_class_str")
        private String cabinClassStr;

        @NameInMap("dep_airport_name")
        private String depAirportName;

        @NameInMap("dep_city")
        private String depCity;

        @NameInMap("dep_city_name")
        private String depCityName;

        @NameInMap("dep_time")
        private String depTime;

        @NameInMap("discount")
        private String discount;

        @NameInMap("flight_no")
        private String flightNo;

        @NameInMap("price")
        private Long price;

        @NameInMap("type")
        private Integer type;

        private ApplyIntentionInfoDo(Builder builder) {
            this.arrAirportName = builder.arrAirportName;
            this.arrCity = builder.arrCity;
            this.arrCityName = builder.arrCityName;
            this.arrTime = builder.arrTime;
            this.cabin = builder.cabin;
            this.cabinClass = builder.cabinClass;
            this.cabinClassStr = builder.cabinClassStr;
            this.depAirportName = builder.depAirportName;
            this.depCity = builder.depCity;
            this.depCityName = builder.depCityName;
            this.depTime = builder.depTime;
            this.discount = builder.discount;
            this.flightNo = builder.flightNo;
            this.price = builder.price;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplyIntentionInfoDo create() {
            return builder().build();
        }

        /**
         * @return arrAirportName
         */
        public String getArrAirportName() {
            return this.arrAirportName;
        }

        /**
         * @return arrCity
         */
        public String getArrCity() {
            return this.arrCity;
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
         * @return cabinClass
         */
        public Integer getCabinClass() {
            return this.cabinClass;
        }

        /**
         * @return cabinClassStr
         */
        public String getCabinClassStr() {
            return this.cabinClassStr;
        }

        /**
         * @return depAirportName
         */
        public String getDepAirportName() {
            return this.depAirportName;
        }

        /**
         * @return depCity
         */
        public String getDepCity() {
            return this.depCity;
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
         * @return discount
         */
        public String getDiscount() {
            return this.discount;
        }

        /**
         * @return flightNo
         */
        public String getFlightNo() {
            return this.flightNo;
        }

        /**
         * @return price
         */
        public Long getPrice() {
            return this.price;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String arrAirportName; 
            private String arrCity; 
            private String arrCityName; 
            private String arrTime; 
            private String cabin; 
            private Integer cabinClass; 
            private String cabinClassStr; 
            private String depAirportName; 
            private String depCity; 
            private String depCityName; 
            private String depTime; 
            private String discount; 
            private String flightNo; 
            private Long price; 
            private Integer type; 

            /**
             * arr_airport_name.
             */
            public Builder arrAirportName(String arrAirportName) {
                this.arrAirportName = arrAirportName;
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
             * cabin_class.
             */
            public Builder cabinClass(Integer cabinClass) {
                this.cabinClass = cabinClass;
                return this;
            }

            /**
             * cabin_class_str.
             */
            public Builder cabinClassStr(String cabinClassStr) {
                this.cabinClassStr = cabinClassStr;
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
             * dep_city.
             */
            public Builder depCity(String depCity) {
                this.depCity = depCity;
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
             * discount.
             */
            public Builder discount(String discount) {
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
             * price.
             */
            public Builder price(Long price) {
                this.price = price;
                return this;
            }

            /**
             * type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public ApplyIntentionInfoDo build() {
                return new ApplyIntentionInfoDo(this);
            } 

        } 

    }
    public static class ApplyRecommendFlights extends TeaModel {
        @NameInMap("arr_airport_name")
        private String arrAirportName;

        @NameInMap("arr_city_name")
        private String arrCityName;

        @NameInMap("arr_time")
        private String arrTime;

        @NameInMap("cabin")
        private String cabin;

        @NameInMap("cabin_class")
        private Integer cabinClass;

        @NameInMap("cabin_class_str")
        private String cabinClassStr;

        @NameInMap("dep_airport_name")
        private String depAirportName;

        @NameInMap("dep_city_name")
        private String depCityName;

        @NameInMap("dep_time")
        private String depTime;

        @NameInMap("discount")
        private String discount;

        @NameInMap("flight_no")
        private String flightNo;

        @NameInMap("price")
        private Long price;

        @NameInMap("transfer_airport_name")
        private String transferAirportName;

        private ApplyRecommendFlights(Builder builder) {
            this.arrAirportName = builder.arrAirportName;
            this.arrCityName = builder.arrCityName;
            this.arrTime = builder.arrTime;
            this.cabin = builder.cabin;
            this.cabinClass = builder.cabinClass;
            this.cabinClassStr = builder.cabinClassStr;
            this.depAirportName = builder.depAirportName;
            this.depCityName = builder.depCityName;
            this.depTime = builder.depTime;
            this.discount = builder.discount;
            this.flightNo = builder.flightNo;
            this.price = builder.price;
            this.transferAirportName = builder.transferAirportName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplyRecommendFlights create() {
            return builder().build();
        }

        /**
         * @return arrAirportName
         */
        public String getArrAirportName() {
            return this.arrAirportName;
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
         * @return cabinClass
         */
        public Integer getCabinClass() {
            return this.cabinClass;
        }

        /**
         * @return cabinClassStr
         */
        public String getCabinClassStr() {
            return this.cabinClassStr;
        }

        /**
         * @return depAirportName
         */
        public String getDepAirportName() {
            return this.depAirportName;
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
         * @return discount
         */
        public String getDiscount() {
            return this.discount;
        }

        /**
         * @return flightNo
         */
        public String getFlightNo() {
            return this.flightNo;
        }

        /**
         * @return price
         */
        public Long getPrice() {
            return this.price;
        }

        /**
         * @return transferAirportName
         */
        public String getTransferAirportName() {
            return this.transferAirportName;
        }

        public static final class Builder {
            private String arrAirportName; 
            private String arrCityName; 
            private String arrTime; 
            private String cabin; 
            private Integer cabinClass; 
            private String cabinClassStr; 
            private String depAirportName; 
            private String depCityName; 
            private String depTime; 
            private String discount; 
            private String flightNo; 
            private Long price; 
            private String transferAirportName; 

            /**
             * arr_airport_name.
             */
            public Builder arrAirportName(String arrAirportName) {
                this.arrAirportName = arrAirportName;
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
             * cabin_class.
             */
            public Builder cabinClass(Integer cabinClass) {
                this.cabinClass = cabinClass;
                return this;
            }

            /**
             * cabin_class_str.
             */
            public Builder cabinClassStr(String cabinClassStr) {
                this.cabinClassStr = cabinClassStr;
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
             * discount.
             */
            public Builder discount(String discount) {
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
             * price.
             */
            public Builder price(Long price) {
                this.price = price;
                return this;
            }

            /**
             * transfer_airport_name.
             */
            public Builder transferAirportName(String transferAirportName) {
                this.transferAirportName = transferAirportName;
                return this;
            }

            public ApplyRecommendFlights build() {
                return new ApplyRecommendFlights(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @NameInMap("apply_id")
        private Long applyId;

        @NameInMap("apply_intention_info_do")
        private ApplyIntentionInfoDo applyIntentionInfoDo;

        @NameInMap("apply_recommend_flights")
        private ApplyRecommendFlights applyRecommendFlights;

        @NameInMap("btrip_cause")
        private String btripCause;

        @NameInMap("corp_id")
        private String corpId;

        @NameInMap("exceed_reason")
        private String exceedReason;

        @NameInMap("exceed_type")
        private Integer exceedType;

        @NameInMap("origin_standard")
        private String originStandard;

        @NameInMap("status")
        private Integer status;

        @NameInMap("submit_time")
        private String submitTime;

        @NameInMap("thirdpart_apply_id")
        private String thirdpartApplyId;

        @NameInMap("thirdpart_corp_id")
        private String thirdpartCorpId;

        @NameInMap("user_id")
        private String userId;

        private Module(Builder builder) {
            this.applyId = builder.applyId;
            this.applyIntentionInfoDo = builder.applyIntentionInfoDo;
            this.applyRecommendFlights = builder.applyRecommendFlights;
            this.btripCause = builder.btripCause;
            this.corpId = builder.corpId;
            this.exceedReason = builder.exceedReason;
            this.exceedType = builder.exceedType;
            this.originStandard = builder.originStandard;
            this.status = builder.status;
            this.submitTime = builder.submitTime;
            this.thirdpartApplyId = builder.thirdpartApplyId;
            this.thirdpartCorpId = builder.thirdpartCorpId;
            this.userId = builder.userId;
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
         * @return applyIntentionInfoDo
         */
        public ApplyIntentionInfoDo getApplyIntentionInfoDo() {
            return this.applyIntentionInfoDo;
        }

        /**
         * @return applyRecommendFlights
         */
        public ApplyRecommendFlights getApplyRecommendFlights() {
            return this.applyRecommendFlights;
        }

        /**
         * @return btripCause
         */
        public String getBtripCause() {
            return this.btripCause;
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return exceedReason
         */
        public String getExceedReason() {
            return this.exceedReason;
        }

        /**
         * @return exceedType
         */
        public Integer getExceedType() {
            return this.exceedType;
        }

        /**
         * @return originStandard
         */
        public String getOriginStandard() {
            return this.originStandard;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return submitTime
         */
        public String getSubmitTime() {
            return this.submitTime;
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
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long applyId; 
            private ApplyIntentionInfoDo applyIntentionInfoDo; 
            private ApplyRecommendFlights applyRecommendFlights; 
            private String btripCause; 
            private String corpId; 
            private String exceedReason; 
            private Integer exceedType; 
            private String originStandard; 
            private Integer status; 
            private String submitTime; 
            private String thirdpartApplyId; 
            private String thirdpartCorpId; 
            private String userId; 

            /**
             * apply_id.
             */
            public Builder applyId(Long applyId) {
                this.applyId = applyId;
                return this;
            }

            /**
             * apply_intention_info_do.
             */
            public Builder applyIntentionInfoDo(ApplyIntentionInfoDo applyIntentionInfoDo) {
                this.applyIntentionInfoDo = applyIntentionInfoDo;
                return this;
            }

            /**
             * apply_recommend_flights.
             */
            public Builder applyRecommendFlights(ApplyRecommendFlights applyRecommendFlights) {
                this.applyRecommendFlights = applyRecommendFlights;
                return this;
            }

            /**
             * btrip_cause.
             */
            public Builder btripCause(String btripCause) {
                this.btripCause = btripCause;
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
             * exceed_reason.
             */
            public Builder exceedReason(String exceedReason) {
                this.exceedReason = exceedReason;
                return this;
            }

            /**
             * exceed_type.
             */
            public Builder exceedType(Integer exceedType) {
                this.exceedType = exceedType;
                return this;
            }

            /**
             * origin_standard.
             */
            public Builder originStandard(String originStandard) {
                this.originStandard = originStandard;
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
             * submit_time.
             */
            public Builder submitTime(String submitTime) {
                this.submitTime = submitTime;
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
             * user_id.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
