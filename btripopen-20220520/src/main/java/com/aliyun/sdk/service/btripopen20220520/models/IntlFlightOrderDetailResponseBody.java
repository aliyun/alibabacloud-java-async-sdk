// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IntlFlightOrderDetailResponseBody} extends {@link TeaModel}
 *
 * <p>IntlFlightOrderDetailResponseBody</p>
 */
public class IntlFlightOrderDetailResponseBody extends TeaModel {
    @NameInMap("module")
    private Module module;

    @NameInMap("request_id")
    private String requestId;

    @NameInMap("result_code")
    private String resultCode;

    @NameInMap("result_msg")
    private String resultMsg;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("trace_id")
    private String traceId;

    private IntlFlightOrderDetailResponseBody(Builder builder) {
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMsg = builder.resultMsg;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IntlFlightOrderDetailResponseBody create() {
        return builder().build();
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
     * @return resultCode
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultMsg
     */
    public String getResultMsg() {
        return this.resultMsg;
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
        private Module module; 
        private String requestId; 
        private String resultCode; 
        private String resultMsg; 
        private Boolean success; 
        private String traceId; 

        /**
         * module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * request_id.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result_code.
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * result_msg.
         */
        public Builder resultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
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
         * trace_id.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public IntlFlightOrderDetailResponseBody build() {
            return new IntlFlightOrderDetailResponseBody(this);
        } 

    } 

    public static class ContactInfo extends TeaModel {
        @NameInMap("contact_email")
        private String contactEmail;

        @NameInMap("contact_name")
        private String contactName;

        @NameInMap("contact_phone")
        private String contactPhone;

        @NameInMap("send_msg_to_passenger")
        private Boolean sendMsgToPassenger;

        private ContactInfo(Builder builder) {
            this.contactEmail = builder.contactEmail;
            this.contactName = builder.contactName;
            this.contactPhone = builder.contactPhone;
            this.sendMsgToPassenger = builder.sendMsgToPassenger;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactInfo create() {
            return builder().build();
        }

        /**
         * @return contactEmail
         */
        public String getContactEmail() {
            return this.contactEmail;
        }

        /**
         * @return contactName
         */
        public String getContactName() {
            return this.contactName;
        }

        /**
         * @return contactPhone
         */
        public String getContactPhone() {
            return this.contactPhone;
        }

        /**
         * @return sendMsgToPassenger
         */
        public Boolean getSendMsgToPassenger() {
            return this.sendMsgToPassenger;
        }

        public static final class Builder {
            private String contactEmail; 
            private String contactName; 
            private String contactPhone; 
            private Boolean sendMsgToPassenger; 

            /**
             * contact_email.
             */
            public Builder contactEmail(String contactEmail) {
                this.contactEmail = contactEmail;
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
             * contact_phone.
             */
            public Builder contactPhone(String contactPhone) {
                this.contactPhone = contactPhone;
                return this;
            }

            /**
             * send_msg_to_passenger.
             */
            public Builder sendMsgToPassenger(Boolean sendMsgToPassenger) {
                this.sendMsgToPassenger = sendMsgToPassenger;
                return this;
            }

            public ContactInfo build() {
                return new ContactInfo(this);
            } 

        } 

    }
    public static class FlightOtherInfo extends TeaModel {
        @NameInMap("aircraft_age")
        private String aircraftAge;

        @NameInMap("avg_delay_time")
        private String avgDelayTime;

        @NameInMap("equip_type")
        private String equipType;

        @NameInMap("flight_cancel_rate")
        private String flightCancelRate;

        @NameInMap("flight_distance")
        private Integer flightDistance;

        @NameInMap("flight_duration")
        private Integer flightDuration;

        @NameInMap("flight_size")
        private String flightSize;

        @NameInMap("jet_bridge_rate")
        private String jetBridgeRate;

        @NameInMap("manufacturer")
        private String manufacturer;

        @NameInMap("meal")
        private Integer meal;

        @NameInMap("meal_desc")
        private String mealDesc;

        @NameInMap("on_time_rate")
        private String onTimeRate;

        @NameInMap("wifi")
        private Boolean wifi;

        private FlightOtherInfo(Builder builder) {
            this.aircraftAge = builder.aircraftAge;
            this.avgDelayTime = builder.avgDelayTime;
            this.equipType = builder.equipType;
            this.flightCancelRate = builder.flightCancelRate;
            this.flightDistance = builder.flightDistance;
            this.flightDuration = builder.flightDuration;
            this.flightSize = builder.flightSize;
            this.jetBridgeRate = builder.jetBridgeRate;
            this.manufacturer = builder.manufacturer;
            this.meal = builder.meal;
            this.mealDesc = builder.mealDesc;
            this.onTimeRate = builder.onTimeRate;
            this.wifi = builder.wifi;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightOtherInfo create() {
            return builder().build();
        }

        /**
         * @return aircraftAge
         */
        public String getAircraftAge() {
            return this.aircraftAge;
        }

        /**
         * @return avgDelayTime
         */
        public String getAvgDelayTime() {
            return this.avgDelayTime;
        }

        /**
         * @return equipType
         */
        public String getEquipType() {
            return this.equipType;
        }

        /**
         * @return flightCancelRate
         */
        public String getFlightCancelRate() {
            return this.flightCancelRate;
        }

        /**
         * @return flightDistance
         */
        public Integer getFlightDistance() {
            return this.flightDistance;
        }

        /**
         * @return flightDuration
         */
        public Integer getFlightDuration() {
            return this.flightDuration;
        }

        /**
         * @return flightSize
         */
        public String getFlightSize() {
            return this.flightSize;
        }

        /**
         * @return jetBridgeRate
         */
        public String getJetBridgeRate() {
            return this.jetBridgeRate;
        }

        /**
         * @return manufacturer
         */
        public String getManufacturer() {
            return this.manufacturer;
        }

        /**
         * @return meal
         */
        public Integer getMeal() {
            return this.meal;
        }

        /**
         * @return mealDesc
         */
        public String getMealDesc() {
            return this.mealDesc;
        }

        /**
         * @return onTimeRate
         */
        public String getOnTimeRate() {
            return this.onTimeRate;
        }

        /**
         * @return wifi
         */
        public Boolean getWifi() {
            return this.wifi;
        }

        public static final class Builder {
            private String aircraftAge; 
            private String avgDelayTime; 
            private String equipType; 
            private String flightCancelRate; 
            private Integer flightDistance; 
            private Integer flightDuration; 
            private String flightSize; 
            private String jetBridgeRate; 
            private String manufacturer; 
            private Integer meal; 
            private String mealDesc; 
            private String onTimeRate; 
            private Boolean wifi; 

            /**
             * aircraft_age.
             */
            public Builder aircraftAge(String aircraftAge) {
                this.aircraftAge = aircraftAge;
                return this;
            }

            /**
             * avg_delay_time.
             */
            public Builder avgDelayTime(String avgDelayTime) {
                this.avgDelayTime = avgDelayTime;
                return this;
            }

            /**
             * equip_type.
             */
            public Builder equipType(String equipType) {
                this.equipType = equipType;
                return this;
            }

            /**
             * flight_cancel_rate.
             */
            public Builder flightCancelRate(String flightCancelRate) {
                this.flightCancelRate = flightCancelRate;
                return this;
            }

            /**
             * flight_distance.
             */
            public Builder flightDistance(Integer flightDistance) {
                this.flightDistance = flightDistance;
                return this;
            }

            /**
             * flight_duration.
             */
            public Builder flightDuration(Integer flightDuration) {
                this.flightDuration = flightDuration;
                return this;
            }

            /**
             * flight_size.
             */
            public Builder flightSize(String flightSize) {
                this.flightSize = flightSize;
                return this;
            }

            /**
             * jet_bridge_rate.
             */
            public Builder jetBridgeRate(String jetBridgeRate) {
                this.jetBridgeRate = jetBridgeRate;
                return this;
            }

            /**
             * manufacturer.
             */
            public Builder manufacturer(String manufacturer) {
                this.manufacturer = manufacturer;
                return this;
            }

            /**
             * meal.
             */
            public Builder meal(Integer meal) {
                this.meal = meal;
                return this;
            }

            /**
             * meal_desc.
             */
            public Builder mealDesc(String mealDesc) {
                this.mealDesc = mealDesc;
                return this;
            }

            /**
             * on_time_rate.
             */
            public Builder onTimeRate(String onTimeRate) {
                this.onTimeRate = onTimeRate;
                return this;
            }

            /**
             * wifi.
             */
            public Builder wifi(Boolean wifi) {
                this.wifi = wifi;
                return this;
            }

            public FlightOtherInfo build() {
                return new FlightOtherInfo(this);
            } 

        } 

    }
    public static class LuggageDirectInfo extends TeaModel {
        @NameInMap("dep_city_luggage_direct")
        private Integer depCityLuggageDirect;

        @NameInMap("stop_city_luggage_direct")
        private Integer stopCityLuggageDirect;

        private LuggageDirectInfo(Builder builder) {
            this.depCityLuggageDirect = builder.depCityLuggageDirect;
            this.stopCityLuggageDirect = builder.stopCityLuggageDirect;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LuggageDirectInfo create() {
            return builder().build();
        }

        /**
         * @return depCityLuggageDirect
         */
        public Integer getDepCityLuggageDirect() {
            return this.depCityLuggageDirect;
        }

        /**
         * @return stopCityLuggageDirect
         */
        public Integer getStopCityLuggageDirect() {
            return this.stopCityLuggageDirect;
        }

        public static final class Builder {
            private Integer depCityLuggageDirect; 
            private Integer stopCityLuggageDirect; 

            /**
             * dep_city_luggage_direct.
             */
            public Builder depCityLuggageDirect(Integer depCityLuggageDirect) {
                this.depCityLuggageDirect = depCityLuggageDirect;
                return this;
            }

            /**
             * stop_city_luggage_direct.
             */
            public Builder stopCityLuggageDirect(Integer stopCityLuggageDirect) {
                this.stopCityLuggageDirect = stopCityLuggageDirect;
                return this;
            }

            public LuggageDirectInfo build() {
                return new LuggageDirectInfo(this);
            } 

        } 

    }
    public static class MarketingAirlineInfo extends TeaModel {
        @NameInMap("airline_code")
        private String airlineCode;

        @NameInMap("airline_name")
        private String airlineName;

        @NameInMap("alliance_name")
        private String allianceName;

        @NameInMap("cheap_airline")
        private Boolean cheapAirline;

        @NameInMap("icon_url")
        private String iconUrl;

        @NameInMap("logo_url")
        private String logoUrl;

        @NameInMap("short_name")
        private String shortName;

        private MarketingAirlineInfo(Builder builder) {
            this.airlineCode = builder.airlineCode;
            this.airlineName = builder.airlineName;
            this.allianceName = builder.allianceName;
            this.cheapAirline = builder.cheapAirline;
            this.iconUrl = builder.iconUrl;
            this.logoUrl = builder.logoUrl;
            this.shortName = builder.shortName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MarketingAirlineInfo create() {
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
         * @return allianceName
         */
        public String getAllianceName() {
            return this.allianceName;
        }

        /**
         * @return cheapAirline
         */
        public Boolean getCheapAirline() {
            return this.cheapAirline;
        }

        /**
         * @return iconUrl
         */
        public String getIconUrl() {
            return this.iconUrl;
        }

        /**
         * @return logoUrl
         */
        public String getLogoUrl() {
            return this.logoUrl;
        }

        /**
         * @return shortName
         */
        public String getShortName() {
            return this.shortName;
        }

        public static final class Builder {
            private String airlineCode; 
            private String airlineName; 
            private String allianceName; 
            private Boolean cheapAirline; 
            private String iconUrl; 
            private String logoUrl; 
            private String shortName; 

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
             * alliance_name.
             */
            public Builder allianceName(String allianceName) {
                this.allianceName = allianceName;
                return this;
            }

            /**
             * cheap_airline.
             */
            public Builder cheapAirline(Boolean cheapAirline) {
                this.cheapAirline = cheapAirline;
                return this;
            }

            /**
             * icon_url.
             */
            public Builder iconUrl(String iconUrl) {
                this.iconUrl = iconUrl;
                return this;
            }

            /**
             * logo_url.
             */
            public Builder logoUrl(String logoUrl) {
                this.logoUrl = logoUrl;
                return this;
            }

            /**
             * short_name.
             */
            public Builder shortName(String shortName) {
                this.shortName = shortName;
                return this;
            }

            public MarketingAirlineInfo build() {
                return new MarketingAirlineInfo(this);
            } 

        } 

    }
    public static class OperatingAirlineInfo extends TeaModel {
        @NameInMap("airline_code")
        private String airlineCode;

        @NameInMap("airline_name")
        private String airlineName;

        @NameInMap("alliance_name")
        private String allianceName;

        @NameInMap("cheap_airline")
        private Boolean cheapAirline;

        @NameInMap("icon_url")
        private String iconUrl;

        @NameInMap("logo_url")
        private String logoUrl;

        @NameInMap("short_name")
        private String shortName;

        private OperatingAirlineInfo(Builder builder) {
            this.airlineCode = builder.airlineCode;
            this.airlineName = builder.airlineName;
            this.allianceName = builder.allianceName;
            this.cheapAirline = builder.cheapAirline;
            this.iconUrl = builder.iconUrl;
            this.logoUrl = builder.logoUrl;
            this.shortName = builder.shortName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperatingAirlineInfo create() {
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
         * @return allianceName
         */
        public String getAllianceName() {
            return this.allianceName;
        }

        /**
         * @return cheapAirline
         */
        public Boolean getCheapAirline() {
            return this.cheapAirline;
        }

        /**
         * @return iconUrl
         */
        public String getIconUrl() {
            return this.iconUrl;
        }

        /**
         * @return logoUrl
         */
        public String getLogoUrl() {
            return this.logoUrl;
        }

        /**
         * @return shortName
         */
        public String getShortName() {
            return this.shortName;
        }

        public static final class Builder {
            private String airlineCode; 
            private String airlineName; 
            private String allianceName; 
            private Boolean cheapAirline; 
            private String iconUrl; 
            private String logoUrl; 
            private String shortName; 

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
             * alliance_name.
             */
            public Builder allianceName(String allianceName) {
                this.allianceName = allianceName;
                return this;
            }

            /**
             * cheap_airline.
             */
            public Builder cheapAirline(Boolean cheapAirline) {
                this.cheapAirline = cheapAirline;
                return this;
            }

            /**
             * icon_url.
             */
            public Builder iconUrl(String iconUrl) {
                this.iconUrl = iconUrl;
                return this;
            }

            /**
             * logo_url.
             */
            public Builder logoUrl(String logoUrl) {
                this.logoUrl = logoUrl;
                return this;
            }

            /**
             * short_name.
             */
            public Builder shortName(String shortName) {
                this.shortName = shortName;
                return this;
            }

            public OperatingAirlineInfo build() {
                return new OperatingAirlineInfo(this);
            } 

        } 

    }
    public static class SegmentVisaRemark extends TeaModel {
        @NameInMap("dep_city_visa_remark")
        private String depCityVisaRemark;

        @NameInMap("dep_city_visa_type")
        private Integer depCityVisaType;

        @NameInMap("stop_city_visa_remarks")
        private java.util.List < String > stopCityVisaRemarks;

        @NameInMap("stop_city_visa_types")
        private java.util.List < Integer > stopCityVisaTypes;

        private SegmentVisaRemark(Builder builder) {
            this.depCityVisaRemark = builder.depCityVisaRemark;
            this.depCityVisaType = builder.depCityVisaType;
            this.stopCityVisaRemarks = builder.stopCityVisaRemarks;
            this.stopCityVisaTypes = builder.stopCityVisaTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SegmentVisaRemark create() {
            return builder().build();
        }

        /**
         * @return depCityVisaRemark
         */
        public String getDepCityVisaRemark() {
            return this.depCityVisaRemark;
        }

        /**
         * @return depCityVisaType
         */
        public Integer getDepCityVisaType() {
            return this.depCityVisaType;
        }

        /**
         * @return stopCityVisaRemarks
         */
        public java.util.List < String > getStopCityVisaRemarks() {
            return this.stopCityVisaRemarks;
        }

        /**
         * @return stopCityVisaTypes
         */
        public java.util.List < Integer > getStopCityVisaTypes() {
            return this.stopCityVisaTypes;
        }

        public static final class Builder {
            private String depCityVisaRemark; 
            private Integer depCityVisaType; 
            private java.util.List < String > stopCityVisaRemarks; 
            private java.util.List < Integer > stopCityVisaTypes; 

            /**
             * dep_city_visa_remark.
             */
            public Builder depCityVisaRemark(String depCityVisaRemark) {
                this.depCityVisaRemark = depCityVisaRemark;
                return this;
            }

            /**
             * dep_city_visa_type.
             */
            public Builder depCityVisaType(Integer depCityVisaType) {
                this.depCityVisaType = depCityVisaType;
                return this;
            }

            /**
             * stop_city_visa_remarks.
             */
            public Builder stopCityVisaRemarks(java.util.List < String > stopCityVisaRemarks) {
                this.stopCityVisaRemarks = stopCityVisaRemarks;
                return this;
            }

            /**
             * stop_city_visa_types.
             */
            public Builder stopCityVisaTypes(java.util.List < Integer > stopCityVisaTypes) {
                this.stopCityVisaTypes = stopCityVisaTypes;
                return this;
            }

            public SegmentVisaRemark build() {
                return new SegmentVisaRemark(this);
            } 

        } 

    }
    public static class StopCityList extends TeaModel {
        @NameInMap("stop_airport")
        private String stopAirport;

        @NameInMap("stop_airport_name")
        private String stopAirportName;

        @NameInMap("stop_arr_terminal")
        private String stopArrTerminal;

        @NameInMap("stop_arr_time")
        private String stopArrTime;

        @NameInMap("stop_city_code")
        private String stopCityCode;

        @NameInMap("stop_city_name")
        private String stopCityName;

        @NameInMap("stop_dep_terminal")
        private String stopDepTerminal;

        @NameInMap("stop_dep_time")
        private String stopDepTime;

        private StopCityList(Builder builder) {
            this.stopAirport = builder.stopAirport;
            this.stopAirportName = builder.stopAirportName;
            this.stopArrTerminal = builder.stopArrTerminal;
            this.stopArrTime = builder.stopArrTime;
            this.stopCityCode = builder.stopCityCode;
            this.stopCityName = builder.stopCityName;
            this.stopDepTerminal = builder.stopDepTerminal;
            this.stopDepTime = builder.stopDepTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StopCityList create() {
            return builder().build();
        }

        /**
         * @return stopAirport
         */
        public String getStopAirport() {
            return this.stopAirport;
        }

        /**
         * @return stopAirportName
         */
        public String getStopAirportName() {
            return this.stopAirportName;
        }

        /**
         * @return stopArrTerminal
         */
        public String getStopArrTerminal() {
            return this.stopArrTerminal;
        }

        /**
         * @return stopArrTime
         */
        public String getStopArrTime() {
            return this.stopArrTime;
        }

        /**
         * @return stopCityCode
         */
        public String getStopCityCode() {
            return this.stopCityCode;
        }

        /**
         * @return stopCityName
         */
        public String getStopCityName() {
            return this.stopCityName;
        }

        /**
         * @return stopDepTerminal
         */
        public String getStopDepTerminal() {
            return this.stopDepTerminal;
        }

        /**
         * @return stopDepTime
         */
        public String getStopDepTime() {
            return this.stopDepTime;
        }

        public static final class Builder {
            private String stopAirport; 
            private String stopAirportName; 
            private String stopArrTerminal; 
            private String stopArrTime; 
            private String stopCityCode; 
            private String stopCityName; 
            private String stopDepTerminal; 
            private String stopDepTime; 

            /**
             * stop_airport.
             */
            public Builder stopAirport(String stopAirport) {
                this.stopAirport = stopAirport;
                return this;
            }

            /**
             * stop_airport_name.
             */
            public Builder stopAirportName(String stopAirportName) {
                this.stopAirportName = stopAirportName;
                return this;
            }

            /**
             * stop_arr_terminal.
             */
            public Builder stopArrTerminal(String stopArrTerminal) {
                this.stopArrTerminal = stopArrTerminal;
                return this;
            }

            /**
             * stop_arr_time.
             */
            public Builder stopArrTime(String stopArrTime) {
                this.stopArrTime = stopArrTime;
                return this;
            }

            /**
             * stop_city_code.
             */
            public Builder stopCityCode(String stopCityCode) {
                this.stopCityCode = stopCityCode;
                return this;
            }

            /**
             * stop_city_name.
             */
            public Builder stopCityName(String stopCityName) {
                this.stopCityName = stopCityName;
                return this;
            }

            /**
             * stop_dep_terminal.
             */
            public Builder stopDepTerminal(String stopDepTerminal) {
                this.stopDepTerminal = stopDepTerminal;
                return this;
            }

            /**
             * stop_dep_time.
             */
            public Builder stopDepTime(String stopDepTime) {
                this.stopDepTime = stopDepTime;
                return this;
            }

            public StopCityList build() {
                return new StopCityList(this);
            } 

        } 

    }
    public static class SegmentList extends TeaModel {
        @NameInMap("arr_airport_code")
        private String arrAirportCode;

        @NameInMap("arr_airport_name")
        private String arrAirportName;

        @NameInMap("arr_city_code")
        private String arrCityCode;

        @NameInMap("arr_city_name")
        private String arrCityName;

        @NameInMap("arr_terminal")
        private String arrTerminal;

        @NameInMap("arr_time")
        private String arrTime;

        @NameInMap("code_share")
        private Boolean codeShare;

        @NameInMap("dep_airport_code")
        private String depAirportCode;

        @NameInMap("dep_airport_name")
        private String depAirportName;

        @NameInMap("dep_city_code")
        private String depCityCode;

        @NameInMap("dep_city_name")
        private String depCityName;

        @NameInMap("dep_terminal")
        private String depTerminal;

        @NameInMap("dep_time")
        private String depTime;

        @NameInMap("flight_other_info")
        private FlightOtherInfo flightOtherInfo;

        @NameInMap("journey_index")
        private Integer journeyIndex;

        @NameInMap("luggage_direct_info")
        private LuggageDirectInfo luggageDirectInfo;

        @NameInMap("marketing_airline")
        private String marketingAirline;

        @NameInMap("marketing_airline_info")
        private MarketingAirlineInfo marketingAirlineInfo;

        @NameInMap("marketing_flight_no")
        private String marketingFlightNo;

        @NameInMap("operating_airline")
        private String operatingAirline;

        @NameInMap("operating_airline_info")
        private OperatingAirlineInfo operatingAirlineInfo;

        @NameInMap("operating_flight_no")
        private String operatingFlightNo;

        @NameInMap("segment_index")
        private Integer segmentIndex;

        @NameInMap("segment_key")
        private String segmentKey;

        @NameInMap("segment_visa_remark")
        private SegmentVisaRemark segmentVisaRemark;

        @NameInMap("stop_city_list")
        private java.util.List < StopCityList> stopCityList;

        @NameInMap("stop_quantity")
        private Integer stopQuantity;

        private SegmentList(Builder builder) {
            this.arrAirportCode = builder.arrAirportCode;
            this.arrAirportName = builder.arrAirportName;
            this.arrCityCode = builder.arrCityCode;
            this.arrCityName = builder.arrCityName;
            this.arrTerminal = builder.arrTerminal;
            this.arrTime = builder.arrTime;
            this.codeShare = builder.codeShare;
            this.depAirportCode = builder.depAirportCode;
            this.depAirportName = builder.depAirportName;
            this.depCityCode = builder.depCityCode;
            this.depCityName = builder.depCityName;
            this.depTerminal = builder.depTerminal;
            this.depTime = builder.depTime;
            this.flightOtherInfo = builder.flightOtherInfo;
            this.journeyIndex = builder.journeyIndex;
            this.luggageDirectInfo = builder.luggageDirectInfo;
            this.marketingAirline = builder.marketingAirline;
            this.marketingAirlineInfo = builder.marketingAirlineInfo;
            this.marketingFlightNo = builder.marketingFlightNo;
            this.operatingAirline = builder.operatingAirline;
            this.operatingAirlineInfo = builder.operatingAirlineInfo;
            this.operatingFlightNo = builder.operatingFlightNo;
            this.segmentIndex = builder.segmentIndex;
            this.segmentKey = builder.segmentKey;
            this.segmentVisaRemark = builder.segmentVisaRemark;
            this.stopCityList = builder.stopCityList;
            this.stopQuantity = builder.stopQuantity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SegmentList create() {
            return builder().build();
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
         * @return codeShare
         */
        public Boolean getCodeShare() {
            return this.codeShare;
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
         * @return flightOtherInfo
         */
        public FlightOtherInfo getFlightOtherInfo() {
            return this.flightOtherInfo;
        }

        /**
         * @return journeyIndex
         */
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        /**
         * @return luggageDirectInfo
         */
        public LuggageDirectInfo getLuggageDirectInfo() {
            return this.luggageDirectInfo;
        }

        /**
         * @return marketingAirline
         */
        public String getMarketingAirline() {
            return this.marketingAirline;
        }

        /**
         * @return marketingAirlineInfo
         */
        public MarketingAirlineInfo getMarketingAirlineInfo() {
            return this.marketingAirlineInfo;
        }

        /**
         * @return marketingFlightNo
         */
        public String getMarketingFlightNo() {
            return this.marketingFlightNo;
        }

        /**
         * @return operatingAirline
         */
        public String getOperatingAirline() {
            return this.operatingAirline;
        }

        /**
         * @return operatingAirlineInfo
         */
        public OperatingAirlineInfo getOperatingAirlineInfo() {
            return this.operatingAirlineInfo;
        }

        /**
         * @return operatingFlightNo
         */
        public String getOperatingFlightNo() {
            return this.operatingFlightNo;
        }

        /**
         * @return segmentIndex
         */
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        /**
         * @return segmentKey
         */
        public String getSegmentKey() {
            return this.segmentKey;
        }

        /**
         * @return segmentVisaRemark
         */
        public SegmentVisaRemark getSegmentVisaRemark() {
            return this.segmentVisaRemark;
        }

        /**
         * @return stopCityList
         */
        public java.util.List < StopCityList> getStopCityList() {
            return this.stopCityList;
        }

        /**
         * @return stopQuantity
         */
        public Integer getStopQuantity() {
            return this.stopQuantity;
        }

        public static final class Builder {
            private String arrAirportCode; 
            private String arrAirportName; 
            private String arrCityCode; 
            private String arrCityName; 
            private String arrTerminal; 
            private String arrTime; 
            private Boolean codeShare; 
            private String depAirportCode; 
            private String depAirportName; 
            private String depCityCode; 
            private String depCityName; 
            private String depTerminal; 
            private String depTime; 
            private FlightOtherInfo flightOtherInfo; 
            private Integer journeyIndex; 
            private LuggageDirectInfo luggageDirectInfo; 
            private String marketingAirline; 
            private MarketingAirlineInfo marketingAirlineInfo; 
            private String marketingFlightNo; 
            private String operatingAirline; 
            private OperatingAirlineInfo operatingAirlineInfo; 
            private String operatingFlightNo; 
            private Integer segmentIndex; 
            private String segmentKey; 
            private SegmentVisaRemark segmentVisaRemark; 
            private java.util.List < StopCityList> stopCityList; 
            private Integer stopQuantity; 

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
             * code_share.
             */
            public Builder codeShare(Boolean codeShare) {
                this.codeShare = codeShare;
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
             * flight_other_info.
             */
            public Builder flightOtherInfo(FlightOtherInfo flightOtherInfo) {
                this.flightOtherInfo = flightOtherInfo;
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
             * luggage_direct_info.
             */
            public Builder luggageDirectInfo(LuggageDirectInfo luggageDirectInfo) {
                this.luggageDirectInfo = luggageDirectInfo;
                return this;
            }

            /**
             * marketing_airline.
             */
            public Builder marketingAirline(String marketingAirline) {
                this.marketingAirline = marketingAirline;
                return this;
            }

            /**
             * marketing_airline_info.
             */
            public Builder marketingAirlineInfo(MarketingAirlineInfo marketingAirlineInfo) {
                this.marketingAirlineInfo = marketingAirlineInfo;
                return this;
            }

            /**
             * marketing_flight_no.
             */
            public Builder marketingFlightNo(String marketingFlightNo) {
                this.marketingFlightNo = marketingFlightNo;
                return this;
            }

            /**
             * operating_airline.
             */
            public Builder operatingAirline(String operatingAirline) {
                this.operatingAirline = operatingAirline;
                return this;
            }

            /**
             * operating_airline_info.
             */
            public Builder operatingAirlineInfo(OperatingAirlineInfo operatingAirlineInfo) {
                this.operatingAirlineInfo = operatingAirlineInfo;
                return this;
            }

            /**
             * operating_flight_no.
             */
            public Builder operatingFlightNo(String operatingFlightNo) {
                this.operatingFlightNo = operatingFlightNo;
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
             * segment_key.
             */
            public Builder segmentKey(String segmentKey) {
                this.segmentKey = segmentKey;
                return this;
            }

            /**
             * segment_visa_remark.
             */
            public Builder segmentVisaRemark(SegmentVisaRemark segmentVisaRemark) {
                this.segmentVisaRemark = segmentVisaRemark;
                return this;
            }

            /**
             * stop_city_list.
             */
            public Builder stopCityList(java.util.List < StopCityList> stopCityList) {
                this.stopCityList = stopCityList;
                return this;
            }

            /**
             * stop_quantity.
             */
            public Builder stopQuantity(Integer stopQuantity) {
                this.stopQuantity = stopQuantity;
                return this;
            }

            public SegmentList build() {
                return new SegmentList(this);
            } 

        } 

    }
    public static class JourneyList extends TeaModel {
        @NameInMap("arr_city_code")
        private String arrCityCode;

        @NameInMap("arr_city_name")
        private String arrCityName;

        @NameInMap("dep_city_code")
        private String depCityCode;

        @NameInMap("dep_city_name")
        private String depCityName;

        @NameInMap("dep_date")
        private String depDate;

        @NameInMap("journey_index")
        private Integer journeyIndex;

        @NameInMap("segment_list")
        private java.util.List < SegmentList> segmentList;

        @NameInMap("transfer_count")
        private Integer transferCount;

        @NameInMap("transfer_time")
        private Integer transferTime;

        private JourneyList(Builder builder) {
            this.arrCityCode = builder.arrCityCode;
            this.arrCityName = builder.arrCityName;
            this.depCityCode = builder.depCityCode;
            this.depCityName = builder.depCityName;
            this.depDate = builder.depDate;
            this.journeyIndex = builder.journeyIndex;
            this.segmentList = builder.segmentList;
            this.transferCount = builder.transferCount;
            this.transferTime = builder.transferTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JourneyList create() {
            return builder().build();
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
         * @return depDate
         */
        public String getDepDate() {
            return this.depDate;
        }

        /**
         * @return journeyIndex
         */
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        /**
         * @return segmentList
         */
        public java.util.List < SegmentList> getSegmentList() {
            return this.segmentList;
        }

        /**
         * @return transferCount
         */
        public Integer getTransferCount() {
            return this.transferCount;
        }

        /**
         * @return transferTime
         */
        public Integer getTransferTime() {
            return this.transferTime;
        }

        public static final class Builder {
            private String arrCityCode; 
            private String arrCityName; 
            private String depCityCode; 
            private String depCityName; 
            private String depDate; 
            private Integer journeyIndex; 
            private java.util.List < SegmentList> segmentList; 
            private Integer transferCount; 
            private Integer transferTime; 

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
             * dep_date.
             */
            public Builder depDate(String depDate) {
                this.depDate = depDate;
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
             * segment_list.
             */
            public Builder segmentList(java.util.List < SegmentList> segmentList) {
                this.segmentList = segmentList;
                return this;
            }

            /**
             * transfer_count.
             */
            public Builder transferCount(Integer transferCount) {
                this.transferCount = transferCount;
                return this;
            }

            /**
             * transfer_time.
             */
            public Builder transferTime(Integer transferTime) {
                this.transferTime = transferTime;
                return this;
            }

            public JourneyList build() {
                return new JourneyList(this);
            } 

        } 

    }
    public static class BaggageRule extends TeaModel {
        @NameInMap("baggage_digest")
        private String baggageDigest;

        @NameInMap("baggage_info_map")
        private java.util.Map < String, java.util.List<ModuleOrderItemListBaggageRuleBaggageInfoMapValue>> baggageInfoMap;

        @NameInMap("structured_baggage")
        private Boolean structuredBaggage;

        private BaggageRule(Builder builder) {
            this.baggageDigest = builder.baggageDigest;
            this.baggageInfoMap = builder.baggageInfoMap;
            this.structuredBaggage = builder.structuredBaggage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaggageRule create() {
            return builder().build();
        }

        /**
         * @return baggageDigest
         */
        public String getBaggageDigest() {
            return this.baggageDigest;
        }

        /**
         * @return baggageInfoMap
         */
        public java.util.Map < String, java.util.List<ModuleOrderItemListBaggageRuleBaggageInfoMapValue>> getBaggageInfoMap() {
            return this.baggageInfoMap;
        }

        /**
         * @return structuredBaggage
         */
        public Boolean getStructuredBaggage() {
            return this.structuredBaggage;
        }

        public static final class Builder {
            private String baggageDigest; 
            private java.util.Map < String, java.util.List<ModuleOrderItemListBaggageRuleBaggageInfoMapValue>> baggageInfoMap; 
            private Boolean structuredBaggage; 

            /**
             * baggage_digest.
             */
            public Builder baggageDigest(String baggageDigest) {
                this.baggageDigest = baggageDigest;
                return this;
            }

            /**
             * baggage_info_map.
             */
            public Builder baggageInfoMap(java.util.Map < String, java.util.List<ModuleOrderItemListBaggageRuleBaggageInfoMapValue>> baggageInfoMap) {
                this.baggageInfoMap = baggageInfoMap;
                return this;
            }

            /**
             * structured_baggage.
             */
            public Builder structuredBaggage(Boolean structuredBaggage) {
                this.structuredBaggage = structuredBaggage;
                return this;
            }

            public BaggageRule build() {
                return new BaggageRule(this);
            } 

        } 

    }
    public static class PassengerPriceList extends TeaModel {
        @NameInMap("discount")
        private Double discount;

        @NameInMap("discount_info")
        private String discountInfo;

        @NameInMap("modify_fee")
        private Long modifyFee;

        @NameInMap("modify_tax_spread")
        private Long modifyTaxSpread;

        @NameInMap("passenger_type")
        private Integer passengerType;

        @NameInMap("sell_price")
        private Long sellPrice;

        @NameInMap("tax")
        private Long tax;

        @NameInMap("ticket_price")
        private Long ticketPrice;

        @NameInMap("upgrade_fee")
        private Long upgradeFee;

        private PassengerPriceList(Builder builder) {
            this.discount = builder.discount;
            this.discountInfo = builder.discountInfo;
            this.modifyFee = builder.modifyFee;
            this.modifyTaxSpread = builder.modifyTaxSpread;
            this.passengerType = builder.passengerType;
            this.sellPrice = builder.sellPrice;
            this.tax = builder.tax;
            this.ticketPrice = builder.ticketPrice;
            this.upgradeFee = builder.upgradeFee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PassengerPriceList create() {
            return builder().build();
        }

        /**
         * @return discount
         */
        public Double getDiscount() {
            return this.discount;
        }

        /**
         * @return discountInfo
         */
        public String getDiscountInfo() {
            return this.discountInfo;
        }

        /**
         * @return modifyFee
         */
        public Long getModifyFee() {
            return this.modifyFee;
        }

        /**
         * @return modifyTaxSpread
         */
        public Long getModifyTaxSpread() {
            return this.modifyTaxSpread;
        }

        /**
         * @return passengerType
         */
        public Integer getPassengerType() {
            return this.passengerType;
        }

        /**
         * @return sellPrice
         */
        public Long getSellPrice() {
            return this.sellPrice;
        }

        /**
         * @return tax
         */
        public Long getTax() {
            return this.tax;
        }

        /**
         * @return ticketPrice
         */
        public Long getTicketPrice() {
            return this.ticketPrice;
        }

        /**
         * @return upgradeFee
         */
        public Long getUpgradeFee() {
            return this.upgradeFee;
        }

        public static final class Builder {
            private Double discount; 
            private String discountInfo; 
            private Long modifyFee; 
            private Long modifyTaxSpread; 
            private Integer passengerType; 
            private Long sellPrice; 
            private Long tax; 
            private Long ticketPrice; 
            private Long upgradeFee; 

            /**
             * discount.
             */
            public Builder discount(Double discount) {
                this.discount = discount;
                return this;
            }

            /**
             * discount_info.
             */
            public Builder discountInfo(String discountInfo) {
                this.discountInfo = discountInfo;
                return this;
            }

            /**
             * modify_fee.
             */
            public Builder modifyFee(Long modifyFee) {
                this.modifyFee = modifyFee;
                return this;
            }

            /**
             * modify_tax_spread.
             */
            public Builder modifyTaxSpread(Long modifyTaxSpread) {
                this.modifyTaxSpread = modifyTaxSpread;
                return this;
            }

            /**
             * passenger_type.
             */
            public Builder passengerType(Integer passengerType) {
                this.passengerType = passengerType;
                return this;
            }

            /**
             * sell_price.
             */
            public Builder sellPrice(Long sellPrice) {
                this.sellPrice = sellPrice;
                return this;
            }

            /**
             * tax.
             */
            public Builder tax(Long tax) {
                this.tax = tax;
                return this;
            }

            /**
             * ticket_price.
             */
            public Builder ticketPrice(Long ticketPrice) {
                this.ticketPrice = ticketPrice;
                return this;
            }

            /**
             * upgrade_fee.
             */
            public Builder upgradeFee(Long upgradeFee) {
                this.upgradeFee = upgradeFee;
                return this;
            }

            public PassengerPriceList build() {
                return new PassengerPriceList(this);
            } 

        } 

    }
    public static class RefundChangeRule extends TeaModel {
        @NameInMap("cancel_fee_ind")
        private Boolean cancelFeeInd;

        @NameInMap("change_fee_ind")
        private Boolean changeFeeInd;

        @NameInMap("offer_penalty_info_map")
        private java.util.Map < String, java.util.List<ModuleOrderItemListRefundChangeRuleOfferPenaltyInfoMapValue>> offerPenaltyInfoMap;

        @NameInMap("refund_change_digest")
        private String refundChangeDigest;

        @NameInMap("structured_refund")
        private Boolean structuredRefund;

        private RefundChangeRule(Builder builder) {
            this.cancelFeeInd = builder.cancelFeeInd;
            this.changeFeeInd = builder.changeFeeInd;
            this.offerPenaltyInfoMap = builder.offerPenaltyInfoMap;
            this.refundChangeDigest = builder.refundChangeDigest;
            this.structuredRefund = builder.structuredRefund;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundChangeRule create() {
            return builder().build();
        }

        /**
         * @return cancelFeeInd
         */
        public Boolean getCancelFeeInd() {
            return this.cancelFeeInd;
        }

        /**
         * @return changeFeeInd
         */
        public Boolean getChangeFeeInd() {
            return this.changeFeeInd;
        }

        /**
         * @return offerPenaltyInfoMap
         */
        public java.util.Map < String, java.util.List<ModuleOrderItemListRefundChangeRuleOfferPenaltyInfoMapValue>> getOfferPenaltyInfoMap() {
            return this.offerPenaltyInfoMap;
        }

        /**
         * @return refundChangeDigest
         */
        public String getRefundChangeDigest() {
            return this.refundChangeDigest;
        }

        /**
         * @return structuredRefund
         */
        public Boolean getStructuredRefund() {
            return this.structuredRefund;
        }

        public static final class Builder {
            private Boolean cancelFeeInd; 
            private Boolean changeFeeInd; 
            private java.util.Map < String, java.util.List<ModuleOrderItemListRefundChangeRuleOfferPenaltyInfoMapValue>> offerPenaltyInfoMap; 
            private String refundChangeDigest; 
            private Boolean structuredRefund; 

            /**
             * cancel_fee_ind.
             */
            public Builder cancelFeeInd(Boolean cancelFeeInd) {
                this.cancelFeeInd = cancelFeeInd;
                return this;
            }

            /**
             * change_fee_ind.
             */
            public Builder changeFeeInd(Boolean changeFeeInd) {
                this.changeFeeInd = changeFeeInd;
                return this;
            }

            /**
             * offer_penalty_info_map.
             */
            public Builder offerPenaltyInfoMap(java.util.Map < String, java.util.List<ModuleOrderItemListRefundChangeRuleOfferPenaltyInfoMapValue>> offerPenaltyInfoMap) {
                this.offerPenaltyInfoMap = offerPenaltyInfoMap;
                return this;
            }

            /**
             * refund_change_digest.
             */
            public Builder refundChangeDigest(String refundChangeDigest) {
                this.refundChangeDigest = refundChangeDigest;
                return this;
            }

            /**
             * structured_refund.
             */
            public Builder structuredRefund(Boolean structuredRefund) {
                this.structuredRefund = structuredRefund;
                return this;
            }

            public RefundChangeRule build() {
                return new RefundChangeRule(this);
            } 

        } 

    }
    public static class OrderItemList extends TeaModel {
        @NameInMap("baggage_rule")
        private BaggageRule baggageRule;

        @NameInMap("passenger_price_list")
        private java.util.List < PassengerPriceList> passengerPriceList;

        @NameInMap("refund_change_rule")
        private RefundChangeRule refundChangeRule;

        @NameInMap("segment_key_list")
        private java.util.List < String > segmentKeyList;

        private OrderItemList(Builder builder) {
            this.baggageRule = builder.baggageRule;
            this.passengerPriceList = builder.passengerPriceList;
            this.refundChangeRule = builder.refundChangeRule;
            this.segmentKeyList = builder.segmentKeyList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderItemList create() {
            return builder().build();
        }

        /**
         * @return baggageRule
         */
        public BaggageRule getBaggageRule() {
            return this.baggageRule;
        }

        /**
         * @return passengerPriceList
         */
        public java.util.List < PassengerPriceList> getPassengerPriceList() {
            return this.passengerPriceList;
        }

        /**
         * @return refundChangeRule
         */
        public RefundChangeRule getRefundChangeRule() {
            return this.refundChangeRule;
        }

        /**
         * @return segmentKeyList
         */
        public java.util.List < String > getSegmentKeyList() {
            return this.segmentKeyList;
        }

        public static final class Builder {
            private BaggageRule baggageRule; 
            private java.util.List < PassengerPriceList> passengerPriceList; 
            private RefundChangeRule refundChangeRule; 
            private java.util.List < String > segmentKeyList; 

            /**
             * baggage_rule.
             */
            public Builder baggageRule(BaggageRule baggageRule) {
                this.baggageRule = baggageRule;
                return this;
            }

            /**
             * passenger_price_list.
             */
            public Builder passengerPriceList(java.util.List < PassengerPriceList> passengerPriceList) {
                this.passengerPriceList = passengerPriceList;
                return this;
            }

            /**
             * refund_change_rule.
             */
            public Builder refundChangeRule(RefundChangeRule refundChangeRule) {
                this.refundChangeRule = refundChangeRule;
                return this;
            }

            /**
             * segment_key_list.
             */
            public Builder segmentKeyList(java.util.List < String > segmentKeyList) {
                this.segmentKeyList = segmentKeyList;
                return this;
            }

            public OrderItemList build() {
                return new OrderItemList(this);
            } 

        } 

    }
    public static class PriceInfo extends TeaModel {
        @NameInMap("modify_fee")
        private Long modifyFee;

        @NameInMap("modify_tax_spread")
        private Long modifyTaxSpread;

        @NameInMap("sell_price")
        private Long sellPrice;

        @NameInMap("tax")
        private Long tax;

        @NameInMap("ticket_price")
        private Long ticketPrice;

        @NameInMap("upgrade_fee")
        private Long upgradeFee;

        private PriceInfo(Builder builder) {
            this.modifyFee = builder.modifyFee;
            this.modifyTaxSpread = builder.modifyTaxSpread;
            this.sellPrice = builder.sellPrice;
            this.tax = builder.tax;
            this.ticketPrice = builder.ticketPrice;
            this.upgradeFee = builder.upgradeFee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PriceInfo create() {
            return builder().build();
        }

        /**
         * @return modifyFee
         */
        public Long getModifyFee() {
            return this.modifyFee;
        }

        /**
         * @return modifyTaxSpread
         */
        public Long getModifyTaxSpread() {
            return this.modifyTaxSpread;
        }

        /**
         * @return sellPrice
         */
        public Long getSellPrice() {
            return this.sellPrice;
        }

        /**
         * @return tax
         */
        public Long getTax() {
            return this.tax;
        }

        /**
         * @return ticketPrice
         */
        public Long getTicketPrice() {
            return this.ticketPrice;
        }

        /**
         * @return upgradeFee
         */
        public Long getUpgradeFee() {
            return this.upgradeFee;
        }

        public static final class Builder {
            private Long modifyFee; 
            private Long modifyTaxSpread; 
            private Long sellPrice; 
            private Long tax; 
            private Long ticketPrice; 
            private Long upgradeFee; 

            /**
             * modify_fee.
             */
            public Builder modifyFee(Long modifyFee) {
                this.modifyFee = modifyFee;
                return this;
            }

            /**
             * modify_tax_spread.
             */
            public Builder modifyTaxSpread(Long modifyTaxSpread) {
                this.modifyTaxSpread = modifyTaxSpread;
                return this;
            }

            /**
             * sell_price.
             */
            public Builder sellPrice(Long sellPrice) {
                this.sellPrice = sellPrice;
                return this;
            }

            /**
             * tax.
             */
            public Builder tax(Long tax) {
                this.tax = tax;
                return this;
            }

            /**
             * ticket_price.
             */
            public Builder ticketPrice(Long ticketPrice) {
                this.ticketPrice = ticketPrice;
                return this;
            }

            /**
             * upgrade_fee.
             */
            public Builder upgradeFee(Long upgradeFee) {
                this.upgradeFee = upgradeFee;
                return this;
            }

            public PriceInfo build() {
                return new PriceInfo(this);
            } 

        } 

    }
    public static class TicketSegmentList extends TeaModel {
        @NameInMap("cabin")
        private String cabin;

        @NameInMap("cabin_class")
        private String cabinClass;

        @NameInMap("modified")
        private Boolean modified;

        @NameInMap("open_ticket_status")
        private String openTicketStatus;

        @NameInMap("refunded")
        private Boolean refunded;

        @NameInMap("segment_key")
        private String segmentKey;

        private TicketSegmentList(Builder builder) {
            this.cabin = builder.cabin;
            this.cabinClass = builder.cabinClass;
            this.modified = builder.modified;
            this.openTicketStatus = builder.openTicketStatus;
            this.refunded = builder.refunded;
            this.segmentKey = builder.segmentKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TicketSegmentList create() {
            return builder().build();
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
        public String getCabinClass() {
            return this.cabinClass;
        }

        /**
         * @return modified
         */
        public Boolean getModified() {
            return this.modified;
        }

        /**
         * @return openTicketStatus
         */
        public String getOpenTicketStatus() {
            return this.openTicketStatus;
        }

        /**
         * @return refunded
         */
        public Boolean getRefunded() {
            return this.refunded;
        }

        /**
         * @return segmentKey
         */
        public String getSegmentKey() {
            return this.segmentKey;
        }

        public static final class Builder {
            private String cabin; 
            private String cabinClass; 
            private Boolean modified; 
            private String openTicketStatus; 
            private Boolean refunded; 
            private String segmentKey; 

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
            public Builder cabinClass(String cabinClass) {
                this.cabinClass = cabinClass;
                return this;
            }

            /**
             * modified.
             */
            public Builder modified(Boolean modified) {
                this.modified = modified;
                return this;
            }

            /**
             * open_ticket_status.
             */
            public Builder openTicketStatus(String openTicketStatus) {
                this.openTicketStatus = openTicketStatus;
                return this;
            }

            /**
             * refunded.
             */
            public Builder refunded(Boolean refunded) {
                this.refunded = refunded;
                return this;
            }

            /**
             * segment_key.
             */
            public Builder segmentKey(String segmentKey) {
                this.segmentKey = segmentKey;
                return this;
            }

            public TicketSegmentList build() {
                return new TicketSegmentList(this);
            } 

        } 

    }
    public static class TicketList extends TeaModel {
        @NameInMap("issue_time")
        private String issueTime;

        @NameInMap("price_info")
        private PriceInfo priceInfo;

        @NameInMap("ticket_no")
        private String ticketNo;

        @NameInMap("ticket_segment_list")
        private java.util.List < TicketSegmentList> ticketSegmentList;

        private TicketList(Builder builder) {
            this.issueTime = builder.issueTime;
            this.priceInfo = builder.priceInfo;
            this.ticketNo = builder.ticketNo;
            this.ticketSegmentList = builder.ticketSegmentList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TicketList create() {
            return builder().build();
        }

        /**
         * @return issueTime
         */
        public String getIssueTime() {
            return this.issueTime;
        }

        /**
         * @return priceInfo
         */
        public PriceInfo getPriceInfo() {
            return this.priceInfo;
        }

        /**
         * @return ticketNo
         */
        public String getTicketNo() {
            return this.ticketNo;
        }

        /**
         * @return ticketSegmentList
         */
        public java.util.List < TicketSegmentList> getTicketSegmentList() {
            return this.ticketSegmentList;
        }

        public static final class Builder {
            private String issueTime; 
            private PriceInfo priceInfo; 
            private String ticketNo; 
            private java.util.List < TicketSegmentList> ticketSegmentList; 

            /**
             * issue_time.
             */
            public Builder issueTime(String issueTime) {
                this.issueTime = issueTime;
                return this;
            }

            /**
             * price_info.
             */
            public Builder priceInfo(PriceInfo priceInfo) {
                this.priceInfo = priceInfo;
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
             * ticket_segment_list.
             */
            public Builder ticketSegmentList(java.util.List < TicketSegmentList> ticketSegmentList) {
                this.ticketSegmentList = ticketSegmentList;
                return this;
            }

            public TicketList build() {
                return new TicketList(this);
            } 

        } 

    }
    public static class PassengerItemDetailList extends TeaModel {
        @NameInMap("passenger_id")
        private Long passengerId;

        @NameInMap("ticket_list")
        private java.util.List < TicketList> ticketList;

        private PassengerItemDetailList(Builder builder) {
            this.passengerId = builder.passengerId;
            this.ticketList = builder.ticketList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PassengerItemDetailList create() {
            return builder().build();
        }

        /**
         * @return passengerId
         */
        public Long getPassengerId() {
            return this.passengerId;
        }

        /**
         * @return ticketList
         */
        public java.util.List < TicketList> getTicketList() {
            return this.ticketList;
        }

        public static final class Builder {
            private Long passengerId; 
            private java.util.List < TicketList> ticketList; 

            /**
             * passenger_id.
             */
            public Builder passengerId(Long passengerId) {
                this.passengerId = passengerId;
                return this;
            }

            /**
             * ticket_list.
             */
            public Builder ticketList(java.util.List < TicketList> ticketList) {
                this.ticketList = ticketList;
                return this;
            }

            public PassengerItemDetailList build() {
                return new PassengerItemDetailList(this);
            } 

        } 

    }
    public static class CertInfo extends TeaModel {
        @NameInMap("cert_nation")
        private String certNation;

        @NameInMap("cert_no")
        private String certNo;

        @NameInMap("cert_type")
        private Integer certType;

        @NameInMap("cert_valid_date")
        private String certValidDate;

        @NameInMap("name")
        private String name;

        private CertInfo(Builder builder) {
            this.certNation = builder.certNation;
            this.certNo = builder.certNo;
            this.certType = builder.certType;
            this.certValidDate = builder.certValidDate;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CertInfo create() {
            return builder().build();
        }

        /**
         * @return certNation
         */
        public String getCertNation() {
            return this.certNation;
        }

        /**
         * @return certNo
         */
        public String getCertNo() {
            return this.certNo;
        }

        /**
         * @return certType
         */
        public Integer getCertType() {
            return this.certType;
        }

        /**
         * @return certValidDate
         */
        public String getCertValidDate() {
            return this.certValidDate;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String certNation; 
            private String certNo; 
            private Integer certType; 
            private String certValidDate; 
            private String name; 

            /**
             * cert_nation.
             */
            public Builder certNation(String certNation) {
                this.certNation = certNation;
                return this;
            }

            /**
             * cert_no.
             */
            public Builder certNo(String certNo) {
                this.certNo = certNo;
                return this;
            }

            /**
             * cert_type.
             */
            public Builder certType(Integer certType) {
                this.certType = certType;
                return this;
            }

            /**
             * cert_valid_date.
             */
            public Builder certValidDate(String certValidDate) {
                this.certValidDate = certValidDate;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public CertInfo build() {
                return new CertInfo(this);
            } 

        } 

    }
    public static class SubsidiaryCertInfoList extends TeaModel {
        @NameInMap("cert_nation")
        private String certNation;

        @NameInMap("cert_no")
        private String certNo;

        @NameInMap("cert_type")
        private Integer certType;

        @NameInMap("cert_valid_date")
        private String certValidDate;

        @NameInMap("name")
        private String name;

        private SubsidiaryCertInfoList(Builder builder) {
            this.certNation = builder.certNation;
            this.certNo = builder.certNo;
            this.certType = builder.certType;
            this.certValidDate = builder.certValidDate;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubsidiaryCertInfoList create() {
            return builder().build();
        }

        /**
         * @return certNation
         */
        public String getCertNation() {
            return this.certNation;
        }

        /**
         * @return certNo
         */
        public String getCertNo() {
            return this.certNo;
        }

        /**
         * @return certType
         */
        public Integer getCertType() {
            return this.certType;
        }

        /**
         * @return certValidDate
         */
        public String getCertValidDate() {
            return this.certValidDate;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String certNation; 
            private String certNo; 
            private Integer certType; 
            private String certValidDate; 
            private String name; 

            /**
             * cert_nation.
             */
            public Builder certNation(String certNation) {
                this.certNation = certNation;
                return this;
            }

            /**
             * cert_no.
             */
            public Builder certNo(String certNo) {
                this.certNo = certNo;
                return this;
            }

            /**
             * cert_type.
             */
            public Builder certType(Integer certType) {
                this.certType = certType;
                return this;
            }

            /**
             * cert_valid_date.
             */
            public Builder certValidDate(String certValidDate) {
                this.certValidDate = certValidDate;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public SubsidiaryCertInfoList build() {
                return new SubsidiaryCertInfoList(this);
            } 

        } 

    }
    public static class PassengerList extends TeaModel {
        @NameInMap("birthday")
        private String birthday;

        @NameInMap("cascade_dept_mask")
        private String cascadeDeptMask;

        @NameInMap("cascade_dept_name")
        private String cascadeDeptName;

        @NameInMap("cert_info")
        private CertInfo certInfo;

        @NameInMap("cost_center_name")
        private String costCenterName;

        @NameInMap("cost_center_number")
        private String costCenterNumber;

        @NameInMap("dept_id")
        private String deptId;

        @NameInMap("dept_name")
        private String deptName;

        @NameInMap("gender")
        private Integer gender;

        @NameInMap("invoice_id")
        private String invoiceId;

        @NameInMap("invoice_title")
        private String invoiceTitle;

        @NameInMap("job_no")
        private String jobNo;

        @NameInMap("mobile_country_code")
        private String mobileCountryCode;

        @NameInMap("nationality")
        private String nationality;

        @NameInMap("nationality_code")
        private String nationalityCode;

        @NameInMap("passenger_id")
        private Long passengerId;

        @NameInMap("passenger_type")
        private Integer passengerType;

        @NameInMap("phone")
        private String phone;

        @NameInMap("project_code")
        private String projectCode;

        @NameInMap("project_title")
        private String projectTitle;

        @NameInMap("subsidiary_cert_info_list")
        private java.util.List < SubsidiaryCertInfoList> subsidiaryCertInfoList;

        @NameInMap("user_id")
        private String userId;

        @NameInMap("user_type")
        private Integer userType;

        private PassengerList(Builder builder) {
            this.birthday = builder.birthday;
            this.cascadeDeptMask = builder.cascadeDeptMask;
            this.cascadeDeptName = builder.cascadeDeptName;
            this.certInfo = builder.certInfo;
            this.costCenterName = builder.costCenterName;
            this.costCenterNumber = builder.costCenterNumber;
            this.deptId = builder.deptId;
            this.deptName = builder.deptName;
            this.gender = builder.gender;
            this.invoiceId = builder.invoiceId;
            this.invoiceTitle = builder.invoiceTitle;
            this.jobNo = builder.jobNo;
            this.mobileCountryCode = builder.mobileCountryCode;
            this.nationality = builder.nationality;
            this.nationalityCode = builder.nationalityCode;
            this.passengerId = builder.passengerId;
            this.passengerType = builder.passengerType;
            this.phone = builder.phone;
            this.projectCode = builder.projectCode;
            this.projectTitle = builder.projectTitle;
            this.subsidiaryCertInfoList = builder.subsidiaryCertInfoList;
            this.userId = builder.userId;
            this.userType = builder.userType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PassengerList create() {
            return builder().build();
        }

        /**
         * @return birthday
         */
        public String getBirthday() {
            return this.birthday;
        }

        /**
         * @return cascadeDeptMask
         */
        public String getCascadeDeptMask() {
            return this.cascadeDeptMask;
        }

        /**
         * @return cascadeDeptName
         */
        public String getCascadeDeptName() {
            return this.cascadeDeptName;
        }

        /**
         * @return certInfo
         */
        public CertInfo getCertInfo() {
            return this.certInfo;
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
         * @return deptId
         */
        public String getDeptId() {
            return this.deptId;
        }

        /**
         * @return deptName
         */
        public String getDeptName() {
            return this.deptName;
        }

        /**
         * @return gender
         */
        public Integer getGender() {
            return this.gender;
        }

        /**
         * @return invoiceId
         */
        public String getInvoiceId() {
            return this.invoiceId;
        }

        /**
         * @return invoiceTitle
         */
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        /**
         * @return jobNo
         */
        public String getJobNo() {
            return this.jobNo;
        }

        /**
         * @return mobileCountryCode
         */
        public String getMobileCountryCode() {
            return this.mobileCountryCode;
        }

        /**
         * @return nationality
         */
        public String getNationality() {
            return this.nationality;
        }

        /**
         * @return nationalityCode
         */
        public String getNationalityCode() {
            return this.nationalityCode;
        }

        /**
         * @return passengerId
         */
        public Long getPassengerId() {
            return this.passengerId;
        }

        /**
         * @return passengerType
         */
        public Integer getPassengerType() {
            return this.passengerType;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
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
         * @return subsidiaryCertInfoList
         */
        public java.util.List < SubsidiaryCertInfoList> getSubsidiaryCertInfoList() {
            return this.subsidiaryCertInfoList;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userType
         */
        public Integer getUserType() {
            return this.userType;
        }

        public static final class Builder {
            private String birthday; 
            private String cascadeDeptMask; 
            private String cascadeDeptName; 
            private CertInfo certInfo; 
            private String costCenterName; 
            private String costCenterNumber; 
            private String deptId; 
            private String deptName; 
            private Integer gender; 
            private String invoiceId; 
            private String invoiceTitle; 
            private String jobNo; 
            private String mobileCountryCode; 
            private String nationality; 
            private String nationalityCode; 
            private Long passengerId; 
            private Integer passengerType; 
            private String phone; 
            private String projectCode; 
            private String projectTitle; 
            private java.util.List < SubsidiaryCertInfoList> subsidiaryCertInfoList; 
            private String userId; 
            private Integer userType; 

            /**
             * birthday.
             */
            public Builder birthday(String birthday) {
                this.birthday = birthday;
                return this;
            }

            /**
             * cascade_dept_mask.
             */
            public Builder cascadeDeptMask(String cascadeDeptMask) {
                this.cascadeDeptMask = cascadeDeptMask;
                return this;
            }

            /**
             * cascade_dept_name.
             */
            public Builder cascadeDeptName(String cascadeDeptName) {
                this.cascadeDeptName = cascadeDeptName;
                return this;
            }

            /**
             * cert_info.
             */
            public Builder certInfo(CertInfo certInfo) {
                this.certInfo = certInfo;
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
             * dept_id.
             */
            public Builder deptId(String deptId) {
                this.deptId = deptId;
                return this;
            }

            /**
             * dept_name.
             */
            public Builder deptName(String deptName) {
                this.deptName = deptName;
                return this;
            }

            /**
             * gender.
             */
            public Builder gender(Integer gender) {
                this.gender = gender;
                return this;
            }

            /**
             * invoice_id.
             */
            public Builder invoiceId(String invoiceId) {
                this.invoiceId = invoiceId;
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
             * job_no.
             */
            public Builder jobNo(String jobNo) {
                this.jobNo = jobNo;
                return this;
            }

            /**
             * mobile_country_code.
             */
            public Builder mobileCountryCode(String mobileCountryCode) {
                this.mobileCountryCode = mobileCountryCode;
                return this;
            }

            /**
             * nationality.
             */
            public Builder nationality(String nationality) {
                this.nationality = nationality;
                return this;
            }

            /**
             * nationality_code.
             */
            public Builder nationalityCode(String nationalityCode) {
                this.nationalityCode = nationalityCode;
                return this;
            }

            /**
             * passenger_id.
             */
            public Builder passengerId(Long passengerId) {
                this.passengerId = passengerId;
                return this;
            }

            /**
             * passenger_type.
             */
            public Builder passengerType(Integer passengerType) {
                this.passengerType = passengerType;
                return this;
            }

            /**
             * phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
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
             * subsidiary_cert_info_list.
             */
            public Builder subsidiaryCertInfoList(java.util.List < SubsidiaryCertInfoList> subsidiaryCertInfoList) {
                this.subsidiaryCertInfoList = subsidiaryCertInfoList;
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
             * user_type.
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
    public static class Module extends TeaModel {
        @NameInMap("book_user_id")
        private String bookUserId;

        @NameInMap("book_user_name")
        private String bookUserName;

        @NameInMap("close_reason")
        private String closeReason;

        @NameInMap("close_time")
        private Long closeTime;

        @NameInMap("close_time_str")
        private String closeTimeStr;

        @NameInMap("contact_info")
        private ContactInfo contactInfo;

        @NameInMap("create_time")
        private Long createTime;

        @NameInMap("create_time_str")
        private String createTimeStr;

        @NameInMap("ext_info_map")
        private java.util.Map < String, String > extInfoMap;

        @NameInMap("journey_list")
        private java.util.List < JourneyList> journeyList;

        @NameInMap("order_id")
        private Long orderId;

        @NameInMap("order_item_list")
        private java.util.List < OrderItemList> orderItemList;

        @NameInMap("out_order_id")
        private String outOrderId;

        @NameInMap("passenger_item_detail_list")
        private java.util.List < PassengerItemDetailList> passengerItemDetailList;

        @NameInMap("passenger_list")
        private java.util.List < PassengerList> passengerList;

        @NameInMap("pay_expire_time")
        private Long payExpireTime;

        @NameInMap("pay_expire_time_str")
        private String payExpireTimeStr;

        @NameInMap("pay_status")
        private Integer payStatus;

        @NameInMap("pay_time")
        private Long payTime;

        @NameInMap("pay_time_str")
        private String payTimeStr;

        @NameInMap("pay_type")
        private Integer payType;

        @NameInMap("status")
        private Integer status;

        @NameInMap("succeed_time")
        private Long succeedTime;

        @NameInMap("succeed_time_str")
        private String succeedTimeStr;

        @NameInMap("total_price")
        private Long totalPrice;

        @NameInMap("trip_type")
        private Integer tripType;

        private Module(Builder builder) {
            this.bookUserId = builder.bookUserId;
            this.bookUserName = builder.bookUserName;
            this.closeReason = builder.closeReason;
            this.closeTime = builder.closeTime;
            this.closeTimeStr = builder.closeTimeStr;
            this.contactInfo = builder.contactInfo;
            this.createTime = builder.createTime;
            this.createTimeStr = builder.createTimeStr;
            this.extInfoMap = builder.extInfoMap;
            this.journeyList = builder.journeyList;
            this.orderId = builder.orderId;
            this.orderItemList = builder.orderItemList;
            this.outOrderId = builder.outOrderId;
            this.passengerItemDetailList = builder.passengerItemDetailList;
            this.passengerList = builder.passengerList;
            this.payExpireTime = builder.payExpireTime;
            this.payExpireTimeStr = builder.payExpireTimeStr;
            this.payStatus = builder.payStatus;
            this.payTime = builder.payTime;
            this.payTimeStr = builder.payTimeStr;
            this.payType = builder.payType;
            this.status = builder.status;
            this.succeedTime = builder.succeedTime;
            this.succeedTimeStr = builder.succeedTimeStr;
            this.totalPrice = builder.totalPrice;
            this.tripType = builder.tripType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return bookUserId
         */
        public String getBookUserId() {
            return this.bookUserId;
        }

        /**
         * @return bookUserName
         */
        public String getBookUserName() {
            return this.bookUserName;
        }

        /**
         * @return closeReason
         */
        public String getCloseReason() {
            return this.closeReason;
        }

        /**
         * @return closeTime
         */
        public Long getCloseTime() {
            return this.closeTime;
        }

        /**
         * @return closeTimeStr
         */
        public String getCloseTimeStr() {
            return this.closeTimeStr;
        }

        /**
         * @return contactInfo
         */
        public ContactInfo getContactInfo() {
            return this.contactInfo;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createTimeStr
         */
        public String getCreateTimeStr() {
            return this.createTimeStr;
        }

        /**
         * @return extInfoMap
         */
        public java.util.Map < String, String > getExtInfoMap() {
            return this.extInfoMap;
        }

        /**
         * @return journeyList
         */
        public java.util.List < JourneyList> getJourneyList() {
            return this.journeyList;
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
        }

        /**
         * @return orderItemList
         */
        public java.util.List < OrderItemList> getOrderItemList() {
            return this.orderItemList;
        }

        /**
         * @return outOrderId
         */
        public String getOutOrderId() {
            return this.outOrderId;
        }

        /**
         * @return passengerItemDetailList
         */
        public java.util.List < PassengerItemDetailList> getPassengerItemDetailList() {
            return this.passengerItemDetailList;
        }

        /**
         * @return passengerList
         */
        public java.util.List < PassengerList> getPassengerList() {
            return this.passengerList;
        }

        /**
         * @return payExpireTime
         */
        public Long getPayExpireTime() {
            return this.payExpireTime;
        }

        /**
         * @return payExpireTimeStr
         */
        public String getPayExpireTimeStr() {
            return this.payExpireTimeStr;
        }

        /**
         * @return payStatus
         */
        public Integer getPayStatus() {
            return this.payStatus;
        }

        /**
         * @return payTime
         */
        public Long getPayTime() {
            return this.payTime;
        }

        /**
         * @return payTimeStr
         */
        public String getPayTimeStr() {
            return this.payTimeStr;
        }

        /**
         * @return payType
         */
        public Integer getPayType() {
            return this.payType;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return succeedTime
         */
        public Long getSucceedTime() {
            return this.succeedTime;
        }

        /**
         * @return succeedTimeStr
         */
        public String getSucceedTimeStr() {
            return this.succeedTimeStr;
        }

        /**
         * @return totalPrice
         */
        public Long getTotalPrice() {
            return this.totalPrice;
        }

        /**
         * @return tripType
         */
        public Integer getTripType() {
            return this.tripType;
        }

        public static final class Builder {
            private String bookUserId; 
            private String bookUserName; 
            private String closeReason; 
            private Long closeTime; 
            private String closeTimeStr; 
            private ContactInfo contactInfo; 
            private Long createTime; 
            private String createTimeStr; 
            private java.util.Map < String, String > extInfoMap; 
            private java.util.List < JourneyList> journeyList; 
            private Long orderId; 
            private java.util.List < OrderItemList> orderItemList; 
            private String outOrderId; 
            private java.util.List < PassengerItemDetailList> passengerItemDetailList; 
            private java.util.List < PassengerList> passengerList; 
            private Long payExpireTime; 
            private String payExpireTimeStr; 
            private Integer payStatus; 
            private Long payTime; 
            private String payTimeStr; 
            private Integer payType; 
            private Integer status; 
            private Long succeedTime; 
            private String succeedTimeStr; 
            private Long totalPrice; 
            private Integer tripType; 

            /**
             * book_user_id.
             */
            public Builder bookUserId(String bookUserId) {
                this.bookUserId = bookUserId;
                return this;
            }

            /**
             * book_user_name.
             */
            public Builder bookUserName(String bookUserName) {
                this.bookUserName = bookUserName;
                return this;
            }

            /**
             * close_reason.
             */
            public Builder closeReason(String closeReason) {
                this.closeReason = closeReason;
                return this;
            }

            /**
             * close_time.
             */
            public Builder closeTime(Long closeTime) {
                this.closeTime = closeTime;
                return this;
            }

            /**
             * close_time_str.
             */
            public Builder closeTimeStr(String closeTimeStr) {
                this.closeTimeStr = closeTimeStr;
                return this;
            }

            /**
             * contact_info.
             */
            public Builder contactInfo(ContactInfo contactInfo) {
                this.contactInfo = contactInfo;
                return this;
            }

            /**
             * create_time.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * create_time_str.
             */
            public Builder createTimeStr(String createTimeStr) {
                this.createTimeStr = createTimeStr;
                return this;
            }

            /**
             * ext_info_map.
             */
            public Builder extInfoMap(java.util.Map < String, String > extInfoMap) {
                this.extInfoMap = extInfoMap;
                return this;
            }

            /**
             * journey_list.
             */
            public Builder journeyList(java.util.List < JourneyList> journeyList) {
                this.journeyList = journeyList;
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
             * order_item_list.
             */
            public Builder orderItemList(java.util.List < OrderItemList> orderItemList) {
                this.orderItemList = orderItemList;
                return this;
            }

            /**
             * out_order_id.
             */
            public Builder outOrderId(String outOrderId) {
                this.outOrderId = outOrderId;
                return this;
            }

            /**
             * passenger_item_detail_list.
             */
            public Builder passengerItemDetailList(java.util.List < PassengerItemDetailList> passengerItemDetailList) {
                this.passengerItemDetailList = passengerItemDetailList;
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
             * pay_expire_time.
             */
            public Builder payExpireTime(Long payExpireTime) {
                this.payExpireTime = payExpireTime;
                return this;
            }

            /**
             * pay_expire_time_str.
             */
            public Builder payExpireTimeStr(String payExpireTimeStr) {
                this.payExpireTimeStr = payExpireTimeStr;
                return this;
            }

            /**
             * pay_status.
             */
            public Builder payStatus(Integer payStatus) {
                this.payStatus = payStatus;
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
             * pay_time_str.
             */
            public Builder payTimeStr(String payTimeStr) {
                this.payTimeStr = payTimeStr;
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
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * succeed_time.
             */
            public Builder succeedTime(Long succeedTime) {
                this.succeedTime = succeedTime;
                return this;
            }

            /**
             * succeed_time_str.
             */
            public Builder succeedTimeStr(String succeedTimeStr) {
                this.succeedTimeStr = succeedTimeStr;
                return this;
            }

            /**
             * total_price.
             */
            public Builder totalPrice(Long totalPrice) {
                this.totalPrice = totalPrice;
                return this;
            }

            /**
             * trip_type.
             */
            public Builder tripType(Integer tripType) {
                this.tripType = tripType;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
