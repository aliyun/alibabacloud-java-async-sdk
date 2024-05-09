// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TrainApplyRefundRequest} extends {@link RequestModel}
 *
 * <p>TrainApplyRefundRequest</p>
 */
public class TrainApplyRefundRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("out_order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("out_refund_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outRefundId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("refund_train_infos")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < RefundTrainInfos> refundTrainInfos;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private TrainApplyRefundRequest(Builder builder) {
        super(builder);
        this.orderId = builder.orderId;
        this.outOrderId = builder.outOrderId;
        this.outRefundId = builder.outRefundId;
        this.refundTrainInfos = builder.refundTrainInfos;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TrainApplyRefundRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return outRefundId
     */
    public String getOutRefundId() {
        return this.outRefundId;
    }

    /**
     * @return refundTrainInfos
     */
    public java.util.List < RefundTrainInfos> getRefundTrainInfos() {
        return this.refundTrainInfos;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<TrainApplyRefundRequest, Builder> {
        private String orderId; 
        private String outOrderId; 
        private String outRefundId; 
        private java.util.List < RefundTrainInfos> refundTrainInfos; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(TrainApplyRefundRequest request) {
            super(request);
            this.orderId = request.orderId;
            this.outOrderId = request.outOrderId;
            this.outRefundId = request.outRefundId;
            this.refundTrainInfos = request.refundTrainInfos;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * order_id.
         */
        public Builder orderId(String orderId) {
            this.putBodyParameter("order_id", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * out_order_id.
         */
        public Builder outOrderId(String outOrderId) {
            this.putBodyParameter("out_order_id", outOrderId);
            this.outOrderId = outOrderId;
            return this;
        }

        /**
         * out_refund_id.
         */
        public Builder outRefundId(String outRefundId) {
            this.putBodyParameter("out_refund_id", outRefundId);
            this.outRefundId = outRefundId;
            return this;
        }

        /**
         * refund_train_infos.
         */
        public Builder refundTrainInfos(java.util.List < RefundTrainInfos> refundTrainInfos) {
            String refundTrainInfosShrink = shrink(refundTrainInfos, "refund_train_infos", "json");
            this.putBodyParameter("refund_train_infos", refundTrainInfosShrink);
            this.refundTrainInfos = refundTrainInfos;
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
        public TrainApplyRefundRequest build() {
            return new TrainApplyRefundRequest(this);
        } 

    } 

    public static class RefundPassengerInfos extends TeaModel {
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

        private RefundPassengerInfos(Builder builder) {
            this.passengerCertNo = builder.passengerCertNo;
            this.passengerCertType = builder.passengerCertType;
            this.passengerId = builder.passengerId;
            this.passengerName = builder.passengerName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundPassengerInfos create() {
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

            public RefundPassengerInfos build() {
                return new RefundPassengerInfos(this);
            } 

        } 

    }
    public static class RefundTrainInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dep_time")
        @com.aliyun.core.annotation.Validation(required = true)
        private String depTime;

        @com.aliyun.core.annotation.NameInMap("refund_passenger_infos")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < RefundPassengerInfos> refundPassengerInfos;

        @com.aliyun.core.annotation.NameInMap("train_no")
        @com.aliyun.core.annotation.Validation(required = true)
        private String trainNo;

        private RefundTrainInfos(Builder builder) {
            this.depTime = builder.depTime;
            this.refundPassengerInfos = builder.refundPassengerInfos;
            this.trainNo = builder.trainNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundTrainInfos create() {
            return builder().build();
        }

        /**
         * @return depTime
         */
        public String getDepTime() {
            return this.depTime;
        }

        /**
         * @return refundPassengerInfos
         */
        public java.util.List < RefundPassengerInfos> getRefundPassengerInfos() {
            return this.refundPassengerInfos;
        }

        /**
         * @return trainNo
         */
        public String getTrainNo() {
            return this.trainNo;
        }

        public static final class Builder {
            private String depTime; 
            private java.util.List < RefundPassengerInfos> refundPassengerInfos; 
            private String trainNo; 

            /**
             * dep_time.
             */
            public Builder depTime(String depTime) {
                this.depTime = depTime;
                return this;
            }

            /**
             * refund_passenger_infos.
             */
            public Builder refundPassengerInfos(java.util.List < RefundPassengerInfos> refundPassengerInfos) {
                this.refundPassengerInfos = refundPassengerInfos;
                return this;
            }

            /**
             * train_no.
             */
            public Builder trainNo(String trainNo) {
                this.trainNo = trainNo;
                return this;
            }

            public RefundTrainInfos build() {
                return new RefundTrainInfos(this);
            } 

        } 

    }
}
