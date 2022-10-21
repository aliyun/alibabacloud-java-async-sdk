// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyQueryResponseBody} extends {@link TeaModel}
 *
 * <p>ApplyQueryResponseBody</p>
 */
public class ApplyQueryResponseBody extends TeaModel {
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
    public static class HotelCitys extends TeaModel {
        @NameInMap("city_code")
        private String cityCode;

        @NameInMap("city_name")
        private String cityName;

        @NameInMap("fee")
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
    public static class ExternalTravelerList extends TeaModel {
        @NameInMap("business_discount")
        private Integer businessDiscount;

        @NameInMap("economy_discount")
        private Integer economyDiscount;

        @NameInMap("first_discount")
        private Integer firstDiscount;

        @NameInMap("flight_cabins")
        private String flightCabins;

        @NameInMap("hotel_citys")
        private java.util.List < HotelCitys> hotelCitys;

        @NameInMap("reserve_type")
        private Integer reserveType;

        @NameInMap("train_seats")
        private String trainSeats;

        @NameInMap("user_name")
        private String userName;

        private ExternalTravelerList(Builder builder) {
            this.businessDiscount = builder.businessDiscount;
            this.economyDiscount = builder.economyDiscount;
            this.firstDiscount = builder.firstDiscount;
            this.flightCabins = builder.flightCabins;
            this.hotelCitys = builder.hotelCitys;
            this.reserveType = builder.reserveType;
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
         * @return businessDiscount
         */
        public Integer getBusinessDiscount() {
            return this.businessDiscount;
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
         * @return hotelCitys
         */
        public java.util.List < HotelCitys> getHotelCitys() {
            return this.hotelCitys;
        }

        /**
         * @return reserveType
         */
        public Integer getReserveType() {
            return this.reserveType;
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
            private Integer businessDiscount; 
            private Integer economyDiscount; 
            private Integer firstDiscount; 
            private String flightCabins; 
            private java.util.List < HotelCitys> hotelCitys; 
            private Integer reserveType; 
            private String trainSeats; 
            private String userName; 

            /**
             * business_discount.
             */
            public Builder businessDiscount(Integer businessDiscount) {
                this.businessDiscount = businessDiscount;
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
             * hotel_citys.
             */
            public Builder hotelCitys(java.util.List < HotelCitys> hotelCitys) {
                this.hotelCitys = hotelCitys;
                return this;
            }

            /**
             * 限制差标类型。0-不限差标，1-限制差标
             */
            public Builder reserveType(Integer reserveType) {
                this.reserveType = reserveType;
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
    public static class HotelShare extends TeaModel {
        @NameInMap("param")
        private String param;

        @NameInMap("type")
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
             * 比例/固定金额
             */
            public Builder param(String param) {
                this.param = param;
                return this;
            }

            /**
             * 合住公式（HotelShareEnum.type）
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
    public static class ItineraryList extends TeaModel {
        @NameInMap("arr_city")
        private String arrCity;

        @NameInMap("arr_city_code")
        private String arrCityCode;

        @NameInMap("arr_date")
        private String arrDate;

        @NameInMap("cost_center_name")
        private String costCenterName;

        @NameInMap("dep_city")
        private String depCity;

        @NameInMap("dep_city_code")
        private String depCityCode;

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

        @NameInMap("traffic_type")
        private Integer trafficType;

        @NameInMap("trip_way")
        private Integer tripWay;

        private ItineraryList(Builder builder) {
            this.arrCity = builder.arrCity;
            this.arrCityCode = builder.arrCityCode;
            this.arrDate = builder.arrDate;
            this.costCenterName = builder.costCenterName;
            this.depCity = builder.depCity;
            this.depCityCode = builder.depCityCode;
            this.depDate = builder.depDate;
            this.invoiceName = builder.invoiceName;
            this.itineraryId = builder.itineraryId;
            this.projectCode = builder.projectCode;
            this.projectTitle = builder.projectTitle;
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
            private String costCenterName; 
            private String depCity; 
            private String depCityCode; 
            private String depDate; 
            private String invoiceName; 
            private String itineraryId; 
            private String projectCode; 
            private String projectTitle; 
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
            private Integer trafficType; 

            /**
             * 到达日期
             */
            public Builder arrDate(String arrDate) {
                this.arrDate = arrDate;
                return this;
            }

            /**
             * 离抵城市code，多个城市用中文“，”隔开
             */
            public Builder cityCodeSet(String cityCodeSet) {
                this.cityCodeSet = cityCodeSet;
                return this;
            }

            /**
             * 离抵城市名称，多个城市用中文“，”隔开
             */
            public Builder citySet(String citySet) {
                this.citySet = citySet;
                return this;
            }

            /**
             * 成本中心名称
             */
            public Builder costCenterName(String costCenterName) {
                this.costCenterName = costCenterName;
                return this;
            }

            /**
             * 出发日期
             */
            public Builder depDate(String depDate) {
                this.depDate = depDate;
                return this;
            }

            /**
             * 发票抬头
             */
            public Builder invoiceName(String invoiceName) {
                this.invoiceName = invoiceName;
                return this;
            }

            /**
             * 行程id
             */
            public Builder itineraryId(String itineraryId) {
                this.itineraryId = itineraryId;
                return this;
            }

            /**
             * 项目编号
             */
            public Builder projectCode(String projectCode) {
                this.projectCode = projectCode;
                return this;
            }

            /**
             * 项目名称
             */
            public Builder projectTitle(String projectTitle) {
                this.projectTitle = projectTitle;
                return this;
            }

            /**
             * 交通方式： 0 飞机、酒店,  1 火车、酒店,  2 汽车、酒店,  3 酒店，5 不限，6 飞机，7 火车，9 飞机、火车、酒店
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
    public static class TravelerListHotelCitys extends TeaModel {
        @NameInMap("city_code")
        private String cityCode;

        @NameInMap("city_name")
        private String cityName;

        @NameInMap("fee")
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
    public static class TravelerList extends TeaModel {
        @NameInMap("business_discount")
        private Integer businessDiscount;

        @NameInMap("economy_discount")
        private Integer economyDiscount;

        @NameInMap("first_discount")
        private Integer firstDiscount;

        @NameInMap("flight_cabins")
        private String flightCabins;

        @NameInMap("hotel_citys")
        private java.util.List < TravelerListHotelCitys> hotelCitys;

        @NameInMap("reserve_type")
        private Integer reserveType;

        @NameInMap("train_seats")
        private String trainSeats;

        @NameInMap("user_id")
        private String userId;

        @NameInMap("user_name")
        private String userName;

        private TravelerList(Builder builder) {
            this.businessDiscount = builder.businessDiscount;
            this.economyDiscount = builder.economyDiscount;
            this.firstDiscount = builder.firstDiscount;
            this.flightCabins = builder.flightCabins;
            this.hotelCitys = builder.hotelCitys;
            this.reserveType = builder.reserveType;
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
         * @return businessDiscount
         */
        public Integer getBusinessDiscount() {
            return this.businessDiscount;
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
         * @return hotelCitys
         */
        public java.util.List < TravelerListHotelCitys> getHotelCitys() {
            return this.hotelCitys;
        }

        /**
         * @return reserveType
         */
        public Integer getReserveType() {
            return this.reserveType;
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
            private Integer businessDiscount; 
            private Integer economyDiscount; 
            private Integer firstDiscount; 
            private String flightCabins; 
            private java.util.List < TravelerListHotelCitys> hotelCitys; 
            private Integer reserveType; 
            private String trainSeats; 
            private String userId; 
            private String userName; 

            /**
             * business_discount.
             */
            public Builder businessDiscount(Integer businessDiscount) {
                this.businessDiscount = businessDiscount;
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
             * hotel_citys.
             */
            public Builder hotelCitys(java.util.List < TravelerListHotelCitys> hotelCitys) {
                this.hotelCitys = hotelCitys;
                return this;
            }

            /**
             * 限制差标类型。0-不限差标，1-限制差标
             */
            public Builder reserveType(Integer reserveType) {
                this.reserveType = reserveType;
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
             * 无userId时传缺省值superAdmin
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
    public static class Module extends TeaModel {
        @NameInMap("apply_show_id")
        private String applyShowId;

        @NameInMap("approver_list")
        private java.util.List < ApproverList> approverList;

        @NameInMap("budget")
        private Long budget;

        @NameInMap("budget_merge")
        private Integer budgetMerge;

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

        @NameInMap("flight_budget")
        private Long flightBudget;

        @NameInMap("gmt_create")
        private String gmtCreate;

        @NameInMap("gmt_modified")
        private String gmtModified;

        @NameInMap("hotel_budget")
        private Long hotelBudget;

        @NameInMap("hotel_share")
        private HotelShare hotelShare;

        @NameInMap("id")
        private Long id;

        @NameInMap("itinerary_list")
        private java.util.List < ItineraryList> itineraryList;

        @NameInMap("itinerary_rule")
        private Integer itineraryRule;

        @NameInMap("itinerary_set_list")
        private java.util.List < ItinerarySetList> itinerarySetList;

        @NameInMap("limit_traveler")
        private Integer limitTraveler;

        @NameInMap("status")
        private Integer status;

        @NameInMap("status_desc")
        private String statusDesc;

        @NameInMap("thirdpart_business_id")
        private String thirdpartBusinessId;

        @NameInMap("thirdpart_id")
        private String thirdpartId;

        @NameInMap("together_book_rule")
        private Integer togetherBookRule;

        @NameInMap("train_budget")
        private Long trainBudget;

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

        @NameInMap("vehicle_budget")
        private Long vehicleBudget;

        private Module(Builder builder) {
            this.applyShowId = builder.applyShowId;
            this.approverList = builder.approverList;
            this.budget = builder.budget;
            this.budgetMerge = builder.budgetMerge;
            this.corpId = builder.corpId;
            this.corpName = builder.corpName;
            this.departId = builder.departId;
            this.departName = builder.departName;
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
            private String corpId; 
            private String corpName; 
            private String departId; 
            private String departName; 
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
             * 申请单城市规则：
             * <p>
             * 0出发&目的地一对一，按列表传行程 
             * 1多选N个地点，城市集行程
             * 不传默认为0
             * 会根据商旅管理后台-通用差旅设置-行程城市规则中的设置，校验申请单本字段的值是否正确
             * 当行程城市规则中设置的是“1对1行程”时，必须传0
             * 当行程城市规则中设置的是“多对多城市集行程”时，必须传1
             * 会根据此字段传入的值，校验行程传参是否正确
             * 当申请单城市规则为0，itinerary_list行程列表必填
             * 当申请单城市规则为1，城市集行程必填
             */
            public Builder itineraryRule(Integer itineraryRule) {
                this.itineraryRule = itineraryRule;
                return this;
            }

            /**
             * 城市集行程列表
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
             * 合住公式（HotelShareEnum.type）
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
             * 无userId时传缺省值superAdmin
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
