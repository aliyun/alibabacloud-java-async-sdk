// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EstimatedPriceQueryResponseBody} extends {@link TeaModel}
 *
 * <p>EstimatedPriceQueryResponseBody</p>
 */
public class EstimatedPriceQueryResponseBody extends TeaModel {
    @NameInMap("code")
    private Integer code;

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

    private EstimatedPriceQueryResponseBody(Builder builder) {
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

    public static EstimatedPriceQueryResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
        private Integer code; 
        private String message; 
        private Module module; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * code.
         */
        public Builder code(Integer code) {
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
         * traceId
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public EstimatedPriceQueryResponseBody build() {
            return new EstimatedPriceQueryResponseBody(this);
        } 

    } 

    public static class HotelFeeDetail extends TeaModel {
        @NameInMap("city")
        private String city;

        @NameInMap("criterion")
        private Long criterion;

        @NameInMap("itinerary_id")
        private String itineraryId;

        @NameInMap("total")
        private Long total;

        @NameInMap("trip_days")
        private Integer tripDays;

        private HotelFeeDetail(Builder builder) {
            this.city = builder.city;
            this.criterion = builder.criterion;
            this.itineraryId = builder.itineraryId;
            this.total = builder.total;
            this.tripDays = builder.tripDays;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotelFeeDetail create() {
            return builder().build();
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return criterion
         */
        public Long getCriterion() {
            return this.criterion;
        }

        /**
         * @return itineraryId
         */
        public String getItineraryId() {
            return this.itineraryId;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        /**
         * @return tripDays
         */
        public Integer getTripDays() {
            return this.tripDays;
        }

        public static final class Builder {
            private String city; 
            private Long criterion; 
            private String itineraryId; 
            private Long total; 
            private Integer tripDays; 

            /**
             * city.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * criterion.
             */
            public Builder criterion(Long criterion) {
                this.criterion = criterion;
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
             * total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            /**
             * trip_days.
             */
            public Builder tripDays(Integer tripDays) {
                this.tripDays = tripDays;
                return this;
            }

            public HotelFeeDetail build() {
                return new HotelFeeDetail(this);
            } 

        } 

    }
    public static class Cheapest extends TeaModel {
        @NameInMap("arr_time")
        private String arrTime;

        @NameInMap("dep_time")
        private String depTime;

        @NameInMap("fee")
        private Long fee;

        @NameInMap("seat_grade")
        private String seatGrade;

        @NameInMap("vehicle_no")
        private String vehicleNo;

        private Cheapest(Builder builder) {
            this.arrTime = builder.arrTime;
            this.depTime = builder.depTime;
            this.fee = builder.fee;
            this.seatGrade = builder.seatGrade;
            this.vehicleNo = builder.vehicleNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cheapest create() {
            return builder().build();
        }

        /**
         * @return arrTime
         */
        public String getArrTime() {
            return this.arrTime;
        }

        /**
         * @return depTime
         */
        public String getDepTime() {
            return this.depTime;
        }

        /**
         * @return fee
         */
        public Long getFee() {
            return this.fee;
        }

        /**
         * @return seatGrade
         */
        public String getSeatGrade() {
            return this.seatGrade;
        }

        /**
         * @return vehicleNo
         */
        public String getVehicleNo() {
            return this.vehicleNo;
        }

        public static final class Builder {
            private String arrTime; 
            private String depTime; 
            private Long fee; 
            private String seatGrade; 
            private String vehicleNo; 

            /**
             * arr_time.
             */
            public Builder arrTime(String arrTime) {
                this.arrTime = arrTime;
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
             * fee.
             */
            public Builder fee(Long fee) {
                this.fee = fee;
                return this;
            }

            /**
             * seat_grade.
             */
            public Builder seatGrade(String seatGrade) {
                this.seatGrade = seatGrade;
                return this;
            }

            /**
             * vehicle_no.
             */
            public Builder vehicleNo(String vehicleNo) {
                this.vehicleNo = vehicleNo;
                return this;
            }

            public Cheapest build() {
                return new Cheapest(this);
            } 

        } 

    }
    public static class MostExpensive extends TeaModel {
        @NameInMap("arr_time")
        private String arrTime;

        @NameInMap("dep_time")
        private String depTime;

        @NameInMap("fee")
        private Long fee;

        @NameInMap("seat_grade")
        private String seatGrade;

        @NameInMap("vehicle_no")
        private String vehicleNo;

        private MostExpensive(Builder builder) {
            this.arrTime = builder.arrTime;
            this.depTime = builder.depTime;
            this.fee = builder.fee;
            this.seatGrade = builder.seatGrade;
            this.vehicleNo = builder.vehicleNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MostExpensive create() {
            return builder().build();
        }

        /**
         * @return arrTime
         */
        public String getArrTime() {
            return this.arrTime;
        }

        /**
         * @return depTime
         */
        public String getDepTime() {
            return this.depTime;
        }

        /**
         * @return fee
         */
        public Long getFee() {
            return this.fee;
        }

        /**
         * @return seatGrade
         */
        public String getSeatGrade() {
            return this.seatGrade;
        }

        /**
         * @return vehicleNo
         */
        public String getVehicleNo() {
            return this.vehicleNo;
        }

        public static final class Builder {
            private String arrTime; 
            private String depTime; 
            private Long fee; 
            private String seatGrade; 
            private String vehicleNo; 

            /**
             * arr_time.
             */
            public Builder arrTime(String arrTime) {
                this.arrTime = arrTime;
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
             * fee.
             */
            public Builder fee(Long fee) {
                this.fee = fee;
                return this;
            }

            /**
             * seat_grade.
             */
            public Builder seatGrade(String seatGrade) {
                this.seatGrade = seatGrade;
                return this;
            }

            /**
             * vehicle_no.
             */
            public Builder vehicleNo(String vehicleNo) {
                this.vehicleNo = vehicleNo;
                return this;
            }

            public MostExpensive build() {
                return new MostExpensive(this);
            } 

        } 

    }
    public static class BtripRoutes extends TeaModel {
        @NameInMap("arr_city")
        private String arrCity;

        @NameInMap("arr_date")
        private Long arrDate;

        @NameInMap("cheapest")
        private Cheapest cheapest;

        @NameInMap("dep_city")
        private String depCity;

        @NameInMap("dep_date")
        private Long depDate;

        @NameInMap("err_msg")
        private String errMsg;

        @NameInMap("itinerary_id")
        private String itineraryId;

        @NameInMap("most_expensive")
        private MostExpensive mostExpensive;

        @NameInMap("success")
        private Boolean success;

        private BtripRoutes(Builder builder) {
            this.arrCity = builder.arrCity;
            this.arrDate = builder.arrDate;
            this.cheapest = builder.cheapest;
            this.depCity = builder.depCity;
            this.depDate = builder.depDate;
            this.errMsg = builder.errMsg;
            this.itineraryId = builder.itineraryId;
            this.mostExpensive = builder.mostExpensive;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BtripRoutes create() {
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
        public Long getArrDate() {
            return this.arrDate;
        }

        /**
         * @return cheapest
         */
        public Cheapest getCheapest() {
            return this.cheapest;
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
        public Long getDepDate() {
            return this.depDate;
        }

        /**
         * @return errMsg
         */
        public String getErrMsg() {
            return this.errMsg;
        }

        /**
         * @return itineraryId
         */
        public String getItineraryId() {
            return this.itineraryId;
        }

        /**
         * @return mostExpensive
         */
        public MostExpensive getMostExpensive() {
            return this.mostExpensive;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String arrCity; 
            private Long arrDate; 
            private Cheapest cheapest; 
            private String depCity; 
            private Long depDate; 
            private String errMsg; 
            private String itineraryId; 
            private MostExpensive mostExpensive; 
            private Boolean success; 

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
            public Builder arrDate(Long arrDate) {
                this.arrDate = arrDate;
                return this;
            }

            /**
             * cheapest.
             */
            public Builder cheapest(Cheapest cheapest) {
                this.cheapest = cheapest;
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
            public Builder depDate(Long depDate) {
                this.depDate = depDate;
                return this;
            }

            /**
             * err_msg.
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
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
             * most_expensive.
             */
            public Builder mostExpensive(MostExpensive mostExpensive) {
                this.mostExpensive = mostExpensive;
                return this;
            }

            /**
             * success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public BtripRoutes build() {
                return new BtripRoutes(this);
            } 

        } 

    }
    public static class TrafficFee extends TeaModel {
        @NameInMap("btrip_routes")
        private java.util.List < BtripRoutes> btripRoutes;

        @NameInMap("err_msg")
        private String errMsg;

        @NameInMap("max_fee")
        private Long maxFee;

        @NameInMap("min_fee")
        private Long minFee;

        @NameInMap("success")
        private Boolean success;

        private TrafficFee(Builder builder) {
            this.btripRoutes = builder.btripRoutes;
            this.errMsg = builder.errMsg;
            this.maxFee = builder.maxFee;
            this.minFee = builder.minFee;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficFee create() {
            return builder().build();
        }

        /**
         * @return btripRoutes
         */
        public java.util.List < BtripRoutes> getBtripRoutes() {
            return this.btripRoutes;
        }

        /**
         * @return errMsg
         */
        public String getErrMsg() {
            return this.errMsg;
        }

        /**
         * @return maxFee
         */
        public Long getMaxFee() {
            return this.maxFee;
        }

        /**
         * @return minFee
         */
        public Long getMinFee() {
            return this.minFee;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private java.util.List < BtripRoutes> btripRoutes; 
            private String errMsg; 
            private Long maxFee; 
            private Long minFee; 
            private Boolean success; 

            /**
             * btrip_routes.
             */
            public Builder btripRoutes(java.util.List < BtripRoutes> btripRoutes) {
                this.btripRoutes = btripRoutes;
                return this;
            }

            /**
             * err_msg.
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * max_fee.
             */
            public Builder maxFee(Long maxFee) {
                this.maxFee = maxFee;
                return this;
            }

            /**
             * min_fee.
             */
            public Builder minFee(Long minFee) {
                this.minFee = minFee;
                return this;
            }

            /**
             * success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public TrafficFee build() {
                return new TrafficFee(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @NameInMap("hotel_fee_detail")
        private java.util.List < HotelFeeDetail> hotelFeeDetail;

        @NameInMap("total_hotel_fee")
        private Long totalHotelFee;

        @NameInMap("traffic_fee")
        private TrafficFee trafficFee;

        private Module(Builder builder) {
            this.hotelFeeDetail = builder.hotelFeeDetail;
            this.totalHotelFee = builder.totalHotelFee;
            this.trafficFee = builder.trafficFee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return hotelFeeDetail
         */
        public java.util.List < HotelFeeDetail> getHotelFeeDetail() {
            return this.hotelFeeDetail;
        }

        /**
         * @return totalHotelFee
         */
        public Long getTotalHotelFee() {
            return this.totalHotelFee;
        }

        /**
         * @return trafficFee
         */
        public TrafficFee getTrafficFee() {
            return this.trafficFee;
        }

        public static final class Builder {
            private java.util.List < HotelFeeDetail> hotelFeeDetail; 
            private Long totalHotelFee; 
            private TrafficFee trafficFee; 

            /**
             * hotel_fee_detail.
             */
            public Builder hotelFeeDetail(java.util.List < HotelFeeDetail> hotelFeeDetail) {
                this.hotelFeeDetail = hotelFeeDetail;
                return this;
            }

            /**
             * 酒店费用总额，单位为元
             */
            public Builder totalHotelFee(Long totalHotelFee) {
                this.totalHotelFee = totalHotelFee;
                return this;
            }

            /**
             * traffic_fee.
             */
            public Builder trafficFee(TrafficFee trafficFee) {
                this.trafficFee = trafficFee;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
