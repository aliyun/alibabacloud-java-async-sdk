// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

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
 * {@link FlightChangeOfOrderResponseBody} extends {@link TeaModel}
 *
 * <p>FlightChangeOfOrderResponseBody</p>
 */
public class FlightChangeOfOrderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("error_code")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("error_data")
    private Object errorData;

    @com.aliyun.core.annotation.NameInMap("error_msg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("status")
    private Integer status;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private FlightChangeOfOrderResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorData = builder.errorData;
        this.errorMsg = builder.errorMsg;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlightChangeOfOrderResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorData
     */
    public Object getErrorData() {
        return this.errorData;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Data> data; 
        private String errorCode; 
        private Object errorData; 
        private String errorMsg; 
        private Integer status; 
        private Boolean success; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * error_code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * error_data.
         */
        public Builder errorData(Object errorData) {
            this.errorData = errorData;
            return this;
        }

        /**
         * error_msg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
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
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public FlightChangeOfOrderResponseBody build() {
            return new FlightChangeOfOrderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link FlightChangeOfOrderResponseBody} extends {@link TeaModel}
     *
     * <p>FlightChangeOfOrderResponseBody</p>
     */
    public static class FlightChangeDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("change_reason")
        private String changeReason;

        @com.aliyun.core.annotation.NameInMap("change_time")
        private String changeTime;

        @com.aliyun.core.annotation.NameInMap("change_type")
        private Integer changeType;

        @com.aliyun.core.annotation.NameInMap("new_arrival_airport")
        private String newArrivalAirport;

        @com.aliyun.core.annotation.NameInMap("new_arrival_time")
        private String newArrivalTime;

        @com.aliyun.core.annotation.NameInMap("new_departure_airport")
        private String newDepartureAirport;

        @com.aliyun.core.annotation.NameInMap("new_departure_time")
        private String newDepartureTime;

        @com.aliyun.core.annotation.NameInMap("new_flight_no")
        private String newFlightNo;

        @com.aliyun.core.annotation.NameInMap("old_arrival_airport")
        private String oldArrivalAirport;

        @com.aliyun.core.annotation.NameInMap("old_arrival_time")
        private String oldArrivalTime;

        @com.aliyun.core.annotation.NameInMap("old_departure_airport")
        private String oldDepartureAirport;

        @com.aliyun.core.annotation.NameInMap("old_departure_time")
        private String oldDepartureTime;

        @com.aliyun.core.annotation.NameInMap("old_flight_no")
        private String oldFlightNo;

        private FlightChangeDetail(Builder builder) {
            this.changeReason = builder.changeReason;
            this.changeTime = builder.changeTime;
            this.changeType = builder.changeType;
            this.newArrivalAirport = builder.newArrivalAirport;
            this.newArrivalTime = builder.newArrivalTime;
            this.newDepartureAirport = builder.newDepartureAirport;
            this.newDepartureTime = builder.newDepartureTime;
            this.newFlightNo = builder.newFlightNo;
            this.oldArrivalAirport = builder.oldArrivalAirport;
            this.oldArrivalTime = builder.oldArrivalTime;
            this.oldDepartureAirport = builder.oldDepartureAirport;
            this.oldDepartureTime = builder.oldDepartureTime;
            this.oldFlightNo = builder.oldFlightNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlightChangeDetail create() {
            return builder().build();
        }

        /**
         * @return changeReason
         */
        public String getChangeReason() {
            return this.changeReason;
        }

        /**
         * @return changeTime
         */
        public String getChangeTime() {
            return this.changeTime;
        }

        /**
         * @return changeType
         */
        public Integer getChangeType() {
            return this.changeType;
        }

        /**
         * @return newArrivalAirport
         */
        public String getNewArrivalAirport() {
            return this.newArrivalAirport;
        }

        /**
         * @return newArrivalTime
         */
        public String getNewArrivalTime() {
            return this.newArrivalTime;
        }

        /**
         * @return newDepartureAirport
         */
        public String getNewDepartureAirport() {
            return this.newDepartureAirport;
        }

        /**
         * @return newDepartureTime
         */
        public String getNewDepartureTime() {
            return this.newDepartureTime;
        }

        /**
         * @return newFlightNo
         */
        public String getNewFlightNo() {
            return this.newFlightNo;
        }

        /**
         * @return oldArrivalAirport
         */
        public String getOldArrivalAirport() {
            return this.oldArrivalAirport;
        }

        /**
         * @return oldArrivalTime
         */
        public String getOldArrivalTime() {
            return this.oldArrivalTime;
        }

        /**
         * @return oldDepartureAirport
         */
        public String getOldDepartureAirport() {
            return this.oldDepartureAirport;
        }

        /**
         * @return oldDepartureTime
         */
        public String getOldDepartureTime() {
            return this.oldDepartureTime;
        }

        /**
         * @return oldFlightNo
         */
        public String getOldFlightNo() {
            return this.oldFlightNo;
        }

        public static final class Builder {
            private String changeReason; 
            private String changeTime; 
            private Integer changeType; 
            private String newArrivalAirport; 
            private String newArrivalTime; 
            private String newDepartureAirport; 
            private String newDepartureTime; 
            private String newFlightNo; 
            private String oldArrivalAirport; 
            private String oldArrivalTime; 
            private String oldDepartureAirport; 
            private String oldDepartureTime; 
            private String oldFlightNo; 

            /**
             * change_reason.
             */
            public Builder changeReason(String changeReason) {
                this.changeReason = changeReason;
                return this;
            }

            /**
             * change_time.
             */
            public Builder changeTime(String changeTime) {
                this.changeTime = changeTime;
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
             * new_arrival_airport.
             */
            public Builder newArrivalAirport(String newArrivalAirport) {
                this.newArrivalAirport = newArrivalAirport;
                return this;
            }

            /**
             * new_arrival_time.
             */
            public Builder newArrivalTime(String newArrivalTime) {
                this.newArrivalTime = newArrivalTime;
                return this;
            }

            /**
             * new_departure_airport.
             */
            public Builder newDepartureAirport(String newDepartureAirport) {
                this.newDepartureAirport = newDepartureAirport;
                return this;
            }

            /**
             * new_departure_time.
             */
            public Builder newDepartureTime(String newDepartureTime) {
                this.newDepartureTime = newDepartureTime;
                return this;
            }

            /**
             * new_flight_no.
             */
            public Builder newFlightNo(String newFlightNo) {
                this.newFlightNo = newFlightNo;
                return this;
            }

            /**
             * old_arrival_airport.
             */
            public Builder oldArrivalAirport(String oldArrivalAirport) {
                this.oldArrivalAirport = oldArrivalAirport;
                return this;
            }

            /**
             * old_arrival_time.
             */
            public Builder oldArrivalTime(String oldArrivalTime) {
                this.oldArrivalTime = oldArrivalTime;
                return this;
            }

            /**
             * old_departure_airport.
             */
            public Builder oldDepartureAirport(String oldDepartureAirport) {
                this.oldDepartureAirport = oldDepartureAirport;
                return this;
            }

            /**
             * old_departure_time.
             */
            public Builder oldDepartureTime(String oldDepartureTime) {
                this.oldDepartureTime = oldDepartureTime;
                return this;
            }

            /**
             * old_flight_no.
             */
            public Builder oldFlightNo(String oldFlightNo) {
                this.oldFlightNo = oldFlightNo;
                return this;
            }

            public FlightChangeDetail build() {
                return new FlightChangeDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link FlightChangeOfOrderResponseBody} extends {@link TeaModel}
     *
     * <p>FlightChangeOfOrderResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("flight_change_detail")
        private FlightChangeDetail flightChangeDetail;

        @com.aliyun.core.annotation.NameInMap("order_num")
        private Long orderNum;

        private Data(Builder builder) {
            this.flightChangeDetail = builder.flightChangeDetail;
            this.orderNum = builder.orderNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return flightChangeDetail
         */
        public FlightChangeDetail getFlightChangeDetail() {
            return this.flightChangeDetail;
        }

        /**
         * @return orderNum
         */
        public Long getOrderNum() {
            return this.orderNum;
        }

        public static final class Builder {
            private FlightChangeDetail flightChangeDetail; 
            private Long orderNum; 

            /**
             * flight_change_detail.
             */
            public Builder flightChangeDetail(FlightChangeDetail flightChangeDetail) {
                this.flightChangeDetail = flightChangeDetail;
                return this;
            }

            /**
             * order_num.
             */
            public Builder orderNum(Long orderNum) {
                this.orderNum = orderNum;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
