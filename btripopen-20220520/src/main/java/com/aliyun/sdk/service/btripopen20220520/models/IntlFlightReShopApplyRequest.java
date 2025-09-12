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
 * {@link IntlFlightReShopApplyRequest} extends {@link RequestModel}
 *
 * <p>IntlFlightReShopApplyRequest</p>
 */
public class IntlFlightReShopApplyRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("selected_journeys")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<SelectedJourneys> selectedJourneys;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("selected_passengers")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<SelectedPassengers> selectedPassengers;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user_intention_memo")
    private String userIntentionMemo;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private IntlFlightReShopApplyRequest(Builder builder) {
        super(builder);
        this.asyncApplyKey = builder.asyncApplyKey;
        this.asyncApplyMode = builder.asyncApplyMode;
        this.orderId = builder.orderId;
        this.outOrderId = builder.outOrderId;
        this.outReShopApplyId = builder.outReShopApplyId;
        this.passengerJourneyGroupKey = builder.passengerJourneyGroupKey;
        this.reShopReasonCode = builder.reShopReasonCode;
        this.selectedJourneys = builder.selectedJourneys;
        this.selectedPassengers = builder.selectedPassengers;
        this.userIntentionMemo = builder.userIntentionMemo;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IntlFlightReShopApplyRequest create() {
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
     * @return selectedJourneys
     */
    public java.util.List<SelectedJourneys> getSelectedJourneys() {
        return this.selectedJourneys;
    }

    /**
     * @return selectedPassengers
     */
    public java.util.List<SelectedPassengers> getSelectedPassengers() {
        return this.selectedPassengers;
    }

    /**
     * @return userIntentionMemo
     */
    public String getUserIntentionMemo() {
        return this.userIntentionMemo;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<IntlFlightReShopApplyRequest, Builder> {
        private String asyncApplyKey; 
        private Boolean asyncApplyMode; 
        private String orderId; 
        private String outOrderId; 
        private String outReShopApplyId; 
        private String passengerJourneyGroupKey; 
        private String reShopReasonCode; 
        private java.util.List<SelectedJourneys> selectedJourneys; 
        private java.util.List<SelectedPassengers> selectedPassengers; 
        private String userIntentionMemo; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(IntlFlightReShopApplyRequest request) {
            super(request);
            this.asyncApplyKey = request.asyncApplyKey;
            this.asyncApplyMode = request.asyncApplyMode;
            this.orderId = request.orderId;
            this.outOrderId = request.outOrderId;
            this.outReShopApplyId = request.outReShopApplyId;
            this.passengerJourneyGroupKey = request.passengerJourneyGroupKey;
            this.reShopReasonCode = request.reShopReasonCode;
            this.selectedJourneys = request.selectedJourneys;
            this.selectedPassengers = request.selectedPassengers;
            this.userIntentionMemo = request.userIntentionMemo;
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
         * <p>1017035199907040165</p>
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
        public Builder selectedJourneys(java.util.List<SelectedJourneys> selectedJourneys) {
            String selectedJourneysShrink = shrink(selectedJourneys, "selected_journeys", "json");
            this.putBodyParameter("selected_journeys", selectedJourneysShrink);
            this.selectedJourneys = selectedJourneys;
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
         * user_intention_memo.
         */
        public Builder userIntentionMemo(String userIntentionMemo) {
            this.putBodyParameter("user_intention_memo", userIntentionMemo);
            this.userIntentionMemo = userIntentionMemo;
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
        public IntlFlightReShopApplyRequest build() {
            return new IntlFlightReShopApplyRequest(this);
        } 

    } 

    /**
     * 
     * {@link IntlFlightReShopApplyRequest} extends {@link TeaModel}
     *
     * <p>IntlFlightReShopApplyRequest</p>
     */
    public static class SelectedFlights extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arr_city_code")
        @com.aliyun.core.annotation.Validation(required = true)
        private String arrCityCode;

        @com.aliyun.core.annotation.NameInMap("dep_city_code")
        @com.aliyun.core.annotation.Validation(required = true)
        private String depCityCode;

        @com.aliyun.core.annotation.NameInMap("segment_key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String segmentKey;

        private SelectedFlights(Builder builder) {
            this.arrCityCode = builder.arrCityCode;
            this.depCityCode = builder.depCityCode;
            this.segmentKey = builder.segmentKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SelectedFlights create() {
            return builder().build();
        }

        /**
         * @return arrCityCode
         */
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        /**
         * @return depCityCode
         */
        public String getDepCityCode() {
            return this.depCityCode;
        }

        /**
         * @return segmentKey
         */
        public String getSegmentKey() {
            return this.segmentKey;
        }

        public static final class Builder {
            private String arrCityCode; 
            private String depCityCode; 
            private String segmentKey; 

            private Builder() {
            } 

            private Builder(SelectedFlights model) {
                this.arrCityCode = model.arrCityCode;
                this.depCityCode = model.depCityCode;
                this.segmentKey = model.segmentKey;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>HKG</p>
             */
            public Builder arrCityCode(String arrCityCode) {
                this.arrCityCode = arrCityCode;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>BJS</p>
             */
            public Builder depCityCode(String depCityCode) {
                this.depCityCode = depCityCode;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>KN6728HGHPKX0725</p>
             */
            public Builder segmentKey(String segmentKey) {
                this.segmentKey = segmentKey;
                return this;
            }

            public SelectedFlights build() {
                return new SelectedFlights(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightReShopApplyRequest} extends {@link TeaModel}
     *
     * <p>IntlFlightReShopApplyRequest</p>
     */
    public static class SelectedJourneys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arr_city_code")
        @com.aliyun.core.annotation.Validation(required = true)
        private String arrCityCode;

        @com.aliyun.core.annotation.NameInMap("dep_city_code")
        @com.aliyun.core.annotation.Validation(required = true)
        private String depCityCode;

        @com.aliyun.core.annotation.NameInMap("intent_date")
        @com.aliyun.core.annotation.Validation(required = true)
        private String intentDate;

        @com.aliyun.core.annotation.NameInMap("selected_flights")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<SelectedFlights> selectedFlights;

        private SelectedJourneys(Builder builder) {
            this.arrCityCode = builder.arrCityCode;
            this.depCityCode = builder.depCityCode;
            this.intentDate = builder.intentDate;
            this.selectedFlights = builder.selectedFlights;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SelectedJourneys create() {
            return builder().build();
        }

        /**
         * @return arrCityCode
         */
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        /**
         * @return depCityCode
         */
        public String getDepCityCode() {
            return this.depCityCode;
        }

        /**
         * @return intentDate
         */
        public String getIntentDate() {
            return this.intentDate;
        }

        /**
         * @return selectedFlights
         */
        public java.util.List<SelectedFlights> getSelectedFlights() {
            return this.selectedFlights;
        }

        public static final class Builder {
            private String arrCityCode; 
            private String depCityCode; 
            private String intentDate; 
            private java.util.List<SelectedFlights> selectedFlights; 

            private Builder() {
            } 

            private Builder(SelectedJourneys model) {
                this.arrCityCode = model.arrCityCode;
                this.depCityCode = model.depCityCode;
                this.intentDate = model.intentDate;
                this.selectedFlights = model.selectedFlights;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DLC</p>
             */
            public Builder arrCityCode(String arrCityCode) {
                this.arrCityCode = arrCityCode;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>TSN</p>
             */
            public Builder depCityCode(String depCityCode) {
                this.depCityCode = depCityCode;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-10-10</p>
             */
            public Builder intentDate(String intentDate) {
                this.intentDate = intentDate;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder selectedFlights(java.util.List<SelectedFlights> selectedFlights) {
                this.selectedFlights = selectedFlights;
                return this;
            }

            public SelectedJourneys build() {
                return new SelectedJourneys(this);
            } 

        } 

    }
    /**
     * 
     * {@link IntlFlightReShopApplyRequest} extends {@link TeaModel}
     *
     * <p>IntlFlightReShopApplyRequest</p>
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
             * <p>100001</p>
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
