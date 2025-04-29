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
 * {@link TrainFeeCalculateChangeResponseBody} extends {@link TeaModel}
 *
 * <p>TrainFeeCalculateChangeResponseBody</p>
 */
public class TrainFeeCalculateChangeResponseBody extends TeaModel {
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

    private TrainFeeCalculateChangeResponseBody(Builder builder) {
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

    public static TrainFeeCalculateChangeResponseBody create() {
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

        private Builder(TrainFeeCalculateChangeResponseBody model) {
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
         * <p>21041ce316577904808056433edbb2</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public TrainFeeCalculateChangeResponseBody build() {
            return new TrainFeeCalculateChangeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TrainFeeCalculateChangeResponseBody} extends {@link TeaModel}
     *
     * <p>TrainFeeCalculateChangeResponseBody</p>
     */
    public static class PassengerInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("passenger_cert_no")
        private String passengerCertNo;

        @com.aliyun.core.annotation.NameInMap("passenger_cert_type")
        private String passengerCertType;

        @com.aliyun.core.annotation.NameInMap("passenger_id")
        private String passengerId;

        @com.aliyun.core.annotation.NameInMap("passenger_name")
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

            private Builder() {
            } 

            private Builder(PassengerInfo model) {
                this.passengerCertNo = model.passengerCertNo;
                this.passengerCertType = model.passengerCertType;
                this.passengerId = model.passengerId;
                this.passengerName = model.passengerName;
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
             * passenger_name.
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
     * {@link TrainFeeCalculateChangeResponseBody} extends {@link TeaModel}
     *
     * <p>TrainFeeCalculateChangeResponseBody</p>
     */
    public static class ChangeTicketDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("change_fee")
        private Long changeFee;

        @com.aliyun.core.annotation.NameInMap("change_rate")
        private Long changeRate;

        @com.aliyun.core.annotation.NameInMap("change_refund_fee")
        private Long changeRefundFee;

        @com.aliyun.core.annotation.NameInMap("change_refund_rate")
        private Long changeRefundRate;

        @com.aliyun.core.annotation.NameInMap("passenger_info")
        private PassengerInfo passengerInfo;

        @com.aliyun.core.annotation.NameInMap("seat_type")
        private String seatType;

        @com.aliyun.core.annotation.NameInMap("ticket_price")
        private Long ticketPrice;

        private ChangeTicketDetails(Builder builder) {
            this.changeFee = builder.changeFee;
            this.changeRate = builder.changeRate;
            this.changeRefundFee = builder.changeRefundFee;
            this.changeRefundRate = builder.changeRefundRate;
            this.passengerInfo = builder.passengerInfo;
            this.seatType = builder.seatType;
            this.ticketPrice = builder.ticketPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangeTicketDetails create() {
            return builder().build();
        }

        /**
         * @return changeFee
         */
        public Long getChangeFee() {
            return this.changeFee;
        }

        /**
         * @return changeRate
         */
        public Long getChangeRate() {
            return this.changeRate;
        }

        /**
         * @return changeRefundFee
         */
        public Long getChangeRefundFee() {
            return this.changeRefundFee;
        }

        /**
         * @return changeRefundRate
         */
        public Long getChangeRefundRate() {
            return this.changeRefundRate;
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
        public Long getTicketPrice() {
            return this.ticketPrice;
        }

        public static final class Builder {
            private Long changeFee; 
            private Long changeRate; 
            private Long changeRefundFee; 
            private Long changeRefundRate; 
            private PassengerInfo passengerInfo; 
            private String seatType; 
            private Long ticketPrice; 

            private Builder() {
            } 

            private Builder(ChangeTicketDetails model) {
                this.changeFee = model.changeFee;
                this.changeRate = model.changeRate;
                this.changeRefundFee = model.changeRefundFee;
                this.changeRefundRate = model.changeRefundRate;
                this.passengerInfo = model.passengerInfo;
                this.seatType = model.seatType;
                this.ticketPrice = model.ticketPrice;
            } 

            /**
             * change_fee.
             */
            public Builder changeFee(Long changeFee) {
                this.changeFee = changeFee;
                return this;
            }

            /**
             * change_rate.
             */
            public Builder changeRate(Long changeRate) {
                this.changeRate = changeRate;
                return this;
            }

            /**
             * change_refund_fee.
             */
            public Builder changeRefundFee(Long changeRefundFee) {
                this.changeRefundFee = changeRefundFee;
                return this;
            }

            /**
             * change_refund_rate.
             */
            public Builder changeRefundRate(Long changeRefundRate) {
                this.changeRefundRate = changeRefundRate;
                return this;
            }

            /**
             * passenger_info.
             */
            public Builder passengerInfo(PassengerInfo passengerInfo) {
                this.passengerInfo = passengerInfo;
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
             * ticket_price.
             */
            public Builder ticketPrice(Long ticketPrice) {
                this.ticketPrice = ticketPrice;
                return this;
            }

            public ChangeTicketDetails build() {
                return new ChangeTicketDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link TrainFeeCalculateChangeResponseBody} extends {@link TeaModel}
     *
     * <p>TrainFeeCalculateChangeResponseBody</p>
     */
    public static class ChangeTrainDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arr_station_code")
        private String arrStationCode;

        @com.aliyun.core.annotation.NameInMap("change_ticket_details")
        private java.util.List<ChangeTicketDetails> changeTicketDetails;

        @com.aliyun.core.annotation.NameInMap("dep_station_code")
        private String depStationCode;

        @com.aliyun.core.annotation.NameInMap("dep_time")
        private String depTime;

        @com.aliyun.core.annotation.NameInMap("train_no")
        private String trainNo;

        private ChangeTrainDetails(Builder builder) {
            this.arrStationCode = builder.arrStationCode;
            this.changeTicketDetails = builder.changeTicketDetails;
            this.depStationCode = builder.depStationCode;
            this.depTime = builder.depTime;
            this.trainNo = builder.trainNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangeTrainDetails create() {
            return builder().build();
        }

        /**
         * @return arrStationCode
         */
        public String getArrStationCode() {
            return this.arrStationCode;
        }

        /**
         * @return changeTicketDetails
         */
        public java.util.List<ChangeTicketDetails> getChangeTicketDetails() {
            return this.changeTicketDetails;
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
         * @return trainNo
         */
        public String getTrainNo() {
            return this.trainNo;
        }

        public static final class Builder {
            private String arrStationCode; 
            private java.util.List<ChangeTicketDetails> changeTicketDetails; 
            private String depStationCode; 
            private String depTime; 
            private String trainNo; 

            private Builder() {
            } 

            private Builder(ChangeTrainDetails model) {
                this.arrStationCode = model.arrStationCode;
                this.changeTicketDetails = model.changeTicketDetails;
                this.depStationCode = model.depStationCode;
                this.depTime = model.depTime;
                this.trainNo = model.trainNo;
            } 

            /**
             * arr_station_code.
             */
            public Builder arrStationCode(String arrStationCode) {
                this.arrStationCode = arrStationCode;
                return this;
            }

            /**
             * change_ticket_details.
             */
            public Builder changeTicketDetails(java.util.List<ChangeTicketDetails> changeTicketDetails) {
                this.changeTicketDetails = changeTicketDetails;
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

            public ChangeTrainDetails build() {
                return new ChangeTrainDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link TrainFeeCalculateChangeResponseBody} extends {@link TeaModel}
     *
     * <p>TrainFeeCalculateChangeResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("change_train_details")
        private java.util.List<ChangeTrainDetails> changeTrainDetails;

        @com.aliyun.core.annotation.NameInMap("distribute_order_id")
        private String distributeOrderId;

        @com.aliyun.core.annotation.NameInMap("order_id")
        private String orderId;

        private Module(Builder builder) {
            this.changeTrainDetails = builder.changeTrainDetails;
            this.distributeOrderId = builder.distributeOrderId;
            this.orderId = builder.orderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return changeTrainDetails
         */
        public java.util.List<ChangeTrainDetails> getChangeTrainDetails() {
            return this.changeTrainDetails;
        }

        /**
         * @return distributeOrderId
         */
        public String getDistributeOrderId() {
            return this.distributeOrderId;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        public static final class Builder {
            private java.util.List<ChangeTrainDetails> changeTrainDetails; 
            private String distributeOrderId; 
            private String orderId; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.changeTrainDetails = model.changeTrainDetails;
                this.distributeOrderId = model.distributeOrderId;
                this.orderId = model.orderId;
            } 

            /**
             * change_train_details.
             */
            public Builder changeTrainDetails(java.util.List<ChangeTrainDetails> changeTrainDetails) {
                this.changeTrainDetails = changeTrainDetails;
                return this;
            }

            /**
             * distribute_order_id.
             */
            public Builder distributeOrderId(String distributeOrderId) {
                this.distributeOrderId = distributeOrderId;
                return this;
            }

            /**
             * order_id.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
