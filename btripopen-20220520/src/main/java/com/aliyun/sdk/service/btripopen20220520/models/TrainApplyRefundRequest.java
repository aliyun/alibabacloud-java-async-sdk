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
    private java.util.List<RefundTrainInfos> refundTrainInfos;

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
    public java.util.List<RefundTrainInfos> getRefundTrainInfos() {
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
        private java.util.List<RefundTrainInfos> refundTrainInfos; 
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1002145190081005400</p>
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
         * <p>123456</p>
         */
        public Builder outOrderId(String outOrderId) {
            this.putBodyParameter("out_order_id", outOrderId);
            this.outOrderId = outOrderId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456778</p>
         */
        public Builder outRefundId(String outRefundId) {
            this.putBodyParameter("out_refund_id", outRefundId);
            this.outRefundId = outRefundId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder refundTrainInfos(java.util.List<RefundTrainInfos> refundTrainInfos) {
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

    /**
     * 
     * {@link TrainApplyRefundRequest} extends {@link TeaModel}
     *
     * <p>TrainApplyRefundRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(RefundPassengerInfos model) {
                this.passengerCertNo = model.passengerCertNo;
                this.passengerCertType = model.passengerCertType;
                this.passengerId = model.passengerId;
                this.passengerName = model.passengerName;
            } 

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
             * <p>12334</p>
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

            public RefundPassengerInfos build() {
                return new RefundPassengerInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link TrainApplyRefundRequest} extends {@link TeaModel}
     *
     * <p>TrainApplyRefundRequest</p>
     */
    public static class RefundTrainInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dep_time")
        @com.aliyun.core.annotation.Validation(required = true)
        private String depTime;

        @com.aliyun.core.annotation.NameInMap("refund_passenger_infos")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<RefundPassengerInfos> refundPassengerInfos;

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
        public java.util.List<RefundPassengerInfos> getRefundPassengerInfos() {
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
            private java.util.List<RefundPassengerInfos> refundPassengerInfos; 
            private String trainNo; 

            private Builder() {
            } 

            private Builder(RefundTrainInfos model) {
                this.depTime = model.depTime;
                this.refundPassengerInfos = model.refundPassengerInfos;
                this.trainNo = model.trainNo;
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
             */
            public Builder refundPassengerInfos(java.util.List<RefundPassengerInfos> refundPassengerInfos) {
                this.refundPassengerInfos = refundPassengerInfos;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>K234</p>
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
