// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link TrainApplyChangeRequest} extends {@link RequestModel}
 *
 * <p>TrainApplyChangeRequest</p>
 */
public class TrainApplyChangeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("accept_no_seat")
    private String acceptNoSeat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("change_train_info_s")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < ChangeTrainInfoS> changeTrainInfoS;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("force_match")
    private String forceMatch;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("is_pay_now")
    private Boolean isPayNow;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("out_change_apply_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outChangeApplyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("out_order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outOrderId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private TrainApplyChangeRequest(Builder builder) {
        super(builder);
        this.acceptNoSeat = builder.acceptNoSeat;
        this.changeTrainInfoS = builder.changeTrainInfoS;
        this.forceMatch = builder.forceMatch;
        this.isPayNow = builder.isPayNow;
        this.orderId = builder.orderId;
        this.outChangeApplyId = builder.outChangeApplyId;
        this.outOrderId = builder.outOrderId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TrainApplyChangeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptNoSeat
     */
    public String getAcceptNoSeat() {
        return this.acceptNoSeat;
    }

    /**
     * @return changeTrainInfoS
     */
    public java.util.List < ChangeTrainInfoS> getChangeTrainInfoS() {
        return this.changeTrainInfoS;
    }

    /**
     * @return forceMatch
     */
    public String getForceMatch() {
        return this.forceMatch;
    }

    /**
     * @return isPayNow
     */
    public Boolean getIsPayNow() {
        return this.isPayNow;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return outChangeApplyId
     */
    public String getOutChangeApplyId() {
        return this.outChangeApplyId;
    }

    /**
     * @return outOrderId
     */
    public String getOutOrderId() {
        return this.outOrderId;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<TrainApplyChangeRequest, Builder> {
        private String acceptNoSeat; 
        private java.util.List < ChangeTrainInfoS> changeTrainInfoS; 
        private String forceMatch; 
        private Boolean isPayNow; 
        private String orderId; 
        private String outChangeApplyId; 
        private String outOrderId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(TrainApplyChangeRequest request) {
            super(request);
            this.acceptNoSeat = request.acceptNoSeat;
            this.changeTrainInfoS = request.changeTrainInfoS;
            this.forceMatch = request.forceMatch;
            this.isPayNow = request.isPayNow;
            this.orderId = request.orderId;
            this.outChangeApplyId = request.outChangeApplyId;
            this.outOrderId = request.outOrderId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * accept_no_seat.
         */
        public Builder acceptNoSeat(String acceptNoSeat) {
            this.putBodyParameter("accept_no_seat", acceptNoSeat);
            this.acceptNoSeat = acceptNoSeat;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder changeTrainInfoS(java.util.List < ChangeTrainInfoS> changeTrainInfoS) {
            String changeTrainInfoSShrink = shrink(changeTrainInfoS, "change_train_info_s", "json");
            this.putQueryParameter("change_train_info_s", changeTrainInfoSShrink);
            this.changeTrainInfoS = changeTrainInfoS;
            return this;
        }

        /**
         * force_match.
         */
        public Builder forceMatch(String forceMatch) {
            this.putBodyParameter("force_match", forceMatch);
            this.forceMatch = forceMatch;
            return this;
        }

        /**
         * is_pay_now.
         */
        public Builder isPayNow(Boolean isPayNow) {
            this.putBodyParameter("is_pay_now", isPayNow);
            this.isPayNow = isPayNow;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1017028198411054446</p>
         */
        public Builder orderId(String orderId) {
            this.putBodyParameter("order_id", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder outChangeApplyId(String outChangeApplyId) {
            this.putBodyParameter("out_change_apply_id", outChangeApplyId);
            this.outChangeApplyId = outChangeApplyId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder outOrderId(String outOrderId) {
            this.putBodyParameter("out_order_id", outOrderId);
            this.outOrderId = outOrderId;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public TrainApplyChangeRequest build() {
            return new TrainApplyChangeRequest(this);
        } 

    } 

    /**
     * 
     * {@link TrainApplyChangeRequest} extends {@link TeaModel}
     *
     * <p>TrainApplyChangeRequest</p>
     */
    public static class PassengerInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("passenger_cert_no")
        @com.aliyun.core.annotation.Validation(required = true)
        private String passengerCertNo;

        @com.aliyun.core.annotation.NameInMap("passenger_cert_type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String passengerCertType;

        @com.aliyun.core.annotation.NameInMap("passenger_id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String passengerId;

        @com.aliyun.core.annotation.NameInMap("passenger_name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String passengerName;

        private PassengerInfo(Builder builder) {
            this.passengerCertNo = builder.passengerCertNo;
            this.passengerCertType = builder.passengerCertType;
            this.passengerId = builder.passengerId;
            this.passengerName = builder.passengerName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PassengerInfo create() {
            return builder().build();
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
         * @return passengerName
         */
        public String getPassengerName() {
            return this.passengerName;
        }

        public static final class Builder {
            private String passengerCertNo; 
            private String passengerCertType; 
            private String passengerId; 
            private String passengerName; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>291487e553c5abde3b611aae283e2526f0d733ab55094aadc0b5ba587222a233c</p>
             */
            public Builder passengerCertNo(String passengerCertNo) {
                this.passengerCertNo = passengerCertNo;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>170d9ac6f8807f9ec603c688f45f78a41</p>
             */
            public Builder passengerCertType(String passengerCertType) {
                this.passengerCertType = passengerCertType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder passengerId(String passengerId) {
                this.passengerId = passengerId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>949c9f34f677a0e5d249dfc94f5e62cc7</p>
             */
            public Builder passengerName(String passengerName) {
                this.passengerName = passengerName;
                return this;
            }

            public PassengerInfo build() {
                return new PassengerInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link TrainApplyChangeRequest} extends {@link TeaModel}
     *
     * <p>TrainApplyChangeRequest</p>
     */
    public static class ChangeTicketInfoS extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("passenger_info")
        @com.aliyun.core.annotation.Validation(required = true)
        private PassengerInfo passengerInfo;

        @com.aliyun.core.annotation.NameInMap("seat_type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String seatType;

        @com.aliyun.core.annotation.NameInMap("ticket_price")
        @com.aliyun.core.annotation.Validation(required = true)
        private String ticketPrice;

        @com.aliyun.core.annotation.NameInMap("ticket_type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String ticketType;

        private ChangeTicketInfoS(Builder builder) {
            this.passengerInfo = builder.passengerInfo;
            this.seatType = builder.seatType;
            this.ticketPrice = builder.ticketPrice;
            this.ticketType = builder.ticketType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangeTicketInfoS create() {
            return builder().build();
        }

        /**
         * @return passengerInfo
         */
        public PassengerInfo getPassengerInfo() {
            return this.passengerInfo;
        }

        /**
         * @return seatType
         */
        public String getSeatType() {
            return this.seatType;
        }

        /**
         * @return ticketPrice
         */
        public String getTicketPrice() {
            return this.ticketPrice;
        }

        /**
         * @return ticketType
         */
        public String getTicketType() {
            return this.ticketType;
        }

        public static final class Builder {
            private PassengerInfo passengerInfo; 
            private String seatType; 
            private String ticketPrice; 
            private String ticketType; 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder passengerInfo(PassengerInfo passengerInfo) {
                this.passengerInfo = passengerInfo;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>14</p>
             */
            public Builder seatType(String seatType) {
                this.seatType = seatType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder ticketPrice(String ticketPrice) {
                this.ticketPrice = ticketPrice;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ticketType(String ticketType) {
                this.ticketType = ticketType;
                return this;
            }

            public ChangeTicketInfoS build() {
                return new ChangeTicketInfoS(this);
            } 

        } 

    }
    /**
     * 
     * {@link TrainApplyChangeRequest} extends {@link TeaModel}
     *
     * <p>TrainApplyChangeRequest</p>
     */
    public static class ChangeTrainInfoS extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arr_station_code")
        @com.aliyun.core.annotation.Validation(required = true)
        private String arrStationCode;

        @com.aliyun.core.annotation.NameInMap("change_ticket_info_s")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < ChangeTicketInfoS> changeTicketInfoS;

        @com.aliyun.core.annotation.NameInMap("choose_bed_s")
        private String chooseBedS;

        @com.aliyun.core.annotation.NameInMap("choose_seat_s")
        private String chooseSeatS;

        @com.aliyun.core.annotation.NameInMap("dep_station_code")
        @com.aliyun.core.annotation.Validation(required = true)
        private String depStationCode;

        @com.aliyun.core.annotation.NameInMap("dep_time")
        @com.aliyun.core.annotation.Validation(required = true)
        private String depTime;

        @com.aliyun.core.annotation.NameInMap("original_dep_time")
        @com.aliyun.core.annotation.Validation(required = true)
        private String originalDepTime;

        @com.aliyun.core.annotation.NameInMap("original_train_no")
        @com.aliyun.core.annotation.Validation(required = true)
        private String originalTrainNo;

        @com.aliyun.core.annotation.NameInMap("train_no")
        @com.aliyun.core.annotation.Validation(required = true)
        private String trainNo;

        private ChangeTrainInfoS(Builder builder) {
            this.arrStationCode = builder.arrStationCode;
            this.changeTicketInfoS = builder.changeTicketInfoS;
            this.chooseBedS = builder.chooseBedS;
            this.chooseSeatS = builder.chooseSeatS;
            this.depStationCode = builder.depStationCode;
            this.depTime = builder.depTime;
            this.originalDepTime = builder.originalDepTime;
            this.originalTrainNo = builder.originalTrainNo;
            this.trainNo = builder.trainNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangeTrainInfoS create() {
            return builder().build();
        }

        /**
         * @return arrStationCode
         */
        public String getArrStationCode() {
            return this.arrStationCode;
        }

        /**
         * @return changeTicketInfoS
         */
        public java.util.List < ChangeTicketInfoS> getChangeTicketInfoS() {
            return this.changeTicketInfoS;
        }

        /**
         * @return chooseBedS
         */
        public String getChooseBedS() {
            return this.chooseBedS;
        }

        /**
         * @return chooseSeatS
         */
        public String getChooseSeatS() {
            return this.chooseSeatS;
        }

        /**
         * @return depStationCode
         */
        public String getDepStationCode() {
            return this.depStationCode;
        }

        /**
         * @return depTime
         */
        public String getDepTime() {
            return this.depTime;
        }

        /**
         * @return originalDepTime
         */
        public String getOriginalDepTime() {
            return this.originalDepTime;
        }

        /**
         * @return originalTrainNo
         */
        public String getOriginalTrainNo() {
            return this.originalTrainNo;
        }

        /**
         * @return trainNo
         */
        public String getTrainNo() {
            return this.trainNo;
        }

        public static final class Builder {
            private String arrStationCode; 
            private java.util.List < ChangeTicketInfoS> changeTicketInfoS; 
            private String chooseBedS; 
            private String chooseSeatS; 
            private String depStationCode; 
            private String depTime; 
            private String originalDepTime; 
            private String originalTrainNo; 
            private String trainNo; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>BTC</p>
             */
            public Builder arrStationCode(String arrStationCode) {
                this.arrStationCode = arrStationCode;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder changeTicketInfoS(java.util.List < ChangeTicketInfoS> changeTicketInfoS) {
                this.changeTicketInfoS = changeTicketInfoS;
                return this;
            }

            /**
             * choose_bed_s.
             */
            public Builder chooseBedS(String chooseBedS) {
                this.chooseBedS = chooseBedS;
                return this;
            }

            /**
             * choose_seat_s.
             */
            public Builder chooseSeatS(String chooseSeatS) {
                this.chooseSeatS = chooseSeatS;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>BDC</p>
             */
            public Builder depStationCode(String depStationCode) {
                this.depStationCode = depStationCode;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-05-06 15:19:01</p>
             */
            public Builder depTime(String depTime) {
                this.depTime = depTime;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-05-06 15:19:01</p>
             */
            public Builder originalDepTime(String originalDepTime) {
                this.originalDepTime = originalDepTime;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>K234</p>
             */
            public Builder originalTrainNo(String originalTrainNo) {
                this.originalTrainNo = originalTrainNo;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>K2345</p>
             */
            public Builder trainNo(String trainNo) {
                this.trainNo = trainNo;
                return this;
            }

            public ChangeTrainInfoS build() {
                return new ChangeTrainInfoS(this);
            } 

        } 

    }
}
