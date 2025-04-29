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
 * {@link TrainFeeCalculateRefundResponseBody} extends {@link TeaModel}
 *
 * <p>TrainFeeCalculateRefundResponseBody</p>
 */
public class TrainFeeCalculateRefundResponseBody extends TeaModel {
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

    private TrainFeeCalculateRefundResponseBody(Builder builder) {
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

    public static TrainFeeCalculateRefundResponseBody create() {
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

        private Builder(TrainFeeCalculateRefundResponseBody model) {
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

        public TrainFeeCalculateRefundResponseBody build() {
            return new TrainFeeCalculateRefundResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TrainFeeCalculateRefundResponseBody} extends {@link TeaModel}
     *
     * <p>TrainFeeCalculateRefundResponseBody</p>
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
     * {@link TrainFeeCalculateRefundResponseBody} extends {@link TeaModel}
     *
     * <p>TrainFeeCalculateRefundResponseBody</p>
     */
    public static class RefundTicketDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("can_refund")
        private Boolean canRefund;

        @com.aliyun.core.annotation.NameInMap("passenger_info")
        private PassengerInfo passengerInfo;

        @com.aliyun.core.annotation.NameInMap("refund_cost_fee")
        private Long refundCostFee;

        @com.aliyun.core.annotation.NameInMap("refund_price")
        private Long refundPrice;

        @com.aliyun.core.annotation.NameInMap("refund_rate")
        private Long refundRate;

        @com.aliyun.core.annotation.NameInMap("ticket_price")
        private Long ticketPrice;

        private RefundTicketDetails(Builder builder) {
            this.canRefund = builder.canRefund;
            this.passengerInfo = builder.passengerInfo;
            this.refundCostFee = builder.refundCostFee;
            this.refundPrice = builder.refundPrice;
            this.refundRate = builder.refundRate;
            this.ticketPrice = builder.ticketPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundTicketDetails create() {
            return builder().build();
        }

        /**
         * @return canRefund
         */
        public Boolean getCanRefund() {
            return this.canRefund;
        }

        /**
         * @return passengerInfo
         */
        public PassengerInfo getPassengerInfo() {
            return this.passengerInfo;
        }

        /**
         * @return refundCostFee
         */
        public Long getRefundCostFee() {
            return this.refundCostFee;
        }

        /**
         * @return refundPrice
         */
        public Long getRefundPrice() {
            return this.refundPrice;
        }

        /**
         * @return refundRate
         */
        public Long getRefundRate() {
            return this.refundRate;
        }

        /**
         * @return ticketPrice
         */
        public Long getTicketPrice() {
            return this.ticketPrice;
        }

        public static final class Builder {
            private Boolean canRefund; 
            private PassengerInfo passengerInfo; 
            private Long refundCostFee; 
            private Long refundPrice; 
            private Long refundRate; 
            private Long ticketPrice; 

            private Builder() {
            } 

            private Builder(RefundTicketDetails model) {
                this.canRefund = model.canRefund;
                this.passengerInfo = model.passengerInfo;
                this.refundCostFee = model.refundCostFee;
                this.refundPrice = model.refundPrice;
                this.refundRate = model.refundRate;
                this.ticketPrice = model.ticketPrice;
            } 

            /**
             * can_refund.
             */
            public Builder canRefund(Boolean canRefund) {
                this.canRefund = canRefund;
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
             * refund_cost_fee.
             */
            public Builder refundCostFee(Long refundCostFee) {
                this.refundCostFee = refundCostFee;
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
             * refund_rate.
             */
            public Builder refundRate(Long refundRate) {
                this.refundRate = refundRate;
                return this;
            }

            /**
             * ticket_price.
             */
            public Builder ticketPrice(Long ticketPrice) {
                this.ticketPrice = ticketPrice;
                return this;
            }

            public RefundTicketDetails build() {
                return new RefundTicketDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link TrainFeeCalculateRefundResponseBody} extends {@link TeaModel}
     *
     * <p>TrainFeeCalculateRefundResponseBody</p>
     */
    public static class RefundTrainDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arr_station_code")
        private String arrStationCode;

        @com.aliyun.core.annotation.NameInMap("dep_station_code")
        private String depStationCode;

        @com.aliyun.core.annotation.NameInMap("dep_time")
        private String depTime;

        @com.aliyun.core.annotation.NameInMap("refund_ticket_details")
        private java.util.List<RefundTicketDetails> refundTicketDetails;

        @com.aliyun.core.annotation.NameInMap("train_no")
        private String trainNo;

        private RefundTrainDetails(Builder builder) {
            this.arrStationCode = builder.arrStationCode;
            this.depStationCode = builder.depStationCode;
            this.depTime = builder.depTime;
            this.refundTicketDetails = builder.refundTicketDetails;
            this.trainNo = builder.trainNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundTrainDetails create() {
            return builder().build();
        }

        /**
         * @return arrStationCode
         */
        public String getArrStationCode() {
            return this.arrStationCode;
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
         * @return refundTicketDetails
         */
        public java.util.List<RefundTicketDetails> getRefundTicketDetails() {
            return this.refundTicketDetails;
        }

        /**
         * @return trainNo
         */
        public String getTrainNo() {
            return this.trainNo;
        }

        public static final class Builder {
            private String arrStationCode; 
            private String depStationCode; 
            private String depTime; 
            private java.util.List<RefundTicketDetails> refundTicketDetails; 
            private String trainNo; 

            private Builder() {
            } 

            private Builder(RefundTrainDetails model) {
                this.arrStationCode = model.arrStationCode;
                this.depStationCode = model.depStationCode;
                this.depTime = model.depTime;
                this.refundTicketDetails = model.refundTicketDetails;
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
             * refund_ticket_details.
             */
            public Builder refundTicketDetails(java.util.List<RefundTicketDetails> refundTicketDetails) {
                this.refundTicketDetails = refundTicketDetails;
                return this;
            }

            /**
             * train_no.
             */
            public Builder trainNo(String trainNo) {
                this.trainNo = trainNo;
                return this;
            }

            public RefundTrainDetails build() {
                return new RefundTrainDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link TrainFeeCalculateRefundResponseBody} extends {@link TeaModel}
     *
     * <p>TrainFeeCalculateRefundResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("distribute_order_id")
        private String distributeOrderId;

        @com.aliyun.core.annotation.NameInMap("order_id")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("refund_train_details")
        private java.util.List<RefundTrainDetails> refundTrainDetails;

        private Module(Builder builder) {
            this.distributeOrderId = builder.distributeOrderId;
            this.orderId = builder.orderId;
            this.refundTrainDetails = builder.refundTrainDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
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

        /**
         * @return refundTrainDetails
         */
        public java.util.List<RefundTrainDetails> getRefundTrainDetails() {
            return this.refundTrainDetails;
        }

        public static final class Builder {
            private String distributeOrderId; 
            private String orderId; 
            private java.util.List<RefundTrainDetails> refundTrainDetails; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.distributeOrderId = model.distributeOrderId;
                this.orderId = model.orderId;
                this.refundTrainDetails = model.refundTrainDetails;
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

            /**
             * refund_train_details.
             */
            public Builder refundTrainDetails(java.util.List<RefundTrainDetails> refundTrainDetails) {
                this.refundTrainDetails = refundTrainDetails;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
