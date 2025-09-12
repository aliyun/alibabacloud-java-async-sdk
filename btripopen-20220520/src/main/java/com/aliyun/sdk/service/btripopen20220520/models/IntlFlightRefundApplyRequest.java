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
 * {@link IntlFlightRefundApplyRequest} extends {@link RequestModel}
 *
 * <p>IntlFlightRefundApplyRequest</p>
 */
public class IntlFlightRefundApplyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("out_order_id")
    private String outOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("out_refund_apply_id")
    private String outRefundApplyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("passenger_journey_group_key")
    @com.aliyun.core.annotation.Validation(required = true)
    private String passengerJourneyGroupKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("refund_reason_code")
    @com.aliyun.core.annotation.Validation(required = true)
    private String refundReasonCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("refund_segment_list")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<RefundSegmentList> refundSegmentList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("selected_passengers")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<SelectedPassengers> selectedPassengers;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private IntlFlightRefundApplyRequest(Builder builder) {
        super(builder);
        this.orderId = builder.orderId;
        this.outOrderId = builder.outOrderId;
        this.outRefundApplyId = builder.outRefundApplyId;
        this.passengerJourneyGroupKey = builder.passengerJourneyGroupKey;
        this.refundReasonCode = builder.refundReasonCode;
        this.refundSegmentList = builder.refundSegmentList;
        this.selectedPassengers = builder.selectedPassengers;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IntlFlightRefundApplyRequest create() {
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
     * @return outRefundApplyId
     */
    public String getOutRefundApplyId() {
        return this.outRefundApplyId;
    }

    /**
     * @return passengerJourneyGroupKey
     */
    public String getPassengerJourneyGroupKey() {
        return this.passengerJourneyGroupKey;
    }

    /**
     * @return refundReasonCode
     */
    public String getRefundReasonCode() {
        return this.refundReasonCode;
    }

    /**
     * @return refundSegmentList
     */
    public java.util.List<RefundSegmentList> getRefundSegmentList() {
        return this.refundSegmentList;
    }

    /**
     * @return selectedPassengers
     */
    public java.util.List<SelectedPassengers> getSelectedPassengers() {
        return this.selectedPassengers;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<IntlFlightRefundApplyRequest, Builder> {
        private String orderId; 
        private String outOrderId; 
        private String outRefundApplyId; 
        private String passengerJourneyGroupKey; 
        private String refundReasonCode; 
        private java.util.List<RefundSegmentList> refundSegmentList; 
        private java.util.List<SelectedPassengers> selectedPassengers; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(IntlFlightRefundApplyRequest request) {
            super(request);
            this.orderId = request.orderId;
            this.outOrderId = request.outOrderId;
            this.outRefundApplyId = request.outRefundApplyId;
            this.passengerJourneyGroupKey = request.passengerJourneyGroupKey;
            this.refundReasonCode = request.refundReasonCode;
            this.refundSegmentList = request.refundSegmentList;
            this.selectedPassengers = request.selectedPassengers;
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
         * out_order_id.
         */
        public Builder outOrderId(String outOrderId) {
            this.putBodyParameter("out_order_id", outOrderId);
            this.outOrderId = outOrderId;
            return this;
        }

        /**
         * out_refund_apply_id.
         */
        public Builder outRefundApplyId(String outRefundApplyId) {
            this.putBodyParameter("out_refund_apply_id", outRefundApplyId);
            this.outRefundApplyId = outRefundApplyId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>edcac4f4c79d40ccb141ddb6da567e65</p>
         */
        public Builder passengerJourneyGroupKey(String passengerJourneyGroupKey) {
            this.putBodyParameter("passenger_journey_group_key", passengerJourneyGroupKey);
            this.passengerJourneyGroupKey = passengerJourneyGroupKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder refundReasonCode(String refundReasonCode) {
            this.putBodyParameter("refund_reason_code", refundReasonCode);
            this.refundReasonCode = refundReasonCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder refundSegmentList(java.util.List<RefundSegmentList> refundSegmentList) {
            String refundSegmentListShrink = shrink(refundSegmentList, "refund_segment_list", "json");
            this.putBodyParameter("refund_segment_list", refundSegmentListShrink);
            this.refundSegmentList = refundSegmentList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder selectedPassengers(java.util.List<SelectedPassengers> selectedPassengers) {
            String selectedPassengersShrink = shrink(selectedPassengers, "selected_passengers", "json");
            this.putBodyParameter("selected_passengers", selectedPassengersShrink);
            this.selectedPassengers = selectedPassengers;
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
        public IntlFlightRefundApplyRequest build() {
            return new IntlFlightRefundApplyRequest(this);
        } 

    } 

    /**
     * 
     * {@link IntlFlightRefundApplyRequest} extends {@link TeaModel}
     *
     * <p>IntlFlightRefundApplyRequest</p>
     */
    public static class RefundSegmentList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("segment_key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String segmentKey;

        private RefundSegmentList(Builder builder) {
            this.segmentKey = builder.segmentKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundSegmentList create() {
            return builder().build();
        }

        /**
         * @return segmentKey
         */
        public String getSegmentKey() {
            return this.segmentKey;
        }

        public static final class Builder {
            private String segmentKey; 

            private Builder() {
            } 

            private Builder(RefundSegmentList model) {
                this.segmentKey = model.segmentKey;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>CZ5009PKXHKG0616</p>
             */
            public Builder segmentKey(String segmentKey) {
                this.segmentKey = segmentKey;
                return this;
            }

            public RefundSegmentList build() {
                return new RefundSegmentList(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightRefundApplyRequest} extends {@link TeaModel}
     *
     * <p>IntlFlightRefundApplyRequest</p>
     */
    public static class SelectedPassengers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("full_name")
        private String fullName;

        @com.aliyun.core.annotation.NameInMap("passenger_id")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long passengerId;

        private SelectedPassengers(Builder builder) {
            this.fullName = builder.fullName;
            this.passengerId = builder.passengerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SelectedPassengers create() {
            return builder().build();
        }

        /**
         * @return fullName
         */
        public String getFullName() {
            return this.fullName;
        }

        /**
         * @return passengerId
         */
        public Long getPassengerId() {
            return this.passengerId;
        }

        public static final class Builder {
            private String fullName; 
            private Long passengerId; 

            private Builder() {
            } 

            private Builder(SelectedPassengers model) {
                this.fullName = model.fullName;
                this.passengerId = model.passengerId;
            } 

            /**
             * full_name.
             */
            public Builder fullName(String fullName) {
                this.fullName = fullName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1000001</p>
             */
            public Builder passengerId(Long passengerId) {
                this.passengerId = passengerId;
                return this;
            }

            public SelectedPassengers build() {
                return new SelectedPassengers(this);
            } 

        } 

    }
}
