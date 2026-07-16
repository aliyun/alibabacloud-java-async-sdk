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
 * {@link IntlFlightReShopCreateRequest} extends {@link RequestModel}
 *
 * <p>IntlFlightReShopCreateRequest</p>
 */
public class IntlFlightReShopCreateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("async_apply_key")
    private String asyncApplyKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("async_apply_mode")
    private Boolean asyncApplyMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("order_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ota_item_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String otaItemId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("out_order_id")
    private String outOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("out_re_shop_apply_id")
    private String outReShopApplyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("passenger_journey_group_key")
    @com.aliyun.core.annotation.Validation(required = true)
    private String passengerJourneyGroupKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("re_shop_reason_code")
    @com.aliyun.core.annotation.Validation(required = true)
    private String reShopReasonCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("selected_passengers")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<SelectedPassengers> selectedPassengers;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("total_re_shop_fee")
    private Long totalReShopFee;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private IntlFlightReShopCreateRequest(Builder builder) {
        super(builder);
        this.asyncApplyKey = builder.asyncApplyKey;
        this.asyncApplyMode = builder.asyncApplyMode;
        this.orderId = builder.orderId;
        this.otaItemId = builder.otaItemId;
        this.outOrderId = builder.outOrderId;
        this.outReShopApplyId = builder.outReShopApplyId;
        this.passengerJourneyGroupKey = builder.passengerJourneyGroupKey;
        this.reShopReasonCode = builder.reShopReasonCode;
        this.selectedPassengers = builder.selectedPassengers;
        this.totalReShopFee = builder.totalReShopFee;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IntlFlightReShopCreateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return asyncApplyKey
     */
    public String getAsyncApplyKey() {
        return this.asyncApplyKey;
    }

    /**
     * @return asyncApplyMode
     */
    public Boolean getAsyncApplyMode() {
        return this.asyncApplyMode;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return otaItemId
     */
    public String getOtaItemId() {
        return this.otaItemId;
    }

    /**
     * @return outOrderId
     */
    public String getOutOrderId() {
        return this.outOrderId;
    }

    /**
     * @return outReShopApplyId
     */
    public String getOutReShopApplyId() {
        return this.outReShopApplyId;
    }

    /**
     * @return passengerJourneyGroupKey
     */
    public String getPassengerJourneyGroupKey() {
        return this.passengerJourneyGroupKey;
    }

    /**
     * @return reShopReasonCode
     */
    public String getReShopReasonCode() {
        return this.reShopReasonCode;
    }

    /**
     * @return selectedPassengers
     */
    public java.util.List<SelectedPassengers> getSelectedPassengers() {
        return this.selectedPassengers;
    }

    /**
     * @return totalReShopFee
     */
    public Long getTotalReShopFee() {
        return this.totalReShopFee;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<IntlFlightReShopCreateRequest, Builder> {
        private String asyncApplyKey; 
        private Boolean asyncApplyMode; 
        private String orderId; 
        private String otaItemId; 
        private String outOrderId; 
        private String outReShopApplyId; 
        private String passengerJourneyGroupKey; 
        private String reShopReasonCode; 
        private java.util.List<SelectedPassengers> selectedPassengers; 
        private Long totalReShopFee; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(IntlFlightReShopCreateRequest request) {
            super(request);
            this.asyncApplyKey = request.asyncApplyKey;
            this.asyncApplyMode = request.asyncApplyMode;
            this.orderId = request.orderId;
            this.otaItemId = request.otaItemId;
            this.outOrderId = request.outOrderId;
            this.outReShopApplyId = request.outReShopApplyId;
            this.passengerJourneyGroupKey = request.passengerJourneyGroupKey;
            this.reShopReasonCode = request.reShopReasonCode;
            this.selectedPassengers = request.selectedPassengers;
            this.totalReShopFee = request.totalReShopFee;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * async_apply_key.
         */
        public Builder asyncApplyKey(String asyncApplyKey) {
            this.putBodyParameter("async_apply_key", asyncApplyKey);
            this.asyncApplyKey = asyncApplyKey;
            return this;
        }

        /**
         * async_apply_mode.
         */
        public Builder asyncApplyMode(Boolean asyncApplyMode) {
            this.putBodyParameter("async_apply_mode", asyncApplyMode);
            this.asyncApplyMode = asyncApplyMode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1017035199702438072</p>
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
         * <p>d01eb358456b4ba38eb4d8f1499186da_0</p>
         */
        public Builder otaItemId(String otaItemId) {
            this.putBodyParameter("ota_item_id", otaItemId);
            this.otaItemId = otaItemId;
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
         * out_re_shop_apply_id.
         */
        public Builder outReShopApplyId(String outReShopApplyId) {
            this.putBodyParameter("out_re_shop_apply_id", outReShopApplyId);
            this.outReShopApplyId = outReShopApplyId;
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
        public Builder reShopReasonCode(String reShopReasonCode) {
            this.putBodyParameter("re_shop_reason_code", reShopReasonCode);
            this.reShopReasonCode = reShopReasonCode;
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
         * total_re_shop_fee.
         */
        public Builder totalReShopFee(Long totalReShopFee) {
            this.putBodyParameter("total_re_shop_fee", totalReShopFee);
            this.totalReShopFee = totalReShopFee;
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
        public IntlFlightReShopCreateRequest build() {
            return new IntlFlightReShopCreateRequest(this);
        } 

    } 

    /**
     * 
     * {@link IntlFlightReShopCreateRequest} extends {@link TeaModel}
     *
     * <p>IntlFlightReShopCreateRequest</p>
     */
    public static class SelectedPassengers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("full_name")
        private String fullName;

        @com.aliyun.core.annotation.NameInMap("passenger_id")
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
             * passenger_id.
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
