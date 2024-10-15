// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link TrainOrderDetailQueryResponseBody} extends {@link TeaModel}
 *
 * <p>TrainOrderDetailQueryResponseBody</p>
 */
public class TrainOrderDetailQueryResponseBody extends TeaModel {
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

    private TrainOrderDetailQueryResponseBody(Builder builder) {
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

    public static TrainOrderDetailQueryResponseBody create() {
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
         * <p>module</p>
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
         * <p>traceId</p>
         * 
         * <strong>example:</strong>
         * <p>2103a05c16872420814992343d8a09</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public TrainOrderDetailQueryResponseBody build() {
            return new TrainOrderDetailQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TrainOrderDetailQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TrainOrderDetailQueryResponseBody</p>
     */
    public static class BookTicketInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("coach_no")
        private String coachNo;

        @com.aliyun.core.annotation.NameInMap("fail_code")
        private String failCode;

        @com.aliyun.core.annotation.NameInMap("fail_reason")
        private String failReason;

        @com.aliyun.core.annotation.NameInMap("passenger_id")
        private String passengerId;

        @com.aliyun.core.annotation.NameInMap("real_ticket_price")
        private Long realTicketPrice;

        @com.aliyun.core.annotation.NameInMap("seat_no")
        private String seatNo;

        @com.aliyun.core.annotation.NameInMap("seat_type")
        private String seatType;

        @com.aliyun.core.annotation.NameInMap("ticket_entrance")
        private String ticketEntrance;

        @com.aliyun.core.annotation.NameInMap("ticket_price")
        private Long ticketPrice;

        @com.aliyun.core.annotation.NameInMap("ticket_status")
        private Integer ticketStatus;

        @com.aliyun.core.annotation.NameInMap("ticket_type")
        private String ticketType;

        private BookTicketInfos(Builder builder) {
            this.coachNo = builder.coachNo;
            this.failCode = builder.failCode;
            this.failReason = builder.failReason;
            this.passengerId = builder.passengerId;
            this.realTicketPrice = builder.realTicketPrice;
            this.seatNo = builder.seatNo;
            this.seatType = builder.seatType;
            this.ticketEntrance = builder.ticketEntrance;
            this.ticketPrice = builder.ticketPrice;
            this.ticketStatus = builder.ticketStatus;
            this.ticketType = builder.ticketType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BookTicketInfos create() {
            return builder().build();
        }

        /**
         * @return coachNo
         */
        public String getCoachNo() {
            return this.coachNo;
        }

        /**
         * @return failCode
         */
        public String getFailCode() {
            return this.failCode;
        }

        /**
         * @return failReason
         */
        public String getFailReason() {
            return this.failReason;
        }

        /**
         * @return passengerId
         */
        public String getPassengerId() {
            return this.passengerId;
        }

        /**
         * @return realTicketPrice
         */
        public Long getRealTicketPrice() {
            return this.realTicketPrice;
        }

        /**
         * @return seatNo
         */
        public String getSeatNo() {
            return this.seatNo;
        }

        /**
         * @return seatType
         */
        public String getSeatType() {
            return this.seatType;
        }

        /**
         * @return ticketEntrance
         */
        public String getTicketEntrance() {
            return this.ticketEntrance;
        }

        /**
         * @return ticketPrice
         */
        public Long getTicketPrice() {
            return this.ticketPrice;
        }

        /**
         * @return ticketStatus
         */
        public Integer getTicketStatus() {
            return this.ticketStatus;
        }

        /**
         * @return ticketType
         */
        public String getTicketType() {
            return this.ticketType;
        }

        public static final class Builder {
            private String coachNo; 
            private String failCode; 
            private String failReason; 
            private String passengerId; 
            private Long realTicketPrice; 
            private String seatNo; 
            private String seatType; 
            private String ticketEntrance; 
            private Long ticketPrice; 
            private Integer ticketStatus; 
            private String ticketType; 

            /**
             * coach_no.
             */
            public Builder coachNo(String coachNo) {
                this.coachNo = coachNo;
                return this;
            }

            /**
             * fail_code.
             */
            public Builder failCode(String failCode) {
                this.failCode = failCode;
                return this;
            }

            /**
             * fail_reason.
             */
            public Builder failReason(String failReason) {
                this.failReason = failReason;
                return this;
            }

            /**
             * passenger_id.
             */
            public Builder passengerId(String passengerId) {
                this.passengerId = passengerId;
                return this;
            }

            /**
             * real_ticket_price.
             */
            public Builder realTicketPrice(Long realTicketPrice) {
                this.realTicketPrice = realTicketPrice;
                return this;
            }

            /**
             * seat_no.
             */
            public Builder seatNo(String seatNo) {
                this.seatNo = seatNo;
                return this;
            }

            /**
             * seat_type.
             */
            public Builder seatType(String seatType) {
                this.seatType = seatType;
                return this;
            }

            /**
             * ticket_entrance.
             */
            public Builder ticketEntrance(String ticketEntrance) {
                this.ticketEntrance = ticketEntrance;
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
             * ticket_status.
             */
            public Builder ticketStatus(Integer ticketStatus) {
                this.ticketStatus = ticketStatus;
                return this;
            }

            /**
             * ticket_type.
             */
            public Builder ticketType(String ticketType) {
                this.ticketType = ticketType;
                return this;
            }

            public BookTicketInfos build() {
                return new BookTicketInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link TrainOrderDetailQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TrainOrderDetailQueryResponseBody</p>
     */
    public static class BookTrainInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arr_station_code")
        private String arrStationCode;

        @com.aliyun.core.annotation.NameInMap("arr_station_name")
        private String arrStationName;

        @com.aliyun.core.annotation.NameInMap("arrive_time")
        private String arriveTime;

        @com.aliyun.core.annotation.NameInMap("book_ticket_infos")
        private java.util.List < BookTicketInfos> bookTicketInfos;

        @com.aliyun.core.annotation.NameInMap("dep_station_code")
        private String depStationCode;

        @com.aliyun.core.annotation.NameInMap("dep_station_name")
        private String depStationName;

        @com.aliyun.core.annotation.NameInMap("dep_time")
        private String depTime;

        @com.aliyun.core.annotation.NameInMap("train_no")
        private String trainNo;

        private BookTrainInfos(Builder builder) {
            this.arrStationCode = builder.arrStationCode;
            this.arrStationName = builder.arrStationName;
            this.arriveTime = builder.arriveTime;
            this.bookTicketInfos = builder.bookTicketInfos;
            this.depStationCode = builder.depStationCode;
            this.depStationName = builder.depStationName;
            this.depTime = builder.depTime;
            this.trainNo = builder.trainNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BookTrainInfos create() {
            return builder().build();
        }

        /**
         * @return arrStationCode
         */
        public String getArrStationCode() {
            return this.arrStationCode;
        }

        /**
         * @return arrStationName
         */
        public String getArrStationName() {
            return this.arrStationName;
        }

        /**
         * @return arriveTime
         */
        public String getArriveTime() {
            return this.arriveTime;
        }

        /**
         * @return bookTicketInfos
         */
        public java.util.List < BookTicketInfos> getBookTicketInfos() {
            return this.bookTicketInfos;
        }

        /**
         * @return depStationCode
         */
        public String getDepStationCode() {
            return this.depStationCode;
        }

        /**
         * @return depStationName
         */
        public String getDepStationName() {
            return this.depStationName;
        }

        /**
         * @return depTime
         */
        public String getDepTime() {
            return this.depTime;
        }

        /**
         * @return trainNo
         */
        public String getTrainNo() {
            return this.trainNo;
        }

        public static final class Builder {
            private String arrStationCode; 
            private String arrStationName; 
            private String arriveTime; 
            private java.util.List < BookTicketInfos> bookTicketInfos; 
            private String depStationCode; 
            private String depStationName; 
            private String depTime; 
            private String trainNo; 

            /**
             * arr_station_code.
             */
            public Builder arrStationCode(String arrStationCode) {
                this.arrStationCode = arrStationCode;
                return this;
            }

            /**
             * arr_station_name.
             */
            public Builder arrStationName(String arrStationName) {
                this.arrStationName = arrStationName;
                return this;
            }

            /**
             * arrive_time.
             */
            public Builder arriveTime(String arriveTime) {
                this.arriveTime = arriveTime;
                return this;
            }

            /**
             * book_ticket_infos.
             */
            public Builder bookTicketInfos(java.util.List < BookTicketInfos> bookTicketInfos) {
                this.bookTicketInfos = bookTicketInfos;
                return this;
            }

            /**
             * dep_station_code.
             */
            public Builder depStationCode(String depStationCode) {
                this.depStationCode = depStationCode;
                return this;
            }

            /**
             * dep_station_name.
             */
            public Builder depStationName(String depStationName) {
                this.depStationName = depStationName;
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
             * train_no.
             */
            public Builder trainNo(String trainNo) {
                this.trainNo = trainNo;
                return this;
            }

            public BookTrainInfos build() {
                return new BookTrainInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link TrainOrderDetailQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TrainOrderDetailQueryResponseBody</p>
     */
    public static class BookInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("book_train_infos")
        private java.util.List < BookTrainInfos> bookTrainInfos;

        @com.aliyun.core.annotation.NameInMap("fail_code")
        private String failCode;

        @com.aliyun.core.annotation.NameInMap("fail_msg")
        private String failMsg;

        @com.aliyun.core.annotation.NameInMap("last_pay_time")
        private String lastPayTime;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("ticket_no")
        private String ticketNo;

        private BookInfos(Builder builder) {
            this.bookTrainInfos = builder.bookTrainInfos;
            this.failCode = builder.failCode;
            this.failMsg = builder.failMsg;
            this.lastPayTime = builder.lastPayTime;
            this.status = builder.status;
            this.ticketNo = builder.ticketNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BookInfos create() {
            return builder().build();
        }

        /**
         * @return bookTrainInfos
         */
        public java.util.List < BookTrainInfos> getBookTrainInfos() {
            return this.bookTrainInfos;
        }

        /**
         * @return failCode
         */
        public String getFailCode() {
            return this.failCode;
        }

        /**
         * @return failMsg
         */
        public String getFailMsg() {
            return this.failMsg;
        }

        /**
         * @return lastPayTime
         */
        public String getLastPayTime() {
            return this.lastPayTime;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return ticketNo
         */
        public String getTicketNo() {
            return this.ticketNo;
        }

        public static final class Builder {
            private java.util.List < BookTrainInfos> bookTrainInfos; 
            private String failCode; 
            private String failMsg; 
            private String lastPayTime; 
            private Integer status; 
            private String ticketNo; 

            /**
             * book_train_infos.
             */
            public Builder bookTrainInfos(java.util.List < BookTrainInfos> bookTrainInfos) {
                this.bookTrainInfos = bookTrainInfos;
                return this;
            }

            /**
             * fail_code.
             */
            public Builder failCode(String failCode) {
                this.failCode = failCode;
                return this;
            }

            /**
             * fail_msg.
             */
            public Builder failMsg(String failMsg) {
                this.failMsg = failMsg;
                return this;
            }

            /**
             * last_pay_time.
             */
            public Builder lastPayTime(String lastPayTime) {
                this.lastPayTime = lastPayTime;
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
             * ticket_no.
             */
            public Builder ticketNo(String ticketNo) {
                this.ticketNo = ticketNo;
                return this;
            }

            public BookInfos build() {
                return new BookInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link TrainOrderDetailQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TrainOrderDetailQueryResponseBody</p>
     */
    public static class ChangeTicketInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("change_cost")
        private Long changeCost;

        @com.aliyun.core.annotation.NameInMap("change_diff")
        private Long changeDiff;

        @com.aliyun.core.annotation.NameInMap("change_gap_handing_fee")
        private Long changeGapHandingFee;

        @com.aliyun.core.annotation.NameInMap("change_min_ticket_amount_handing_fee")
        private Long changeMinTicketAmountHandingFee;

        @com.aliyun.core.annotation.NameInMap("coach_no")
        private String coachNo;

        @com.aliyun.core.annotation.NameInMap("fail_code")
        private String failCode;

        @com.aliyun.core.annotation.NameInMap("fail_reason")
        private String failReason;

        @com.aliyun.core.annotation.NameInMap("passenger_id")
        private String passengerId;

        @com.aliyun.core.annotation.NameInMap("real_ticket_price")
        private Long realTicketPrice;

        @com.aliyun.core.annotation.NameInMap("seat_no")
        private String seatNo;

        @com.aliyun.core.annotation.NameInMap("seat_type")
        private String seatType;

        @com.aliyun.core.annotation.NameInMap("ticket_entrance")
        private String ticketEntrance;

        @com.aliyun.core.annotation.NameInMap("ticket_price")
        private Long ticketPrice;

        @com.aliyun.core.annotation.NameInMap("ticket_status")
        private String ticketStatus;

        private ChangeTicketInfos(Builder builder) {
            this.changeCost = builder.changeCost;
            this.changeDiff = builder.changeDiff;
            this.changeGapHandingFee = builder.changeGapHandingFee;
            this.changeMinTicketAmountHandingFee = builder.changeMinTicketAmountHandingFee;
            this.coachNo = builder.coachNo;
            this.failCode = builder.failCode;
            this.failReason = builder.failReason;
            this.passengerId = builder.passengerId;
            this.realTicketPrice = builder.realTicketPrice;
            this.seatNo = builder.seatNo;
            this.seatType = builder.seatType;
            this.ticketEntrance = builder.ticketEntrance;
            this.ticketPrice = builder.ticketPrice;
            this.ticketStatus = builder.ticketStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangeTicketInfos create() {
            return builder().build();
        }

        /**
         * @return changeCost
         */
        public Long getChangeCost() {
            return this.changeCost;
        }

        /**
         * @return changeDiff
         */
        public Long getChangeDiff() {
            return this.changeDiff;
        }

        /**
         * @return changeGapHandingFee
         */
        public Long getChangeGapHandingFee() {
            return this.changeGapHandingFee;
        }

        /**
         * @return changeMinTicketAmountHandingFee
         */
        public Long getChangeMinTicketAmountHandingFee() {
            return this.changeMinTicketAmountHandingFee;
        }

        /**
         * @return coachNo
         */
        public String getCoachNo() {
            return this.coachNo;
        }

        /**
         * @return failCode
         */
        public String getFailCode() {
            return this.failCode;
        }

        /**
         * @return failReason
         */
        public String getFailReason() {
            return this.failReason;
        }

        /**
         * @return passengerId
         */
        public String getPassengerId() {
            return this.passengerId;
        }

        /**
         * @return realTicketPrice
         */
        public Long getRealTicketPrice() {
            return this.realTicketPrice;
        }

        /**
         * @return seatNo
         */
        public String getSeatNo() {
            return this.seatNo;
        }

        /**
         * @return seatType
         */
        public String getSeatType() {
            return this.seatType;
        }

        /**
         * @return ticketEntrance
         */
        public String getTicketEntrance() {
            return this.ticketEntrance;
        }

        /**
         * @return ticketPrice
         */
        public Long getTicketPrice() {
            return this.ticketPrice;
        }

        /**
         * @return ticketStatus
         */
        public String getTicketStatus() {
            return this.ticketStatus;
        }

        public static final class Builder {
            private Long changeCost; 
            private Long changeDiff; 
            private Long changeGapHandingFee; 
            private Long changeMinTicketAmountHandingFee; 
            private String coachNo; 
            private String failCode; 
            private String failReason; 
            private String passengerId; 
            private Long realTicketPrice; 
            private String seatNo; 
            private String seatType; 
            private String ticketEntrance; 
            private Long ticketPrice; 
            private String ticketStatus; 

            /**
             * change_cost.
             */
            public Builder changeCost(Long changeCost) {
                this.changeCost = changeCost;
                return this;
            }

            /**
             * change_diff.
             */
            public Builder changeDiff(Long changeDiff) {
                this.changeDiff = changeDiff;
                return this;
            }

            /**
             * change_gap_handing_fee.
             */
            public Builder changeGapHandingFee(Long changeGapHandingFee) {
                this.changeGapHandingFee = changeGapHandingFee;
                return this;
            }

            /**
             * change_min_ticket_amount_handing_fee.
             */
            public Builder changeMinTicketAmountHandingFee(Long changeMinTicketAmountHandingFee) {
                this.changeMinTicketAmountHandingFee = changeMinTicketAmountHandingFee;
                return this;
            }

            /**
             * coach_no.
             */
            public Builder coachNo(String coachNo) {
                this.coachNo = coachNo;
                return this;
            }

            /**
             * fail_code.
             */
            public Builder failCode(String failCode) {
                this.failCode = failCode;
                return this;
            }

            /**
             * fail_reason.
             */
            public Builder failReason(String failReason) {
                this.failReason = failReason;
                return this;
            }

            /**
             * passenger_id.
             */
            public Builder passengerId(String passengerId) {
                this.passengerId = passengerId;
                return this;
            }

            /**
             * real_ticket_price.
             */
            public Builder realTicketPrice(Long realTicketPrice) {
                this.realTicketPrice = realTicketPrice;
                return this;
            }

            /**
             * seat_no.
             */
            public Builder seatNo(String seatNo) {
                this.seatNo = seatNo;
                return this;
            }

            /**
             * seat_type.
             */
            public Builder seatType(String seatType) {
                this.seatType = seatType;
                return this;
            }

            /**
             * ticket_entrance.
             */
            public Builder ticketEntrance(String ticketEntrance) {
                this.ticketEntrance = ticketEntrance;
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
             * ticket_status.
             */
            public Builder ticketStatus(String ticketStatus) {
                this.ticketStatus = ticketStatus;
                return this;
            }

            public ChangeTicketInfos build() {
                return new ChangeTicketInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link TrainOrderDetailQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TrainOrderDetailQueryResponseBody</p>
     */
    public static class ChangeTrainInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arr_station_code")
        private String arrStationCode;

        @com.aliyun.core.annotation.NameInMap("arr_station_name")
        private String arrStationName;

        @com.aliyun.core.annotation.NameInMap("arrive_time")
        private String arriveTime;

        @com.aliyun.core.annotation.NameInMap("change_ticket_infos")
        private java.util.List < ChangeTicketInfos> changeTicketInfos;

        @com.aliyun.core.annotation.NameInMap("dep_station_code")
        private String depStationCode;

        @com.aliyun.core.annotation.NameInMap("dep_station_name")
        private String depStationName;

        @com.aliyun.core.annotation.NameInMap("dep_time")
        private String depTime;

        @com.aliyun.core.annotation.NameInMap("train_no")
        private String trainNo;

        private ChangeTrainInfos(Builder builder) {
            this.arrStationCode = builder.arrStationCode;
            this.arrStationName = builder.arrStationName;
            this.arriveTime = builder.arriveTime;
            this.changeTicketInfos = builder.changeTicketInfos;
            this.depStationCode = builder.depStationCode;
            this.depStationName = builder.depStationName;
            this.depTime = builder.depTime;
            this.trainNo = builder.trainNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangeTrainInfos create() {
            return builder().build();
        }

        /**
         * @return arrStationCode
         */
        public String getArrStationCode() {
            return this.arrStationCode;
        }

        /**
         * @return arrStationName
         */
        public String getArrStationName() {
            return this.arrStationName;
        }

        /**
         * @return arriveTime
         */
        public String getArriveTime() {
            return this.arriveTime;
        }

        /**
         * @return changeTicketInfos
         */
        public java.util.List < ChangeTicketInfos> getChangeTicketInfos() {
            return this.changeTicketInfos;
        }

        /**
         * @return depStationCode
         */
        public String getDepStationCode() {
            return this.depStationCode;
        }

        /**
         * @return depStationName
         */
        public String getDepStationName() {
            return this.depStationName;
        }

        /**
         * @return depTime
         */
        public String getDepTime() {
            return this.depTime;
        }

        /**
         * @return trainNo
         */
        public String getTrainNo() {
            return this.trainNo;
        }

        public static final class Builder {
            private String arrStationCode; 
            private String arrStationName; 
            private String arriveTime; 
            private java.util.List < ChangeTicketInfos> changeTicketInfos; 
            private String depStationCode; 
            private String depStationName; 
            private String depTime; 
            private String trainNo; 

            /**
             * arr_station_code.
             */
            public Builder arrStationCode(String arrStationCode) {
                this.arrStationCode = arrStationCode;
                return this;
            }

            /**
             * arr_station_name.
             */
            public Builder arrStationName(String arrStationName) {
                this.arrStationName = arrStationName;
                return this;
            }

            /**
             * arrive_time.
             */
            public Builder arriveTime(String arriveTime) {
                this.arriveTime = arriveTime;
                return this;
            }

            /**
             * change_ticket_infos.
             */
            public Builder changeTicketInfos(java.util.List < ChangeTicketInfos> changeTicketInfos) {
                this.changeTicketInfos = changeTicketInfos;
                return this;
            }

            /**
             * dep_station_code.
             */
            public Builder depStationCode(String depStationCode) {
                this.depStationCode = depStationCode;
                return this;
            }

            /**
             * dep_station_name.
             */
            public Builder depStationName(String depStationName) {
                this.depStationName = depStationName;
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
             * train_no.
             */
            public Builder trainNo(String trainNo) {
                this.trainNo = trainNo;
                return this;
            }

            public ChangeTrainInfos build() {
                return new ChangeTrainInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link TrainOrderDetailQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TrainOrderDetailQueryResponseBody</p>
     */
    public static class ChangeInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("change_apply_id")
        private String changeApplyId;

        @com.aliyun.core.annotation.NameInMap("change_train_infos")
        private java.util.List < ChangeTrainInfos> changeTrainInfos;

        @com.aliyun.core.annotation.NameInMap("limit_pay_time")
        private String limitPayTime;

        @com.aliyun.core.annotation.NameInMap("out_change_apply_id")
        private String outChangeApplyId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private ChangeInfos(Builder builder) {
            this.changeApplyId = builder.changeApplyId;
            this.changeTrainInfos = builder.changeTrainInfos;
            this.limitPayTime = builder.limitPayTime;
            this.outChangeApplyId = builder.outChangeApplyId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangeInfos create() {
            return builder().build();
        }

        /**
         * @return changeApplyId
         */
        public String getChangeApplyId() {
            return this.changeApplyId;
        }

        /**
         * @return changeTrainInfos
         */
        public java.util.List < ChangeTrainInfos> getChangeTrainInfos() {
            return this.changeTrainInfos;
        }

        /**
         * @return limitPayTime
         */
        public String getLimitPayTime() {
            return this.limitPayTime;
        }

        /**
         * @return outChangeApplyId
         */
        public String getOutChangeApplyId() {
            return this.outChangeApplyId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String changeApplyId; 
            private java.util.List < ChangeTrainInfos> changeTrainInfos; 
            private String limitPayTime; 
            private String outChangeApplyId; 
            private String status; 

            /**
             * change_apply_id.
             */
            public Builder changeApplyId(String changeApplyId) {
                this.changeApplyId = changeApplyId;
                return this;
            }

            /**
             * change_train_infos.
             */
            public Builder changeTrainInfos(java.util.List < ChangeTrainInfos> changeTrainInfos) {
                this.changeTrainInfos = changeTrainInfos;
                return this;
            }

            /**
             * limit_pay_time.
             */
            public Builder limitPayTime(String limitPayTime) {
                this.limitPayTime = limitPayTime;
                return this;
            }

            /**
             * out_change_apply_id.
             */
            public Builder outChangeApplyId(String outChangeApplyId) {
                this.outChangeApplyId = outChangeApplyId;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ChangeInfos build() {
                return new ChangeInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link TrainOrderDetailQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TrainOrderDetailQueryResponseBody</p>
     */
    public static class OfflineRefundInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("passenger_id")
        private String passengerId;

        @com.aliyun.core.annotation.NameInMap("refund_price")
        private Long refundPrice;

        private OfflineRefundInfos(Builder builder) {
            this.passengerId = builder.passengerId;
            this.refundPrice = builder.refundPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OfflineRefundInfos create() {
            return builder().build();
        }

        /**
         * @return passengerId
         */
        public String getPassengerId() {
            return this.passengerId;
        }

        /**
         * @return refundPrice
         */
        public Long getRefundPrice() {
            return this.refundPrice;
        }

        public static final class Builder {
            private String passengerId; 
            private Long refundPrice; 

            /**
             * passenger_id.
             */
            public Builder passengerId(String passengerId) {
                this.passengerId = passengerId;
                return this;
            }

            /**
             * refund_price.
             */
            public Builder refundPrice(Long refundPrice) {
                this.refundPrice = refundPrice;
                return this;
            }

            public OfflineRefundInfos build() {
                return new OfflineRefundInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link TrainOrderDetailQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TrainOrderDetailQueryResponseBody</p>
     */
    public static class OfflineRefundDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("offline_refund_id")
        private String offlineRefundId;

        @com.aliyun.core.annotation.NameInMap("offline_refund_infos")
        private java.util.List < OfflineRefundInfos> offlineRefundInfos;

        @com.aliyun.core.annotation.NameInMap("offline_refund_type")
        private String offlineRefundType;

        @com.aliyun.core.annotation.NameInMap("refund_total_price")
        private Long refundTotalPrice;

        private OfflineRefundDetails(Builder builder) {
            this.offlineRefundId = builder.offlineRefundId;
            this.offlineRefundInfos = builder.offlineRefundInfos;
            this.offlineRefundType = builder.offlineRefundType;
            this.refundTotalPrice = builder.refundTotalPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OfflineRefundDetails create() {
            return builder().build();
        }

        /**
         * @return offlineRefundId
         */
        public String getOfflineRefundId() {
            return this.offlineRefundId;
        }

        /**
         * @return offlineRefundInfos
         */
        public java.util.List < OfflineRefundInfos> getOfflineRefundInfos() {
            return this.offlineRefundInfos;
        }

        /**
         * @return offlineRefundType
         */
        public String getOfflineRefundType() {
            return this.offlineRefundType;
        }

        /**
         * @return refundTotalPrice
         */
        public Long getRefundTotalPrice() {
            return this.refundTotalPrice;
        }

        public static final class Builder {
            private String offlineRefundId; 
            private java.util.List < OfflineRefundInfos> offlineRefundInfos; 
            private String offlineRefundType; 
            private Long refundTotalPrice; 

            /**
             * offline_refund_id.
             */
            public Builder offlineRefundId(String offlineRefundId) {
                this.offlineRefundId = offlineRefundId;
                return this;
            }

            /**
             * offline_refund_infos.
             */
            public Builder offlineRefundInfos(java.util.List < OfflineRefundInfos> offlineRefundInfos) {
                this.offlineRefundInfos = offlineRefundInfos;
                return this;
            }

            /**
             * offline_refund_type.
             */
            public Builder offlineRefundType(String offlineRefundType) {
                this.offlineRefundType = offlineRefundType;
                return this;
            }

            /**
             * refund_total_price.
             */
            public Builder refundTotalPrice(Long refundTotalPrice) {
                this.refundTotalPrice = refundTotalPrice;
                return this;
            }

            public OfflineRefundDetails build() {
                return new OfflineRefundDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link TrainOrderDetailQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TrainOrderDetailQueryResponseBody</p>
     */
    public static class CostCenterInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cascade_dept_name")
        private String cascadeDeptName;

        @com.aliyun.core.annotation.NameInMap("cost_center_id")
        private String costCenterId;

        @com.aliyun.core.annotation.NameInMap("cost_center_name")
        private String costCenterName;

        @com.aliyun.core.annotation.NameInMap("cost_center_no")
        private String costCenterNo;

        @com.aliyun.core.annotation.NameInMap("depart_id")
        private String departId;

        @com.aliyun.core.annotation.NameInMap("depart_name")
        private String departName;

        @com.aliyun.core.annotation.NameInMap("invoice_id")
        private String invoiceId;

        @com.aliyun.core.annotation.NameInMap("invoice_title")
        private String invoiceTitle;

        @com.aliyun.core.annotation.NameInMap("passenger_id")
        private String passengerId;

        @com.aliyun.core.annotation.NameInMap("project_code")
        private String projectCode;

        @com.aliyun.core.annotation.NameInMap("project_title")
        private String projectTitle;

        private CostCenterInfo(Builder builder) {
            this.cascadeDeptName = builder.cascadeDeptName;
            this.costCenterId = builder.costCenterId;
            this.costCenterName = builder.costCenterName;
            this.costCenterNo = builder.costCenterNo;
            this.departId = builder.departId;
            this.departName = builder.departName;
            this.invoiceId = builder.invoiceId;
            this.invoiceTitle = builder.invoiceTitle;
            this.passengerId = builder.passengerId;
            this.projectCode = builder.projectCode;
            this.projectTitle = builder.projectTitle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CostCenterInfo create() {
            return builder().build();
        }

        /**
         * @return cascadeDeptName
         */
        public String getCascadeDeptName() {
            return this.cascadeDeptName;
        }

        /**
         * @return costCenterId
         */
        public String getCostCenterId() {
            return this.costCenterId;
        }

        /**
         * @return costCenterName
         */
        public String getCostCenterName() {
            return this.costCenterName;
        }

        /**
         * @return costCenterNo
         */
        public String getCostCenterNo() {
            return this.costCenterNo;
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
         * @return passengerId
         */
        public String getPassengerId() {
            return this.passengerId;
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

        public static final class Builder {
            private String cascadeDeptName; 
            private String costCenterId; 
            private String costCenterName; 
            private String costCenterNo; 
            private String departId; 
            private String departName; 
            private String invoiceId; 
            private String invoiceTitle; 
            private String passengerId; 
            private String projectCode; 
            private String projectTitle; 

            /**
             * cascade_dept_name.
             */
            public Builder cascadeDeptName(String cascadeDeptName) {
                this.cascadeDeptName = cascadeDeptName;
                return this;
            }

            /**
             * cost_center_id.
             */
            public Builder costCenterId(String costCenterId) {
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
             * cost_center_no.
             */
            public Builder costCenterNo(String costCenterNo) {
                this.costCenterNo = costCenterNo;
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
             * passenger_id.
             */
            public Builder passengerId(String passengerId) {
                this.passengerId = passengerId;
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

            public CostCenterInfo build() {
                return new CostCenterInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link TrainOrderDetailQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TrainOrderDetailQueryResponseBody</p>
     */
    public static class PassengerInfoS extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cost_center_info")
        private CostCenterInfo costCenterInfo;

        @com.aliyun.core.annotation.NameInMap("country_code")
        private String countryCode;

        @com.aliyun.core.annotation.NameInMap("passenger_cert_no")
        private String passengerCertNo;

        @com.aliyun.core.annotation.NameInMap("passenger_cert_type")
        private String passengerCertType;

        @com.aliyun.core.annotation.NameInMap("passenger_id")
        private String passengerId;

        @com.aliyun.core.annotation.NameInMap("passenger_mobile")
        private String passengerMobile;

        @com.aliyun.core.annotation.NameInMap("passenger_name")
        private String passengerName;

        @com.aliyun.core.annotation.NameInMap("valid_date_end")
        private String validDateEnd;

        private PassengerInfoS(Builder builder) {
            this.costCenterInfo = builder.costCenterInfo;
            this.countryCode = builder.countryCode;
            this.passengerCertNo = builder.passengerCertNo;
            this.passengerCertType = builder.passengerCertType;
            this.passengerId = builder.passengerId;
            this.passengerMobile = builder.passengerMobile;
            this.passengerName = builder.passengerName;
            this.validDateEnd = builder.validDateEnd;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PassengerInfoS create() {
            return builder().build();
        }

        /**
         * @return costCenterInfo
         */
        public CostCenterInfo getCostCenterInfo() {
            return this.costCenterInfo;
        }

        /**
         * @return countryCode
         */
        public String getCountryCode() {
            return this.countryCode;
        }

        /**
         * @return passengerCertNo
         */
        public String getPassengerCertNo() {
            return this.passengerCertNo;
        }

        /**
         * @return passengerCertType
         */
        public String getPassengerCertType() {
            return this.passengerCertType;
        }

        /**
         * @return passengerId
         */
        public String getPassengerId() {
            return this.passengerId;
        }

        /**
         * @return passengerMobile
         */
        public String getPassengerMobile() {
            return this.passengerMobile;
        }

        /**
         * @return passengerName
         */
        public String getPassengerName() {
            return this.passengerName;
        }

        /**
         * @return validDateEnd
         */
        public String getValidDateEnd() {
            return this.validDateEnd;
        }

        public static final class Builder {
            private CostCenterInfo costCenterInfo; 
            private String countryCode; 
            private String passengerCertNo; 
            private String passengerCertType; 
            private String passengerId; 
            private String passengerMobile; 
            private String passengerName; 
            private String validDateEnd; 

            /**
             * cost_center_info.
             */
            public Builder costCenterInfo(CostCenterInfo costCenterInfo) {
                this.costCenterInfo = costCenterInfo;
                return this;
            }

            /**
             * country_code.
             */
            public Builder countryCode(String countryCode) {
                this.countryCode = countryCode;
                return this;
            }

            /**
             * passenger_cert_no.
             */
            public Builder passengerCertNo(String passengerCertNo) {
                this.passengerCertNo = passengerCertNo;
                return this;
            }

            /**
             * passenger_cert_type.
             */
            public Builder passengerCertType(String passengerCertType) {
                this.passengerCertType = passengerCertType;
                return this;
            }

            /**
             * passenger_id.
             */
            public Builder passengerId(String passengerId) {
                this.passengerId = passengerId;
                return this;
            }

            /**
             * passenger_mobile.
             */
            public Builder passengerMobile(String passengerMobile) {
                this.passengerMobile = passengerMobile;
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
             * valid_date_end.
             */
            public Builder validDateEnd(String validDateEnd) {
                this.validDateEnd = validDateEnd;
                return this;
            }

            public PassengerInfoS build() {
                return new PassengerInfoS(this);
            } 

        } 

    }
    /**
     * 
     * {@link TrainOrderDetailQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TrainOrderDetailQueryResponseBody</p>
     */
    public static class RefundTicketInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("passenger_id")
        private String passengerId;

        @com.aliyun.core.annotation.NameInMap("refund_cost")
        private Long refundCost;

        @com.aliyun.core.annotation.NameInMap("refund_price")
        private Long refundPrice;

        @com.aliyun.core.annotation.NameInMap("ticket_price")
        private Long ticketPrice;

        private RefundTicketInfos(Builder builder) {
            this.passengerId = builder.passengerId;
            this.refundCost = builder.refundCost;
            this.refundPrice = builder.refundPrice;
            this.ticketPrice = builder.ticketPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundTicketInfos create() {
            return builder().build();
        }

        /**
         * @return passengerId
         */
        public String getPassengerId() {
            return this.passengerId;
        }

        /**
         * @return refundCost
         */
        public Long getRefundCost() {
            return this.refundCost;
        }

        /**
         * @return refundPrice
         */
        public Long getRefundPrice() {
            return this.refundPrice;
        }

        /**
         * @return ticketPrice
         */
        public Long getTicketPrice() {
            return this.ticketPrice;
        }

        public static final class Builder {
            private String passengerId; 
            private Long refundCost; 
            private Long refundPrice; 
            private Long ticketPrice; 

            /**
             * passenger_id.
             */
            public Builder passengerId(String passengerId) {
                this.passengerId = passengerId;
                return this;
            }

            /**
             * refund_cost.
             */
            public Builder refundCost(Long refundCost) {
                this.refundCost = refundCost;
                return this;
            }

            /**
             * refund_price.
             */
            public Builder refundPrice(Long refundPrice) {
                this.refundPrice = refundPrice;
                return this;
            }

            /**
             * ticket_price.
             */
            public Builder ticketPrice(Long ticketPrice) {
                this.ticketPrice = ticketPrice;
                return this;
            }

            public RefundTicketInfos build() {
                return new RefundTicketInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link TrainOrderDetailQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TrainOrderDetailQueryResponseBody</p>
     */
    public static class RefundTrainInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arr_station_name")
        private String arrStationName;

        @com.aliyun.core.annotation.NameInMap("arr_time")
        private String arrTime;

        @com.aliyun.core.annotation.NameInMap("dep_station_code")
        private String depStationCode;

        @com.aliyun.core.annotation.NameInMap("dep_station_name")
        private String depStationName;

        @com.aliyun.core.annotation.NameInMap("dep_time")
        private String depTime;

        @com.aliyun.core.annotation.NameInMap("refund_ticket_infos")
        private java.util.List < RefundTicketInfos> refundTicketInfos;

        @com.aliyun.core.annotation.NameInMap("train_no")
        private String trainNo;

        private RefundTrainInfo(Builder builder) {
            this.arrStationName = builder.arrStationName;
            this.arrTime = builder.arrTime;
            this.depStationCode = builder.depStationCode;
            this.depStationName = builder.depStationName;
            this.depTime = builder.depTime;
            this.refundTicketInfos = builder.refundTicketInfos;
            this.trainNo = builder.trainNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundTrainInfo create() {
            return builder().build();
        }

        /**
         * @return arrStationName
         */
        public String getArrStationName() {
            return this.arrStationName;
        }

        /**
         * @return arrTime
         */
        public String getArrTime() {
            return this.arrTime;
        }

        /**
         * @return depStationCode
         */
        public String getDepStationCode() {
            return this.depStationCode;
        }

        /**
         * @return depStationName
         */
        public String getDepStationName() {
            return this.depStationName;
        }

        /**
         * @return depTime
         */
        public String getDepTime() {
            return this.depTime;
        }

        /**
         * @return refundTicketInfos
         */
        public java.util.List < RefundTicketInfos> getRefundTicketInfos() {
            return this.refundTicketInfos;
        }

        /**
         * @return trainNo
         */
        public String getTrainNo() {
            return this.trainNo;
        }

        public static final class Builder {
            private String arrStationName; 
            private String arrTime; 
            private String depStationCode; 
            private String depStationName; 
            private String depTime; 
            private java.util.List < RefundTicketInfos> refundTicketInfos; 
            private String trainNo; 

            /**
             * arr_station_name.
             */
            public Builder arrStationName(String arrStationName) {
                this.arrStationName = arrStationName;
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
             * dep_station_code.
             */
            public Builder depStationCode(String depStationCode) {
                this.depStationCode = depStationCode;
                return this;
            }

            /**
             * dep_station_name.
             */
            public Builder depStationName(String depStationName) {
                this.depStationName = depStationName;
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
             * refund_ticket_infos.
             */
            public Builder refundTicketInfos(java.util.List < RefundTicketInfos> refundTicketInfos) {
                this.refundTicketInfos = refundTicketInfos;
                return this;
            }

            /**
             * train_no.
             */
            public Builder trainNo(String trainNo) {
                this.trainNo = trainNo;
                return this;
            }

            public RefundTrainInfo build() {
                return new RefundTrainInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link TrainOrderDetailQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TrainOrderDetailQueryResponseBody</p>
     */
    public static class RefundInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fail_code")
        private String failCode;

        @com.aliyun.core.annotation.NameInMap("fail_msg")
        private String failMsg;

        @com.aliyun.core.annotation.NameInMap("out_refund_id")
        private String outRefundId;

        @com.aliyun.core.annotation.NameInMap("refund_id")
        private String refundId;

        @com.aliyun.core.annotation.NameInMap("refund_train_info")
        private java.util.List < RefundTrainInfo> refundTrainInfo;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private RefundInfos(Builder builder) {
            this.failCode = builder.failCode;
            this.failMsg = builder.failMsg;
            this.outRefundId = builder.outRefundId;
            this.refundId = builder.refundId;
            this.refundTrainInfo = builder.refundTrainInfo;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundInfos create() {
            return builder().build();
        }

        /**
         * @return failCode
         */
        public String getFailCode() {
            return this.failCode;
        }

        /**
         * @return failMsg
         */
        public String getFailMsg() {
            return this.failMsg;
        }

        /**
         * @return outRefundId
         */
        public String getOutRefundId() {
            return this.outRefundId;
        }

        /**
         * @return refundId
         */
        public String getRefundId() {
            return this.refundId;
        }

        /**
         * @return refundTrainInfo
         */
        public java.util.List < RefundTrainInfo> getRefundTrainInfo() {
            return this.refundTrainInfo;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String failCode; 
            private String failMsg; 
            private String outRefundId; 
            private String refundId; 
            private java.util.List < RefundTrainInfo> refundTrainInfo; 
            private String status; 

            /**
             * fail_code.
             */
            public Builder failCode(String failCode) {
                this.failCode = failCode;
                return this;
            }

            /**
             * fail_msg.
             */
            public Builder failMsg(String failMsg) {
                this.failMsg = failMsg;
                return this;
            }

            /**
             * out_refund_id.
             */
            public Builder outRefundId(String outRefundId) {
                this.outRefundId = outRefundId;
                return this;
            }

            /**
             * <p>String</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder refundId(String refundId) {
                this.refundId = refundId;
                return this;
            }

            /**
             * refund_train_info.
             */
            public Builder refundTrainInfo(java.util.List < RefundTrainInfo> refundTrainInfo) {
                this.refundTrainInfo = refundTrainInfo;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public RefundInfos build() {
                return new RefundInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link TrainOrderDetailQueryResponseBody} extends {@link TeaModel}
     *
     * <p>TrainOrderDetailQueryResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("book_infos")
        private BookInfos bookInfos;

        @com.aliyun.core.annotation.NameInMap("change_infos")
        private java.util.List < ChangeInfos> changeInfos;

        @com.aliyun.core.annotation.NameInMap("offlineRefundDetails")
        private java.util.List < OfflineRefundDetails> offlineRefundDetails;

        @com.aliyun.core.annotation.NameInMap("order_id")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("out_order_id")
        private String outOrderId;

        @com.aliyun.core.annotation.NameInMap("passenger_info_s")
        private java.util.List < PassengerInfoS> passengerInfoS;

        @com.aliyun.core.annotation.NameInMap("refund_infos")
        private java.util.List < RefundInfos> refundInfos;

        private Module(Builder builder) {
            this.bookInfos = builder.bookInfos;
            this.changeInfos = builder.changeInfos;
            this.offlineRefundDetails = builder.offlineRefundDetails;
            this.orderId = builder.orderId;
            this.outOrderId = builder.outOrderId;
            this.passengerInfoS = builder.passengerInfoS;
            this.refundInfos = builder.refundInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return bookInfos
         */
        public BookInfos getBookInfos() {
            return this.bookInfos;
        }

        /**
         * @return changeInfos
         */
        public java.util.List < ChangeInfos> getChangeInfos() {
            return this.changeInfos;
        }

        /**
         * @return offlineRefundDetails
         */
        public java.util.List < OfflineRefundDetails> getOfflineRefundDetails() {
            return this.offlineRefundDetails;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return outOrderId
         */
        public String getOutOrderId() {
            return this.outOrderId;
        }

        /**
         * @return passengerInfoS
         */
        public java.util.List < PassengerInfoS> getPassengerInfoS() {
            return this.passengerInfoS;
        }

        /**
         * @return refundInfos
         */
        public java.util.List < RefundInfos> getRefundInfos() {
            return this.refundInfos;
        }

        public static final class Builder {
            private BookInfos bookInfos; 
            private java.util.List < ChangeInfos> changeInfos; 
            private java.util.List < OfflineRefundDetails> offlineRefundDetails; 
            private String orderId; 
            private String outOrderId; 
            private java.util.List < PassengerInfoS> passengerInfoS; 
            private java.util.List < RefundInfos> refundInfos; 

            /**
             * book_infos.
             */
            public Builder bookInfos(BookInfos bookInfos) {
                this.bookInfos = bookInfos;
                return this;
            }

            /**
             * change_infos.
             */
            public Builder changeInfos(java.util.List < ChangeInfos> changeInfos) {
                this.changeInfos = changeInfos;
                return this;
            }

            /**
             * offlineRefundDetails.
             */
            public Builder offlineRefundDetails(java.util.List < OfflineRefundDetails> offlineRefundDetails) {
                this.offlineRefundDetails = offlineRefundDetails;
                return this;
            }

            /**
             * order_id.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
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
             * passenger_info_s.
             */
            public Builder passengerInfoS(java.util.List < PassengerInfoS> passengerInfoS) {
                this.passengerInfoS = passengerInfoS;
                return this;
            }

            /**
             * refund_infos.
             */
            public Builder refundInfos(java.util.List < RefundInfos> refundInfos) {
                this.refundInfos = refundInfos;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
