// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link TrainFeeCalculateChangeRequest} extends {@link RequestModel}
 *
 * <p>TrainFeeCalculateChangeRequest</p>
 */
public class TrainFeeCalculateChangeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("change_train_details")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < ChangeTrainDetails> changeTrainDetails;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("distribute_order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String distributeOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private TrainFeeCalculateChangeRequest(Builder builder) {
        super(builder);
        this.changeTrainDetails = builder.changeTrainDetails;
        this.distributeOrderId = builder.distributeOrderId;
        this.orderId = builder.orderId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TrainFeeCalculateChangeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return changeTrainDetails
     */
    public java.util.List < ChangeTrainDetails> getChangeTrainDetails() {
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

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<TrainFeeCalculateChangeRequest, Builder> {
        private java.util.List < ChangeTrainDetails> changeTrainDetails; 
        private String distributeOrderId; 
        private String orderId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(TrainFeeCalculateChangeRequest request) {
            super(request);
            this.changeTrainDetails = request.changeTrainDetails;
            this.distributeOrderId = request.distributeOrderId;
            this.orderId = request.orderId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder changeTrainDetails(java.util.List < ChangeTrainDetails> changeTrainDetails) {
            String changeTrainDetailsShrink = shrink(changeTrainDetails, "change_train_details", "json");
            this.putBodyParameter("change_train_details", changeTrainDetailsShrink);
            this.changeTrainDetails = changeTrainDetails;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder distributeOrderId(String distributeOrderId) {
            this.putBodyParameter("distribute_order_id", distributeOrderId);
            this.distributeOrderId = distributeOrderId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2627694109810885616</p>
         */
        public Builder orderId(String orderId) {
            this.putBodyParameter("order_id", orderId);
            this.orderId = orderId;
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
        public TrainFeeCalculateChangeRequest build() {
            return new TrainFeeCalculateChangeRequest(this);
        } 

    } 

    /**
     * 
     * {@link TrainFeeCalculateChangeRequest} extends {@link TeaModel}
     *
     * <p>TrainFeeCalculateChangeRequest</p>
     */
    public static class PassengerInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("passenger_cert_no")
        @com.aliyun.core.annotation.Validation(required = true)
        private String passengerCertNo;

        @com.aliyun.core.annotation.NameInMap("passenger_cert_type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String passengerCertType;

        @com.aliyun.core.annotation.NameInMap("passenger_name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String passengerName;

        private PassengerInfo(Builder builder) {
            this.passengerCertNo = builder.passengerCertNo;
            this.passengerCertType = builder.passengerCertType;
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
         * @return passengerName
         */
        public String getPassengerName() {
            return this.passengerName;
        }

        public static final class Builder {
            private String passengerCertNo; 
            private String passengerCertType; 
            private String passengerName; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>949c9f34f677a0e5d249dfc94f5e62cc7</p>
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
             * <p>291487e553c5abde3b611aae283e2526f0d733ab55094aadc0b5ba587222a233c</p>
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
     * {@link TrainFeeCalculateChangeRequest} extends {@link TeaModel}
     *
     * <p>TrainFeeCalculateChangeRequest</p>
     */
    public static class ChangeTrainDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arr_station_code")
        @com.aliyun.core.annotation.Validation(required = true)
        private String arrStationCode;

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

        @com.aliyun.core.annotation.NameInMap("passenger_info")
        @com.aliyun.core.annotation.Validation(required = true)
        private PassengerInfo passengerInfo;

        @com.aliyun.core.annotation.NameInMap("seat_type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String seatType;

        @com.aliyun.core.annotation.NameInMap("train_no")
        @com.aliyun.core.annotation.Validation(required = true)
        private String trainNo;

        private ChangeTrainDetails(Builder builder) {
            this.arrStationCode = builder.arrStationCode;
            this.depStationCode = builder.depStationCode;
            this.depTime = builder.depTime;
            this.originalDepTime = builder.originalDepTime;
            this.originalTrainNo = builder.originalTrainNo;
            this.passengerInfo = builder.passengerInfo;
            this.seatType = builder.seatType;
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
         * @return trainNo
         */
        public String getTrainNo() {
            return this.trainNo;
        }

        public static final class Builder {
            private String arrStationCode; 
            private String depStationCode; 
            private String depTime; 
            private String originalDepTime; 
            private String originalTrainNo; 
            private PassengerInfo passengerInfo; 
            private String seatType; 
            private String trainNo; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>BDC</p>
             */
            public Builder arrStationCode(String arrStationCode) {
                this.arrStationCode = arrStationCode;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>BTC</p>
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
             * <p>K2345</p>
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
}
